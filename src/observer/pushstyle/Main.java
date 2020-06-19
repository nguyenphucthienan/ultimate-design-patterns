package observer.pushstyle;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Spreadsheet spreadsheet1 = new Spreadsheet();
        Spreadsheet spreadsheet2 = new Spreadsheet();
        Chart chart = new Chart();

        dataSource.addObserver(spreadsheet1);
        dataSource.addObserver(spreadsheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
