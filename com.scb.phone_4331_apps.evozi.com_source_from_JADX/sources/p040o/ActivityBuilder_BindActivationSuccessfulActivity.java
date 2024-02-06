package p040o;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindActivationSuccessfulActivity */
public final /* synthetic */ class ActivityBuilder_BindActivationSuccessfulActivity implements View.OnTouchListener {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindActivationSuccessfulActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlCalculatorFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        HmlCalculatorFragment hmlCalculatorFragment = this.MediaBrowserCompat$ItemReceiver;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        hmlCalculatorFragment.tvTitle.setFocusable(true);
        hmlCalculatorFragment.tvTitle.setFocusableInTouchMode(true);
        hmlCalculatorFragment.tvTitle.requestFocus();
        return true;
    }
}
