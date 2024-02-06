package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getPitch$MediaBrowserCompat$ItemReceiver */
public final class getPitch$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportParameters> {
    public static final getPitch$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new getPitch$MediaBrowserCompat$ItemReceiver();

    getPitch$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportParameters) obj).write("scbsonboard_open_acc");
    }
}
