package com.scb.phone.view.activity.emailverification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.scb.phone.view.fragment.emailverification.C1118xc9fd465d;
import com.scb.phone.view.fragment.emailverification.ManageEmailVerificationSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TurnGuidance;
import p040o.access$2100;
import p040o.getShadowDetection;
import p040o.getUsable;
import p040o.setTapText;

public class ManageEmailVerificationSuccessActivity extends BaseActivity implements getUsable.read, C1118xc9fd465d {
    private boolean MediaBrowserCompat$MediaItem = false;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    @HmlPinActivity
    public TurnGuidance manageEmailVerificationSuccessPresenter;

    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Activity activity, access$2100 access_2100, boolean z) {
        Intent intent = new Intent(activity, ManageEmailVerificationSuccessActivity.class);
        intent.putExtra("EXTRA_VERIFICATION_INFO_DISPLAY", access_2100);
        intent.putExtra("FROM_NOTIFICATION", z);
        return intent;
    }

    public static Intent write(Activity activity, access$2100 access_2100) {
        Intent intent = new Intent(activity, ManageEmailVerificationSuccessActivity.class);
        intent.putExtra("EXTRA_VERIFICATION_INFO_DISPLAY", access_2100);
        intent.putExtra("EXTRA_IS_REQUESTED_FOR_RESULT", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        String str;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78642131493089);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.manageEmailVerificationSuccessPresenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        boolean z = false;
        this.MediaBrowserCompat$SearchResultReceiver = intent.getBooleanExtra("FROM_NOTIFICATION", false);
        this.MediaBrowserCompat$MediaItem = intent.getBooleanExtra("EXTRA_IS_REQUESTED_FOR_RESULT", false);
        TurnGuidance turnGuidance = this.manageEmailVerificationSuccessPresenter;
        String str2 = ((access$2100) intent.getParcelableExtra("EXTRA_VERIFICATION_INFO_DISPLAY")).MediaBrowserCompat$ItemReceiver;
        if (turnGuidance.write.read.MediaBrowserCompat$MediaItem() != null) {
            str = turnGuidance.write.read.MediaBrowserCompat$MediaItem().MediaDescriptionCompat;
        } else {
            str = "";
        }
        getShadowDetection getshadowdetection = new getShadowDetection(str, str2);
        if (turnGuidance.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getshadowdetection.IconCompatParcelizer(turnGuidance.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_EMAIL", str);
        bundle.putString("BUNDLE_TRANSACTION_DATETIME", str2);
        ManageEmailVerificationSuccessFragment manageEmailVerificationSuccessFragment = new ManageEmailVerificationSuccessFragment();
        manageEmailVerificationSuccessFragment.setArguments(bundle);
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.fragment_email_success_container, manageEmailVerificationSuccessFragment, "EMAIL_VERIFICATION_TAG");
        read.write();
    }

    public final void IconCompatParcelizer(String str) {
        Intent intent;
        if (this.MediaBrowserCompat$MediaItem) {
            Intent intent2 = new Intent();
            intent2.putExtra("BUNDLE_EMAIL", str);
            setResult(-1, intent2);
            finish();
            return;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            intent = new Intent(this, HomeActivity.class);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.notification_tab);
        } else {
            intent = new Intent(this, ProfileManagementActivity.class);
        }
        intent.addFlags(603979776);
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
