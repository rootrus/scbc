package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeVerifyIdentityActivity */
public final /* synthetic */ class ActivityBuilder_ContributeVerifyIdentityActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ SuccessFragment write;

    public /* synthetic */ ActivityBuilder_ContributeVerifyIdentityActivity(SuccessFragment successFragment) {
        this.write = successFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        SuccessFragment.IconCompatParcelizer(this.write, (Uri) obj);
    }
}
