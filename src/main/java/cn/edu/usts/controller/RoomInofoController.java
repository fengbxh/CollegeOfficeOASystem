package cn.edu.usts.controller;

import cn.edu.usts.model.RoomInfoModel;
import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.services.impl.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("room")
public class RoomInofoController {
    @Autowired
    private RoomInfoService roomInfoService;

    //分页查询所有的房间信息
    @RequestMapping(value = "/findRoomInfoByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageBean<RoomInfoModel> findRoomInfoByPage(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage) {
        try {
            PageBean<RoomInfoModel> pageBean = roomInfoService.findRoomInfoByPage(currentPage);
            return pageBean;
        } catch (Exception ex) {
            return null;
        }
    }
}
