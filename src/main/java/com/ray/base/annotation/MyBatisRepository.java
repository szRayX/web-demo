package com.ray.base.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 标识MyBatis的DAO,方便 org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描。
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisRepository {
    String value() default "";
}
