package org.example;

public class WiseSaying {
    private int id;
    private String content;
    private String name;

    public WiseSaying(int id, String content, String name) {
        this.id = id;
        this.content = content;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
