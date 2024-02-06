package com.scb.phone.view.custom.investment.scbs.open;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class OnboardingAddressInformationItemCustomView_ViewBinding implements Unbinder {
    private OnboardingAddressInformationItemCustomView IconCompatParcelizer;

    public OnboardingAddressInformationItemCustomView_ViewBinding(OnboardingAddressInformationItemCustomView onboardingAddressInformationItemCustomView, View view) {
        this.IconCompatParcelizer = onboardingAddressInformationItemCustomView;
        onboardingAddressInformationItemCustomView.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleTextView'", TextView.class);
        onboardingAddressInformationItemCustomView.addressTextBoxLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rl_address_text_box, "field 'addressTextBoxLayout'", RelativeLayout.class);
        onboardingAddressInformationItemCustomView.hintTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hint, "field 'hintTextView'", TextView.class);
        onboardingAddressInformationItemCustomView.addressTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address, "field 'addressTextView'", TextView.class);
        onboardingAddressInformationItemCustomView.arrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_arrow, "field 'arrowImageView'", ImageView.class);
        onboardingAddressInformationItemCustomView.separator = onStart.IconCompatParcelizer(view, R.id.separator, "field 'separator'");
        onboardingAddressInformationItemCustomView.sameOptionCheckBoxes = onStart.write((CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_same_option_0, "field 'sameOptionCheckBoxes'", CheckBox.class), (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_same_option_1, "field 'sameOptionCheckBoxes'", CheckBox.class), (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_same_option_2, "field 'sameOptionCheckBoxes'", CheckBox.class));
    }

    public final void read() {
        OnboardingAddressInformationItemCustomView onboardingAddressInformationItemCustomView = this.IconCompatParcelizer;
        if (onboardingAddressInformationItemCustomView != null) {
            this.IconCompatParcelizer = null;
            onboardingAddressInformationItemCustomView.titleTextView = null;
            onboardingAddressInformationItemCustomView.addressTextBoxLayout = null;
            onboardingAddressInformationItemCustomView.hintTextView = null;
            onboardingAddressInformationItemCustomView.addressTextView = null;
            onboardingAddressInformationItemCustomView.arrowImageView = null;
            onboardingAddressInformationItemCustomView.separator = null;
            onboardingAddressInformationItemCustomView.sameOptionCheckBoxes = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
