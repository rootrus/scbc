package p040o;

import com.scb.phone.view.activity.registration.C5708x2064d349;
import p040o.CheckCaptureModule;

/* renamed from: o.FragmentBuilder_BindETBCheckIdentityFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1185xac757a41 implements newOnDeviceIdExtractor {
    private final CheckCaptureModule.KtaExceptionResponseDeserializer.write IconCompatParcelizer;
    public final readObjectNoData$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    private C1185xac757a41() {
    }

    @HmlPinActivity
    public C1185xac757a41(CheckCaptureModule.KtaExceptionResponseDeserializer.write write, FragmentBuilder_BindTakePhotoFragment fragmentBuilder_BindTakePhotoFragment, readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver) {
        this.IconCompatParcelizer = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = readobjectnodata_mediabrowsercompat_itemreceiver;
    }

    public final DebitCardResetOtpActivity<C5708x2064d349> write() {
        return this.IconCompatParcelizer.IconCompatParcelizer.getPhoneNumberFromServer(Long.valueOf(System.currentTimeMillis())).map(new DataUtils(this));
    }

    public final DebitCardResetOtpActivity<C5708x2064d349> IconCompatParcelizer(boolean z) {
        if (z) {
            return DebitCardResetOtpActivity.just(new C5708x2064d349("", ""));
        }
        return this.IconCompatParcelizer.IconCompatParcelizer.getPhoneNumberFromServer(Long.valueOf(System.currentTimeMillis())).map(new addDynamiteErrorToDropBox(this)).onErrorReturnItem(new C5708x2064d349((String) null, (String) null));
    }
}
