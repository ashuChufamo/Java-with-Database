package humanresorcemanagementsystem;
public class emploee implements emploeeList
{
    private String FName,LName, id, sex, position;

    
    
    public emploee(String FNname, String LName, String id, String sex, String position) {
        this.FName = FNname;
        this.LName = LName;
        this.id = id;
        this.sex = sex;
        this.position = position;
    }

    public String getFName() {
        return FName;
    }

    public void setFNname(String FNname) {
        this.FName = FNname;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
