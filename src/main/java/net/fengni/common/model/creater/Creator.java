package net.fengni.common.model.creater;

/**
 * Created by Administrator on 2016/3/6.
 */
public class Creator implements ICreator {
    public <T extends Object> T create(Class<T> o) {
        T t = null;
        try {
            t = (T)Class.forName(o.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
