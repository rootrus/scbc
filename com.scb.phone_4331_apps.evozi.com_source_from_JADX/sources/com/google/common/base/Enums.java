package com.google.common.base;

public final class Enums {
    private Enums() {
    }

    public static <T extends Enum<T>> Function<String, T> valueOfFunction(Class<T> cls) {
        return new ValueOfFunction(cls);
    }

    static final class ValueOfFunction<T extends Enum<T>> implements Function<String, T> {
        private final Class<T> enumClass;

        private ValueOfFunction(Class<T> cls) {
            this.enumClass = (Class) Preconditions.checkNotNull(cls);
        }

        public final T apply(String str) {
            try {
                return Enum.valueOf(this.enumClass, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
