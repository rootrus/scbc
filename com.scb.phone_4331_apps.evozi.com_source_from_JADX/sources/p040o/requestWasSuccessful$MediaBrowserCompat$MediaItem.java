package p040o;

import java.util.List;
import p040o.MoreExecutors;
import p040o.writeUInt64NoTag;

/* renamed from: o.requestWasSuccessful$MediaBrowserCompat$MediaItem */
final class requestWasSuccessful$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends MoreExecutors.C36611>, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ requestWasSuccessful IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    requestWasSuccessful$MediaBrowserCompat$MediaItem(requestWasSuccessful requestwassuccessful) {
        super(1);
        this.IconCompatParcelizer = requestwassuccessful;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "accounts");
        requestWasSuccessful requestwassuccessful = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer requestwassuccessful_mediabrowsercompat_mediaitem_mediabrowsercompat_customactionresultreceiver = new C5234x905e6c96(list);
        if (requestwassuccessful.RatingCompat != null) {
            requestwassuccessful_mediabrowsercompat_mediaitem_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(requestwassuccessful.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
