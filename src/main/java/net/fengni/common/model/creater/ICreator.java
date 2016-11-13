package net.fengni.common.model.creater;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/3/6.
 */
public interface ICreator extends Serializable {
    public <T extends Object> T create(Class<T> h);
}
