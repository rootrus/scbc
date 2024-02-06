package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class Predicates {
    /* access modifiers changed from: private */
    public static final Joiner COMMA_JOINER = Joiner.m82on(",");

    enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE {
            public final boolean apply(Object obj) {
                return true;
            }
        },
        ALWAYS_FALSE {
            public final boolean apply(Object obj) {
                return false;
            }
        },
        IS_NULL {
            public final boolean apply(Object obj) {
                return obj == null;
            }
        },
        NOT_NULL {
            public final boolean apply(Object obj) {
                return obj != null;
            }
        };

        /* access modifiers changed from: package-private */
        public <T> Predicate<T> withNarrowedType() {
            return this;
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysTrue() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> Predicate<T> alwaysFalse() {
        return ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    public static <T> Predicate<T> isNull() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> Predicate<T> notNull() {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new AndPredicate(defensiveCopy(iterable));
    }

    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new AndPredicate(defensiveCopy((T[]) predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new AndPredicate(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* renamed from: or */
    public static <T> Predicate<T> m3609or(Iterable<? extends Predicate<? super T>> iterable) {
        return new OrPredicate(defensiveCopy(iterable));
    }

    /* renamed from: or */
    public static <T> Predicate<T> m3610or(Predicate<? super T>... predicateArr) {
        return new OrPredicate(defensiveCopy((T[]) predicateArr));
    }

    /* renamed from: or */
    public static <T> Predicate<T> m3608or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new OrPredicate(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> equalTo(T t) {
        return t == null ? isNull() : new IsEqualToPredicate(t);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    /* renamed from: in */
    public static <T> Predicate<T> m3607in(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate<CharSequence> containsPattern(String str) {
        return new ContainsPatternPredicate(str);
    }

    public static Predicate<CharSequence> contains(Pattern pattern) {
        return new ContainsPatternPredicate(pattern);
    }

    static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Predicate<T> predicate;

        NotPredicate(Predicate<T> predicate2) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate2);
        }

        public boolean apply(T t) {
            return !this.predicate.apply(t);
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Not(");
            sb.append(this.predicate.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        private AndPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }

        public boolean apply(T t) {
            for (Predicate apply : this.components) {
                if (!apply.apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("And(");
            sb.append(Predicates.COMMA_JOINER.join((Iterable<?>) this.components));
            sb.append(")");
            return sb.toString();
        }
    }

    static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        private OrPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }

        public boolean apply(T t) {
            for (Predicate apply : this.components) {
                if (apply.apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.components.equals(((OrPredicate) obj).components);
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Or(");
            sb.append(Predicates.COMMA_JOINER.join((Iterable<?>) this.components));
            sb.append(")");
            return sb.toString();
        }
    }

    static class IsEqualToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T target;

        private IsEqualToPredicate(T t) {
            this.target = t;
        }

        public boolean apply(T t) {
            return this.target.equals(t);
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("IsEqualTo(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }
    }

    static class InstanceOfPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) Preconditions.checkNotNull(cls);
        }

        public boolean apply(Object obj) {
            return Platform.isInstance(this.clazz, obj);
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InstanceOfPredicate) || this.clazz != ((InstanceOfPredicate) obj).clazz) {
                return false;
            }
            return true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("IsInstanceOf(");
            sb.append(this.clazz.getName());
            sb.append(")");
            return sb.toString();
        }
    }

    static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) Preconditions.checkNotNull(collection);
        }

        public boolean apply(T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("In(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }
    }

    static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        final Function<A, ? extends B> f3263f;

        /* renamed from: p */
        final Predicate<B> f3264p;

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f3264p = (Predicate) Preconditions.checkNotNull(predicate);
            this.f3263f = (Function) Preconditions.checkNotNull(function);
        }

        public boolean apply(A a) {
            return this.f3264p.apply(this.f3263f.apply(a));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            if (!this.f3263f.equals(compositionPredicate.f3263f) || !this.f3264p.equals(compositionPredicate.f3264p)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f3263f.hashCode() ^ this.f3264p.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3264p.toString());
            sb.append("(");
            sb.append(this.f3263f.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final Pattern pattern;

        ContainsPatternPredicate(Pattern pattern2) {
            this.pattern = (Pattern) Preconditions.checkNotNull(pattern2);
        }

        ContainsPatternPredicate(String str) {
            this(Pattern.compile(str));
        }

        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).find();
        }

        public int hashCode() {
            return Objects.hashCode(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            if (!Objects.equal(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) || !Objects.equal(Integer.valueOf(this.pattern.flags()), Integer.valueOf(containsPatternPredicate.pattern.flags()))) {
                return false;
            }
            return true;
        }

        public String toString() {
            return Objects.toStringHelper((Object) this).add("pattern", this.pattern).add("pattern.flags", Integer.toHexString(this.pattern.flags())).toString();
        }
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T checkNotNull : iterable) {
            arrayList.add(Preconditions.checkNotNull(checkNotNull));
        }
        return arrayList;
    }
}
