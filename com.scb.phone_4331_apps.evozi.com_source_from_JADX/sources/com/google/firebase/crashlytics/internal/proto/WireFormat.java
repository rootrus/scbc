package com.google.firebase.crashlytics.internal.proto;

final class WireFormat {
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);

    static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }
}
