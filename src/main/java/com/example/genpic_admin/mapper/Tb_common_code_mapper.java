package com.example.genpic_admin.mapper;
import com.example.genpic_admin.domain.Manage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Tb_common_code_mapper {
    List<Manage> getList();
}

