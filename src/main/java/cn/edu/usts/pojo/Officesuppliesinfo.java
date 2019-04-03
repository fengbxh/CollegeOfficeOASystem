package cn.edu.usts.pojo;

import java.util.Date;

public class Officesuppliesinfo {
    private Integer id;

    private String officesuppliesName;

    private String officesuppliesCount;

    private Date procurementDate;

    private Integer buyerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfficesuppliesName() {
        return officesuppliesName;
    }

    public void setOfficesuppliesName(String officesuppliesName) {
        this.officesuppliesName = officesuppliesName == null ? null : officesuppliesName.trim();
    }

    public String getOfficesuppliesCount() {
        return officesuppliesCount;
    }

    public void setOfficesuppliesCount(String officesuppliesCount) {
        this.officesuppliesCount = officesuppliesCount == null ? null : officesuppliesCount.trim();
    }

    public Date getProcurementDate() {
        return procurementDate;
    }

    public void setProcurementDate(Date procurementDate) {
        this.procurementDate = procurementDate;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }
}