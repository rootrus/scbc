package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;
import p040o.LottieInterpolatedPointValue;
import p040o.PendingResults;

/* renamed from: o.zzko$MediaBrowserCompat$CustomActionResultReceiver */
final class zzko$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzko MediaBrowserCompat$CustomActionResultReceiver;

    zzko$MediaBrowserCompat$CustomActionResultReceiver(zzko zzko) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzko;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        LottieInterpolatedPointValue lottieInterpolatedPointValue = (LottieInterpolatedPointValue) data;
        onGetStartedClick.write((Object) lottieInterpolatedPointValue, "entity");
        String str = lottieInterpolatedPointValue.IconCompatParcelizer;
        List<LottieInterpolatedPointValue.IconCompatParcelizer> list = lottieInterpolatedPointValue.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) list, "fromWalletEntity");
        Iterable<LottieInterpolatedPointValue.IconCompatParcelizer> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (LottieInterpolatedPointValue.IconCompatParcelizer iconCompatParcelizer : iterable) {
            String str2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = iconCompatParcelizer.read;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new GoogleMap.OnCameraMoveCanceledListener(str2, str3, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.MediaDescriptionCompat, iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver, iconCompatParcelizer.write, 0, 0));
        }
        return new GoogleMap.OnCameraChangeListener(str, (List) arrayList, PendingResults.zaa.MediaBrowserCompat$CustomActionResultReceiver(lottieInterpolatedPointValue.read), PendingResults.zaa.write(lottieInterpolatedPointValue.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
