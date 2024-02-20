// A Class used to send a message
public class Sender {
    public void send(String msg){
        System.out.printf("Sending\t" + msg);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n" + msg + "Sent\n");
    }
}
