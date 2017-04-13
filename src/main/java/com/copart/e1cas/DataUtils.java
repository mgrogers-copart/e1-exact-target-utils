package com.copart.e1cas;

/**
 * Data Utils.
 * @author MRogers
 *
 */
public class DataUtils
  {

  /**
   * Validate Data.
   * @param inPojo -
   * @return inPojo -
   */
  public InputDataPojo validateData(InputDataPojo inPojo)
    {

    if (inPojo.getInEmailAdr() != ""
        || inPojo.getInSiteSource() != ""
        || inPojo.getInBuyerNumber() != 0
        || inPojo.getInLotNumber() != 0
        || inPojo.getInEmailTemplateID() != ""
        || inPojo.getInDays() != 0
        || inPojo.getInHours() != 0) 
    {
      inPojo.setIsDataValid(true);
    }
      else 
    {
      inPojo.setIsDataValid(false);
    }

    return inPojo;

  }

}
