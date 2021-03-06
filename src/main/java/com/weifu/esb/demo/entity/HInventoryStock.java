package com.weifu.esb.demo.entity;

import java.util.Date;

/**
 * ObjectOne对象
 *
 * @author chengfeng.tong@bosch-si.com
 * @date 2020-11-25
 */
public class HInventoryStock extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** OPL ID */
    private Integer id;

    private String matnr;
    private String bwkey;
    private String bklas;
    private String bismt;
    private String labst;
    private String speme;
    private String update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatnr() {
        return matnr;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }

    public String getBwkey() {
        return bwkey;
    }

    public void setBwkey(String bwkey) {
        this.bwkey = bwkey;
    }

    public String getBklas() {
        return bklas;
    }

    public void setBklas(String bklas) {
        this.bklas = bklas;
    }

    public String getBismt() {
        return bismt;
    }

    public void setBismt(String bismt) {
        this.bismt = bismt;
    }

    public String getLabst() {
        return labst;
    }

    public void setLabst(String labst) {
        this.labst = labst;
    }

    public String getSpeme() {
        return speme;
    }

    public void setSpeme(String speme) {
        this.speme = speme;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "HInventoryStock{" +
                "id=" + id +
                ", matnr='" + matnr + '\'' +
                ", bwkey='" + bwkey + '\'' +
                ", bklas='" + bklas + '\'' +
                ", bismt='" + bismt + '\'' +
                ", labst='" + labst + '\'' +
                ", speme='" + speme + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
