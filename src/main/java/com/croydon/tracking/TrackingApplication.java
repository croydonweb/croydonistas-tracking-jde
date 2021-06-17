package com.croydon.tracking;

import com.croydon.tracking.model.Tracking;
import com.croydon.tracking.model.service.TrackingService;
import com.croydon.tracking.webservice.D5942EOPVO;
import com.croydon.tracking.webservice.EstadoOrdenManager;
import com.croydon.tracking.webservice.EstadoOrdenManagerService;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackingApplication implements CommandLineRunner {
    
    @Autowired 
    EstadoOrdenManager estadoOrdenManager;
    
    @Autowired
    TrackingService trackingService;
    

    public static void main(String[] args) {
        SpringApplication.run(TrackingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tracking tracking=new Tracking();
        tracking.setAddressNumber(97461);
        tracking.setDocumentOrderNoInvoiceetc(21001196);
        tracking.setOrderType("SN");
        D5942EOPVO status = trackingService.getTracking(tracking);
        System.out.println("Descripcion 1:"+status.getDescription());
        System.out.println("Descripcion 2:"+status.getDescription11());
        System.out.println("Descripcion 3:"+status.getDescription02());
        
    }

}
