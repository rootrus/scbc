package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ BiMap inverse() {
        return super.inverse();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> cls) {
        return new EnumHashBiMap<>(cls);
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> create = create(EnumBiMap.inferKeyType(map));
        create.putAll(map);
        return create;
    }

    private EnumHashBiMap(Class<K> cls) {
        super(WellBehavedMap.wrap(new EnumMap(cls)), Maps.newHashMapWithExpectedSize(((Enum[]) cls.getEnumConstants()).length));
        this.keyType = cls;
    }

    public final V put(K k, V v) {
        return super.put(k, v);
    }

    public final V forcePut(K k, V v) {
        return super.forcePut(k, v);
    }

    public final Class<K> keyType() {
        return this.keyType;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        Serialization.writeMap(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        setDelegates(WellBehavedMap.wrap(new EnumMap(this.keyType)), new HashMap((((Enum[]) this.keyType.getEnumConstants()).length * 3) / 2));
        Serialization.populateMap(this, objectInputStream);
    }
}
