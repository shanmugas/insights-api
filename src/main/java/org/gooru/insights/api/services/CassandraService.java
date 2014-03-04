/*******************************************************************************
 * CassandraService.java
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
package org.gooru.insights.api.services;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.gooru.insights.api.models.RequestParamsDTO;

import com.netflix.astyanax.connectionpool.OperationResult;
import com.netflix.astyanax.model.ColumnList;
import com.netflix.astyanax.model.Rows;

public interface CassandraService {

	List<Map<String,Object>> getCollectionData(RequestParamsDTO requestParamsDTO,Map<String,String> processedData,String collectionId,List<Map<String,String>> errorData,Map<String,String> selectValues);
	
	OperationResult<ColumnList<String>> read(String keyspace, String columnFamilyName, String key);
	
	OperationResult<ColumnList<String>> read(String keyspace, String columnFamilyName, String key, Collection<String> columnList);
	
	OperationResult<Rows<String, String>> read(String keyspace, String columnFamilyName, String columnValue, String columnName);
	
	OperationResult<Rows<String, String>> readAll(String keyspace, String columnFamilyName, String columnName);

	void markDeletedResource(String startTime,String endTime);
}

