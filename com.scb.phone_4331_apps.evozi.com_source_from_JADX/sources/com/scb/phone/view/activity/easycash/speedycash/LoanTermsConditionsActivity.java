package com.scb.phone.view.activity.easycash.speedycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.CheckIQAData;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.access$2300;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setIpOperationsFilePath;
import p040o.writeUInt64NoTag;

public class LoanTermsConditionsActivity extends BaseActivityWithFragment implements CheckIQAData, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public setIpOperationsFilePath loanTermsConditionsPresenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final String au_() {
        return "";
    }

    public static Intent IconCompatParcelizer(Context context, immediateFailedFuture immediatefailedfuture) {
        Intent intent = new Intent(context, LoanTermsConditionsActivity.class);
        intent.putExtra("EXTRA_TERMS_AND_CONDITIONS_INFO_DISPLAY", immediatefailedfuture);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.loanTermsConditionsPresenter.MediaBrowserCompat$ItemReceiver(this);
        setIpOperationsFilePath setipoperationsfilepath = this.loanTermsConditionsPresenter;
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) getIntent().getParcelableExtra("EXTRA_TERMS_AND_CONDITIONS_INFO_DISPLAY");
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        writeUInt64NoTag.IconCompatParcelizer write = new setIpOperationsFilePath.write(setipoperationsfilepath, immediatefailedfuture);
        if (setipoperationsfilepath.RatingCompat != null) {
            write.IconCompatParcelizer(setipoperationsfilepath.RatingCompat);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public void onBackPressed() {
        setResult(0, getIntent());
        super.onBackPressed();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void setContentView() {
        this.loanTermsConditionsPresenter.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    /* renamed from: l_ */
    public final void mo33910l_(String str) {
        MediaSessionCompat$QueueItem(str);
    }

    public final void IconCompatParcelizer(String str) {
        Intent intent = getIntent();
        intent.putExtra("CONSENT_CONDITIONS_TAG", str);
        intent.putExtra("CONSENT_CONDITIONS_STATUS", true);
        setResult(-1, intent);
        finish();
    }

    public final void write(String str) {
        Intent intent = getIntent();
        intent.putExtra("CONSENT_CONDITIONS_TAG", str);
        intent.putExtra("CONSENT_CONDITIONS_STATUS", false);
        setResult(-1, intent);
        finish();
    }
}
