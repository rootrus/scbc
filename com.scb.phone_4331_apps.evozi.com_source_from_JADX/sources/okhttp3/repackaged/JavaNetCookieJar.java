package okhttp3.repackaged;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.repackaged.Cookie;
import okhttp3.repackaged.internal.Internal;
import okhttp3.repackaged.internal.Util;

public final class JavaNetCookieJar implements CookieJar {
    private final CookieHandler ahT;

    public JavaNetCookieJar(CookieHandler cookieHandler) {
        this.ahT = cookieHandler;
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (this.ahT != null) {
            ArrayList arrayList = new ArrayList();
            for (Cookie obj : list) {
                arrayList.add(obj.toString());
            }
            try {
                this.ahT.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException e) {
                Logger logger = Internal.logger;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                sb.append("Saving cookies failed for ");
                sb.append(httpUrl.resolve("/..."));
                logger.log(level, sb.toString(), e);
            }
        }
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        try {
            ArrayList arrayList = null;
            for (Map.Entry next : this.ahT.get(httpUrl.uri(), Collections.emptyMap()).entrySet()) {
                String str = (String) next.getKey();
                if ((ServiceConstants.HEADER_COOKIE.equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) next.getValue()).isEmpty()) {
                    for (String str2 : (List) next.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(m5866d(httpUrl, str2));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException e) {
            Logger logger = Internal.logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Loading cookies failed for ");
            sb.append(httpUrl.resolve("/..."));
            logger.log(level, sb.toString(), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    private List<Cookie> m5866d(HttpUrl httpUrl, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int delimiterOffset = Util.delimiterOffset(str, i, length, ";,");
            int delimiterOffset2 = Util.delimiterOffset(str, i, delimiterOffset, '=');
            String trimSubstring = Util.trimSubstring(str, i, delimiterOffset2);
            if (!trimSubstring.startsWith("$")) {
                String trimSubstring2 = delimiterOffset2 < delimiterOffset ? Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset) : "";
                if (trimSubstring2.startsWith("\"") && trimSubstring2.endsWith("\"")) {
                    trimSubstring2 = trimSubstring2.substring(1, trimSubstring2.length() - 1);
                }
                arrayList.add(new Cookie.Builder().name(trimSubstring).value(trimSubstring2).domain(httpUrl.host()).build());
            }
            i = delimiterOffset + 1;
        }
        return arrayList;
    }
}
