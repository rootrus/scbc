package com.scb.phone.view.activity.scheduledtransaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.AlertController$RecycleListView;
import p040o.C5056nc;
import p040o.C5181qf;
import p040o.HmlPinActivity;
import p040o.TitleChanger;
import p040o.getDiskUsed;
import p040o.getImageFocusScore;
import p040o.getImageTooDark;
import p040o.getRamUsed;
import p040o.onRangeSelected;
import p040o.selectAccountValidation;

public class ScheduleLandingActivity extends BaseActivity implements getImageFocusScore, getImageTooDark {
    private getDiskUsed MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public boolean MediaMetadataCompat;
    private getRamUsed MediaSessionCompat$ResultReceiverWrapper;
    private getRamUsed MediaSessionCompat$Token;
    @BindView
    DefaultButton okButton;
    @HmlPinActivity
    public C5056nc scheduleLandingPresenter;
    @BindView
    TabLayout tabLayout;
    @BindView
    ViewPager tabPager;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, ScheduleLandingActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_ONCE_SCHEDULE", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79842131493209);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.scheduleLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5056nc ncVar = this.scheduleLandingPresenter;
        boolean z = true;
        boolean z2 = getIntent().getExtras() != null && getIntent().getExtras().getBoolean("com.scb.phone.EXTRA_ONCE_SCHEDULE", false);
        C5181qf qfVar = C5181qf.MediaBrowserCompat$ItemReceiver;
        if (ncVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            qfVar.IconCompatParcelizer(ncVar.RatingCompat);
        }
        ncVar.IconCompatParcelizer.write();
        ncVar.IconCompatParcelizer.IconCompatParcelizer(new C5056nc.read(z2));
        setStackedBackground();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle((getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("com.scb.phone.EXTRA_ONCE_SCHEDULE", false)) ? R.string.schedule_setup_001 : R.string.schedule_title_once);
        setTabContainer();
    }

    public final void IconCompatParcelizer(getDiskUsed getdiskused) {
        this.MediaBrowserCompat$MediaItem = getdiskused;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.tabPager.setAdapter(new selectAccountValidation(getSupportFragmentManager(), this, getdiskused.MediaBrowserCompat$SearchResultReceiver));
        this.tabPager.setOffscreenPageLimit(getdiskused.MediaBrowserCompat$SearchResultReceiver ? 1 : 2);
        this.tabLayout.setupWithViewPager(this.tabPager);
        this.tabLayout.setVisibility(getdiskused.MediaBrowserCompat$SearchResultReceiver ? 8 : 0);
        this.okButton.setButtonEnabled(false);
        this.tabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (i == 0) {
                    int unused = ScheduleLandingActivity.this.MediaDescriptionCompat = 0;
                    ScheduleLandingActivity.this.okButton.setButtonEnabled(ScheduleLandingActivity.this.MediaMetadataCompat);
                } else if (i == 1) {
                    int unused2 = ScheduleLandingActivity.this.MediaDescriptionCompat = 1;
                    ScheduleLandingActivity.this.okButton.setButtonEnabled(ScheduleLandingActivity.this.MediaBrowserCompat$SearchResultReceiver);
                }
            }
        });
    }

    @OnClick
    public void onOkClick() {
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            Intent intent = new Intent();
            intent.putExtra("com.scb.phone.EXTRA_MODE", "O");
            intent.putExtra("SCHEDULE_DETAIL", this.MediaSessionCompat$Token);
            setResult(-1, intent);
            finish();
        } else if (i == 1) {
            Intent intent2 = new Intent();
            intent2.putExtra("com.scb.phone.EXTRA_MODE", "M");
            intent2.putExtra("SCHEDULE_DETAIL", this.MediaSessionCompat$ResultReceiverWrapper);
            switch (Integer.valueOf(this.MediaSessionCompat$ResultReceiverWrapper.write).intValue()) {
                case 29:
                case 30:
                case 31:
                    CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
                    String string = getString(R.string.schedule_setup_monthly_disclaimer_001);
                    if (!(string == null || string.length() == 0)) {
                        IconCompatParcelizer.mTitleTextView.setVisibility(0);
                        IconCompatParcelizer.mTitleTextView.setText(string);
                    }
                    String string2 = getString(R.string.schedule_setup_monthly_disclaimer_002);
                    if (true ^ (string2 == null || string2.length() == 0)) {
                        IconCompatParcelizer.mTextTextView.setVisibility(0);
                        IconCompatParcelizer.mTextTextView.setText(string2);
                    }
                    CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ok), new onRangeSelected(this, intent2));
                    IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), TitleChanger.IconCompatParcelizer).show();
                    return;
                default:
                    setResult(-1, intent2);
                    finish();
                    return;
            }
        }
    }

    @OnClick
    public void onUnscheduleClick() {
        setResult(1);
        finish();
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = z;
        this.okButton.setButtonEnabled(z);
    }

    public final void write() {
        this.MediaMetadataCompat = true;
        this.okButton.setButtonEnabled(true);
    }

    public final getDiskUsed read() {
        return this.MediaBrowserCompat$MediaItem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(p040o.getRamUsed r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 77
            if (r0 == r2) goto L_0x0017
            r2 = 79
            if (r0 != r2) goto L_0x0021
            java.lang.String r0 = "O"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0021
            r5 = 0
            goto L_0x0022
        L_0x0017:
            java.lang.String r0 = "M"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0021
            r5 = r1
            goto L_0x0022
        L_0x0021:
            r5 = -1
        L_0x0022:
            if (r5 == 0) goto L_0x0029
            if (r5 != r1) goto L_0x002b
            r3.MediaSessionCompat$ResultReceiverWrapper = r4
            return
        L_0x0029:
            r3.MediaSessionCompat$Token = r4
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity.write(o.getRamUsed, java.lang.String):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C5056nc ncVar = this.scheduleLandingPresenter;
        if (ncVar != null) {
            ncVar.onDestroy();
        }
    }
}
