package okhttp3.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import p040o.AddAccountConsentActivity;
import p040o.C1132xe4073f0a;
import p040o.C7043xa484e06c;
import p040o.C7297xe1f4fb57;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundOnboardingSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.GroupFavoriteActivity;
import p040o.HmlNTBeKYCLandingActivity_ViewBinding;
import p040o.HmlNationalIdHelpActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.LifestyleCustomizationActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onAlienCardTabClicked;
import p040o.onGetStartedClick;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo44765of(new String[0]);
    public static final RequestBody EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, EMPTY_BYTE_ARRAY, (MediaType) null, 0, 0, 7, (Object) null);
    public static final ResponseBody EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, EMPTY_BYTE_ARRAY, (MediaType) null, 1, (Object) null);
    private static final onAlienCardTabClicked UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final LifestyleCustomizationActivity VERIFY_AS_IP_ADDRESS = new LifestyleCustomizationActivity("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'A';
        if ('a' <= c && 'f' >= c) {
            c2 = 'a';
        } else if ('A' > c || 'F' < c) {
            return -1;
        }
        return (c - c2) + 10;
    }

    static {
        C7297xe1f4fb57 onaliencardtabclicked_mediabrowsercompat_customactionresultreceiver = onAlienCardTabClicked.MediaBrowserCompat$ItemReceiver;
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "efbbbf", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "feff", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver3 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "fffe", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver4 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "0000ffff", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver5 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "ffff0000", "$receiver");
        UNICODE_BOMS = onaliencardtabclicked_mediabrowsercompat_customactionresultreceiver.read(PinChangeSuccessActivity.write("efbbbf"), PinChangeSuccessActivity.write("feff"), PinChangeSuccessActivity.write("fffe"), PinChangeSuccessActivity.write("0000ffff"), PinChangeSuccessActivity.write("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        UTC = timeZone;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        onGetStartedClick.write((Object) str, "name");
        return new Util$threadFactory$1(str, z);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        onGetStartedClick.write((Object) strArr, "$this$intersect");
        onGetStartedClick.write((Object) strArr2, "other");
        onGetStartedClick.write((Object) comparator, "comparator");
        List arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        onGetStartedClick.write((Object) strArr, "$this$hasIntersection");
        onGetStartedClick.write((Object) comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        onGetStartedClick.write((Object) httpUrl, "$this$toHostHeader");
        if (GoodToKnowActivity.read(httpUrl.host(), ":", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(httpUrl.host());
            sb.append(']');
            str = sb.toString();
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(httpUrl.port());
        return sb2.toString();
    }

    public static final String[] concat(String[] strArr, String str) {
        onGetStartedClick.write((Object) strArr, "$this$concat");
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        onGetStartedClick.write((Object) strArr2, "$this$lastIndex");
        strArr2[strArr2.length - 1] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        onGetStartedClick.write((Object) str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        onGetStartedClick.write((Object) str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final String trimSubstring(String str, int i, int i2) {
        onGetStartedClick.write((Object) str, "$this$trimSubstring");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        onGetStartedClick.write((Object) str, "$this$delimiterOffset");
        onGetStartedClick.write((Object) str2, "delimiters");
        while (i < i2) {
            CharSequence charSequence = str2;
            char charAt = str.charAt(i);
            onGetStartedClick.write((Object) charSequence, "$this$contains");
            boolean z = false;
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, charAt, 0, false) >= 0) {
                z = true;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        onGetStartedClick.write((Object) str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        onGetStartedClick.write((Object) str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean canParseAsIpAddress(String str) {
        onGetStartedClick.write((Object) str, "$this$canParseAsIpAddress");
        LifestyleCustomizationActivity lifestyleCustomizationActivity = VERIFY_AS_IP_ADDRESS;
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "input");
        return lifestyleCustomizationActivity.write.matcher(charSequence).matches();
    }

    public static final String format(String str, Object... objArr) {
        onGetStartedClick.write((Object) str, "format");
        onGetStartedClick.write((Object) objArr, "args");
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        Locale locale = Locale.US;
        onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final Charset readBomAsCharset(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, Charset charset) throws IOException {
        Charset charset2;
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "$this$readBomAsCharset");
        onGetStartedClick.write((Object) charset, FragmentBuilder_BindEasycashReferralSendDfwFragment.DEFAULT_IDENTIFIER);
        int read = nsipPartnerPaymentOtpActivity.read(UNICODE_BOMS);
        if (read == -1) {
            return charset;
        }
        if (read == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            onGetStartedClick.IconCompatParcelizer((Object) charset3, "UTF_8");
            return charset3;
        } else if (read == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            onGetStartedClick.IconCompatParcelizer((Object) charset4, "UTF_16BE");
            return charset4;
        } else if (read != 2) {
            if (read == 3) {
                GroupFavoriteActivity groupFavoriteActivity = GroupFavoriteActivity.read;
                charset2 = GroupFavoriteActivity.write;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32BE");
                    onGetStartedClick.IconCompatParcelizer((Object) charset2, "Charset.forName(\"UTF-32BE\")");
                    GroupFavoriteActivity.write = charset2;
                }
            } else if (read == 4) {
                GroupFavoriteActivity groupFavoriteActivity2 = GroupFavoriteActivity.read;
                charset2 = GroupFavoriteActivity.MediaBrowserCompat$CustomActionResultReceiver;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32LE");
                    onGetStartedClick.IconCompatParcelizer((Object) charset2, "Charset.forName(\"UTF-32LE\")");
                    GroupFavoriteActivity.MediaBrowserCompat$CustomActionResultReceiver = charset2;
                }
            } else {
                throw new AssertionError();
            }
            return charset2;
        } else {
            Charset charset5 = StandardCharsets.UTF_16LE;
            onGetStartedClick.IconCompatParcelizer((Object) charset5, "UTF_16LE");
            return charset5;
        }
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) str, "name");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = false;
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis != 0 || i <= 0) {
                        z = true;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" too small.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" < 0");
        throw new IllegalStateException(sb3.toString().toString());
    }

    public static final Headers toHeaders(List<Header> list) {
        onGetStartedClick.write((Object) list, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(PinChangeSuccessActivity.MediaMetadataCompat(next.component1()), PinChangeSuccessActivity.MediaMetadataCompat(next.component2()));
        }
        return builder.build();
    }

    public static final List<Header> toHeaderList(Headers headers) {
        AddAccountConsentActivity addAccountConsentActivity;
        onGetStartedClick.write((Object) headers, "$this$toHeaderList");
        int size = headers.size();
        if (size <= Integer.MIN_VALUE) {
            C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
            addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
        } else {
            addAccountConsentActivity = new AddAccountConsentActivity(0, size - 1);
        }
        Iterable iterable = addAccountConsentActivity;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            int write = ((HmlNationalIdHelpActivity) it).write();
            arrayList.add(new Header(headers.name(write), headers.value(write)));
        }
        return (List) arrayList;
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        onGetStartedClick.write((Object) httpUrl, "$this$canReuseConnectionFor");
        onGetStartedClick.write((Object) httpUrl2, "other");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) httpUrl.host(), (Object) httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) httpUrl.scheme(), (Object) httpUrl2.scheme());
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        onGetStartedClick.write((Object) eventListener, "$this$asFactory");
        return new Util$asFactory$1(eventListener);
    }

    public static final void writeMedium(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, int i) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "$this$writeMedium");
        nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver((i >>> 16) & 255);
        nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver((i >>> 8) & 255);
        nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(i & 255);
    }

    public static final int readMedium(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "$this$readMedium");
        return and(nsipPartnerPaymentOtpActivity.MediaBrowserCompat$SearchResultReceiver(), 255) | (and(nsipPartnerPaymentOtpActivity.MediaBrowserCompat$SearchResultReceiver(), 255) << 16) | (and(nsipPartnerPaymentOtpActivity.MediaBrowserCompat$SearchResultReceiver(), 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean skipAll(p040o.HowToAddAccountStep2Activity r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
            java.lang.String r0 = "timeUnit"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            long r0 = java.lang.System.nanoTime()
            o.PinChangeActivity_ViewBinding r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            o.PinChangeActivity_ViewBinding r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            o.PinChangeActivity_ViewBinding r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            r12 = 1
            r13 = 0
            o.SCBUniversalWebViewActivity r2 = new o.SCBUniversalWebViewActivity     // Catch:{ InterruptedIOException -> 0x006d, all -> 0x0057 }
            r2.<init>()     // Catch:{ InterruptedIOException -> 0x006d, all -> 0x0057 }
        L_0x0040:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r2, r7)     // Catch:{ InterruptedIOException -> 0x006d, all -> 0x0057 }
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0052
            long r7 = r2.read     // Catch:{ InterruptedIOException -> 0x006d, all -> 0x0057 }
            r2.MediaBrowserCompat$MediaItem((long) r7)     // Catch:{ InterruptedIOException -> 0x006d, all -> 0x0057 }
            goto L_0x0040
        L_0x0052:
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x007b
            goto L_0x0072
        L_0x0057:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0064
            o.PinChangeActivity_ViewBinding r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x006c
        L_0x0064:
            o.PinChangeActivity_ViewBinding r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x006c:
            throw r12
        L_0x006d:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x007a
            r12 = r13
        L_0x0072:
            o.PinChangeActivity_ViewBinding r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0083
        L_0x007a:
            r12 = r13
        L_0x007b:
            o.PinChangeActivity_ViewBinding r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x0083:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(o.HowToAddAccountStep2Activity, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final boolean discard(HowToAddAccountStep2Activity howToAddAccountStep2Activity, int i, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "$this$discard");
        onGetStartedClick.write((Object) timeUnit, "timeUnit");
        try {
            return skipAll(howToAddAccountStep2Activity, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String connectionName(Socket socket) {
        onGetStartedClick.write((Object) socket, "$this$connectionName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        onGetStartedClick.IconCompatParcelizer((Object) hostName, "address.hostName");
        return hostName;
    }

    public static final void ignoreIoExceptions(FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "block");
        try {
            fundActionsSuccessActivity.invoke();
        } catch (IOException unused) {
        }
    }

    public static final void threadName(String str, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "block");
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            fundActionsSuccessActivity.invoke();
        } finally {
            currentThread.setName(name);
        }
    }

    public static final void execute(Executor executor, String str, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) executor, "$this$execute");
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "block");
        executor.execute(new Util$execute$1(str, fundActionsSuccessActivity));
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        onGetStartedClick.write((Object) str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long headersContentLength(Response response) {
        onGetStartedClick.write((Object) response, "$this$headersContentLength");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1);
        }
        return -1;
    }

    public static final long toLongOrDefault(String str, long j) {
        onGetStartedClick.write((Object) str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        onGetStartedClick.write((Object) list, "$this$toImmutableList");
        Collection collection = list;
        onGetStartedClick.write((Object) collection, "$this$toMutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(new ArrayList(collection));
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        onGetStartedClick.write((Object) tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        onGetStartedClick.write((Object) map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            HmlNTBeKYCLandingActivity_ViewBinding hmlNTBeKYCLandingActivity_ViewBinding = HmlNTBeKYCLandingActivity_ViewBinding.read;
            if (hmlNTBeKYCLandingActivity_ViewBinding != null) {
                return hmlNTBeKYCLandingActivity_ViewBinding;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final void closeQuietly(Closeable closeable) {
        onGetStartedClick.write((Object) closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Socket socket) {
        onGetStartedClick.write((Object) socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        onGetStartedClick.write((Object) serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void lockAndWaitNanos(Object obj, long j) throws InterruptedException {
        onGetStartedClick.write(obj, "$this$lockAndWaitNanos");
        long j2 = j / 1000000;
        synchronized (obj) {
            waitMillis(obj, j2, (int) (j - (1000000 * j2)));
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final void wait(Object obj) {
        onGetStartedClick.write(obj, "$this$wait");
        obj.wait();
    }

    public static /* synthetic */ void waitMillis$default(Object obj, long j, int i, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        waitMillis(obj, j, i);
    }

    public static final void waitMillis(Object obj, long j, int i) {
        onGetStartedClick.write(obj, "$this$waitMillis");
        if (j > 0 || i > 0) {
            obj.wait(j, i);
        }
    }

    public static final void notify(Object obj) {
        onGetStartedClick.write(obj, "$this$notify");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        onGetStartedClick.write(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r5 
      PHI: (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v2 java.lang.Object) binds: [B:0:0x0000, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T readFieldOrNull(java.lang.Object r5, java.lang.Class<T> r6, java.lang.String r7) {
        /*
        L_0x0000:
            java.lang.String r0 = "instance"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = "fieldType"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r0 = "fieldName"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            java.lang.Class r0 = r5.getClass()
        L_0x0013:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r1)
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L_0x0044
            java.lang.reflect.Field r1 = r0.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x003a }
            java.lang.String r4 = "field"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)     // Catch:{ NoSuchFieldException -> 0x003a }
            r1.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x003a }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ NoSuchFieldException -> 0x003a }
            boolean r2 = r6.isInstance(r1)     // Catch:{ NoSuchFieldException -> 0x003a }
            if (r2 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            java.lang.Object r3 = r6.cast(r1)     // Catch:{ NoSuchFieldException -> 0x003a }
        L_0x0039:
            return r3
        L_0x003a:
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "c.superclass"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            goto L_0x0013
        L_0x0044:
            java.lang.String r0 = "delegate"
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r7, (java.lang.Object) r0)
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0056
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r5 = readFieldOrNull(r5, r1, r0)
            if (r5 == 0) goto L_0x0056
            goto L_0x0000
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.readFieldOrNull(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        onGetStartedClick.write((Object) strArr, "$this$indexOf");
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        onGetStartedClick.write((Object) comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final void tryExecute(Executor executor, String str, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) executor, "$this$tryExecute");
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "block");
        try {
            executor.execute(new Util$execute$1(str, fundActionsSuccessActivity));
        } catch (RejectedExecutionException unused) {
        }
    }

    public static final int skipAll(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, byte b) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "$this$skipAll");
        int i = 0;
        while (true) {
            if ((sCBUniversalWebViewActivity.read == 0) || sCBUniversalWebViewActivity.read(0) != b) {
                return i;
            }
            i++;
            sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver();
        }
        return i;
    }
}
