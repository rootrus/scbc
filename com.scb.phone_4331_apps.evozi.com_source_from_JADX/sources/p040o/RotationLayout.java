package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.RotationLayout */
public final /* synthetic */ class RotationLayout implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Lazy read;
    private final /* synthetic */ String write;

    public /* synthetic */ RotationLayout(String str, String str2, Lazy lazy, String str3) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = lazy;
        this.IconCompatParcelizer = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str = this.write;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        Lazy lazy = this.read;
        String str3 = this.IconCompatParcelizer;
        C1423x2520faf1 proxygetiiddeserializerondevice_mediabrowsercompat_customactionresultreceiver = (C1423x2520faf1) obj;
        Object[] objArr = new Object[2];
        if (str2.length() <= 0) {
            str2 = lazy.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
        }
        objArr[0] = str2;
        objArr[1] = str3;
        proxygetiiddeserializerondevice_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(String.format(str, objArr));
    }
}
