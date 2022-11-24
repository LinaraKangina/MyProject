package task_5;

public abstract class AbstractFigure {

    private String color;

    public AbstractFigure (String color){
        this.color = color;
    }

    public abstract double calculateArea ();
    public abstract void calculatePerimeter ();

}

    /*
    Task 5
Описать абстрактный класс фигура:
* класс имеет свойство цвет
* класс имеет нереализованное поведение рассчитать площадь
* класс имеет нереализованное поведение рассчитать периметр
     */

