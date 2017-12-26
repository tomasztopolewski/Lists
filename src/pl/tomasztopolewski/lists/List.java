package pl.tomasztopolewski.lists;

public class List {
    private static String name;
    private static String date;
    private static String content;


    public List(String name, String date, String content) {
        this.setName(name);
        this.setDate(date);
        this.setContent(content);
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

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
