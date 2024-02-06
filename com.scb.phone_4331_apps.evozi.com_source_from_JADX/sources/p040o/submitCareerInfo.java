package p040o;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.chequemanagement.activatecheque.ActivateChequeInputFragment;

/* renamed from: o.submitCareerInfo */
public final /* synthetic */ class submitCareerInfo implements View.OnFocusChangeListener {
    private final /* synthetic */ ActivateChequeInputFragment write;

    public /* synthetic */ submitCareerInfo(ActivateChequeInputFragment activateChequeInputFragment) {
        this.write = activateChequeInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        ActivateChequeInputFragment activateChequeInputFragment = this.write;
        if (z || activateChequeInputFragment.MediaBrowserCompat$CustomActionResultReceiver.length() == activateChequeInputFragment.IconCompatParcelizer) {
            activateChequeInputFragment.editText.setBackgroundDrawable(setLastBaselineToBottomHeight.write(activateChequeInputFragment.getContext(), R.drawable.shape_gray_rounded_rectangle));
            activateChequeInputFragment.scbTextInputLayout.setErrorEnabled(false);
            return;
        }
        activateChequeInputFragment.editText.setBackgroundDrawable(setLastBaselineToBottomHeight.write(activateChequeInputFragment.getContext(), R.drawable.shape_red_reounded_reactangle_border));
        activateChequeInputFragment.scbTextInputLayout.setErrorEnabled(true);
    }
}
