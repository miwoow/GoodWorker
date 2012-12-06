package com.igeyao.client;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.service.IoConnector;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class WorkerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoConnector connector = new NioSocketConnector();
		connector.setConnectTimeoutMillis(3000);
		connector.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("utf-8"))));
		connector.setHandler(new ClientIoHandler("您好！\r\n大家好！"));
		connector.connect(new InetSocketAddress("localhost", 9123));
	}
}
