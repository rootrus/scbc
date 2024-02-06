package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Primitives;
import java.util.Map;

public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B> {
    private final ImmutableMap<Class<? extends B>, B> delegate;

    public static <B> Builder<B> builder() {
        return new Builder<>();
    }

    public static final class Builder<B> {
        private final ImmutableMap.Builder<Class<? extends B>, B> mapBuilder = ImmutableMap.builder();

        public final <T extends B> Builder<B> put(Class<T> cls, T t) {
            this.mapBuilder.put(cls, t);
            return this;
        }

        public final <T extends B> Builder<B> putAll(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry next : map.entrySet()) {
                Class cls = (Class) next.getKey();
                this.mapBuilder.put(cls, cast(cls, next.getValue()));
            }
            return this;
        }

        private static <B, T extends B> T cast(Class<T> cls, B b) {
            return Primitives.wrap(cls).cast(b);
        }

        public final ImmutableClassToInstanceMap<B> build() {
            return new ImmutableClassToInstanceMap<>(this.mapBuilder.build());
        }
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        return new Builder().putAll(map).build();
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    /* access modifiers changed from: protected */
    public final Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public final <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(cls);
    }

    public final <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }
}
