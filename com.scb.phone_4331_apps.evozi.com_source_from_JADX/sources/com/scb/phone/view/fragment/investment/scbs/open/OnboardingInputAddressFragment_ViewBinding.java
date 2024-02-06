package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView;
import com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OnboardingInputAddressFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OnboardingInputAddressFragment MediaBrowserCompat$ItemReceiver;

    public OnboardingInputAddressFragment_ViewBinding(final OnboardingInputAddressFragment onboardingInputAddressFragment, View view) {
        super(onboardingInputAddressFragment, view);
        this.MediaBrowserCompat$ItemReceiver = onboardingInputAddressFragment;
        onboardingInputAddressFragment.addressTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address_title, "field 'addressTitleTextView'", TextView.class);
        onboardingInputAddressFragment.houseNumberCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_house_number, "field 'houseNumberCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.unitCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_unit, "field 'unitCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.floorCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_floor, "field 'floorCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.villageBuildingCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_village_building, "field 'villageBuildingCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.mooCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_moo, "field 'mooCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.soiCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_soi, "field 'soiCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.roadCustomView = (OnboardingInputAddressItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_road, "field 'roadCustomView'", OnboardingInputAddressItemCustomView.class);
        onboardingInputAddressFragment.provinceCustomView = (OnboardingAddressInformationItemCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_view_province, "field 'provinceCustomView'", OnboardingAddressInformationItemCustomView.class);
        onboardingInputAddressFragment.districtAutofilledTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_district_autofilled, "field 'districtAutofilledTextView'", TextView.class);
        onboardingInputAddressFragment.subdistrictAutofilledTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subdistrict_autofilled, "field 'subdistrictAutofilledTextView'", TextView.class);
        onboardingInputAddressFragment.postalCodeAutofilledTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_postal_code_autofilled, "field 'postalCodeAutofilledTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'clickNextButton'");
        onboardingInputAddressFragment.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'nextButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingInputAddressFragment.this.clickNextButton();
            }
        });
    }

    public final void read() {
        OnboardingInputAddressFragment onboardingInputAddressFragment = this.MediaBrowserCompat$ItemReceiver;
        if (onboardingInputAddressFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            onboardingInputAddressFragment.addressTitleTextView = null;
            onboardingInputAddressFragment.houseNumberCustomView = null;
            onboardingInputAddressFragment.unitCustomView = null;
            onboardingInputAddressFragment.floorCustomView = null;
            onboardingInputAddressFragment.villageBuildingCustomView = null;
            onboardingInputAddressFragment.mooCustomView = null;
            onboardingInputAddressFragment.soiCustomView = null;
            onboardingInputAddressFragment.roadCustomView = null;
            onboardingInputAddressFragment.provinceCustomView = null;
            onboardingInputAddressFragment.districtAutofilledTextView = null;
            onboardingInputAddressFragment.subdistrictAutofilledTextView = null;
            onboardingInputAddressFragment.postalCodeAutofilledTextView = null;
            onboardingInputAddressFragment.nextButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
