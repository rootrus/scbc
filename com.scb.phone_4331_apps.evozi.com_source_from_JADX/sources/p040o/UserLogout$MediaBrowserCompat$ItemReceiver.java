package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.UserLogout$MediaBrowserCompat$ItemReceiver */
public final class UserLogout$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractorResponse> {
    public static final UserLogout$MediaBrowserCompat$ItemReceiver write = new UserLogout$MediaBrowserCompat$ItemReceiver();

    UserLogout$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportExtractorResponse) obj).read();
    }
}
