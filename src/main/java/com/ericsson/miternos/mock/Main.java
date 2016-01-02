package com.ericsson.miternos.mock;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.ContextHandlerCollection;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

import javax.servlet.Servlet;
import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: eilkakk
 * Date: 11/20/13
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */

public class Main {


    public static void main(String[] args) {

        try {
            String busFactory =
                    System.getProperty(BusFactory.BUS_FACTORY_PROPERTY_NAME);
            System.setProperty(BusFactory.BUS_FACTORY_PROPERTY_NAME,
                    "org.apache.cxf.bus.CXFBusFactory");
            try {
                // Start up the jetty embedded server
                Server httpServer = new Server(9000);
                ContextHandlerCollection contexts = new ContextHandlerCollection();
                httpServer.setHandler(contexts);

                Context root = new Context(contexts, "/", Context.SESSIONS);

                CXFNonSpringServlet cxf = new CXFNonSpringServlet();
                ServletHolder servlet = new ServletHolder(cxf);
                servlet.setName("soap");
                servlet.setForcedPath("soap");
                root.addServlet(servlet, "/soap/*");

                httpServer.start();

                Bus bus = cxf.getBus();
                //setBus(bus);
                BusFactory.setDefaultBus(bus);
                Endpoint.publish("/messaging", new MessagingImpl());
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                // clean up the system properties
                if (busFactory != null) {
                    System.setProperty(BusFactory.BUS_FACTORY_PROPERTY_NAME,
                            busFactory);
                } else {
                    System.clearProperty(BusFactory.BUS_FACTORY_PROPERTY_NAME);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }





    }

}
