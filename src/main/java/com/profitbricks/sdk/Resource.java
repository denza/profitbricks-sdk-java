/*
 * Copyright (c) 2017, ProfitBricks GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. All advertising materials mentioning features or use of this software
 *    must display the following acknowledgement:
 *    This product includes software developed by the <organization>.
 * 4. Neither the name of the ProfitBricks nor the
 *    names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY ProfitBricks GmbH ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL ProfitBricks GmbH BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.profitbricks.sdk;

import com.profitbricks.rest.client.RestClientException;
import com.profitbricks.rest.domain.Resources;

import java.io.IOException;

/**
 * @author denis@stackpointcloud.com
 */
public class Resource extends ProfitbricksAPIBase {
    private String credentials;

    public Resource() throws Exception {
        super("um/resources", "");
    }

    /**
     * You can retrieve a list of all resources
     *
     * @return Servers object with a list of servers in the specified datacenter.
     */
    public Resources getAllResources() throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource)
                .concat(depth), null, Resources.class);
    }

    /**
     * You can retrieve a list of datacenters
     *
     * @return Servers object with a list of datacenters.
     */
    public Resources getAlldatacenterResources() throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource)
                .concat("/")
                .concat("datacenter")
                .concat(depth), null, Resources.class);
    }

    /**
     * You can retrieve a list of images
     *
     * @return Servers object with a list of images.
     */
    public Resources getAllImageResources() throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource)
                .concat("/")
                .concat("image")
                .concat(depth), null, Resources.class);
    }

    /**
     * You can retrieve a list of snapshots
     *
     * @return Servers object with a list of snapshots.
     */
    public Resources getAllSnapshotResources() throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource)
                .concat("/")
                .concat("snapshot")
                .concat(depth), null, Resources.class);
    }

    /**
     * You can retrieve a list of ipblocks
     *
     * @return Servers object with a list of ipblocks.
     */
    public Resources getAllIpblockResources() throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource)
                .concat("/")
                .concat("ipblock")
                .concat(depth), null, Resources.class);
    }
}
