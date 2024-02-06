package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.debitcard.DebitCardActivationInputFragment;

/* renamed from: o.loanInfoDetail */
public final /* synthetic */ class loanInfoDetail implements TextView.OnEditorActionListener {
    private final /* synthetic */ DebitCardActivationInputFragment write;

    public /* synthetic */ loanInfoDetail(DebitCardActivationInputFragment debitCardActivationInputFragment) {
        this.write = debitCardActivationInputFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        DebitCardActivationInputFragment debitCardActivationInputFragment = this.write;
        if (i != 6) {
            return false;
        }
        debitCardActivationInputFragment.cardInputEditText.clearFocus();
        debitCardActivationInputFragment.rootConstraint.requestFocus();
        debitCardActivationInputFragment.PlaybackStateCompat$CustomAction();
        return true;
    }
}
