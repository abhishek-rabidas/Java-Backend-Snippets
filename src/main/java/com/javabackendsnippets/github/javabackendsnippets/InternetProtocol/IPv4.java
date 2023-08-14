package com.javabackendsnippets.github.javabackendsnippets.InternetProtocol;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPv4 {

    public static String getIPv4() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return localHost.getHostAddress();
    }

}
