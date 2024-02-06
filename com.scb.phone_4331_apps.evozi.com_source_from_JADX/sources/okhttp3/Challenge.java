package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;

public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String str2;
        onGetStartedClick.write((Object) str, "scheme");
        onGetStartedClick.write((Object) map, "authParams");
        this.scheme = str;
        Map linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                onGetStartedClick.IconCompatParcelizer((Object) locale, "US");
                if (str3 != null) {
                    str2 = str3.toLowerCase(locale);
                    onGetStartedClick.IconCompatParcelizer((Object) str2, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                onGetStartedClick.IconCompatParcelizer((Object) forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        onGetStartedClick.IconCompatParcelizer((Object) charset, "ISO_8859_1");
        return charset;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Challenge(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
            java.lang.String r0 = "realm"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r0)
            r1.<init>((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }

    public final Challenge withCharset(Charset charset) {
        onGetStartedClick.write((Object) charset, "charset");
        Map<String, String> map = this.authParams;
        onGetStartedClick.write((Object) map, "$this$toMutableMap");
        Map linkedHashMap = new LinkedHashMap(map);
        String name = charset.name();
        onGetStartedClick.IconCompatParcelizer((Object) name, "charset.name()");
        linkedHashMap.put("charset", name);
        return new Challenge(this.scheme, (Map<String, String>) linkedHashMap);
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m6430deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m6427deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m6429deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m6428deprecated_charset() {
        return charset();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) challenge.scheme, (Object) this.scheme) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) challenge.authParams, (Object) this.authParams);
        }
    }

    public final int hashCode() {
        return ((this.scheme.hashCode() + 899) * 31) + this.authParams.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.scheme);
        sb.append(" authParams=");
        sb.append(this.authParams);
        return sb.toString();
    }
}
