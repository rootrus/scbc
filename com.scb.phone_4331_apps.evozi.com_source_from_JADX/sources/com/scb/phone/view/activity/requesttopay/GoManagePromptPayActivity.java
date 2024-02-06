package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayTermsAndConditionsLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.AlertController$RecycleListView;
import p040o.C5110op;
import p040o.C5113oq;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getDocumentFramingError$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;

public class GoManagePromptPayActivity extends BaseActivity implements getDocumentFramingError$MediaBrowserCompat$ItemReceiver {
    @HmlPinActivity
    public C5113oq goManagePromptPayPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79652131493190);
        this.goManagePromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5113oq oqVar = this.goManagePromptPayPresenter;
        C5110op opVar = C5110op.MediaBrowserCompat$ItemReceiver;
        if (oqVar.RatingCompat != null) {
            opVar.IconCompatParcelizer(oqVar.RatingCompat);
        }
    }

    public void onDestroy() {
        setResult(-1);
        super.onDestroy();
    }

    public final void read() {
        Intent write = PromptPayTermsAndConditionsLandingActivity.write(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 6002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 6002) {
            super.onActivityResult(i, i2, intent);
        }
        finish();
    }
}
