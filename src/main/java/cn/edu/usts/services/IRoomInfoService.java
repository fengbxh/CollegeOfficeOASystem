package cn.edu.usts.services;

import cn.edu.usts.model.RoomInfoModel;
import cn.edu.usts.pojo.PageBean;

public interface IRoomInfoService {
    PageBean<RoomInfoModel> findRoomInfoByPage(int currentPage);
}
