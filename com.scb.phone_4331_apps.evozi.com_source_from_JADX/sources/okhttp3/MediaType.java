package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import p040o.GoodToKnowActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class MediaType {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    /* access modifiers changed from: private */
    public static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    public final Charset charset() {
        return charset$default(this, (Charset) null, 1, (Object) null);
    }

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String str4, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(str, str2, str3, str4);
    }

    public final String type() {
        return this.type;
    }

    public final String subtype() {
        return this.subtype;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType2, Charset charset2, int i, Object obj) {
        if ((i & 1) != 0) {
            charset2 = null;
        }
        return mediaType2.charset(charset2);
    }

    public final Charset charset(Charset charset2) {
        try {
            return this.charset != null ? Charset.forName(this.charset) : charset2;
        } catch (IllegalArgumentException unused) {
            return charset2;
        }
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final String m6396deprecated_type() {
        return this.type;
    }

    /* renamed from: -deprecated_subtype  reason: not valid java name */
    public final String m6395deprecated_subtype() {
        return this.subtype;
    }

    public final String toString() {
        return this.mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((MediaType) obj).mediaType, (Object) this.mediaType);
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final MediaType get(String str) {
            onGetStartedClick.write((Object) str, "$this$toMediaType");
            CharSequence charSequence = str;
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(charSequence);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                onGetStartedClick.IconCompatParcelizer((Object) group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
                if (group != null) {
                    String lowerCase = group.toLowerCase(locale);
                    onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String group2 = matcher.group(2);
                    onGetStartedClick.IconCompatParcelizer((Object) group2, "typeSubtype.group(2)");
                    Locale locale2 = Locale.US;
                    onGetStartedClick.IconCompatParcelizer((Object) locale2, "Locale.US");
                    if (group2 != null) {
                        String lowerCase2 = group2.toLowerCase(locale2);
                        onGetStartedClick.IconCompatParcelizer((Object) lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        Matcher matcher2 = MediaType.PARAMETER.matcher(charSequence);
                        int end = matcher.end();
                        String str2 = null;
                        while (end < str.length()) {
                            matcher2.region(end, str.length());
                            if (matcher2.lookingAt()) {
                                String group3 = matcher2.group(1);
                                if (group3 == null || !GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(group3, "charset", true)) {
                                    end = matcher2.end();
                                } else {
                                    String group4 = matcher2.group(2);
                                    boolean z = false;
                                    if (group4 == null) {
                                        group4 = matcher2.group(3);
                                        onGetStartedClick.IconCompatParcelizer((Object) group4, "parameter.group(3)");
                                    } else if (GoodToKnowActivity.read(group4, "'", false)) {
                                        onGetStartedClick.write((Object) group4, "$this$endsWith");
                                        onGetStartedClick.write((Object) "'", "suffix");
                                        if (group4.endsWith("'") && group4.length() > 2) {
                                            group4 = group4.substring(1, group4.length() - 1);
                                            onGetStartedClick.IconCompatParcelizer((Object) group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        }
                                    }
                                    if (str2 == null || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(group4, str2, true)) {
                                        z = true;
                                    }
                                    if (z) {
                                        str2 = group4;
                                        end = matcher2.end();
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Multiple charsets defined: \"");
                                        sb.append(str2);
                                        sb.append("\" and: \"");
                                        sb.append(group4);
                                        sb.append("\" for: \"");
                                        sb.append(str);
                                        sb.append('\"');
                                        throw new IllegalArgumentException(sb.toString().toString());
                                    }
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Parameter is not formatted correctly: \"");
                                String substring = str.substring(end);
                                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                                sb2.append(substring);
                                sb2.append("\" for: \"");
                                sb2.append(str);
                                sb2.append('\"');
                                throw new IllegalArgumentException(sb2.toString().toString());
                            }
                        }
                        return new MediaType(str, lowerCase, lowerCase2, str2, (NtbDiscoverFundFilterActivity) null);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No subtype found for: \"");
            sb3.append(str);
            sb3.append('\"');
            throw new IllegalArgumentException(sb3.toString().toString());
        }

        public final MediaType parse(String str) {
            onGetStartedClick.write((Object) str, "$this$toMediaTypeOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final MediaType m6397deprecated_get(String str) {
            onGetStartedClick.write((Object) str, "mediaType");
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final MediaType m6398deprecated_parse(String str) {
            onGetStartedClick.write((Object) str, "mediaType");
            return parse(str);
        }
    }
}
