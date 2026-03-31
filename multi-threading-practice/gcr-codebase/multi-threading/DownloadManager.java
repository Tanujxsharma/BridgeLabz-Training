import java.util.Random;
class FileDownloader extends Thread {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading file from: " + fileName);
          Random random = new Random();
        for(int i  = 0 ; i <= 100 ; i += 20) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(50 + random.nextInt(1000));  // Pause for 500 milliseconds 
			} catch (InterruptedException e) { 
				System.out.println(e); 
			} 
		}
    }
    
}
public class DownloadManager{
    public static void main(String[] args) throws InterruptedException {
        FileDownloader downloader1 = new FileDownloader("File 1");
        FileDownloader downloader2 = new FileDownloader("File 2");
        FileDownloader downloader3 = new FileDownloader("File 3");

        downloader1.start();
        downloader2.start();
        downloader3.start();

        downloader1.join();
        downloader2.join();
        downloader3.join();

        System.out.println("All downloads completed.");
    }
}