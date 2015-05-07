package com.example.switchyard.scattergather;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(EchoOne.class)
public class EchoOneBean implements EchoOne {
	private static final Logger LOG = Logger.getLogger(EchoOneBean.class);
	
	@Override
	public String message(String message) {
		LOG.info("message() - start:" + message); 
		return message;
	}

}
