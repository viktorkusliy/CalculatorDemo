package ru.kusliyva.calculator;

/**
 * Класс реализует сложение множества параметров
 */
public class Calculate {
    private int result;

    /**
     * Метод сложения
     * @param params аргументы суммирования
     */
    public void addition(int...params){
        for(Integer param : params){
            this.result += param;
        }
    }

    /**
     * Метод получения результата
     * @return возвращает результат
     */
    public int getResult(){
        return this.result;
    }

    /**
     * Метод очищения результата
     */
    public void cleanResult(){
        this.result = 0;
    }
}
