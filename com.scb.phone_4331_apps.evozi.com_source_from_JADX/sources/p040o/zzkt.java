package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;
import p040o.AbstractMultimap;
import p040o.GoogleMap;
import p040o.ImmutableEnumSet;

/* renamed from: o.zzkt */
public final class zzkt implements AbstractMultimap.WrappedSet {
    final onSuccess IconCompatParcelizer;
    private final PrepaidTravelService read;

    /* renamed from: o.zzkt$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzkt IconCompatParcelizer;

        IconCompatParcelizer(zzkt zzkt) {
            this.IconCompatParcelizer = zzkt;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            LottieRelativeFloatValueCallback lottieRelativeFloatValueCallback = (LottieRelativeFloatValueCallback) data;
            onGetStartedClick.write((Object) lottieRelativeFloatValueCallback, "entity");
            LottieRelativePointValueCallback lottieRelativePointValueCallback = lottieRelativeFloatValueCallback.IconCompatParcelizer;
            onGetStartedClick.write((Object) lottieRelativePointValueCallback, "entity");
            onCameraMoveCanceled oncameramovecanceled = new onCameraMoveCanceled(lottieRelativePointValueCallback.write, lottieRelativePointValueCallback.read);
            LottieRelativePointValueCallback lottieRelativePointValueCallback2 = lottieRelativeFloatValueCallback.write;
            onGetStartedClick.write((Object) lottieRelativePointValueCallback2, "entity");
            return new GoogleMap.OnCameraMoveStartedListener(oncameramovecanceled, new onCameraMoveCanceled(lottieRelativePointValueCallback2.write, lottieRelativePointValueCallback2.read));
        }
    }

    @HmlPinActivity
    public zzkt(PrepaidTravelService prepaidTravelService, onSuccess onsuccess) {
        onGetStartedClick.write((Object) prepaidTravelService, "service");
        onGetStartedClick.write((Object) onsuccess, "mapper");
        this.read = prepaidTravelService;
        this.IconCompatParcelizer = onsuccess;
    }

    public final BScanCNotificationDeepLinkActivity<GoogleMap.OnCameraMoveStartedListener> write(ImmutableEnumSet.EnumSerializedForm enumSerializedForm) {
        onGetStartedClick.write((Object) enumSerializedForm, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieRelativeFloatValueCallback>> travelWalletDisplayRate = this.read.getTravelWalletDisplayRate(enumSerializedForm);
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        onCopy oncopy = new onCopy(travelWalletDisplayRate, iconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getTravelWalletD…pper.transform(it.data) }");
        return oncopy;
    }
}
