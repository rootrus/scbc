package p040o;

import p040o.setContentDescription;
import p040o.zzca;

/* renamed from: o.setExpandedTitleMargin$MediaBrowserCompat$CustomActionResultReceiver */
final class C5303x76419938<T> implements DebitCardMarketConductDeepLinkActivity<zzca.zzf.zza> {
    private /* synthetic */ setExpandedTitleMargin write;

    C5303x76419938(setExpandedTitleMargin setexpandedtitlemargin) {
        this.write = setexpandedtitlemargin;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        zzca.zzf.zza zza = (zzca.zzf.zza) obj;
        setContentDescription setcontentdescription = zza.read;
        if (setcontentdescription != null) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(setcontentdescription, setContentDescription.write.MAILING);
        }
        this.write.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat(zza.MediaMetadataCompat);
    }
}
