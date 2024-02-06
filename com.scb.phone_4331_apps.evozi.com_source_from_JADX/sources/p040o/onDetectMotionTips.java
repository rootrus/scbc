package p040o;

import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.onDetectMotionTips */
public final /* synthetic */ class onDetectMotionTips implements EditTextDecorator$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity IconCompatParcelizer;

    public /* synthetic */ onDetectMotionTips(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.IconCompatParcelizer = mwBusinessDetailsActivity;
    }

    public final String read(String str) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.IconCompatParcelizer;
        if (str.matches("^([0][0-9]{9})$")) {
            return null;
        }
        return mwBusinessDetailsActivity.getString(R.string.mw_bd_error_phone_number);
    }
}
