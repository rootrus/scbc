package p040o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p040o.JuristicRequestFormActivity;
import p040o.OffshoreCurrencyActivity;

/* renamed from: o.onReviewButtonClick */
public class onReviewButtonClick extends LoanDetailActivity {
    public static /* synthetic */ String read(String str, String str2) {
        onGetStartedClick.write((Object) str, "$this$substringAfter");
        onGetStartedClick.write((Object) str2, "delimiter");
        onGetStartedClick.write((Object) str, "missingDelimiterValue");
        int read2 = GoodToKnowActivity.read((CharSequence) str, str2, 0, false);
        if (read2 == -1) {
            return str;
        }
        String substring = str.substring(read2 + str2.length(), str.length());
        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "$this$substringBeforeLast");
        onGetStartedClick.write((Object) str2, "delimiter");
        onGetStartedClick.write((Object) str3, "missingDelimiterValue");
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(charSequence, str2, charSequence.length() - 1, false);
        if (IconCompatParcelizer2 == -1) {
            return str3;
        }
        String substring = str.substring(0, IconCompatParcelizer2);
        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String MediaBrowserCompat$ItemReceiver(String str, char c, String str2) {
        onGetStartedClick.write((Object) str, "$this$substringAfterLast");
        onGetStartedClick.write((Object) str2, "missingDelimiterValue");
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(charSequence, '.', charSequence.length() - 1, false);
        if (IconCompatParcelizer2 == -1) {
            return str2;
        }
        String substring = str.substring(IconCompatParcelizer2 + 1, str.length());
        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$regionMatchesImpl");
        onGetStartedClick.write((Object) charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!JustForYouLandingActivity.IconCompatParcelizer(charSequence.charAt(i3), charSequence2.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, char c, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$startsWith");
        return charSequence.length() > 0 && JustForYouLandingActivity.IconCompatParcelizer(charSequence.charAt(0), '-', false);
    }

    public static final int IconCompatParcelizer(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        onGetStartedClick.write((Object) charSequence, "$this$indexOfAny");
        onGetStartedClick.write((Object) cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
            int length = charSequence.length() - 1;
            if (i > length) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z2 = false;
                        break;
                    } else if (JustForYouLandingActivity.IconCompatParcelizer(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return i;
                }
                if (i == length) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(HmlBusinessOwnerReviewSubmissionActivity.write(cArr), i);
        }
    }

    private static final int MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        OffshoreCurrencyActivity offshoreCurrencyActivity;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            offshoreCurrencyActivity = new AddAccountConsentActivity(i, i2);
        } else {
            onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i = length2;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            OffshoreCurrencyActivity.IconCompatParcelizer iconCompatParcelizer = OffshoreCurrencyActivity.MediaBrowserCompat$ItemReceiver;
            offshoreCurrencyActivity = new OffshoreCurrencyActivity(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = offshoreCurrencyActivity.IconCompatParcelizer;
            int i4 = offshoreCurrencyActivity.write;
            int i5 = offshoreCurrencyActivity.read;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence2, charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = offshoreCurrencyActivity.IconCompatParcelizer;
            int i7 = offshoreCurrencyActivity.write;
            int i8 = offshoreCurrencyActivity.read;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (true) {
                    if (!GoodToKnowActivity.read((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int read(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, c, i, false);
    }

    public static final int MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, char c, int i, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return GoodToKnowActivity.IconCompatParcelizer(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ int read(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return GoodToKnowActivity.read(charSequence, str, i, false);
    }

    public static final int read(CharSequence charSequence, String str, int i, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$indexOf");
        onGetStartedClick.write((Object) str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return MediaBrowserCompat$CustomActionResultReceiver(charSequence, str, i, charSequence.length(), z, false);
    }

    public static /* synthetic */ int MediaBrowserCompat$ItemReceiver(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
            i = charSequence.length() - 1;
        }
        return GoodToKnowActivity.IconCompatParcelizer(charSequence, c, i, false);
    }

    public static final int IconCompatParcelizer(CharSequence charSequence, char c, int i, boolean z) {
        boolean z2;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndexOf");
        boolean z3 = charSequence instanceof String;
        if (z3) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        onGetStartedClick.write((Object) charSequence, "$this$lastIndexOfAny");
        onGetStartedClick.write((Object) cArr, "chars");
        if (z3) {
            return ((String) charSequence).lastIndexOf(HmlBusinessOwnerReviewSubmissionActivity.write(cArr), i);
        }
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (i >= 0) {
            char charAt = charSequence.charAt(i);
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    z2 = false;
                    break;
                } else if (JustForYouLandingActivity.IconCompatParcelizer(cArr[i2], charAt, false)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final int IconCompatParcelizer(CharSequence charSequence, String str, int i, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$lastIndexOf");
        onGetStartedClick.write((Object) str, "string");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return MediaBrowserCompat$CustomActionResultReceiver(charSequence, str, i, 0, false, true);
    }

    public static final boolean read(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$contains");
        onGetStartedClick.write((Object) charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (MediaBrowserCompat$CustomActionResultReceiver(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (GoodToKnowActivity.read(charSequence, (String) charSequence2, 0, z) >= 0) {
            return true;
        }
        return false;
    }

    public static final BaseJuristicPinActivity_ViewBinding<AddAccountConsentActivity> MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new openDeepLink(charSequence, 0, i2, new read(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final BaseJuristicPinActivity_ViewBinding<String> write(CharSequence charSequence, String[] strArr, boolean z, int i) {
        onGetStartedClick.write((Object) charSequence, "$this$splitToSequence");
        onGetStartedClick.write((Object) strArr, "delimiters");
        BaseJuristicPinActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(charSequence, strArr, z, 0);
        FundFactSheetActivity write2 = new write(charSequence);
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "$this$map");
        onGetStartedClick.write((Object) write2, "transform");
        return new JuristicSetupNewPinActivity<>(MediaBrowserCompat$CustomActionResultReceiver, write2);
    }

    public static final List<String> read(CharSequence charSequence, String[] strArr, boolean z, int i) {
        onGetStartedClick.write((Object) charSequence, "$this$split");
        onGetStartedClick.write((Object) strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return MediaBrowserCompat$CustomActionResultReceiver(charSequence, str, false, 0);
            }
        }
        BaseJuristicPinActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(charSequence, strArr, false, 0);
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "$this$asIterable");
        Iterable<AddAccountConsentActivity> write2 = new JuristicRequestFormActivity.write(MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(10);
        for (AddAccountConsentActivity IconCompatParcelizer2 : write2) {
            arrayList.add(GoodToKnowActivity.IconCompatParcelizer(charSequence, IconCompatParcelizer2));
        }
        return (List) arrayList;
    }

    public static final List<String> read(CharSequence charSequence, char[] cArr, boolean z, int i) {
        onGetStartedClick.write((Object) charSequence, "$this$split");
        onGetStartedClick.write((Object) cArr, "delimiters");
        if (cArr.length == 1) {
            return MediaBrowserCompat$CustomActionResultReceiver(charSequence, String.valueOf(cArr[0]), false, 0);
        }
        BaseJuristicPinActivity_ViewBinding<AddAccountConsentActivity> MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(charSequence, cArr, 0, false, 0);
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "$this$asIterable");
        Iterable<AddAccountConsentActivity> write2 = new JuristicRequestFormActivity.write(MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(10);
        for (AddAccountConsentActivity IconCompatParcelizer2 : write2) {
            arrayList.add(GoodToKnowActivity.IconCompatParcelizer(charSequence, IconCompatParcelizer2));
        }
        return (List) arrayList;
    }

    private static final List<String> MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int read2 = GoodToKnowActivity.read(charSequence, str, 0, z);
            if (read2 == -1 || i == 1) {
                List<String> singletonList = Collections.singletonList(charSequence.toString());
                onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
                return singletonList;
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, read2).toString());
                i2 = str.length() + read2;
                if ((z2 && arrayList.size() == i - 1) || (read2 = GoodToKnowActivity.read(charSequence, str, i2, z)) == -1) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, read2).toString());
                i2 = str.length() + read2;
                break;
            } while ((read2 = GoodToKnowActivity.read(charSequence, str, i2, z)) == -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final BaseJuristicPinActivity_ViewBinding<String> MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) {
        onGetStartedClick.write((Object) charSequence, "$this$lineSequence");
        return GoodToKnowActivity.write(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0);
    }

    public static final CharSequence MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        onGetStartedClick.write((Object) charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean IconCompatParcelizer(CharSequence charSequence, char c, boolean z) {
        onGetStartedClick.write((Object) charSequence, "$this$contains");
        return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, c, 0, false) >= 0;
    }

    /* renamed from: o.onReviewButtonClick$read */
    static final class read extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<CharSequence, Integer, HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends Integer>> {
        private /* synthetic */ char[] MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ boolean write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(char[] cArr, boolean z) {
            super(2);
            this.MediaBrowserCompat$CustomActionResultReceiver = cArr;
            this.write = z;
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            CharSequence charSequence = (CharSequence) obj;
            int intValue = ((Number) obj2).intValue();
            onGetStartedClick.write((Object) charSequence, "$receiver");
            int IconCompatParcelizer = GoodToKnowActivity.IconCompatParcelizer(charSequence, this.MediaBrowserCompat$CustomActionResultReceiver, intValue, this.write);
            if (IconCompatParcelizer < 0) {
                return null;
            }
            return new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(IconCompatParcelizer), 1);
        }
    }

    /* renamed from: o.onReviewButtonClick$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<CharSequence, Integer, HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends Integer>> {
        private /* synthetic */ List read;
        private /* synthetic */ boolean write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(List list, boolean z) {
            super(2);
            this.read = list;
            this.write = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object r14, java.lang.Object r15) {
            /*
                r13 = this;
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                java.lang.Number r15 = (java.lang.Number) r15
                int r15 = r15.intValue()
                java.lang.String r0 = "$receiver"
                p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
                java.util.List r0 = r13.read
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r7 = r13.write
                r1 = 0
                r8 = 0
                if (r7 != 0) goto L_0x008e
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto L_0x008e
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.String r2 = "$this$single"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
                boolean r4 = r0 instanceof java.util.List
                if (r4 == 0) goto L_0x004f
                java.util.List r0 = (java.util.List) r0
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
                int r2 = r0.size()
                if (r2 == 0) goto L_0x0045
                if (r2 != r3) goto L_0x003b
                java.lang.Object r0 = r0.get(r1)
                goto L_0x0064
            L_0x003b:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r15 = "List has more than one element."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x0045:
                java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
                java.lang.String r15 = "List is empty."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x004f:
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r2 = r0.next()
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L_0x007a
                r0 = r2
            L_0x0064:
                java.lang.String r0 = (java.lang.String) r0
                r2 = 4
                int r14 = p040o.GoodToKnowActivity.read((java.lang.CharSequence) r14, (java.lang.String) r0, (int) r15, (boolean) r1, (int) r2)
                if (r14 >= 0) goto L_0x006f
                goto L_0x0127
            L_0x006f:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                o.HmlVerifyEmailSuccessfulActivity r15 = new o.HmlVerifyEmailSuccessfulActivity
                r15.<init>(r14, r0)
                goto L_0x0128
            L_0x007a:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r15 = "Collection has more than one element."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x0084:
                java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
                java.lang.String r15 = "Collection is empty."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x008e:
                o.AddAccountConsentActivity r2 = new o.AddAccountConsentActivity
                if (r15 >= 0) goto L_0x0093
                r15 = r1
            L_0x0093:
                int r1 = r14.length()
                r2.<init>(r15, r1)
                o.OffshoreCurrencyActivity r2 = (p040o.OffshoreCurrencyActivity) r2
                boolean r15 = r14 instanceof java.lang.String
                if (r15 == 0) goto L_0x00e5
                int r15 = r2.IconCompatParcelizer
                int r9 = r2.write
                int r10 = r2.read
                if (r10 < 0) goto L_0x00ab
                if (r15 > r9) goto L_0x0127
                goto L_0x00ad
            L_0x00ab:
                if (r15 < r9) goto L_0x0127
            L_0x00ad:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r11 = r1.iterator()
            L_0x00b4:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L_0x00d2
                java.lang.Object r12 = r11.next()
                r1 = r12
                java.lang.String r1 = (java.lang.String) r1
                r2 = 0
                r3 = r14
                java.lang.String r3 = (java.lang.String) r3
                int r5 = r1.length()
                r4 = r15
                r6 = r7
                boolean r1 = p040o.GoodToKnowActivity.read(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x00b4
                goto L_0x00d3
            L_0x00d2:
                r12 = r8
            L_0x00d3:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 == 0) goto L_0x00e1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                o.HmlVerifyEmailSuccessfulActivity r15 = new o.HmlVerifyEmailSuccessfulActivity
                r15.<init>(r14, r12)
                goto L_0x0128
            L_0x00e1:
                if (r15 == r9) goto L_0x0127
                int r15 = r15 + r10
                goto L_0x00ad
            L_0x00e5:
                int r15 = r2.IconCompatParcelizer
                int r1 = r2.write
                int r2 = r2.read
                if (r2 < 0) goto L_0x00f0
                if (r15 > r1) goto L_0x0127
                goto L_0x00f2
            L_0x00f0:
                if (r15 < r1) goto L_0x0127
            L_0x00f2:
                r3 = r0
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x00f9:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0114
                java.lang.Object r4 = r3.next()
                r5 = r4
                java.lang.String r5 = (java.lang.String) r5
                r6 = r5
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                int r5 = r5.length()
                boolean r5 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.CharSequence) r6, (java.lang.CharSequence) r14, (int) r15, (int) r5, (boolean) r7)
                if (r5 == 0) goto L_0x00f9
                goto L_0x0115
            L_0x0114:
                r4 = r8
            L_0x0115:
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L_0x0123
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                o.HmlVerifyEmailSuccessfulActivity r15 = new o.HmlVerifyEmailSuccessfulActivity
                r15.<init>(r14, r4)
                goto L_0x0128
            L_0x0123:
                if (r15 == r1) goto L_0x0127
                int r15 = r15 + r2
                goto L_0x00f2
            L_0x0127:
                r15 = r8
            L_0x0128:
                if (r15 == 0) goto L_0x013d
                A r14 = r15.MediaBrowserCompat$CustomActionResultReceiver
                B r15 = r15.write
                java.lang.String r15 = (java.lang.String) r15
                int r15 = r15.length()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                o.HmlVerifyEmailSuccessfulActivity r8 = new o.HmlVerifyEmailSuccessfulActivity
                r8.<init>(r14, r15)
            L_0x013d:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.onReviewButtonClick.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: o.onReviewButtonClick$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<AddAccountConsentActivity, String> {
        private /* synthetic */ CharSequence read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(CharSequence charSequence) {
            super(1);
            this.read = charSequence;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AddAccountConsentActivity addAccountConsentActivity = (AddAccountConsentActivity) obj;
            onGetStartedClick.write((Object) addAccountConsentActivity, "it");
            return GoodToKnowActivity.IconCompatParcelizer(this.read, addAccountConsentActivity);
        }
    }

    private static /* synthetic */ BaseJuristicPinActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if (i >= 0) {
            onGetStartedClick.write((Object) strArr, "$this$asList");
            List asList = Arrays.asList(strArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            return new openDeepLink(charSequence, 0, i, new IconCompatParcelizer(asList, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final String IconCompatParcelizer(CharSequence charSequence, AddAccountConsentActivity addAccountConsentActivity) {
        onGetStartedClick.write((Object) charSequence, "$this$substring");
        onGetStartedClick.write((Object) addAccountConsentActivity, "range");
        return charSequence.subSequence(addAccountConsentActivity.IconCompatParcelizer, addAccountConsentActivity.write + 1).toString();
    }
}
