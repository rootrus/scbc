package com.google.common.base;

import com.google.android.gms.common.api.Api;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Splitter {
    /* access modifiers changed from: private */
    public final int limit;
    /* access modifiers changed from: private */
    public final boolean omitEmptyStrings;
    /* access modifiers changed from: private */
    public final Strategy strategy;
    /* access modifiers changed from: private */
    public final CharMatcher trimmer;

    interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy2) {
        this(strategy2, false, CharMatcher.NONE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private Splitter(Strategy strategy2, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = strategy2;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    /* renamed from: on */
    public static Splitter m3611on(char c) {
        return m3612on(CharMatcher.m3600is(c));
    }

    /* renamed from: on */
    public static Splitter m3612on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* access modifiers changed from: package-private */
                    public int separatorEnd(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: package-private */
                    public int separatorStart(int i) {
                        return charMatcher.indexIn(this.toSplit, i);
                    }
                };
            }
        });
    }

    /* renamed from: on */
    public static Splitter m3613on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        return new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    public int separatorStart(int i) {
                        int length = str.length();
                        int length2 = this.toSplit.length();
                        while (i <= length2 - length) {
                            int i2 = 0;
                            while (i2 < length) {
                                if (this.toSplit.charAt(i2 + i) != str.charAt(i2)) {
                                    i++;
                                } else {
                                    i2++;
                                }
                            }
                            return i;
                        }
                        return -1;
                    }

                    public int separatorEnd(int i) {
                        return i + str.length();
                    }
                };
            }
        });
    }

    /* renamed from: on */
    public static Splitter m3614on(final Pattern pattern) {
        Preconditions.checkNotNull(pattern);
        Object[] objArr = {pattern};
        Preconditions.checkArgument(!pattern.matcher("").matches(), "The pattern may not match the empty string: %s", objArr);
        return new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                final Matcher matcher = pattern.matcher(charSequence);
                return new SplittingIterator(splitter, charSequence) {
                    public int separatorStart(int i) {
                        if (matcher.find(i)) {
                            return matcher.start();
                        }
                        return -1;
                    }

                    public int separatorEnd(int i) {
                        return matcher.end();
                    }
                };
            }
        });
    }

    public static Splitter onPattern(String str) {
        return m3614on(Pattern.compile(str));
    }

    public static Splitter fixedLength(final int i) {
        Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    public int separatorEnd(int i) {
                        return i;
                    }

                    public int separatorStart(int i) {
                        int i2 = i + i;
                        if (i2 >= this.toSplit.length()) {
                            return -1;
                        }
                        return i2;
                    }
                };
            }
        });
    }

    public final Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public final Splitter limit(int i) {
        Preconditions.checkArgument(i > 0, "must be greater then zero: %s", Integer.valueOf(i));
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public final Splitter trimResults() {
        return trimResults(CharMatcher.WHITESPACE);
    }

    public final Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public final Iterable<String> split(final CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return Splitter.this.strategy.iterator(Splitter.this, charSequence);
            }
        };
    }

    static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        /* access modifiers changed from: package-private */
        public abstract int separatorEnd(int i);

        /* access modifiers changed from: package-private */
        public abstract int separatorStart(int i);

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            super();
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        /* access modifiers changed from: protected */
        public String computeNext() {
            int i;
            int i2;
            do {
                i = this.offset;
                if (i != -1) {
                    int separatorStart = separatorStart(i);
                    if (separatorStart == -1) {
                        separatorStart = this.toSplit.length();
                        this.offset = -1;
                    } else {
                        this.offset = separatorEnd(separatorStart);
                    }
                    while (i < separatorStart && this.trimmer.matches(this.toSplit.charAt(i))) {
                        i++;
                    }
                    while (i2 > i && this.trimmer.matches(this.toSplit.charAt(i2 - 1))) {
                        separatorStart = i2 - 1;
                    }
                    if (!this.omitEmptyStrings) {
                        break;
                    }
                } else {
                    return (String) endOfData();
                }
            } while (i == i2);
            int i3 = this.limit;
            if (i3 == 1) {
                i2 = this.toSplit.length();
                this.offset = -1;
                while (i2 > i && this.trimmer.matches(this.toSplit.charAt(i2 - 1))) {
                    i2--;
                }
            } else {
                this.limit = i3 - 1;
            }
            return this.toSplit.subSequence(i, i2).toString();
        }
    }

    static abstract class AbstractIterator<T> implements Iterator<T> {
        T next;
        State state;

        enum State {
            READY,
            NOT_READY,
            DONE,
            FAILED
        }

        /* access modifiers changed from: protected */
        public abstract T computeNext();

        private AbstractIterator() {
            this.state = State.NOT_READY;
        }

        /* access modifiers changed from: protected */
        public final T endOfData() {
            this.state = State.DONE;
            return null;
        }

        public final boolean hasNext() {
            Preconditions.checkState(this.state != State.FAILED);
            int i = C76656.f3265xc11dea38[this.state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return tryToComputeNext();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean tryToComputeNext() {
            this.state = State.FAILED;
            this.next = computeNext();
            if (this.state == State.DONE) {
                return false;
            }
            this.state = State.READY;
            return true;
        }

        public final T next() {
            if (hasNext()) {
                this.state = State.NOT_READY;
                return this.next;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.base.Splitter$6 */
    static /* synthetic */ class C76656 {

        /* renamed from: $SwitchMap$com$google$common$base$Splitter$AbstractIterator$State */
        static final /* synthetic */ int[] f3265xc11dea38;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.base.Splitter$AbstractIterator$State[] r0 = com.google.common.base.Splitter.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3265xc11dea38 = r0
                com.google.common.base.Splitter$AbstractIterator$State r1 = com.google.common.base.Splitter.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3265xc11dea38     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.Splitter$AbstractIterator$State r1 = com.google.common.base.Splitter.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.C76656.<clinit>():void");
        }
    }
}
