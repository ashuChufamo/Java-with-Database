package dankira;
public class music 
{
    private String Title,gener;
    private int counter;
    private double duration;

    public music(String Title, String gener, int counter, double duration) {
        this.Title = Title;
        this.gener = gener;
        this.counter = counter;
        this.duration = duration;
    }
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
       
}
