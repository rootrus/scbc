package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.DeepLinkUri;

/* renamed from: o.enableAutoActivityTracking */
public final class enableAutoActivityTracking extends FragmentBuilder_BindSummaryFragment {
    public final getHandler MediaBrowserCompat$ItemReceiver(SingleDataEntity<DeepLinkUri.C11721> singleDataEntity) {
        DeepLinkUri.C11721 data = singleDataEntity.getData();
        String str = data.read;
        String str2 = data.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = data.write;
        FragmentBuilder_BindSummaryFragment.write(data.IconCompatParcelizer, (OffsetDateTime) null);
        getHandler gethandler = new getHandler(str, str2, str3);
        gethandler.read(IconCompatParcelizer((setCurrentItemInternal) data));
        return gethandler;
    }
}
