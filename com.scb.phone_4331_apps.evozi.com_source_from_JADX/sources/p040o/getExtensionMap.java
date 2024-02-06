package p040o;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import com.scb.phone.view.activity.investment.scbs.open.SCBSFormActivity;

/* renamed from: o.getExtensionMap */
public final /* synthetic */ class getExtensionMap implements FundAppFormActivity.write {
    private final /* synthetic */ SCBSFormActivity IconCompatParcelizer;

    public /* synthetic */ getExtensionMap(SCBSFormActivity sCBSFormActivity) {
        this.IconCompatParcelizer = sCBSFormActivity;
    }

    public final Fragment MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer.mo13676d_("scbsonboard_addressinfo");
    }
}
