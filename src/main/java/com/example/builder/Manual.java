package main.java.com.example.builder;

public class Manual {
    private String content;

    public Manual() {
        this.content = "";
    }

    public void append(String text) {
        this.content += text + "\n";
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "content='" + content + '\'' +
                '}';
    }
}
