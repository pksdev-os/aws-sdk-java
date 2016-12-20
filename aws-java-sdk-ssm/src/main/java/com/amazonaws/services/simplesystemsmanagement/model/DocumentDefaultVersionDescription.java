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
 * <p>
 * A default version of a document.
 * </p>
 */
public class DocumentDefaultVersionDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The default version of the document.
     * </p>
     */
    private String defaultVersion;

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @param name
     *        The name of the document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @return The name of the document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @param name
     *        The name of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDefaultVersionDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The default version of the document.
     * </p>
     * 
     * @param defaultVersion
     *        The default version of the document.
     */

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The default version of the document.
     * </p>
     * 
     * @return The default version of the document.
     */

    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The default version of the document.
     * </p>
     * 
     * @param defaultVersion
     *        The default version of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDefaultVersionDescription withDefaultVersion(String defaultVersion) {
        setDefaultVersion(defaultVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentDefaultVersionDescription == false)
            return false;
        DocumentDefaultVersionDescription other = (DocumentDefaultVersionDescription) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public DocumentDefaultVersionDescription clone() {
        try {
            return (DocumentDefaultVersionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
