package ghostbusters.asturias.model;

public class Ghost {

    private int id;
    private String ghostName;
    private String ghostClass;
    private String dangerLevel;
    private String captureDate;
    private String specialAbility;
    private String ghostAfinity;

    public Ghost(int id, String ghostName, String ghostClass, String dangerLevel, String captureDate, String specialAbility, String ghostAfinity) {
        this.id = id;
        this.ghostName = ghostName;
        this.ghostClass = ghostClass;
        this.dangerLevel = dangerLevel;
        this.captureDate = captureDate;
        this.specialAbility = specialAbility;
        this.ghostAfinity = ghostAfinity;
    }

    public int getId() {
        return id;
    }
    public String getGhostName() {
        return ghostName;
    }
    public String getGhostClass() {
        return ghostClass;
    }
    public String getDangerLevel() {
        return dangerLevel;
    }
    public String getCaptureDate() {
        return captureDate;
    }
    public String getSpecialAbility() {
        return specialAbility;
    }
    public String getGhostAfinity() {
        return ghostAfinity;
    }
}

