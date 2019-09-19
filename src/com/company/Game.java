package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public void Start(String movie) {
        char[] movieUnderscored = new char[movie.length()];
        int o = 0;
        while (o < movie.length()) {
            movieUnderscored[o] = '_';
            if(movie.charAt(o)==' '){
                movieUnderscored[o]=' ';
            }
            o++;

        }
        int i =10;

        System.out.println("Guess the name of film");
        System.out.println("you have "+i+" tries");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> l=new ArrayList<Character>();
        
        System.out.println(movieUnderscored);
        System.out.println("Enter a character :");

        while (i >0){
            Character guess = scanner.next().charAt(0);
            if (l.contains(guess)){
                System.out.println("Already entered");
                continue;
            }
            l.add(guess);
            if(movie.contains(guess+"")){
                for (int y=0;y<movie.length(); y++){
                    if(movie.charAt(y)==guess){
                        movieUnderscored[y]=guess;
                    }
                }
            }
            else {
                i--;
            }
            if(movie.equals(String.valueOf(movieUnderscored))){
                System.out.println(movieUnderscored);
                System.out.println("You Won!!! ");
                break;
            }
            System.out.println(movieUnderscored);
            System.out.println(i+" tries remaining");
        }
        if(i==0){
            System.out.println("Game Over!");
        }
    }

}
