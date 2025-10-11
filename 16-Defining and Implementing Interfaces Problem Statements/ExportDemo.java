interface DataExporter {
    void export();
    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class CSVExporter implements DataExporter {
    public void export() {
        System.out.println("Exported to CSV");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        DataExporter d = new CSVExporter();
        d.export();
        d.exportToJSON();
    }
}