package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.easycash.EasycashLoanTrackService;
import p040o.LottieDrawable;
import p040o.zzin;

/* renamed from: o.getEventCode */
public final class getEventCode implements lastKey {
    private final String IconCompatParcelizer;
    private final EasycashLoanTrackService MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getEventCode$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return (LottieDrawable.LazyCompositionTask) singleDataEntity.getData();
        }
    }

    @HmlPinActivity
    public getEventCode(EasycashLoanTrackService easycashLoanTrackService, String str) {
        onGetStartedClick.write((Object) easycashLoanTrackService, "service");
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.MediaBrowserCompat$ItemReceiver = easycashLoanTrackService;
        this.IconCompatParcelizer = str;
    }

    public final BScanCNotificationDeepLinkActivity<zzin.zzd> MediaBrowserCompat$ItemReceiver() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.LazyCompositionTask>> inquiryLoanInfo = this.MediaBrowserCompat$ItemReceiver.inquiryLoanInfo(this.IconCompatParcelizer);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = IconCompatParcelizer.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(inquiryLoanInfo, directDebitDeepLinkActivity);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity2 = getEventCode$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "mapper is null");
        onCopy oncopy2 = new onCopy(oncopy, directDebitDeepLinkActivity2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "service.inquiryLoanInfo(…   .map { it.toDomain() }");
        return oncopy2;
    }
}
