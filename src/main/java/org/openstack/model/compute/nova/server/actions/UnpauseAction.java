package org.openstack.model.compute.nova.server.actions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.openstack.model.compute.ServerAction;
import org.openstack.model.compute.nova.NovaServer;

@XmlRootElement(name="unpause")
@XmlAccessorType(XmlAccessType.NONE)
@JsonRootName("unpause")
public class UnpauseAction implements Serializable, ServerAction {
	
	@Override
	public Class<? extends Serializable> getReturnType() {
		return NovaServer.class;
	}
	
}
