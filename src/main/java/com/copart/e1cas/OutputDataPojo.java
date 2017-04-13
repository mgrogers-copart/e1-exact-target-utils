package com.copart.e1cas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * OutputDataPojo.
 * @author MRogers
 *
 */
@Entity
public class OutputDataPojo
  {
  @Id
  
  @Column(name = "EMAIL_ID")
  private String outEmailID = "";

  @Column(name = "COMPANY_CODE")
  private String outCompanyCode = "";

  @Column(name = "PROCESSED_FLAG")
  private String outProcessFlag = "";

  @Column(name = "EMAIL_TEMPLATE_ID")
  private String outEmailTemplateID = "";

  @Column(name = "PARTY_ID")
  private int outBuyerNumber;

  @Column(name = "LOTNUMBER")
  private int outLotNumber;

  @Column(name = "SITESOURCE")
  private String outSiteSource = "";

  @Column(name = "TEMPLATE")
  private String outTemplate;

  @Column(name = "LAST_CHANGE_TS")
  private String outLastChangedTimeStamp = "";

  @Column(name = "CREATION_TS")
  private String outCreationTimeStamp = "";

  @Column(name = "TO_ADDRESS")
  private String outToAddress = "";

  @Column(name = "ERRORTEXT")
  private String outErrorText = "";

  @Column(name = "ERROR_CODE")
  private String outErrorCode = "";

  @Column(name = "ERROR_TECH_MSG")
  private String outErrorTechMsg = "";
  
  /**
   * getOutEmailID.
   * @return getOutEmailID -
   */
  public String getOutEmailID()
  {
    return outEmailID;
  }

  /**
   * setOutEmailID.
   * @param outEmailID -
   */
  public void setOutEmailID(String outEmailID)
  {
    this.outEmailID = outEmailID;
  }

  /**
   * getOutCompanyCode.
   * @return getOutCompanyCode -
   */
  public String getOutCompanyCode()
  {
    return outCompanyCode;
  }

  /**
   * setOutCompanyCode.
   * @param outCompanyCode -
   */
  public void setOutCompanyCode(String outCompanyCode)
  {
    this.outCompanyCode = outCompanyCode;
  }

  /**
   * getOutProcessFlag.
   * @return getOutProcessFlag -
   */
  public String getOutProcessFlag()
  {
    return outProcessFlag;
  }

  /**
   * setOutProcessFlag.
   * @param outProcessFlag -
   */
  public void setOutProcessFlag(String outProcessFlag)
  {
    this.outProcessFlag = outProcessFlag;
  }

  /**
   * getOutEmailTemplateID.
   * @return getOutEmailTemplateID -
   */
  public String getOutEmailTemplateID()
  {
    return outEmailTemplateID;
  }

  /**
   * setOutEmailTemplateID.
   * @param outEmailTemplateID -
   */
  public void setOutEmailTemplateID(String outEmailTemplateID)
  {
    this.outEmailTemplateID = outEmailTemplateID;
  }

  /**
   * getOutBuyerNumber.
   * @return getOutBuyerNumber -
   */
  public int getOutBuyerNumber()
  {
    return outBuyerNumber;
  }

  /**
   * setOutBuyerNumber.
   * @param outBuyerNumber -
   */
  public void setOutBuyerNumber(int outBuyerNumber)
  {
    this.outBuyerNumber = outBuyerNumber;
  }

  /**
   * getOutLotNumber.
   * @return getOutLotNumber -
   */
  public int getOutLotNumber()
  {
    return outLotNumber;
  }

  /**
   * setOutLotNumber.
   * @param outLotNumber -
   */
  public void setOutLotNumber(int outLotNumber)
  {
    this.outLotNumber = outLotNumber;
  }

  /**
   * getOutSiteSource.
   * @return getOutSiteSource -
   */
  public String getOutSiteSource()
  {
    return outSiteSource;
  }

  /**
   * setOutSiteSource.
   * @param outSiteSource -
   */
  public void setOutSiteSource(String outSiteSource)
  {
    this.outSiteSource = outSiteSource;
  }

  /**
   * getOutTemplate.
   * @return getOutTemplate -
   */
  public String getOutTemplate()
  {
    return outTemplate;
  }

  /**
   * setOutTemplate.
   * @param outTemplate -
   */
  public void setOutTemplate(String outTemplate)
  {
    this.outTemplate = outTemplate;
  }

  /**
   * getOutLastChangedTimeStamp.
   * @return getOutLastChangedTimeStamp -
   */
  public String getOutLastChangedTimeStamp()
  {
    return outLastChangedTimeStamp;
  }

  /**
   * setOutLastChangedTimeStamp.
   * @param outLastChangedTimeStamp -
   */
  public void setOutLastChangedTimeStamp(String outLastChangedTimeStamp)
  {
    this.outLastChangedTimeStamp = outLastChangedTimeStamp;
  }

  /**
   * getOutCreationTimeStamp.
   * @return getOutCreationTimeStamp -
   */
  public String getOutCreationTimeStamp()
  {
    return outCreationTimeStamp;
  }

  /**
   * setOutCreationTimeStamp.
   * @param outCreationTimeStamp -
   */
  public void setOutCreationTimeStamp(String outCreationTimeStamp)
  {
    this.outCreationTimeStamp = outCreationTimeStamp;
  }

  /**
   * getOutToAddress.
   * @return getOutToAddress -
   */
  public String getOutToAddress()
  {
    return outToAddress;
  }

  /**
   * setOutToAddress.
   * @param outToAddress -
   */
  public void setOutToAddress(String outToAddress)
  {
    this.outToAddress = outToAddress;
  }

  /**
   * getOutErrorCode.
   * @return getOutErrorCode -
   */
  public String getOutErrorCode()
  {
    return outErrorCode;
  }

  /**
   * setOutErrorCode.
   * @param outErrorCode -
   */
  public void setOutErrorCode(String outErrorCode)
  {
    this.outErrorCode = outErrorCode;
  }

  /**
   * getOutErrorText.
   * @return getOutErrorText -
   */
  public String getOutErrorText()
  {
    return outErrorText;
  }

  /**
   * setOutErrorText.
   * @param outErrorText -
   */
  public void setOutErrorText(String outErrorText)
  {
    this.outErrorText = outErrorText;
  }
  

  /**
   * getOutErrorTechMsg.
   * @return getOutErrorTechMsg -
   */
  public String getOutErrorTechMsg()
  {
    return outErrorCode;
  }

  /**
   * outErrorTechMsg.
   * @param outErrorTechMsg -
   */
  public void setOutErrorTechMsg(String outErrorTechMsg)
  {
    this.outErrorTechMsg = outErrorTechMsg;
  }
}
