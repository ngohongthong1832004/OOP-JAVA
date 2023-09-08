package tuan1;


public class TestHinhChuNhat {

    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat();
        h1.setChieuDai(22);
        h1.setChieuRong(12);
        System.out.println(h1);

        HinhChuNhat h2 = new HinhChuNhat(5, 11);
        System.out.println(h2);
    }
}
