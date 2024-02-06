package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;

final class SortedLists {

    enum Relation {
        LOWER {
            /* access modifiers changed from: package-private */
            public final <E> int exactMatchNotFound(List<? extends E> list, E e, int i, Comparator<? super E> comparator) {
                return i - 1;
            }

            /* access modifiers changed from: package-private */
            public final Relation reverse() {
                return HIGHER;
            }

            /* access modifiers changed from: package-private */
            public final <E> int exactMatchFound(List<? extends E> list, E e, int i, int i2, int i3, Comparator<? super E> comparator, boolean z) {
                return FLOOR.exactMatchFound(list, e, i, i2, i3, comparator, z) - 1;
            }
        },
        FLOOR {
            /* access modifiers changed from: package-private */
            public final <E> int exactMatchNotFound(List<? extends E> list, E e, int i, Comparator<? super E> comparator) {
                return i - 1;
            }

            /* access modifiers changed from: package-private */
            public final Relation reverse() {
                return CEILING;
            }

            /* access modifiers changed from: package-private */
            public final <E> int exactMatchFound(List<? extends E> list, E e, int i, int i2, int i3, Comparator<? super E> comparator, boolean z) {
                if (!z) {
                    return i2;
                }
                while (i < i2) {
                    int i4 = ((i2 - i) / 2) + i;
                    if (comparator.compare(list.get(i4), e) < 0) {
                        i = i4 + 1;
                    } else {
                        i2 = i4;
                    }
                }
                return i;
            }
        },
        EQUAL {
            /* access modifiers changed from: package-private */
            public final <E> int exactMatchFound(List<? extends E> list, E e, int i, int i2, int i3, Comparator<? super E> comparator, boolean z) {
                return i2;
            }

            /* access modifiers changed from: package-private */
            public final <E> int exactMatchNotFound(List<? extends E> list, E e, int i, Comparator<? super E> comparator) {
                return -1;
            }

            /* access modifiers changed from: package-private */
            public final Relation reverse() {
                return this;
            }
        },
        CEILING {
            /* access modifiers changed from: package-private */
            public final <E> int exactMatchNotFound(List<? extends E> list, E e, int i, Comparator<? super E> comparator) {
                return i;
            }

            /* access modifiers changed from: package-private */
            public final Relation reverse() {
                return FLOOR;
            }

            /* access modifiers changed from: package-private */
            public final <E> int exactMatchFound(List<? extends E> list, E e, int i, int i2, int i3, Comparator<? super E> comparator, boolean z) {
                if (!z) {
                    return i2;
                }
                while (i2 < i3) {
                    int i4 = (((i3 - i2) + 1) / 2) + i2;
                    if (comparator.compare(list.get(i4), e) > 0) {
                        i3 = i4 - 1;
                    } else {
                        i2 = i4;
                    }
                }
                return i2;
            }
        },
        HIGHER {
            /* access modifiers changed from: package-private */
            public final <E> int exactMatchNotFound(List<? extends E> list, E e, int i, Comparator<? super E> comparator) {
                return i;
            }

            /* access modifiers changed from: package-private */
            public final Relation reverse() {
                return LOWER;
            }

            /* access modifiers changed from: package-private */
            public final <E> int exactMatchFound(List<? extends E> list, E e, int i, int i2, int i3, Comparator<? super E> comparator, boolean z) {
                return CEILING.exactMatchFound(list, e, i, i2, i3, comparator, z) + 1;
            }
        };

        /* access modifiers changed from: package-private */
        public abstract <E> int exactMatchFound(List<? extends E> list, E e, int i, int i2, int i3, Comparator<? super E> comparator, boolean z);

        /* access modifiers changed from: package-private */
        public abstract <E> int exactMatchNotFound(List<? extends E> list, E e, int i, Comparator<? super E> comparator);

        /* access modifiers changed from: package-private */
        public abstract Relation reverse();
    }

    private SortedLists() {
    }

    static <E> int binarySearch(List<? extends E> list, E e, Comparator<? super E> comparator, Relation relation) {
        return binarySearch(list, e, comparator, relation, true);
    }

    static <E> int binarySearch(List<? extends E> list, E e, Comparator<? super E> comparator, Relation relation, boolean z) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(relation);
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = i + ((size - i) / 2);
            int compare = comparator.compare(e, list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return relation.exactMatchFound(list, e, i, i2, size, comparator, z);
            } else {
                i = i2 + 1;
            }
        }
        return relation.exactMatchNotFound(list, e, i, comparator);
    }
}
