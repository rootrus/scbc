package com.scb.phone.view.fragment.mwpartner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwShopAddressStandAloneFragment_ViewBinding extends BaseShopAddressFragment_ViewBinding {
    private MwShopAddressStandAloneFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public MwShopAddressStandAloneFragment_ViewBinding(final MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment, View view) {
        super(mwShopAddressStandAloneFragment, view);
        this.IconCompatParcelizer = mwShopAddressStandAloneFragment;
        mwShopAddressStandAloneFragment.addressNoInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.address_no_input, "field 'addressNoInput'", CustomAddressInput.class);
        mwShopAddressStandAloneFragment.mooInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.moo_input, "field 'mooInput'", CustomAddressInput.class);
        mwShopAddressStandAloneFragment.villageInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.village_input, "field 'villageInput'", CustomAddressInput.class);
        mwShopAddressStandAloneFragment.alleyInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.alley_input, "field 'alleyInput'", CustomAddressInput.class);
        mwShopAddressStandAloneFragment.roadInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.road, "field 'roadInput'", CustomAddressInput.class);
        mwShopAddressStandAloneFragment.provinceTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_title, "field 'provinceTitle'", TextView.class);
        mwShopAddressStandAloneFragment.provinceLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_label, "field 'provinceLabel'", TextView.class);
        mwShopAddressStandAloneFragment.subDistrictLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_district_label, "field 'subDistrictLabel'", TextView.class);
        mwShopAddressStandAloneFragment.districtLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.district_label, "field 'districtLabel'", TextView.class);
        mwShopAddressStandAloneFragment.postalCodeLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.postal_code_label, "field 'postalCodeLabel'", TextView.class);
        mwShopAddressStandAloneFragment.nearbyInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nearby_input, "field 'nearbyInput'", CustomAddressInput.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'selectProvinceClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopAddressStandAloneFragment.this.selectProvinceClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_done, "method 'onDoneClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopAddressStandAloneFragment.this.onDoneClick();
            }
        });
    }

    public final void read() {
        MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment = this.IconCompatParcelizer;
        if (mwShopAddressStandAloneFragment != null) {
            this.IconCompatParcelizer = null;
            mwShopAddressStandAloneFragment.addressNoInput = null;
            mwShopAddressStandAloneFragment.mooInput = null;
            mwShopAddressStandAloneFragment.villageInput = null;
            mwShopAddressStandAloneFragment.alleyInput = null;
            mwShopAddressStandAloneFragment.roadInput = null;
            mwShopAddressStandAloneFragment.provinceTitle = null;
            mwShopAddressStandAloneFragment.provinceLabel = null;
            mwShopAddressStandAloneFragment.subDistrictLabel = null;
            mwShopAddressStandAloneFragment.districtLabel = null;
            mwShopAddressStandAloneFragment.postalCodeLabel = null;
            mwShopAddressStandAloneFragment.nearbyInput = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
