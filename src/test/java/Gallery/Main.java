package Gallery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

      //  Album album = new Album(1, "Album so 1", "2021", media);
       Media media = new Media(1, "Hello", "Ducanh", "4MB");
        // Media media2 = new Media(2,"Khong co gi","Ducanh","6MB");

        AlbumManage albumManage = new AlbumManage();
        albumManage.addMediaInListAlbum(1, media);

    }
}
