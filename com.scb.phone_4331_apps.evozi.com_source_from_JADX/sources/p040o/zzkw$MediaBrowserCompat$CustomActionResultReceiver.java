package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.zzkw$MediaBrowserCompat$CustomActionResultReceiver */
final class zzkw$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzkw read;

    zzkw$MediaBrowserCompat$CustomActionResultReceiver(zzkw zzkw) {
        this.read = zzkw;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout = (TSnackbar$SnackbarLayout) data;
        onGetStartedClick.write((Object) tSnackbar$SnackbarLayout, "entity");
        Iterable<BlankDummyActivity> iterable = tSnackbar$SnackbarLayout.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (BlankDummyActivity blankDummyActivity : iterable) {
            onGetStartedClick.write((Object) blankDummyActivity, "entity");
            int i = blankDummyActivity.MediaBrowserCompat$ItemReceiver;
            String str = blankDummyActivity.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = blankDummyActivity.write;
            LocalizationActivity localizationActivity = blankDummyActivity.IconCompatParcelizer;
            arrayList.add(new GoogleMap.OnCircleClickListener(i, str, str2, localizationActivity == null ? null : new onCameraMoveStarted(localizationActivity.MediaBrowserCompat$CustomActionResultReceiver)));
        }
        return (List) arrayList;
    }
}
