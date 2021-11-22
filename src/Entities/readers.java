/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Proceed.interfaces;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author powpo
 */
public class readers implements Serializable,interfaces{
    private String madg;
    private String tendg;
    private String diachi;
    private int sdtdg;
    private String emaildg;
    private String gioitinh;
    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdtdg() {
        return sdtdg;
    }

    public void setSdtdg(int sdtdg) {
        this.sdtdg = sdtdg;
    }

    public String getEmaildg() {
        return emaildg;
    }

    public void setEmaildg(String gioitinh) {
        this.emaildg = emaildg;
    }
    
    public String getGioiTinh() {
        return gioitinh;
    }

    public void setGioiTinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public Object toObject() {
        return new Object[]{
            this.getMadg(),this.getTendg(),this.getDiachi(), this.getEmaildg(), this.getSdtdg()
        };

    }}