import java.util.*;
class Ex extends Exception  // подкласс от общего класса исключений
{
    private int Type;       // номер варианта исключения
    Ex(int a)                   // конструктор определяемого класса
    {
        Type = a;
    }

    public String toString() // перегрузка встроенного метода Exception перевода в строку сообщения
    {
        if(Type==2)
            return "Аргумент<0"; // Сообщение второго исключения
        else
            return "Аргумент=0"; // Сообщение первого исключения
    }
}