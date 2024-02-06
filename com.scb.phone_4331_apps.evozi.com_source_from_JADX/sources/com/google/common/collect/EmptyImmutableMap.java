package com.google.common.collect;

import java.util.Map;

final class EmptyImmutableMap extends ImmutableMap<Object, Object> {
    static final EmptyImmutableMap INSTANCE = new EmptyImmutableMap();
    private static final long serialVersionUID = 0;

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        return false;
    }

    public final Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private EmptyImmutableMap() {
    }

    public final ImmutableSet<Map.Entry<Object, Object>> entrySet() {
        return ImmutableSet.m89of();
    }

    public final ImmutableSet<Object> keySet() {
        return ImmutableSet.m89of();
    }

    public final ImmutableCollection<Object> values() {
        return ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        return INSTANCE;
    }
}
