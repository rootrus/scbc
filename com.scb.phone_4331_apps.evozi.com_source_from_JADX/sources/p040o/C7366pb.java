package p040o;

import android.util.TypedValue;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;

/* renamed from: o.pb */
public final /* synthetic */ class C7366pb implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ DepositDetailActivity write;

    public /* synthetic */ C7366pb(DepositDetailActivity depositDetailActivity) {
        this.write = depositDetailActivity;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        DepositDetailTransactionFragment depositDetailTransactionFragment;
        DepositDetailActivity depositDetailActivity = this.write;
        if (i >= i2) {
            if (i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250 && (depositDetailTransactionFragment = (DepositDetailTransactionFragment) depositDetailActivity.getSupportFragmentManager().findFragmentById(R.id.layout_transactions)) != null) {
                depositDetailTransactionFragment.aw_();
            }
            if (Math.abs(i2 - i) > ((int) TypedValue.applyDimension(1, 300.0f, depositDetailActivity.getResources().getDisplayMetrics())) && depositDetailActivity.MediaBrowserCompat$SearchResultReceiver > 0) {
                depositDetailActivity.MediaDescriptionCompat.removeMessages(1);
                depositDetailActivity.MediaDescriptionCompat.sendMessage(depositDetailActivity.MediaDescriptionCompat.obtainMessage(1));
            }
        }
    }
}
