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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SetTimeBasedAutoScalingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     * </p>
     */
    private WeeklyAutoScalingSchedule autoScalingSchedule;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTimeBasedAutoScalingRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     * </p>
     * 
     * @param autoScalingSchedule
     *        An <code>AutoScalingSchedule</code> with the instance schedule.
     */

    public void setAutoScalingSchedule(WeeklyAutoScalingSchedule autoScalingSchedule) {
        this.autoScalingSchedule = autoScalingSchedule;
    }

    /**
     * <p>
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     * </p>
     * 
     * @return An <code>AutoScalingSchedule</code> with the instance schedule.
     */

    public WeeklyAutoScalingSchedule getAutoScalingSchedule() {
        return this.autoScalingSchedule;
    }

    /**
     * <p>
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     * </p>
     * 
     * @param autoScalingSchedule
     *        An <code>AutoScalingSchedule</code> with the instance schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTimeBasedAutoScalingRequest withAutoScalingSchedule(WeeklyAutoScalingSchedule autoScalingSchedule) {
        setAutoScalingSchedule(autoScalingSchedule);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAutoScalingSchedule() != null)
            sb.append("AutoScalingSchedule: ").append(getAutoScalingSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTimeBasedAutoScalingRequest == false)
            return false;
        SetTimeBasedAutoScalingRequest other = (SetTimeBasedAutoScalingRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAutoScalingSchedule() == null ^ this.getAutoScalingSchedule() == null)
            return false;
        if (other.getAutoScalingSchedule() != null && other.getAutoScalingSchedule().equals(this.getAutoScalingSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingSchedule() == null) ? 0 : getAutoScalingSchedule().hashCode());
        return hashCode;
    }

    @Override
    public SetTimeBasedAutoScalingRequest clone() {
        return (SetTimeBasedAutoScalingRequest) super.clone();
    }
}
