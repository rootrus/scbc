package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p040o.C7043xa484e06c;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, (Charset) null, 4, (Object) null);
    }

    private Credentials() {
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            onGetStartedClick.IconCompatParcelizer((Object) charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        onGetStartedClick.write((Object) str, "username");
        onGetStartedClick.write((Object) str2, "password");
        onGetStartedClick.write((Object) charset, "charset");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        String obj = sb.toString();
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) obj, "$receiver");
        onGetStartedClick.write((Object) charset, "charset");
        byte[] bytes = obj.getBytes(charset);
        onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        String MediaBrowserCompat$ItemReceiver = new SCBUniversalWebViewActivity_ViewBinding(bytes).MediaBrowserCompat$ItemReceiver();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(MediaBrowserCompat$ItemReceiver);
        return sb2.toString();
    }
}
