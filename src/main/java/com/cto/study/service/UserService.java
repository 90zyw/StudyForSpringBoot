package com.cto.study.service;

import com.cto.study.entity.User;
import com.cto.study.entity.vo.UserVo;
import com.cto.study.service.base.BaseService;
import com.cto.study.utils.Page;
import org.springframework.stereotype.Service;

/**
 * 用户逻辑层
 * @author Zhang Yongwei
 * @date 2019-03-20
 * @version 1.0
 */
@Service
public interface UserService extends BaseService<User> {
    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    User selectByUserName(String userName);

    /**
     * 分页查询
     * @param userVo
     * @return
     */
    Page<User> selectPage(UserVo userVo);
}
