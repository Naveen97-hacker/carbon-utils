/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.database.utils.jdbc.exceptions;

/**
 * Exception class to throw errors of the transactions.
 */
public class TransactionException extends Exception {

    private String errorCode;

    public TransactionException() {

        super();
    }

    public TransactionException(String errorMsg) {

        super(errorMsg);
    }

    public TransactionException(String errorMsg, String errorCode) {

        super(errorMsg);
        this.errorCode = errorCode;
    }

    public TransactionException(String errorMsg, Throwable e) {

        super(errorMsg, e);
    }

    public TransactionException(String errorMsg, String errorCode, Throwable e) {

        super(errorMsg, e);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {

        return errorCode;
    }

    public void setErrorCode(String errorCode) {

        this.errorCode = errorCode;
    }
}
