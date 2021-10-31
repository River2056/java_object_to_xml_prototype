package java_object_to_xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "ServiceHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceHeader {
  @XmlElement(namespace = "ser1", name = "ser:version")
  private String version;
  @XmlElement(namespace = "ser", name = "ser:servicename")
  private String serviceName;
  @XmlElement(namespace = "ser", name = "ser:serviceprovider")
  private String serviceProvider;
}
