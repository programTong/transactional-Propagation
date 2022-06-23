package com.mask.auth.service.impl;


import com.mask.auth.mapper.StaffInfoMapper;
import com.mask.auth.service.UserService;
import com.mask.common.exception.EnvKyException;
import com.mask.common.model.ResultCode;
import com.mask.common.model.ResultMsg;
import com.mask.common.model.entity.StaffInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mask
 * @since 2022/6/19 10:25
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private StaffInfoMapper staffInfoMapper;

    @Autowired
    private UserServiceImpl2 userServiceImpl2;
    @Autowired
    private UserServiceImpl3 userServiceImpl3;

    @Transactional(rollbackFor = Exception.class)
    public ResultMsg test() {
        try {
            staffInfoMapper.insert(StaffInfo.builder()
                            .staffName("UserServiceImpl A")
                    .build());
            try {
                userServiceImpl2.test();
            }catch (Exception e) {
                e.printStackTrace();
            }
            try {
                userServiceImpl3.test();
            }catch (Exception e) {
                e.printStackTrace();
            }
//            userServiceImpl2.test();

//            devide();
            staffInfoMapper.insert(StaffInfo.builder()
                    .staffName("UserServiceImpl B")
                    .build());
            return new ResultMsg(ResultCode.SUCCESS.getCode(), "UserServiceImpl成功了哦",null);
        } catch (Exception e) {
            throw new EnvKyException(e.getMessage(),e,"UserServiceImpl客户端您好，有错误");
        }
    }

    private void devide() {
        int i = 3/0;
    }
}
