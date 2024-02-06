package com.scb.phone.view.activity.debitcard.reset;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class DebitCardResetPinSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private DebitCardResetPinSuccessActivity write;

    public DebitCardResetPinSuccessActivity_ViewBinding(final DebitCardResetPinSuccessActivity debitCardResetPinSuccessActivity, View view) {
        super(debitCardResetPinSuccessActivity, view);
        this.write = debitCardResetPinSuccessActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ok_button, "method 'onOkClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardResetPinSuccessActivity.this.onOkClick();
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
