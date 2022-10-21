import java.util.Random;

public class ExpensiveService implements IProxyInterface{
    // ! Expensive service or Object
    private String contactName;

    public ExpensiveService(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public void getNumberOfMessages() {
        Random rd = new Random();
        // ! generating random number
        int num = (int)  Math.ceil (rd.nextInt());
        if (num < 0){
            getNumberOfMessages();
        }
        if (num > 0) {
            System.out.println("The number of messages you have with " + contactName + " is " + num);
        }
    }
    public void deleteMessages(String contactName){

        for (int i = 0; i < 35; i++) {
            // ! Filler method just to show proxy can not access it
        }
    }
}
