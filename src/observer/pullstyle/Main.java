package observer.pullstyle;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Spreadsheet spreadsheet1 = new Spreadsheet(dataSource);
        Spreadsheet spreadsheet2 = new Spreadsheet(dataSource);
        Chart chart = new Chart(dataSource);

        dataSource.addObserver(spreadsheet1);
        dataSource.addObserver(spreadsheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
