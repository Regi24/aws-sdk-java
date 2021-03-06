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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedPrefixListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the prefix lists.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedPrefixList> prefixLists;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedPrefixListsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the prefix lists.
     * </p>
     * 
     * @return Information about the prefix lists.
     */

    public java.util.List<ManagedPrefixList> getPrefixLists() {
        if (prefixLists == null) {
            prefixLists = new com.amazonaws.internal.SdkInternalList<ManagedPrefixList>();
        }
        return prefixLists;
    }

    /**
     * <p>
     * Information about the prefix lists.
     * </p>
     * 
     * @param prefixLists
     *        Information about the prefix lists.
     */

    public void setPrefixLists(java.util.Collection<ManagedPrefixList> prefixLists) {
        if (prefixLists == null) {
            this.prefixLists = null;
            return;
        }

        this.prefixLists = new com.amazonaws.internal.SdkInternalList<ManagedPrefixList>(prefixLists);
    }

    /**
     * <p>
     * Information about the prefix lists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixLists(java.util.Collection)} or {@link #withPrefixLists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param prefixLists
     *        Information about the prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedPrefixListsResult withPrefixLists(ManagedPrefixList... prefixLists) {
        if (this.prefixLists == null) {
            setPrefixLists(new com.amazonaws.internal.SdkInternalList<ManagedPrefixList>(prefixLists.length));
        }
        for (ManagedPrefixList ele : prefixLists) {
            this.prefixLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the prefix lists.
     * </p>
     * 
     * @param prefixLists
     *        Information about the prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedPrefixListsResult withPrefixLists(java.util.Collection<ManagedPrefixList> prefixLists) {
        setPrefixLists(prefixLists);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPrefixLists() != null)
            sb.append("PrefixLists: ").append(getPrefixLists());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedPrefixListsResult == false)
            return false;
        DescribeManagedPrefixListsResult other = (DescribeManagedPrefixListsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPrefixLists() == null ^ this.getPrefixLists() == null)
            return false;
        if (other.getPrefixLists() != null && other.getPrefixLists().equals(this.getPrefixLists()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPrefixLists() == null) ? 0 : getPrefixLists().hashCode());
        return hashCode;
    }

    @Override
    public DescribeManagedPrefixListsResult clone() {
        try {
            return (DescribeManagedPrefixListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
