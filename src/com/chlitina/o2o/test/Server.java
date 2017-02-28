package com.chlitina.o2o.test;

import javax.xml.ws.Endpoint;

import com.chlitina.o2o.ws.BalanceService;

public class Server {
    protected Server() throws Exception {
        // START SNIPPET: publish
        System.out.println("Starting Server");
        BalanceService implementor = new BalanceService();
        String address = "http://localhost:9000/helloWorld";
        Endpoint.publish(address, implementor);
        // END SNIPPET: publish
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
