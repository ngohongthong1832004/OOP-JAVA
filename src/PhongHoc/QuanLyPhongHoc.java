package PhongHoc;

import java.util.ArrayList;
import java.util.List;

class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public boolean themPhongHoc(PhongHoc phongHoc) {
        for (PhongHoc phong : danhSachPhongHoc) {
            if (phong.getMaPhong().equals(phongHoc.getMaPhong())) {
                return false;
            }
        }
        danhSachPhongHoc.add(phongHoc);
        return true;
    }

    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc phong : danhSachPhongHoc) {
            if (phong.getMaPhong().equals(maPhong)) {
                return phong;
            }
        }
        return null;
    }

    public List<PhongHoc> layDanhSachPhongHoc() {
        return danhSachPhongHoc;
    }
}
