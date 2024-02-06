package p040o;

import p040o.access$2300;
import p040o.setReadOnly;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.setReadOnly$MediaBrowserCompat$MediaItem */
public final class setReadOnly$MediaBrowserCompat$MediaItem extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onCircleClick> {
    private /* synthetic */ zzfe.zza MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ setReadOnly read;

    public setReadOnly$MediaBrowserCompat$MediaItem(setReadOnly setreadonly, zzfe.zza zza) {
        this.read = setreadonly;
        this.MediaBrowserCompat$ItemReceiver = zza;
    }

    public final /* synthetic */ void onNext(Object obj) {
        onCircleClick oncircleclick = (onCircleClick) obj;
        onGetStartedClick.write((Object) oncircleclick, "privacyConsentContent");
        super.onNext(oncircleclick);
        setReadOnly setreadonly = this.read;
        boolean z = true;
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new setReadOnly.MediaDescriptionCompat(setreadonly.MediaMetadataCompat.read((String) null, oncircleclick, this.MediaBrowserCompat$ItemReceiver != zzfe.zza.SALE_SHEET, false, (String) null));
        if (setreadonly.RatingCompat != null) {
            mediaDescriptionCompat.IconCompatParcelizer(setreadonly.RatingCompat);
        }
        setReadOnly setreadonly2 = this.read;
        if (setreadonly2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setreadonly2.RatingCompat.aj_();
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        setReadOnly setreadonly = this.read;
        setreadonly.MediaBrowserCompat$ItemReceiver(setreadonly.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
