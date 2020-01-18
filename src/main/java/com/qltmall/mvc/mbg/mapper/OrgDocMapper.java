package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.OrgDoc;
import com.qltmall.mvc.mbg.model.OrgDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgDocMapper {
    int countByExample(OrgDocExample example);

    int deleteByExample(OrgDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrgDoc record);

    int insertSelective(OrgDoc record);

    List<OrgDoc> selectByExample(OrgDocExample example);

    OrgDoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrgDoc record, @Param("example") OrgDocExample example);

    int updateByExample(@Param("record") OrgDoc record, @Param("example") OrgDocExample example);

    int updateByPrimaryKeySelective(OrgDoc record);

    int updateByPrimaryKey(OrgDoc record);
}