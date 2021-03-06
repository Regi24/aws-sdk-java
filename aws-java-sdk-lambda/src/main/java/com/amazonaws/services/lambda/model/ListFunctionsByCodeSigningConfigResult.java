/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionsByCodeSigningConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionsByCodeSigningConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The function ARNs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> functionArns;

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsByCodeSigningConfigResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The function ARNs.
     * </p>
     * 
     * @return The function ARNs.
     */

    public java.util.List<String> getFunctionArns() {
        if (functionArns == null) {
            functionArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return functionArns;
    }

    /**
     * <p>
     * The function ARNs.
     * </p>
     * 
     * @param functionArns
     *        The function ARNs.
     */

    public void setFunctionArns(java.util.Collection<String> functionArns) {
        if (functionArns == null) {
            this.functionArns = null;
            return;
        }

        this.functionArns = new com.amazonaws.internal.SdkInternalList<String>(functionArns);
    }

    /**
     * <p>
     * The function ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionArns(java.util.Collection)} or {@link #withFunctionArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param functionArns
     *        The function ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsByCodeSigningConfigResult withFunctionArns(String... functionArns) {
        if (this.functionArns == null) {
            setFunctionArns(new com.amazonaws.internal.SdkInternalList<String>(functionArns.length));
        }
        for (String ele : functionArns) {
            this.functionArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The function ARNs.
     * </p>
     * 
     * @param functionArns
     *        The function ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsByCodeSigningConfigResult withFunctionArns(java.util.Collection<String> functionArns) {
        setFunctionArns(functionArns);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getFunctionArns() != null)
            sb.append("FunctionArns: ").append(getFunctionArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFunctionsByCodeSigningConfigResult == false)
            return false;
        ListFunctionsByCodeSigningConfigResult other = (ListFunctionsByCodeSigningConfigResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getFunctionArns() == null ^ this.getFunctionArns() == null)
            return false;
        if (other.getFunctionArns() != null && other.getFunctionArns().equals(this.getFunctionArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getFunctionArns() == null) ? 0 : getFunctionArns().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionsByCodeSigningConfigResult clone() {
        try {
            return (ListFunctionsByCodeSigningConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
