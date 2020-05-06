package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    String DEFAULT_APP_SERVER = "https:myappstore.com";
    String DEFAULT_PROTOCOL = "https";
    Integer DEFAULT_PORT = 443;

    public Phone(String brand, String model, Integer yearOfproduction) {
        super(brand, model, yearOfproduction);

    }

    @Override
    public void turnON() {
        System.out.println("Hello, your battery is 25%");
    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) throws Exception {
        if (buyer.getSalary() >= prize) {
            if (seller.phone == this) {
                buyer.phone = this;
                seller.phone = null;
                buyer.setSalary(buyer.getSalary() - prize);
                seller.setSalary(seller.getSalary() + prize);
                System.out.println("Transaction closed, phone " + this + " sold to " + buyer.firstname);
            } else {
                throw new Exception("cannot sell stolen phones :| ");
            }
        } else {
            throw new Exception("not enough money man");
        }
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }

    }

    public void installAnApp(String appName, String version) throws MalformedURLException {

        URL url = new URL(DEFAULT_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT, appName + "-" + version);
        installAnApp(url);
    }

    public void installAnApp(String appName) throws MalformedURLException {
        installAnApp(appName, "latest");
    }

    public void installAnApp(URL url) {
        System.out.println("app " + url.getFile() + " was installed");
    }

}

