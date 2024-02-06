package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import net.p088sf.scuba.smartcards.ISO7816;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p040o.C7043xa484e06c;
import p040o.GoodToKnowActivity;
import p040o.GroupFavoriteActivity;
import p040o.HmlNTBeKYCLandingActivity_ViewBinding;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class HttpHeaders {
    private static final SCBUniversalWebViewActivity_ViewBinding QUOTED_STRING_DELIMITERS = PinChangeSuccessActivity.read("\"\\");
    private static final SCBUniversalWebViewActivity_ViewBinding TOKEN_DELIMITERS = PinChangeSuccessActivity.read("\t ,=");

    static {
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "\"\\", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "\t ,=", "$receiver");
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        onGetStartedClick.write((Object) headers, "$this$parseChallenges");
        onGetStartedClick.write((Object) str, "headerName");
        List<Challenge> arrayList = new ArrayList<>();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, headers.name(i), true)) {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                String value = headers.value(i);
                onGetStartedClick.write((Object) value, "string");
                try {
                    readChallengeHeader(sCBUniversalWebViewActivity.write(value, 0, value.length()), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log(5, "Unable to parse challenge", e);
                }
            }
        }
        return arrayList;
    }

    private static final void readChallengeHeader(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipCommasAndWhitespace(sCBUniversalWebViewActivity);
                    str2 = readToken(sCBUniversalWebViewActivity);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(sCBUniversalWebViewActivity);
                readToken = readToken(sCBUniversalWebViewActivity);
                boolean z = false;
                if (readToken == null) {
                    if (sCBUniversalWebViewActivity.read == 0) {
                        z = true;
                    }
                    if (z) {
                        HmlNTBeKYCLandingActivity_ViewBinding hmlNTBeKYCLandingActivity_ViewBinding = HmlNTBeKYCLandingActivity_ViewBinding.read;
                        if (hmlNTBeKYCLandingActivity_ViewBinding != null) {
                            list.add(new Challenge(str2, (Map<String, String>) hmlNTBeKYCLandingActivity_ViewBinding));
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
                    }
                    return;
                }
                skipAll = Util.skipAll(sCBUniversalWebViewActivity, (byte) 61);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(sCBUniversalWebViewActivity);
                if (!skipCommasAndWhitespace) {
                    if (!skipCommasAndWhitespace2) {
                        if (sCBUniversalWebViewActivity.read == 0) {
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Map linkedHashMap = new LinkedHashMap();
                int skipAll2 = skipAll + Util.skipAll(sCBUniversalWebViewActivity, (byte) 61);
                while (true) {
                    if (readToken == null) {
                        readToken = readToken(sCBUniversalWebViewActivity);
                        if (skipCommasAndWhitespace(sCBUniversalWebViewActivity)) {
                            continue;
                            break;
                        }
                        skipAll2 = Util.skipAll(sCBUniversalWebViewActivity, (byte) 61);
                    }
                    if (skipAll2 == 0) {
                        continue;
                        break;
                    } else if (skipAll2 <= 1 && !skipCommasAndWhitespace(sCBUniversalWebViewActivity)) {
                        if (startsWith(sCBUniversalWebViewActivity, ISO7816.INS_MSE)) {
                            str = readQuotedString(sCBUniversalWebViewActivity);
                        } else {
                            str = readToken(sCBUniversalWebViewActivity);
                        }
                        if (str != null && ((String) linkedHashMap.put(readToken, str)) == null) {
                            if (!skipCommasAndWhitespace(sCBUniversalWebViewActivity)) {
                                if (!(sCBUniversalWebViewActivity.read == 0)) {
                                    return;
                                }
                            }
                            readToken = null;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                list.add(new Challenge(str2, (Map<String, String>) linkedHashMap));
                str2 = readToken;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(readToken);
            sb.append(GoodToKnowActivity.read("=", skipAll));
            Map singletonMap = Collections.singletonMap((Object) null, sb.toString());
            onGetStartedClick.IconCompatParcelizer((Object) singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str2, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) throws EOFException {
        if (sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver() == 34) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
            while (true) {
                SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = QUOTED_STRING_DELIMITERS;
                onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "targetBytes");
                long MediaBrowserCompat$ItemReceiver = sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity_ViewBinding, 0);
                if (MediaBrowserCompat$ItemReceiver == -1) {
                    return null;
                }
                if (sCBUniversalWebViewActivity.read(MediaBrowserCompat$ItemReceiver) == 34) {
                    sCBUniversalWebViewActivity2.write(sCBUniversalWebViewActivity, MediaBrowserCompat$ItemReceiver);
                    sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver();
                    return sCBUniversalWebViewActivity2.IconCompatParcelizer(sCBUniversalWebViewActivity2.read, GroupFavoriteActivity.IconCompatParcelizer);
                } else if (sCBUniversalWebViewActivity.read == MediaBrowserCompat$ItemReceiver + 1) {
                    return null;
                } else {
                    sCBUniversalWebViewActivity2.write(sCBUniversalWebViewActivity, MediaBrowserCompat$ItemReceiver);
                    sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver();
                    sCBUniversalWebViewActivity2.write(sCBUniversalWebViewActivity, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = TOKEN_DELIMITERS;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "targetBytes");
        long MediaBrowserCompat$ItemReceiver = sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity_ViewBinding, 0);
        if (MediaBrowserCompat$ItemReceiver == -1) {
            MediaBrowserCompat$ItemReceiver = sCBUniversalWebViewActivity.read;
        }
        if (MediaBrowserCompat$ItemReceiver != 0) {
            return sCBUniversalWebViewActivity.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, GroupFavoriteActivity.IconCompatParcelizer);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        onGetStartedClick.write((Object) cookieJar, "$this$receiveHeaders");
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        onGetStartedClick.write((Object) headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    public static final boolean promisesBody(Response response) {
        onGetStartedClick.write((Object) response, "$this$promisesBody");
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) response.request().method(), (Object) "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    public static final boolean hasBody(Response response) {
        onGetStartedClick.write((Object) response, "response");
        return promisesBody(response);
    }

    private static final boolean skipCommasAndWhitespace(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
        boolean z = false;
        while (true) {
            if (!(sCBUniversalWebViewActivity.read == 0)) {
                byte read = sCBUniversalWebViewActivity.read(0);
                if (read != 9 && read != 32) {
                    if (read != 44) {
                        break;
                    }
                    sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver();
                    z = true;
                } else {
                    sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver();
                }
            } else {
                break;
            }
        }
        return z;
    }

    private static final boolean startsWith(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, byte b) {
        return !((sCBUniversalWebViewActivity.read > 0 ? 1 : (sCBUniversalWebViewActivity.read == 0 ? 0 : -1)) == 0) && sCBUniversalWebViewActivity.read(0) == b;
    }
}
