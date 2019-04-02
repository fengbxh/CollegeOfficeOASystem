package cn.edu.usts.model;

public class RoomInfoModel {
    private Integer id;
    private String campus;
    private String college;
    private String buildingName;
    private Integer floor;
    private String roomNumber;
    private String roomName;
    private String roomClassification;
    private Long usageArea;
    private String keyAdmin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }
    public String getRoomClassification() {
        return roomClassification;
    }

    public void setRoomClassification(String roomClassification) {
        this.roomClassification = roomClassification == null ? null : roomClassification.trim();
    }
    public Long getUsageArea() {
        return usageArea;
    }

    public void setUsageArea(Long usageArea) {
        this.usageArea = usageArea;
    }

    public String getKeyAdmin() {
        return keyAdmin;
    }

    public void setKeyAdmin(String keyAdmin) {
        this.keyAdmin = keyAdmin == null ? null : keyAdmin.trim();
    }
}
