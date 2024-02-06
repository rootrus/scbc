package p040o;

import p040o.LottieCompositionFactory;
import p040o.zzbt;

/* renamed from: o.zacs */
public final /* synthetic */ class zacs implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zacs(getAccountTypes getaccounttypes) {
    }

    public final Object write(Object obj) {
        LottieCompositionFactory.C36053 r5 = (LottieCompositionFactory.C36053) obj;
        zzbt$zzf$MediaBrowserCompat$ItemReceiver zzbt_zzf_mediabrowsercompat_itemreceiver = new zzbt$zzf$MediaBrowserCompat$ItemReceiver((byte) 0);
        boolean z = true;
        zzbt_zzf_mediabrowsercompat_itemreceiver.write = r5.write == 1;
        zzbt_zzf_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = r5.IconCompatParcelizer == 1;
        if (r5.MediaBrowserCompat$ItemReceiver != 1) {
            z = false;
        }
        zzbt_zzf_mediabrowsercompat_itemreceiver.IconCompatParcelizer = z;
        return new zzbt.zzf(zzbt_zzf_mediabrowsercompat_itemreceiver, (byte) 0);
    }
}
