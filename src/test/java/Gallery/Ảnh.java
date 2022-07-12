package Gallery;

public class Ảnh extends Media{
    private String resolution;
    public Ảnh(int idMedia, String nameMedia, String categoryMedia, String sizeMedia , String resolution) {
        super(idMedia, nameMedia, categoryMedia, sizeMedia);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Ảnh{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
