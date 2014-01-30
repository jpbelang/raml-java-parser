/*
 * Copyright (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml;

import org.junit.Assert;
import org.junit.Test;
import org.raml.model.Raml;
import org.raml.parser.visitor.RamlDocumentBuilder;

public class EmptyConfigTestCase
{

    @Test
    public void emptyConfigTestCase()
    {
        String simpleTest = "";
        RamlDocumentBuilder builder = new RamlDocumentBuilder();
        Raml raml = builder.build(simpleTest, "");
        Assert.assertTrue(raml != null);
    }

}
