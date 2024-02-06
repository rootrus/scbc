package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindAddFavoriteTransferActivity */
public final /* synthetic */ class ActivityBuilder_BindAddFavoriteTransferActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment write;

    public /* synthetic */ ActivityBuilder_BindAddFavoriteTransferActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.write = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        this.write.presenter.IconCompatParcelizer();
    }
}
