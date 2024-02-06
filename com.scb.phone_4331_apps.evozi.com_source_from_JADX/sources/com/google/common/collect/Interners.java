package com.google.common.collect;

import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.base.FinalizableWeakReference;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentMap;

public final class Interners {
    private Interners() {
    }

    public static <E> Interner<E> newStrongInterner() {
        final ConcurrentMap makeMap = new MapMaker().makeMap();
        return new Interner<E>() {
            public final E intern(E e) {
                E putIfAbsent = makeMap.putIfAbsent(Preconditions.checkNotNull(e), e);
                return putIfAbsent != null ? putIfAbsent : e;
            }
        };
    }

    public static <E> Interner<E> newWeakInterner() {
        return new WeakInterner();
    }

    static class WeakInterner<E> implements Interner<E> {
        /* access modifiers changed from: private */
        public static final FinalizableReferenceQueue frq = new FinalizableReferenceQueue();
        /* access modifiers changed from: private */
        public final ConcurrentMap<WeakInterner<E>.InternReference, WeakInterner<E>.InternReference> map;

        private WeakInterner() {
            this.map = new MapMaker().makeMap();
        }

        public E intern(final E e) {
            E e2;
            E e3;
            final int hashCode = e.hashCode();
            InternReference internReference = (InternReference) this.map.get(new Object() {
                public int hashCode() {
                    return hashCode;
                }

                public boolean equals(Object obj) {
                    if (obj.hashCode() != hashCode) {
                        return false;
                    }
                    return e.equals(((InternReference) obj).get());
                }
            });
            if (internReference != null && (e3 = internReference.get()) != null) {
                return e3;
            }
            InternReference internReference2 = new InternReference(e, hashCode);
            do {
                InternReference putIfAbsent = this.map.putIfAbsent(internReference2, internReference2);
                if (putIfAbsent == null) {
                    return e;
                }
                e2 = putIfAbsent.get();
            } while (e2 == null);
            return e2;
        }

        class InternReference extends FinalizableWeakReference<E> {
            final int hashCode;

            InternReference(E e, int i) {
                super(e, WeakInterner.frq);
                this.hashCode = i;
            }

            public void finalizeReferent() {
                WeakInterner.this.map.remove(this);
            }

            public E get() {
                E e = super.get();
                if (e == null) {
                    finalizeReferent();
                }
                return e;
            }

            public int hashCode() {
                return this.hashCode;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof InternReference)) {
                    return obj.equals(this);
                }
                InternReference internReference = (InternReference) obj;
                if (internReference.hashCode != this.hashCode) {
                    return false;
                }
                Object obj2 = super.get();
                if (obj2 == null || !obj2.equals(internReference.get())) {
                    return false;
                }
                return true;
            }
        }
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new InternerFunction((Interner) Preconditions.checkNotNull(interner));
    }

    static class InternerFunction<E> implements Function<E, E> {
        private final Interner<E> interner;

        public InternerFunction(Interner<E> interner2) {
            this.interner = interner2;
        }

        public E apply(E e) {
            return this.interner.intern(e);
        }

        public int hashCode() {
            return this.interner.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.interner.equals(((InternerFunction) obj).interner);
            }
            return false;
        }
    }
}
