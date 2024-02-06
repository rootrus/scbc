package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class Joiner {
    /* access modifiers changed from: private */
    public final String separator;

    /* renamed from: on */
    public static Joiner m82on(String str) {
        return new Joiner(str);
    }

    /* renamed from: on */
    public static Joiner m81on(char c) {
        return new Joiner(String.valueOf(c));
    }

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public <A extends Appendable> A appendTo(A a, Iterable<?> iterable) throws IOException {
        Preconditions.checkNotNull(a);
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            a.append(toString(it.next()));
            while (it.hasNext()) {
                a.append(this.separator);
                a.append(toString(it.next()));
            }
        }
        return a;
    }

    public final <A extends Appendable> A appendTo(A a, Object[] objArr) throws IOException {
        return appendTo(a, (Iterable<?>) Arrays.asList(objArr));
    }

    public final <A extends Appendable> A appendTo(A a, Object obj, Object obj2, Object... objArr) throws IOException {
        return appendTo(a, (Iterable<?>) iterable(obj, obj2, objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterable<?> iterable) {
        try {
            appendTo(sb, iterable);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<?>) Arrays.asList(objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb, (Iterable<?>) iterable(obj, obj2, objArr));
    }

    public final String join(Iterable<?> iterable) {
        return appendTo(new StringBuilder(), iterable).toString();
    }

    public final String join(Object[] objArr) {
        return join((Iterable<?>) Arrays.asList(objArr));
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join((Iterable<?>) iterable(obj, obj2, objArr));
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this) {
            /* access modifiers changed from: package-private */
            public CharSequence toString(Object obj) {
                return obj == null ? str : Joiner.this.toString(obj);
            }

            public Joiner useForNull(String str) {
                Preconditions.checkNotNull(str);
                throw new UnsupportedOperationException("already specified useForNull");
            }

            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public Joiner skipNulls() {
        return new Joiner(this) {
            public <A extends Appendable> A appendTo(A a, Iterable<?> iterable) throws IOException {
                Preconditions.checkNotNull(a, "appendable");
                Preconditions.checkNotNull(iterable, "parts");
                Iterator<?> it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            a.append(Joiner.this.toString(next));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a.append(Joiner.this.separator);
                        a.append(Joiner.this.toString(next2));
                    }
                }
                return a;
            }

            public Joiner useForNull(String str) {
                Preconditions.checkNotNull(str);
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            public MapJoiner withKeyValueSeparator(String str) {
                Preconditions.checkNotNull(str);
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        private MapJoiner(Joiner joiner2, String str) {
            this.joiner = joiner2;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        public final <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
            Preconditions.checkNotNull(a);
            Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry next = it.next();
                a.append(this.joiner.toString(next.getKey()));
                a.append(this.keyValueSeparator);
                a.append(this.joiner.toString(next.getValue()));
                while (it.hasNext()) {
                    a.append(this.joiner.separator);
                    Map.Entry next2 = it.next();
                    a.append(this.joiner.toString(next2.getKey()));
                    a.append(this.keyValueSeparator);
                    a.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a;
        }

        public final StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            try {
                appendTo(sb, map);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public final String join(Map<?, ?> map) {
            return appendTo(new StringBuilder(), map).toString();
        }

        public final MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence toString(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    private static Iterable<Object> iterable(final Object obj, final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() {
            public final int size() {
                return objArr.length + 2;
            }

            public final Object get(int i) {
                if (i == 0) {
                    return obj;
                }
                if (i != 1) {
                    return objArr[i - 2];
                }
                return obj2;
            }
        };
    }
}
