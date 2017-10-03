/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre.automation.system;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.mule.api.ConnectionException;
import org.mule.modules.sabre.config.SabreConfig;
import org.mule.tools.devkit.ctf.configuration.util.ConfigurationUtils;

public class SabreConfigTestCase {
	
	private SabreConfig config;
	private Properties validCredentials;	
	private String clientId;
	private String clientSecret;
	
	@Before
    public void setup() throws Exception {
        validCredentials = ConfigurationUtils.getAutomationCredentialsProperties();
        clientId = validCredentials.getProperty("config.clientId");
        clientSecret = validCredentials.getProperty("config.clientSecret");
        config = new SabreConfig();
        config.setApiUrl(validCredentials.getProperty("config.apiUrl"));
    }
	
	@Test
    public void testValidCredentials() throws ConnectionException {
        config.connect(clientId, clientSecret);
        assertThat(config.isConnected(), equalTo(true));        
    }

    @Test(expected = ConnectionException.class)
    public void testInvalidCredentials() throws ConnectionException {
        config.connect("invalidClientId", "invalidClientSecret");
    }

    @Test(expected = ConnectionException.class)
    public void testEmptyCredentials() throws ConnectionException {
        config.connect("", "");
    }

    @Test(expected = ConnectionException.class)
    public void testNullCredentials() throws ConnectionException {
        config.connect(null, null);
    }
    
    @Test(expected = ConnectionException.class)
    public void testNullApiUrl() throws ConnectionException {
        config.setApiUrl(null);
        config.connect(clientId, clientSecret);
    }
    
    @Test(expected = ConnectionException.class)
    public void testEmptyApiUrl() throws ConnectionException {
        config.setApiUrl("");
        config.connect(clientId, clientSecret);
    }
    
    @Test(expected = ConnectionException.class)
    public void testInvalidyApiUrl() throws ConnectionException {
        config.setApiUrl("http://invalid.inv");
        config.connect(clientId, clientSecret);
    }

}
