package Gallery;

public class Media{
    protected int idMedia;
    protected String nameMedia;
    protected String categoryMedia;
    protected String sizeMedia;

    public Media(int idMedia, String nameMedia, String categoryMedia, String sizeMedia) {
        this.idMedia = idMedia;
        this.nameMedia = nameMedia;
        this.categoryMedia = categoryMedia;
        this.sizeMedia = sizeMedia;
    }

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public String getNameMedia() {
        return nameMedia;
    }

    public void setNameMedia(String nameMedia) {
        this.nameMedia = nameMedia;
    }

    public String getCategoryMedia() {
        return categoryMedia;
    }

    public void setCategoryMedia(String categoryMedia) {
        this.categoryMedia = categoryMedia;
    }

    public String getSizeMedia() {
        return sizeMedia;
    }

    public void setSizeMedia(String sizeMedia) {
        this.sizeMedia = sizeMedia;
    }

    @Override
    public String toString() {
        return "Media{" +
                "idMedia=" + idMedia +
                ", nameMedia='" + nameMedia + '\'' +
                ", categoryMedia='" + categoryMedia + '\'' +
                ", sizeMedia='" + sizeMedia + '\'' +
                '}';
    }
}
