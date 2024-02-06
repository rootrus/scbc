package p040o;

import com.kofax.kmc.kut.utilities.Licensing;
import p040o.preauthorization;

/* renamed from: o.ReflectedParcelable */
public final /* synthetic */ class ReflectedParcelable implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ preauthorization.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ReflectedParcelable(preauthorization.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        boolean z;
        preauthorization.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        zzwi zzwi = (zzwi) obj;
        String str = zzwi.MediaSessionCompat$QueueItem;
        if (str != null) {
            Licensing.setMobileSDKLicense(str);
        }
        ScriptIntrinsicLUT scriptIntrinsicLUT = read.MediaBrowserCompat$ItemReceiver;
        if (zzwi.MediaMetadataCompat == null) {
            z = false;
        } else {
            z = scriptIntrinsicLUT.write.edit().putString("com.scb.phone.PREK_KEY_APP_CONFIG", scriptIntrinsicLUT.MediaBrowserCompat$CustomActionResultReceiver.toJson((Object) zzwi)).commit();
        }
        if (z) {
            read.IconCompatParcelizer.edit().putLong("com.scb.phone.PREF_KEY_LAST_RECEIVE_CONFIG_TIME", removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver()).apply();
        }
    }
}
