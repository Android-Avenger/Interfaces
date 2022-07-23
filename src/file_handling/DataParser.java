package file_handling;

import java.io.FileNotFoundException;

public class DataParser {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "/home/tayyba/IdeaProjects/Shape/src/file_handling/sample.txt";
        EventEmitter emitter = new EventEmitter();
        emitter.test(filePath);
    }

}
