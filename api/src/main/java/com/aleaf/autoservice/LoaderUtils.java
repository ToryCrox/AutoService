package com.aleaf.autoservice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class LoaderUtils {

    /**
     * 通过在资源目录META-INF/services中放置提供者配置文件 来标识服务提供者
     *
     * @param interfaceClass The instance of the service interface.
     * @return The explicit service intent matched.
     */
    public static <T> T getService(final Class<T> interfaceClass) {
        final ServiceLoader<T> loader = ServiceLoader.load(interfaceClass);
        final Iterator<T> iterator = loader.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    /**
     * 通过在资源目录META-INF/services中放置提供者配置文件 来标识服务提供者
     *
     * @param interfaceClass The instance of the service interface.
     * @return The explicit service intent matched.
     */
    public static <T> List<T> getServices(final Class<T> interfaceClass) {
        final ServiceLoader<T> loader = ServiceLoader.load(interfaceClass);
        final Iterator<T> iterator = loader.iterator();
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t != null){
                list.add(t);
            }
        }
        return list;
    }
}
