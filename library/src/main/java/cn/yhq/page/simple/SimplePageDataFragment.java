package cn.yhq.page.simple;

import java.util.List;

import cn.yhq.page.core.IPageDataParser;
import cn.yhq.page.ui.PageDataFragment;

/**
 * @param <I>
 * @author Yanghuiqiang 2015-5-27
 */
public abstract class SimplePageDataFragment<I> extends PageDataFragment<List<I>, I> {

    @Override
    public IPageDataParser<List<I>, I> getPageDataParser() {
        return new SimplePageDataParser();
    }

}
