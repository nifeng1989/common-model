package net.fengni.common.model.creater;

/**
 * Created by Administrator on 2016/3/6.
 */
public interface ICreator {
    public <T extends Object> T create(Class<T> h);
}
