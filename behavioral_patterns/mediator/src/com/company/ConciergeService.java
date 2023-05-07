package behavioral_patterns.mediator.src.com.company;

import behavioral_patterns.mediator.src.com.company.services.CallMasterService;
import behavioral_patterns.mediator.src.com.company.services.FlowersDeliveryService;
import behavioral_patterns.mediator.src.com.company.services.TaxiService;

import java.util.*;

import static java.lang.Integer.parseInt;

public class ConciergeService implements IMediator{

    private List<Service> services;
    private List<ConciergeServiceClient> clients;
    private Map<Integer, String> eventIdToClientNameMap;
    private int eventCounter;

    public ConciergeService() {
        services = new LinkedList<>();
        clients = new LinkedList<>();
        eventIdToClientNameMap = new HashMap<>();
        eventCounter = 0;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void addClient(ConciergeServiceClient client) {
        clients.add(client);
    }

    @Override
    public void send(Object sender, String event) {
        if (sender instanceof ConciergeServiceClient) {
            sendEventToService((ConciergeServiceClient)sender, event);
        } else if (sender instanceof Service) {
            notifyClient((Service)sender, event);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void sendEventToService (ConciergeServiceClient client, String event){
        var service = switch (event) {
            case "taxi" -> services.stream()
                    .filter(x -> x instanceof TaxiService)
                    .findFirst();
            case "flowers" -> services.stream()
                    .filter(x -> x instanceof FlowersDeliveryService)
                    .findFirst();
            case "master" -> services.stream()
                    .filter(x -> x instanceof CallMasterService)
                    .findFirst();
            default -> throw new IllegalArgumentException();
        };
        var eventId = ++eventCounter;
        eventIdToClientNameMap.put(eventId, client.getName());
        service.ifPresent(svc -> svc.call(event));
    }

    private void notifyClient(Service service, String event) {
        var words = event.split("\\s+");
        var eventId = words[0];
        var clientName = eventIdToClientNameMap.get(Integer.parseInt(eventId));
        var clientOpt = this.clients.stream()
                .filter(client -> client.getName().equals(clientName))
                .findFirst();
        var finalEvent = Arrays.stream(Arrays.copyOfRange(words, 1, words.length))
                .reduce((word, curSentece) -> curSentece + word)
                .get();

        clientOpt.get().notify(finalEvent);
    }
}
