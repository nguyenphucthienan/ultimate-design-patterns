package command.command;

import command.command.framework.Button;
import command.command.framework.Command;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Command addCustomerCommand = new AddCustomerCommand(customerService);
        Button button = new Button(addCustomerCommand);
        button.click();
    }
}
