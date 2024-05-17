package org.example.compareTo;

public class Level implements Comparable<Level>{

    private long id;
    private String levelName;
    private String level;
    private String description;

    public Level(String levelName, String level, String description) {
        this.levelName = levelName;
        this.level = level;
        this.description = description;
    }

    public String getLevelName() {
        return levelName;
    }

    public String getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Level o) {
        return this.levelName.compareTo(o.levelName);
    }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", levelName='" + levelName + '\'' +
                ", level='" + level + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
