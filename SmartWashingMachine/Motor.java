public class Motor {
    private Thread m;
    public void rotate() {     
        m = new Thread(new MotorThread());     
        m.start(); 
    }
    public void stop(){
        m.interrupt();
        try{
            m.join();
        } catch(InterruptedException e){}
    }
}
