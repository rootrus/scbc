package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.C10900getSDKVersion;
import p040o.CharMatcher;
import p040o.ErrorLogEventDao;
import p040o.ForwardingSet;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.ImgClassificationEventDao;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceFilter;
import p040o.ZSYR2K;
import p040o.getErrorTime;
import p040o.getHighestVersion;
import p040o.getOSName;
import p040o.getOSVersion;
import p040o.getTaskReturnValue;
import p040o.setClassificationEventID;
import p040o.setOSName;
import p040o.setTapText;
import p040o.standardPeek;
import p040o.zzmd;
import p040o.zzwi;

public class MwOnBoardSuccessActivity extends BaseActivity implements getHighestVersion {
    @BindView
    Button btnGetStarted;
    @BindView
    Button btnGmbAccount;
    @BindView
    Button btnGmbGetStarted;
    @BindView
    Button buttonCreateNickname;
    @BindView
    EditText editTextNickname;
    @BindView
    ImageView imgMerchantWallet;
    @BindView
    ImageView ivGmbBanner;
    @BindView
    ViewGroup layoutEditNickname;
    @BindView
    ViewGroup layoutHaveNickname;
    @HmlPinActivity
    public getTaskReturnValue presenter;
    @BindView
    ConstraintLayout shopCoverEmpty;
    @BindView
    TextView tvAccountNumber;
    @BindView
    TextView tvDateTime;
    @BindView
    TextView tvLinkedAccount;
    @BindView
    TextView tvOwnerName;
    @BindView
    TextView tvShopName;
    @BindView
    TextView tvShopType;
    @BindView
    TextView tvSuccessTitle;
    @BindView
    TextView tvWalletNickname;
    @BindView
    TextView tvWalletNumber;

    public void onBackPressed() {
    }

