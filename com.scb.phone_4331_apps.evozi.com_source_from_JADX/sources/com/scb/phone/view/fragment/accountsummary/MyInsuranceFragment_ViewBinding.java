package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MyInsuranceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private MyInsuranceFragment MediaBrowserCompat$CustomActionResultReceiver;

    public MyInsuranceFragment_ViewBinding(final MyInsuranceFragment myInsuranceFragment, View view) {
        super(myInsuranceFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = myInsuranceFragment;
        myInsuranceFragment.csLayoutMyInsurance = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_my_insurance, "field 'csLayoutMyInsurance'", ConstraintLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.cs_layout_card, "method 'onClickInsurancePortfolio'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MyInsuranceFragment.this.onClickInsurancePortfolio();
            }
        });
    }

    public final void read() {
        MyInsuranceFragment myInsuranceFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (myInsuranceFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            myInsuranceFragment.csLayoutMyInsurance = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
