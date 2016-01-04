package org.wso2.carbon.device.mgt.iot.digitaldisplay.api.transport;

public interface CommunicationHandler<T> {
	int DEFAULT_TIMEOUT_INTERVAL = 5000;      // millis ~ 10 sec

	void connect();

	boolean isConnected();

	void processIncomingMessage(T message, String... messageParams);

	void processIncomingMessage();

	void disconnect();
}
