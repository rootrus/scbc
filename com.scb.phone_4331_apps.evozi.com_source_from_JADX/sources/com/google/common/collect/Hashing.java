package com.google.common.collect;

final class Hashing {
    static int smear(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 ^ (i2 >>> 7)) ^ (i2 >>> 4);
    }

    private Hashing() {
    }
}
