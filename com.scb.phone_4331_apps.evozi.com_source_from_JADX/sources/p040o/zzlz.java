package p040o;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.Iterables;

/* renamed from: o.zzlz */
public final class zzlz implements Runnable {
    public static final TimeInterpolator IconCompatParcelizer = new LinearInterpolator();
    public static final TimeInterpolator MediaBrowserCompat$CustomActionResultReceiver = new setPreventCornerOverlap();
    public static final TimeInterpolator MediaBrowserCompat$ItemReceiver = new setMinimumWidth();
    public static final TimeInterpolator read = new setMinimumHeight();
    public static final TimeInterpolator write = new DecelerateInterpolator();
    private final ZHPR2 MediaBrowserCompat$MediaItem;

    public static final <T, R> BScanCNotificationDeepLinkActivity<R> MediaBrowserCompat$CustomActionResultReceiver(BScanCNotificationDeepLinkActivity<SingleDataEntity<T>> bScanCNotificationDeepLinkActivity, FundFactSheetActivity<? super T, ? extends R> fundFactSheetActivity) {
        onGetStartedClick.write((Object) bScanCNotificationDeepLinkActivity, "$this$mapData");
        onGetStartedClick.write((Object) fundFactSheetActivity, "mapper");
        DirectDebitDeepLinkActivity zzlz_mediabrowsercompat_itemreceiver = new zzlz$MediaBrowserCompat$ItemReceiver(fundFactSheetActivity);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzlz_mediabrowsercompat_itemreceiver, "mapper is null");
        onCopy oncopy = new onCopy(bScanCNotificationDeepLinkActivity, zzlz_mediabrowsercompat_itemreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "map { mapper(it.data) }");
        return oncopy;
    }

    /* renamed from: o.zzlz$write */
    public static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;

        public write(FundFactSheetActivity fundFactSheetActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return this.MediaBrowserCompat$CustomActionResultReceiver.invoke(singleDataEntity.getData());
        }
    }

    public zzlz() {
    }

    public zzlz(ZHPR2 zhpr2) {
        this.MediaBrowserCompat$MediaItem = zhpr2;
    }

    public final void run() {
        ZHPR2 zhpr2 = this.MediaBrowserCompat$MediaItem;
        zhpr2.write.MediaBrowserCompat$CustomActionResultReceiver(new Iterables.C35273(zhpr2));
    }
}
