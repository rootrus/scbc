package p040o;

import android.view.View;
import com.scb.phone.view.fragment.debitcard.DebitCardActivationInputFragment;

/* renamed from: o.postCalculation */
public final /* synthetic */ class postCalculation implements View.OnFocusChangeListener {
    private final /* synthetic */ DebitCardActivationInputFragment read;

    public /* synthetic */ postCalculation(DebitCardActivationInputFragment debitCardActivationInputFragment) {
        this.read = debitCardActivationInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        nativeGetRows nativegetrows = this.read.presenter;
        nativegetrows.write(!z, new nativeGetElement(nativegetrows));
    }
}
