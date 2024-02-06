package com.google.common.base;

final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() {
        /* access modifiers changed from: protected */
        public final char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    static boolean isInstance(Class<?> cls, Object obj) {
        return cls.isInstance(obj);
    }

    static char[] charBufferFromThreadLocal() {
        return DEST_TL.get();
    }

    static long systemNanoTime() {
        return System.nanoTime();
    }

    static CharMatcher precomputeCharMatcher(CharMatcher charMatcher) {
        return charMatcher.precomputedInternal();
    }
}
