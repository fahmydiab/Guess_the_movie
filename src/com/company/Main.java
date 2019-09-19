package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get("film.txt"))) {
            result = lines.collect(Collectors.toList());
        }

        int rand = (int) ((Math.random() * result.size()) + 1);
        String movie = result.get(rand);
        Game game = new Game();
        game.Start(movie);



    }
}
