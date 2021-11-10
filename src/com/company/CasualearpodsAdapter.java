package com.company;

public class CasualearpodsAdapter implements Iphone {

    private Casualearpods casualearpods;
    public CasualearpodsAdapter(Casualearpods casualearpods){
        this.casualearpods = casualearpods;
    }

    @Override
    public void insertIntoLightningPort(){
        System.out.println("Adapter converts lightning to casual");
        casualearpods.insertIntoCasualPort();
    }

}
