package com.baomidou.ant.slk-sql.service.impl;

import com.baomidou.ant.slk-sql.entity.User;
import com.baomidou.ant.slk-sql.mapper.UserMapper;
import com.baomidou.ant.slk-sql.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
