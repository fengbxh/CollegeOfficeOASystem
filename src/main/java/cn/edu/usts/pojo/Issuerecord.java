package cn.edu.usts.pojo;

import java.util.Date;

public class Issuerecord {
    private Integer id;

    private Integer officesuppliesId;

    private Integer officesuppliesCount;

    private Integer roomId;

    private String department;

    private Integer receiverId;

    private Date collectionDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOfficesuppliesId() {
        return officesuppliesId;
    }

    public void setOfficesuppliesId(Integer officesuppliesId) {
        this.officesuppliesId = officesuppliesId;
    }

    public Integer getOfficesuppliesCount() {
        return officesuppliesCount;
    }

    public void setOfficesuppliesCount(Integer officesuppliesCount) {
        this.officesuppliesCount = officesuppliesCount;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
}