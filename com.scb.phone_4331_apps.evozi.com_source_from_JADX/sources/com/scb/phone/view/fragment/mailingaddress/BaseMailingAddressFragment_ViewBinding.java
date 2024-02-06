package com.scb.phone.view.fragment.mailingaddress;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseMailingAddressFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BaseMailingAddressFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public BaseMailingAddressFragment_ViewBinding(final BaseMailingAddressFragment baseMailingAddressFragment, View view) {
        super(baseMailingAddressFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseMailingAddressFragment;
        baseMailingAddressFragment.typeOfAddressLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_typeOfAddress, "field 'typeOfAddressLayout'", LinearLayout.class);
        baseMailingAddressFragment.houseNo = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.house_no, "field 'houseNo'", CustomAddressInput.class);
        baseMailingAddressFragment.unit = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unit, "field 'unit'", CustomAddressInput.class);
        baseMailingAddressFragment.floor = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.floor, "field 'floor'", CustomAddressInput.class);
        baseMailingAddressFragment.village = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.village, "field 'village'", CustomAddressInput.class);
        baseMailingAddressFragment.moo = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.moo, "field 'moo'", CustomAddressInput.class);
        baseMailingAddressFragment.alley = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.alley, "field 'alley'", CustomAddressInput.class);
        baseMailingAddressFragment.road = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.road, "field 'road'", CustomAddressInput.class);
        baseMailingAddressFragment.provinceLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_label, "field 'provinceLabel'", TextView.class);
        baseMailingAddressFragment.subDistrictLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_district_label, "field 'subDistrictLabel'", TextView.class);
        baseMailingAddressFragment.districtLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.district_label, "field 'districtLabel'", TextView.class);
        baseMailingAddressFragment.postalCodeLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.postal_code_label, "field 'postalCodeLabel'", TextView.class);
        baseMailingAddressFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'nextButton'", Button.class);
        baseMailingAddressFragment.confirmButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.confirm_button, "field 'confirmButton'", Button.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_province, "field 'selectProvince' and method 'onSelectProvinceClick'");
        baseMailingAddressFragment.selectProvince = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.select_province, "field 'selectProvince'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMailingAddressFragment.this.onSelectProvinceClick();
            }
        });
        baseMailingAddressFragment.textAddressTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_address_title, "field 'textAddressTitle'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.work_address_radio_button, "method 'onAddressRadioButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMailingAddressFragment.this.onAddressRadioButtonClicked((RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onAddressRadioButtonClicked", RadioButton.class));
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.home_address_radio_button, "method 'onAddressRadioButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMailingAddressFragment.this.onAddressRadioButtonClicked((RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onAddressRadioButtonClicked", RadioButton.class));
            }
        });
    }

    public void read() {
        BaseMailingAddressFragment baseMailingAddressFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseMailingAddressFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseMailingAddressFragment.typeOfAddressLayout = null;
            baseMailingAddressFragment.houseNo = null;
            baseMailingAddressFragment.unit = null;
            baseMailingAddressFragment.floor = null;
            baseMailingAddressFragment.village = null;
            baseMailingAddressFragment.moo = null;
            baseMailingAddressFragment.alley = null;
            baseMailingAddressFragment.road = null;
            baseMailingAddressFragment.provinceLabel = null;
            baseMailingAddressFragment.subDistrictLabel = null;
            baseMailingAddressFragment.districtLabel = null;
            baseMailingAddressFragment.postalCodeLabel = null;
            baseMailingAddressFragment.nextButton = null;
            baseMailingAddressFragment.confirmButton = null;
            baseMailingAddressFragment.selectProvince = null;
            baseMailingAddressFragment.textAddressTitle = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
