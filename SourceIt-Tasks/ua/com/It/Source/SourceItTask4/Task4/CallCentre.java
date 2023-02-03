import java.util.concurrent.Semaphore;

public class CallCentre {
    public static void main(String[] args) {
        Semaphore operator = new Semaphore(2);

        Clients client = new Clients();
        Clients client1 = new Clients();
        Clients client2 = new Clients();
        Clients client3 = new Clients();
        Clients client4 = new Clients();

        client.operator = operator;
        client1.operator = operator;
        client2.operator = operator;
        client3.operator = operator;
        client4.operator = operator;

        client.start();
        client1.start();
        client2.start();
        client3.start();
        client4.start();



    }


}
class Clients extends Thread{
    Semaphore operator;
    @Override
    public void run(){
        System.out.println(this.getName() + "waiting for operator ");
        try {
            operator.acquire();
            System.out.println(this.getName()+ " is being served ");
            this.sleep(1000);
            System.out.println(this.getName()+ " release the operator ");
            operator.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
