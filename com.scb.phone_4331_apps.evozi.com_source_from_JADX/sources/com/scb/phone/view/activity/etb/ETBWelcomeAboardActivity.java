package com.scb.phone.view.activity.etb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.NtbOpenAccountLandingActivity;
import com.scb.phone.view.activity.registration.RegistrationCardDetailActivity;
import com.scb.phone.view.activity.registration.RegistrationNoDataActivity;
import com.scb.phone.view.activity.registration.RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.registration.RegistrationOtpActivity;
import com.scb.phone.view.activity.registration.RegistrationTermsAndConsActivity;
import com.scb.phone.view.fragment.registration.C6141xb267e810;
import com.scb.phone.view.fragment.registration.RegistrationFacialRecognitionLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C9967x610c8ea1;
import p040o.C9969x4d15ec02;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.binaryImagesJsonFromMapsFile;
import p040o.getCopy;
import p040o.getCvv;
import p040o.getFirstPassThresholdUniform;
import p040o.getFirstPassThresholdUniform$MediaBrowserCompat$ItemReceiver;
import p040o.getIsSmilingProbability;
import p040o.mB$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.parseProcMapsJsonFromStream;
import p040o.preWriteCleanup;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ETBWelcomeAboardActivity extends BaseActivity implements getCvv {
    private static read MediaDescriptionCompat = new read((byte) 0);
    private boolean MediaBrowserCompat$MediaItem;
    private boolean MediaMetadataCompat;
    @HmlPinActivity
    public getFirstPassThresholdUniform presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77822131493007);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getFirstPassThresholdUniform getfirstpassthresholduniform = this.presenter;
        if (getfirstpassthresholduniform == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getfirstpassthresholduniform.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = getIntent().getBooleanExtra("TERMS_AND_CON_REQUIRED", false);
        this.MediaMetadataCompat = getIntent().getBooleanExtra("VERIFY_USER", false);
        this.scbAnalytics.write("registration_etb_welcome", new ZSYR2K("source", "etb_no_casa"));
    }

    @OnClick
    public final void onNavigateBack() {
        getFirstPassThresholdUniform getfirstpassthresholduniform = this.presenter;
        if (getfirstpassthresholduniform == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFirstPassThresholdUniform.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (getfirstpassthresholduniform.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getfirstpassthresholduniform.RatingCompat);
        }
    }

    @OnClick
    public final void clickOpenAccount() {
        getFirstPassThresholdUniform getfirstpassthresholduniform = this.presenter;
        if (getfirstpassthresholduniform == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getfirstpassthresholduniform.RatingCompat != null) {
            getfirstpassthresholduniform.RatingCompat.AlertController$RecycleListView();
        }
        getCopy getcopy = getfirstpassthresholduniform.IconCompatParcelizer;
        FundFactSheetActivity getfirstpassthresholduniform_mediabrowsercompat_itemreceiver = new getFirstPassThresholdUniform$MediaBrowserCompat$ItemReceiver(getfirstpassthresholduniform);
        FundFactSheetActivity iconCompatParcelizer = new getFirstPassThresholdUniform.IconCompatParcelizer(getfirstpassthresholduniform);
        onGetStartedClick.write((Object) getfirstpassthresholduniform_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        getcopy.IconCompatParcelizer(getcopy.write, getfirstpassthresholduniform_mediabrowsercompat_itemreceiver, iconCompatParcelizer, new getIsSmilingProbability.IconCompatParcelizer(new preWriteCleanup(getcopy.MediaBrowserCompat$CustomActionResultReceiver)));
    }

    @OnClick
    public final void clickRegister() {
        getFirstPassThresholdUniform getfirstpassthresholduniform = this.presenter;
        if (getfirstpassthresholduniform == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = this.MediaBrowserCompat$MediaItem;
        boolean z2 = this.MediaMetadataCompat;
        boolean z3 = true;
        if (!z2 && z) {
            getfirstpassthresholduniform.write.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35284.ETB_WELCOME_ABOARD.name());
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C9967x610c8ea1.MediaBrowserCompat$CustomActionResultReceiver;
            if (getfirstpassthresholduniform.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                iconCompatParcelizer.IconCompatParcelizer(getfirstpassthresholduniform.RatingCompat);
            }
        } else if (!z2 && !z) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getFirstPassThresholdUniform.read.write;
            if (getfirstpassthresholduniform.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                iconCompatParcelizer2.IconCompatParcelizer(getfirstpassthresholduniform.RatingCompat);
            }
        } else if (z2) {
            if (getfirstpassthresholduniform.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                getfirstpassthresholduniform.RatingCompat.AlertController$RecycleListView();
            }
            getfirstpassthresholduniform.MediaBrowserCompat$ItemReceiver.write(new getFirstPassThresholdUniform.RatingCompat(getfirstpassthresholduniform), new C9969x4d15ec02(getfirstpassthresholduniform), binaryImagesJsonFromMapsFile.NEW_REGISTRATION);
        }
    }

    public final void write() {
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(long j) {
        NtbOpenAccountLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this, j);
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, RegistrationOtpActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        RegistrationTermsAndConsActivity.write write = RegistrationTermsAndConsActivity.MediaBrowserCompat$MediaItem;
        Intent read2 = RegistrationTermsAndConsActivity.write.read(this, mB$MediaBrowserCompat$ItemReceiver.EASYAPP);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read(boolean z) {
        Intent read2 = RegistrationCardDetailActivity.read(this, z, parseProcMapsJsonFromStream.FAST_EASY);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C6141xb267e810 registrationFacialRecognitionLandingActivity$MediaBrowserCompat$ItemReceiver = RegistrationFacialRecognitionLandingActivity.MediaMetadataCompat;
        Intent IconCompatParcelizer = C6141xb267e810.IconCompatParcelizer(this, binaryImagesJsonFromMapsFile.NEW_REGISTRATION, (String) null);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver registrationNoDataActivity$MediaBrowserCompat$ItemReceiver = RegistrationNoDataActivity.MediaMetadataCompat;
        String string = getString(R.string.ntb_fillinformation_review_info_error_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ntb_f…_review_info_error_title)");
        String string2 = getString(R.string.ntb_no_reg_data_desc);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.ntb_no_reg_data_desc)");
        Intent IconCompatParcelizer = RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, R.drawable.ic_notice, string, string2);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public static final void IconCompatParcelizer(Context context, Boolean bool, Boolean bool2) {
        if (context != null) {
            Intent intent = new Intent(context, ETBWelcomeAboardActivity.class);
            intent.putExtra("TERMS_AND_CON_REQUIRED", bool);
            intent.putExtra("VERIFY_USER", bool2);
            intent.addFlags(603979776);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
