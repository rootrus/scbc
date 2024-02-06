package com.scb.phone.view.activity.emailverification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.domain.interactor.emailverification.EmailMeVerificationCodeUseCase;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C10107pm;
import p040o.C10108po;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBLAS;
import p040o.getGlareDetectionIntensityThreshold;
import p040o.getOversizeImage;
import p040o.getRestrictiveEndorsement;
import p040o.getTetragonCorners;
import p040o.setGlareDetectionIntensityThreshold;
import p040o.setLastBaselineToBottomHeight;
import p040o.setShadowDetection;
import p040o.setTapText;
import p040o.tryWeakKeys;
import p040o.zzaj;
import p040o.zzdy;

public class ManageEmailLandingActivity extends BaseActivity implements getRestrictiveEndorsement {
    private ScriptIntrinsicBLAS.Uplo MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaMetadataCompat;
    @BindView
    Button btnEnterEmailVerification;
    @BindView
    Button btnSendEmailVerification;
    @BindView
    TextView emailVerifyDescription;
    @HmlPinActivity
    public tryWeakKeys manageEmailCommonDisplayMapper;
    @HmlPinActivity
    public setShadowDetection presenter;
    @BindView
    TextView tvEmail;
    @BindView
    TextView tvIsVerified;

    public static Intent read(Activity activity) {
        return new Intent(activity, ManageEmailLandingActivity.class);
    }

