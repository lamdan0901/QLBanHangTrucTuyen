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
public class NVQuanLy extends NhanVien{
    private int id ;
    private String khuVucQuanLy;

    public NVQuanLy(int id, String khuVucQuanLy, String maNV, String hoTen, String SDT, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(maNV, hoTen, SDT, id, taiKhoan, matKhau, email, vaiTro);
        this.id = id;
        this.khuVucQuanLy = khuVucQuanLy;
    }

    public NVQuanLy(String khuVucQuanLy, int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
        this.id = id;
        this.khuVucQuanLy = khuVucQuanLy;
    }

    public String getKhuVucQuanLy() {
        return khuVucQuanLy;
    }

    public void setKhuVucQuanLy(String khuVucQuanLy) {
        this.khuVucQuanLy = khuVucQuanLy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
