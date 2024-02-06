package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzlu$MediaBrowserCompat$ItemReceiver */
final class zzlu$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzlu IconCompatParcelizer;

    zzlu$MediaBrowserCompat$ItemReceiver(zzlu zzlu) {
        this.IconCompatParcelizer = zzlu;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        ConnectionCallbacks connectionCallbacks = this.IconCompatParcelizer.read;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        setTransparentCircleColor settransparentcirclecolor = (setTransparentCircleColor) data;
        onGetStartedClick.write((Object) settransparentcirclecolor, "entity");
        return new mapType(FragmentBuilder_BindSummaryFragment.write(settransparentcirclecolor.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null), settransparentcirclecolor.MediaBrowserCompat$CustomActionResultReceiver, settransparentcirclecolor.write);
    }
}
