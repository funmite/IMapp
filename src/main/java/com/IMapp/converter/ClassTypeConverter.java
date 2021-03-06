package com.IMapp.converter;

/**
 * @author funmiayinde
 *
 * Converter which needs to be define for a given class target type
 * */

@FunctionalInterface
public interface ClassTypeConverter<K,V> {

    public V convert(K instance);
}
