package com.scb.phone.view.custom.investment.scbs.open;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class OnboardingInputAddressItemCustomView_ViewBinding implements Unbinder {
    private OnboardingInputAddressItemCustomView MediaBrowserCompat$ItemReceiver;

    public OnboardingInputAddressItemCustomView_ViewBinding(OnboardingInputAddressItemCustomView onboardingInputAddressItemCustomView, View view) {
        this.MediaBrowserCompat$ItemReceiver = onboardingInputAddressItemCustomView;
        onboardingInputAddressItemCustomView.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleTextView'", TextView.class);
        onboardingInputAddressItemCustomView.inputAddressEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_input_address, "field 'inputAddressEditText'", EditText.class);
    }

    public final void read() {
        OnboardingInputAddressItemCustomView onboardingInputAddressItemCustomView = this.MediaBrowserCompat$ItemReceiver;
        if (onboardingInputAddressItemCustomView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            onboardingInputAddressItemCustomView.titleTextView = null;
            onboardingInputAddressItemCustomView.inputAddressEditText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
