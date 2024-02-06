package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.ColorDepth */
public final /* synthetic */ class ColorDepth implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCurrentImageIndex.C45414 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zziu.zza MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ColorDepth(getCurrentImageIndex.C45414 r1, zziu.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.MediaBrowserCompat$ItemReceiver = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        getCurrentImageIndex.C45414 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        zziu.zza zza = this.MediaBrowserCompat$ItemReceiver;
        getMRZ2 getmrz2 = (getMRZ2) obj;
        RegularImmutableSortedSet IconCompatParcelizer = getCurrentImageIndex.this.write;
        onGetStartedClick.write((Object) zza, "loanOffers");
        String IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(zza.ParcelableVolumeInfo));
        String str3 = zza.IconCompatParcelizer;
        Boolean bool = zza.MediaDescriptionCompat;
        ActivityRecognitionClient activityRecognitionClient = zza.MediaBrowserCompat$SearchResultReceiver;
        if (activityRecognitionClient != null) {
            str = activityRecognitionClient.read;
        } else {
            str = null;
        }
        ActivityRecognitionClient activityRecognitionClient2 = zza.MediaBrowserCompat$SearchResultReceiver;
        if (activityRecognitionClient2 != null) {
            str2 = activityRecognitionClient2.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = null;
        }
        getmrz2.MediaBrowserCompat$CustomActionResultReceiver(new registerAnalyticsListener(IconCompatParcelizer2, str3, bool, str, str2), getCurrentImageIndex.this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver(), getCurrentImageIndex.read(getCurrentImageIndex.this));
    }
}
