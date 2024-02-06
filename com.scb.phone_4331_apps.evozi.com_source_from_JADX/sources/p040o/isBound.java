package p040o;

import android.text.TextUtils;
import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.isBound */
public final /* synthetic */ class isBound implements DirectDebitDeepLinkActivity {
    public /* synthetic */ isBound(zaj zaj) {
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        int parseInt = (singleDataEntity.getData() == null || TextUtils.isEmpty(((nextNode) singleDataEntity.getData()).read)) ? 0 : Integer.parseInt(((nextNode) singleDataEntity.getData()).read);
        addTileOverlay MediaBrowserCompat$ItemReceiver = addTileOverlay.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.write = parseInt;
        return MediaBrowserCompat$ItemReceiver;
    }
}
