package org.okboom.yuumi.tool.extension;

import org.okboom.yuumi.tool.extension.annotation.Extension;
import org.okboom.yuumi.tool.extension.exception.ExtensionException;

import java.util.Objects;
import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

/**
 * SPI loader
 * @author tookbra
 */
public class ExtensionLoader<T> {

    private Class<T> type;

    private ExtensionLoader(final Class<T> type) {
        this.type = type;
    }

    private static <T> boolean withExtensionAnnotation(final Class<T> type) {
        return type.isAnnotationPresent(Extension.class);
    }

    public static <T> ExtensionLoader<T> getExtensionLoader(final Class<T> type) {
        if (type == null) {
            throw new ExtensionException("type == null");
        }
        if (!type.isInterface()) {
            throw new ExtensionException("Extension type(" + type + ") not interface!");
        }
        if (!withExtensionAnnotation(type)) {
            throw new ExtensionException("type" + type.getName() + "not exist");
        }
        return new ExtensionLoader<>(type);
    }

    public T getActivateExtension(final String value) {
        ServiceLoader<T> loader = ServiceLoader.load(type);
        return StreamSupport.stream(loader.spliterator(), false)
                .filter(e -> Objects.equals(e.getClass()
                        .getAnnotation(Extension.class).value(), value))
                .findFirst().orElseThrow(() -> new ExtensionException("Please check your configuration"));
    }
}
