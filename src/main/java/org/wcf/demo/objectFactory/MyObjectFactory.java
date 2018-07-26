package org.wcf.demo.objectFactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

/**
 * 自定义对象工厂objectFactory
 */
public class MyObjectFactory extends DefaultObjectFactory {
    private static final Logger LOGGER=LoggerFactory.getLogger(MyObjectFactory.class);
    private Object temp=null;

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        LOGGER.info("lala");
    }

    @Override
    public <T> T create(Class<T> type) {
        T result= super.create(type);
        LOGGER.info("lalala");
        return result;
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T result= super.create(type, constructorArgTypes, constructorArgs);
        temp=result;
        return result;
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
