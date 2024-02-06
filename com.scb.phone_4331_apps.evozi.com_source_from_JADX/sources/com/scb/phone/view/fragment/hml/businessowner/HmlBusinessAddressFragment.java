package com.scb.phone.view.fragment.hml.businessowner;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlAddressFragment;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class HmlBusinessAddressFragment extends HmlAddressFragment {
    public static final read IconCompatParcelizer = new read((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        TextView textView = this.textAddressTitle;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "textAddressTitle");
        textView.setText(getString(R.string.hml_business_info_address_header));
    }
}
