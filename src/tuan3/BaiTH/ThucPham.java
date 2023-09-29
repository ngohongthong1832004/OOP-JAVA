package tuan3.BaiTH;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    // Constructor có đầy đủ tham số
    public ThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        if (maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống");
        }
        this.maHang = maHang;
        this.tenHang = tenHang.isEmpty() ? "xxx" : tenHang;
        this.donGia = donGia < 0 ? 0 : donGia;
        this.ngaySanXuat = ngaySanXuat.isAfter(LocalDate.now()) ? LocalDate.now() : ngaySanXuat;
        this.ngayHetHan = ngayHetHan.isBefore(ngaySanXuat) ? ngaySanXuat : ngayHetHan;
    }

    // Constructor có tham số là mã hàng
    public ThucPham(String maHang) {
        this(maHang, "xxx", 0, LocalDate.now(), LocalDate.now());
    }

    // Getter cho mã hàng
    public String getMaHang() {
        return maHang;
    }

    // Getter và Setter cho tên hàng
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang.isEmpty() ? "xxx" : tenHang;
    }

    // Getter và Setter cho đơn giá
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia < 0 ? 0 : donGia;
    }

    // Getter và Setter cho ngày sản xuất
    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat.isAfter(LocalDate.now()) ? LocalDate.now() : ngaySanXuat;
    }

    // Getter và Setter cho ngày hết hạn
    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan.isBefore(ngaySanXuat) ? ngaySanXuat : ngayHetHan;
    }

    // Phương thức kiểm tra hàng thực phẩm đã hết hạn chưa
    public boolean daHetHan() {
        LocalDate currentDate = LocalDate.now();
        return ngayHetHan.isBefore(currentDate);
    }

    // Phương thức toString trả về chuỗi chứa thông tin của hàng thực phẩm
    public String toString(DecimalFormat df, DateTimeFormatter dtf) {
        String hetHan = daHetHan() ? "Đã hết hạn" : "Chưa hết hạn";
        return "Mã hàng: " + maHang + "\nTên hàng: " + tenHang + "\nĐơn giá: " + df.format(donGia)
                + "\nNgày sản xuất: " + ngaySanXuat.format(dtf) + "\nNgày hết hạn: " + ngayHetHan.format(dtf)
                + "\nTình trạng: " + hetHan;
    }

    public static void main(String[] args) {
        // Sử dụng lớp ThucPham
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.##");

        // Tạo một sản phẩm có mã hàng "123"
        ThucPham product1 = new ThucPham("123");
        System.out.println("Thông tin sản phẩm 1:");
        System.out.println(product1.toString(df, dtf));

        // Tạo một sản phẩm có đầy đủ thông tin
        LocalDate ngaySanXuat = LocalDate.now();
        LocalDate ngayHetHan = ngaySanXuat.plusDays(7); // 7 days later
        ThucPham product2 = new ThucPham("456", "Sữa", 3.5, ngaySanXuat, ngayHetHan);
        System.out.println("Thông tin sản phẩm 2:");
        System.out.println(product2.toString(df, dtf));
    }
}
