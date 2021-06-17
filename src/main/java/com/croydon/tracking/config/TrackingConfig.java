/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.tracking.config;

import com.croydon.tracking.webservice.EstadoOrdenManager;
import com.croydon.tracking.webservice.EstadoOrdenManagerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author DesarrolladorWeb6
 */

@Configuration
public class TrackingConfig {
    
    @Bean
    public EstadoOrdenManager estadoOrdenManager(){
        return new EstadoOrdenManagerService().getEstadoOrdenManagerPort();
    }
}
