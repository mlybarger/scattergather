package com.example.switchyard.scattergather;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://Producer").log(
				"Received message for 'Producer' : ${body}")
				.to("switchyard://ProducerOut")
				.log("final: ${body}")
				;
	}
}