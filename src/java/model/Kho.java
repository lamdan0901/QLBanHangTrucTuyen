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
public class Kho {
    
    private int id;
    private SanPhamNhap sanPhamNhap;

    public Kho() {
    }

    public Kho(int id, SanPhamNhap sanPhamNhap) {
        this.id = id;
        this.sanPhamNhap = sanPhamNhap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SanPhamNhap getSanPhamNhap() {
        return sanPhamNhap;
    }

    public void setSanPhamNhap(SanPhamNhap sanPhamNhap) {
        this.sanPhamNhap = sanPhamNhap;
    }
    
    
}
