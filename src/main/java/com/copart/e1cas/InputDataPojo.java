package com.copart.e1cas;

/**
 * InputDataPojo.
 * @author MRogers
 *
 */
public class InputDataPojo
  {
  private String inEmailAdr = "";
  private String inSiteSource = "";
  private int inBuyerNumber;
  private int inLotNumber;
  private String inEmailTemplateID = "";
  private int inDays;
  private int inHours;
  private boolean isDataValid;

  /**
   * getInEmailAdr.
   * @return getInEmailAdr -
   */
  public String getInEmailAdr()
  {
    return inEmailAdr;
  }

  /**
   * setInEmailAdr.
   * @param inEmailAdr -
   */
  public void setInEmailAdr(String inEmailAdr)
  {
    this.inEmailAdr = inEmailAdr;
  }

  /**
   * getInBuyerNumber.
   * @return getInBuyerNumber -
   */
  public int getInBuyerNumber()
  {
    return inBuyerNumber;
  }

  /**
   * setInBuyerNumber.
   * @param inBuyerNumber -
   */
  public void setInBuyerNumber(int inBuyerNumber)
  {
    this.inBuyerNumber = inBuyerNumber;
  }

  /**
   * getInLotNumber.
   * @return getInLotNumber -
   */
  public int getInLotNumber()
  {
    return inLotNumber;
  }

  /**
   * inLotNumber.
   * @param inLotNumber -
   */
  public void setInLotNumber(int inLotNumber)
  {
    this.inLotNumber = inLotNumber;
  }

  /**
   * getInEmailTemplateID.
   * @return getInEmailTemplateID -
   */
  public String getInEmailTemplateID()
  {
    return inEmailTemplateID;
  }

  /**
   * setInEmailTemplateID.
   * @param inEmailTemplateID -
   */
  public void setInEmailTemplateID(String inEmailTemplateID)
  {
    this.inEmailTemplateID = inEmailTemplateID;
  }

  /**
   * getInHours.
   * @return getInHours -
   */
  public int getInHours()
  {
    return inHours;
  }

  /**
   * setInHours.
   * @param inHours -
   */
  public void setInHours(int inHours)
  {
    this.inHours = inHours;
  }

  /**
   * getInDays.
   * @return getInDays -
   */
  public int getInDays()
  {
    return inDays;
  }

  /**
   * setInDays.
   * @param inDays -
   */
  public void setInDays(int inDays)
  {
    this.inDays = inDays;
  }

  /**
   * isDataValid.
   * @return isDataValid -
   */
  public boolean getIsDataValid()
  {
    return isDataValid;
  }

  /**
   * setDataValid.
   * @param isDataValid -
   */
  public void setIsDataValid(boolean isDataValid)
  {
    this.isDataValid = isDataValid;
  }

  /**
   * getInSiteSource.
   * @return getInSiteSource -
   */
  public String getInSiteSource()
  {
    return inSiteSource;
  }

  /**
   * setInSiteSource.
   * @param inSiteSource -
   */
  public void setInSiteSource(String inSiteSource)
  {
    this.inSiteSource = inSiteSource;
  }
}
