package p040o;

import java.util.List;
import p040o.StreetViewPanorama;

/* renamed from: o.ho$MediaSessionCompat$Token */
public final class ho$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends StreetViewPanorama.OnStreetViewPanoramaLongClickListener>, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4778ho read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho$MediaSessionCompat$Token(C4778ho hoVar) {
        super(1);
        this.read = hoVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "response");
        C4778ho.write(this.read, list);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
