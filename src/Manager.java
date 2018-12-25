public class Manager implements Comparable<Manager> {

    protected String FIO;
    protected Integer Age;
    protected Boolean isGood;

    Manager() {
        FIO = "No name";	//
        Age = 0; //
        isGood = false;	//
    }

    public Manager(String FIO, Integer age, Boolean isGood) {
        this.FIO = FIO;
        this.Age = age;
        this.isGood = isGood;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }

    @Override
    public String toString() {
        return "FIO : " + FIO + ", age : " + Age + ", good : "+isGood;
    }

    /*@Override
    public int compareTo(String target) {
        return FIO.compareTo(target);
    }*/

    @Override
    public int compareTo(Manager target) {
        return FIO.compareTo(target.FIO);
    }
}
