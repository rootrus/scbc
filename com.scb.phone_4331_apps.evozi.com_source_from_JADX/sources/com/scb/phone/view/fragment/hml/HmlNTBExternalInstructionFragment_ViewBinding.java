package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBExternalInstructionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlNTBExternalInstructionFragment IconCompatParcelizer;
    private View write;

    public HmlNTBExternalInstructionFragment_ViewBinding(final HmlNTBExternalInstructionFragment hmlNTBExternalInstructionFragment, View view) {
        super(hmlNTBExternalInstructionFragment, view);
        this.IconCompatParcelizer = hmlNTBExternalInstructionFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_next, "method 'onClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBExternalInstructionFragment.this.onClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
