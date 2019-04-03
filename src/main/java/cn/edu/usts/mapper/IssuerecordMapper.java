package cn.edu.usts.mapper;

import cn.edu.usts.pojo.Issuerecord;
import cn.edu.usts.pojo.IssuerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssuerecordMapper {
    int countByExample(IssuerecordExample example);

    int deleteByExample(IssuerecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Issuerecord record);

    int insertSelective(Issuerecord record);

    List<Issuerecord> selectByExample(IssuerecordExample example);

    Issuerecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Issuerecord record, @Param("example") IssuerecordExample example);

    int updateByExample(@Param("record") Issuerecord record, @Param("example") IssuerecordExample example);

    int updateByPrimaryKeySelective(Issuerecord record);

    int updateByPrimaryKey(Issuerecord record);
}