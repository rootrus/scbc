package com.scb.phone.view.fragment.hml.ekyc;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBEkycBranchInstructionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlNTBEkycBranchInstructionFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public HmlNTBEkycBranchInstructionFragment_ViewBinding(final HmlNTBEkycBranchInstructionFragment hmlNTBEkycBranchInstructionFragment, View view) {
        super(hmlNTBEkycBranchInstructionFragment, view);
        this.IconCompatParcelizer = hmlNTBEkycBranchInstructionFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        hmlNTBEkycBranchInstructionFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBEkycBranchInstructionFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        HmlNTBEkycBranchInstructionFragment hmlNTBEkycBranchInstructionFragment = this.IconCompatParcelizer;
        if (hmlNTBEkycBranchInstructionFragment != null) {
            this.IconCompatParcelizer = null;
            hmlNTBEkycBranchInstructionFragment.buttonNext = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
