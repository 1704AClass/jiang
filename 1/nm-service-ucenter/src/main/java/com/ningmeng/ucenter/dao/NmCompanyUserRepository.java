package com.ningmeng.ucenter.dao;

import com.ningmeng.framework.domain.ucenter.NmCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 1 on 2020/3/12.
 */
public interface NmCompanyUserRepository extends JpaRepository<NmCompanyUser,String>{
    //根据用户id查询所属企业id
    NmCompanyUser findByUserId(String userId);
}
