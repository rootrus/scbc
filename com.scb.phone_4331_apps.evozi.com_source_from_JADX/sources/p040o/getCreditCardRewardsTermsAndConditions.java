package p040o;

import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeFragment;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeHistoryFragment;

/* renamed from: o.getCreditCardRewardsTermsAndConditions */
public final /* synthetic */ class getCreditCardRewardsTermsAndConditions implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ StopChequeFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getCreditCardRewardsTermsAndConditions(StopChequeFragment stopChequeFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = stopChequeFragment;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        StopChequeFragment stopChequeFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i >= i2 && (stopChequeFragment.getChildFragmentManager().findFragmentById(R.id.container_stop_cheque_history) instanceof StopChequeHistoryFragment) && i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250) {
            stopChequeFragment.IconCompatParcelizer.aw_();
        }
    }
}
