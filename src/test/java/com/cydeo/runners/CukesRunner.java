package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish = true
        //tags = "@regression" // login.feature da hangi senaryoyu calistirmak istiyorsan onun tag yazmalisin.hangi tag yazdrrsan o calisir diger senaryolara etki etmez
                            // mesela iki testi calistrcaksan ve @smoke test yapmak istiyrsan smoke yazinca smoke test yazan senaryolar yazdirir
                            // @regression tags yazdrirsan tüm senaryoyu yazdzrr.

        //tags = "@admin or @student" login feature class gdip tek tek kontrol edip varsa, student ve admin bulup her ikisini execute yapr
        // tags = "@admin and @student" login feature class gdip ikisinin ayni senaryoda olursa execute yapr


)



public class CukesRunner {}
