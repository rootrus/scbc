package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.prepaid.cashout.PrepaidCashOutService;
import p040o.GoogleMap;
import p040o.ImmutableCollection;

/* renamed from: o.zzki */
public final class zzki implements AbstractSetMultimap {
    final OptionalPendingResult IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final PrepaidCashOutService write;

    /* renamed from: o.zzki$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzki IconCompatParcelizer;

        read(zzki zzki) {
            this.IconCompatParcelizer = zzki;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            getStartValue getstartvalue = (getStartValue) data;
            onGetStartedClick.write((Object) getstartvalue, "entity");
            return new GoogleMap.OnCameraIdleListener(getstartvalue.MediaBrowserCompat$CustomActionResultReceiver, Double.parseDouble(getstartvalue.read), getstartvalue.write);
        }
    }

    @HmlPinActivity
    public zzki(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrepaidCashOutService prepaidCashOutService, OptionalPendingResult optionalPendingResult) {
        onGetStartedClick.write((Object) str, "tileVersion");
        onGetStartedClick.write((Object) prepaidCashOutService, "service");
        onGetStartedClick.write((Object) optionalPendingResult, "prepaidCashOutVerificationEntityMapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = prepaidCashOutService;
        this.IconCompatParcelizer = optionalPendingResult;
    }

    public final BScanCNotificationDeepLinkActivity<GoogleMap.OnCameraIdleListener> MediaBrowserCompat$CustomActionResultReceiver(ImmutableCollection.Builder builder) {
        onGetStartedClick.write((Object) builder, "request");
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "<set-?>");
        builder.write = str;
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getStartValue>> prepaidCashOutVerification = this.write.getPrepaidCashOutVerification(builder);
        DirectDebitDeepLinkActivity read2 = new read(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
        onCopy oncopy = new onCopy(prepaidCashOutVerification, read2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidCashOu…pper.transform(it.data) }");
        return oncopy;
    }
}
