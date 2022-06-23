package com.mask.auth.service.impl;


import com.mask.auth.mapper.StaffInfoMapper;
import com.mask.common.exception.EnvKyException;
import com.mask.common.model.ResultCode;
import com.mask.common.model.ResultMsg;
import com.mask.common.model.entity.StaffInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mask
 * @since 2022/6/19 10:25
 */
@Service
@Slf4j
public class UserServiceImpl2  {
    @Autowired
    private StaffInfoMapper staffInfoMapper;


    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public ResultMsg test() {
        try {
            staffInfoMapper.insert(StaffInfo.builder()
                            .staffName("UserServiceImpl2 A")
                    .build());
//            devide();
            staffInfoMapper.insert(StaffInfo.builder()
                    .staffName(" UserServiceImpl2 B")
                    .build());
            return new ResultMsg(ResultCode.SUCCESS.getCode(), "UserServiceImpl2成功了哦",null);
        } catch (Exception e) {
            throw new EnvKyException(e.getMessage(),e,"客户端您好，UserServiceImpl2有错误");
        }
    }

    private void devide() {
        int i = 3/0;
    }
}
