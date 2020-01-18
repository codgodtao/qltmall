package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.ScienceUrl;
import com.qltmall.mvc.mbg.model.ScienceUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScienceUrlMapper {
    int countByExample(ScienceUrlExample example);

    int deleteByExample(ScienceUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScienceUrl record);

    int insertSelective(ScienceUrl record);

    List<ScienceUrl> selectByExample(ScienceUrlExample example);

    ScienceUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScienceUrl record, @Param("example") ScienceUrlExample example);

    int updateByExample(@Param("record") ScienceUrl record, @Param("example") ScienceUrlExample example);

    int updateByPrimaryKeySelective(ScienceUrl record);

    int updateByPrimaryKey(ScienceUrl record);
}