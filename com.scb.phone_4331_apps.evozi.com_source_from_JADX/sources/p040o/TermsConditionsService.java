package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chequemanagement.activatecheque.ActivateChequeInputFragment;

/* renamed from: o.TermsConditionsService */
public final /* synthetic */ class TermsConditionsService implements TextView.OnEditorActionListener {
    private final /* synthetic */ ActivateChequeInputFragment IconCompatParcelizer;

    public /* synthetic */ TermsConditionsService(ActivateChequeInputFragment activateChequeInputFragment) {
        this.IconCompatParcelizer = activateChequeInputFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ActivateChequeInputFragment activateChequeInputFragment = this.IconCompatParcelizer;
        if (i == 5) {
            ((BaseActivity) activateChequeInputFragment.getActivity()).PlaybackStateCompat$CustomAction();
            activateChequeInputFragment.IconCompatParcelizer(activateChequeInputFragment.editText.getText().toString());
            return false;
        } else if (i != 6) {
            return false;
        } else {
            ((BaseActivity) activateChequeInputFragment.getActivity()).PlaybackStateCompat$CustomAction();
            return false;
        }
    }
}
