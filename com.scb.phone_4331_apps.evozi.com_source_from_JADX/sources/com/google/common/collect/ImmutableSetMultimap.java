package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private final transient ImmutableSortedSet<V> emptySet;
    private transient ImmutableSet<Map.Entry<K, V>> entries;

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m3655of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m3656of(K k, V v) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m3657of(K k, V v, K k2, V v2) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m3658of(K k, V v, K k2, V v2, K k3, V v3) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        builder.put((Object) k3, (Object) v3);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m3659of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        builder.put((Object) k3, (Object) v3);
        builder.put((Object) k4, (Object) v4);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m3660of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Builder builder = builder();
        builder.put((Object) k, (Object) v);
        builder.put((Object) k2, (Object) v2);
        builder.put((Object) k3, (Object) v3);
        builder.put((Object) k4, (Object) v4);
        builder.put((Object) k5, (Object) v5);
        return builder.build();
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    static class BuilderMultimap<K, V> extends AbstractMultimap<K, V> {
        private static final long serialVersionUID = 0;

        BuilderMultimap() {
            super(new LinkedHashMap());
        }

        /* access modifiers changed from: package-private */
        public Collection<V> createCollection() {
            return Sets.newLinkedHashSet();
        }
    }

    static class SortedKeyBuilderMultimap<K, V> extends AbstractMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SortedKeyBuilderMultimap(Comparator<? super K> comparator, Multimap<K, V> multimap) {
            super(new TreeMap(comparator));
            putAll(multimap);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> createCollection() {
            return Sets.newLinkedHashSet();
        }
    }

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
            this.builderMultimap = new BuilderMultimap();
        }

        public final Builder<K, V> put(K k, V v) {
            this.builderMultimap.put(Preconditions.checkNotNull(k), Preconditions.checkNotNull(v));
            return this;
        }

        public final Builder<K, V> putAll(K k, Iterable<? extends V> iterable) {
            Collection<V> collection = this.builderMultimap.get(Preconditions.checkNotNull(k));
            for (Object checkNotNull : iterable) {
                collection.add(Preconditions.checkNotNull(checkNotNull));
            }
            return this;
        }

        public final Builder<K, V> putAll(K k, V... vArr) {
            return putAll((Object) k, (Iterable) Arrays.asList(vArr));
        }

        public final Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            for (Map.Entry next : multimap.asMap().entrySet()) {
                putAll(next.getKey(), (Iterable) next.getValue());
            }
            return this;
        }

        public final Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            this.builderMultimap = new SortedKeyBuilderMultimap((Comparator) Preconditions.checkNotNull(comparator), this.builderMultimap);
            return this;
        }

        public final Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy(comparator);
            return this;
        }

        public final ImmutableSetMultimap<K, V> build() {
            return ImmutableSetMultimap.copyOf(this.builderMultimap, this.valueComparator);
        }
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        return copyOf(multimap, (Comparator) null);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Comparator<? super V>, java.util.Comparator] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r5, java.util.Comparator<? super V> r6) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            if (r6 != 0) goto L_0x0010
            com.google.common.collect.ImmutableSetMultimap r5 = m3655of()
            return r5
        L_0x0010:
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableSetMultimap
            if (r0 == 0) goto L_0x001e
            r0 = r5
            com.google.common.collect.ImmutableSetMultimap r0 = (com.google.common.collect.ImmutableSetMultimap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            r1 = 0
            java.util.Map r5 = r5.asMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x002f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r6 != 0) goto L_0x004c
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.copyOf(r2)
            goto L_0x0050
        L_0x004c:
            com.google.common.collect.ImmutableSortedSet r2 = com.google.common.collect.ImmutableSortedSet.copyOf(r6, r2)
        L_0x0050:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x002f
            r0.put(r3, r2)
            int r2 = r2.size()
            int r1 = r1 + r2
            goto L_0x002f
        L_0x005f:
            com.google.common.collect.ImmutableSetMultimap r5 = new com.google.common.collect.ImmutableSetMultimap
            com.google.common.collect.ImmutableMap r0 = r0.build()
            r5.<init>(r0, r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSetMultimap.copyOf(com.google.common.collect.Multimap, java.util.Comparator):com.google.common.collect.ImmutableSetMultimap");
    }

    ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        ImmutableSortedSet<V> immutableSortedSet;
        if (comparator == null) {
            immutableSortedSet = null;
        } else {
            immutableSortedSet = ImmutableSortedSet.emptySet(comparator);
        }
        this.emptySet = immutableSortedSet;
    }

    public ImmutableSet<V> get(K k) {
        ImmutableSet<V> immutableSet = (ImmutableSet) this.map.get(k);
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSortedSet<V> immutableSortedSet = this.emptySet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        return ImmutableSet.m89of();
    }

    public ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> copyOf = ImmutableSet.copyOf(super.entries());
        this.entries = copyOf;
        return copyOf;
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
                    ImmutableSet copyOf = ImmutableSet.copyOf((E[]) objArr);
                    if (copyOf.size() == readInt2) {
                        builder.put(readObject, copyOf);
                        i2 += readInt2;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, (Object) builder.build());
                ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }
}
