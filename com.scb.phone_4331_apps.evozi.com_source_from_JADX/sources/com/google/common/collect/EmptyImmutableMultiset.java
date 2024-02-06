package com.google.common.collect;

final class EmptyImmutableMultiset extends ImmutableMultiset<Object> {
    static final EmptyImmutableMultiset INSTANCE = new EmptyImmutableMultiset();
    private static final long serialVersionUID = 0;

    private EmptyImmutableMultiset() {
        super(ImmutableMap.m83of(), 0);
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        return INSTANCE;
    }
}
