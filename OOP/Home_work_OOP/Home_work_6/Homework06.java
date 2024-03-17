import java.util.UUID;

public class Homework06 {

    public interface ReportGenerator {
        Report generate(Document document);
    }

    public class PdfReportGenerator implements ReportGenerator {
        public Report generate(Document document) {
            // Логика формирования PDF-отчета на основе документа
            // ...
            byte[] reportData = // Генерация PDF-отчета
            return new Report(reportData);
        }
    }

    public class JsonReportGenerator implements ReportGenerator {
        public Report generate(Document document) {
            // Логика создания JSON-отчета на основе документа
            // ...
            byte[] reportData = // Генерация JSON-отчета
            return new Report(reportData);
        }
    }

    public class XmlReportGenerator implements ReportGenerator {
        public Report generate(Document document) {
            // Логика создания XML-отчета на основе документа
            // ...
            byte[] reportData = // Генерация XML-отчета
            return new Report(reportData);
        }
    }

    public class ReportEntrypoint {
        private Map<String, ReportGenerator> reportGenerators;

        public ReportEntrypoint() {
            reportGenerators = new HashMap<>();
            // Регистрация генераторов отчетов для каждого типа
            reportGenerators.put("pdf", new PdfReportGenerator());
            reportGenerators.put("json", new JsonReportGenerator());
            reportGenerators.put("xml", new XmlReportGenerator());
            // Другие генераторы отчетов можно добавить здесь
        }

        public Report create(Document document, String reportType) {
            ReportGenerator generator = reportGenerators.get(reportType.toLowerCase());
            if (generator != null) {
                return generator.generate(document);
            } else {
                throw new IllegalArgumentException("Unsupported report type: " + reportType);
            }
        }
    }

    public class Document {
        private UUID id;
        private String number;
        // ...

        // Конструктор, геттеры, сеттеры и другие методы
    }

    public class Report {
        private byte[] data;

        public Report(byte[] data) {
            this.data = data;
        }

        // Геттеры, сеттеры и другие методы
    }

    public static void main(String[] args) {
        // Пример использования
        Homework homework = new Homework();
        Document document = homework.new Document();
        // Задание свойств документа

        ReportEntrypoint entrypoint = homework.new ReportEntrypoint();
        Report pdfReport = entrypoint.create(document, "pdf");
        Report jsonReport = entrypoint.create(document, "json");
        Report xmlReport = entrypoint.create(document, "xml");
    }
}


/**
 * Чтобы добавить новый тип отчета, необходимо:
1. Добавить новый блок if-else в метод create с проверкой типа отчета.
2. Реализовать логику генерации отчета нужного типа в соответствующем методе (например, generateCsvReport, 
generateExcelReport и т.д.).
3. Добавить вызов нового метода генерации отчета в блок if-else в методе create.

Если типов отчетов будет много (1000+), то можно использовать паттерн "Стратегия" для более удобного 
добавления новых типов отчетов. В этом случае, каждый тип отчета будет представлен отдельным классом, 
реализующим общий интерфейс или абстрактный класс для генерации отчета. Метод create будет использовать 
фабрику для создания конкретного объекта генерации отчета на основе переданного типа. Это позволит сделать 
код более гибким и расширяемым.
 */
