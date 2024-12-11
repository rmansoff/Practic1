public class ProcedureDTO {
    private String name; // Назва процедури
    private String startTime; // Час початку
    private String endTime; // Час закінчення

    // Конструктор
    public ProcedureDTO(String name, String startTime, String endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
