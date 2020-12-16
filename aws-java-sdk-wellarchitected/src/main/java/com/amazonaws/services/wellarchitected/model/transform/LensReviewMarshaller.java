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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LensReviewMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LensReviewMarshaller {

    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<String> LENSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LensVersion").build();
    private static final MarshallingInfo<String> LENSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensName").build();
    private static final MarshallingInfo<String> LENSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LensStatus").build();
    private static final MarshallingInfo<List> PILLARREVIEWSUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PillarReviewSummaries").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<Map> RISKCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RiskCounts").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final LensReviewMarshaller instance = new LensReviewMarshaller();

    public static LensReviewMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LensReview lensReview, ProtocolMarshaller protocolMarshaller) {

        if (lensReview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lensReview.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(lensReview.getLensVersion(), LENSVERSION_BINDING);
            protocolMarshaller.marshall(lensReview.getLensName(), LENSNAME_BINDING);
            protocolMarshaller.marshall(lensReview.getLensStatus(), LENSSTATUS_BINDING);
            protocolMarshaller.marshall(lensReview.getPillarReviewSummaries(), PILLARREVIEWSUMMARIES_BINDING);
            protocolMarshaller.marshall(lensReview.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(lensReview.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(lensReview.getRiskCounts(), RISKCOUNTS_BINDING);
            protocolMarshaller.marshall(lensReview.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
