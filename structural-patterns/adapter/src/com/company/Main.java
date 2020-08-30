package com.company;

import com.company.entities.DocumentInfo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var thisCompanyId = "1";
        var proxy = new EdiProviderProxy(thisCompanyId);
        var bytes = "some text".getBytes();
        proxy.SendDocument(
                new DocumentInfo(
                        Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()),
                        Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()),
                        "01",
                        bytes,
                        thisCompanyId,
                        "2"));
    }
}
