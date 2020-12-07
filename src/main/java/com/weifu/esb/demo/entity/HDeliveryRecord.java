package com.weifu.esb.demo.entity;

import org.springframework.stereotype.Service;

/**
 * ObjectTwo对象
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
@Service
public class HDeliveryRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** OPL ID */
    private Integer id;

    private String vbeln;
    private String posnr;
    private String matnr;
    private String lfimg;
    private String bwart;
    private String name1;
    private String erdat;
    private String wadat;
    private String aedat;
    private String wadat_ist;
    private String wbstk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVbeln() {
        return vbeln;
    }

    public void setVbeln(String vbeln) {
        this.vbeln = vbeln;
    }

    public String getPosnr() {
        return posnr;
    }

    public void setPosnr(String posnr) {
        this.posnr = posnr;
    }

    public String getMatnr() {
        return matnr;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }

    public String getLfimg() {
        return lfimg;
    }

    public void setLfimg(String lfimg) {
        this.lfimg = lfimg;
    }

    public String getBwart() {
        return bwart;
    }

    public void setBwart(String bwart) {
        this.bwart = bwart;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getErdat() {
        return erdat;
    }

    public void setErdat(String erdat) {
        this.erdat = erdat;
    }

    public String getWadat() {
        return wadat;
    }

    public void setWadat(String wadat) {
        this.wadat = wadat;
    }

    public String getAedat() {
        return aedat;
    }

    public void setAedat(String aedat) {
        this.aedat = aedat;
    }

    public String getWadat_ist() {
        return wadat_ist;
    }

    public void setWadat_ist(String wadat_ist) {
        this.wadat_ist = wadat_ist;
    }

    public String getWbstk() {
        return wbstk;
    }

    public void setWbstk(String wbstk) {
        this.wbstk = wbstk;
    }

    @Override
    public String toString() {
        return "ObjectTwo{" +
                "id=" + id +
                ", vbeln='" + vbeln + '\'' +
                ", posnr='" + posnr + '\'' +
                ", matnr='" + matnr + '\'' +
                ", lfimg='" + lfimg + '\'' +
                ", bwart='" + bwart + '\'' +
                ", name1='" + name1 + '\'' +
                ", erdat='" + erdat + '\'' +
                ", wadat='" + wadat + '\'' +
                ", aedat='" + aedat + '\'' +
                ", wadat_ist='" + wadat_ist + '\'' +
                ", wbstk='" + wbstk + '\'' +
                '}';
    }
}
