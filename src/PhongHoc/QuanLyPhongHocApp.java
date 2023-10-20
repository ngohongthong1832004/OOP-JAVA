package PhongHoc;

import java.util.List;

public class QuanLyPhongHocApp {
    public static void main(String[] args) {
        QuanLyPhongHoc quanLy = new QuanLyPhongHoc();

        PhongLyThuyet phongLyThuyet = new PhongLyThuyet("LT001", "Nhà A", 60.0, 6, true);
        PhongMayTinh phongMayTinh = new PhongMayTinh("MT001", "Nhà B", 70.0, 8, 30);
        PhongThiNghiem phongThiNghiem = new PhongThiNghiem("TN001", "Nhà C", 80.0, 10, "Hóa học", 20, true);

        quanLy.themPhongHoc(phongLyThuyet);
        quanLy.themPhongHoc(phongMayTinh);
        quanLy.themPhongHoc(phongThiNghiem);

        List<PhongHoc> danhSachPhongHoc = quanLy.layDanhSachPhongHoc();
        for (PhongHoc phong : danhSachPhongHoc) {
            System.out.println("Mã phòng: " + phong.getMaPhong());
            System.out.println("Dãy nhà: " + phong.getDayNha());
            System.out.println("Diện tích: " + phong.getDienTich());
            System.out.println("Số bóng đèn: " + phong.getSoBongDen());

            if (phong instanceof PhongLyThuyet) {
                PhongLyThuyet lt = (PhongLyThuyet) phong;
                System.out.println("Có máy chiếu: " + lt.coMayChieu());
            } else if (phong instanceof PhongMayTinh) {
                PhongMayTinh mt = (PhongMayTinh) phong;
                System.out.println("Số máy tính: " + mt.getSoMayTinh());
            } else if (phong instanceof PhongThiNghiem) {
                PhongThiNghiem tn = (PhongThiNghiem) phong;
                System.out.println("Chuyên ngành: " + tn.getChuyenNganh());
                System.out.println("Sức chứa: " + tn.getSucChua());
                System.out.println("Có bồn rửa: " + tn.coBonRua());
            }

            System.out.println();
        }
    }
}






