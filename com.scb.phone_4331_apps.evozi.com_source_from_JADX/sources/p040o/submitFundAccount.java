package p040o;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.scb.phone.view.custom.common.CustomSchedulePayment;

/* renamed from: o.submitFundAccount */
public final /* synthetic */ class submitFundAccount implements TextView.OnEditorActionListener {
    private final /* synthetic */ CustomSchedulePayment read;

    public /* synthetic */ submitFundAccount(CustomSchedulePayment customSchedulePayment) {
        this.read = customSchedulePayment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CustomSchedulePayment customSchedulePayment = this.read;
        if (i != 6) {
            return false;
        }
        if (customSchedulePayment != null) {
            ((InputMethodManager) customSchedulePayment.getContext().getSystemService("input_method")).hideSoftInputFromWindow(customSchedulePayment.getWindowToken(), 0);
        }
        customSchedulePayment.IconCompatParcelizer();
        return true;
    }
}
