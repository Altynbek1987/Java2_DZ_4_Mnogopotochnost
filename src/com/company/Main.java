package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запуск марафона " + Thread.currentThread().getName());
        try {
            for (int i = 1; i <= 5; i++) {
                Runner runner = new Runner("Runner " + i);
                runner.setRunnerNext(i + 1);
                runner.setRunnerBack(0);
                runner.start();
                runner.join();
            }
            for (int i = 5; i > 1; i--) {
                Runner runner = new Runner("Runner " + i);
                runner.setRunnerNext(i - 1);
                runner.setRunnerBack(1);
                runner.start();
                runner.join();
            }
        } catch (Exception z) {
            System.out.println("Завершение марафона " + Thread.currentThread().getName());
        }
        System.out.println("Runner 1 берет палочку");
        System.out.println("Завершение марафона " + Thread.currentThread().getName());
    }
}
