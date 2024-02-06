package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.C1161xfaac52a4;
import p040o.CardView;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.Multisets;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2300;
import p040o.forEachClear;
import p040o.getChannels;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;

public abstract class BaseCommonNCBConsentActivity extends BaseActivity implements FragmentBuilder_BindCustomizeYourPageFragment, C1161xfaac52a4 {
    private boolean MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public forEachClear tracker;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public abstract getChannels<?> MediaSessionCompat$ResultReceiverWrapper();

    public abstract void MediaSessionCompat$Token();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78992131493124);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.loan_verification_ncb_consent_label);
        setTabContainer();
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("EXTRA_APPLICATION_ID");
            String string2 = extras.getString("EXTRA_PRODUCT_TYPE");
            String string3 = extras.getString("EXTRA_PRODUCT_PROGRAM");
            String string4 = extras.getString("EXTRA_NCB_TRANSACTION_ID");
            MediaSessionCompat$Token();
            getChannels<?> MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
            if (string2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            onGetStartedClick.write((Object) string2, "productType");
            MediaSessionCompat$ResultReceiverWrapper.read = string2;
            MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer = string4;
            if (MediaSessionCompat$ResultReceiverWrapper.RatingCompat != null) {
                MediaSessionCompat$ResultReceiverWrapper.RatingCompat.AlertController$RecycleListView();
            }
            MediaSessionCompat$ResultReceiverWrapper.MediaMetadataCompat.IconCompatParcelizer(Multisets.UnmodifiableMultiset.MediaBrowserCompat$CustomActionResultReceiver(string, string2, "NCB_CONSENT", string3));
            MediaSessionCompat$ResultReceiverWrapper.MediaMetadataCompat.IconCompatParcelizer(new getChannels.IconCompatParcelizer());
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.loan_verification_ncb_consent_label);
        setTabContainer();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        CardView read2 = getSupportFragmentManager().read();
        TermsAndConditionsFragment.write write = TermsAndConditionsFragment.IconCompatParcelizer;
        read2.MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public void onResume() {
        super.onResume();
        if (this.MediaBrowserCompat$MediaItem) {
            MediaSessionCompat$ResultReceiverWrapper().read();
            this.MediaBrowserCompat$MediaItem = false;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 7134) {
            this.MediaBrowserCompat$MediaItem = true;
        }
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.ncb_conset_confirmation_popup_accept_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.ncb_conset_confirmation_popup_accept_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ncb_conset_confirmation_popup_accept_confirm), new C5596xaacfb025(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.ncb_conset_confirmation_popup_cancel), BaseCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver).show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ BaseCommonNCBConsentActivity write;

        IconCompatParcelizer(BaseCommonNCBConsentActivity baseCommonNCBConsentActivity) {
            this.write = baseCommonNCBConsentActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.write.MediaSessionCompat$ResultReceiverWrapper().read(false);
            dialogInterface.dismiss();
        }
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read write = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.ncb_conset_confirmation_popup_decline_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.ncb_conset_confirmation_popup_decline_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ncb_conset_confirmation_popup_accept_confirm), new IconCompatParcelizer(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.ncb_conset_confirmation_popup_cancel), read.write).show();
    }

    public final void setContentView() {
        MediaSessionCompat$ResultReceiverWrapper().MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void IconCompatParcelizer(boolean z) {
        forEachClear foreachclear = this.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("NCB_consent_option", z ? "Accept" : "Decline"));
        forEachClear foreachclear2 = this.tracker;
        if (foreachclear2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_NCB");
        getIntent().putExtra("CONSENT_CONDITIONS_TAG", "NCB_CONSENT");
        getIntent().putExtra("CONSENT_CONDITIONS_STATUS", z);
        setResult(-1, getIntent());
        finish();
    }

    public void onDestroy() {
        MediaSessionCompat$ResultReceiverWrapper().onDestroy();
        super.onDestroy();
    }
}
