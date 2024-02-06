package okhttp3.repackaged;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.repackaged.internal.Util;
import p040o.onMenuPromptPayClick;

public final class HttpUrl {
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final String QUERY_COMPONENT_ENCODE_SET = " \"'<>#&=";
    static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final List<String> ahL;
    private final List<String> ahM;
    private final String fragment;
    /* access modifiers changed from: private */
    public final String host;
    private final String password;
    /* access modifiers changed from: private */
    public final int port;
    /* access modifiers changed from: private */
    public final String scheme;
    private final String url;
    private final String username;

    static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c >= 'a' && c <= 'f') {
            c2 = 'a';
        } else if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - c2) + 10;
    }

    /* synthetic */ HttpUrl(Builder builder, C102071 r2) {
        this(builder);
    }

    private HttpUrl(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.ahL = m5842a(builder.encodedPathSegments, false);
        String str = null;
        this.ahM = builder.encodedQueryNamesAndValues != null ? m5842a(builder.encodedQueryNamesAndValues, true) : null;
        this.fragment = builder.encodedFragment != null ? percentDecode(builder.encodedFragment, false) : str;
        this.url = builder.toString();
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI uri() {
        String obj = newBuilder().mo58438uo().toString();
        try {
            return new URI(obj);
        } catch (URISyntaxException e) {
            try {
                return URI.create(obj.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String scheme() {
        return this.scheme;
    }

    public final boolean isHttps() {
        return this.scheme.equals("https");
    }

    public final String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public final String username() {
        return this.username;
    }

    public final String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        int indexOf = this.url.indexOf(58, this.scheme.length() + 3);
        return this.url.substring(indexOf + 1, this.url.indexOf(64));
    }

    public final String password() {
        return this.password;
    }

    public final String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final int pathSize() {
        return this.ahL.size();
    }

    public final String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i = indexOf + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, i, delimiterOffset, '/');
            arrayList.add(this.url.substring(i, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    public final List<String> pathSegments() {
        return this.ahL;
    }

    public final String encodedQuery() {
        if (this.ahM == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf + 1, str.length(), '#'));
    }

    static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final String query() {
        if (this.ahM == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.ahM);
        return sb.toString();
    }

    public final int querySize() {
        List<String> list = this.ahM;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String queryParameter(String str) {
        List<String> list = this.ahM;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.ahM.get(i))) {
                return this.ahM.get(i + 1);
            }
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.ahM == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.ahM.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.ahM.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final List<String> queryParameterValues(String str) {
        if (this.ahM == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.ahM.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.ahM.get(i))) {
                arrayList.add(this.ahM.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String queryParameterName(int i) {
        return this.ahM.get(i << 1);
    }

    public final String queryParameterValue(int i) {
        return this.ahM.get((i << 1) + 1);
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public final String fragment() {
        return this.fragment;
    }

    public final HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port != defaultPort(this.scheme) ? this.port : -1;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public final Builder newBuilder(String str) {
        Builder builder = new Builder();
        if (builder.mo58417c(this, str) == Builder.C10208a.SUCCESS) {
            return builder;
        }
        return null;
    }

    public static HttpUrl parse(String str) {
        Builder builder = new Builder();
        if (builder.mo58417c((HttpUrl) null, str) == Builder.C10208a.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    public static HttpUrl get(URL url2) {
        return parse(url2.toString());
    }

    /* renamed from: aU */
    static HttpUrl m5845aU(String str) throws MalformedURLException, UnknownHostException {
        Builder builder = new Builder();
        Builder.C10208a c = builder.mo58417c((HttpUrl) null, str);
        int i = C102071.$SwitchMap$okhttp3$HttpUrl$Builder$ParseResult[c.ordinal()];
        if (i == 1) {
            return builder.build();
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid URL: ");
            sb.append(c);
            sb.append(" for ");
            sb.append(str);
            throw new MalformedURLException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid host: ");
        sb2.append(str);
        throw new UnknownHostException(sb2.toString());
    }

    /* renamed from: okhttp3.repackaged.HttpUrl$1 */
    static /* synthetic */ class C102071 {
        static final /* synthetic */ int[] $SwitchMap$okhttp3$HttpUrl$Builder$ParseResult;

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
                okhttp3.repackaged.HttpUrl$Builder$a[] r0 = okhttp3.repackaged.HttpUrl.Builder.C10208a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$okhttp3$HttpUrl$Builder$ParseResult = r0
                okhttp3.repackaged.HttpUrl$Builder$a r1 = okhttp3.repackaged.HttpUrl.Builder.C10208a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$okhttp3$HttpUrl$Builder$ParseResult     // Catch:{ NoSuchFieldError -> 0x001d }
                okhttp3.repackaged.HttpUrl$Builder$a r1 = okhttp3.repackaged.HttpUrl.Builder.C10208a.INVALID_HOST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$okhttp3$HttpUrl$Builder$ParseResult     // Catch:{ NoSuchFieldError -> 0x0028 }
                okhttp3.repackaged.HttpUrl$Builder$a r1 = okhttp3.repackaged.HttpUrl.Builder.C10208a.UNSUPPORTED_SCHEME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$okhttp3$HttpUrl$Builder$ParseResult     // Catch:{ NoSuchFieldError -> 0x0033 }
                okhttp3.repackaged.HttpUrl$Builder$a r1 = okhttp3.repackaged.HttpUrl.Builder.C10208a.MISSING_SCHEME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$okhttp3$HttpUrl$Builder$ParseResult     // Catch:{ NoSuchFieldError -> 0x003e }
                okhttp3.repackaged.HttpUrl$Builder$a r1 = okhttp3.repackaged.HttpUrl.Builder.C10208a.INVALID_PORT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.HttpUrl.C102071.<clinit>():void");
        }
    }

    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).url.equals(this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return this.url;
    }

    public static final class Builder {
        String encodedFragment;
        String encodedPassword = "";
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String encodedUsername = "";
        String host;
        int port = -1;
        String scheme;

        /* renamed from: okhttp3.repackaged.HttpUrl$Builder$a */
        enum C10208a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        public final Builder scheme(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.scheme = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.scheme = "https";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected scheme: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public final Builder username(String str) {
            if (str != null) {
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new IllegalArgumentException("username == null");
        }

        public final Builder encodedUsername(String str) {
            if (str != null) {
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new IllegalArgumentException("encodedUsername == null");
        }

        public final Builder password(String str) {
            if (str != null) {
                this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new IllegalArgumentException("password == null");
        }

        public final Builder encodedPassword(String str) {
            if (str != null) {
                this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new IllegalArgumentException("encodedPassword == null");
        }

        public final Builder host(String str) {
            if (str != null) {
                String f = m5858f(str, 0, str.length());
                if (f != null) {
                    this.host = f;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("host == null");
        }

        public final Builder port(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected port: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.port = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final int effectivePort() {
            int i = this.port;
            return i == -1 ? HttpUrl.defaultPort(this.scheme) : i;
        }

        public final Builder addPathSegment(String str) {
            if (str != null) {
                m5848a(str, 0, str.length(), false, false);
                return this;
            }
            throw new IllegalArgumentException("pathSegment == null");
        }

        public final Builder addPathSegments(String str) {
            if (str != null) {
                return m5857e(str, false);
            }
            throw new IllegalArgumentException("pathSegments == null");
        }

        public final Builder addEncodedPathSegment(String str) {
            if (str != null) {
                m5848a(str, 0, str.length(), false, true);
                return this;
            }
            throw new IllegalArgumentException("encodedPathSegment == null");
        }

        public final Builder addEncodedPathSegments(String str) {
            if (str != null) {
                return m5857e(str, true);
            }
            throw new IllegalArgumentException("encodedPathSegments == null");
        }

        /* renamed from: e */
        private Builder m5857e(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, i, str.length(), "/\\");
                m5848a(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }

        public final Builder setPathSegment(int i, String str) {
            if (str != null) {
                String a = HttpUrl.m5840a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true);
                if (m5851aW(a) || m5852aX(a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected path segment: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.encodedPathSegments.set(i, a);
                return this;
            }
            throw new IllegalArgumentException("pathSegment == null");
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            if (str != null) {
                String a = HttpUrl.m5840a(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true);
                this.encodedPathSegments.set(i, a);
                if (!m5851aW(a) && !m5852aX(a)) {
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected path segment: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("encodedPathSegment == null");
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder encodedPath(String str) {
            if (str == null) {
                throw new IllegalArgumentException("encodedPath == null");
            } else if (str.startsWith("/")) {
                m5853b(str, 0, str.length());
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected encodedPath: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final Builder query(String str) {
            this.encodedQueryNamesAndValues = str != null ? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public final Builder encodedQuery(String str) {
            this.encodedQueryNamesAndValues = str != null ? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public final Builder addQueryParameter(String str, String str2) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " \"'<>#&=", false, false, true, true));
                this.encodedQueryNamesAndValues.add(str2 != null ? HttpUrl.canonicalize(str2, " \"'<>#&=", false, false, true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " \"'<>#&=", true, false, true, true));
                this.encodedQueryNamesAndValues.add(str2 != null ? HttpUrl.canonicalize(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("encodedName == null");
        }

        public final Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (this.encodedQueryNamesAndValues == null) {
                return this;
            } else {
                m5850aV(HttpUrl.canonicalize(str, " \"'<>#&=", false, false, true, true));
                return this;
            }
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            if (str == null) {
                throw new IllegalArgumentException("encodedName == null");
            } else if (this.encodedQueryNamesAndValues == null) {
                return this;
            } else {
                m5850aV(HttpUrl.canonicalize(str, " \"'<>#&=", true, false, true, true));
                return this;
            }
        }

        /* renamed from: aV */
        private void m5850aV(String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? HttpUrl.canonicalize(str, "", false, false, false, false) : null;
            return this;
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? HttpUrl.canonicalize(str, "", true, false, false, false) : null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: uo */
        public final Builder mo58438uo() {
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, HttpUrl.canonicalize(this.encodedPathSegments.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.encodedQueryNamesAndValues.get(i2);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i2, HttpUrl.canonicalize(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.encodedFragment;
            if (str2 != null) {
                this.encodedFragment = HttpUrl.canonicalize(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public final HttpUrl build() {
            if (this.scheme == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.host != null) {
                return new HttpUrl(this, (C102071) null);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.scheme);
            sb.append("://");
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            if (this.host.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.host);
                sb.append(']');
            } else {
                sb.append(this.host);
            }
            int effectivePort = effectivePort();
            if (effectivePort != HttpUrl.defaultPort(this.scheme)) {
                sb.append(':');
                sb.append(effectivePort);
            }
            HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final C10208a mo58417c(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            int i;
            String str2 = str;
            int skipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str2, 0, str.length());
            int skipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str2, skipLeadingAsciiWhitespace, str.length());
            if (m5854c(str2, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace) != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    skipLeadingAsciiWhitespace += 6;
                } else if (!str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    return C10208a.UNSUPPORTED_SCHEME;
                } else {
                    this.scheme = "http";
                    skipLeadingAsciiWhitespace += 5;
                }
            } else if (httpUrl == null) {
                return C10208a.MISSING_SCHEME;
            } else {
                this.scheme = httpUrl.scheme;
            }
            int d = m5855d(str2, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c = '?';
            char c2 = '#';
            if (d >= 2 || httpUrl == null || !httpUrl.scheme.equals(this.scheme)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = skipLeadingAsciiWhitespace + d;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str2, i2, skipTrailingAsciiWhitespace, "@/\\?#");
                    char charAt = delimiterOffset != skipTrailingAsciiWhitespace ? str2.charAt(delimiterOffset) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = delimiterOffset;
                        int e = m5856e(str2, i2, i3);
                        int i4 = e + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int delimiterOffset2 = Util.delimiterOffset(str2, i2, delimiterOffset, ':');
                                int i5 = delimiterOffset2;
                                String str3 = "%40";
                                i = delimiterOffset;
                                String a = HttpUrl.m5840a(str, i2, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                if (z2) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.encodedUsername);
                                    sb.append(str3);
                                    sb.append(a);
                                    a = sb.toString();
                                }
                                this.encodedUsername = a;
                                if (i5 != i) {
                                    this.encodedPassword = HttpUrl.m5840a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = delimiterOffset;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.encodedPassword);
                                sb2.append("%40");
                                sb2.append(HttpUrl.m5840a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                                this.encodedPassword = sb2.toString();
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = delimiterOffset;
                int e2 = m5856e(str2, i2, i32);
                int i42 = e2 + 1;
                if (i42 < i32) {
                    this.host = m5858f(str2, i2, e2);
                    int h = m5860h(str2, i42, i32);
                    this.port = h;
                    if (h == -1) {
                        return C10208a.INVALID_PORT;
                    }
                } else {
                    this.host = m5858f(str2, i2, e2);
                    this.port = HttpUrl.defaultPort(this.scheme);
                }
                if (this.host == null) {
                    return C10208a.INVALID_HOST;
                }
                skipLeadingAsciiWhitespace = i32;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str2.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int delimiterOffset3 = Util.delimiterOffset(str2, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, "?#");
            m5853b(str2, skipLeadingAsciiWhitespace, delimiterOffset3);
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str2, delimiterOffset3, skipTrailingAsciiWhitespace, '#');
                this.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.m5840a(str, delimiterOffset3 + 1, delimiterOffset4, " \"'<>#", true, false, true, true));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = HttpUrl.m5840a(str, 1 + delimiterOffset3, skipTrailingAsciiWhitespace, "", true, false, false, false);
            }
            return C10208a.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC] */
        /* renamed from: b */
        private void m5853b(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 == r1) goto L_0x001e
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                r0 = r10
                goto L_0x002a
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                r0 = r10
            L_0x0029:
                int r12 = r12 + r3
            L_0x002a:
                r6 = r12
                if (r6 >= r13) goto L_0x0043
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.repackaged.internal.Util.delimiterOffset((java.lang.String) r11, (int) r6, (int) r13, (java.lang.String) r12)
                if (r12 >= r13) goto L_0x0037
                r1 = r3
                goto L_0x0038
            L_0x0037:
                r1 = 0
            L_0x0038:
                r9 = 1
                r4 = r0
                r5 = r11
                r7 = r12
                r8 = r1
                r4.m5848a((java.lang.String) r5, (int) r6, (int) r7, (boolean) r8, (boolean) r9)
                if (r1 == 0) goto L_0x002a
                goto L_0x0029
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.HttpUrl.Builder.m5853b(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        private void m5848a(String str, int i, int i2, boolean z, boolean z2) {
            String a = HttpUrl.m5840a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true);
            if (!m5851aW(a)) {
                if (m5852aX(a)) {
                    m5862up();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.encodedPathSegments.add(a);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        /* renamed from: aW */
        private boolean m5851aW(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: aX */
        private boolean m5852aX(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: up */
        private void m5862up() {
            List<String> list = this.encodedPathSegments;
            if (!list.remove(list.size() - 1).isEmpty() || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: c */
        private static int m5854c(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: d */
        private static int m5855d(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: e */
        private static int m5856e(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: f */
        private static String m5858f(String str, int i, int i2) {
            InetAddress inetAddress;
            String percentDecode = HttpUrl.percentDecode(str, i, i2, false);
            if (!percentDecode.contains(":")) {
                return Util.domainToAscii(percentDecode);
            }
            if (!percentDecode.startsWith("[") || !percentDecode.endsWith("]")) {
                inetAddress = m5859g(percentDecode, 0, percentDecode.length());
            } else {
                inetAddress = m5859g(percentDecode, 1, percentDecode.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m5861k(address);
            }
            throw new AssertionError();
        }

        /* renamed from: g */
        private static InetAddress m5859g(String str, int i, int i2) {
            byte[] bArr = new byte[16];
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (i5 == 16) {
                    return null;
                } else {
                    int i6 = i + 2;
                    if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                        if (i5 != 0) {
                            if (str.regionMatches(i, ":", 0, 1)) {
                                i++;
                            } else if (!str.regionMatches(i, ".", 0, 1) || !m5849a(str, i4, i2, bArr, i5 - 2)) {
                                return null;
                            } else {
                                i5 += 2;
                            }
                        }
                        i4 = i;
                    } else if (i3 != -1) {
                        return null;
                    } else {
                        i5 += 2;
                        i3 = i5;
                        if (i6 == i2) {
                            break;
                        }
                        i4 = i6;
                    }
                    int i7 = 0;
                    i = i4;
                    while (i < i2) {
                        int decodeHexDigit = HttpUrl.decodeHexDigit(str.charAt(i));
                        if (decodeHexDigit == -1) {
                            break;
                        }
                        i7 = (i7 << 4) + decodeHexDigit;
                        i++;
                    }
                    int i8 = i - i4;
                    if (i8 == 0 || i8 > 4) {
                        return null;
                    }
                    int i9 = i5 + 1;
                    bArr[i5] = (byte) (i7 >>> 8);
                    i5 = i9 + 1;
                    bArr[i9] = (byte) i7;
                }
            }
            if (i5 != 16) {
                if (i3 == -1) {
                    return null;
                }
                int i10 = i5 - i3;
                System.arraycopy(bArr, i3, bArr, 16 - i10, i10);
                Arrays.fill(bArr, i3, (16 - i5) + i3, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        private static boolean m5849a(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            if (i4 != i3 + 4) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        private static String m5861k(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
            while (i < bArr.length) {
                if (i == i2) {
                    onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(58);
                    i += i4;
                    if (i == 16) {
                        onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(58);
                    }
                } else {
                    if (i > 0) {
                        onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(58);
                    }
                    onmenupromptpayclick.ParcelableVolumeInfo((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return onmenupromptpayclick.Keep();
        }

        /* renamed from: h */
        private static int m5860h(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.m5840a(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    static String percentDecode(String str, boolean z) {
        return percentDecode(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m5842a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? percentDecode(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String percentDecode(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
                onmenupromptpayclick.read(str, i, i3);
                m5844a(onmenupromptpayclick, str, i3, i2, z);
                return onmenupromptpayclick.Keep();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m5844a(onMenuPromptPayClick onmenupromptpayclick, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int decodeHexDigit = decodeHexDigit(str.charAt(i + 1));
                int decodeHexDigit2 = decodeHexDigit(str.charAt(i3));
                if (!(decodeHexDigit == -1 || decodeHexDigit2 == -1)) {
                    onmenupromptpayclick.MediaBrowserCompat$ItemReceiver((decodeHexDigit << 4) + decodeHexDigit2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(32);
                i += Character.charCount(codePointAt);
            }
            onmenupromptpayclick.MediaBrowserCompat$SearchResultReceiver(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    static boolean percentEncoded(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || decodeHexDigit(str.charAt(i + 1)) == -1 || decodeHexDigit(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m5840a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || percentEncoded(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
            int i5 = i;
            onmenupromptpayclick.read(str, i, i4);
            m5843a(onmenupromptpayclick, str, i4, i2, str2, z, z2, z3, z4);
            return onmenupromptpayclick.Keep();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m5843a(onMenuPromptPayClick onmenupromptpayclick, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        onMenuPromptPayClick onmenupromptpayclick2 = onmenupromptpayclick;
        String str3 = str;
        int i3 = i2;
        onMenuPromptPayClick onmenupromptpayclick3 = null;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt != 43 || !z3) {
                    if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                        String str4 = str2;
                    } else if (str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || percentEncoded(str, i4, i3))))) {
                        onmenupromptpayclick.MediaBrowserCompat$SearchResultReceiver(codePointAt);
                        i4 += Character.charCount(codePointAt);
                    }
                    if (onmenupromptpayclick3 == null) {
                        onmenupromptpayclick3 = new onMenuPromptPayClick();
                    }
                    onmenupromptpayclick3.MediaBrowserCompat$SearchResultReceiver(codePointAt);
                    while (true) {
                        if (onmenupromptpayclick3.IconCompatParcelizer == 0) {
                            break;
                        }
                        byte MediaMetadataCompat = onmenupromptpayclick3.MediaMetadataCompat() & 255;
                        onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(37);
                        onmenupromptpayclick.MediaBrowserCompat$ItemReceiver((int) HEX_DIGITS[(MediaMetadataCompat >> 4) & 15]);
                        onmenupromptpayclick.MediaBrowserCompat$ItemReceiver((int) HEX_DIGITS[MediaMetadataCompat & 15]);
                    }
                    i4 += Character.charCount(codePointAt);
                } else {
                    String str5 = z ? "+" : "%2B";
                    onmenupromptpayclick.read(str5, 0, str5.length());
                }
            }
            String str6 = str2;
            i4 += Character.charCount(codePointAt);
        }
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m5840a(str, 0, str.length(), str2, z, z2, z3, z4);
    }
}
