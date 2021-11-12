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
public class NVGiaoHang extends NhanVien{
    private int id ;
    private String khuVucGiao;
    private String bienSoXe;
    

    public NVGiaoHang(String khuVucGiao, String bienSoXe, String maNV, String hoTen, String SDT, int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(maNV, hoTen, SDT, id, taiKhoan, matKhau, email, vaiTro);
        this.khuVucGiao = khuVucGiao;
        this.bienSoXe = bienSoXe;
    }

    public NVGiaoHang(String khuVucGiao, String bienSoXe, int id, String taiKhoan, String matKhau, String email, String vaiTro) {
        super(id, taiKhoan, matKhau, email, vaiTro);
        this.khuVucGiao = khuVucGiao;
        this.bienSoXe = bienSoXe;
    }

    public NVGiaoHang(String khuVucGiao, String bienSoXe) {
        this.khuVucGiao = khuVucGiao;
        this.bienSoXe = bienSoXe;
    }

    public NVGiaoHang(String khuVucGiao, String bienSoXe, String maNV, String hoTen, String SDT) {
        super(maNV, hoTen, SDT);
        this.khuVucGiao = khuVucGiao;
        this.bienSoXe = bienSoXe;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKhuVucGiao() {
        return khuVucGiao;
    }

    public void setKhuVucGiao(String khuVucGiao) {
        this.khuVucGiao = khuVucGiao;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }
    
    
}
