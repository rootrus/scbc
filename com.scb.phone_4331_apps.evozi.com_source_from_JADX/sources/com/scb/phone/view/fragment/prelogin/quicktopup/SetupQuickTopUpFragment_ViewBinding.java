package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class SetupQuickTopUpFragment_ViewBinding extends QuickTopUpFragment_ViewBinding {
    private View IconCompatParcelizer;
    private SetupQuickTopUpFragment write;

    public SetupQuickTopUpFragment_ViewBinding(final SetupQuickTopUpFragment setupQuickTopUpFragment, View view) {
        super(setupQuickTopUpFragment, view);
        this.write = setupQuickTopUpFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onContinueButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SetupQuickTopUpFragment.this.onContinueButtonClick();
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
