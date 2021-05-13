package dankira;
public class artist 
{
    private String fname, lname, gender, biography;

    public artist(String fname, String lname, String gender, String biography) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.biography = biography;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
    
}