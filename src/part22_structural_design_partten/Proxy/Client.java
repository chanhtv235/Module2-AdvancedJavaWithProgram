package part22_structural_design_partten.Proxy;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy =new FileDownloaderProxy();
        fileDownloaderProxy.download();
    }
}
