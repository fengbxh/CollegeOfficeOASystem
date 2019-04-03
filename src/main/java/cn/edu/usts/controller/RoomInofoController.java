package cn.edu.usts.controller;

import cn.edu.usts.model.RoomInfoModel;
import cn.edu.usts.pojo.Msg;
import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Roominfo;
import cn.edu.usts.services.impl.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("room")
public class RoomInofoController {
    @Autowired
    private RoomInfoService roomInfoService;

    //添加一个房间信息
    @RequestMapping(value = "/addRoomInfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg addRoomInfo(Roominfo roominfo) {
        try {
            boolean result = roomInfoService.insertRoomInfo(roominfo);
            if (result) {
                return Msg.success();
            } else {
                return Msg.fail();
            }
        } catch (Exception e) {
            return Msg.fail();
        } finally {

        }

    }

    @RequestMapping(value = "/deleteRoomInfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg deleteRoomInfo(Integer Id) {
        Boolean a = roomInfoService.deleteRoomInfoById(Id);
        if (a) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    //分页查询所有的房间信息
    @RequestMapping(value = "/findRoomInfoByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageBean<RoomInfoModel> findRoomInfoByPage(@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage) {
        try {
            PageBean<RoomInfoModel> pageBean = roomInfoService.findRoomInfoByPage(currentPage);
            return pageBean;
        } catch (Exception ex) {
            return null;
        }
    }

    //用于导出房间信息
    @RequestMapping(value = "/findRoomInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<RoomInfoModel> findRoomInfo() {
        try {
            List<RoomInfoModel> list = roomInfoService.findRoomInfo();
            return list;
        } catch (Exception ex) {
            return null;
        }
    }

}
