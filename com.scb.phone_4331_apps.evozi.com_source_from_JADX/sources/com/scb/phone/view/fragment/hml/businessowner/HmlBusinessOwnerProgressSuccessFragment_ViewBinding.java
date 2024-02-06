package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlBaseOfflineSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlBusinessOwnerProgressSuccessFragment_ViewBinding extends HmlBaseOfflineSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlBusinessOwnerProgressSuccessFragment write;

    public HmlBusinessOwnerProgressSuccessFragment_ViewBinding(final HmlBusinessOwnerProgressSuccessFragment hmlBusinessOwnerProgressSuccessFragment, View view) {
        super(hmlBusinessOwnerProgressSuccessFragment, view);
        this.write = hmlBusinessOwnerProgressSuccessFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_home, "method 'onHomeClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerProgressSuccessFragment.this.onHomeClick();
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
