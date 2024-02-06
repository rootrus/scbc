package com.scb.phone.view.fragment.ntb.address;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseAddressFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseAddressFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public BaseAddressFragment_ViewBinding(final BaseAddressFragment baseAddressFragment, View view) {
        super(baseAddressFragment, view);
        this.IconCompatParcelizer = baseAddressFragment;
        baseAddressFragment.textAddressTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_address_title, "field 'textAddressTitle'", TextView.class);
        baseAddressFragment.layoutCustomSpinner = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner, "field 'layoutCustomSpinner'", RelativeLayout.class);
        baseAddressFragment.customSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner, "field 'customSpinner'", Spinner.class);
        baseAddressFragment.countryLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_label, "field 'countryLabel'", TextView.class);
        baseAddressFragment.dividerView = onStart.IconCompatParcelizer(view, R.id.divider, "field 'dividerView'");
        baseAddressFragment.thailandAddressSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.thailand_address_section, "field 'thailandAddressSection'", LinearLayout.class);
        baseAddressFragment.otherCountryAddressSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.other_country_address_section, "field 'otherCountryAddressSection'", LinearLayout.class);
        baseAddressFragment.houseNo = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.house_no, "field 'houseNo'", CustomAddressInput.class);
        baseAddressFragment.unit = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unit, "field 'unit'", CustomAddressInput.class);
        baseAddressFragment.floor = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.floor, "field 'floor'", CustomAddressInput.class);
        baseAddressFragment.village = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.village, "field 'village'", CustomAddressInput.class);
        baseAddressFragment.moo = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.moo, "field 'moo'", CustomAddressInput.class);
        baseAddressFragment.trok = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.trok, "field 'trok'", CustomAddressInput.class);
        baseAddressFragment.alley = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.alley, "field 'alley'", CustomAddressInput.class);
        baseAddressFragment.roadTH = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.road, "field 'roadTH'", CustomAddressInput.class);
        baseAddressFragment.provinceTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_title, "field 'provinceTitle'", TextView.class);
        baseAddressFragment.provinceLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_label, "field 'provinceLabel'", TextView.class);
        baseAddressFragment.subDistrictLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_district_label, "field 'subDistrictLabel'", TextView.class);
        baseAddressFragment.districtLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.district_label, "field 'districtLabel'", TextView.class);
        baseAddressFragment.postalCodeLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.postal_code_label, "field 'postalCodeLabel'", TextView.class);
        baseAddressFragment.otherCountryRoad = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.other_country_road, "field 'otherCountryRoad'", CustomAddressInput.class);
        baseAddressFragment.otherCountryDistrict = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.other_country_district, "field 'otherCountryDistrict'", CustomAddressInput.class);
        baseAddressFragment.city = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.city, "field 'city'", CustomAddressInput.class);
        baseAddressFragment.state = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.state, "field 'state'", CustomAddressInput.class);
        baseAddressFragment.zipCode = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.zip_code, "field 'zipCode'", CustomAddressInput.class);
        baseAddressFragment.tvRemark = (TextView) onStart.IconCompatParcelizer(view, R.id.tv_remake, "field 'tvRemark'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "field 'nextButton' and method 'onNextButtonClick'");
        baseAddressFragment.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.next_button, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseAddressFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'onSelectProvinceClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseAddressFragment.this.onSelectProvinceClick();
            }
        });
    }

    public void read() {
        BaseAddressFragment baseAddressFragment = this.IconCompatParcelizer;
        if (baseAddressFragment != null) {
            this.IconCompatParcelizer = null;
            baseAddressFragment.textAddressTitle = null;
            baseAddressFragment.layoutCustomSpinner = null;
            baseAddressFragment.customSpinner = null;
            baseAddressFragment.countryLabel = null;
            baseAddressFragment.dividerView = null;
            baseAddressFragment.thailandAddressSection = null;
            baseAddressFragment.otherCountryAddressSection = null;
            baseAddressFragment.houseNo = null;
            baseAddressFragment.unit = null;
            baseAddressFragment.floor = null;
            baseAddressFragment.village = null;
            baseAddressFragment.moo = null;
            baseAddressFragment.trok = null;
            baseAddressFragment.alley = null;
            baseAddressFragment.roadTH = null;
            baseAddressFragment.provinceTitle = null;
            baseAddressFragment.provinceLabel = null;
            baseAddressFragment.subDistrictLabel = null;
            baseAddressFragment.districtLabel = null;
            baseAddressFragment.postalCodeLabel = null;
            baseAddressFragment.otherCountryRoad = null;
            baseAddressFragment.otherCountryDistrict = null;
            baseAddressFragment.city = null;
            baseAddressFragment.state = null;
            baseAddressFragment.zipCode = null;
            baseAddressFragment.tvRemark = null;
            baseAddressFragment.nextButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
