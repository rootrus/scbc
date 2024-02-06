package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.writeTo */
public final /* synthetic */ class writeTo implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzjv write;

    public /* synthetic */ writeTo(zzjv zzjv) {
        this.write = zzjv;
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        return FragmentBuilder_ScbsAccountDetailFragment.read(singleDataEntity, this.write.ParcelableVolumeInfo.MediaDescriptionCompat, singleDataEntity.getStatus().write());
    }
}
