/*******************************************************************************
 * Copyright (c) 2016 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution. 
 *
 * The Eclipse Public License is available at 
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 	  Dave Locke - Original MQTTv3 implementation
 *    James Sutton - Initial MQTTv5 implementation
 */
package org.eclipse.paho.mqttv5.packet;

/**
 * Abstract super-class of all acknowledgement messages.
 */
public abstract class MqttAck extends MqttWireMessage {
	public MqttAck(byte type) {
		super(type);
	}
	
	@Override
	protected byte getMessageInfo() {
		return 0;
	}

	/**
	 * @return String representation of the wire message
	 */
	@Override
	public String toString() {
		return super.toString() + " msgId " + msgId;
	}
}