/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.tracking.controller.api;

import com.croydon.tracking.model.Tracking;
import com.croydon.tracking.model.service.TrackingService;
import com.croydon.tracking.webservice.D5942EOPVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DesarrolladorWeb6
 */
@RestController
@RequestMapping("/api/tracking")
public class TrackingController {

    @Autowired
    TrackingService trackingService;

    @GetMapping
    public ResponseEntity<?> getStatusTracking(@RequestParam int addressNumber, @RequestParam int orderNumber, @RequestParam String orderType) {
        Tracking tracking=new Tracking();
        tracking.setAddressNumber(addressNumber);
        tracking.setDocumentOrderNoInvoiceetc(orderNumber);
        tracking.setOrderType(orderType);
        D5942EOPVO status = trackingService.getTracking(tracking);
        return ResponseEntity.ok(status);
    }
}
