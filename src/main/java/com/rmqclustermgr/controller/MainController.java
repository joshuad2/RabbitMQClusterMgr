package com.rmqclustermgr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Controller
 * @author joshuadavis
 *
 */
@Controller
@RequestMapping("/main")
public class MainController {
/**
 * Provision a specific cluster, node, etc through the rest interface
 * @return
 */
	@RequestMapping("/provision/")
	public String provision() {
		return "Greetings from RabbitMQEstimationApp";
	}
	
	@RequestMapping("/setServer")
	public String setServer() {
		return "ServerInfo";
	}
}
