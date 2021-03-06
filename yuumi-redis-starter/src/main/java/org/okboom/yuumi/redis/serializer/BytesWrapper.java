package org.okboom.yuumi.redis.serializer;

/**
 * @author tookbra
 */
public class BytesWrapper<T> implements Cloneable {

    private T value;

    public BytesWrapper() {
    }

    public BytesWrapper(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BytesWrapper<T> clone() {
        try {
            return (BytesWrapper) super.clone();
        } catch (CloneNotSupportedException e) {
            return new BytesWrapper<>();
        }
    }
}
