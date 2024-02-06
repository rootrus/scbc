package p040o;

import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import p040o.TreeTypeAdapter;

/* renamed from: o.getTotalDividerHeight */
public final class getTotalDividerHeight implements MileageQuantitySelectionActivity<SCBUniversalWebViewActivity> {
    public static void read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, C4303dv dvVar) {
        sCBUniversalWebViewActivity.presenter = dvVar;
    }

    public static void IconCompatParcelizer(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, TreeTypeAdapter.SingleTypeFactory singleTypeFactory) {
        sCBUniversalWebViewActivity.printSlipWebViewPresenter = singleTypeFactory;
    }

    public static void MediaBrowserCompat$ItemReceiver(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, C4299ds dsVar) {
        sCBUniversalWebViewActivity.signinAndLocationPresenter = dsVar;
    }
}
