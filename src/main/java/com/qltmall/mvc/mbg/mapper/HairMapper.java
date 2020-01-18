package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.Hair;
import com.qltmall.mvc.mbg.model.HairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairMapper {
    int countByExample(HairExample example);

    int deleteByExample(HairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hair record);

    int insertSelective(Hair record);

    List<Hair> selectByExample(HairExample example);

    Hair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hair record, @Param("example") HairExample example);

    int updateByExample(@Param("record") Hair record, @Param("example") HairExample example);

    int updateByPrimaryKeySelective(Hair record);

    int updateByPrimaryKey(Hair record);
}