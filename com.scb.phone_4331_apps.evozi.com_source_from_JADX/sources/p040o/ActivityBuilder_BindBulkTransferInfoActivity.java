package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindBulkTransferInfoActivity */
public final /* synthetic */ class ActivityBuilder_BindBulkTransferInfoActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindBulkTransferInfoActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.IconCompatParcelizer = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        T t = this.IconCompatParcelizer.presenter;
        getDocumentLevelError getdocumentlevelerror = getDocumentLevelError.write;
        if (t.RatingCompat != null) {
            getdocumentlevelerror.IconCompatParcelizer(t.RatingCompat);
        }
    }
}
