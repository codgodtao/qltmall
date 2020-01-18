package com.qltmall.mvc.mbg.mapper;

import com.qltmall.mvc.mbg.model.HairShop;
import com.qltmall.mvc.mbg.model.HairShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairShopMapper {
    int countByExample(HairShopExample example);

    int deleteByExample(HairShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HairShop record);

    int insertSelective(HairShop record);

    List<HairShop> selectByExample(HairShopExample example);

    HairShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HairShop record, @Param("example") HairShopExample example);

    int updateByExample(@Param("record") HairShop record, @Param("example") HairShopExample example);

    int updateByPrimaryKeySelective(HairShop record);

    int updateByPrimaryKey(HairShop record);
}