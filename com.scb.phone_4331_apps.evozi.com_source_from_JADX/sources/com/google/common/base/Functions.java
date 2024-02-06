package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

public final class Functions {

    enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "identity";
        }
    }

    private Functions() {
    }

    public static Function<Object, String> toStringFunction() {
        return ToStringFunction.INSTANCE;
    }

    enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        public final String toString() {
            return "toString";
        }

        public final String apply(Object obj) {
            Preconditions.checkNotNull(obj);
            return obj.toString();
        }
    }

    public static <E> Function<E, E> identity() {
        return IdentityFunction.INSTANCE;
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
        return new FunctionForMapNoDefault(map);
    }

    static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        FunctionForMapNoDefault(Map<K, V> map2) {
            this.map = (Map) Preconditions.checkNotNull(map2);
        }

        public V apply(K k) {
            V v = this.map.get(k);
            Preconditions.checkArgument(v != null || this.map.containsKey(k), "Key '%s' not present in map", k);
            return v;
        }

        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.map.equals(((FunctionForMapNoDefault) obj).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forMap(");
            sb.append(this.map);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, V v) {
        return new ForMapWithDefault(map, v);
    }

    static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final V defaultValue;
        final Map<K, ? extends V> map;

        ForMapWithDefault(Map<K, ? extends V> map2, V v) {
            this.map = (Map) Preconditions.checkNotNull(map2);
            this.defaultValue = v;
        }

        public V apply(K k) {
            V v = this.map.get(k);
            return (v != null || this.map.containsKey(k)) ? v : this.defaultValue;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
            if (!this.map.equals(forMapWithDefault.map) || !Objects.equal(this.defaultValue, forMapWithDefault.defaultValue)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.map, this.defaultValue);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forMap(");
            sb.append(this.map);
            sb.append(", defaultValue=");
            sb.append(this.defaultValue);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
        return new FunctionComposition(function, function2);
    }

    static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        private final Function<A, ? extends B> f3261f;

        /* renamed from: g */
        private final Function<B, C> f3262g;

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
            this.f3262g = (Function) Preconditions.checkNotNull(function);
            this.f3261f = (Function) Preconditions.checkNotNull(function2);
        }

        public C apply(A a) {
            return this.f3262g.apply(this.f3261f.apply(a));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            FunctionComposition functionComposition = (FunctionComposition) obj;
            if (!this.f3261f.equals(functionComposition.f3261f) || !this.f3262g.equals(functionComposition.f3262g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f3261f.hashCode() ^ this.f3262g.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3262g.toString());
            sb.append("(");
            sb.append(this.f3261f.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
        return new PredicateFunction(predicate);
    }

    static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final Predicate<T> predicate;

        private PredicateFunction(Predicate<T> predicate2) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate2);
        }

        public Boolean apply(T t) {
            return Boolean.valueOf(this.predicate.apply(t));
        }

        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.predicate.equals(((PredicateFunction) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("forPredicate(");
            sb.append(this.predicate);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <E> Function<Object, E> constant(E e) {
        return new ConstantFunction(e);
    }

    static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;
        private final E value;

        public ConstantFunction(E e) {
            this.value = e;
        }

        public E apply(Object obj) {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.equal(this.value, ((ConstantFunction) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e = this.value;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("constant(");
            sb.append(this.value);
            sb.append(")");
            return sb.toString();
        }
    }
}
