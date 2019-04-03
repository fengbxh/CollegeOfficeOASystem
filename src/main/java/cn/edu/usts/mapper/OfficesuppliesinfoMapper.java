package cn.edu.usts.mapper;

import cn.edu.usts.pojo.Officesuppliesinfo;
import cn.edu.usts.pojo.OfficesuppliesinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficesuppliesinfoMapper {
    int countByExample(OfficesuppliesinfoExample example);

    int deleteByExample(OfficesuppliesinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Officesuppliesinfo record);

    int insertSelective(Officesuppliesinfo record);

    List<Officesuppliesinfo> selectByExample(OfficesuppliesinfoExample example);

    Officesuppliesinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Officesuppliesinfo record, @Param("example") OfficesuppliesinfoExample example);

    int updateByExample(@Param("record") Officesuppliesinfo record, @Param("example") OfficesuppliesinfoExample example);

    int updateByPrimaryKeySelective(Officesuppliesinfo record);

    int updateByPrimaryKey(Officesuppliesinfo record);
}