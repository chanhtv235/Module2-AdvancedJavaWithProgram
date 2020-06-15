package part22_structural_design_partten.Proxy;

public class FileDownloader implements Downloader {
    String URL;
    public void URLconnect(String URL){
        this.URL=URL;
    }
    @Override
    public void download() {
        URLconnect(URL);
        System.out.println("Downloading");
    }
}
