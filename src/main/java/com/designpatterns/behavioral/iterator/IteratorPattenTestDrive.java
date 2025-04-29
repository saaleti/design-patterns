package com.designpatterns.behavioral.iterator;

public class IteratorPattenTestDrive {
    public static void main(String[] args) {
        Song song1 = new Song("song1");
        Song song2 = new Song("song2");
        Song song3 = new Song("song3");
        PlayList playList = new PlayList();
        playList.addSong(song1);
        playList.addSong(song2);
        playList.addSong(song3);

        SongIterator songIterator = playList.iterator();
        while(songIterator.hasNext()){
            Song s = songIterator.next();
            System.out.println(s);
        }
    }
}
