public abstract class AbstractStudent {
    String fio;
    int age;
    long id;
    int knowledgeLevel;
    int energyLevel;

    AbstractStudent() {}
    public AbstractStudent (String fio, int age, long id, int knowledgeLevel, int energyLevel){
        this.fio = fio;
        this.age = age;
        this.id = id;
        this.knowledgeLevel = knowledgeLevel;
        this.energyLevel = energyLevel;
    }

    abstract void study (int hours);

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
