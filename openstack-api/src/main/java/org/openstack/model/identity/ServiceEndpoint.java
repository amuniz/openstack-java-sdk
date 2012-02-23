package org.openstack.model.identity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.NONE)
public class ServiceEndpoint implements Serializable {

    @XmlAttribute
    private String region;

    @XmlAttribute
    private String tenantId;

    @XmlAttribute
    private String internalURL;

    @XmlAttribute
    private String publicURL;

    @XmlAttribute
    private String adminURL;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getInternalURL() {
        return internalURL;
    }

    public void setInternalURL(String internalURL) {
        this.internalURL = internalURL;
    }

    public String getPublicURL() {
        return publicURL;
    }

    public void setPublicURL(String publicURL) {
        this.publicURL = publicURL;
    }

    // @XmlElement
    // private ServiceVersion version;

}
