package p040o;

import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: o.setViewCacheExtension */
public final class setViewCacheExtension {
    public static final Charset IconCompatParcelizer = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
    public static final Charset MediaBrowserCompat$CustomActionResultReceiver = Charset.forName("US-ASCII");
    public static final Charset MediaBrowserCompat$ItemReceiver = Charset.forName("UTF-16BE");
    public static final Charset read = Charset.forName("UTF-16LE");
    public static final Charset write = Charset.forName("UTF-8");

    static {
        Charset.forName("UTF-16");
    }
}
