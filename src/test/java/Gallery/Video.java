package Gallery;

public class Video extends Media{
    private String time;
    public Video(int idMedia, String nameMedia, String categoryMedia, String sizeMedia, String time) {
        super(idMedia, nameMedia, categoryMedia, sizeMedia);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Video{" +
                "time='" + time + '\'' +
                '}';
    }
}
