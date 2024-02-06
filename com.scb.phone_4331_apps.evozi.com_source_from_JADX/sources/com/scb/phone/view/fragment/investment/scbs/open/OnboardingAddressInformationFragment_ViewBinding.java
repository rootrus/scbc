package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OnboardingAddressInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OnboardingAddressInformationFragment write;

    public OnboardingAddressInformationFragment_ViewBinding(final OnboardingAddressInformationFragment onboardingAddressInformationFragment, View view) {
        super(onboardingAddressInformationFragment, view);
        this.write = onboardingAddressInformationFragment;
        onboardingAddressInformationFragment.addressRegisteredWithScbTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address_registered_with_scb, "field 'addressRegisteredWithScbTextView'", TextView.class);
        onboardingAddressInformationFragment.homeRegistrationItem = (OnboardingAddressInformationItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_house_registration, "field 'homeRegistrationItem'", OnboardingAddressInformationItemCustomView.class);
        onboardingAddressInformationFragment.workAddressItem = (OnboardingAddressInformationItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_work_address, "field 'workAddressItem'", OnboardingAddressInformationItemCustomView.class);
        onboardingAddressInformationFragment.currentAddressItem = (OnboardingAddressInformationItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_current_address, "field 'currentAddressItem'", OnboardingAddressInformationItemCustomView.class);
        onboardingAddressInformationFragment.mailingAddressItem = (OnboardingAddressInformationItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_mailing_address, "field 'mailingAddressItem'", OnboardingAddressInformationItemCustomView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'clickNextButton'");
        onboardingAddressInformationFragment.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'nextButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingAddressInformationFragment.this.clickNextButton();
            }
        });
    }

    public final void read() {
        OnboardingAddressInformationFragment onboardingAddressInformationFragment = this.write;
        if (onboardingAddressInformationFragment != null) {
            this.write = null;
            onboardingAddressInformationFragment.addressRegisteredWithScbTextView = null;
            onboardingAddressInformationFragment.homeRegistrationItem = null;
            onboardingAddressInformationFragment.workAddressItem = null;
            onboardingAddressInformationFragment.currentAddressItem = null;
            onboardingAddressInformationFragment.mailingAddressItem = null;
            onboardingAddressInformationFragment.nextButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
