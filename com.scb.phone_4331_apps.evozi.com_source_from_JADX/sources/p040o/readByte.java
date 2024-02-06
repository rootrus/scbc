package p040o;

import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.readByte */
public final /* synthetic */ class readByte implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read IconCompatParcelizer;

    public /* synthetic */ readByte(DurationEmploymentForBusinessDialog.read read) {
        this.IconCompatParcelizer = read;
    }

    public final Object write(Object obj) {
        List list;
        DurationEmploymentForBusinessDialog.read read = this.IconCompatParcelizer;
        setAnimationFromJson setanimationfromjson = (setAnimationFromJson) obj;
        getAccountId getaccountid = read.read;
        zzvf RatingCompat = read.MediaBrowserCompat$MediaItem.RatingCompat();
        if (RatingCompat != null) {
            list = RatingCompat.read;
        } else {
            list = new ArrayList();
        }
        return DebitCardResetOtpActivity.just(getaccountid.write(setanimationfromjson, list, setanimationfromjson.MediaBrowserCompat$CustomActionResultReceiver, setanimationfromjson.read));
    }
}
