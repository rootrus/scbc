package p040o;

import com.scb.phone.view.custom.common.ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindChequeReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindChequeReviewActivity implements ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ HmlNTBPersonalInfoFragment read;

    public /* synthetic */ ActivityBuilder_BindChequeReviewActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.read = hmlNTBPersonalInfoFragment;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        return this.read.presenter.MediaBrowserCompat$ItemReceiver(str);
    }
}
