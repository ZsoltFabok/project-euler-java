package project_euler.math.prime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeRepository {
    private final String filename;
    private List<Long> cache;
    private int nextIndex;
    private boolean diskContentNeedsUpdate;

    public PrimeRepository(String filename) {
        this.filename = filename;
    }

    /** returns the next prime from the cache */
    public Long next() {
        loadCacheIfNecessary();
        if (nextIndex < cache.size()) {
            return cache.get(nextIndex++);
        } else {
            return null;
        }
    }

    /** restart next() */
    public void resetIteration() {
        nextIndex = 0;
    }

    public Long last() {
        return cache.get(cache.size() - 1);
    }

    public void add(Long prime) {
        markCacheToWriteToDisk();
        cache.add(prime);
    }

    private void markCacheToWriteToDisk() {
        if (!diskContentNeedsUpdate) {
            // FIXME inject
            Runtime.getRuntime().addShutdownHook(new Thread(() -> write(filename, cache)));
            diskContentNeedsUpdate = true;
        }
    }

    private void loadCacheIfNecessary() {
        if (cache == null) {
            cache = read(filename);
        }
    }

    private static List<Long> read(String filename) {
        List<Long> cache = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                cache.add(Long.parseLong(line));
            }
        } catch(IOException e) {
            // work with an empty cache
        }
        return cache;
    }

    private static void write(String filename, List<Long> entries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (Long entry : entries) {
                writer.write(Long.toString(entry));
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch(IOException e) {
            // shit happens
        }
    }

    public List<Long> getInRange(int start, int end) {
        loadCacheIfNecessary();
        return cache.stream().filter(i -> i >= start && i <= end).collect(Collectors.toList());
    }
}
