package behavioral_patterns.mediator;

import behavioral_patterns.mediator.service.FlowerDeliveryService;
import behavioral_patterns.mediator.service.HouseMasterService;
import behavioral_patterns.mediator.service.TaxiService;

public class ConciergeService implements ConciergeServiceMediator {
    private final Service flowerDelivery = new FlowerDeliveryService();
    private final Service housemaster = new HouseMasterService();
    private final Service taxiService = new TaxiService();

    public ConciergeService() {}

    @Override
    public void sendMessage(Customer sender, ConciergeServiceEventType eventType) {
        if(eventType.equals(ConciergeServiceEventType.HOUSE_MASTER)) {
            housemaster.call(sender);
        }

        if (eventType.equals(ConciergeServiceEventType.FLOWER_DELIVERY)) {
            flowerDelivery.call(sender);
        }

        if (eventType.equals(ConciergeServiceEventType.CALL_TAXI)) {
            taxiService.call(sender);
        }
    }
}
