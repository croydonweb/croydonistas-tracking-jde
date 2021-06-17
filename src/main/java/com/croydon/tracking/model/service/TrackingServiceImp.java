/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.tracking.model.service;

import com.croydon.tracking.model.Tracking;
import com.croydon.tracking.webservice.BusinessServiceException_Exception;
import com.croydon.tracking.webservice.D5942EOPVO;
import com.croydon.tracking.webservice.EstadoOrdenManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DesarrolladorWeb6
 */
@Service
public class TrackingServiceImp implements TrackingService {

    @Autowired
    EstadoOrdenManager estadoOrdenManager;

    @Override
    public D5942EOPVO getTracking(Tracking tracking) {
        try {
            D5942EOPVO status = estadoOrdenManager.getStatus(tracking);
            return status;
            
        } catch (BusinessServiceException_Exception ex) {
            Logger.getLogger(TrackingServiceImp.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
