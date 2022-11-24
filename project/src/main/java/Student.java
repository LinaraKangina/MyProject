import java.sql.SQLOutput;

public class Student extends AbstractStudent implements Restable {
    String fio;
    int age;
    long id;
    int knowledgeLevel;
    int energyLevel;

    //1-й конструктор
    Student(){}

    public Student(String fio, int age, long id, int knowledgeLevel, int energyLevel) {
        super(fio, age, id, knowledgeLevel, energyLevel);
    }
    public void setFio(String fioParam){
        fio = fioParam;
    }
    public String getFio(){
        return fio;
    }
    public static void main (String[] args) {
        //String fio = setFio ("Иванов");
        System.out.println();
    }

    public void study (int hours) {
        if (hours < 0){
            System.out.println("Количество часов не может быть отрицательным");
            return;
        }
        if (knowledgeLevel <= 0){
            System.out.println("Количество знаний не может быть отрицательным");
        }
        if (energyLevel <= 0){
            System.out.println("Нет энергии для учебы, отдохните");
            return;
        }
        if (knowledgeLevel >= 10){
            System.out.println("Максимальный уровень знаний! Обучение не требуется...");
            return;
        }
        for (int i = 0; i < hours; i++){
            if (energyLevel <= 0){
                System.out.println("Нет энергии для учебы. Отдохните...");
                break;
            }
            if (knowledgeLevel >= 10){
                System.out.println("Максимальный уровень знаний! Обучение не требуется...");
                break;
            }
            System.out.println(fio + " учиться...");
            knowledgeLevel++;
            energyLevel--;
        }
    }

    @Override
    public void rest (int hours) {
        if (hours < 0){
            System.out.println("Количество часов не может быть отрицательным");
            return;
        }
        if (knowledgeLevel <= 0){
            System.out.println("Количество знаний не может быть отрицательным");
        }
        if (energyLevel <= 0){
            System.out.println("Нет энергии для учебы, отдохните");
            return;
        }
        if (knowledgeLevel >= 10){
            System.out.println("Максимальный уровень знаний! Обучение не требуется...");
            return;
        }
        for (int i = 0; i < hours; i++){
            if (knowledgeLevel <= 0){
                System.out.println("Нет знаний. Учитесь...");
                break;
            }
            if (energyLevel >= 10){
                System.out.println("Максимальный уровень энергии!  Идите, учитесь...");
                break;
            }
            System.out.println(fio + " отдохни...");
            knowledgeLevel--;
            energyLevel++;
        }
    }
    void showInfo () {
        System.out.println("----------------------------");
        System.out.println("ФИО: " + fio);
        System.out.println("Идентификатор: " + id);
        System.out.println("Возраст: " + age);
        System.out.println("Уровень знаний: " + knowledgeLevel);
        System.out.println("Уровень энергии: " + energyLevel);
        System.out.println("----------------------------");
    }
}
