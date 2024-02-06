package okhttp3.repackaged;

import java.io.UnsupportedEncodingException;
import org.bouncycastle.i18n.LocalizedMessage;
import p040o.PinLoginActivity_ViewBinding;
import p040o.SetupQuickBalanceActivity;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String MediaBrowserCompat$ItemReceiver = SetupQuickBalanceActivity.MediaBrowserCompat$ItemReceiver(PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(sb.toString().getBytes(LocalizedMessage.DEFAULT_ENCODING)).write);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Basic ");
            sb2.append(MediaBrowserCompat$ItemReceiver);
            return sb2.toString();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
