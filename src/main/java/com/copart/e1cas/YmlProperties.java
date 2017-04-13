package com.copart.e1cas;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * YML Properties.
 * @author MRogers
 *
 */
@Component
@ConfigurationProperties("sqlScript")

public class YmlProperties
  {
  private static String sqlinHeader;
  private static String sqlinLotNumber;
  private static String sqlinEmailTemplateID;
  private static String sqlinSiteSource;
  private static String sqlinEmailAdr1;
  private static String sqlinEmailAdr2;
  private static String sqlinBuyerNumber;
  private static String sqlinTimeStamp1;
  private static String sqlinTimeStamp2;
  private static String sqlinTimeStamp3;
  private static String sqlinFooter;
 
  /**
   * Private constructor for utility class.
   */
  private YmlProperties()
  {    
  }
  
  /**
   * SQL Input Header.
   * @return Return SQL header -
   */
public static String getSqlinHeader()
  {
  return sqlinHeader;
  }

/**
 * SQL In Header.
 * @param sqlinHeader -
 */
public static void setSqlinHeader(String sqlinHeader)
  {
  YmlProperties.sqlinHeader = sqlinHeader;
  }

/**
 * SQL In Lot Number.
 * @return getSqlinLotNumber -
 */
public static String getSqlinLotNumber()
  {
  return sqlinLotNumber;
  }

/**
 * SQL In Lot Number.
 * @param sqlinLotNumber -
 */
public static void setSqlinLotNumber(String sqlinLotNumber)
  {
  YmlProperties.sqlinLotNumber = sqlinLotNumber;
  }

/**
 * SQL In Email Template ID.
 * @return getSqlinEmailTemplateID -
 */
public static String getSqlinEmailTemplateID()
  {
  return sqlinEmailTemplateID;
  }

/**
 * SQL In Email Template.
 * @param sqlinEmailTemplateID -
 */
public static void setSqlinEmailTemplateID(String sqlinEmailTemplateID)
  {
  YmlProperties.sqlinEmailTemplateID = sqlinEmailTemplateID;
  }

/**
 * SQL In Site Source.
 * @return getSqlinSiteSource -
 */
public static String getSqlinSiteSource()
  {
  return sqlinSiteSource;
  }

/**
 * SQL In Site Source.
 * @param sqlinSiteSource -
 */
public static void setSqlinSiteSource(String sqlinSiteSource)
  {
  YmlProperties.sqlinSiteSource = sqlinSiteSource;
  }

/**
 * SQL In Email Address 1.
 * @return getSqlinEmailAdr1 -
 */
public static String getSqlinEmailAdr1()
  {
  return sqlinEmailAdr1;
  }

/**
 * SQL In Email Address 1.
 * @param sqlinEmailAdr1 -
 */
public static void setSqlinEmailAdr1(String sqlinEmailAdr1)
  {
  YmlProperties.sqlinEmailAdr1 = sqlinEmailAdr1;
  }

/**
 * In Email Address 2.
 * @return getSqlinEmailAdr2 -
 */
public static String getSqlinEmailAdr2()
  {
  return sqlinEmailAdr2;
  }

/**
 * In Email Address 2.
 * @param sqlinEmailAdr2 -
 */
public static void setSqlinEmailAdr2(String sqlinEmailAdr2)
  {
  YmlProperties.sqlinEmailAdr2 = sqlinEmailAdr2;
  }

/**
 * SQL In Buyer Number.
 * @return getSqlinBuyerNumber -
 */
public static String getSqlinBuyerNumber()
  {
  return sqlinBuyerNumber;
  }

/**
 * SQL In Buyer Number.
 * @param sqlinBuyerNumber -
 */
public static void setSqlinBuyerNumber(String sqlinBuyerNumber)
  {
  YmlProperties.sqlinBuyerNumber = sqlinBuyerNumber;
  }

/**
 * SQL In Timestamp 1.
 * @return getSqlinTimeStamp1 -
 */
public static String getSqlinTimeStamp1()
  {
  return sqlinTimeStamp1;
  }

/**
 * SQL In Timestamp 1.
 * @param sqlinTimeStamp1 -
 */
public static void setSqlinTimeStamp1(String sqlinTimeStamp1)
  {
  YmlProperties.sqlinTimeStamp1 = sqlinTimeStamp1;
  }

/**
 * SQL In Timestamp 2.
 * @return getSqlinTimeStamp2 -
 */
public static String getSqlinTimeStamp2()
  {
  return sqlinTimeStamp2;
  }

/**
 * SQL In Timestamp 2.
 * @param sqlinTimeStamp2 -
 */
public static void setSqlinTimeStamp2(String sqlinTimeStamp2)
  {
  YmlProperties.sqlinTimeStamp2 = sqlinTimeStamp2;
  }

/**
 * SQL In Timestamp 3.
 * @return getSqlinTimeStamp3 -
 */
public static String getSqlinTimeStamp3()
  {
  return sqlinTimeStamp3;
  }

/**
 * SQL In Timestamp 3.
 * @param sqlinTimeStamp3 -
 */
public static void setSqlinTimeStamp3(String sqlinTimeStamp3)
  {
  YmlProperties.sqlinTimeStamp3 = sqlinTimeStamp3;
  }

/**
 * SQL In Footer.
 * @return getSqlinFooter -
 */
public static String getSqlinFooter()
  {
  return sqlinFooter;
  }

/**
 *  SQL In Footer.
 * @param sqlinFooter -
 */
public static void setSqlinFooter(String sqlinFooter)
  {
  YmlProperties.sqlinFooter = sqlinFooter;
  }
}
