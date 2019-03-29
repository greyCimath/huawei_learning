// make a new thread

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        // make the second thread
        t = new Thread(this,"Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();              // start thread
    }

    // the second thread enterance
    public void run(){
        try{
            for(int i = 5;i > 0;i--){
                System.out.println("Child Thread: " + i);
                // stop the thread
                Thread.sleep(50);
            }
        } catch(InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}


public class ThreadDemo{
    public static void main(String args[]){
        new NewThread();
        try{
            for(int i = 5;i > 0;i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(100);
            }
        } catch(InterruptedException e){
            System.out.println("Main interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
