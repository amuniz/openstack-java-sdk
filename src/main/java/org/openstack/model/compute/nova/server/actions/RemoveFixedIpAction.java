package org.openstack.model.compute.nova.server.actions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.openstack.model.compute.ServerAction;
import org.openstack.model.compute.nova.NovaServer;

@XmlRootElement(name="removeFixedIp")
@XmlAccessorType(XmlAccessType.NONE)
@JsonRootName("removeFixedIp")
public class RemoveFixedIpAction implements Serializable, ServerAction {

	@XmlAttribute
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public Class<? extends Serializable> getReturnType() {
		return NovaServer.class;
	}
	
}
