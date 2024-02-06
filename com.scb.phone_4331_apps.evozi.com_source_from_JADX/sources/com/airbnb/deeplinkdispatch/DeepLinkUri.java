package com.airbnb.deeplinkdispatch;

import java.net.IDN;
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
import java.util.Locale;
import java.util.Set;
import p040o.GroupFavoriteActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class DeepLinkUri {
    static final String CONVERT_TO_URI_ENCODE_SET = "^`{}|\\";
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String QUERY_COMPONENT_ENCODE_SET = " \"'<>#&=";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    /* access modifiers changed from: private */
    public final String host;
    private final String password;
    private final List<String> pathSegments;
    /* access modifiers changed from: private */
    public final int port;
    private final List<String> queryNamesAndValues;
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

    /* synthetic */ DeepLinkUri(Builder builder, C00871 r2) {
        this(builder);
    }

    private DeepLinkUri(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername);
        this.password = percentDecode(builder.encodedPassword);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments);
        String str = null;
        this.queryNamesAndValues = builder.encodedQueryNamesAndValues != null ? percentDecode(builder.encodedQueryNamesAndValues) : null;
        this.fragment = builder.encodedFragment != null ? percentDecode(builder.encodedFragment) : str;
        this.url = builder.toString();
    }

    /* access modifiers changed from: package-private */
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final URI uri() {
        try {
            return new URI(canonicalize(this.url, CONVERT_TO_URI_ENCODE_SET, true, false));
        } catch (URISyntaxException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("not valid as a java.net.URI: ");
            sb.append(this.url);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final String scheme() {
        return this.scheme;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHttps() {
        return this.scheme.equals("https");
    }

    /* access modifiers changed from: package-private */
    public final String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, delimiterOffset(str, length, str.length(), ":@"));
    }

    /* access modifiers changed from: package-private */
    public final String username() {
        return this.username;
    }

    /* access modifiers changed from: package-private */
    public final String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        int indexOf = this.url.indexOf(58, this.scheme.length() + 3);
        return this.url.substring(indexOf + 1, this.url.indexOf(64));
    }

    /* access modifiers changed from: package-private */
    public final String password() {
        return this.password;
    }

    /* access modifiers changed from: package-private */
    public final String host() {
        return this.host;
    }

    /* access modifiers changed from: package-private */
    public final String encodedHost() {
        return canonicalize(this.host, CONVERT_TO_URI_ENCODE_SET, true, true);
    }

    /* access modifiers changed from: package-private */
    public final int port() {
        return this.port;
    }

    static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* access modifiers changed from: package-private */
    public final int pathSize() {
        return this.pathSegments.size();
    }

    /* access modifiers changed from: package-private */
    public final String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* access modifiers changed from: package-private */
    public final List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i = indexOf + 1;
            int delimiterOffset2 = delimiterOffset(this.url, i, delimiterOffset, "/");
            arrayList.add(this.url.substring(i, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    /* access modifiers changed from: package-private */
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        String str = this.url;
        return this.url.substring(indexOf, delimiterOffset(str, indexOf + 1, str.length(), "#"));
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

    /* access modifiers changed from: package-private */
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                return this.queryNamesAndValues.get(i + 1);
            }
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                arrayList.add(this.queryNamesAndValues.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final String queryParameterName(int i) {
        return this.queryNamesAndValues.get(i << 1);
    }

    /* access modifiers changed from: package-private */
    public final String queryParameterValue(int i) {
        return this.queryNamesAndValues.get((i << 1) + 1);
    }

    /* access modifiers changed from: package-private */
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    /* access modifiers changed from: package-private */
    public final String fragment() {
        return this.fragment;
    }

    /* access modifiers changed from: package-private */
    public final DeepLinkUri resolve(String str) {
        Builder builder = new Builder();
        if (builder.parse(this, str) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public static DeepLinkUri parse(String str) {
        Builder builder = new Builder();
        if (builder.parse((DeepLinkUri) null, str) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    static DeepLinkUri get(URL url2) {
        return parse(url2.toString());
    }

    static DeepLinkUri getChecked(String str) throws MalformedURLException, UnknownHostException {
        Builder builder = new Builder();
        Builder.ParseResult parse = builder.parse((DeepLinkUri) null, str);
        int i = C00871.f35x4aa470fa[parse.ordinal()];
        if (i == 1) {
            return builder.build();
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid URL: ");
            sb.append(parse);
            sb.append(" for ");
            sb.append(str);
            throw new MalformedURLException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid host: ");
        sb2.append(str);
        throw new UnknownHostException(sb2.toString());
    }

    /* renamed from: com.airbnb.deeplinkdispatch.DeepLinkUri$1 */
    static /* synthetic */ class C00871 {

        /* renamed from: $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult */
        static final /* synthetic */ int[] f35x4aa470fa;

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
                com.airbnb.deeplinkdispatch.DeepLinkUri$Builder$ParseResult[] r0 = com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.ParseResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35x4aa470fa = r0
                com.airbnb.deeplinkdispatch.DeepLinkUri$Builder$ParseResult r1 = com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.ParseResult.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35x4aa470fa     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.deeplinkdispatch.DeepLinkUri$Builder$ParseResult r1 = com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.ParseResult.INVALID_HOST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35x4aa470fa     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.deeplinkdispatch.DeepLinkUri$Builder$ParseResult r1 = com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.ParseResult.UNSUPPORTED_SCHEME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35x4aa470fa     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.deeplinkdispatch.DeepLinkUri$Builder$ParseResult r1 = com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.ParseResult.MISSING_SCHEME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35x4aa470fa     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.deeplinkdispatch.DeepLinkUri$Builder$ParseResult r1 = com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.ParseResult.INVALID_PORT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.DeepLinkUri.C00871.<clinit>():void");
        }
    }

    static DeepLinkUri get(URI uri) {
        return parse(uri.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DeepLinkUri) && ((DeepLinkUri) obj).url.equals(this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return this.url;
    }

    static final class Builder {
        String encodedFragment;
        String encodedPassword = "";
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String encodedUsername = "";
        String host;
        int port = -1;
        String scheme;

        enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        /* access modifiers changed from: package-private */
        public final Builder scheme(String str) {
            if (str != null) {
                this.scheme = str;
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder username(String str) {
            if (str != null) {
                this.encodedUsername = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false);
                return this;
            }
            throw new IllegalArgumentException("username == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder encodedUsername(String str) {
            if (str != null) {
                this.encodedUsername = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedUsername == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder password(String str) {
            if (str != null) {
                this.encodedPassword = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false);
                return this;
            }
            throw new IllegalArgumentException("password == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder encodedPassword(String str) {
            if (str != null) {
                this.encodedPassword = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedPassword == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder host(String str) {
            if (str != null) {
                String canonicalizeHost = canonicalizeHost(str, 0, str.length());
                if (canonicalizeHost != null) {
                    this.host = canonicalizeHost;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("host == null");
        }

        /* access modifiers changed from: package-private */
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
            return i == -1 ? DeepLinkUri.defaultPort(this.scheme) : i;
        }

        /* access modifiers changed from: package-private */
        public final Builder addPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, false);
                return this;
            }
            throw new IllegalArgumentException("pathSegment == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder addEncodedPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, true);
                return this;
            }
            throw new IllegalArgumentException("encodedPathSegment == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder setPathSegment(int i, String str) {
            if (str != null) {
                String canonicalize = DeepLinkUri.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false);
                if (isDot(canonicalize) || isDotDot(canonicalize)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected path segment: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.encodedPathSegments.set(i, canonicalize);
                return this;
            }
            throw new IllegalArgumentException("pathSegment == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder setEncodedPathSegment(int i, String str) {
            if (str != null) {
                String canonicalize = DeepLinkUri.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false);
                this.encodedPathSegments.set(i, canonicalize);
                if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected path segment: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("encodedPathSegment == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder encodedPath(String str) {
            if (str == null) {
                throw new IllegalArgumentException("encodedPath == null");
            } else if (str.startsWith("/")) {
                resolvePath(str, 0, str.length());
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected encodedPath: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: package-private */
        public final Builder query(String str) {
            this.encodedQueryNamesAndValues = str != null ? DeepLinkUri.queryStringToNamesAndValues(DeepLinkUri.canonicalize(str, " \"'<>#", false, true)) : null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder encodedQuery(String str) {
            this.encodedQueryNamesAndValues = str != null ? DeepLinkUri.queryStringToNamesAndValues(DeepLinkUri.canonicalize(str, " \"'<>#", true, true)) : null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder addQueryParameter(String str, String str2) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(DeepLinkUri.canonicalize(str, " \"'<>#&=", false, true));
                this.encodedQueryNamesAndValues.add(str2 != null ? DeepLinkUri.canonicalize(str2, " \"'<>#&=", false, true) : null);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder addEncodedQueryParameter(String str, String str2) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(DeepLinkUri.canonicalize(str, " \"'<>#&=", true, true));
                this.encodedQueryNamesAndValues.add(str2 != null ? DeepLinkUri.canonicalize(str2, " \"'<>#&=", true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("encodedName == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder removeAllQueryParameters(String str) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (this.encodedQueryNamesAndValues == null) {
                return this;
            } else {
                removeAllCanonicalQueryParameters(DeepLinkUri.canonicalize(str, " \"'<>#&=", false, true));
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        public final Builder removeAllEncodedQueryParameters(String str) {
            if (str == null) {
                throw new IllegalArgumentException("encodedName == null");
            } else if (this.encodedQueryNamesAndValues == null) {
                return this;
            } else {
                removeAllCanonicalQueryParameters(DeepLinkUri.canonicalize(str, " \"'<>#&=", true, true));
                return this;
            }
        }

        private void removeAllCanonicalQueryParameters(String str) {
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

        /* access modifiers changed from: package-private */
        public final Builder fragment(String str) {
            if (str != null) {
                this.encodedFragment = DeepLinkUri.canonicalize(str, "", false, false);
                return this;
            }
            throw new IllegalArgumentException("fragment == null");
        }

        /* access modifiers changed from: package-private */
        public final Builder encodedFragment(String str) {
            if (str != null) {
                this.encodedFragment = DeepLinkUri.canonicalize(str, "", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedFragment == null");
        }

        /* access modifiers changed from: package-private */
        public final DeepLinkUri build() {
            if (this.scheme == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.host != null) {
                return new DeepLinkUri(this, (C00871) null);
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
            if (effectivePort != DeepLinkUri.defaultPort(this.scheme)) {
                sb.append(':');
                sb.append(effectivePort);
            }
            DeepLinkUri.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                DeepLinkUri.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final ParseResult parse(DeepLinkUri deepLinkUri, String str) {
            int access$200;
            String str2 = str;
            boolean z = false;
            int skipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str2, 0, str.length());
            int skipTrailingAsciiWhitespace = skipTrailingAsciiWhitespace(str2, skipLeadingAsciiWhitespace, str.length());
            int schemeDelimiterOffset = schemeDelimiterOffset(str2, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            if (schemeDelimiterOffset != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    skipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    this.scheme = "http";
                    skipLeadingAsciiWhitespace += 5;
                } else {
                    String substring = str2.substring(skipLeadingAsciiWhitespace, schemeDelimiterOffset);
                    this.scheme = substring;
                    skipLeadingAsciiWhitespace += substring.length() + 1;
                }
            } else if (deepLinkUri == null) {
                return ParseResult.MISSING_SCHEME;
            } else {
                this.scheme = deepLinkUri.scheme;
            }
            int slashCount = slashCount(str2, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c = '#';
            if (slashCount >= 2 || deepLinkUri == null || !deepLinkUri.scheme.equals(this.scheme)) {
                int i = skipLeadingAsciiWhitespace + slashCount;
                boolean z2 = false;
                while (true) {
                    access$200 = DeepLinkUri.delimiterOffset(str2, i, skipTrailingAsciiWhitespace, "@/\\?#");
                    char charAt = access$200 != skipTrailingAsciiWhitespace ? str2.charAt(access$200) : 65535;
                    if (charAt == 65535 || charAt == c || charAt == '/' || charAt == '\\' || charAt == '?') {
                        int portColonOffset = portColonOffset(str2, i, access$200);
                        int i2 = portColonOffset + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int access$2002 = DeepLinkUri.delimiterOffset(str2, i, access$200, ":");
                                int i3 = access$2002;
                                String str3 = "%40";
                                String canonicalize = DeepLinkUri.canonicalize(str, i, access$2002, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                if (z2) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.encodedUsername);
                                    sb.append(str3);
                                    sb.append(canonicalize);
                                    canonicalize = sb.toString();
                                }
                                this.encodedUsername = canonicalize;
                                if (i3 != access$200) {
                                    this.encodedPassword = DeepLinkUri.canonicalize(str, i3 + 1, access$200, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.encodedPassword);
                                sb2.append("%40");
                                sb2.append(DeepLinkUri.canonicalize(str, i, access$200, " \"':;<=>@[]^`{}|/\\?#", true, false));
                                this.encodedPassword = sb2.toString();
                            }
                            i = access$200 + 1;
                        }
                        c = '#';
                    }
                }
                int portColonOffset2 = portColonOffset(str2, i, access$200);
                int i22 = portColonOffset2 + 1;
                if (i22 < access$200) {
                    this.host = canonicalizeHost(str2, i, portColonOffset2);
                    int parsePort = parsePort(str2, i22, access$200);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                } else {
                    this.host = canonicalizeHost(str2, i, portColonOffset2);
                    this.port = DeepLinkUri.defaultPort(this.scheme);
                }
                if (this.host == null) {
                    return ParseResult.INVALID_HOST;
                }
                skipLeadingAsciiWhitespace = access$200;
            } else {
                this.encodedUsername = deepLinkUri.encodedUsername();
                this.encodedPassword = deepLinkUri.encodedPassword();
                this.host = deepLinkUri.host;
                this.port = deepLinkUri.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(deepLinkUri.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str2.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(deepLinkUri.encodedQuery());
                }
            }
            int access$2003 = DeepLinkUri.delimiterOffset(str2, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, "?#");
            resolvePath(str2, skipLeadingAsciiWhitespace, access$2003);
            if (access$2003 < skipTrailingAsciiWhitespace && str2.charAt(access$2003) == '?') {
                int access$2004 = DeepLinkUri.delimiterOffset(str2, access$2003, skipTrailingAsciiWhitespace, "#");
                this.encodedQueryNamesAndValues = DeepLinkUri.queryStringToNamesAndValues(DeepLinkUri.canonicalize(str, access$2003 + 1, access$2004, " \"'<>#", true, true));
                access$2003 = access$2004;
            }
            if (access$2003 < skipTrailingAsciiWhitespace && str2.charAt(access$2003) == '#') {
                this.encodedFragment = DeepLinkUri.canonicalize(str, 1 + access$2003, skipTrailingAsciiWhitespace, "", true, false);
            }
            return ParseResult.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC] */
        private void resolvePath(java.lang.String r11, int r12, int r13) {
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
                int r12 = com.airbnb.deeplinkdispatch.DeepLinkUri.delimiterOffset(r11, r6, r13, r12)
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
                r4.push(r5, r6, r7, r8, r9)
                if (r1 == 0) goto L_0x002a
                goto L_0x0029
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.resolvePath(java.lang.String, int, int):void");
        }

        private void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize = DeepLinkUri.canonicalize(str, i, i2, " \"<>^`{}|/\\?#", z2, false);
            if (!isDot(canonicalize)) {
                if (isDotDot(canonicalize)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize);
                } else {
                    this.encodedPathSegments.add(canonicalize);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private boolean isDot(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean isDotDot(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void pop() {
            List<String> list = this.encodedPathSegments;
            if (!list.remove(list.size() - 1).isEmpty() || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        private int skipLeadingAsciiWhitespace(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private int skipTrailingAsciiWhitespace(String str, int i, int i2) {
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

        private static int schemeDelimiterOffset(String str, int i, int i2) {
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

        private static int slashCount(String str, int i, int i2) {
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

        private static int portColonOffset(String str, int i, int i2) {
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

        private static String canonicalizeHost(String str, int i, int i2) {
            String percentDecode = DeepLinkUri.percentDecode(str, i, i2);
            if (!percentDecode.startsWith("[") || !percentDecode.endsWith("]")) {
                return domainToAscii(percentDecode);
            }
            InetAddress decodeIpv6 = decodeIpv6(percentDecode, 1, percentDecode.length() - 1);
            if (decodeIpv6 == null) {
                return null;
            }
            byte[] address = decodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            throw new AssertionError();
        }

        private static InetAddress decodeIpv6(String str, int i, int i2) {
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
                            } else if (!str.regionMatches(i, ".", 0, 1) || !decodeIpv4Suffix(str, i4, i2, bArr, i5 - 2)) {
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
                        int decodeHexDigit = DeepLinkUri.decodeHexDigit(str.charAt(i));
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

        private static boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
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

        private static String domainToAscii(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty() && lowerCase != null && !containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static boolean containsInvalidHostnameAsciiCodes(String str) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static String inet6AddressToAscii(byte[] bArr) {
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
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            while (i < bArr.length) {
                if (i == i2) {
                    sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(58);
                    i += i4;
                    if (i == 16) {
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(58);
                    }
                } else {
                    if (i > 0) {
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(58);
                    }
                    sCBUniversalWebViewActivity.MediaSessionCompat$ResultReceiverWrapper((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
        }

        private static int parsePort(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(DeepLinkUri.canonicalize(str, i, i2, "", false, false));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    /* access modifiers changed from: private */
    public static int delimiterOffset(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    static String percentDecode(String str) {
        return percentDecode(str, 0, str.length());
    }

    private List<String> percentDecode(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? percentDecode(next) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String percentDecode(String str, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (str.charAt(i3) == '%') {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                sCBUniversalWebViewActivity.write(str, i, i3);
                percentDecode(sCBUniversalWebViewActivity, str, i3, i2);
                return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
            }
        }
        return str.substring(i, i2);
    }

    static void percentDecode(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, String str, int i, int i2) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int decodeHexDigit = decodeHexDigit(str.charAt(i + 1));
                int decodeHexDigit2 = decodeHexDigit(str.charAt(i3));
                if (!(decodeHexDigit == -1 || decodeHexDigit2 == -1)) {
                    sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((decodeHexDigit << 4) + decodeHexDigit2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            }
            sCBUniversalWebViewActivity.MediaDescriptionCompat(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    static String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (z2 && codePointAt == 43))) {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                sCBUniversalWebViewActivity.write(str, i, i3);
                canonicalize(sCBUniversalWebViewActivity, str, i3, i2, str2, z, z2);
                return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    static void canonicalize(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, String str, int i, int i2, String str2, boolean z, boolean z2) {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (z2 && codePointAt == 43) {
                    String str3 = z ? "%20" : "%2B";
                    onGetStartedClick.write((Object) str3, "string");
                    sCBUniversalWebViewActivity.write(str3, 0, str3.length());
                } else if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                    if (sCBUniversalWebViewActivity2 == null) {
                        sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
                    }
                    sCBUniversalWebViewActivity2.MediaDescriptionCompat(codePointAt);
                    while (true) {
                        if (sCBUniversalWebViewActivity2.read == 0) {
                            break;
                        }
                        byte MediaBrowserCompat$SearchResultReceiver = sCBUniversalWebViewActivity2.MediaBrowserCompat$SearchResultReceiver() & 255;
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(37);
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((int) HEX_DIGITS[(MediaBrowserCompat$SearchResultReceiver >> 4) & 15]);
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((int) HEX_DIGITS[MediaBrowserCompat$SearchResultReceiver & 15]);
                    }
                } else {
                    sCBUniversalWebViewActivity.MediaDescriptionCompat(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2) {
        return canonicalize(str, 0, str.length(), str2, z, z2);
    }
}
