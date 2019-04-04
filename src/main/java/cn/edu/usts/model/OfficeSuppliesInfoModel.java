package cn.edu.usts.model;

import java.util.Date;

public class OfficeSuppliesInfoModel {
    private Integer id;

    private String officesuppliesName;

    private String officesuppliesCount;

    private Date procurementDate;

    private String unit;

    private String buyerName;

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }
}
