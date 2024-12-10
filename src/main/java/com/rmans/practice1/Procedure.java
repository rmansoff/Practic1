public class Procedure {
   
    private int number;
    private String name;
    private String date;
    private String responsiblePerson;
    private String room;

    
    // Конструктор
    public Procedure(int number, String name, String date, String responsiblePerson, String room) {
        this.number = number;
        this.name = name;
        this.date = date;
        this.responsiblePerson = responsiblePerson;
        this.room = room;
    }

    // Геттери
    public int getNumber() { return number; }
    public String getName() { return name; }
    public String getDate() { return date; }
    public String getResponsiblePerson() { return responsiblePerson; }
    public String getRoom() { return room; }

    // Перевизначення toString для зручного відображення
    @Override
    public String toString() {
        return number + ". " + name + " - " + responsiblePerson + " (Кабінет: " + room + ")";
    }
}
