package com.google.common.base;

import org.bouncycastle.pqc.math.linearalgebra.Matrix;

public enum CaseFormat {
    LOWER_HYPHEN(CharMatcher.m3600is('-'), "-"),
    LOWER_UNDERSCORE(CharMatcher.m3600is('_'), "_"),
    LOWER_CAMEL(CharMatcher.inRange('A', Matrix.MATRIX_TYPE_ZERO), ""),
    UPPER_CAMEL(CharMatcher.inRange('A', Matrix.MATRIX_TYPE_ZERO), ""),
    UPPER_UNDERSCORE(CharMatcher.m3600is('_'), "_");
    
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    private CaseFormat(CharMatcher charMatcher, String str) {
        this.wordBoundary = charMatcher;
        this.wordSeparator = str;
    }

    /* renamed from: to */
    public final String mo51362to(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        if (caseFormat == null) {
            throw null;
        } else if (str == null) {
            throw null;
        } else if (caseFormat == this) {
            return str;
        } else {
            int i = C76281.$SwitchMap$com$google$common$base$CaseFormat[ordinal()];
            if (i == 1) {
                int i2 = C76281.$SwitchMap$com$google$common$base$CaseFormat[caseFormat.ordinal()];
                if (i2 == 2) {
                    return Ascii.toUpperCase(str);
                }
                if (i2 == 3) {
                    return str.replace('_', '-');
                }
            } else if (i == 2) {
                int i3 = C76281.$SwitchMap$com$google$common$base$CaseFormat[caseFormat.ordinal()];
                if (i3 == 1) {
                    return Ascii.toLowerCase(str);
                }
                if (i3 == 3) {
                    return Ascii.toLowerCase(str.replace('_', '-'));
                }
            } else if (i == 3) {
                int i4 = C76281.$SwitchMap$com$google$common$base$CaseFormat[caseFormat.ordinal()];
                if (i4 == 1) {
                    return str.replace('-', '_');
                }
                if (i4 == 2) {
                    return Ascii.toUpperCase(str.replace('-', '_'));
                }
            }
            int i5 = 0;
            int i6 = -1;
            while (true) {
                i6 = this.wordBoundary.indexIn(str, i6 + 1);
                if (i6 == -1) {
                    break;
                }
                if (i5 == 0) {
                    sb = new StringBuilder(str.length() + (this.wordSeparator.length() << 2));
                    sb.append(caseFormat.normalizeFirstWord(str.substring(i5, i6)));
                } else {
                    sb.append(caseFormat.normalizeWord(str.substring(i5, i6)));
                }
                sb.append(caseFormat.wordSeparator);
                i5 = this.wordSeparator.length() + i6;
            }
            if (i5 == 0) {
                return caseFormat.normalizeFirstWord(str);
            }
            sb.append(caseFormat.normalizeWord(str.substring(i5)));
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$1 */
    static /* synthetic */ class C76281 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$base$CaseFormat = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.common.base.CaseFormat[] r0 = com.google.common.base.CaseFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$common$base$CaseFormat = r0
                com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.LOWER_UNDERSCORE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$common$base$CaseFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.UPPER_UNDERSCORE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$common$base$CaseFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.LOWER_HYPHEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$common$base$CaseFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.LOWER_CAMEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$common$base$CaseFormat     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.common.base.CaseFormat r1 = com.google.common.base.CaseFormat.UPPER_CAMEL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.CaseFormat.C76281.<clinit>():void");
        }
    }

    private String normalizeFirstWord(String str) {
        if (C76281.$SwitchMap$com$google$common$base$CaseFormat[ordinal()] != 4) {
            return normalizeWord(str);
        }
        return Ascii.toLowerCase(str);
    }

    private String normalizeWord(String str) {
        int i = C76281.$SwitchMap$com$google$common$base$CaseFormat[ordinal()];
        if (i == 1) {
            return Ascii.toLowerCase(str);
        }
        if (i == 2) {
            return Ascii.toUpperCase(str);
        }
        if (i == 3) {
            return Ascii.toLowerCase(str);
        }
        if (i == 4) {
            return firstCharOnlyToUpper(str);
        }
        if (i == 5) {
            return firstCharOnlyToUpper(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown case: ");
        sb.append(this);
        throw new RuntimeException(sb.toString());
    }

    private static String firstCharOnlyToUpper(String str) {
        int length = str.length();
        if (length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(Ascii.toUpperCase(str.charAt(0)));
        sb.append(Ascii.toLowerCase(str.substring(1)));
        return sb.toString();
    }
}
