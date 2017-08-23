package com.fd.report.dao;

import com.fd.report.entity.collinfo;
import com.fd.report.entity.collinfoWithBLOBs;

public interface collinfoMapper {
    int deleteByPrimaryKey(Integer collinfoid);

    int insert(collinfoWithBLOBs record);

    int insertSelective(collinfoWithBLOBs record);

    collinfoWithBLOBs selectByPrimaryKey(Integer collinfoid);

    int updateByPrimaryKeySelective(collinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(collinfoWithBLOBs record);

    int updateByPrimaryKey(collinfo record);
}