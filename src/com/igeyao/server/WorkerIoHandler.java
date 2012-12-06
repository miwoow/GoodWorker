package com.igeyao.server;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerIoHandler extends IoHandlerAdapter {

	private final static Logger log = LoggerFactory.getLogger(WorkerIoHandler.class);
	
	@Override
	public void messageReceived(IoSession session, Object message)
	{
		String str = message.toString();
		log.info("The message received is ["+str+"]");
		if (str.trim().endsWith("quit"))
		{
			session.close(true);
			return;
		}
	}
}
