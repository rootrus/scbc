package com.scb.phone.view.activity.profilemanagement.promptpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.C1321x96cee189;
import p040o.C4893kG;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.immediateFailedFuture;
import p040o.writeUInt64NoTag;

public class PromptPayTermsAndConditionsActivity extends BaseActivityWithFragment implements C1321x96cee189, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public C4893kG presenter;

    public final void IconCompatParcelizer(String str) {
    }

    public final void write(String str) {
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, PromptPayTermsAndConditionsActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C4893kG kGVar = this.presenter;
        kGVar.MediaBrowserCompat$ItemReceiver = "PROMPTPAY";
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C4893kG.IconCompatParcelizer(kGVar);
        if (kGVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(kGVar.RatingCompat);
        }
        setStackedBackground();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        return getString(R.string.promptpay_terms_and_conditions_title);
    }

    public final void write(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void setContentView() {
        finish();
    }
}
