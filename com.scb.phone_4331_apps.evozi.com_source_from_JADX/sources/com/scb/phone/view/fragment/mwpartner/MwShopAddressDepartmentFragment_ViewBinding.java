package com.scb.phone.view.fragment.mwpartner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwShopAddressDepartmentFragment_ViewBinding extends BaseShopAddressFragment_ViewBinding {
    private View IconCompatParcelizer;
    private MwShopAddressDepartmentFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public MwShopAddressDepartmentFragment_ViewBinding(final MwShopAddressDepartmentFragment mwShopAddressDepartmentFragment, View view) {
        super(mwShopAddressDepartmentFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mwShopAddressDepartmentFragment;
        mwShopAddressDepartmentFragment.marketMallLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_market_mall, "field 'marketMallLabel'", TextView.class);
        mwShopAddressDepartmentFragment.floorInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.floor_no, "field 'floorInput'", CustomAddressInput.class);
        mwShopAddressDepartmentFragment.lotInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lot_no, "field 'lotInput'", CustomAddressInput.class);
        mwShopAddressDepartmentFragment.roadInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.road, "field 'roadInput'", CustomAddressInput.class);
        mwShopAddressDepartmentFragment.provinceTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_title, "field 'provinceTitle'", TextView.class);
        mwShopAddressDepartmentFragment.provinceLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_label, "field 'provinceLabel'", TextView.class);
        mwShopAddressDepartmentFragment.subDistrictLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_district_label, "field 'subDistrictLabel'", TextView.class);
        mwShopAddressDepartmentFragment.districtLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.district_label, "field 'districtLabel'", TextView.class);
        mwShopAddressDepartmentFragment.postalCodeLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.postal_code_label, "field 'postalCodeLabel'", TextView.class);
        mwShopAddressDepartmentFragment.nearbyInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nearby_input, "field 'nearbyInput'", CustomAddressInput.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'selectProvinceClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopAddressDepartmentFragment.this.selectProvinceClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.select_market_mall, "method 'selectMarketMallClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopAddressDepartmentFragment.this.selectMarketMallClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_done, "method 'onDoneClick'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopAddressDepartmentFragment.this.onDoneClick();
            }
        });
    }

    public final void read() {
        MwShopAddressDepartmentFragment mwShopAddressDepartmentFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mwShopAddressDepartmentFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mwShopAddressDepartmentFragment.marketMallLabel = null;
            mwShopAddressDepartmentFragment.floorInput = null;
            mwShopAddressDepartmentFragment.lotInput = null;
            mwShopAddressDepartmentFragment.roadInput = null;
            mwShopAddressDepartmentFragment.provinceTitle = null;
            mwShopAddressDepartmentFragment.provinceLabel = null;
            mwShopAddressDepartmentFragment.subDistrictLabel = null;
            mwShopAddressDepartmentFragment.districtLabel = null;
            mwShopAddressDepartmentFragment.postalCodeLabel = null;
            mwShopAddressDepartmentFragment.nearbyInput = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
