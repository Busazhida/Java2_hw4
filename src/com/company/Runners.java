package com.company;

import java.util.TreeMap;


public class Runners extends Thread {

    int runnerNext;
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRunnerNext() {
        return runnerNext;
    }

    public void setRunnerNext(int runnerNext) {
        this.runnerNext = runnerNext;
    }

    public Runners(String name) {
        super(name);
    }


    public void run() {
        if (getNum() == 0) {
            System.out.println(this.getName() + " берет палочку");
            if (getRunnerNext() == 6) {
                System.out.println("Runner 5 бежит к финишу");
            } else {
                System.out.println(this.getName() + " бежит к Runner " + getRunnerNext());
            }
        } else {
            if (getRunnerNext() == 4) {
                System.out.println(this.getName() + " бежит к Runner " + getRunnerNext());
            } else {
                System.out.println(this.getName() + " берет палочку");
                System.out.println(this.getName() + " бежит к Runner " + getRunnerNext());
            }
            if (getRunnerNext() == 1){
                System.out.println("Runner " +getRunnerNext() + " берет палочку");
            }
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

