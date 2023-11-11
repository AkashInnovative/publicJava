class MyThread extends Thread{
    public void run(){
        System.out.println("Child thread example");
    }
}

public class childtHread {
    public static void main(String[]args){
        MyThread t=new MyThread();
        t.start();
    }
}
