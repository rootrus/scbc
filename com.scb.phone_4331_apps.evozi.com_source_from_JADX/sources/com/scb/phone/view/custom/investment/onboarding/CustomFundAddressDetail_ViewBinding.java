package com.scb.phone.view.custom.investment.onboarding;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomFundAddressDetail_ViewBinding implements Unbinder {
    private CustomFundAddressDetail MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public CustomFundAddressDetail_ViewBinding(final CustomFundAddressDetail customFundAddressDetail, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customFundAddressDetail;
        customFundAddressDetail.viewCustomAddress = (CustomTextViewNavigation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_address, "field 'viewCustomAddress'", CustomTextViewNavigation.class);
        customFundAddressDetail.layoutCheckbox1 = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_checkbox_1, "field 'layoutCheckbox1'", LinearLayout.class);
        customFundAddressDetail.layoutCheckbox2 = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_checkbox_2, "field 'layoutCheckbox2'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.checkbox_sub_detail_1, "field 'checkbox1' and method 'onCheckbox1Click'");
        customFundAddressDetail.checkbox1 = (CheckBox) onStart.write(IconCompatParcelizer, R.id.checkbox_sub_detail_1, "field 'checkbox1'", CheckBox.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomFundAddressDetail.this.onCheckbox1Click();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.checkbox_sub_detail_2, "field 'checkbox2' and method 'onCheckbox2Click'");
        customFundAddressDetail.checkbox2 = (CheckBox) onStart.write(IconCompatParcelizer2, R.id.checkbox_sub_detail_2, "field 'checkbox2'", CheckBox.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomFundAddressDetail.this.onCheckbox2Click();
            }
        });
        customFundAddressDetail.labelCheckboxTitle1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_sub_detail_1, "field 'labelCheckboxTitle1'", TextView.class);
        customFundAddressDetail.labelCheckboxTitle2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_sub_detail_2, "field 'labelCheckboxTitle2'", TextView.class);
    }

    public final void read() {
        CustomFundAddressDetail customFundAddressDetail = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customFundAddressDetail != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customFundAddressDetail.viewCustomAddress = null;
            customFundAddressDetail.layoutCheckbox1 = null;
            customFundAddressDetail.layoutCheckbox2 = null;
            customFundAddressDetail.checkbox1 = null;
            customFundAddressDetail.checkbox2 = null;
            customFundAddressDetail.labelCheckboxTitle1 = null;
            customFundAddressDetail.labelCheckboxTitle2 = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
