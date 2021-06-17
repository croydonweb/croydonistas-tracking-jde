/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.tracking.controller.mvc;

import com.croydon.tracking.model.Tracking;
import com.croydon.tracking.model.service.TrackingService;
import com.croydon.tracking.webservice.D5942EOPVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DesarrolladorWeb6
 */
@Controller
@RequestMapping("/tracking")
public class TrackingMVCController {

	@Autowired
	TrackingService trackingService;

	@GetMapping("/find")
	public String form(Tracking tracking, Model model) {
		return "/views/form";
	}

	@GetMapping("/")
	public String getStatusTracking(@RequestParam int addressNumber, @RequestParam String orderType,
			@RequestParam int documentOrderNoInvoiceetc, Tracking tracking, Model model) {
		tracking.setAddressNumber(addressNumber);
		tracking.setDocumentOrderNoInvoiceetc(documentOrderNoInvoiceetc);
		tracking.setOrderType(orderType);
		D5942EOPVO status = trackingService.getTracking(tracking);
		tracking.setDescription(status.getDescription());
		tracking.setDescription02(status.getDescription02());
		tracking.setDescription11(status.getDescription11());
		tracking.setNumerodeGuia(status.getNumerodeGuia());
		tracking.setDocumentVoucherInvoiceetc(status.getDocumentVoucherInvoiceetc());
		System.out.println(tracking);
		model.addAttribute("tracking",tracking);
		return "/views/view";
	}
}
