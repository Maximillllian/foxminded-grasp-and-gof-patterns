package com.company;

import com.company.services.CallMasterService;
import com.company.services.FlowersDeliveryService;
import com.company.services.TaxiService;

public class Main {

    public static void main(String[] args) {
        var conciergeService = new ConciergeService();

        conciergeService.addService(new TaxiService());
        conciergeService.addService(new FlowersDeliveryService());
        conciergeService.addService(new CallMasterService());

        var client = new ConciergeServiceClient("Mike");
        conciergeService.addClient(client);
        conciergeService.send(client, "taxi");
    }
}
