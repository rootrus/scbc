package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zabk */
public final class zabk extends FragmentBuilder_BindSummaryFragment {
    public final MapView MediaBrowserCompat$ItemReceiver(SingleDataEntity<EventStoreModule> singleDataEntity) {
        MapView MediaBrowserCompat$CustomActionResultReceiver = MapView.MediaBrowserCompat$CustomActionResultReceiver();
        String str = singleDataEntity.getData().read;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str;
        String str3 = singleDataEntity.getData().IconCompatParcelizer;
        if (str3 != null) {
            str2 = str3;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindSummaryFragment.write(str2, (OffsetDateTime) null);
        MediaBrowserCompat$CustomActionResultReceiver.read = singleDataEntity.getData().MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.write = singleDataEntity.getData().MediaBrowserCompat$CustomActionResultReceiver;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
