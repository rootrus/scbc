package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.LottieDrawable;
import p040o.zzby;
import p040o.zzgt;

/* renamed from: o.zzgt$zza$MediaBrowserCompat$ItemReceiver */
final class zzgt$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzgt.zza write;

    zzgt$zza$MediaBrowserCompat$ItemReceiver(zzgt.zza zza) {
        this.write = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        getFamilyName getfamilyname = this.write.IconCompatParcelizer;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "entity.data");
        LottieDrawable.C361612 r4 = (LottieDrawable.C361612) data;
        onGetStartedClick.write((Object) r4, "entity");
        return new zzby.zzc(getfamilyname.MediaBrowserCompat$CustomActionResultReceiver(r4.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
