import Account.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    Account account;
    double balance;


    @Given("account balance is {double}")
    public void givenAccountBalance(double initialBalance) {
        account = new Account(initialBalance);
    }

    @When("the account is credited with {double}")
    public void the_account_is_credited_with(double deposit) {
        balance = account.add(deposit);

    }
    @Then("account should have a balance of {double}")
    public void account_should_have_a_balance_of(double deposit) {
        Assertions.assertEquals(balance, deposit);
        //throw new io.cucumber.java.PendingException();
    }

}