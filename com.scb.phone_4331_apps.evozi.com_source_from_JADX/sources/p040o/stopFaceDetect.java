package p040o;

import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.stopFaceDetect */
public final /* synthetic */ class stopFaceDetect implements EditTextDecorator$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity write;

    public /* synthetic */ stopFaceDetect(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.write = mwBusinessDetailsActivity;
    }

    public final String read(String str) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.write;
        if (str.matches("^[ก-๙A-Za-z0-9]+$")) {
            return null;
        }
        return mwBusinessDetailsActivity.getString(R.string.mw_bd_error_referral);
    }
}
