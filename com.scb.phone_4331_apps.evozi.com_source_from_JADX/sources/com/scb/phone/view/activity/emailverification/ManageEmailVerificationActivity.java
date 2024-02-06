package com.scb.phone.view.activity.emailverification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.emailverification.ManageEmailVerificationFragment;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.getFaceAngleTolerance;
import p040o.getMissingBordersDetection;
import p040o.getOversizeImage;
import p040o.getUsable$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTitleMarginStart;

public class ManageEmailVerificationActivity extends BaseActivity implements ManageEmailVerificationFragment.write, getUsable$MediaBrowserCompat$CustomActionResultReceiver {
    private String[] MediaDescriptionCompat = {"EMAIL_VERIFICATION_TAG"};
    @HmlPinActivity
    public getFaceAngleTolerance manageEmailVerificationPresenter;

    public static Intent write(Activity activity, String str, String str2, boolean z) {
        return write(activity, str, str2, z, false);
    }

    public static Intent write(Activity activity, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent(activity, ManageEmailVerificationActivity.class);
        intent.putExtra("EXTRA_UUID", str);
        intent.putExtra("EXTRA_REFID", str2);
        intent.putExtra("EXTRA_IS_SNACKBAR_SUCCESS", z);
        intent.putExtra("EXTRA_IS_REQUESTED_FOR_RESULT", z2);
        return intent;
    }

    public static Intent IconCompatParcelizer(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, ManageEmailVerificationActivity.class);
        intent.putExtra("EXTRA_UUID", str);
        intent.putExtra("EXTRA_REFID", str2);
        intent.putExtra("EXTRA_FROM_NOTI", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78652131493090);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.manageEmailVerificationPresenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("EXTRA_UUID");
        String stringExtra2 = intent.getStringExtra("EXTRA_REFID");
        String stringExtra3 = intent.getStringExtra("EXTRA_EMAIL");
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_SNACKBAR_SUCCESS", false);
        getFaceAngleTolerance getfaceangletolerance = this.manageEmailVerificationPresenter;
        if (stringExtra3 == null && getfaceangletolerance.IconCompatParcelizer.read.MediaBrowserCompat$MediaItem() != null) {
            stringExtra3 = getfaceangletolerance.IconCompatParcelizer.read.MediaBrowserCompat$MediaItem().MediaDescriptionCompat;
        }
        getMissingBordersDetection getmissingbordersdetection = new getMissingBordersDetection(stringExtra3, stringExtra, stringExtra2, booleanExtra);
        if (getfaceangletolerance.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getmissingbordersdetection.IconCompatParcelizer(getfaceangletolerance.RatingCompat);
        }
        super.setStackedBackground();
        setTabContainer();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$ItemReceiver(CardView cardView, Bundle bundle) {
        ManageEmailVerificationFragment manageEmailVerificationFragment = new ManageEmailVerificationFragment();
        manageEmailVerificationFragment.setArguments(bundle);
        cardView.write(R.id.fragment_email_verification_container, manageEmailVerificationFragment, "EMAIL_VERIFICATION_TAG");
    }

    public final void IconCompatParcelizer(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.SUCCESS);
    }

    public final void write(String str) {
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, boolean z) {
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        CardView read = supportFragmentManager.read();
        for (String findFragmentByTag : this.MediaDescriptionCompat) {
            Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(findFragmentByTag);
            if (findFragmentByTag2 != null) {
                read.MediaBrowserCompat$ItemReceiver(findFragmentByTag2);
            }
        }
        Fragment findFragmentByTag3 = supportFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag3 != null) {
            read.IconCompatParcelizer(findFragmentByTag3);
        } else if ("EMAIL_VERIFICATION_TAG".equals(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_EMAIL", str2);
            bundle.putString("BUNDLE_UUID", str3);
            bundle.putString("BUNDLE_REFCODE", str4);
            bundle.putBoolean("FLOW", getIntent().getBooleanExtra("EXTRA_FLOW", false));
            bundle.putBoolean("FROM_NOTI", getIntent().getBooleanExtra("EXTRA_FROM_NOTI", false));
            bundle.putBoolean("EXTRA_IS_REQUESTED_FOR_RESULT", getIntent().getBooleanExtra("EXTRA_IS_REQUESTED_FOR_RESULT", false));
            MediaBrowserCompat$ItemReceiver(read, bundle);
        }
        read.write();
        if (z) {
            write(this, R.id.view_group_root, getString(R.string.manage_email_verification_resend_otp_description), getOversizeImage.SUCCESS);
        }
    }
}
