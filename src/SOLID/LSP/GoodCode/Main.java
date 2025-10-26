package SOLID.LSP.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile file) {
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WritableFile writeableFile = new WritableFile();
        writeableFile.read();
        writeableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writeableFile);
    }
}
