package okhttp3.repackaged.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.repackaged.HttpUrl;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.HowToAddAccountActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.SetupQuickBalanceActivity;
import p040o.onMenuPromptPayClick;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Pattern ajA = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private Util() {
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!isAndroidGetsocknameError(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeAll(Closeable closeable, Closeable closeable2) throws IOException {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    public static boolean discard(HowToAddAccountActivity howToAddAccountActivity, int i, TimeUnit timeUnit) {
        try {
            return skipAll(howToAddAccountActivity, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean skipAll(HowToAddAccountActivity howToAddAccountActivity, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = howToAddAccountActivity.timeout().hasDeadline() ? howToAddAccountActivity.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        howToAddAccountActivity.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
            while (howToAddAccountActivity.read(onmenupromptpayclick, 2048) != -1) {
                onmenupromptpayclick.MediaMetadataCompat(onmenupromptpayclick.IconCompatParcelizer);
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                howToAddAccountActivity.timeout().clearDeadline();
                return true;
            }
            howToAddAccountActivity.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (EOFException e) {
            throw new AssertionError(e);
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                howToAddAccountActivity.timeout().clearDeadline();
                return false;
            }
            howToAddAccountActivity.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                howToAddAccountActivity.timeout().clearDeadline();
            } else {
                howToAddAccountActivity.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static String md5Hex(String str) {
        try {
            return PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).MediaBrowserCompat$CustomActionResultReceiver();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String shaBase64(String str) {
        try {
            return SetupQuickBalanceActivity.MediaBrowserCompat$ItemReceiver(PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(str.getBytes("UTF-8"))).write);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static PinLoginActivity_ViewBinding sha1(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) {
        try {
            return PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(pinLoginActivity_ViewBinding.write()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static PinLoginActivity_ViewBinding sha256(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) {
        try {
            return PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256).digest(pinLoginActivity_ViewBinding.write()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static <T> T[] intersect(Class<T> cls, T[] tArr, T[] tArr2) {
        List a = m5962a(tArr, tArr2);
        return a.toArray((Object[]) Array.newInstance(cls, a.size()));
    }

    /* renamed from: a */
    private static <T> List<T> m5962a(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public static String hostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        if (httpUrl.host().contains(":")) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(httpUrl.host());
            sb.append("]");
            str = sb.toString();
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.defaultPort(httpUrl.scheme())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":");
        sb2.append(httpUrl.port());
        return sb2.toString();
    }

    public static String toHumanReadableAscii(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
                onmenupromptpayclick.read(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    onmenupromptpayclick.MediaBrowserCompat$SearchResultReceiver((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i += Character.charCount(codePointAt2);
                }
                return onmenupromptpayclick.Keep();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean contains(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static String[] concat(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static int skipLeadingAsciiWhitespace(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int skipTrailingAsciiWhitespace(String str, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return i;
            }
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2 + 1;
            }
        }
    }

    public static String trimSubstring(String str, int i, int i2) {
        int skipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, i, i2);
        return str.substring(skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, i2));
    }

    public static int delimiterOffset(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int delimiterOffset(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String domainToAscii(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m5963ba(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: ba */
    private static boolean m5963ba(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyAsIpAddress(String str) {
        return ajA.matcher(str).matches();
    }
}
