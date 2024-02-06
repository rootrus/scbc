package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;
import p040o.AddAccountConsentActivity;
import p040o.C1132xe4073f0a;
import p040o.GoodToKnowActivity;
import p040o.GroupFavoriteActivity;
import p040o.HmlNTBEkycVerifyIdentifyBranchActivity;
import p040o.HmlNationalIdActivity;
import p040o.LifestyleCustomizationActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.OffshoreCurrencyActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.ScbsInputActivity;
import p040o.onGetStartedClick;

public final class HttpUrl {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    /* access modifiers changed from: private */
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url2) {
        return Companion.get(url2);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        onGetStartedClick.write((Object) str, "scheme");
        onGetStartedClick.write((Object) str2, "username");
        onGetStartedClick.write((Object) str3, "password");
        onGetStartedClick.write((Object) str4, "host");
        onGetStartedClick.write((Object) list, "pathSegments");
        onGetStartedClick.write((Object) str6, ImagesContract.URL);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "https");
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String username() {
        return this.username;
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

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final String fragment() {
        return this.fragment;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI uri() {
        String obj = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(obj);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new LifestyleCustomizationActivity("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").read(obj, ""));
                onGetStartedClick.IconCompatParcelizer((Object) create, "URI.create(stripped)");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(length, delimiterOffset);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) this.url, ':', this.scheme.length() + 3, false);
        int MediaBrowserCompat$CustomActionResultReceiver2 = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) this.url, '@', 0, false);
        String str = this.url;
        if (str != null) {
            String substring = str.substring(MediaBrowserCompat$CustomActionResultReceiver + 1, MediaBrowserCompat$CustomActionResultReceiver2);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final String encodedPath() {
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) this.url, '/', this.scheme.length() + 3, false);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", MediaBrowserCompat$CustomActionResultReceiver, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(MediaBrowserCompat$CustomActionResultReceiver, delimiterOffset);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final List<String> encodedPathSegments() {
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) this.url, '/', this.scheme.length() + 3, false);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", MediaBrowserCompat$CustomActionResultReceiver, str.length());
        List<String> arrayList = new ArrayList<>();
        while (MediaBrowserCompat$CustomActionResultReceiver < delimiterOffset) {
            int i = MediaBrowserCompat$CustomActionResultReceiver + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String str2 = this.url;
            if (str2 != null) {
                String substring = str2.substring(i, delimiterOffset2);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                MediaBrowserCompat$CustomActionResultReceiver = delimiterOffset2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) this.url, '?', 0, false) + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, '#', MediaBrowserCompat$CustomActionResultReceiver, str.length());
        String str2 = this.url;
        if (str2 != null) {
            String substring = str2.substring(MediaBrowserCompat$CustomActionResultReceiver, delimiterOffset);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String queryParameter(String str) {
        AddAccountConsentActivity addAccountConsentActivity;
        onGetStartedClick.write((Object) str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size <= Integer.MIN_VALUE) {
            C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
            addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
        } else {
            addAccountConsentActivity = new AddAccountConsentActivity(0, size - 1);
        }
        OffshoreCurrencyActivity write = ScbsInputActivity.write(addAccountConsentActivity, 2);
        int i = write.IconCompatParcelizer;
        int i2 = write.write;
        int i3 = write.read;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) this.queryNamesAndValues.get(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return this.queryNamesAndValues.get(i + 1);
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        AddAccountConsentActivity addAccountConsentActivity;
        if (this.queryNamesAndValues == null) {
            return HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        if (size <= Integer.MIN_VALUE) {
            C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
            addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
        } else {
            addAccountConsentActivity = new AddAccountConsentActivity(0, size - 1);
        }
        OffshoreCurrencyActivity write = ScbsInputActivity.write(addAccountConsentActivity, 2);
        int i = write.IconCompatParcelizer;
        int i2 = write.write;
        int i3 = write.read;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                if (str == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final List<String> queryParameterValues(String str) {
        AddAccountConsentActivity addAccountConsentActivity;
        onGetStartedClick.write((Object) str, "name");
        if (this.queryNamesAndValues == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        List arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        if (size <= Integer.MIN_VALUE) {
            C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
            addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
        } else {
            addAccountConsentActivity = new AddAccountConsentActivity(0, size - 1);
        }
        OffshoreCurrencyActivity write = ScbsInputActivity.write(addAccountConsentActivity, 2);
        int i = write.IconCompatParcelizer;
        int i2 = write.write;
        int i3 = write.read;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i << 1);
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i << 1) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) this.url, '#', 0, false);
        String str = this.url;
        if (str != null) {
            String substring = str.substring(MediaBrowserCompat$CustomActionResultReceiver + 1);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        if (newBuilder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        onGetStartedClick.write((Object) str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String str) {
        onGetStartedClick.write((Object) str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((HttpUrl) obj).url, (Object) this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m6389deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m6388deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m6387deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m6377deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m6390deprecated_username() {
        return this.username;
    }

    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m6373deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m6380deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m6379deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m6383deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m6382deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m6374deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m6375deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m6381deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m6376deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m6384deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m6386deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m6385deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m6372deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m6378deprecated_fragment() {
        return this.fragment;
    }

    public static final class Builder {
        public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private String encodedPassword = "";
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String encodedUsername = "";
        private String host;
        private int port = -1;
        private String scheme;

        public Builder() {
            List<String> arrayList = new ArrayList<>();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(String str) {
            onGetStartedClick.write((Object) str, "<set-?>");
            this.encodedUsername = str;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(String str) {
            onGetStartedClick.write((Object) str, "<set-?>");
            this.encodedPassword = str;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final Builder scheme(String str) {
            onGetStartedClick.write((Object) str, "scheme");
            Builder builder = this;
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "http", true)) {
                builder.scheme = "http";
            } else if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "https", true)) {
                builder.scheme = "https";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected scheme: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            return builder;
        }

        public final Builder username(String str) {
            onGetStartedClick.write((Object) str, "username");
            Builder builder = this;
            builder.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return builder;
        }

        public final Builder encodedUsername(String str) {
            onGetStartedClick.write((Object) str, "encodedUsername");
            Builder builder = this;
            builder.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return builder;
        }

        public final Builder password(String str) {
            onGetStartedClick.write((Object) str, "password");
            Builder builder = this;
            builder.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return builder;
        }

        public final Builder encodedPassword(String str) {
            onGetStartedClick.write((Object) str, "encodedPassword");
            Builder builder = this;
            builder.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return builder;
        }

        public final Builder host(String str) {
            onGetStartedClick.write((Object) str, "host");
            Builder builder = this;
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, (Object) null));
            if (canonicalHost != null) {
                builder.host = canonicalHost;
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected host: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder port(int i) {
            Builder builder = this;
            if (i > 0 && 65535 >= i) {
                builder.port = i;
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return companion.defaultPort(str);
        }

        public final Builder addPathSegment(String str) {
            onGetStartedClick.write((Object) str, "pathSegment");
            Builder builder = this;
            builder.push(str, 0, str.length(), false, false);
            return builder;
        }

        public final Builder addPathSegments(String str) {
            onGetStartedClick.write((Object) str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addEncodedPathSegment(String str) {
            onGetStartedClick.write((Object) str, "encodedPathSegment");
            Builder builder = this;
            builder.push(str, 0, str.length(), false, true);
            return builder;
        }

        public final Builder addEncodedPathSegments(String str) {
            onGetStartedClick.write((Object) str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        private final Builder addPathSegments(String str, boolean z) {
            Builder builder = this;
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                builder.push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return builder;
        }

        public final Builder setPathSegment(int i, String str) {
            onGetStartedClick.write((Object) str, "pathSegment");
            Builder builder = this;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, (Charset) null, 251, (Object) null);
            if (!builder.isDot(canonicalize$okhttp$default) && !builder.isDotDot(canonicalize$okhttp$default)) {
                builder.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected path segment: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            onGetStartedClick.write((Object) str, "encodedPathSegment");
            Builder builder = this;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, (Charset) null, 243, (Object) null);
            builder.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!builder.isDot(canonicalize$okhttp$default) && !builder.isDotDot(canonicalize$okhttp$default)) {
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected path segment: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder removePathSegment(int i) {
            Builder builder = this;
            builder.encodedPathSegments.remove(i);
            if (builder.encodedPathSegments.isEmpty()) {
                builder.encodedPathSegments.add("");
            }
            return builder;
        }

        public final Builder encodedPath(String str) {
            onGetStartedClick.write((Object) str, "encodedPath");
            Builder builder = this;
            if (GoodToKnowActivity.read(str, "/", false)) {
                builder.resolvePath(str, 0, str.length());
                return builder;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected encodedPath: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.Companion, r14, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, false, false, true, false, (java.nio.charset.Charset) null, 219, (java.lang.Object) null);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.HttpUrl.Builder query(java.lang.String r14) {
            /*
                r13 = this;
                r0 = r13
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                if (r14 == 0) goto L_0x0021
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                java.lang.String r5 = " \"'<>#"
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 == 0) goto L_0x0021
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List r14 = r1.toQueryNamesAndValues$okhttp(r14)
                goto L_0x0022
            L_0x0021:
                r14 = 0
            L_0x0022:
                r0.encodedQueryNamesAndValues = r14
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.Companion, r14, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (java.nio.charset.Charset) null, org.bouncycastle.math.Primes.SMALL_FACTOR_LIMIT, (java.lang.Object) null);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String r14) {
            /*
                r13 = this;
                r0 = r13
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                if (r14 == 0) goto L_0x0021
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r3 = 0
                r4 = 0
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                java.lang.String r5 = " \"'<>#"
                r2 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 == 0) goto L_0x0021
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List r14 = r1.toQueryNamesAndValues$okhttp(r14)
                goto L_0x0022
            L_0x0021:
                r14 = 0
            L_0x0022:
                r0.encodedQueryNamesAndValues = r14
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        public final Builder addQueryParameter(String str, String str2) {
            String str3 = str;
            onGetStartedClick.write((Object) str, "name");
            Builder builder = this;
            if (builder.encodedQueryNamesAndValues == null) {
                builder.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = builder.encodedQueryNamesAndValues;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            List<String> list2 = builder.encodedQueryNamesAndValues;
            if (list2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return builder;
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            String str3 = str;
            onGetStartedClick.write((Object) str, "encodedName");
            Builder builder = this;
            if (builder.encodedQueryNamesAndValues == null) {
                builder.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = builder.encodedQueryNamesAndValues;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, Primes.SMALL_FACTOR_LIMIT, (Object) null));
            List<String> list2 = builder.encodedQueryNamesAndValues;
            if (list2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, Primes.SMALL_FACTOR_LIMIT, (Object) null) : null);
            return builder;
        }

        public final Builder setQueryParameter(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            Builder builder = this;
            builder.removeAllQueryParameters(str);
            builder.addQueryParameter(str, str2);
            return builder;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            onGetStartedClick.write((Object) str, "encodedName");
            Builder builder = this;
            builder.removeAllEncodedQueryParameters(str);
            builder.addEncodedQueryParameter(str, str2);
            return builder;
        }

        public final Builder removeAllQueryParameters(String str) {
            onGetStartedClick.write((Object) str, "name");
            Builder builder = this;
            if (builder.encodedQueryNamesAndValues == null) {
                return builder;
            }
            builder.removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            return builder;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            onGetStartedClick.write((Object) str, "encodedName");
            Builder builder = this;
            if (builder.encodedQueryNamesAndValues == null) {
                return builder;
            }
            builder.removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, Primes.SMALL_FACTOR_LIMIT, (Object) null));
            return builder;
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            OffshoreCurrencyActivity.IconCompatParcelizer iconCompatParcelizer = OffshoreCurrencyActivity.MediaBrowserCompat$ItemReceiver;
            OffshoreCurrencyActivity write = ScbsInputActivity.write(new OffshoreCurrencyActivity(list.size() - 2, 0, -1), 2);
            int i = write.IconCompatParcelizer;
            int i2 = write.write;
            int i3 = write.read;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                if (list2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) list2.get(i))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    if (list3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    list3.remove(i + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    if (list4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    list4.remove(i);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    if (list5 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }

        public final Builder fragment(String str) {
            Builder builder = this;
            builder.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, (Charset) null, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, (Object) null) : null;
            return builder;
        }

        public final Builder encodedFragment(String str) {
            Builder builder = this;
            builder.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, (Charset) null, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, (Object) null) : null;
            return builder;
        }

        public final Builder reencodeForUri$okhttp() {
            Builder builder = this;
            int size = builder.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                builder.encodedPathSegments.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, builder.encodedPathSegments.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list = builder.encodedQueryNamesAndValues;
            String str = null;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list.get(i2);
                    list.set(i2, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, (Charset) null, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, (Object) null) : null);
                }
            }
            String str3 = builder.encodedFragment;
            if (str3 != null) {
                str = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, (Charset) null, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, (Object) null);
            }
            builder.encodedFragment = str;
            return builder;
        }

        public final HttpUrl build() {
            String str = this.scheme;
            if (str != null) {
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedUsername, 0, 0, false, 7, (Object) null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedPassword, 0, 0, false, 7, (Object) null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List percentDecode$default = Companion.percentDecode$default(HttpUrl.Companion, this.encodedPathSegments, false, 1, (Object) null);
                    if (percentDecode$default != null) {
                        List<String> list = this.encodedQueryNamesAndValues;
                        List access$percentDecode = list != null ? HttpUrl.Companion.percentDecode(list, true) : null;
                        String str3 = this.encodedFragment;
                        return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, percentDecode$default, access$percentDecode, str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, false, 7, (Object) null) : null, toString());
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
            if ((r5.encodedPassword.length() > 0) != false) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
            if (r1 != r2.defaultPort(r3)) goto L_0x009f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r5.encodedUsername
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0025
                r1 = r2
                goto L_0x0026
            L_0x0025:
                r1 = r3
            L_0x0026:
                r4 = 58
                if (r1 != 0) goto L_0x0039
                java.lang.String r1 = r5.encodedPassword
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0036
                r1 = r2
                goto L_0x0037
            L_0x0036:
                r1 = r3
            L_0x0037:
                if (r1 == 0) goto L_0x0059
            L_0x0039:
                java.lang.String r1 = r5.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r5.encodedPassword
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0049
                goto L_0x004a
            L_0x0049:
                r2 = r3
            L_0x004a:
                if (r2 == 0) goto L_0x0054
                r0.append(r4)
                java.lang.String r1 = r5.encodedPassword
                r0.append(r1)
            L_0x0054:
                r1 = 64
                r0.append(r1)
            L_0x0059:
                java.lang.String r1 = r5.host
                if (r1 == 0) goto L_0x007f
                if (r1 != 0) goto L_0x0062
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x0062:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = p040o.GoodToKnowActivity.IconCompatParcelizer(r1, r4, r3)
                if (r1 == 0) goto L_0x007a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x007f
            L_0x007a:
                java.lang.String r1 = r5.host
                r0.append(r1)
            L_0x007f:
                int r1 = r5.port
                r2 = -1
                if (r1 != r2) goto L_0x0088
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L_0x00a5
            L_0x0088:
                int r1 = r5.effectivePort()
                java.lang.String r2 = r5.scheme
                if (r2 == 0) goto L_0x009f
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                java.lang.String r3 = r5.scheme
                if (r3 != 0) goto L_0x0099
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x0099:
                int r2 = r2.defaultPort(r3)
                if (r1 == r2) goto L_0x00a5
            L_0x009f:
                r0.append(r4)
                r0.append(r1)
            L_0x00a5:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r5.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r1 = r5.encodedQueryNamesAndValues
                if (r1 == 0) goto L_0x00c1
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                if (r2 != 0) goto L_0x00be
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x00be:
                r1.toQueryString$okhttp(r2, r0)
            L_0x00c1:
                java.lang.String r1 = r5.encodedFragment
                if (r1 == 0) goto L_0x00cf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.encodedFragment
                r0.append(r1)
            L_0x00cf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int i;
            int delimiterOffset;
            int i2;
            String str2;
            String str3;
            int i3;
            boolean z;
            int i4;
            boolean z2;
            boolean z3;
            String str4 = str;
            onGetStartedClick.write((Object) str4, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, (Object) null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, indexOfFirstNonAsciiWhitespace$default, 0, 2, (Object) null);
            int access$schemeDelimiterOffset = Companion.schemeDelimiterOffset(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            boolean z4 = true;
            if (access$schemeDelimiterOffset != -1) {
                if (GoodToKnowActivity.write(str4, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (GoodToKnowActivity.write(str4, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, access$schemeDelimiterOffset);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int access$slashCount = Companion.slashCount(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = '#';
            if (access$slashCount >= 2 || httpUrl == null || (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) httpUrl.scheme(), (Object) this.scheme))) {
                int i5 = indexOfFirstNonAsciiWhitespace$default + access$slashCount;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str4, "@/\\?#", i5, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str4.charAt(delimiterOffset) : c;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        boolean z7 = z4;
                        String str6 = str5;
                        i = indexOfLastNonAsciiWhitespace$default;
                        int i6 = delimiterOffset;
                        int access$portColonOffset = Companion.portColonOffset(str4, i5, i6);
                        int i7 = access$portColonOffset + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z5) {
                                int delimiterOffset2 = Util.delimiterOffset(str4, ':', i5, delimiterOffset);
                                String str7 = "%40";
                                int i8 = delimiterOffset;
                                int i9 = delimiterOffset2;
                                z = z4;
                                i3 = indexOfLastNonAsciiWhitespace$default;
                                String str8 = str5;
                                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z6) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.encodedUsername);
                                    sb2.append(str7);
                                    sb2.append(canonicalize$okhttp$default);
                                    canonicalize$okhttp$default = sb2.toString();
                                }
                                this.encodedUsername = canonicalize$okhttp$default;
                                int i10 = i8;
                                int i11 = i9;
                                if (i11 != i10) {
                                    this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z3 = z;
                                } else {
                                    z3 = z5;
                                }
                                z5 = z3;
                                str3 = str8;
                                z2 = z;
                                i4 = i10;
                            } else {
                                z = z4;
                                i3 = indexOfLastNonAsciiWhitespace$default;
                                String str9 = str5;
                                int i12 = delimiterOffset;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.encodedPassword);
                                sb3.append("%40");
                                StringBuilder sb4 = sb3;
                                str3 = str9;
                                i4 = i12;
                                sb4.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.encodedPassword = sb4.toString();
                                z2 = z6;
                            }
                            i5 = i4 + 1;
                            z6 = z2;
                        } else {
                            z = z4;
                            str3 = str5;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                        }
                        z4 = z;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        str5 = str3;
                        c3 = '#';
                        c2 = '?';
                        c = 65535;
                    }
                }
                boolean z72 = z4;
                String str62 = str5;
                i = indexOfLastNonAsciiWhitespace$default;
                int i62 = delimiterOffset;
                int access$portColonOffset2 = Companion.portColonOffset(str4, i5, i62);
                int i72 = access$portColonOffset2 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, access$portColonOffset2, false, 4, (Object) null));
                    int access$parsePort = Companion.parsePort(str4, i72, i62);
                    this.port = access$parsePort;
                    if (access$parsePort != -1 ? z72 : false) {
                        str2 = str62;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        onGetStartedClick.IconCompatParcelizer((Object) substring2, str62);
                        sb5.append(substring2);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i2, access$portColonOffset2, false, 4, (Object) null));
                    Companion companion = HttpUrl.Companion;
                    String str10 = this.scheme;
                    if (str10 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    this.port = companion.defaultPort(str10);
                }
                if (this.host == null ? false : z72) {
                    indexOfFirstNonAsciiWhitespace$default = i62;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, access$portColonOffset2);
                    onGetStartedClick.IconCompatParcelizer((Object) substring3, str2);
                    sb6.append(substring3);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str4.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i13 = i;
            int delimiterOffset3 = Util.delimiterOffset(str4, "?#", indexOfFirstNonAsciiWhitespace$default, i13);
            resolvePath(str4, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str4, '#', delimiterOffset3, i13);
                this.encodedQueryNamesAndValues = HttpUrl.Companion.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 208, (Object) null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i13, "", true, false, false, true, (Charset) null, CipherSuite.TLS_PSK_WITH_NULL_SHA256, (Object) null);
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC] */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
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
                int r12 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r11, (java.lang.String) r12, (int) r6, (int) r13)
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
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final boolean isDot(String str) {
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) ".") || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "..") || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "%2e.", true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, ".%2e", true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
                this();
            }

            /* access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && !(('0' <= charAt2 && '9' >= charAt2) || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
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

            /* access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
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

            /* access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (parseInt > 0 && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final int defaultPort(String str) {
            onGetStartedClick.write((Object) str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                return (hashCode != 99617003 || !str.equals("https")) ? -1 : 443;
            }
            if (str.equals("http")) {
                return 80;
            }
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            onGetStartedClick.write((Object) list, "$this$toPathString");
            onGetStartedClick.write((Object) sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            AddAccountConsentActivity addAccountConsentActivity;
            onGetStartedClick.write((Object) list, "$this$toQueryString");
            onGetStartedClick.write((Object) sb, "out");
            int size = list.size();
            if (size <= Integer.MIN_VALUE) {
                C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
                addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
            } else {
                addAccountConsentActivity = new AddAccountConsentActivity(0, size - 1);
            }
            OffshoreCurrencyActivity write = ScbsInputActivity.write(addAccountConsentActivity, 2);
            int i = write.IconCompatParcelizer;
            int i2 = write.write;
            int i3 = write.read;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
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
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            onGetStartedClick.write((Object) str, "$this$toQueryNamesAndValues");
            List<String> arrayList = new ArrayList<>();
            int i = 0;
            while (i <= str.length()) {
                CharSequence charSequence = str;
                int read = GoodToKnowActivity.read(charSequence, '&', i, false, 4);
                if (read == -1) {
                    read = str.length();
                }
                int read2 = GoodToKnowActivity.read(charSequence, '=', i, false, 4);
                if (read2 == -1 || read2 > read) {
                    String substring = str.substring(i, read);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, read2);
                    onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(read2 + 1, read);
                    onGetStartedClick.IconCompatParcelizer((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = read + 1;
            }
            return arrayList;
        }

        public final HttpUrl get(String str) {
            onGetStartedClick.write((Object) str, "$this$toHttpUrl");
            return new Builder().parse$okhttp((HttpUrl) null, str).build();
        }

        public final HttpUrl parse(String str) {
            onGetStartedClick.write((Object) str, "$this$toHttpUrlOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final HttpUrl get(URL url) {
            onGetStartedClick.write((Object) url, "$this$toHttpUrlOrNull");
            String obj = url.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "toString()");
            return parse(obj);
        }

        public final HttpUrl get(URI uri) {
            onGetStartedClick.write((Object) uri, "$this$toHttpUrlOrNull");
            String obj = uri.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "toString()");
            return parse(obj);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m6391deprecated_get(String str) {
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m6394deprecated_parse(String str) {
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            return parse(str);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m6393deprecated_get(URL url) {
            onGetStartedClick.write((Object) url, ImagesContract.URL);
            return get(url);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m6392deprecated_get(URI uri) {
            onGetStartedClick.write((Object) uri, "uri");
            return get(uri);
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            onGetStartedClick.write((Object) str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                    sCBUniversalWebViewActivity.write(str, i, i3);
                    writePercentDecoded(sCBUniversalWebViewActivity, str, i3, i2, z);
                    return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
                }
            }
            String substring = str.substring(i, i2);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        private final void writePercentDecoded(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt == 37 && (i3 = i + 2) < i2) {
                        int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                        int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                        if (!(parseHexDigit == -1 || parseHexDigit2 == -1)) {
                            sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((parseHexDigit << 4) + parseHexDigit2);
                            i = Character.charCount(codePointAt) + i3;
                        }
                    } else if (codePointAt == 43 && z) {
                        sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(32);
                        i++;
                    }
                    sCBUniversalWebViewActivity.MediaDescriptionCompat(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        static /* synthetic */ List percentDecode$default(Companion companion, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.percentDecode(list, z);
        }

        /* access modifiers changed from: private */
        public final List<String> percentDecode(List<String> list, boolean z) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                arrayList.add(next != null ? percentDecode$okhttp$default(this, next, 0, 0, z, 3, (Object) null) : null);
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || Util.parseHexDigit(str.charAt(i + 1)) == -1 || Util.parseHexDigit(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            onGetStartedClick.write((Object) str, "$this$canonicalize");
            onGetStartedClick.write((Object) str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    CharSequence charSequence = str4;
                    onGetStartedClick.write((Object) charSequence, "$this$contains");
                    boolean z5 = false;
                    if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, (char) codePointAt, 0, false) >= 0) {
                        z5 = true;
                    }
                    if (!z5 && ((codePointAt != 37 || (z && (!z2 || isPercentEncoded(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                        i4 += Character.charCount(codePointAt);
                    }
                }
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                int i5 = i;
                sCBUniversalWebViewActivity.write(str, i, i4);
                writeCanonicalized(sCBUniversalWebViewActivity, str, i4, i2, str2, z, z2, z3, z4, charset);
                return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        private final void writeCanonicalized(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = sCBUniversalWebViewActivity;
            String str3 = str;
            int i3 = i2;
            Charset charset2 = charset;
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity3 = null;
            int i4 = i;
            while (i4 < i3) {
                if (str3 != null) {
                    int codePointAt = str3.codePointAt(i4);
                    if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                        if (codePointAt != 43 || !z3) {
                            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                                CharSequence charSequence = str2;
                                onGetStartedClick.write((Object) charSequence, "$this$contains");
                                if (!(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, (char) codePointAt, 0, false) >= 0) && (codePointAt != 37 || (z && (!z2 || isPercentEncoded(str3, i4, i3))))) {
                                    sCBUniversalWebViewActivity2.MediaDescriptionCompat(codePointAt);
                                }
                            }
                            if (sCBUniversalWebViewActivity3 == null) {
                                sCBUniversalWebViewActivity3 = new SCBUniversalWebViewActivity();
                            }
                            if (charset2 == null || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) charset2, (Object) StandardCharsets.UTF_8)) {
                                sCBUniversalWebViewActivity3.MediaDescriptionCompat(codePointAt);
                            } else {
                                sCBUniversalWebViewActivity3.IconCompatParcelizer(str3, i4, Character.charCount(codePointAt) + i4, charset2);
                            }
                            while (true) {
                                if (sCBUniversalWebViewActivity3.read == 0) {
                                    break;
                                }
                                byte MediaBrowserCompat$SearchResultReceiver = sCBUniversalWebViewActivity3.MediaBrowserCompat$SearchResultReceiver() & 255;
                                sCBUniversalWebViewActivity2.MediaBrowserCompat$ItemReceiver(37);
                                sCBUniversalWebViewActivity2.MediaBrowserCompat$ItemReceiver((int) HttpUrl.HEX_DIGITS[(MediaBrowserCompat$SearchResultReceiver >> 4) & 15]);
                                sCBUniversalWebViewActivity2.MediaBrowserCompat$ItemReceiver((int) HttpUrl.HEX_DIGITS[MediaBrowserCompat$SearchResultReceiver & 15]);
                            }
                        } else {
                            String str4 = z ? "+" : "%2B";
                            onGetStartedClick.write((Object) str4, "string");
                            sCBUniversalWebViewActivity2.write(str4, 0, str4.length());
                        }
                    }
                    i4 += Character.charCount(codePointAt);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }
}
