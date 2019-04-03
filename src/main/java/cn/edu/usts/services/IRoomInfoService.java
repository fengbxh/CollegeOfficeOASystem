package cn.edu.usts.services;

import cn.edu.usts.model.RoomInfoModel;
import cn.edu.usts.pojo.PageBean;

import java.util.List;

public interface IRoomInfoService {
    PageBean<RoomInfoModel> findRoomInfoByPage(int currentPage);

    List<RoomInfoModel> findRoomInfo();
}
