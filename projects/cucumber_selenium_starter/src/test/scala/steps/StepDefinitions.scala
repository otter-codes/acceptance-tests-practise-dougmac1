package steps
import java.util

import collection.JavaConverters._
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.{By, WebElement}
import org.scalatest._
import support.Browser
class StepDefinitions extends ScalaDsl with EN with Matchers with Browser {


  Given("""^I am on the social care compliance homepage$"""){() =>
    go to "http://localhost:8550/apply-for-social-care-compliance-scheme/capacity-registering"
    find(cssSelector("h1")).get.text shouldBe "Which of these options best describes you?"
  }

  When("""^I choose the "Someone who pays for care directly" option$"""){() =>
    click on id("capacityRegistering.personalBudgetHolderDirect")
    click on id("submit")
  }

  When ("""^I choose the "An agent or representative of someone who pays for care directly" option$"""){() =>
    click on id("capacityRegistering.personalBudgetHolderAgent")
    click on id("submit")
  }

  When ("""^I choose the "A company that employs social care worker" option$"""){() =>
    click on id("capacityRegistering.companyEmployeeOrDirector")
    click on id("submit")
  }

  When ("""^I choose the "An agent or representative of a company that employs social care workers" option$"""){() =>
    click on id("capacityRegistering.companyAgent")
    click on id("submit")
  }

  When ("""^I choose the "Social care workers" option$"""){() =>
    click on id("capacityRegistering.socialCareWorkers")
    click on id("submit")
  }

  And("""^I enter my name as "(.+)"$"""){name: String =>
    webDriver.findElement(By.id("value")).sendKeys(name)
    webDriver.findElement(By.id("submit")).click()
    //    textField("value").value = name
    //    click on id("submit")
  }

  And("""^I enter the company as "(.+)"$"""){companyName: String =>
    webDriver.findElement(By.id("value")).sendKeys(companyName)
    webDriver.findElement(By.id("submit")).click()
    //    textField("value").value = name
    //    click on id("submit")
  }

  And("""^I enter my phone number as (.+)$"""){number: String =>
    webDriver.findElement(By.id("value")).sendKeys(number)
    webDriver.findElement(By.id("submit")).click()
  }

  And("""^I choose the "Yes" option$"""){() =>
    click on id("value-yes")
    click on id("submit")
  }

  And("""^I choose the "Continue" option$"""){() =>
    click on id("submit")
  }

  When("""^I enter my address as$"""){
    (table: DataTable) =>
      table.asMaps[String, String](classOf[String], classOf[String]).asScala.foreach(row => {

        webDriver.findElement(By.name(row.get("Field"))).sendKeys(row.get("Value"))


        //doSomething(row.get("Field"), row.get("Value"))
      })
      click on id("submit")
  }

  And("""^I choose the "No" option for email$"""){() =>
    click on id("value-no")
    click on id("submit")
  }

  And("""^I choose the "No" option for UTR$"""){() =>
    click on id("value-no")
    click on id("submit")
  }

  And("""^I choose the "No" option for PAYE$"""){() =>
    click on id("value-no")
    click on id("submit")
  }

  And("""^I will be shown my answers$"""){
    (table: DataTable) =>
      table.asMaps[String, String](classOf[String], classOf[String]).asScala.foreach(row => {

        webDriver.findElements(By.className("tabular-data__entry"))

      })
  }
}

