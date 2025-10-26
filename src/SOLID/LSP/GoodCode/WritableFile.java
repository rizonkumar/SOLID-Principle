package SOLID.LSP.GoodCode;

public class WritableFile extends ReadableFile implements Writeable {
    @Override
    public void write() {
        System.out.println("Writing to a file ....");
    }
}
