package org.openstack.model.identity.keystone;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.openstack.model.identity.Role;

@XmlRootElement(name="role")
@XmlAccessorType(XmlAccessType.NONE)
@JsonRootName("role")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeystoneRole implements Serializable, Role {

	@XmlAttribute
	private String id;

	@XmlAttribute
	private String name;

	@XmlAttribute
	private String serviceId;

	@XmlAttribute
	private String tenantId;

	public KeystoneRole() {

	}

	public KeystoneRole(final String id, final String name) {
		this.id = id;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see org.openstack.model.identity.keystone.Role#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see org.openstack.model.identity.keystone.Role#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	//serviceId and tenantId are only in access/user/roles

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(final String serviceId) {
		this.serviceId = serviceId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(final String tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}

}

