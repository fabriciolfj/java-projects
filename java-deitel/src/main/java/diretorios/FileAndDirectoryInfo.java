package diretorios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndDirectoryInfo {

    public static void main(String[] args) throws IOException {
        String input = "/home/spark/Documentos/test";
        String value = "Fabricio";

        Path path = Paths.get(input);

        if (Files.exists(path)) {
            System.out.println("File name " + path.getFileName());
            System.out.println("Absolute path " + (path.isAbsolute() ? " sim " : "not"));
            System.out.println("Data de modificação " + Files.getLastModifiedTime(path));
            System.out.println("Tamanho " + Files.size(path));

            if (Files.isDirectory(path)) {
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                directoryStream.forEach(p -> {
                    var ph = Paths.get(p.toUri());
                    try {
                        Files.readAllLines(ph)
                                .forEach(System.out::println);

                        Files.write(p, value.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ph);
                });

            }
        }

        System.out.printf("%s does not exists%\n", path);
    }
}
