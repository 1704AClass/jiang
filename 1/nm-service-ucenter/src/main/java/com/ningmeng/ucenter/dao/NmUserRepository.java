package com.ningmeng.ucenter.dao;

import com.ningmeng.framework.domain.ucenter.NmUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 1 on 2020/3/12.
 */
public interface NmUserRepository extends JpaRepository<NmUser,String>{
    NmUser findNmUserByUsername(String username);
}
