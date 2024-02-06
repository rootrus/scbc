package p040o;

import p040o.Table;
import p040o.zzmd;

/* renamed from: o.nativeIsAspectRatioWithinLimits */
public class nativeIsAspectRatioWithinLimits extends writeUInt64NoTag<IdCaptureModule_KtaExceptionResponseDeserializer_Factory> {
    public boolean IconCompatParcelizer;
    public join MediaBrowserCompat$ItemReceiver;
    private notNull MediaBrowserCompat$MediaItem;
    public Table.Cell MediaBrowserCompat$SearchResultReceiver;
    public onStopJob MediaDescriptionCompat;
    public PassportCaptureModule_GetUriRttiFactory MediaMetadataCompat;
    public boolean read;
    public createBundleFromClientSettings write;

    @HmlPinActivity
    public nativeIsAspectRatioWithinLimits(RegularImmutableBiMap regularImmutableBiMap, join join, createBundleFromClientSettings createbundlefromclientsettings, notNull notnull, onStopJob onstopjob, Table.Cell cell, PassportCaptureModule_GetUriRttiFactory passportCaptureModule_GetUriRttiFactory) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = join;
        this.write = createbundlefromclientsettings;
        this.MediaBrowserCompat$MediaItem = notnull;
        this.MediaDescriptionCompat = onstopjob;
        this.MediaBrowserCompat$SearchResultReceiver = cell;
        this.MediaMetadataCompat = passportCaptureModule_GetUriRttiFactory;
    }

    public final boolean IconCompatParcelizer(int i, String str) {
        boolean z;
        zzmd.zzm.zzb.zza IconCompatParcelizer2 = this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
        if (i == 1) {
            z = zzmd.zzm.zzb.zza.INDIVIDUAL.equals(IconCompatParcelizer2);
        } else if (i != 2) {
            z = i == 3 && (zzmd.zzm.zzb.zza.INDIVIDUAL.equals(IconCompatParcelizer2) || zzmd.zzm.zzb.zza.JURISTIC.equals(IconCompatParcelizer2));
        } else {
            z = zzmd.zzm.zzb.zza.JURISTIC.equals(IconCompatParcelizer2);
        }
        if (!z) {
            return false;
        }
        String str2 = IconCompatParcelizer2.mode;
        if (str == null || str2.equals(str)) {
            return true;
        }
        return false;
    }
}
