package com.scb.phone.view.custom;

import java.lang.Comparable;

/* renamed from: com.scb.phone.view.custom.ScbEllipsizeTextView$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5797xf282671a<T extends Comparable<? super T>> {
    final T MediaBrowserCompat$CustomActionResultReceiver;
    final T write;

    public C5797xf282671a(T t, T t2) {
        this.write = t;
        this.MediaBrowserCompat$CustomActionResultReceiver = t2;
        if (t.compareTo(t2) > 0) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }
}
