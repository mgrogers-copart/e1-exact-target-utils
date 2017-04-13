package com.copart.e1cas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

/**
 * Repository.
 * @author MRogers
 *
 */
@Repository
public class As400Dao
  {
  private static final int setOutEmailID_Index = 0;
  private static final int setOutCompanyCode_Index = 1;
  private static final int setOutProcessFlag_Index = 2;
  private static final int setOutEmailTemplateID_Index = 3;
  private static final int setOutBuyerNumber_Index = 4;
  private static final int setOutLotNumber_Index = 5;
  private static final int setOutSiteSource_Index = 6;
  private static final int setOutTemplate_Index = 7;
  private static final int setOutLastChangedTimeStamp_Index = 8;
  private static final int setOutCreationTimeStamp_Index = 9;
  private static final int setOutToAddress_Index = 10;
  @PersistenceContext
  private EntityManager entityManager;

/**
 * Populate the Pojo.
 * @param sqlSelectString -
 * @return sqlSelectString -
 */
  public List<OutputDataPojo> getResultsFromDb(String sqlSelectString)
  {
    Query query = entityManager.createNativeQuery(sqlSelectString);

    System.out.println("SQL String: " + sqlSelectString);

    List<Object[]> result = (List<Object[]>) query.getResultList();

    List<OutputDataPojo> outDataList = new ArrayList<OutputDataPojo>();
    Iterator<Object[]> iterator = result.iterator();
    while (iterator.hasNext())
    {
    Object[] next = iterator.next();
    OutputDataPojo outputDataPojo = new OutputDataPojo();
    outDataList.add(outputDataPojo);
    outputDataPojo.setOutEmailID(next[setOutEmailID_Index].toString());
    outputDataPojo.setOutCompanyCode(next[setOutCompanyCode_Index].toString());
    outputDataPojo.setOutProcessFlag(next[setOutProcessFlag_Index].toString());
    outputDataPojo.setOutEmailTemplateID(next[setOutEmailTemplateID_Index].toString());
    outputDataPojo.setOutBuyerNumber(Integer.valueOf(next[setOutBuyerNumber_Index].toString()));
    outputDataPojo.setOutLotNumber(Integer.valueOf(next[setOutLotNumber_Index].toString()));
    outputDataPojo.setOutSiteSource(next[setOutSiteSource_Index].toString());
    outputDataPojo.setOutTemplate(next[setOutTemplate_Index].toString());
    outputDataPojo.setOutLastChangedTimeStamp(next[setOutLastChangedTimeStamp_Index].toString());
    outputDataPojo.setOutCreationTimeStamp(next[setOutCreationTimeStamp_Index].toString());
    outputDataPojo.setOutToAddress(next[setOutToAddress_Index].toString());
    }
      return outDataList;
  }
}