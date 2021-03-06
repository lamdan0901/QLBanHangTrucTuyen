/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DonNhap {
    
    private int id;
    private Date ngayNhap;
    private String tenNguoiNhap, sdtNguoiNhap, ghiChu;
    private NVQuanLy nvQuanLy;
    private ArrayList<SanPhamNhap> dsSanPhamNhap;

    public DonNhap() {
    }

    public DonNhap(int id, Date ngayNhap, String tenNguoiNhap, String sdtNguoiNhap, String ghiChu, NVQuanLy nvQuanLy, ArrayList<SanPhamNhap> dsSanPhamNhap) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.tenNguoiNhap = tenNguoiNhap;
        this.sdtNguoiNhap = sdtNguoiNhap;
        this.ghiChu = ghiChu;
        this.nvQuanLy = nvQuanLy;
        this.dsSanPhamNhap = dsSanPhamNhap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getTenNguoiNhap() {
        return tenNguoiNhap;
    }

    public void setTenNguoiNhap(String tenNguoiNhap) {
        this.tenNguoiNhap = tenNguoiNhap;
    }

    public String getSdtNguoiNhap() {
        return sdtNguoiNhap;
    }

    public void setSdtNguoiNhap(String sdtNguoiNhap) {
        this.sdtNguoiNhap = sdtNguoiNhap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NVQuanLy getNvQuanLy() {
        return nvQuanLy;
    }

    public void setNvQuanLy(NVQuanLy nvQuanLy) {
        this.nvQuanLy = nvQuanLy;
    }

    public ArrayList<SanPhamNhap> getDsSanPhamNhap() {
        return dsSanPhamNhap;
    }

    public void setDsSanPhamNhap(ArrayList<SanPhamNhap> dsSanPhamNhap) {
        this.dsSanPhamNhap = dsSanPhamNhap;
    }
    
    
    
}
