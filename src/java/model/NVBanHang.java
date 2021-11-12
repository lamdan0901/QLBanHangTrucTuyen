/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class NVBanHang extends NhanVien{
    private int id ;
    private String loaiSP;
    

    public NVBanHang(String loaiSP, String maNV, String hoTen, String SDT, int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(maNV, hoTen, SDT, id, taiKhoan, matKhau, email, vaiTro);
        this.loaiSP = loaiSP;
    }

    public NVBanHang(String loaiSP, int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
        this.loaiSP = loaiSP;
    }

    public NVBanHang(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public NVBanHang(String loaiSP, String maNV, String hoTen, String SDT) {
        super(maNV, hoTen, SDT);
        this.loaiSP = loaiSP;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
    
    
}
