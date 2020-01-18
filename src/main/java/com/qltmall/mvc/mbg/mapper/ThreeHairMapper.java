package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.ThreeHair;
import com.qltmall.mvc.mbg.model.ThreeHairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreeHairMapper {
    int countByExample(ThreeHairExample example);

    int deleteByExample(ThreeHairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreeHair record);

    int insertSelective(ThreeHair record);

    List<ThreeHair> selectByExample(ThreeHairExample example);

    ThreeHair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreeHair record, @Param("example") ThreeHairExample example);

    int updateByExample(@Param("record") ThreeHair record, @Param("example") ThreeHairExample example);

    int updateByPrimaryKeySelective(ThreeHair record);

    int updateByPrimaryKey(ThreeHair record);
}