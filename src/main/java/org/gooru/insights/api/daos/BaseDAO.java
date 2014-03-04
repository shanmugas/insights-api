/*******************************************************************************
 * BaseDAO.java
 * insights-read-api
 * Created by Gooru on 2014
 * Copyright (c) 2014 Gooru. All rights reserved.
 * http://www.goorulearning.org/
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
package org.gooru.insights.api.daos;

import java.util.List;
import java.util.Map;

import org.gooru.insights.api.models.RequestParamsDTO;

public interface BaseDAO {

	String getTodayDateId(String date);

	String getWeekDateId(String date);

	String getMonthDateId(String date);

	String getYearDateId(String date);

	String getQuaterDateId(String date);

	String getAllDateId(String sortOrder);

	String getDate(String dateId);
	
//	long getTimeStamp(String Date) throws ParseException;

	void addWhereClause(StringBuffer updatedWhereClauseSb, String clauseToAdd);
	
	List<Map<String,Object>> getListFromObject(List<Object[]>  object,String selectFields);
	
	List<Map<String,Object>> getListFromData(List object,String selectFields);
	
	public List<Map<String, Object>> processRecords(RequestParamsDTO requestParamsDTO, String sql, String selectFields, String InvalidFields, String requestFields, Integer totalFields,String unixStartDate,String unixEndDate,String groupBy,Map<String, Map<String, Integer>> paramList,List<Map<String,String>> errorData);

	public boolean checkNull(Integer parameter);
	
	public boolean checkNull(String parameter);
	
	List<Map<String, String>> getListFromObject(List<Object[]> object, String[] selectFields,String startDate,String endDate);

	String getDateValue(String timeCode);
}

