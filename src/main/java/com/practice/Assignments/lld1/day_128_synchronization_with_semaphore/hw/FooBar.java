package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.hw;

import java.util.concurrent.Semaphore;

class Main{
    public static class FooBar {
        private int n;

        public FooBar(int n) {
            this.n = n;
        }
        Semaphore s = new Semaphore(1);
        Semaphore s1= new Semaphore(0);

        public  void foo(Runnable printFoo) throws InterruptedException {
            s.acquire();
            for (int i = 0; i < n; i++) {

                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                s1.release();
                Thread.sleep(1000);
            }
        }

        public synchronized void bar(Runnable printBar) throws InterruptedException {
            s1.acquire();
            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                s.release();
                Thread.sleep(1000);
            }
        }
    }
}
