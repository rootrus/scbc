package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.C5985x82597580;
import p040o.zzca;

/* renamed from: o.writeIBinderArray */
public final /* synthetic */ class writeIBinderArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5985x82597580 read;

    public /* synthetic */ writeIBinderArray(C5985x82597580 hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.read = hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        onValueChanged onvaluechanged = (onValueChanged) ((SingleDataEntity) obj).getData();
        zzca.zzb.C10819zzb.zza zza = new zzca.zzb.C10819zzb.zza();
        zza.MediaDescriptionCompat = onvaluechanged.MediaBrowserCompat$ItemReceiver;
        zza.MediaBrowserCompat$ItemReceiver = onvaluechanged.write;
        zza.MediaBrowserCompat$CustomActionResultReceiver = onvaluechanged.MediaBrowserCompat$CustomActionResultReceiver;
        isBleUsable isbleusable = new isBleUsable();
        isbleusable.MediaBrowserCompat$CustomActionResultReceiver = onvaluechanged.IconCompatParcelizer.write;
        zza.read = isbleusable;
        isBleUsable isbleusable2 = new isBleUsable();
        isbleusable2.MediaBrowserCompat$CustomActionResultReceiver = onvaluechanged.read.write;
        zza.write = isbleusable2;
        zza.MediaBrowserCompat$MediaItem = onvaluechanged.RatingCompat;
        isBleUsable isbleusable3 = new isBleUsable();
        isbleusable3.MediaBrowserCompat$CustomActionResultReceiver = onvaluechanged.MediaBrowserCompat$SearchResultReceiver.write;
        zza.MediaMetadataCompat = isbleusable3;
        return zza;
    }
}
