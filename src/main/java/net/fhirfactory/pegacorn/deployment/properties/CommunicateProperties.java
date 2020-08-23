/*
 * Copyright (c) 2020 MAHun
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.fhirfactory.pegacorn.deployment.properties;

import net.fhirfactory.pegacorn.common.model.FDN;
import net.fhirfactory.pegacorn.common.model.RDN;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CommunicateProperties {
    @Inject
    SystemWideProperties siteCommonProperties;

    private static final String COMMUNICATE_SUBSYSTEM_DEPLOYMENT_NAME = "Pegacorn-Communicate(R1.0.0-SNAPSHOT)";

    public String getCommunicateSubsystemDeploymentName(){
        return(COMMUNICATE_SUBSYSTEM_DEPLOYMENT_NAME);
    }

    public FDN getCommunicateSubsystemDeploymentInstanceID(){
        FDN newFDN = siteCommonProperties.getSystemDeploymentInstanceID();
        newFDN.appendRDN(new RDN(siteCommonProperties.getSubsystemQualifier(), getCommunicateSubsystemDeploymentName()));
        return(newFDN);
    }
}
