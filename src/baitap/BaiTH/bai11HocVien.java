package baitap.BaiTH;

import java.util.ArrayList;

class bai11HocVien {
    private String hoTen;
    private int namSinh;
    private int[] diemMonHoc;

    public bai11HocVien(String hoTen, int namSinh, int[] diemMonHoc) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMonHoc = diemMonHoc;
    }

    public double diemTrungBinh() {
        double sum = 0;
        for (int diem : diemMonHoc) {
            sum += diem;
        }
        return sum / diemMonHoc.length;
    }

    public boolean lamLuanVanTotNghiep() {
        if (diemTrungBinh() > 7) {
            for (int diem : diemMonHoc) {
                if (diem < 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean thiTotNghiep() {
        if (diemTrungBinh() <= 7) {
            for (int diem : diemMonHoc) {
                if (diem < 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean thiLai() {
        for (int diem : diemMonHoc) {
            if (diem < 5) {
                return true;
            }
        }
        return false;
    }

    public String getHoTen() {
        return hoTen;
    }	

    public static void main(String[] args) {
        ArrayList<bai11HocVien> danhSachHocVien = new ArrayList<>();

        danhSachHocVien.add(new bai11HocVien("Nguyen Van A", 1995, new int[] {8, 7, 9, 8, 6}));
        danhSachHocVien.add(new bai11HocVien("Tran Thi B", 1998, new int[] {7, 6, 7, 6, 5}));
        danhSachHocVien.add(new bai11HocVien("Le Van C", 1997, new int[] {5, 6, 7, 4, 8}));

        
        for (bai11HocVien hocVien : danhSachHocVien) {
            System.out.println("Hoc vien: " + hocVien.getHoTen());
            if (hocVien.lamLuanVanTotNghiep()) {
                System.out.println("Làm luận văn tốt nghiệp");
            } else if (hocVien.thiTotNghiep()) {
                System.out.println("Thi tốt nghiệp");
            } else if (hocVien.thiLai()) {
                System.out.println("Phải thi lại môn học");
            }
            System.out.println();
        }
    }
}
