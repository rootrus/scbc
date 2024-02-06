package p040o;

import android.view.View;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillAmountFragment;

/* renamed from: o.ActivityBuilder_MyQRCoachMarkActivity */
public final /* synthetic */ class ActivityBuilder_MyQRCoachMarkActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ EBillAmountFragment write;

    public /* synthetic */ ActivityBuilder_MyQRCoachMarkActivity(EBillAmountFragment eBillAmountFragment) {
        this.write = eBillAmountFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EBillAmountFragment eBillAmountFragment = this.write;
        if (!z && getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(eBillAmountFragment.mTextInputEditText.getText().toString())) {
            eBillAmountFragment.mTextInputEditText.setText("");
        }
    }
}
