package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzkz$MediaBrowserCompat$ItemReceiver */
final class zzkz$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkz MediaBrowserCompat$ItemReceiver;

    zzkz$MediaBrowserCompat$ItemReceiver(zzkz zzkz) {
        this.MediaBrowserCompat$ItemReceiver = zzkz;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        isDone isdone = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        getInterpolatedKeyframeProgress getinterpolatedkeyframeprogress = (getInterpolatedKeyframeProgress) data;
        onGetStartedClick.write((Object) getinterpolatedkeyframeprogress, "entity");
        return new stopAnimation(FragmentBuilder_BindSummaryFragment.write(getinterpolatedkeyframeprogress.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null), getinterpolatedkeyframeprogress.MediaBrowserCompat$CustomActionResultReceiver, Double.parseDouble(getinterpolatedkeyframeprogress.read), getinterpolatedkeyframeprogress.IconCompatParcelizer);
    }
}
