package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlNTBExternalAuthenticationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlNTBExternalAuthenticationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public HmlNTBExternalAuthenticationFragment_ViewBinding(HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment, View view) {
        super(hmlNTBExternalAuthenticationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBExternalAuthenticationFragment;
        hmlNTBExternalAuthenticationFragment.vwNationalId = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vw_external_authentication_national_id, "field 'vwNationalId'", CommonInputViewGroup.class);
        hmlNTBExternalAuthenticationFragment.etOta = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_external_autentication_ota, "field 'etOta'", CommonInputViewGroup.class);
        hmlNTBExternalAuthenticationFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_external_authentication_next, "field 'nextButton'", Button.class);
    }

    public final void read() {
        HmlNTBExternalAuthenticationFragment hmlNTBExternalAuthenticationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlNTBExternalAuthenticationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlNTBExternalAuthenticationFragment.vwNationalId = null;
            hmlNTBExternalAuthenticationFragment.etOta = null;
            hmlNTBExternalAuthenticationFragment.nextButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
