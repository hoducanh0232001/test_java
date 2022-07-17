package Gallery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Media media1 = new Media(1, "Hello", "DucAnh", "4MB");
       Media media2= new Media(2, "Goodbye", "AnhDuc", "6MB");
       Media media3= new Media(3, "OK", "Danh", "8MB");
       List<Media> listMedia1 = new ArrayList<>();
       listMedia1.add(media1);
       listMedia1.add(media2);
       listMedia1.add(media3);
        Media media4 = new Media(4, "Hello", "DucAnh", "4MB");
        Media media5= new Media(5, "Goodbye", "AnhDuc", "6MB");
        Media media6= new Media(6, "OK", "Danh", "8MB");
        List<Media> listMedia2 = new ArrayList<>();
        listMedia2.add(media4);
        listMedia2.add(media5);
        listMedia2.add(media6);
       Album album1 = new Album(321,"NewAlbum","20102010",listMedia1);
       Album album2 = new Album(456,"BigAlbum","21122021",listMedia2);
       List<Album> listAlbum = new ArrayList<>();
       AlbumManage albumManage1 = new AlbumManage(listAlbum);
       albumManage1.addAlbum(album1);
       albumManage1.addAlbum(album2);
       albumManage1.searchAlbum(456);
       albumManage1.deleteAlbum(321);
        // Media media2 = new Media(2,"Khong co gi","Ducanh","6MB");
        System.out.println(albumManage1);

    }
}
