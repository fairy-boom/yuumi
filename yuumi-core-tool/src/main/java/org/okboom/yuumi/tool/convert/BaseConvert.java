package org.okboom.yuumi.tool.convert;

import org.mapstruct.MapperConfig;

import java.util.List;

/**
 * 基础转换类
 * @author tookbra
 */
@MapperConfig
public interface BaseConvert<S,T> {

    /**
     * 同属性映射转换
     * @param s 转换源
     * @return 转换目标
     */
    T convertToTarget(S s);

    /**
     * 同属性映射转换
     * @param t 转换源
     * @return
     */
    S convertToSource(T t);

    /**
     * 同属性映射转换
     * @param s
     * @return
     */
    List<T> convertTo(List<S> s);

    /**
     * 同属性映射转换
     * @param t
     * @return
     */
    List<S> targetToSource(List<T> t);
}
