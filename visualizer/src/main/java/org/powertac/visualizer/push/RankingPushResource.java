package org.powertac.visualizer.push;

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;

@PushEndpoint("/ranking")
public class RankingPushResource {

	@OnMessage(encoders = { JSONEncoder.class })
	public String onMessage(String data) {
		return data;
	}
}
