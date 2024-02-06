package com.scb.phone.view.fragment.chequemanagement;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class ChequeReviewFragment_ViewBinding extends BaseChequeReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private ChequeReviewFragment write;

    public ChequeReviewFragment_ViewBinding(final ChequeReviewFragment chequeReviewFragment, View view) {
        super(chequeReviewFragment, view);
        this.write = chequeReviewFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_confirm, "method 'onConfirmButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChequeReviewFragment.this.onConfirmButtonClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
