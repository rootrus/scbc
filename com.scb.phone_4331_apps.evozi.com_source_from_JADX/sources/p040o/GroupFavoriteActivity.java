package p040o;

import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: o.GroupFavoriteActivity */
public final class GroupFavoriteActivity {
    public static final Charset IconCompatParcelizer;
    public static Charset MediaBrowserCompat$CustomActionResultReceiver;
    public static final GroupFavoriteActivity read = new GroupFavoriteActivity();
    public static Charset write;

    static {
        Charset forName = Charset.forName("UTF-8");
        onGetStartedClick.IconCompatParcelizer((Object) forName, "Charset.forName(\"UTF-8\")");
        IconCompatParcelizer = forName;
        onGetStartedClick.IconCompatParcelizer((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        onGetStartedClick.IconCompatParcelizer((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        onGetStartedClick.IconCompatParcelizer((Object) Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        onGetStartedClick.IconCompatParcelizer((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        onGetStartedClick.IconCompatParcelizer((Object) Charset.forName(LocalizedMessage.DEFAULT_ENCODING), "Charset.forName(\"ISO-8859-1\")");
    }

    private GroupFavoriteActivity() {
    }
}
