package com.scb.phone.view.activity.fastpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.fastpay.FastPaySettingActivity;
import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.custom.common.CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.C7403qo;
import p040o.C7407qt;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FieldLocation;
import p040o.HmlPinActivity;
import p040o.IpImage;
import p040o.IpImageMetadata;
import p040o.IpLib;
import p040o.MyECouponActivity_ViewBinding;
import p040o.cancelProcessing;
import p040o.finalizePreviousNativeSession;
import p040o.getColorUniform;
import p040o.getICheckDeserializerRtti;
import p040o.nativeWriteTiffImageWithMetaData;
import p040o.recordLockedRead;
import p040o.removeIfFromRandomAccessList;
import p040o.setTapText;

public class FastPaySettingActivity extends BaseActivity implements AccountSourceSelectFragment.write, FieldLocation, CustomDeltaInput.read, CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver {
    @BindView
    Button btnAction;
    @BindView
    public CustomDeltaInput cdiFastPaySettingLimitAmount;
    @HmlPinActivity
    public nativeWriteTiffImageWithMetaData presenter;
    @BindView
    TextView textFastPaySettingLimit;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.f77872131493012);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.fastpay_setting_activity_title);
        finalizePreviousNativeSession finalizepreviousnativesession = (finalizePreviousNativeSession) getIntent().getParcelableExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE");
        this.cdiFastPaySettingLimitAmount.inputValue.setOnPasteListener(new C7403qo(this));
        this.cdiFastPaySettingLimitAmount.setOnValueChangedListener(this);
        this.cdiFastPaySettingLimitAmount.setOnIncrementChangeListener(this);
        this.cdiFastPaySettingLimitAmount.inputValue.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                FastPaySettingActivity fastPaySettingActivity = FastPaySettingActivity.this;
                if (i != 6) {
                    return false;
                }
                fastPaySettingActivity.cdiFastPaySettingLimitAmount.inputValue.clearFocus();
                fastPaySettingActivity.PlaybackStateCompat$CustomAction();
                return true;
            }
        });
        this.cdiFastPaySettingLimitAmount.setErrorMessage(getString(R.string.fastpay_setting_range_limit_error_message));
        this.cdiFastPaySettingLimitAmount.inputValue.setOnFocusChangeListener(new C7407qt(this));
        if (finalizepreviousnativesession != null) {
            this.cdiFastPaySettingLimitAmount.setDelta(finalizepreviousnativesession.read);
            this.cdiFastPaySettingLimitAmount.setMinValue(finalizepreviousnativesession.RatingCompat);
            this.cdiFastPaySettingLimitAmount.setMaxValue(finalizepreviousnativesession.MediaBrowserCompat$MediaItem);
            if (finalizepreviousnativesession.MediaBrowserCompat$ItemReceiver > 0.0d) {
                this.cdiFastPaySettingLimitAmount.setActualValue(finalizepreviousnativesession.MediaBrowserCompat$ItemReceiver);
            }
            nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.presenter;
            nativewritetiffimagewithmetadata.write = finalizepreviousnativesession;
            if (finalizepreviousnativesession != null) {
                IpLib ipLib = new IpLib(nativewritetiffimagewithmetadata, finalizepreviousnativesession);
                if (nativewritetiffimagewithmetadata.RatingCompat != null) {
                    ipLib.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
                }
            }
        } else {
            this.cdiFastPaySettingLimitAmount.setDelta(100.0d);
            this.cdiFastPaySettingLimitAmount.setMinValue(100.0d);
            this.cdiFastPaySettingLimitAmount.setMaxValue(5000.0d);
        }
        this.cdiFastPaySettingLimitAmount.MediaBrowserCompat$ItemReceiver();
        if (finalizepreviousnativesession != null) {
            str = finalizepreviousnativesession.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = null;
        }
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.FAST_PAY_FUNCTION);
        write.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.from);
        write.RatingCompat = true;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.layout_account_selector, AccountSourceSelectFragment.IconCompatParcelizer(new CrashlyticsReport.FilesPayload.File(write, (byte) 0), str)).IconCompatParcelizer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.fastpay_setting_activity_title);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            finalizePreviousNativeSession finalizepreviousnativesession = null;
            if (intent != null) {
                finalizepreviousnativesession = (finalizePreviousNativeSession) intent.getParcelableExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE");
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE", finalizepreviousnativesession);
            setResult(-1, intent2);
            finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.presenter;
        nativewritetiffimagewithmetadata.MediaBrowserCompat$ItemReceiver = builder;
        cancelProcessing cancelprocessing = new cancelProcessing(nativewritetiffimagewithmetadata);
        if (nativewritetiffimagewithmetadata.RatingCompat != null) {
            cancelprocessing.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
        }
    }

    @OnClick
    public void onSaveButtonClick(View view) {
        nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.presenter;
        boolean z = true;
        if (nativewritetiffimagewithmetadata.MediaBrowserCompat$CustomActionResultReceiver()) {
            getColorUniform getcoloruniform = getColorUniform.MediaBrowserCompat$CustomActionResultReceiver;
            if (nativewritetiffimagewithmetadata.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getcoloruniform.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
            }
            recordLockedRead write = recordLockedRead.write(nativewritetiffimagewithmetadata.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token, removeIfFromRandomAccessList.read(nativewritetiffimagewithmetadata.read));
            nativewritetiffimagewithmetadata.IconCompatParcelizer.IconCompatParcelizer(write);
            nativewritetiffimagewithmetadata.IconCompatParcelizer.IconCompatParcelizer(new nativeWriteTiffImageWithMetaData.write(write));
            return;
        }
        IpImageMetadata ipImageMetadata = new IpImageMetadata(nativewritetiffimagewithmetadata, nativewritetiffimagewithmetadata.read);
        if (nativewritetiffimagewithmetadata.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ipImageMetadata.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
        }
    }

    /* renamed from: a_ */
    public final void mo14444a_(boolean z) {
        this.btnAction.setEnabled(z);
    }

    public final void read(double d, double d2) {
        String MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
        String MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d2);
        this.textFastPaySettingLimit.setText(getString(R.string.fastpay_setting_range_limit_text, new Object[]{MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2}));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.cdiFastPaySettingLimitAmount.errorMessage.setVisibility(0);
        } else {
            this.cdiFastPaySettingLimitAmount.errorMessage.setVisibility(8);
        }
    }

    public final void read(finalizePreviousNativeSession finalizepreviousnativesession) {
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE", finalizepreviousnativesession);
        setResult(-1, intent);
        finish();
    }

    public final void IconCompatParcelizer(String str, String str2) {
        Intent intent = new Intent(this, FastPayOtpActivity.class);
        intent.putExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_SELECTED_ACCOUNT", str);
        intent.putExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_SELECTED_LIMIT_AMOUNT", str2);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(double d, boolean z) {
        nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.presenter;
        nativewritetiffimagewithmetadata.read = d;
        IpImage ipImage = new IpImage(nativewritetiffimagewithmetadata);
        if (nativewritetiffimagewithmetadata.RatingCompat != null) {
            ipImage.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
        }
    }

    public final void MediaSessionCompat$Token() {
        MediaSessionCompat$QueueItem();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13975x50fd9e4a() {
        MediaSessionCompat$QueueItem();
    }

    private void MediaSessionCompat$QueueItem() {
        nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.presenter;
        IpImageMetadata ipImageMetadata = new IpImageMetadata(nativewritetiffimagewithmetadata, this.cdiFastPaySettingLimitAmount.IconCompatParcelizer);
        if (nativewritetiffimagewithmetadata.RatingCompat != null) {
            ipImageMetadata.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
        }
    }
}
