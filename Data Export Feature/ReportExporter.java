public interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported report in JSON format.");
    }
}