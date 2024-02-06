package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Credential;
import p040o.zzbt;

/* renamed from: o.zzcj */
public final /* synthetic */ class zzcj implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ Credential.Builder write;

    public /* synthetic */ zzcj(Credential.Builder builder) {
        this.write = builder;
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        if (singleDataEntity.getData() == null) {
            return new zzbt.zzd.zza(new zzbt$zzd$zza$MediaBrowserCompat$ItemReceiver((byte) 0));
        }
        zzbt$zzd$zza$MediaBrowserCompat$ItemReceiver zzbt_zzd_zza_mediabrowsercompat_itemreceiver = new zzbt$zzd$zza$MediaBrowserCompat$ItemReceiver((byte) 0);
        zzbt_zzd_zza_mediabrowsercompat_itemreceiver.write = FragmentBuilder_BindSummaryFragment.write(((isNightMode) singleDataEntity.getData()).write, (OffsetDateTime) null);
        zzbt_zzd_zza_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = ((isNightMode) singleDataEntity.getData()).read;
        zzbt_zzd_zza_mediabrowsercompat_itemreceiver.read = ((isNightMode) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
        zzbt_zzd_zza_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = ((isNightMode) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        zzbt_zzd_zza_mediabrowsercompat_itemreceiver.IconCompatParcelizer = ((isNightMode) singleDataEntity.getData()).IconCompatParcelizer;
        return new zzbt.zzd.zza(zzbt_zzd_zza_mediabrowsercompat_itemreceiver);
    }
}
