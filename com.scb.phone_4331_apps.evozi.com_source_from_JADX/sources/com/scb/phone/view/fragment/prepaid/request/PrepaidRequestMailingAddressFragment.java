package com.scb.phone.view.fragment.prepaid.request;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.DataUnit;
import p040o.FragmentBuilder_BindCcSofSuccessFragment;
import p040o.HmlPinActivity;
import p040o.getRam;
import p040o.onGetStartedClick;

public final class PrepaidRequestMailingAddressFragment extends BaseAddressFragment {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    private FragmentBuilder_BindCcSofSuccessFragment IconCompatParcelizer;
    @HmlPinActivity
    public DataUnit mailingPresenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCcSofSuccessFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCcSofSuccessFragment) context;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver();
        TextView textView = this.textAddressTitle;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "textAddressTitle");
        textView.setText(getString(R.string.prepaid_request_mailing_address_header));
        CustomAddressInput customAddressInput = this.trok;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput, "trok");
        customAddressInput.setVisibility(0);
        TextView textView2 = this.tvRemark;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.tvRemark;
        if (textView3 != null) {
            textView3.setText(getString(R.string.prepaid_request_mailing_address_remark));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (autoValue_CrashlyticsReport_CustomAttribute = (AutoValue_CrashlyticsReport_CustomAttribute) arguments.getParcelable("EXTRA_PREPAID_REQUEST_MAILING_ADDRESS")) != null) {
            IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute, true);
        }
    }

    public final void onNextButtonClick() {
        if (this.mailingPresenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mailingPresenter");
        }
        CustomAddressInput customAddressInput = this.houseNo;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput, "houseNo");
        String trim = customAddressInput.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim, "houseNo.text");
        TextView textView = this.provinceLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "provinceLabel");
        String obj = textView.getText().toString();
        TextView textView2 = this.districtLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "districtLabel");
        String obj2 = textView2.getText().toString();
        TextView textView3 = this.subDistrictLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "subDistrictLabel");
        String obj3 = textView3.getText().toString();
        TextView textView4 = this.postalCodeLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView4, "postalCodeLabel");
        String obj4 = textView4.getText().toString();
        CustomAddressInput customAddressInput2 = this.moo;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput2, "moo");
        String trim2 = customAddressInput2.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim2, "moo.text");
        CustomAddressInput customAddressInput3 = this.alley;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput3, "alley");
        String trim3 = customAddressInput3.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim3, "alley.text");
        CustomAddressInput customAddressInput4 = this.roadTH;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput4, "roadTH");
        String trim4 = customAddressInput4.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim4, "roadTH.text");
        CustomAddressInput customAddressInput5 = this.trok;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput5, "trok");
        String trim5 = customAddressInput5.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim5, "trok.text");
        CustomAddressInput customAddressInput6 = this.village;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput6, "village");
        String trim6 = customAddressInput6.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim6, "village.text");
        CustomAddressInput customAddressInput7 = this.unit;
        String str = trim6;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput7, "unit");
        String trim7 = customAddressInput7.inputTextField.getText().toString().trim();
        String str2 = "unit";
        onGetStartedClick.IconCompatParcelizer((Object) trim7, "unit.text");
        CustomAddressInput customAddressInput8 = this.floor;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput8, "floor");
        String trim8 = customAddressInput8.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim8, "floor.text");
        onGetStartedClick.write((Object) trim, "houseNo");
        onGetStartedClick.write((Object) obj, "province");
        onGetStartedClick.write((Object) obj2, "amphur");
        onGetStartedClick.write((Object) obj3, "district");
        onGetStartedClick.write((Object) obj4, "zipCode");
        onGetStartedClick.write((Object) trim2, "moo");
        onGetStartedClick.write((Object) trim3, "alley");
        onGetStartedClick.write((Object) trim4, "road");
        onGetStartedClick.write((Object) trim5, "trok");
        String str3 = trim5;
        String str4 = "village";
        onGetStartedClick.write((Object) str, str4);
        onGetStartedClick.write((Object) trim7, str2);
        String str5 = "floor";
        onGetStartedClick.write((Object) trim8, str5);
        onGetStartedClick.write((Object) trim, "houseNo");
        onGetStartedClick.write((Object) obj, "province");
        onGetStartedClick.write((Object) obj2, "amphur");
        onGetStartedClick.write((Object) obj3, "district");
        onGetStartedClick.write((Object) obj4, "zipCode");
        onGetStartedClick.write((Object) trim2, "moo");
        onGetStartedClick.write((Object) trim3, "alley");
        onGetStartedClick.write((Object) trim4, "road");
        String str6 = str3;
        onGetStartedClick.write((Object) str6, "trok");
        String str7 = str;
        onGetStartedClick.write((Object) str7, str4);
        onGetStartedClick.write((Object) trim7, str2);
        onGetStartedClick.write((Object) trim8, str5);
        String str8 = trim7;
        String str9 = trim8;
        getRam getram = r3;
        getRam getram2 = new getRam(trim, str7, str8, str9, trim2, str6, trim3, trim4, obj3, obj2, obj, obj4);
        FragmentBuilder_BindCcSofSuccessFragment fragmentBuilder_BindCcSofSuccessFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindCcSofSuccessFragment != null) {
            fragmentBuilder_BindCcSofSuccessFragment.read(getram);
        }
    }
}
