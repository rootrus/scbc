package p040o;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.FixedTransferSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributesHmlETBAccountSetupActivity */
public final /* synthetic */ class ActivityBuilder_ContributesHmlETBAccountSetupActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FixedTransferSuccessFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributesHmlETBAccountSetupActivity(FixedTransferSuccessFragment fixedTransferSuccessFragment) {
        this.IconCompatParcelizer = fixedTransferSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = this.IconCompatParcelizer;
        onCheckBoxClick.read((Throwable) obj, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = fixedTransferSuccessFragment.getActivity();
        if (!fixedTransferSuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            Activity write = fixedTransferSuccessFragment.write();
            if (write != null) {
                fixedTransferSuccessFragment.write(write, R.id.root_view, write.getString(R.string.saved_slip_error), getoversizeimage);
            }
        }
    }
}
