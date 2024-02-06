package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzlz$MediaBrowserCompat$ItemReceiver */
final class zzlz$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;

    zzlz$MediaBrowserCompat$ItemReceiver(FundFactSheetActivity fundFactSheetActivity) {
        this.IconCompatParcelizer = fundFactSheetActivity;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        return this.IconCompatParcelizer.invoke(singleDataEntity.getData());
    }
}
