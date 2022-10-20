public class Main {
    public static void main(String[] args) {
       // IProxyInterface serviceObject = new Service("Hellen");

        IProxyInterface newProxyObject = new ServiceProxy("John");
        // ! initialize the object using the interface and only the proxy methods will be available
        // ? Access original object through proxy object
        System.out.println(newProxyObject.getNumberOfMessages());
        //System.out.println(serviceObject.getNumberOfMessages());
    }
}
