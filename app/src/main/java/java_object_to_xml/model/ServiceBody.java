package java_object_to_xml.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "ServiceBody")
public class ServiceBody {
  private PbLimit pbLimit;
}
