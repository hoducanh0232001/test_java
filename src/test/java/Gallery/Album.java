package Gallery;

import java.util.List;

public class Album {
    private int id;
    private String name;
    private String date;
    private List<Media> medialist;

    public Album(int id, String name, String date,List<Media> medialist) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.medialist = medialist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Media> getMedialist() {
        return medialist;
    }

    public void setMedialist(List<Media> medialist) {
        this.medialist = medialist;
    }

    public void addMedia(Media media){
        medialist.add(media);
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", medialist='" + medialist + '\'' +
                '}';
    }
}
