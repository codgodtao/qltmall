package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.ScienceVideo;
import com.qltmall.mvc.mbg.model.ScienceVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScienceVideoMapper {
    int countByExample(ScienceVideoExample example);

    int deleteByExample(ScienceVideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScienceVideo record);

    int insertSelective(ScienceVideo record);

    List<ScienceVideo> selectByExample(ScienceVideoExample example);

    ScienceVideo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScienceVideo record, @Param("example") ScienceVideoExample example);

    int updateByExample(@Param("record") ScienceVideo record, @Param("example") ScienceVideoExample example);

    int updateByPrimaryKeySelective(ScienceVideo record);

    int updateByPrimaryKey(ScienceVideo record);
}