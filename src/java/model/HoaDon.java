/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private int id;
    private String ghiChu;
    private Date ngayThanhToan;
    private NVBanHang nvBanHang;
    private NVGiaoHang nvGiaoHang;
    private DonHang donHang;

    public HoaDon() {
    }

    public HoaDon(int id, String ghiChu, Date ngayThanhToan, NVBanHang nvBanHang, NVGiaoHang nvGiaoHang, DonHang donHang) {
        this.id = id;
        this.ghiChu = ghiChu;
        this.ngayThanhToan = ngayThanhToan;
        this.nvBanHang = nvBanHang;
        this.nvGiaoHang = nvGiaoHang;
        this.donHang = donHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public NVBanHang getNvBanHang() {
        return nvBanHang;
    }

    public void setNvBanHang(NVBanHang nvBanHang) {
        this.nvBanHang = nvBanHang;
    }

    public NVGiaoHang getNvGiaoHang() {
        return nvGiaoHang;
    }

    public void setNvGiaoHang(NVGiaoHang nvGiaoHang) {
        this.nvGiaoHang = nvGiaoHang;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }
    
    

}
