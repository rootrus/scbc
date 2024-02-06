package com.google.common.base;

import java.util.Arrays;

public final class Objects {
    private Objects() {
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(simpleName(obj.getClass()));
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(simpleName(cls));
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }

    private static String simpleName(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = name.lastIndexOf(46);
        }
        return name.substring(lastIndexOf + 1);
    }

    public static <T> T firstNonNull(T t, T t2) {
        return t == null ? Preconditions.checkNotNull(t2) : t;
    }

    public static final class ToStringHelper {
        private final StringBuilder builder;
        private String separator;

        private ToStringHelper(String str) {
            this.separator = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append((String) Preconditions.checkNotNull(str));
            sb.append('{');
            this.builder = sb;
        }

        public final ToStringHelper add(String str, Object obj) {
            StringBuilder sb = this.builder;
            sb.append(this.separator);
            sb.append((String) Preconditions.checkNotNull(str));
            sb.append('=');
            sb.append(obj);
            this.separator = ", ";
            return this;
        }

        public final ToStringHelper addValue(Object obj) {
            StringBuilder sb = this.builder;
            sb.append(this.separator);
            sb.append(obj);
            this.separator = ", ";
            return this;
        }

        public final String toString() {
            StringBuilder sb = this.builder;
            sb.append('}');
            return sb.toString();
        }
    }
}
