package org.simpleframework.xml.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class Session implements Map {
    private final Map map;
    private final boolean strict;

    public Session() {
        this(true);
    }

    public Session(boolean z) {
        this.map = new HashMap();
        this.strict = z;
    }

    public final boolean isStrict() {
        return this.strict;
    }

    public final Map getMap() {
        return this.map;
    }

    public final int size() {
        return this.map.size();
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    public final Object get(Object obj) {
        return this.map.get(obj);
    }

    public final Object put(Object obj, Object obj2) {
        return this.map.put(obj, obj2);
    }

    public final Object remove(Object obj) {
        return this.map.remove(obj);
    }

    public final void putAll(Map map2) {
        this.map.putAll(map2);
    }

    public final Set keySet() {
        return this.map.keySet();
    }

    public final Collection values() {
        return this.map.values();
    }

    public final Set entrySet() {
        return this.map.entrySet();
    }

    public final void clear() {
        this.map.clear();
    }
}
