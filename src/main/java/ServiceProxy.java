public class ServiceProxy implements IProxyInterface{
    // ! Controls access to original object
    // * Could be used to avoid using a bunch of system resources
    // ?
    private IProxyInterface serviceVar;
    private String contactName;


    public ServiceProxy(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public void getNumberOfMessages() {
        // * Lazy Initialization
        if(serviceVar == null){
            serviceVar = new ExpensiveService(contactName);
        }
        // * after processing this Passes request to service object
        serviceVar.getNumberOfMessages();
    }
}
