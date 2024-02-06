package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzkq;

/* renamed from: o.zzkq$zza$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkq$zza$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkq.zza read;

    zzkq$zza$MediaBrowserCompat$CustomActionResultReceiver(zzkq.zza zza) {
        this.read = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        then then = this.read.read;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        LottieInterpolatedFloatValue lottieInterpolatedFloatValue = (LottieInterpolatedFloatValue) data;
        onGetStartedClick.write((Object) lottieInterpolatedFloatValue, "entity");
        return new onCameraChange(FragmentBuilder_BindSummaryFragment.write(lottieInterpolatedFloatValue.read, (OffsetDateTime) null), lottieInterpolatedFloatValue.IconCompatParcelizer, lottieInterpolatedFloatValue.write);
    }
}
