package p040o;

import p040o.LottieCompositionFactory;
import p040o.zzbt;
import p040o.zzby;

/* renamed from: o.createStringArray */
public final /* synthetic */ class createStringArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getAccountTypes MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ createStringArray(getAccountTypes getaccounttypes) {
        this.MediaBrowserCompat$ItemReceiver = getaccounttypes;
    }

    public final Object write(Object obj) {
        LottieCompositionFactory.C36042 r6 = (LottieCompositionFactory.C36042) obj;
        zzby.zzb.zza zza = null;
        if (!((r6 == null || r6.MediaBrowserCompat$ItemReceiver == null || r6.MediaBrowserCompat$ItemReceiver.write() == null || r6.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer() == null || r6.RatingCompat == null || r6.RatingCompat.MediaBrowserCompat$ItemReceiver == null || r6.RatingCompat.read == null || r6.write == null || r6.read == null) ? false : true)) {
            return null;
        }
        zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = zzbt.zze.zza.MediaBrowserCompat$CustomActionResultReceiver();
        if (r6.MediaBrowserCompat$ItemReceiver != null) {
            zza = new zzby.zzb.zza(r6.MediaBrowserCompat$ItemReceiver.write(), r6.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(), (String) null);
        }
        return MediaBrowserCompat$CustomActionResultReceiver.write(zza).MediaBrowserCompat$ItemReceiver(getApiKey.read(r6.RatingCompat)).write(r6.IconCompatParcelizer).write(BatchResult.MediaBrowserCompat$ItemReceiver(r6.MediaBrowserCompat$SearchResultReceiver)).read(r6.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver(r6.write).MediaBrowserCompat$ItemReceiver(r6.read).write();
    }
}
