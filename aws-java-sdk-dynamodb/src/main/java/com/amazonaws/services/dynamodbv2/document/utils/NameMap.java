/*
 * Copyright 2014-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.document.utils;


/**
 * Utility class for name maps.
 */
public class NameMap extends FluentHashMap<String, String> {
    private static final long serialVersionUID = 1L;

    /**
     * Fluent method to sets the given key (attribute name place holder) to the
     * specified value (the actual attribute name.)
     */
    public NameMap with(String key, String value) {
        super.put(key, value);
        return this;
    }
}
