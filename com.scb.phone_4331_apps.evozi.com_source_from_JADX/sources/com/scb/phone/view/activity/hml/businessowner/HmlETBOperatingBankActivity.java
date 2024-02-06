package com.scb.phone.view.activity.hml.businessowner;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.hml.C5609x5fc43574;
import com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity;
import com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.hml.businessowner.HmlOperatingBankFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlOperatingBankFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setEagerLoadingEnabled;
import p040o.setTapText;
import p040o.zziu;

public class HmlETBOperatingBankActivity extends BaseActivityWithFragment implements setEagerLoadingEnabled {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.hml_operating_bank_account_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_o…ating_bank_account_title)");
        return string;
    }

    public void setContentView() {
        HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver hmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver = HmlETBOperatingAccountActivity.MediaBrowserCompat$SearchResultReceiver;
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, C5609x5fc43574.ADD, (zziu.zzc) null);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 1005);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1005) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public void AppCompatDelegateImpl$ListMenuDecorView() {
        this.scbAnalytics.write("p10x1_business_main_operating_account_bank", new ZSYR2K("user_type", "etb"));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlOperatingBankFragment$MediaBrowserCompat$ItemReceiver hmlOperatingBankFragment$MediaBrowserCompat$ItemReceiver = HmlOperatingBankFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlOperatingBankFragment();
    }
}
