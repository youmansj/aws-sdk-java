/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;


/**
 * Hadoop Jar Step Config JSON Unmarshaller
 */
public class HadoopJarStepConfigJsonUnmarshaller implements Unmarshaller<HadoopJarStepConfig, JsonUnmarshallerContext> {

    

    public HadoopJarStepConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        HadoopJarStepConfig hadoopJarStepConfig = new HadoopJarStepConfig();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Properties", targetDepth)) {
                    hadoopJarStepConfig.setProperties(new ListUnmarshaller<KeyValue>(KeyValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Jar", targetDepth)) {
                    context.nextToken();
                    hadoopJarStepConfig.setJar(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MainClass", targetDepth)) {
                    context.nextToken();
                    hadoopJarStepConfig.setMainClass(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Args", targetDepth)) {
                    hadoopJarStepConfig.setArgs(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return hadoopJarStepConfig;
    }

    private static HadoopJarStepConfigJsonUnmarshaller instance;
    public static HadoopJarStepConfigJsonUnmarshaller getInstance() {
        if (instance == null) instance = new HadoopJarStepConfigJsonUnmarshaller();
        return instance;
    }
}
    