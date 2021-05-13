package dankira;

import java.util.ArrayList;

public class album
{
    private int counter;
    private String name,date;
    ArrayList <music> musics;

    public album(int counter, String name, String date, ArrayList<music> musics) {
        this.counter = counter;
        this.name = name;
        this.date = date;
        this.musics = musics;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<music> getMusics() {
        return musics;
    }

    public void setMusics(ArrayList<music> musics) {
        this.musics = musics;
    }
            
}
