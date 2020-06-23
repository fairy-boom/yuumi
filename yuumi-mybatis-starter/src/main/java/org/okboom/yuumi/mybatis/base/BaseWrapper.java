package org.okboom.yuumi.mybatis.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.okboom.yuumi.tool.convert.BaseConvert;

import java.util.List;

/**
 * 基础转换类
 * @author tookbra
 */
public interface BaseWrapper<S, T> extends BaseConvert<S, T> {

    /**
     * 分页转换
     * @param pages {@linkplain IPage}
     * @return {@linkplain IPage}
     */
    default IPage<T> convertPageVO(IPage<S> pages) {
        List<T> records = this.convertTo(pages.getRecords());
        IPage<T> pageVo = new Page(pages.getCurrent(), pages.getSize(), pages.getTotal());
        pageVo.setRecords(records);
        return pageVo;
    }

}
