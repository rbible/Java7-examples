package org.sewatech.java7.nio2;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author alexis
 * @Message 获取文件及文件夹
 */
public class Directories {

    public static void main(String... args) throws Exception {
        Path homePath = Paths.get(System.getProperty("user.home"));
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(homePath)) {
            for (Path entry : stream) {
                // System.out.println(entry);
            }
        }
        System.out.println("********************************");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(homePath, "*.{java,xml}")) {
            for (Path entry : stream) {
                System.out.println(entry);
            }
        }
        System.out.println("********************************");
        Files.walkFileTree(Paths.get(".").normalize(), new PathMatcherVisitor("glob:**/*.java"));
    }

}
