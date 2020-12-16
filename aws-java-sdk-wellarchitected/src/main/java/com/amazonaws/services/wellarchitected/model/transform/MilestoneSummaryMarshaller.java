/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MilestoneSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MilestoneSummaryMarshaller {

    private static final MarshallingInfo<Integer> MILESTONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MilestoneNumber").build();
    private static final MarshallingInfo<String> MILESTONENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MilestoneName").build();
    private static final MarshallingInfo<java.util.Date> RECORDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> WORKLOADSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadSummary").build();

    private static final MilestoneSummaryMarshaller instance = new MilestoneSummaryMarshaller();

    public static MilestoneSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MilestoneSummary milestoneSummary, ProtocolMarshaller protocolMarshaller) {

        if (milestoneSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(milestoneSummary.getMilestoneNumber(), MILESTONENUMBER_BINDING);
            protocolMarshaller.marshall(milestoneSummary.getMilestoneName(), MILESTONENAME_BINDING);
            protocolMarshaller.marshall(milestoneSummary.getRecordedAt(), RECORDEDAT_BINDING);
            protocolMarshaller.marshall(milestoneSummary.getWorkloadSummary(), WORKLOADSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
