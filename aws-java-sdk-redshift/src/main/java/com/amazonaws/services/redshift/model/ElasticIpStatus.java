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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of the elastic IP (EIP) address.
 * </p>
 */
public class ElasticIpStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     */
    private String elasticIp;
    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * 
     * @param elasticIp
     *        The elastic IP (EIP) address for the cluster.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * 
     * @return The elastic IP (EIP) address for the cluster.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * 
     * @param elasticIp
     *        The elastic IP (EIP) address for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIpStatus withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
        return this;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * 
     * @param status
     *        The status of the elastic IP (EIP) address.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * 
     * @return The status of the elastic IP (EIP) address.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * 
     * @param status
     *        The status of the elastic IP (EIP) address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIpStatus withStatus(String status) {
        setStatus(status);
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
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticIpStatus == false)
            return false;
        ElasticIpStatus other = (ElasticIpStatus) obj;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ElasticIpStatus clone() {
        try {
            return (ElasticIpStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
