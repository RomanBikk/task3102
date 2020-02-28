package task3102;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<Path> filePaths = new ArrayList<>();
            filePaths = Files.walk(Paths.get(root))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());

        return filePaths.stream().map(Path::toString).collect(Collectors.toList());

    }

    public static void main(String[] args) {

    }
}
