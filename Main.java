public class Main {
    public static void main(String[] args) {
        String path = "/home/myfile.txt";
        String path2 = "/home/myfile.zip";
        String path3 = "/home/myfile.doc";
        TextHandler Handler = new TextHandler("Text Handler");
        ZipHandler zipHandler = new ZipHandler("Zip Handler");
        Handler.setNextHandler(zipHandler);
        Handler.process(path);
        Handler.process(path2);
        Handler.process(path3);
    }
}