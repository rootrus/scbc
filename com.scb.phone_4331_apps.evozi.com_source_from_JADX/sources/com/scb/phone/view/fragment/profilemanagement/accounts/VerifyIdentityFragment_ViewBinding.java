package com.scb.phone.view.fragment.profilemanagement.accounts;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomATMInput;
import com.scb.phone.view.custom.common.CustomCardInformationInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class VerifyIdentityFragment_ViewBinding extends BaseFragment_ViewBinding {
    private VerifyIdentityFragment write;

    public VerifyIdentityFragment_ViewBinding(VerifyIdentityFragment verifyIdentityFragment, View view) {
        super(verifyIdentityFragment, view);
        this.write = verifyIdentityFragment;
        verifyIdentityFragment.cardNoInput = (CustomCardInformationInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_no_input, "field 'cardNoInput'", CustomCardInformationInput.class);
        verifyIdentityFragment.pinInput = (CustomATMInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pin, "field 'pinInput'", CustomATMInput.class);
        verifyIdentityFragment.confirmButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button, "field 'confirmButton'", Button.class);
    }

    public final void read() {
        VerifyIdentityFragment verifyIdentityFragment = this.write;
        if (verifyIdentityFragment != null) {
            this.write = null;
            verifyIdentityFragment.cardNoInput = null;
            verifyIdentityFragment.pinInput = null;
            verifyIdentityFragment.confirmButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
