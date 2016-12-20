/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class RevokeGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the customer master key associated with the grant. This value can be a globally unique
     * identifier or the fully specified ARN to a key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     */
    private String keyId;
    /**
     * <p>
     * Identifier of the grant to be revoked.
     * </p>
     */
    private String grantId;

    /**
     * <p>
     * A unique identifier for the customer master key associated with the grant. This value can be a globally unique
     * identifier or the fully specified ARN to a key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        A unique identifier for the customer master key associated with the grant. This value can be a globally
     *        unique identifier or the fully specified ARN to a key.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key associated with the grant. This value can be a globally unique
     * identifier or the fully specified ARN to a key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @return A unique identifier for the customer master key associated with the grant. This value can be a globally
     *         unique identifier or the fully specified ARN to a key.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key associated with the grant. This value can be a globally unique
     * identifier or the fully specified ARN to a key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        A unique identifier for the customer master key associated with the grant. This value can be a globally
     *        unique identifier or the fully specified ARN to a key.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeGrantRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Identifier of the grant to be revoked.
     * </p>
     * 
     * @param grantId
     *        Identifier of the grant to be revoked.
     */

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    /**
     * <p>
     * Identifier of the grant to be revoked.
     * </p>
     * 
     * @return Identifier of the grant to be revoked.
     */

    public String getGrantId() {
        return this.grantId;
    }

    /**
     * <p>
     * Identifier of the grant to be revoked.
     * </p>
     * 
     * @param grantId
     *        Identifier of the grant to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeGrantRequest withGrantId(String grantId) {
        setGrantId(grantId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getGrantId() != null)
            sb.append("GrantId: ").append(getGrantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeGrantRequest == false)
            return false;
        RevokeGrantRequest other = (RevokeGrantRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantId() == null ^ this.getGrantId() == null)
            return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode());
        return hashCode;
    }

    @Override
    public RevokeGrantRequest clone() {
        return (RevokeGrantRequest) super.clone();
    }
}
