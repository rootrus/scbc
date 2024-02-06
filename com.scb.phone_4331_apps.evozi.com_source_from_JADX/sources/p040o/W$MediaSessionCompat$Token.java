package p040o;

import android.text.TextUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.W$MediaSessionCompat$Token */
public final class W$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<getExpirationMonth> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public W$MediaSessionCompat$Token(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getExpirationMonth getexpirationmonth = (getExpirationMonth) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        getexpirationmonth.MediaBrowserCompat$CustomActionResultReceiver(str != null && !TextUtils.isEmpty(str));
    }
}
