class Mythread extends Thread{
    public void run() {
        System.out.println("This is running ...");
    }
    public static void main(String args[]){
        Mythread t1 = new Mythread();
        t1.start(); //start the thread
    }
}
