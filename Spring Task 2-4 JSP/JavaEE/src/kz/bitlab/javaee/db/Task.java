package kz.bitlab.javaee.db;

public class Task {
    private Long id;

    private String name;
    private String description;
    private String deadLineDate;

    private String completeness;

    public Task(){

    }

    public Task(Long id, String name, String description, String deadLineDate, String completeness) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadLineDate = deadLineDate;
        this.completeness = completeness;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(String deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    public String getCompletness() {
        return completeness;
    }

    public void setCompletness(String completness) {
        this.completeness = completness;
    }
}
