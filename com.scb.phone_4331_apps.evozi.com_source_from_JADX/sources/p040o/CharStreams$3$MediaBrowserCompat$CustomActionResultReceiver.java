package p040o;

import p040o.LottieDrawable;
import p040o.zzfo;

/* renamed from: o.CharStreams$3$MediaBrowserCompat$CustomActionResultReceiver */
public final class CharStreams$3$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ setShowCancelButton write;

    private CharStreams$3$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ CharStreams$3$MediaBrowserCompat$CustomActionResultReceiver(setShowCancelButton setshowcancelbutton) {
        this.write = setshowcancelbutton;
    }

    public final Object IconCompatParcelizer(Object obj) {
        LottieDrawable.C361511 r3 = (LottieDrawable.C361511) obj;
        zzfo$zzc$MediaBrowserCompat$ItemReceiver zzfo_zzc_mediabrowsercompat_itemreceiver = new zzfo$zzc$MediaBrowserCompat$ItemReceiver();
        zzfo_zzc_mediabrowsercompat_itemreceiver.read = r3.write;
        zzfo_zzc_mediabrowsercompat_itemreceiver.IconCompatParcelizer = r3.MediaBrowserCompat$CustomActionResultReceiver;
        zzfo_zzc_mediabrowsercompat_itemreceiver.write = r3.MediaBrowserCompat$ItemReceiver;
        zzfo_zzc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = r3.IconCompatParcelizer;
        zzfo_zzc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = r3.read;
        zzfo_zzc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = r3.MediaBrowserCompat$SearchResultReceiver;
        return new zzfo.zzc(zzfo_zzc_mediabrowsercompat_itemreceiver, (byte) 0);
    }
}
