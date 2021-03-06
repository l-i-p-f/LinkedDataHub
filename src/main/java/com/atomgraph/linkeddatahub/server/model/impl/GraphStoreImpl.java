/**
 *  Copyright 2019 Martynas Jusevičius <martynas@atomgraph.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.atomgraph.linkeddatahub.server.model.impl;

import com.atomgraph.core.MediaTypes;
import com.atomgraph.linkeddatahub.model.Service;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;

/**
 * LinkedDataHub Graph Store implementation.
 * We need to subclass the Core class because we're injecting a subclass of Service.
 * 
 * @author Martynas Jusevičius {@literal <martynas@atomgraph.com>}
 */
public class GraphStoreImpl extends com.atomgraph.core.model.impl.GraphStoreImpl
{
    
    public GraphStoreImpl(@Context Request request, @Context Service service, @Context MediaTypes mediaTypes)
    {
        super(request, service, mediaTypes);
    }
    
}
