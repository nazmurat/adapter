package com.company;
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Iphone lightningearpods = new Lightningearpods();
        Casualearpods casualearpods = new Casualearpods();
        CasualearpodsAdapter adapter = new CasualearpodsAdapter(casualearpods);
        client.insertLightningConnectorIntoIphone(lightningearpods);
        client.insertLightningConnectorIntoIphone(adapter);
    }
}
