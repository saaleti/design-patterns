package com.designpatterns.behavioral.iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PlayList implements SongIterable {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        songs.add(song);
    }

    @Override
    public SongIterator iterator() {
        return new itr();
    }

    private class itr implements SongIterator {
        /*
         Used collections iterator to avoid reinventing of wheel.
         */
       private Iterator<Song> iterator = songs.iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Song next() {
            return iterator.next();
        }
    }
}
