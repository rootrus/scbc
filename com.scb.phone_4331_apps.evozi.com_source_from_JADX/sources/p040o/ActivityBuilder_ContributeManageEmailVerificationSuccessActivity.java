package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.promptpay.PromptPayQRSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeManageEmailVerificationSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeManageEmailVerificationSuccessActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ PromptPayQRSuccessFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeManageEmailVerificationSuccessActivity(PromptPayQRSuccessFragment promptPayQRSuccessFragment) {
        this.IconCompatParcelizer = promptPayQRSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        PromptPayQRSuccessFragment.read(this.IconCompatParcelizer, (Uri) obj);
    }
}
