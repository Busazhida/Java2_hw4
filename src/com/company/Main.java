package com.company;

public class Main {

    public static void main(String[] args) {
        try {

            for (int i = 1; i <= 5; i++) {

                Runners runners = new Runners("Runner " + i);
                runners.setRunnerNext(i+1);
                runners.setNum(0);

                runners.start();

                runners.join();
            }
            for (int i = 5; i > 1; i--) {

                Runners runners = new Runners("Runner " + i);
                runners.setRunnerNext(i-1);
                runners.setNum(1);

                runners.start();

                runners.join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
