public class BlogPost {

    public final String type;
    public final String author;
    public final Integer value;

    public BlogPost(String type, String author, Integer value) {
        this.type = type;
        this.author = author;
        this.value = value;
    }

    public String getType() {
        return type;
    }
}
