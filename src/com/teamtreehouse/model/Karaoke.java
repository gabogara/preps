package com.teamtreehouse.model;

public class Karaoke {
    public static void main(String[] args) {
        Song song = new Song("Michael Jackson","Beat It","https://www.youtube.com/watch?v=oRdxUFDoQe0&list=RDoRdxUFDoQe0&start_radio=1");
        SongBook songBook = new SongBook();
        System.out.printf("Adding: %s%n", song);
        songBook.addSong(song);
        System.out.printf("There are: %d song(s).%n", songBook.getSongCount());
    }
}
