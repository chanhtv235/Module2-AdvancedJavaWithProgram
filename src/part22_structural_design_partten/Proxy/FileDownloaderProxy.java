package part22_structural_design_partten.Proxy;

public class FileDownloaderProxy implements Downloader {
    @Override
    public void download() {
        FileDownloader fileDownloader =new FileDownloader();
        fileDownloader.URLconnect("UserAgent ");
        fileDownloader.download();
    }
}
