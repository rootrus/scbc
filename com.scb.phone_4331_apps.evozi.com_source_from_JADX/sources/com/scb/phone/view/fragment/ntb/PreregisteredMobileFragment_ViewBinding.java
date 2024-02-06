package com.scb.phone.view.fragment.ntb;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PreregisteredMobileFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PreregisteredMobileFragment write;

    public PreregisteredMobileFragment_ViewBinding(final PreregisteredMobileFragment preregisteredMobileFragment, View view) {
        super(preregisteredMobileFragment, view);
        this.write = preregisteredMobileFragment;
        preregisteredMobileFragment.mobileNumberInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_mobile_number, "field 'mobileNumberInput'", CommonInputViewGroup.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_next, "field 'btnNext' and method 'onNextButtonClick'");
        preregisteredMobileFragment.btnNext = (Button) onStart.write(IconCompatParcelizer, R.id.btn_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregisteredMobileFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        PreregisteredMobileFragment preregisteredMobileFragment = this.write;
        if (preregisteredMobileFragment != null) {
            this.write = null;
            preregisteredMobileFragment.mobileNumberInput = null;
            preregisteredMobileFragment.btnNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
