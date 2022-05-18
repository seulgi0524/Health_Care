package com.example.genpic_admin.service;

import com.example.genpic_admin.domain.Manage;
import com.example.genpic_admin.mapper.Tb_common_code_mapper;
import com.example.genpic_admin.service.Tb_common_code_service;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Tb_common_code_service {

    private final Tb_common_code_mapper tb_common_code_mapper;
    public List<Manage> tb_list() {
      return tb_common_code_mapper.getList();

    }
}
