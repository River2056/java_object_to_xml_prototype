package java_object_to_xml.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "ServiceEnvelop")
public class ServiceEnvelop {
  private ServiceHeader serviceHeader;
  private ServiceBody serviceBody;
}
