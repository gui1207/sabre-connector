package org.mule.modules.sabre.automation.runner;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@IncludeCategory(SabreConnectorTestSuite.class)

@SuiteClasses({
    FunctionalTestSuite.class,
    SystemTestSuite.class
})
public class SabreConnectorTestSuite {

}
