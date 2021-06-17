/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.tracking.model.service;

import com.croydon.tracking.model.Tracking;
import com.croydon.tracking.webservice.D5942EOPVO;
import com.croydon.tracking.webservice.EstadoOrdenManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author DesarrolladorWeb6
 */

public interface TrackingService {
    
    public D5942EOPVO getTracking(Tracking tracking);
}
