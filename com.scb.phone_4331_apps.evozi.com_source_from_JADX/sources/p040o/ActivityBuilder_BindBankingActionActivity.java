package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindBankingActionActivity */
public final /* synthetic */ class ActivityBuilder_BindBankingActionActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment read;

    public /* synthetic */ ActivityBuilder_BindBankingActionActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.read = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        this.read.presenter.write();
    }
}
