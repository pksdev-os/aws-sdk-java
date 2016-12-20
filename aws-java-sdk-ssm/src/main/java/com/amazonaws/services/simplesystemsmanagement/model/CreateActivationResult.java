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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateActivationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID number generated by the system when it processed the activation. The activation ID functions like a user
     * name.
     * </p>
     */
    private String activationId;
    /**
     * <p>
     * The code the system generates when it processes the activation. The activation code functions like a password to
     * validate the activation ID.
     * </p>
     */
    private String activationCode;

    /**
     * <p>
     * The ID number generated by the system when it processed the activation. The activation ID functions like a user
     * name.
     * </p>
     * 
     * @param activationId
     *        The ID number generated by the system when it processed the activation. The activation ID functions like a
     *        user name.
     */

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>
     * The ID number generated by the system when it processed the activation. The activation ID functions like a user
     * name.
     * </p>
     * 
     * @return The ID number generated by the system when it processed the activation. The activation ID functions like
     *         a user name.
     */

    public String getActivationId() {
        return this.activationId;
    }

    /**
     * <p>
     * The ID number generated by the system when it processed the activation. The activation ID functions like a user
     * name.
     * </p>
     * 
     * @param activationId
     *        The ID number generated by the system when it processed the activation. The activation ID functions like a
     *        user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationResult withActivationId(String activationId) {
        setActivationId(activationId);
        return this;
    }

    /**
     * <p>
     * The code the system generates when it processes the activation. The activation code functions like a password to
     * validate the activation ID.
     * </p>
     * 
     * @param activationCode
     *        The code the system generates when it processes the activation. The activation code functions like a
     *        password to validate the activation ID.
     */

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    /**
     * <p>
     * The code the system generates when it processes the activation. The activation code functions like a password to
     * validate the activation ID.
     * </p>
     * 
     * @return The code the system generates when it processes the activation. The activation code functions like a
     *         password to validate the activation ID.
     */

    public String getActivationCode() {
        return this.activationCode;
    }

    /**
     * <p>
     * The code the system generates when it processes the activation. The activation code functions like a password to
     * validate the activation ID.
     * </p>
     * 
     * @param activationCode
     *        The code the system generates when it processes the activation. The activation code functions like a
     *        password to validate the activation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationResult withActivationCode(String activationCode) {
        setActivationCode(activationCode);
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
        if (getActivationId() != null)
            sb.append("ActivationId: ").append(getActivationId()).append(",");
        if (getActivationCode() != null)
            sb.append("ActivationCode: ").append(getActivationCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateActivationResult == false)
            return false;
        CreateActivationResult other = (CreateActivationResult) obj;
        if (other.getActivationId() == null ^ this.getActivationId() == null)
            return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false)
            return false;
        if (other.getActivationCode() == null ^ this.getActivationCode() == null)
            return false;
        if (other.getActivationCode() != null && other.getActivationCode().equals(this.getActivationCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        hashCode = prime * hashCode + ((getActivationCode() == null) ? 0 : getActivationCode().hashCode());
        return hashCode;
    }

    @Override
    public CreateActivationResult clone() {
        try {
            return (CreateActivationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
