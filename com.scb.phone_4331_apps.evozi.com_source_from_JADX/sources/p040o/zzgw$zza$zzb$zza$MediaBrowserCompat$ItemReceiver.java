package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzaj;
import p040o.zzgw;

/* renamed from: o.zzgw$zza$zzb$zza$MediaBrowserCompat$ItemReceiver */
final class zzgw$zza$zzb$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzgw.zza.zzb.C10769zza read;

    zzgw$zza$zzb$zza$MediaBrowserCompat$ItemReceiver(zzgw.zza.zzb.C10769zza zza) {
        this.read = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        getAccountType getaccounttype = this.read.write;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        removeFailureListener removefailurelistener = (removeFailureListener) data;
        onGetStartedClick.write((Object) removefailurelistener, "entity");
        return new zzaj.zzb(removefailurelistener.MediaBrowserCompat$SearchResultReceiver, FragmentBuilder_BindSummaryFragment.write(removefailurelistener.IconCompatParcelizer, (OffsetDateTime) null), removefailurelistener.MediaBrowserCompat$ItemReceiver, removefailurelistener.read, removefailurelistener.write, removefailurelistener.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
