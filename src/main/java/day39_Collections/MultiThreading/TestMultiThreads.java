package day39_Collections.MultiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        thread1.start();
        thread2.start();    // ALL threads get executed concurrently - MultiThreading
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
