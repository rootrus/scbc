package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;
import p040o.GoogleMap;
import p040o.ImmutableList;

/* renamed from: o.zzkv */
public final class zzkv implements getSortedSetDelegate {
    private final PrepaidTravelService IconCompatParcelizer;
    final getResult read;

    /* renamed from: o.zzkv$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzkv MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(zzkv zzkv) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzkv;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            ScaleXY scaleXY = (ScaleXY) data;
            onGetStartedClick.write((Object) scaleXY, "entity");
            String str = scaleXY.write;
            LottieValueCallback lottieValueCallback = scaleXY.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) lottieValueCallback, "cardEntity");
            return new GoogleMap.OnGroundOverlayClickListener(str, new GoogleMap.OnCameraMoveListener(lottieValueCallback.MediaBrowserCompat$CustomActionResultReceiver, lottieValueCallback.write, lottieValueCallback.IconCompatParcelizer, lottieValueCallback.read), getResult.MediaBrowserCompat$CustomActionResultReceiver(scaleXY.MediaBrowserCompat$ItemReceiver));
        }
    }

    @HmlPinActivity
    public zzkv(PrepaidTravelService prepaidTravelService, getResult getresult) {
        onGetStartedClick.write((Object) prepaidTravelService, "service");
        onGetStartedClick.write((Object) getresult, "mapper");
        this.IconCompatParcelizer = prepaidTravelService;
        this.read = getresult;
    }

    public final BScanCNotificationDeepLinkActivity<GoogleMap.OnGroundOverlayClickListener> MediaBrowserCompat$ItemReceiver(ImmutableList.Builder builder) {
        onGetStartedClick.write((Object) builder, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<ScaleXY>> travelWalletSummary = this.IconCompatParcelizer.getTravelWalletSummary(builder);
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        onCopy oncopy = new onCopy(travelWalletSummary, iconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getTravelWalletS…pper.transform(it.data) }");
        return oncopy;
    }
}
