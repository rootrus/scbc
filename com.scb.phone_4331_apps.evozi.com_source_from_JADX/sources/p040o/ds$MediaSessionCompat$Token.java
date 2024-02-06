package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ds$MediaSessionCompat$Token */
public final class ds$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
    private /* synthetic */ String write;

    public ds$MediaSessionCompat$Token(String str) {
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str = this.write;
        onGetStartedClick.IconCompatParcelizer((Object) str, "json");
        ((getInnerThrowables) obj).MediaBrowserCompat$SearchResultReceiver(str);
    }
}
