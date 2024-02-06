package p040o;

import p040o.LookAndFeelParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.UserLogoutResponse$MediaBrowserCompat$MediaItem */
public final class UserLogoutResponse$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ onUncaughtException write;

    public UserLogoutResponse$MediaBrowserCompat$MediaItem(onUncaughtException onuncaughtexception) {
        this.write = onuncaughtexception;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LookAndFeelParameters.TorchMode) obj).IconCompatParcelizer(this.write);
    }
}
