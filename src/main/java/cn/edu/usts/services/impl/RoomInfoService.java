package cn.edu.usts.services.impl;

import cn.edu.usts.mapper.RoominfoMapper;
import cn.edu.usts.model.RoomInfoModel;
import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.services.IRoomInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomInfoService implements IRoomInfoService {
    @Resource
    private RoominfoMapper roominfoMapper;
    @Override
    public PageBean<RoomInfoModel> findRoomInfoByPage(int currentPage) {
        PageBean<RoomInfoModel> pageBean=new PageBean<>();
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        int pageSize=5;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = roominfoMapper.selectCount();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());
        List<RoomInfoModel> list=roominfoMapper.findRoomInfoByPage(currentPage,pageSize);
        pageBean.setLists(list);
        return pageBean;
    }

    @Override
    public List<RoomInfoModel> findRoomInfo() {
        return roominfoMapper.findRoomInfo();
    }
}
