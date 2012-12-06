package com.igeyao.client;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientIoHandler extends IoHandlerAdapter {
	private final static Logger log = LoggerFactory.getLogger(ClientIoHandler.class);
	private final String values;
	
	public ClientIoHandler(String values)
	{
		this.values = values;
	}
	
	@Override
	public void sessionOpened(IoSession session)
	{
		session.write(values);
	}
}