    public static Intent IconCompatParcelizer(Context context) {
        Intent intent = new Intent(context, ManageEmailLandingActivity.class);
        intent.putExtra("EXTRA_IS_REQUESTED_FOR_RESULT", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78632131493088);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
        setTitle(R.string.manage_email);
        this.MediaMetadataCompat = getIntent().getBooleanExtra("EXTRA_IS_REQUESTED_FOR_RESULT", false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$SearchResultReceiver = new ScriptIntrinsicBLAS.Uplo();
        this.presenter.write();
    }

    public void onResume() {
        super.onResume();
        setShadowDetection setshadowdetection = this.presenter;
        if (!setshadowdetection.MediaBrowserCompat$ItemReceiver) {
            if (setshadowdetection.RatingCompat != null) {
                setshadowdetection.RatingCompat.AlertController$RecycleListView();
            }
            setshadowdetection.write.IconCompatParcelizer();
            setshadowdetection.write.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzaj.zzc>() {
                public final /* synthetic */ void onNext(Object obj) {
                    zzaj.zzc zzc = (zzaj.zzc) obj;
                    setShadowDetection.write(setShadowDetection.this);
                    String unused = setShadowDetection.this.MediaMetadataCompat = zzc.MediaBrowserCompat$ItemReceiver;
                    String unused2 = setShadowDetection.this.MediaBrowserCompat$SearchResultReceiver = zzc.write;
                    String unused3 = setShadowDetection.this.MediaDescriptionCompat = zzc.IconCompatParcelizer;
                    boolean z = true;
                    boolean z2 = setShadowDetection.this.MediaBrowserCompat$SearchResultReceiver != null && !setShadowDetection.this.MediaBrowserCompat$SearchResultReceiver.isEmpty() && setShadowDetection.this.MediaDescriptionCompat != null && !setShadowDetection.this.MediaDescriptionCompat.isEmpty() && setShadowDetection.this.MediaMetadataCompat != null && !setShadowDetection.this.MediaMetadataCompat.isEmpty();
                    setShadowDetection setshadowdetection = setShadowDetection.this;
                    getLowContrastBackgroundDetection getlowcontrastbackgrounddetection = new getLowContrastBackgroundDetection(z2);
                    if (setshadowdetection.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getlowcontrastbackgrounddetection.IconCompatParcelizer(setshadowdetection.RatingCompat);
                    }
                }

                public final void onError(Throwable th) {
                    setShadowDetection.read(setShadowDetection.this);
                    setShadowDetection setshadowdetection = setShadowDetection.this;
                    getGlareDetectionNumberOfTiles getglaredetectionnumberoftiles = new getGlareDetectionNumberOfTiles(this, th);
                    if (setshadowdetection.RatingCompat != null) {
                        getglaredetectionnumberoftiles.IconCompatParcelizer(setshadowdetection.RatingCompat);
                    }
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    @OnClick
    public void onIbEmailEditClicked() {
        setShadowDetection setshadowdetection = this.presenter;
        setGlareDetectionIntensityThreshold setglaredetectionintensitythreshold = setGlareDetectionIntensityThreshold.MediaBrowserCompat$CustomActionResultReceiver;
        if (setshadowdetection.RatingCompat != null) {
            setglaredetectionintensitythreshold.IconCompatParcelizer(setshadowdetection.RatingCompat);
        }
    }

    @OnClick
    public void onBtnEnterEmailVerificationClicked() {
        this.MediaBrowserCompat$SearchResultReceiver.read("button", "enter_verification_code");
        setShadowDetection setshadowdetection = this.presenter;
        getGlareDetectionIntensityThreshold getglaredetectionintensitythreshold = new getGlareDetectionIntensityThreshold(setshadowdetection);
        if (setshadowdetection.RatingCompat != null) {
            getglaredetectionintensitythreshold.IconCompatParcelizer(setshadowdetection.RatingCompat);
        }
    }

    @OnClick
    public void onBtnSendEmailVerificationClicked() {
        this.MediaBrowserCompat$SearchResultReceiver.read("button", "request_verification_code");
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "emailverification_button");
        setShadowDetection setshadowdetection = this.presenter;
        boolean z = true;
        if (SystemClock.elapsedRealtime() - setshadowdetection.read < 60000) {
            getTetragonCorners gettetragoncorners = getTetragonCorners.IconCompatParcelizer;
            if (setshadowdetection.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gettetragoncorners.IconCompatParcelizer(setshadowdetection.RatingCompat);
                return;
            }
            return;
        }
        setshadowdetection.read = SystemClock.elapsedRealtime();
        if (setshadowdetection.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setshadowdetection.RatingCompat.AlertController$RecycleListView();
        }
        setshadowdetection.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        setshadowdetection.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzdy.zzb>() {
            public final /* synthetic */ void onNext(Object obj) {
                setShadowDetection.RatingCompat(setShadowDetection.this);
                setShadowDetection setshadowdetection = setShadowDetection.this;
                getGlareDetectionIntensityFraction getglaredetectionintensityfraction = new getGlareDetectionIntensityFraction((zzdy.zzb) obj);
                if (setshadowdetection.RatingCompat != null) {
                    getglaredetectionintensityfraction.IconCompatParcelizer(setshadowdetection.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                setShadowDetection.MediaDescriptionCompat(setShadowDetection.this);
                boolean z = true;
                if (th instanceof EmailMeVerificationCodeUseCase.EmailVerificationCodeNotSendException) {
                    setShadowDetection setshadowdetection = setShadowDetection.this;
                    setBlurCountPercentThreshold setblurcountpercentthreshold = setBlurCountPercentThreshold.MediaBrowserCompat$CustomActionResultReceiver;
                    if (setshadowdetection.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setblurcountpercentthreshold.IconCompatParcelizer(setshadowdetection.RatingCompat);
                        return;
                    }
                    return;
                }
                setShadowDetection setshadowdetection2 = setShadowDetection.this;
                getGlareDetectionMinimumGlareAreaFraction getglaredetectionminimumglareareafraction = new getGlareDetectionMinimumGlareAreaFraction(this, th);
                if (setshadowdetection2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getglaredetectionminimumglareareafraction.IconCompatParcelizer(setshadowdetection2.RatingCompat);
                }
            }
        });
    }

    public final void MediaBrowserCompat$MediaItem() {
        finish();
    }

    public final void read(String str) {
        this.tvEmail.setText(str);
    }

    public final void read() {
        Intent read = ManageEmailInputActivity.read(this, this.MediaMetadataCompat);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z) {
        if (this.MediaMetadataCompat) {
            Intent write = ManageEmailVerificationActivity.write(this, str, str2, z, true);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, write).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(read, 101);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            Intent write3 = ManageEmailVerificationActivity.write(this, str, str2, z);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, write3).read();
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb2.toString());
                startActivity(read2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void read(boolean z) {
        if (z) {
            this.btnEnterEmailVerification.setVisibility(0);
            this.btnSendEmailVerification.setVisibility(8);
            this.emailVerifyDescription.setText(R.string.manage_email_verified_code_send_description);
            return;
        }
        this.btnEnterEmailVerification.setVisibility(8);
        this.btnSendEmailVerification.setVisibility(0);
        this.emailVerifyDescription.setText(R.string.manage_email_verified_code_not_send_description);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.MediaMetadataCompat != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 100
            if (r5 == r1) goto L_0x000a
            r1 = 101(0x65, float:1.42E-43)
            if (r5 == r1) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            r1 = -1
            java.lang.String r2 = "EXTRA_EMAIL_STATUS"
            r3 = 2
            if (r1 != r6) goto L_0x0023
            if (r7 == 0) goto L_0x0032
            int r1 = r7.getIntExtra(r2, r3)
            if (r1 == 0) goto L_0x0021
            o.setShadowDetection r1 = r4.presenter
            r1.write()
            boolean r1 = r4.MediaMetadataCompat
            if (r1 == 0) goto L_0x0032
        L_0x0021:
            r0 = 1
            goto L_0x0032
        L_0x0023:
            if (r6 != 0) goto L_0x0032
            if (r7 == 0) goto L_0x0032
            int r1 = r7.getIntExtra(r2, r3)
            if (r1 != r3) goto L_0x0032
            o.setShadowDetection r1 = r4.presenter
            r1.write()
        L_0x0032:
            if (r0 == 0) goto L_0x0038
            r4.finish()
            return
        L_0x0038:
            super.onActivityResult(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        write(this.manageEmailCommonDisplayMapper.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.tvIsVerified.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67212131099877));
            this.tvIsVerified.setText(R.string.manage_email_verified);
        } else {
            this.tvIsVerified.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67222131099878));
            this.tvIsVerified.setText(R.string.manage_email_not_verified);
        }
        this.MediaBrowserCompat$SearchResultReceiver.read("email_status", TextUtils.isEmpty(this.tvEmail.getText().toString()) ? "empty" : z ? "verified" : "unverified");
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "emailverification_status");
    }

    public final void IconCompatParcelizer() {
        write(this, R.id.view_group_root, getString(R.string.manage_email_otp_resend_error), getOversizeImage.ERROR);
    }

    public final void write() {
        this.btnEnterEmailVerification.setVisibility(8);
        this.btnSendEmailVerification.setVisibility(8);
        this.emailVerifyDescription.setText("");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.edit_email_things_you_should_know);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.edit_email_things_you_should_know_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.continue_dialog_label), new C10107pm(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), C10108po.IconCompatParcelizer).show();
    }
}
