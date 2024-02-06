package com.google.common.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jnbis.internal.NistHelper;

public abstract class CharMatcher implements Predicate<Character> {
    public static final CharMatcher ANY = new CharMatcher() {
        public final boolean matches(char c) {
            return true;
        }

        public final CharMatcher precomputed() {
            return this;
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public final int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        public final int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        public final boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public final boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        public final String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        public final String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        public final String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        public final String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        public final int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        public final CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        /* renamed from: or */
        public final CharMatcher mo51375or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public final CharMatcher negate() {
            return NONE;
        }
    };
    public static final CharMatcher ASCII = inRange(0, 127);
    public static final CharMatcher BREAKING_WHITESPACE = anyOf(BREAKING_WHITESPACE_CHARS).mo51375or(inRange(8192, 8198)).mo51375or(inRange(8200, 8202)).precomputed();
    private static final String BREAKING_WHITESPACE_CHARS = "\t\n\u000b\f\r     　";
    public static final CharMatcher DIGIT;
    public static final CharMatcher INVISIBLE = inRange(0, ' ').mo51375or(inRange(127, 160)).mo51375or(m3600is(173)).mo51375or(inRange(1536, 1539)).mo51375or(anyOf("۝܏ ឴឵᠎")).mo51375or(inRange(8192, 8207)).mo51375or(inRange(8232, 8239)).mo51375or(inRange(8287, 8292)).mo51375or(inRange(8298, 8303)).mo51375or(m3600is(12288)).mo51375or(inRange(55296, 63743)).mo51375or(anyOf("﻿￹￺￻")).precomputed();
    public static final CharMatcher JAVA_DIGIT = new CharMatcher() {
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            return Character.isDigit(c);
        }
    };
    public static final CharMatcher JAVA_ISO_CONTROL = inRange(0, 31).mo51375or(inRange(127, 159));
    public static final CharMatcher JAVA_LETTER = new CharMatcher() {
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            return Character.isLetter(c);
        }
    };
    public static final CharMatcher JAVA_LETTER_OR_DIGIT = new CharMatcher() {
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }
    };
    public static final CharMatcher JAVA_LOWER_CASE = new CharMatcher() {
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            return Character.isLowerCase(c);
        }
    };
    public static final CharMatcher JAVA_UPPER_CASE = new CharMatcher() {
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            return Character.isUpperCase(c);
        }
    };
    public static final CharMatcher JAVA_WHITESPACE = inRange(9, 13).mo51375or(inRange(NistHelper.SEP_FS, ' ')).mo51375or(m3600is(5760)).mo51375or(m3600is(6158)).mo51375or(inRange(8192, 8198)).mo51375or(inRange(8200, 8203)).mo51375or(inRange(8232, 8233)).mo51375or(m3600is(8287)).mo51375or(m3600is(12288)).precomputed();
    public static final CharMatcher NONE = new CharMatcher() {
        public final boolean matches(char c) {
            return false;
        }

        public final CharMatcher precomputed() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void setBits(LookupTable lookupTable) {
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public final int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        public final int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public final boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public final String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public final String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public final String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        public final String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public final String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public final int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        public final CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        /* renamed from: or */
        public final CharMatcher mo51375or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public final CharMatcher negate() {
            return ANY;
        }
    };
    private static final String NON_BREAKING_WHITESPACE_CHARS = " ᠎ ";
    public static final CharMatcher SINGLE_WIDTH = inRange(0, 1273).mo51375or(m3600is(1470)).mo51375or(inRange(1488, 1514)).mo51375or(m3600is(1523)).mo51375or(m3600is(1524)).mo51375or(inRange(1536, 1791)).mo51375or(inRange(1872, 1919)).mo51375or(inRange(3584, 3711)).mo51375or(inRange(7680, 8367)).mo51375or(inRange(8448, 8506)).mo51375or(inRange(64336, 65023)).mo51375or(inRange(65136, 65279)).mo51375or(inRange(65377, 65500)).precomputed();
    public static final CharMatcher WHITESPACE = anyOf("\t\n\u000b\f\r     　 ᠎ ").mo51375or(inRange(8192, 8202)).precomputed();

    public abstract boolean matches(char c);

    static {
        CharMatcher inRange = inRange('0', '9');
        for (char c : "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray()) {
            inRange = inRange.mo51375or(inRange(c, (char) (c + 9)));
        }
        DIGIT = inRange.precomputed();
    }

    /* renamed from: is */
    public static CharMatcher m3600is(final char c) {
        return new CharMatcher() {
            public final CharMatcher precomputed() {
                return this;
            }

            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return c == c;
            }

            public final String replaceFrom(CharSequence charSequence, char c) {
                return charSequence.toString().replace(c, c);
            }

            public final CharMatcher and(CharMatcher charMatcher) {
                return charMatcher.matches(c) ? this : NONE;
            }

            /* renamed from: or */
            public final CharMatcher mo51375or(CharMatcher charMatcher) {
                return !charMatcher.matches(c) ? CharMatcher.super.mo51375or(charMatcher) : charMatcher;
            }

            public final CharMatcher negate() {
                return isNot(c);
            }

            /* access modifiers changed from: package-private */
            public final void setBits(LookupTable lookupTable) {
                lookupTable.set(c);
            }
        };
    }

    public static CharMatcher isNot(final char c) {
        return new CharMatcher() {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return c != c;
            }

            public final CharMatcher and(CharMatcher charMatcher) {
                return charMatcher.matches(c) ? CharMatcher.super.and(charMatcher) : charMatcher;
            }

            /* renamed from: or */
            public final CharMatcher mo51375or(CharMatcher charMatcher) {
                return charMatcher.matches(c) ? ANY : this;
            }

            public final CharMatcher negate() {
                return m3600is(c);
            }
        };
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return NONE;
        }
        if (length == 1) {
            return m3600is(charSequence.charAt(0));
        }
        if (length != 2) {
            final char[] charArray = charSequence.toString().toCharArray();
            Arrays.sort(charArray);
            return new CharMatcher() {
                public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                    return CharMatcher.super.apply((Character) obj);
                }

                public final boolean matches(char c) {
                    return Arrays.binarySearch(charArray, c) >= 0;
                }

                /* access modifiers changed from: package-private */
                public final void setBits(LookupTable lookupTable) {
                    for (char c : charArray) {
                        lookupTable.set(c);
                    }
                }
            };
        }
        final char charAt = charSequence.charAt(0);
        final char charAt2 = charSequence.charAt(1);
        return new CharMatcher() {
            public final CharMatcher precomputed() {
                return this;
            }

            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return c == charAt || c == charAt2;
            }

            /* access modifiers changed from: package-private */
            public final void setBits(LookupTable lookupTable) {
                lookupTable.set(charAt);
                lookupTable.set(charAt2);
            }
        };
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    public static CharMatcher inRange(final char c, final char c2) {
        Preconditions.checkArgument(c2 >= c);
        return new CharMatcher() {
            public final CharMatcher precomputed() {
                return this;
            }

            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return c <= c && c <= c2;
            }

            /* access modifiers changed from: package-private */
            public final void setBits(LookupTable lookupTable) {
                char c = c;
                while (true) {
                    lookupTable.set(c);
                    char c2 = (char) (c + 1);
                    if (c != c2) {
                        c = c2;
                    } else {
                        return;
                    }
                }
            }
        };
    }

    public static CharMatcher forPredicate(final Predicate<? super Character> predicate) {
        Preconditions.checkNotNull(predicate);
        if (predicate instanceof CharMatcher) {
            return (CharMatcher) predicate;
        }
        return new CharMatcher() {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return apply((Character) obj);
            }

            public final boolean matches(char c) {
                return predicate.apply(Character.valueOf(c));
            }

            public final boolean apply(Character ch) {
                return predicate.apply(Preconditions.checkNotNull(ch));
            }
        };
    }

    public CharMatcher negate() {
        return new CharMatcher() {
            public /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public boolean matches(char c) {
                return !this.matches(c);
            }

            public boolean matchesAllOf(CharSequence charSequence) {
                return this.matchesNoneOf(charSequence);
            }

            public boolean matchesNoneOf(CharSequence charSequence) {
                return this.matchesAllOf(charSequence);
            }

            public int countIn(CharSequence charSequence) {
                return charSequence.length() - this.countIn(charSequence);
            }

            public CharMatcher negate() {
                return this;
            }
        };
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(Arrays.asList(new CharMatcher[]{this, (CharMatcher) Preconditions.checkNotNull(charMatcher)}));
    }

    static class And extends CharMatcher {
        List<CharMatcher> components;

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        And(List<CharMatcher> list) {
            this.components = list;
        }

        public boolean matches(char c) {
            for (CharMatcher matches : this.components) {
                if (!matches.matches(c)) {
                    return false;
                }
            }
            return true;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            ArrayList arrayList = new ArrayList(this.components);
            arrayList.add(Preconditions.checkNotNull(charMatcher));
            return new And(arrayList);
        }
    }

    /* renamed from: or */
    public CharMatcher mo51375or(CharMatcher charMatcher) {
        return new C7644Or(Arrays.asList(new CharMatcher[]{this, (CharMatcher) Preconditions.checkNotNull(charMatcher)}));
    }

    /* renamed from: com.google.common.base.CharMatcher$Or */
    static class C7644Or extends CharMatcher {
        List<CharMatcher> components;

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        C7644Or(List<CharMatcher> list) {
            this.components = list;
        }

        public boolean matches(char c) {
            for (CharMatcher matches : this.components) {
                if (matches.matches(c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: or */
        public CharMatcher mo51375or(CharMatcher charMatcher) {
            ArrayList arrayList = new ArrayList(this.components);
            arrayList.add(Preconditions.checkNotNull(charMatcher));
            return new C7644Or(arrayList);
        }

        /* access modifiers changed from: package-private */
        public void setBits(LookupTable lookupTable) {
            for (CharMatcher bits : this.components) {
                bits.setBits(lookupTable);
            }
        }
    }

    public CharMatcher precomputed() {
        return Platform.precomputeCharMatcher(this);
    }

    /* access modifiers changed from: package-private */
    public CharMatcher precomputedInternal() {
        final LookupTable lookupTable = new LookupTable();
        setBits(lookupTable);
        return new CharMatcher() {
            public CharMatcher precomputed() {
                return this;
            }

            public /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public boolean matches(char c) {
                return lookupTable.get(c);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void setBits(LookupTable lookupTable) {
        char c = 0;
        while (true) {
            if (matches(c)) {
                lookupTable.set(c);
            }
            char c2 = (char) (c + 1);
            if (c != 65535) {
                c = c2;
            } else {
                return;
            }
        }
    }

    static final class LookupTable {
        int[] data;

        private LookupTable() {
            this.data = new int[2048];
        }

        /* access modifiers changed from: package-private */
        public final void set(char c) {
            int[] iArr = this.data;
            int i = c >> 5;
            iArr[i] = (1 << c) | iArr[i];
        }

        /* access modifiers changed from: package-private */
        public final boolean get(char c) {
            return ((1 << c) & this.data[c >> 5]) != 0;
        }
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public int indexIn(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public int indexIn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i, length);
        while (i < length) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public int countIn(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public String removeFrom(CharSequence charSequence) {
        String obj = charSequence.toString();
        int indexIn = indexIn(obj);
        if (indexIn == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            if (indexIn == charArray.length) {
                return new String(charArray, 0, indexIn - i);
            }
            if (matches(charArray[indexIn])) {
                i++;
            } else {
                charArray[indexIn - i] = charArray[indexIn];
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        String obj = charSequence.toString();
        int indexIn = indexIn(obj);
        if (indexIn == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        charArray[indexIn] = c;
        while (true) {
            indexIn++;
            if (indexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[indexIn])) {
                charArray[indexIn] = c;
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String obj = charSequence.toString();
        int indexIn = indexIn(obj);
        if (indexIn == -1) {
            return obj;
        }
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append(obj, i, indexIn);
            sb.append(charSequence2);
            i = indexIn + 1;
            indexIn = indexIn(obj, i);
        } while (indexIn != -1);
        sb.append(obj, i, length2);
        return sb.toString();
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        do {
            length--;
            if (length <= i || !matches(charSequence.charAt(length))) {
            }
            length--;
            break;
        } while (!matches(charSequence.charAt(length)));
        return charSequence.subSequence(i, length + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        return charSequence.subSequence(i, length).toString();
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        while (length >= 0 && matches(charSequence.charAt(length))) {
            length--;
        }
        return charSequence.subSequence(0, length + 1).toString();
    }

    public String collapseFrom(CharSequence charSequence, char c) {
        int indexIn = indexIn(charSequence);
        if (indexIn == -1) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder(charSequence.length());
        sb.append(charSequence.subSequence(0, indexIn));
        sb.append(c);
        boolean z = true;
        for (int i = indexIn + 1; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!apply(Character.valueOf(charAt))) {
                sb.append(charAt);
                z = false;
            } else if (!z) {
                sb.append(c);
                z = true;
            }
        }
        return sb.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c) {
        int indexIn = negate().indexIn(charSequence);
        if (indexIn == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder(charSequence.length());
        boolean z = false;
        while (indexIn < charSequence.length()) {
            char charAt = charSequence.charAt(indexIn);
            if (apply(Character.valueOf(charAt))) {
                z = true;
            } else {
                if (z) {
                    sb.append(c);
                    z = false;
                }
                sb.append(charAt);
            }
            indexIn++;
        }
        return sb.toString();
    }

    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }
}