    public static Intent IconCompatParcelizer(Context context, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder) {
        return new Intent(context, MwOnBoardSuccessActivity.class).putExtra("MERCHANT_REVIEW_DISPLAY", crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        PlaceFilter.zzb zzb;
        super.onCreate(bundle);
        setContentView(R.layout.f78892131493114);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("merchant_register_successful");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getTaskReturnValue gettaskreturnvalue = this.presenter;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = (AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder) getIntent().getExtras().getParcelable("MERCHANT_REVIEW_DISPLAY");
        gettaskreturnvalue.read = crashlyticsReportSessionEventApplicationExecutionSignalEncoder;
        getOSName getosname = new getOSName(gettaskreturnvalue, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        boolean z2 = true;
        if (gettaskreturnvalue.RatingCompat != null) {
            getosname.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
        }
        zzwi write = gettaskreturnvalue.write.write();
        if (write == null || (zzb = write.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z = false;
        } else {
            z = zzb.ParcelableVolumeInfo;
        }
        if (z) {
            ImgClassificationEventDao imgClassificationEventDao = ImgClassificationEventDao.read;
            if (gettaskreturnvalue.RatingCompat != null) {
                imgClassificationEventDao.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
            }
            setOSName setosname = new setOSName(gettaskreturnvalue);
            if (gettaskreturnvalue.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                setosname.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
                return;
            }
            return;
        }
        setClassificationEventID setclassificationeventid = setClassificationEventID.read;
        if (gettaskreturnvalue.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setclassificationeventid.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
        }
    }

    @OnClick
    public void onEditNicknameClick() {
        getTaskReturnValue gettaskreturnvalue = this.presenter;
        getErrorTime geterrortime = new getErrorTime(this.tvWalletNickname.getText().toString());
        if (gettaskreturnvalue.RatingCompat != null) {
            geterrortime.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
        }
    }

    @OnClick
    public void onCreateNicknameClick() {
        getTaskReturnValue gettaskreturnvalue = this.presenter;
        getErrorTime geterrortime = new getErrorTime("");
        if (gettaskreturnvalue.RatingCompat != null) {
            geterrortime.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
        }
    }

    @OnClick
    public void onDoneNicknameClick() {
        getTaskReturnValue gettaskreturnvalue = this.presenter;
        String obj = this.editTextNickname.getText().toString();
        if (gettaskreturnvalue.RatingCompat != null) {
            gettaskreturnvalue.RatingCompat.AlertController$RecycleListView();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new standardPeek(gettaskreturnvalue.read.MediaBrowserCompat$ItemReceiver, obj));
        ForwardingSet forwardingSet = new ForwardingSet();
        forwardingSet.MediaBrowserCompat$ItemReceiver = arrayList;
        CharMatcher.LookupTable lookupTable = gettaskreturnvalue.IconCompatParcelizer;
        lookupTable.read(lookupTable.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(forwardingSet), new getOSVersion(gettaskreturnvalue, obj), new ErrorLogEventDao(gettaskreturnvalue));
    }

    @OnClick
    public void onClearNicknameClick() {
        this.editTextNickname.setText("");
    }

    @OnClick
    public void onNextClick() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void MediaBrowserCompat$ItemReceiver() {
        this.buttonCreateNickname.setVisibility(0);
        this.layoutHaveNickname.setVisibility(8);
        this.layoutEditNickname.setVisibility(8);
    }

    public final void write(String str) {
        this.layoutEditNickname.setVisibility(0);
        this.buttonCreateNickname.setVisibility(8);
        this.layoutHaveNickname.setVisibility(8);
        this.editTextNickname.setText(str);
        this.editTextNickname.setSelection(str.length());
    }

    public final void MediaDescriptionCompat(String str) {
        this.layoutHaveNickname.setVisibility(0);
        this.layoutEditNickname.setVisibility(8);
        this.buttonCreateNickname.setVisibility(8);
        this.tvWalletNickname.setText(str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.imgMerchantWallet.setVisibility(0);
        this.shopCoverEmpty.setVisibility(8);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(str, this.imgMerchantWallet);
    }

    public final void read() {
        this.shopCoverEmpty.setVisibility(0);
        this.imgMerchantWallet.setVisibility(8);
    }

    public final void write() {
        this.ivGmbBanner.setVisibility(0);
        this.btnGmbAccount.setVisibility(0);
        this.btnGmbGetStarted.setVisibility(0);
        this.btnGetStarted.setVisibility(8);
    }

    public final void IconCompatParcelizer() {
        this.ivGmbBanner.setVisibility(8);
        this.btnGmbAccount.setVisibility(8);
        this.btnGmbGetStarted.setVisibility(8);
        this.btnGetStarted.setVisibility(0);
    }

    public final void read(String str) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(this.ivGmbBanner, str);
    }

    @OnClick
    public void onGMBClick() {
        getTaskReturnValue gettaskreturnvalue = this.presenter;
        if (gettaskreturnvalue.read.MediaBrowserCompat$CustomActionResultReceiver != null && !gettaskreturnvalue.read.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.trim().equals("")) {
            C10900getSDKVersion getsdkversion = new C10900getSDKVersion(gettaskreturnvalue);
            if (gettaskreturnvalue.RatingCompat != null) {
                getsdkversion.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        if (str != null) {
            this.scbAnalytics.write("gmb_new_register", new ZSYR2K[0]);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("IS_NEED_HISTORY_STACK", true);
            intent.putExtra("EXTRA_CLEAR_COOKIES_PARAMETER", zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
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

    public final void MediaBrowserCompat$ItemReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder) {
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = crashlyticsReportSessionEventApplicationExecutionSignalEncoder.read;
        this.tvDateTime.setText(crashlyticsReportSessionEventApplicationExecutionSignalEncoder.IconCompatParcelizer);
        this.tvWalletNumber.setText(crashlyticsReportSessionEventApplicationExecutionSignalEncoder.MediaBrowserCompat$ItemReceiver);
        this.tvLinkedAccount.setText(crashlyticsReportSessionEventApplicationExecutionEncoder.MediaBrowserCompat$ItemReceiver);
        this.tvAccountNumber.setText(crashlyticsReportSessionEventApplicationExecutionEncoder.write);
        this.tvOwnerName.setText(crashlyticsReportSessionEventApplicationExecutionEncoder.MediaBrowserCompat$CustomActionResultReceiver);
        this.tvShopName.setText(crashlyticsReportSessionEventApplicationExecutionEncoder.read);
        this.tvShopType.setText(crashlyticsReportSessionEventApplicationExecutionEncoder.MediaMetadataCompat);
    }
}
