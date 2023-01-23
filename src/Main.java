//18.11.2022
//Создать иерархию классов геометрических фигур
//Должны быть следующие классы
//Figure, Square, Circle, Triangle, Rectangle
//(Фигура, квадрат, круг, треугольник, прямоугольник)

//У каждой фигуры должен быть метод public void show(), который распечатывает сообщение, какая именно фигура, например, "I'm a square!"

//Создать каждую фигуру и вызвать метод.

public class Main {
    public static void main(String[] args){
        Figure figure = new Circle();
        figure.show();

        figure = new Rectangle();
        figure.show();

        figure = new Square();
        figure.show();

        figure = new Triangle();
        figure.show();
    }
}
