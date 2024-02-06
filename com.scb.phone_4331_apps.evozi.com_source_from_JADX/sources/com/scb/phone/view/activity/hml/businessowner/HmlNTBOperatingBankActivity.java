package com.scb.phone.view.activity.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.data.network.service.easycash.EasycashFeatureAccountService;
import com.scb.phone.view.activity.hml.C5609x5fc43574;
import com.scb.phone.view.activity.hml.HmlNTBOperatingAccountActivity;
import com.scb.phone.view.activity.hml.HmlNTBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setEagerLoadingEnabled;
import p040o.setTapText;

public final class HmlNTBOperatingBankActivity extends HmlETBOperatingBankActivity implements setEagerLoadingEnabled {
    public final void AppCompatDelegateImpl$ListMenuDecorView() {
    }

    public static final class write {
        public final EasycashFeatureAccountService write;

        private write() {
        }

        @HmlPinActivity
        public write(EasycashFeatureAccountService easycashFeatureAccountService) {
            onGetStartedClick.write((Object) easycashFeatureAccountService, "easycashFeatureAccountService");
            this.write = easycashFeatureAccountService;
        }
    }

    public final void setContentView() {
        HmlNTBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver hmlNTBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver = HmlNTBOperatingAccountActivity.MediaDescriptionCompat;
        Context context = this;
        C5609x5fc43574 hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = C5609x5fc43574.ADD;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver, "operatingType");
        Intent intent = new Intent(context, HmlNTBOperatingAccountActivity.class);
        intent.putExtra("OPERATING_TYPE_KEY", hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
