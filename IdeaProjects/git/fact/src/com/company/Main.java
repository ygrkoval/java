package com.company;

/*Модифицировать класс Counter так, чтобы он циклически выводил
числа из определенного диапазона.*/

public class Main {
    public static class Counter extends Thread {
        int x = 8; //Начальное значение диапазона
        int y = 11; //Конечное значение диапазона
                    // ПО умолчанию.
        public Counter(int x, int y) {
            this.x  = x;
            this.y = y;

        }
        public Counter(){
        //Конструктор если запускать без параметров
        }

        public void run() {

            while (x <= y) { // условие завершения потока №1

                System.out.println(getId() + ": " + x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return; // условие завершения потока №2
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            Counter c = new Counter(10, 16); //задаем начало и конец диапазона.
            c.start(); // запускаем поток

        } catch (Exception e) {
            ;
        }
    }}