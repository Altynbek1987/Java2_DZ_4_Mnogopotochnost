package com.company;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    private int runnerBack;
    private int runnerNext;

    public int getRunnerBack() {
        return runnerBack;
    }

    public void setRunnerBack(int runnerBack) {
        this.runnerBack = runnerBack;
    }

    public int getRunnerNext() {
        return runnerNext;
    }

    public void setRunnerNext(int runnerNext) {
        this.runnerNext = runnerNext;
    }

    @Override
    public void run() {
        try {
            if (getRunnerBack() == 0) {
                if (getRunnerNext() == 6) {
                    System.out.println(this.getName() + " Берет палочкку ");
                    System.out.println(this.getName() + " Бежит к" + " финишу");
                } else {
                    System.out.println(this.getName() + " Берет палочкку ");
                    System.out.println(this.getName() + " Бежит к" + " Runner " + getRunnerNext());
                }
            } else {
                if (getRunnerNext() != 4) {
                    System.out.println(this.getName() + " Берет палочкку ");
                    System.out.println(this.getName() + " Бежит к" + " Runner  " + getRunnerNext());
                } else {
                    System.out.println(this.getName() + " Бежит к" + " Runner " + getRunnerNext());
                }
            }
            sleep(1000);
        } catch (InterruptedException beg) {

        }
    }
}
