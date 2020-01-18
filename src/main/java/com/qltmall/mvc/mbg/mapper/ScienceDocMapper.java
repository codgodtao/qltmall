package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.ScienceDoc;
import com.qltmall.mvc.mbg.model.ScienceDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScienceDocMapper {
    int countByExample(ScienceDocExample example);

    int deleteByExample(ScienceDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScienceDoc record);

    int insertSelective(ScienceDoc record);

    List<ScienceDoc> selectByExample(ScienceDocExample example);

    ScienceDoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScienceDoc record, @Param("example") ScienceDocExample example);

    int updateByExample(@Param("record") ScienceDoc record, @Param("example") ScienceDocExample example);

    int updateByPrimaryKeySelective(ScienceDoc record);

    int updateByPrimaryKey(ScienceDoc record);
}