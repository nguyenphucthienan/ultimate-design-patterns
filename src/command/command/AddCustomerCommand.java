package command.command;

import command.command.framework.Command;

public class AddCustomerCommand implements Command {

    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
