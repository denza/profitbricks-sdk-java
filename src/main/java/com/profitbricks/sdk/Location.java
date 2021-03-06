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
import com.profitbricks.rest.domain.Locations;
import java.io.IOException;

/**
 * @author jasmin@stackpointcloud.com
 *
 */
public class Location extends ProfitbricksAPIBase {

    public Location() throws Exception {
        super("locations", "");
    }
    
    /**
     *
     * Locations represent regions where you can provision your Virtual Data Centers.
     *
     * @return Locations
     */
    public Locations getAllLocations() throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource).concat(depth), null, Locations.class);
    }

      /**
     * Retrieves the attributes of a given location.
     *
     * @param id The resource's unique identifier consisting of country/city.
     * @return Location object with properties and metadata
     */
    public com.profitbricks.rest.domain.Location getLocation(String id) throws RestClientException, IOException {
        return client.get(getUrlBase().concat(resource).concat("/").concat(id).concat(depth), null, com.profitbricks.rest.domain.Location.class);
    }
}
