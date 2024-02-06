package com.scb.phone.view.activity.hml.fatca;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.ntb.EkycSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBAccountSuccessActivity extends EkycSuccessActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo34009x50fd9e4a() {
        return "your_loan";
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = this.successTitle;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "successTitle");
        textView.setText(getString(R.string.hml_account_success_header));
    }

    @OnClick
    public final void onClick() {
        HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlNTBLoanSetupActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "ctx");
        Intent intent = new Intent(context, HmlNTBLoanSetupActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
