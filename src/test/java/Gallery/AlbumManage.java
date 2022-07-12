package Gallery;

import java.util.List;
import java.util.Scanner;

public class AlbumManage {
    // thể tạo album, sửa tên album, hiển thị thông tin tất cả các album có trong danh sách,
    //thêm media vào một album nào đó, xóa media trong album nếu biết id media, xóa album nếu biết
    //mã album. Ngoài ra người dùng có thể tìm kiếm album theo tên, danh sách album sẽ được trả về
    //cho người dùng sau khi tìm kiếm.
    private List<Album> listAlbum;

    public AlbumManage() {
    }

    public AlbumManage(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }

    public void addAlbum(){
        Scanner sc = new Scanner(System.in);
        for(int x = 0; x < 2; x++){
            System.out.println("Nhập id: ");
            int mId = sc.nextInt();
            System.out.println("Nhập tên: ");
            String mName = sc.next();
            System.out.println("Nhập ngày: ");
            String mDate = sc.next();
            System.out.println("Nhập tên media: ");
            String mList = sc.next();
            listAlbum.add(new Album(mId,mName,mDate,mList));
        }
    }

    public void updateAlbum(Album album){
            for(int x = 0; x <listAlbum.size();x++){
                if(listAlbum.get(x).getId()==album.getId()){
                    listAlbum.remove(x);
                    listAlbum.add(album);
                }
            }
    }
    public void deleteAlbum(int album){
        for(int x= 0; x< listAlbum.size();x++){
            if(listAlbum.get(x).getId() == album){
                listAlbum.remove(x);
            }
        }
    }
    public void searchAlbum( int album){
        for(int x =0 ; x< listAlbum.size();x++){
            if(listAlbum.get(x).getId() == album){
                System.out.println(listAlbum.get(x));
            }
        }
    }

    public void addMediaInListAlbum(int idAlbum, Media media) {
        for (int i = 0; i <= listAlbum.size(); i++) {
            if (listAlbum.get(i).getId() == idAlbum) {
                listAlbum.get(i).getMedialist().add(media);
            }
        }

    }

    public void updateMediaInListAlbum(int idAlbum, int idMedia, Media media ) {
        for (int i = 0; i <= listAlbum.size(); i++) {
            if (listAlbum.get(i).getId() == idAlbum) {
                for(int j =0 ; j<= listAlbum.get(i).getMedialist().size();j++){
                    if (listAlbum.get(i).getMedialist().get(j).getIdMedia() == idMedia){
                        listAlbum.get(i).getMedialist().remove(j);
                        listAlbum.get(i).getMedialist().add(media);
                    }
                }
            }
        }

    }

    public void deleteMediaInListAlbum(int idAlbum, int idMedia ) {
        for (int i = 0; i <= listAlbum.size(); i++) {
            if (listAlbum.get(i).getId() == idAlbum) {
                for(int j =0 ; j<= listAlbum.get(i).getMedialist().size();j++){
                    if (listAlbum.get(i).getMedialist().get(j).getIdMedia() == idMedia){
                        listAlbum.get(i).getMedialist().remove(j);
                    }
                }
            }
        }

    }
    public void searchMediaInListAlbum(int idAlbum, int idMedia ) {
        for (int i = 0; i <= listAlbum.size(); i++) {
            if (listAlbum.get(i).getId() == idAlbum) {
                for(int j =0 ; j<= listAlbum.get(i).getMedialist().size();j++){
                    if (listAlbum.get(i).getMedialist().get(j).getIdMedia() == idMedia){
                        System.out.println(listAlbum.get(i).getMedialist().get(j));
                    }
                }
            }
        }


    }

}