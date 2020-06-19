package template;

public class Main {

    public static void main(String[] args) {
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();

        GenerateReportTask generateReportTask=new GenerateReportTask();
        generateReportTask.execute();
    }
}
