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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details for the <code>ScheduleLambdaFunctionFailed</code> event.
 * </p>
 */
public class ScheduleLambdaFunctionFailedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon SWF ID of the AWS Lambda task.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient
     * permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.</note>
     */
    private String cause;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The unique Amazon SWF ID of the AWS Lambda task.
     * </p>
     * 
     * @param id
     *        The unique Amazon SWF ID of the AWS Lambda task.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique Amazon SWF ID of the AWS Lambda task.
     * </p>
     * 
     * @return The unique Amazon SWF ID of the AWS Lambda task.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique Amazon SWF ID of the AWS Lambda task.
     * </p>
     * 
     * @param id
     *        The unique Amazon SWF ID of the AWS Lambda task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionFailedEventAttributes withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     * 
     * @param name
     *        The name of the scheduled AWS Lambda function.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     * 
     * @return The name of the scheduled AWS Lambda function.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the scheduled AWS Lambda function.
     * </p>
     * 
     * @param name
     *        The name of the scheduled AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionFailedEventAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient
     * permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.</note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a>.
     * @see ScheduleLambdaFunctionFailedCause
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient
     * permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.</note>
     * 
     * @return The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *         purposes.</p> <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it
     *         lacked sufficient permissions. For details and example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *         Access to Amazon SWF Workflows</a>.
     * @see ScheduleLambdaFunctionFailedCause
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient
     * permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.</note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleLambdaFunctionFailedCause
     */

    public ScheduleLambdaFunctionFailedEventAttributes withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient
     * permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.</note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a>.
     * @see ScheduleLambdaFunctionFailedCause
     */

    public void setCause(ScheduleLambdaFunctionFailedCause cause) {
        this.cause = cause.toString();
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient
     * permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a>.</note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleLambdaFunctionFailedCause
     */

    public ScheduleLambdaFunctionFailedEventAttributes withCause(ScheduleLambdaFunctionFailedCause cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     *        scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing
     *        back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     *         scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing
     *         back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     *        scheduling of this AWS Lambda function. This information can be useful for diagnosing problems by tracing
     *        back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleLambdaFunctionFailedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCause() != null)
            sb.append("Cause: ").append(getCause()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleLambdaFunctionFailedEventAttributes == false)
            return false;
        ScheduleLambdaFunctionFailedEventAttributes other = (ScheduleLambdaFunctionFailedEventAttributes) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleLambdaFunctionFailedEventAttributes clone() {
        try {
            return (ScheduleLambdaFunctionFailedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
