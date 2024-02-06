package com.scb.phone.view.activity.debitcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C7201lA;
import p040o.C7203lC;
import p040o.C7245lx;
import p040o.C7247lz;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetProcessingParametersFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.mergeDocument;
import p040o.nativeGetVersion;
import p040o.setTapText;

public class DebitCardRequestTermsConditionsActivity extends BaseActivityWithFragment implements IdCaptureModule_GetProcessingParametersFactory, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public nativeGetVersion presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static void write(Context context) {
        Intent intent = new Intent(context, DebitCardRequestTermsConditionsActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        return getString(R.string.mr_terms_and_conditions_nev_title);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        mo13676d_("atm_request_tc_screen");
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        nativeGetVersion nativegetversion = this.presenter;
        mergeDocument mergedocument = new mergeDocument(nativegetversion);
        if (nativegetversion.RatingCompat != null) {
            mergedocument.IconCompatParcelizer(nativegetversion.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public final void read() {
        DebitCardRequestReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RatingCompat(false);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_accept_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_accept_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.tc_agree_dialog_negative_button), C7247lz.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.tc_agree_dialog_positive_accept_button), new C7201lA(this)).show();
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_decline_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_decline_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_decline_dialog_btn_cancel), C7245lx.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mr_terms_and_conditions_decline_dialog_btn_decline), new C7203lC(this)).show();
    }

    public final void setContentView() {
        finish();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }
}
