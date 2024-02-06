package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m3635of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m3636of(K k, V v) {
        Builder builder = builder();
        builder.put(k, v);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m3637of(K k, V v, K k2, V v2) {
        Builder builder = builder();
        builder.put(k, v);
        builder.put(k2, v2);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m3638of(K k, V v, K k2, V v2, K k3, V v3) {
        Builder builder = builder();
        builder.put(k, v);
        builder.put(k2, v2);
        builder.put(k3, v3);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m3639of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Builder builder = builder();
        builder.put(k, v);
        builder.put(k2, v2);
        builder.put(k3, v3);
        builder.put(k4, v4);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m3640of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Builder builder = builder();
        builder.put(k, v);
        builder.put(k2, v2);
        builder.put(k3, v3);
        builder.put(k4, v4);
        builder.put(k5, v5);
        return builder.build();
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public final Builder<K, V> put(K k, V v) {
            super.put(k, v);
            return this;
        }

        public final Builder<K, V> putAll(K k, Iterable<? extends V> iterable) {
            super.putAll(k, iterable);
            return this;
        }

        public final Builder<K, V> putAll(K k, V... vArr) {
            super.putAll(k, vArr);
            return this;
        }

        public final Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll(multimap);
            return this;
        }

        public final Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy(comparator);
            return this;
        }

        public final Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy(comparator);
            return this;
        }

        public final ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
        }
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return m3635of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i = 0;
        for (Map.Entry next : multimap.asMap().entrySet()) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) next.getValue());
            if (!copyOf.isEmpty()) {
                builder.put(next.getKey(), copyOf);
                i += copyOf.size();
            }
        }
        return new ImmutableListMultimap<>(builder.build(), i);
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.m3621of() : immutableList;
    }

    public ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    Object[] objArr = new Object[readInt2];
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        objArr[i3] = objectInputStream.readObject();
                    }
                    builder.put(readObject, ImmutableList.copyOf((E[]) objArr));
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, (Object) builder.build());
                ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }
}
