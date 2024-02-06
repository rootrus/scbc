package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.debitatm.AddAccountOtpActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.AddAccountsActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.ImgReviewEditCntrl;
import p040o.LevelnessEvent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportParameters_MembersInjector;
import p040o.ZSYR2K;
import p040o.access$502;
import p040o.access$802;
import p040o.immediateFailedCheckedFuture;
import p040o.immediateFailedFuture;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class AddAccountConsentActivity extends BaseActivityWithFragment implements PassportParameters_MembersInjector, FragmentBuilder_BindCustomizeYourPageFragment {
    private boolean MediaBrowserCompat$MediaItem = false;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private boolean MediaDescriptionCompat = false;
    private int MediaMetadataCompat = 0;
    @HmlPinActivity
    public LevelnessEvent presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final String au_() {
        return "";
    }

    public static void IconCompatParcelizer(Context context) {
        Intent intent = new Intent(context, AddAccountConsentActivity.class);
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

    public static void write(Context context) {
        Intent intent = new Intent(context, AddAccountConsentActivity.class);
        intent.putExtra("KEY_IS_ON_BOARDING", true);
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

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, AddAccountConsentActivity.class);
        intent.putExtra("KEY_IS_HML", true);
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("addaccount_consent");
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            MediaSessionCompat$QueueItem(getString(R.string.hml_account_add_consent_title));
        }
        boolean z = false;
        this.MediaBrowserCompat$MediaItem = getIntent().getBooleanExtra("KEY_IS_ON_BOARDING", false);
        this.MediaBrowserCompat$SearchResultReceiver = getIntent().getBooleanExtra("KEY_IS_HML", false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        LevelnessEvent levelnessEvent = this.presenter;
        boolean z2 = this.MediaBrowserCompat$MediaItem;
        levelnessEvent.IconCompatParcelizer = "ADD_CONSENT";
        levelnessEvent.MediaBrowserCompat$ItemReceiver = z2;
        ImgReviewEditCntrl.C34951 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                LevelnessEvent levelnessEvent = LevelnessEvent.this;
                ((PassportParameters_MembersInjector) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(levelnessEvent.write, (String) null, levelnessEvent.IconCompatParcelizer, (String) null, (String) null, true, true, (String) null, 72));
            }
        };
        if (levelnessEvent.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r1.IconCompatParcelizer(levelnessEvent.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            MediaSessionCompat$QueueItem(getString(R.string.hml_account_add_consent_title));
        }
    }

    public final void write(immediateFailedCheckedFuture immediatefailedcheckedfuture) {
        access$502 access_502 = new access$502(this);
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String str = immediatefailedcheckedfuture.IconCompatParcelizer;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        String str2 = immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver;
        if (true ^ (str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        IconCompatParcelizer.IconCompatParcelizer(immediatefailedcheckedfuture.read, access_502).MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture.MediaBrowserCompat$ItemReceiver, access$802.write).show();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void write(boolean z, int i, AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder) {
        AddAccountsActivity.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$MediaItem, z, i, builder);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        this.scbAnalytics.write("addaccount_consent_click", new ZSYR2K("button", "accept"));
        this.presenter.IconCompatParcelizer(true);
    }

    public final void write(String str) {
        boolean z = true;
        this.scbAnalytics.write("addaccount_consent_click", new ZSYR2K("button", "deny"));
        LevelnessEvent levelnessEvent = this.presenter;
        ImgReviewEditCntrl.Line_Style_Solid line_Style_Solid = new ImgReviewEditCntrl.Line_Style_Solid(levelnessEvent);
        if (levelnessEvent.RatingCompat == null) {
            z = false;
        }
        if (z) {
            line_Style_Solid.IconCompatParcelizer(levelnessEvent.RatingCompat);
        }
    }

    public final void setContentView() {
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, int i) {
        this.MediaDescriptionCompat = z;
        this.MediaMetadataCompat = 0;
        Intent MediaBrowserCompat$ItemReceiver = AddAccountOtpActivity.MediaBrowserCompat$ItemReceiver(this, z);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            boolean z = this.MediaDescriptionCompat;
            int i3 = this.MediaMetadataCompat;
            AddAccountsActivity.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$MediaItem, z, i3, (AutoValue_CrashlyticsReport_Session_Event_Application.Builder) intent.getExtras().getParcelable("UNREGISTER_ACCOUNT_LIST"));
        } else if (i == 1 && i2 == 0) {
            finish();
        }
    }
}
