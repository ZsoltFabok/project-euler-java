package project_euler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataFile {
    public List<String> loadFile(String filename) {
        List<String> content = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException exception) {
            // unable to read data file, let the content be empty
        }
        return content;
    }

    public List<String> loadData(String data) {
        return loadFile("data/" + data + ".txt");
    }

    public List<List<Integer>> loadNumbers(String data) {
        return new DataFile().loadData(data).stream()
                .map(Collections::toIntegerList).toList();
    }
}
