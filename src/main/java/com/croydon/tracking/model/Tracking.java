/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.tracking.model;

import com.croydon.tracking.webservice.D5942EOPVO;

/**
 *
 * @author DesarrolladorWeb6
 */
public class Tracking extends D5942EOPVO{

    public Tracking() {
    }

	@Override
	public String toString() {
		return "Tracking [addressNumber=" + addressNumber + ", description=" + description + ", description02="
				+ description02 + ", description11=" + description11 + ", documentOrderNoInvoiceetc="
				+ documentOrderNoInvoiceetc + ", documentVoucherInvoiceetc=" + documentVoucherInvoiceetc
				+ ", numerodeGuia=" + numerodeGuia + ", orderType=" + orderType + "]";
	}   
    
    
}
