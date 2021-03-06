/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.extension.siddhi.store.rdbms.config;

/**
 * This class represents clauses of a SELECT query as required by Siddhi RDBMS Event Tables per supported DB vendor.
 */
public class RDBMSSelectQueryTemplate {

    private String selectClause;
    private String whereClause;
    private String groupByClause;
    private String havingClause;
    private String orderByClause;
    private String limitClause;
    private String offsetClause;
    private String queryWrapperClause;
    private String limitWrapperClause;
    private String offsetWrapperClause;
    private String isLimitBeforeOffset;

    public String getSelectClause() {
        return selectClause;
    }

    public void setSelectClause(String selectClause) {
        this.selectClause = selectClause;
    }

    public String getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }

    public String getGroupByClause() {
        return groupByClause;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    public String getHavingClause() {
        return havingClause;
    }

    public void setHavingClause(String havingClause) {
        this.havingClause = havingClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getLimitClause() {
        return limitClause;
    }

    public void setLimitClause(String limitClause) {
        this.limitClause = limitClause;
    }

    public String getOffsetClause() {
        return offsetClause;
    }

    public void setOffsetClause(String offsetClause) {
        this.offsetClause = offsetClause;
    }

    public String getIsLimitBeforeOffset() {
        return isLimitBeforeOffset;
    }

    public void setIsLimitBeforeOffset(String isLimitBeforeOffset) {
        this.isLimitBeforeOffset = isLimitBeforeOffset;
    }

    public String getQueryWrapperClause() {
        return queryWrapperClause;
    }

    public void setQueryWrapperClause(String queryWrapperClause) {
        this.queryWrapperClause = queryWrapperClause;
    }

    public String getLimitWrapperClause() {
        return limitWrapperClause;
    }

    public void setLimitWrapperClause(String limitWrapperClause) {
        this.limitWrapperClause = limitWrapperClause;
    }

    public String getOffsetWrapperClause() {
        return offsetWrapperClause;
    }

    public void setOffsetWrapperClause(String offsetWrapperClause) {
        this.offsetWrapperClause = offsetWrapperClause;
    }
}
