package com.giscloud.registrycenter.mapper;

import com.giscloud.registrycenter.model.ServiceGroup;
import com.giscloud.registrycenter.model.ServiceGroupExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ServiceGroupMapper {
    long countByExample(ServiceGroupExample example);

    int deleteByExample(ServiceGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceGroup record);

    int insertSelective(ServiceGroup record);

    List<ServiceGroup> selectByExample(ServiceGroupExample example);

    ServiceGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceGroup record, @Param("example") ServiceGroupExample example);

    int updateByExample(@Param("record") ServiceGroup record, @Param("example") ServiceGroupExample example);

    int updateByPrimaryKeySelective(ServiceGroup record);

    int updateByPrimaryKey(ServiceGroup record);
}