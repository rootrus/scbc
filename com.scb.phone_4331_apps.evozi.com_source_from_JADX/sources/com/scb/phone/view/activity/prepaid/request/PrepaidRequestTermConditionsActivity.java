package com.scb.phone.view.activity.prepaid.request;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestReviewActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C1242x22fefaeb;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.IDeserializer;
import p040o.IDeserializer$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDDstAtop;
import p040o.getLog;
import p040o.getTimestamp;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PrepaidRequestTermConditionsActivity extends BaseActivityWithFragment implements C1242x22fefaeb, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private getTimestamp MediaDescriptionCompat;
    private getKernelIDDstAtop MediaMetadataCompat;
    @HmlPinActivity
    public IDeserializer presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final void setContentView() {
        finish();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        String string = getString(R.string.mr_terms_and_conditions_nev_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.mr_te…and_conditions_nev_title)");
        return string;
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
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRAS_PREPAID_REQUEST_VERIFICATION_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…EST_VERIFICATION_DISPLAY)");
        this.MediaDescriptionCompat = (getTimestamp) parcelableExtra;
        getLog getlog = (getLog) getIntent().getParcelableExtra("EXTRAS_PREPAID_REQUEST_LANDING_DISPLAY");
        super.setStackedBackground();
        setTabContainer();
        IDeserializer iDeserializer = this.presenter;
        if (iDeserializer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iDeserializer.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = new getKernelIDDstAtop();
        IDeserializer iDeserializer2 = this.presenter;
        if (iDeserializer2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) getlog, "prepaidRequestLandingDisplay");
        onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
        iDeserializer2.read = getlog;
        iDeserializer2.IconCompatParcelizer = "TRAVELCARD";
        writeUInt64NoTag.IconCompatParcelizer iDeserializer$MediaBrowserCompat$CustomActionResultReceiver = new IDeserializer$MediaBrowserCompat$CustomActionResultReceiver(iDeserializer2);
        if (iDeserializer2.RatingCompat != null) {
            iDeserializer$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(iDeserializer2.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public final void IconCompatParcelizer(getLog getlog) {
        onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
        getKernelIDDstAtop getkerneliddstatop = this.MediaMetadataCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_termsandcon_accept");
        PrepaidRequestReviewActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidRequestReviewActivity.MediaDescriptionCompat;
        Context context = this;
        getTimestamp gettimestamp = this.MediaDescriptionCompat;
        if (gettimestamp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidRequestVerificationDisplay");
        }
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) gettimestamp, "prepaidRequestVerificationDisplay");
        onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
        Intent intent = new Intent(context, PrepaidRequestReviewActivity.class);
        intent.putExtra("EXTRAS_PREPAID_REQUEST_VERIFICATION_DISPLAY", gettimestamp);
        intent.putExtra("EXTRAS_PREPAID_REQUEST_LANDING_DISPLAY", getlog);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        getKernelIDDstAtop getkerneliddstatop = this.MediaMetadataCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_prepaid_termsandcon_decline");
        RatingCompat(false);
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read read = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ PrepaidRequestTermConditionsActivity IconCompatParcelizer;

        write(PrepaidRequestTermConditionsActivity prepaidRequestTermConditionsActivity) {
            this.IconCompatParcelizer = prepaidRequestTermConditionsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IDeserializer iDeserializer = this.IconCompatParcelizer.presenter;
            if (iDeserializer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer read = new IDeserializer.read(iDeserializer);
            if (iDeserializer.RatingCompat != null) {
                read.IconCompatParcelizer(iDeserializer.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "tag");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.mr_terms_and_conditions_accept_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.mr_terms_and_conditions_accept_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.tc_agree_dialog_negative_button), read.read);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.tc_agree_dialog_positive_accept_button), new write(this)).show();
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.mr_terms_and_conditions_decline_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.mr_terms_and_conditions_decline_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.mr_terms_and_conditions_decline_dialog_btn_cancel), C5702x577396a0.read);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mr_terms_and_conditions_decline_dialog_btn_decline), new C5703x59526d6f(this)).show();
    }

    public final void onDestroy() {
        IDeserializer iDeserializer = this.presenter;
        if (iDeserializer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iDeserializer.onDestroy();
        super.onDestroy();
    }
}
