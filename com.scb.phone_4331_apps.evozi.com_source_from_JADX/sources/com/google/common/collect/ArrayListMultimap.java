package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ArrayListMultimap<K, V> extends AbstractListMultimap<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 10;
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    public final /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    public final /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ List removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public final /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    public static <K, V> ArrayListMultimap<K, V> create(int i, int i2) {
        return new ArrayListMultimap<>(i, i2);
    }

    public static <K, V> ArrayListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new ArrayListMultimap<>(multimap);
    }

    private ArrayListMultimap() {
        super(new HashMap());
        this.expectedValuesPerKey = 10;
    }

    private ArrayListMultimap(int i, int i2) {
        super(Maps.newHashMapWithExpectedSize(i));
        Preconditions.checkArgument(i2 >= 0);
        this.expectedValuesPerKey = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private ArrayListMultimap(Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size(), multimap instanceof ArrayListMultimap ? ((ArrayListMultimap) multimap).expectedValuesPerKey : 10);
        putAll(multimap);
    }

    /* access modifiers changed from: package-private */
    public final List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    public final void trimToSize() {
        for (Collection collection : backingMap().values()) {
            ((ArrayList) collection).trimToSize();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.expectedValuesPerKey);
        Serialization.writeMultimap(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = objectInputStream.readInt();
        int readCount = Serialization.readCount(objectInputStream);
        setMap(Maps.newHashMapWithExpectedSize(readCount));
        Serialization.populateMultimap(this, objectInputStream, readCount);
    }
}
