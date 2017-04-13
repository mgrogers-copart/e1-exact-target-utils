package com.copart.e1cas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default rest controller.
 * @author MRogers
 *
 */
@RestController
public class ETUtilsController 
{

  @Autowired
  private As400Dao dao;

  /**
   * Email input request mapping.
   * @param inputData -
   * @return inputData.
   */
  @RequestMapping(value = "/emailSearch", method = RequestMethod.POST, produces = "application/json") 
  public List<OutputDataPojo> emailSearch(@RequestBody InputDataPojo inputData)
  {
    String sqlSelectString = null;
    boolean useAnd = false;

  List<OutputDataPojo> outDataList = new ArrayList<OutputDataPojo>();
  inputData = new DataUtils().validateData(inputData);

  if (!inputData.getIsDataValid())
  {
    OutputDataPojo outPojo = new OutputDataPojo();
    outPojo.setOutErrorCode("E1-EXACT-TARGET-UTILS-EMAILS");
    outPojo.setOutErrorText("Input variable error");
    outPojo.setOutErrorTechMsg("There was an input variable error that prevented the utility from running");
    outDataList.add(outPojo);
  }

  if (inputData.getIsDataValid())
  {
    useAnd = false;
    sqlSelectString = YmlProperties.getSqlinHeader();
  }

  // Email Address
  if (inputData.getInEmailAdr() != null && inputData.getInEmailAdr() != "")
  {
    if (useAnd)
    {
      sqlSelectString = sqlSelectString + " and ";
    }
    sqlSelectString = sqlSelectString + YmlProperties.getSqlinEmailAdr1()
        + inputData.getInEmailAdr().trim().toLowerCase() + YmlProperties.getSqlinEmailAdr2();
    useAnd = true;
  }

  // Site Source
  if (inputData.getInSiteSource() != null && inputData.getInSiteSource() != "")
  {
    if (useAnd)
    {
      sqlSelectString = sqlSelectString + " and ";
    }
    sqlSelectString = sqlSelectString + YmlProperties.getSqlinSiteSource()
        + inputData.getInSiteSource().trim();
    useAnd = true;
  }

  // Buyer Number
  if (inputData.getInBuyerNumber() > 0)
  {
    if (useAnd)
    {
      sqlSelectString = sqlSelectString + " and ";
    }
    sqlSelectString = sqlSelectString + YmlProperties.getSqlinBuyerNumber()
        + inputData.getInBuyerNumber() + "'";
    useAnd = true;
  }

  // Lot Number
  if (inputData.getInLotNumber() > 0)
  {
    if (useAnd)
    {
      sqlSelectString = sqlSelectString + " and ";
    }
    sqlSelectString = sqlSelectString + YmlProperties.getSqlinLotNumber()
      + inputData.getInLotNumber() + "'";
    useAnd = true;
  }

  // Email Template ID
  if (inputData.getInEmailTemplateID() != null && inputData.getInEmailTemplateID() != "")
  {
    if (useAnd)
    {
      sqlSelectString = sqlSelectString + " and ";
    }
    sqlSelectString = sqlSelectString + YmlProperties.getSqlinEmailTemplateID()
        + inputData.getInEmailTemplateID().trim();
    useAnd = true;
  }

  // Date adjustment
  if (inputData.getInDays() != 0 || inputData.getInHours() != 0)
  {
    if (useAnd)
    {
      sqlSelectString = sqlSelectString + " and ";
    }
      if (inputData.getInDays() != 0 && inputData.getInHours() != 0)
          {
          sqlSelectString = sqlSelectString + YmlProperties.getSqlinTimeStamp1()
            + inputData.getInDays() + YmlProperties.getSqlinTimeStamp2() + " - "
            + inputData.getInHours() + YmlProperties.getSqlinTimeStamp3();
        useAnd = true;
          }

        if (inputData.getInDays() != 0 && inputData.getInHours() == 0)
          {
          sqlSelectString = sqlSelectString + YmlProperties.getSqlinTimeStamp1()
            + inputData.getInDays() + YmlProperties.getSqlinTimeStamp2();
        useAnd = true;
          }

        if (inputData.getInDays() == 0 && inputData.getInHours() != 0)
          {
          sqlSelectString = sqlSelectString + YmlProperties.getSqlinTimeStamp1()
             + inputData.getInHours() + YmlProperties.getSqlinTimeStamp3();
        useAnd = true;
          }
  }

  sqlSelectString = sqlSelectString + ' ' + YmlProperties.getSqlinFooter().trim();
    outDataList = dao.getResultsFromDb(sqlSelectString);
  //dao.getResultsFromDb(sqlSelectString);
  return outDataList;
}
}
