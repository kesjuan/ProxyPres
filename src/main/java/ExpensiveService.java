import java.util.Random;

public class ExpensiveService implements IProxyInterface{
    // ! Expensive service or Object
    private String contactName;

    public ExpensiveService(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public int getNumberOfMessages() {
        Random rd = new Random();
        // ! generating random number
        int num = (int) (rd.nextInt() * Math.ceil(rd.nextInt()));
        return num;
    }
    public void deleteMessages(String contactName){

        for (int i = 0; i < getNumberOfMessages(); i++) {
            // ! Filler method just to show proxy can not access it
        }
    }
}
