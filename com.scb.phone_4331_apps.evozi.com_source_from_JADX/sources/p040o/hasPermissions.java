package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.zzct;
import p040o.zzjx;

/* renamed from: o.hasPermissions */
public final class hasPermissions extends FragmentBuilder_BindSummaryFragment {
    private final getAccountForScopes read;

    @HmlPinActivity
    public hasPermissions(getAccountForScopes getaccountforscopes) {
        onGetStartedClick.write((Object) getaccountforscopes, "hmlSetupEntityMapper");
        this.read = getaccountforscopes;
    }

    public final zzjx.zze IconCompatParcelizer(getSize getsize, zzct.zza zza) {
        onGetStartedClick.write((Object) getsize, "model");
        onGetStartedClick.write((Object) zza, "customerType");
        String str = getsize.IconCompatParcelizer;
        OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(getsize.MediaBrowserCompat$CustomActionResultReceiver, OffsetDateTime.now());
        if (write == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) write, "transformStringToDateTim…, OffsetDateTime.now())!!");
        String str2 = getsize.MediaDescriptionCompat;
        zzjx.zze.IconCompatParcelizer valueOf = zzjx.zze.IconCompatParcelizer.valueOf(getsize.MediaBrowserCompat$ItemReceiver);
        zzjx.zze.zza write2 = this.read.write(getsize.MediaBrowserCompat$MediaItem, zza);
        isAnimating isanimating = getsize.read;
        removeActivityUpdates removeactivityupdates = null;
        removeActivityUpdates removeactivityupdates2 = isanimating != null ? new removeActivityUpdates(isanimating.MediaBrowserCompat$ItemReceiver, isanimating.write) : null;
        isAnimating isanimating2 = getsize.MediaMetadataCompat;
        if (isanimating2 != null) {
            removeactivityupdates = new removeActivityUpdates(isanimating2.MediaBrowserCompat$ItemReceiver, isanimating2.write);
        }
        return new zzjx.zze(str, write, str2, valueOf, write2, removeactivityupdates2, removeactivityupdates, getsize.write.IconCompatParcelizer);
    }
}
