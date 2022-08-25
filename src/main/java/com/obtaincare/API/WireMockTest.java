package com.obtaincare.API;

import com.github.tomakehurst.wiremock.WireMockServer;

public class WireMockTest {



    public static void main(String[] args) {

        final String HOST = "localhost";
        final int PORT = 8081;
        WireMockServer server = new WireMockServer(PORT);

        server.start();


    }
}
