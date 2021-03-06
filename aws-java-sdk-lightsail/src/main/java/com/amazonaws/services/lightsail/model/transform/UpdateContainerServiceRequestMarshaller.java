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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateContainerServiceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateContainerServiceRequestMarshaller {

    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceName").build();
    private static final MarshallingInfo<String> POWER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("power").build();
    private static final MarshallingInfo<Integer> SCALE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scale").build();
    private static final MarshallingInfo<Boolean> ISDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isDisabled").build();
    private static final MarshallingInfo<Map> PUBLICDOMAINNAMES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicDomainNames").build();

    private static final UpdateContainerServiceRequestMarshaller instance = new UpdateContainerServiceRequestMarshaller();

    public static UpdateContainerServiceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateContainerServiceRequest updateContainerServiceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateContainerServiceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateContainerServiceRequest.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(updateContainerServiceRequest.getPower(), POWER_BINDING);
            protocolMarshaller.marshall(updateContainerServiceRequest.getScale(), SCALE_BINDING);
            protocolMarshaller.marshall(updateContainerServiceRequest.getIsDisabled(), ISDISABLED_BINDING);
            protocolMarshaller.marshall(updateContainerServiceRequest.getPublicDomainNames(), PUBLICDOMAINNAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
