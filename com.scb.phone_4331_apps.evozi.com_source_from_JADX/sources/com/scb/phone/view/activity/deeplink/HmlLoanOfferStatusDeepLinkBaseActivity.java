package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlNTBApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.NTBPinLoginActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.HmlPinActivity;
import p040o.KtaJsonPassport_MembersInjector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.getIpAddress;
import p040o.onGetStartedClick;
import p040o.setTapText;

public abstract class HmlLoanOfferStatusDeepLinkBaseActivity extends HmlBaseDeepLinkActivity implements KtaJsonPassport_MembersInjector {
    @HmlPinActivity
    public getIpAddress presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        getIpAddress getipaddress = this.presenter;
        if (getipaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getipaddress.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void read() {
        HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlNTBLoanSetupActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "ctx");
        read(new Intent(context, HmlNTBLoanSetupActivity.class));
    }

    public final void write() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "this");
        write(MediaBrowserCompat$CustomActionResultReceiver);
        read(MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer() {
        HmlNTBApplicationOutcomeActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplicationOutcomeActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, HmlNTBApplicationOutcomeActivity.class).putExtra("SHOW_PENDING_STATE", false);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBAp…_EXTRA, showPendingState)");
        write(putExtra);
        read(putExtra);
    }

    private final Intent write(Intent intent) {
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        String str = null;
        intent.putExtra("intent", getICheckDeserializerRtti.write(extras != null ? extras.getString("utm_content") : null));
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras2 = intent3.getExtras();
        intent.putExtra("utm_campaign", extras2 != null ? extras2.getString("utm_campaign") : null);
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras3 = intent4.getExtras();
        intent.putExtra("utm_content", extras3 != null ? extras3.getString("utm_content") : null);
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras4 = intent5.getExtras();
        intent.putExtra("utm_source", extras4 != null ? extras4.getString("utm_source") : null);
        Intent intent6 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent6, "intent");
        Bundle extras5 = intent6.getExtras();
        if (extras5 != null) {
            str = extras5.getString("utm_medium");
        }
        intent.putExtra("utm_medium", str);
        return intent;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        NTBPinLoginActivity.IconCompatParcelizer iconCompatParcelizer = NTBPinLoginActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, NTBPinLoginActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            getIpAddress getipaddress = this.presenter;
            if (getipaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getipaddress.IconCompatParcelizer();
        } else if (i == 1001) {
            finish();
        }
    }

    public void onDestroy() {
        getIpAddress getipaddress = this.presenter;
        if (getipaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getipaddress.onDestroy();
        super.onDestroy();
    }
}
