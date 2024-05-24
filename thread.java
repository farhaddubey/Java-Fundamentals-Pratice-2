// package thread.com;
class MyThread1 extends Thread{
    public void run() {
        while(true){
            System.out.println("My thread is Under Process.");
        }
    };
}
class MyThread2 extends Thread{
    public void run() {
        while(true){
            System.out.println("My thread 2 is Under Process.");
        }
    };
}
public class thread {
    public static void main(String[] args){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
        System.out.println("Threading in Java can perfom parrallel functions");
    }
    
}
