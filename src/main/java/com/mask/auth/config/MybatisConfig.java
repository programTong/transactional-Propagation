package com.mask.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mask
 * @since 2022/6/14 17:32
 */
@Configuration
@MapperScan(basePackages = { "com.mask.auth.mapper"})
public class MybatisConfig {


}
