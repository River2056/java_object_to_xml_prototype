package java_object_to_xml.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "FmtLmt")
public class FmtLmt {
  private String ccy;
  private String amt;

  public FmtLmt() {
  }

  public FmtLmt(String ccy, String amt) {
    this.ccy = ccy;
    this.amt = amt;
  }

}
