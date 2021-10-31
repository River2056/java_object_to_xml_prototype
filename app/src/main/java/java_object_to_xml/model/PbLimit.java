package java_object_to_xml.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "PBLimit")
public class PbLimit {
  private String custPermId;
  private String countryCode;
  private String lineCode;
  private String mainLineCode;
  private List<FmtLmt> fmtLmt;

  public PbLimit() {
  }

}
