package task6.work6.src.work2;

public interface ReportGenerator {
    String generateXml();

    String generateJson();



    public default String generateXml(String reports) {
        String report = reports;
        // todo Logic
        return report;
    }


    public default String generateJson(String reports) {
        String report = reports;
        // todo Logic
        return report;
    }
}
