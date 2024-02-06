package com.scb.phone.view.fragment.creditcard;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.SelectPurchasesActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelLandingActivity;
import com.scb.phone.view.activity.cardmanagement.TempLimitHomeActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferLandingActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import okhttp3.internal.cache.DiskLruCache;
import p040o.EasyCashDFWYNService;
import p040o.EasycashBusinessAndMaritalInfoService;
import p040o.FirebaseAnalytics;
import p040o.FirebaseMessagingRegistrar;
import p040o.FirebaseModelInputs;
import p040o.FirebaseVision;
import p040o.FirebaseVisionBarcode;
import p040o.FirelogAnalyticsEvent;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SendException;
import p040o.SlipPlatformService;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.chain;
import p040o.ensureBackgroundStateListenerRegistered;
import p040o.getContour;
import p040o.getInitialDownloadConditions;
import p040o.getReferralProductDFWYN;
import p040o.getThirdPartySlip;
import p040o.getValueType;
import p040o.isDeviceIdleRequired;
import p040o.onGetStartedClick;
import p040o.postPrivacyConsentInquiry;
import p040o.postThirdPartySlipGenerate;
import p040o.setLastBaselineToBottomHeight;
import p040o.setResultDeserializer;
import p040o.setTapText;
import p040o.updatePrivacyConsent;
import p040o.verify;

public class SettingTabFragment extends BaseFragment implements setResultDeserializer {
    public chain IconCompatParcelizer;
    SettingTabFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private ArrayList<chain> MediaDescriptionCompat;
    @BindView
    ImageView imvDeejungInstallments;
    @BindView
    ImageView imvDeejungInstallmentsArrow;
    @BindView
    ImageView imvDeejungTransfer;
    @BindView
    ImageView imvDeejungTransferArrow;
    @BindView
    ImageView imvTempLimit;
    @BindView
    ImageView imvTempLimitArrow;
    @BindView
    ImageView ivErrorIcon;
    @BindView
    LinearLayout layoutCardError;
    @BindView
    ConstraintLayout layoutCardStatus;
    @BindView
    ViewGroup layoutDeejungInstallments;
    @BindView
    ViewGroup layoutDeejungTransfer;
    @BindView
    ViewGroup layoutEStatement;
    @BindView
    ViewGroup layoutStatementChannel;
    @BindView
    ViewGroup layoutTempLimitIncrease;
    @BindView
    LinearLayout llContentViewLayout;
    @BindView
    LinearLayout llErrorLayout;
    @HmlPinActivity
    public getContour settingTabPresenter;
    @BindView
    SwitchCompat switchCardStatus;
    @BindView
    TextView tvErrorDesc;
    @BindView
    TextView tvErrorTitle;
    @BindView
    TextView txvDeejungInstallments;
    @BindView
    TextView txvDeejungTransferLabel;
    @BindView
    TextView txvOngoingTempLimitMessage;
    @BindView
    TextView txvTempLimitIncrease;

    public static final /* synthetic */ void read(Context context, Intent intent) {
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

    public static final /* synthetic */ void write(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((SettingTabFragment) fragment).startActivityForResult(intent, 119);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static SettingTabFragment MediaBrowserCompat$CustomActionResultReceiver(chain chain, ArrayList<chain> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CREDIT_CARD_DISPLAY", chain);
        bundle.putParcelableArrayList("CREDIT_CARD_DISPLAY_LIST", arrayList);
        SettingTabFragment settingTabFragment = new SettingTabFragment();
        settingTabFragment.setArguments(bundle);
        return settingTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85962131493823, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        this.settingTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            this.IconCompatParcelizer = (chain) getArguments().getParcelable("CREDIT_CARD_DISPLAY");
            this.MediaDescriptionCompat = getArguments().getParcelableArrayList("CREDIT_CARD_DISPLAY_LIST");
            if (this.IconCompatParcelizer != null) {
                setContentView();
            }
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setContentView() {
        /*
            r7 = this;
            o.getContour r0 = r7.settingTabPresenter
            o.chain r1 = r7.IconCompatParcelizer
            java.lang.String r1 = r1.MediaDescriptionCompat
            r0.read = r1
            o.getContour r0 = r7.settingTabPresenter
            o.chain r1 = r7.IconCompatParcelizer
            java.lang.String r1 = r1.ParcelableVolumeInfo
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = -1986416409(0xffffffff8999b0e7, float:-3.699977E-33)
            if (r2 == r6) goto L_0x0038
            r6 = -1961214910(0xffffffff8b1a3c42, float:-2.9704654E-32)
            if (r2 == r6) goto L_0x002e
            r6 = 63294573(0x3c5cc6d, float:1.1625553E-36)
            if (r2 != r6) goto L_0x0042
            java.lang.String r2 = "BLOCK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0042
            r1 = r3
            goto L_0x0043
        L_0x002e:
            java.lang.String r2 = "TEMP_BLOCK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0042
            r1 = r5
            goto L_0x0043
        L_0x0038:
            java.lang.String r2 = "NORMAL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0042
            r1 = r4
            goto L_0x0043
        L_0x0042:
            r1 = -1
        L_0x0043:
            if (r1 == 0) goto L_0x007c
            if (r1 == r5) goto L_0x006b
            if (r1 == r3) goto L_0x005a
            o.isModelUpdatesEnabled r1 = p040o.isModelUpdatesEnabled.MediaBrowserCompat$CustomActionResultReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0051
            r2 = r5
            goto L_0x0052
        L_0x0051:
            r2 = r4
        L_0x0052:
            if (r2 == 0) goto L_0x008c
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x008c
        L_0x005a:
            o.isModelUpdatesEnabled r1 = p040o.isModelUpdatesEnabled.MediaBrowserCompat$CustomActionResultReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0062
            r2 = r5
            goto L_0x0063
        L_0x0062:
            r2 = r4
        L_0x0063:
            if (r2 == 0) goto L_0x008c
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x008c
        L_0x006b:
            o.FirebaseMessagingService r1 = p040o.FirebaseMessagingService.IconCompatParcelizer
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0073
            r2 = r5
            goto L_0x0074
        L_0x0073:
            r2 = r4
        L_0x0074:
            if (r2 == 0) goto L_0x008c
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x008c
        L_0x007c:
            o.schedule r1 = p040o.C5256schedule.MediaBrowserCompat$ItemReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0084
            r2 = r5
            goto L_0x0085
        L_0x0084:
            r2 = r4
        L_0x0085:
            if (r2 == 0) goto L_0x008c
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x008c:
            o.getContour r0 = r7.settingTabPresenter
            o.chain r1 = r7.IconCompatParcelizer
            o.FirebaseLocalModel$Builder r2 = new o.FirebaseLocalModel$Builder
            r2.<init>(r1)
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x009b
            r1 = r5
            goto L_0x009c
        L_0x009b:
            r1 = r4
        L_0x009c:
            if (r1 == 0) goto L_0x00a3
            T r0 = r0.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x00a3:
            android.view.ViewGroup r0 = r7.layoutTempLimitIncrease
            r1 = 8
            if (r0 == 0) goto L_0x00ac
            r0.setVisibility(r1)
        L_0x00ac:
            android.view.ViewGroup r0 = r7.layoutDeejungInstallments
            if (r0 == 0) goto L_0x00b3
            r0.setVisibility(r1)
        L_0x00b3:
            android.view.ViewGroup r0 = r7.layoutDeejungTransfer
            if (r0 == 0) goto L_0x00ba
            r0.setVisibility(r1)
        L_0x00ba:
            o.getContour r0 = r7.settingTabPresenter
            o.chain r1 = r7.IconCompatParcelizer
            o.onMessageSent r2 = new o.onMessageSent
            r2.<init>(r0, r1)
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x00c9
            r3 = r5
            goto L_0x00ca
        L_0x00c9:
            r3 = r4
        L_0x00ca:
            if (r3 == 0) goto L_0x00d1
            T r3 = r0.RatingCompat
            r2.IconCompatParcelizer(r3)
        L_0x00d1:
            o.onDeletedMessages r2 = new o.onDeletedMessages
            r2.<init>(r1)
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x00dc
            r3 = r5
            goto L_0x00dd
        L_0x00dc:
            r3 = r4
        L_0x00dd:
            if (r3 == 0) goto L_0x00e4
            T r3 = r0.RatingCompat
            r2.IconCompatParcelizer(r3)
        L_0x00e4:
            o.onNewToken r2 = new o.onNewToken
            r2.<init>(r1)
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x00ef
            r3 = r5
            goto L_0x00f0
        L_0x00ef:
            r3 = r4
        L_0x00f0:
            if (r3 == 0) goto L_0x00f7
            T r3 = r0.RatingCompat
            r2.IconCompatParcelizer(r3)
        L_0x00f7:
            o.isChargingRequired r2 = new o.isChargingRequired
            r2.<init>(r1)
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x0102
            r3 = r5
            goto L_0x0103
        L_0x0102:
            r3 = r4
        L_0x0103:
            if (r3 == 0) goto L_0x010a
            T r3 = r0.RatingCompat
            r2.IconCompatParcelizer(r3)
        L_0x010a:
            o.getAssetFilePath r2 = new o.getAssetFilePath
            r2.<init>(r1)
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x0114
            r4 = r5
        L_0x0114:
            if (r4 == 0) goto L_0x011b
            T r0 = r0.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.creditcard.SettingTabFragment.setContentView():void");
    }

    public final void read(boolean z) {
        this.switchCardStatus.setChecked(z);
        this.layoutCardError.setVisibility(8);
        this.layoutCardStatus.setVisibility(0);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo36739x50fd9e4a() {
        this.layoutCardError.setVisibility(0);
        this.layoutCardStatus.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @OnCheckedChanged
    public void onTempBlockToggleChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            boolean z2 = true;
            compoundButton.setChecked(!z);
            getContour getcontour = this.settingTabPresenter;
            SendException sendException = new SendException(this.IconCompatParcelizer.ParcelableVolumeInfo, this.IconCompatParcelizer.ActionBarContainer);
            if (getcontour.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                sendException.IconCompatParcelizer(getcontour.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.switchCardStatus.setChecked(z);
        SettingTabFragment$MediaBrowserCompat$ItemReceiver settingTabFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (settingTabFragment$MediaBrowserCompat$ItemReceiver == null) {
            return;
        }
        if (z) {
            settingTabFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem();
        } else {
            settingTabFragment$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat();
        }
    }

    public final void write(String str, String str2) {
        if ("NORMAL".equals(str)) {
            if ("".equals(str2)) {
                write(IconCompatParcelizer(getString(R.string.templock_title), getString(R.string.templock_primary_user_message), getString(R.string.lock), getString(R.string.cancel), this.switchCardStatus.isChecked()));
            } else if ("S".equals(str2)) {
                write(IconCompatParcelizer(getString(R.string.templock_title), getString(R.string.templock_supplementary_message), getString(R.string.lock_real_supplementary), getString(R.string.cancel_real_supplementary_and_unlock), this.switchCardStatus.isChecked()));
            }
        } else if ("TEMP_BLOCK".equals(str)) {
            write(IconCompatParcelizer(getString(R.string.temp_unlock_primary_title), getString(R.string.temp_unlock_primary_message), getString(R.string.unlock), getString(R.string.cancel_real_supplementary_and_unlock), this.switchCardStatus.isChecked()));
        }
    }

    public final void RatingCompat(boolean z) {
        ViewGroup viewGroup = this.layoutTempLimitIncrease;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void handleClickOfDeejungInstallments() {
        String str;
        getContour getcontour = this.settingTabPresenter;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = getcontour.write.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            str = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = null;
        }
        boolean z = true;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1)) {
            getValueType getvaluetype = getValueType.read;
            if (getcontour.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getvaluetype.IconCompatParcelizer(getcontour.RatingCompat);
                return;
            }
            return;
        }
        isDeviceIdleRequired isdeviceidlerequired = new isDeviceIdleRequired(getcontour);
        if (getcontour.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isdeviceidlerequired.IconCompatParcelizer(getcontour.RatingCompat);
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent read = SelectPurchasesActivity.read(getActivity(), this.IconCompatParcelizer);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 112);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(setResultDeserializer.write write) {
        FragmentActivity activity;
        getThirdPartySlip getthirdpartyslip = new getThirdPartySlip(write);
        if (isAdded() && (activity = getActivity()) != null) {
            getthirdpartyslip.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setResultDeserializer.write write, Context context) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(context).MediaBrowserCompat$ItemReceiver((int) R.string.unable_to_proceed_error_title).IconCompatParcelizer((int) R.string.ccr_email_verification_body_e_statement);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ccr_email_verification_cancel_btn), new EasycashBusinessAndMaritalInfoService(write));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ccr_email_verification_ok_btn_e_statement), new verify(write)).show();
    }

    public static /* synthetic */ void IconCompatParcelizer(int i, setResultDeserializer.write write, Context context) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(context).MediaBrowserCompat$ItemReceiver((int) R.string.ccr_email_verification_title).IconCompatParcelizer(i);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ccr_email_verification_cancel_btn), new EasyCashDFWYNService(write));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ccr_email_verification_ok_btn), new postPrivacyConsentInquiry(write)).show();
    }

    public final void write() {
        FragmentActivity activity;
        updatePrivacyConsent updateprivacyconsent = new updatePrivacyConsent(this);
        if (isAdded() && (activity = getActivity()) != null) {
            updateprivacyconsent.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public final void MediaSessionCompat$Token() {
        FragmentActivity activity;
        getReferralProductDFWYN getreferralproductdfwyn = new getReferralProductDFWYN(this);
        if (isAdded() && (activity = getActivity()) != null) {
            getreferralproductdfwyn.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public final void read(ensureBackgroundStateListenerRegistered ensurebackgroundstatelistenerregistered) {
        Intent MediaBrowserCompat$ItemReceiver = TempLimitHomeActivity.MediaBrowserCompat$ItemReceiver(getActivity(), this.IconCompatParcelizer, ensurebackgroundstatelistenerregistered);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.txvTempLimitIncrease.setEnabled(z);
        this.layoutTempLimitIncrease.setEnabled(z);
        if (z) {
            TextView textView = this.txvTempLimitIncrease;
            ImageView imageView = this.imvTempLimit;
            ImageView imageView2 = this.imvTempLimitArrow;
            textView.setTextColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f66092131099764));
            imageView.setAlpha(1.0f);
            imageView2.clearColorFilter();
            return;
        }
        IconCompatParcelizer(this.txvTempLimitIncrease, this.imvTempLimit, this.imvTempLimitArrow);
    }

    private access$2200 IconCompatParcelizer(String str, String str2, String str3, String str4, boolean z) {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = str;
        access_2200.IconCompatParcelizer = str2;
        access$2300 access_2300 = new access$2300();
        SlipPlatformService slipPlatformService = new SlipPlatformService(this, z);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = slipPlatformService;
        access_2300.MediaBrowserCompat$ItemReceiver = str3;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        access$2300 access_23002 = new access$2300();
        access_23002.read = access$2300.write.JUST_DISMISS;
        access_23002.MediaBrowserCompat$ItemReceiver = str4;
        access_2200.write = access_23002;
        return access_2200;
    }

    public final void AppCompatDialogFragment() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.unable_to_proceed_error_title);
        access_2200.IconCompatParcelizer = getString(R.string.non_pre_approved_error_message);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        this.layoutTempLimitIncrease.setEnabled(false);
        TextView textView = this.txvTempLimitIncrease;
        ImageView imageView = this.imvTempLimit;
        ImageView imageView2 = this.imvTempLimitArrow;
        textView.setTextColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f66092131099764));
        imageView.setAlpha(1.0f);
        imageView2.clearColorFilter();
        this.txvOngoingTempLimitMessage.setText(String.format(getResources().getString(R.string.ongoing_temp_limit_message), new Object[]{str, str2}));
        this.imvTempLimitArrow.setVisibility(8);
        this.txvOngoingTempLimitMessage.setVisibility(0);
    }

    public final void read() {
        this.imvTempLimitArrow.setVisibility(0);
        this.txvOngoingTempLimitMessage.setVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (101 == i && i2 == 104) {
            getContour getcontour = this.settingTabPresenter;
            getcontour.IconCompatParcelizer.write.write();
            getInitialDownloadConditions getinitialdownloadconditions = getInitialDownloadConditions.MediaBrowserCompat$ItemReceiver;
            if (getcontour.RatingCompat != null) {
                getinitialdownloadconditions.IconCompatParcelizer(getcontour.RatingCompat);
            }
        }
    }

    public final void MediaDescriptionCompat() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
    }

    public final void MediaBrowserCompat$SearchResultReceiver(boolean z) {
        ViewGroup viewGroup = this.layoutDeejungInstallments;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        }
    }

    public final void write(boolean z) {
        this.txvDeejungInstallments.setEnabled(z);
        this.layoutDeejungInstallments.setEnabled(z);
        if (z) {
            TextView textView = this.txvDeejungInstallments;
            ImageView imageView = this.imvDeejungInstallments;
            ImageView imageView2 = this.imvDeejungInstallmentsArrow;
            textView.setTextColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f66092131099764));
            imageView.setAlpha(1.0f);
            imageView2.clearColorFilter();
            return;
        }
        IconCompatParcelizer(this.txvDeejungInstallments, this.imvDeejungInstallments, this.imvDeejungInstallmentsArrow);
    }

    public final void MediaBrowserCompat$MediaItem(boolean z) {
        ViewGroup viewGroup = this.layoutDeejungTransfer;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.txvDeejungTransferLabel.setEnabled(z);
        this.layoutDeejungTransfer.setEnabled(z);
        if (z) {
            TextView textView = this.txvDeejungTransferLabel;
            ImageView imageView = this.imvDeejungTransfer;
            ImageView imageView2 = this.imvDeejungTransferArrow;
            textView.setTextColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f66092131099764));
            imageView.setAlpha(1.0f);
            imageView2.clearColorFilter();
            return;
        }
        IconCompatParcelizer(this.txvDeejungTransferLabel, this.imvDeejungTransfer, this.imvDeejungTransferArrow);
    }

    public final void MediaDescriptionCompat(boolean z) {
        this.layoutEStatement.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void handleClickOfDeejungTransfer() {
        String str;
        getContour getcontour = this.settingTabPresenter;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = getcontour.write.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            str = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1)) {
            getcontour.IconCompatParcelizer();
            return;
        }
        FirelogAnalyticsEvent.zzc zzc = new FirelogAnalyticsEvent.zzc(getcontour);
        if (getcontour.RatingCompat != null) {
            zzc.IconCompatParcelizer(getcontour.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void handleClickingOfEStatement() {
        String str;
        getContour getcontour = this.settingTabPresenter;
        FirebaseVision firebaseVision = FirebaseVision.IconCompatParcelizer;
        boolean z = true;
        if (getcontour.RatingCompat != null) {
            firebaseVision.IconCompatParcelizer(getcontour.RatingCompat);
        }
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = getcontour.write.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            str = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1)) {
            FirebaseVisionBarcode firebaseVisionBarcode = FirebaseVisionBarcode.write;
            if (getcontour.RatingCompat == null) {
                z = false;
            }
            if (z) {
                firebaseVisionBarcode.IconCompatParcelizer(getcontour.RatingCompat);
                return;
            }
            return;
        }
        FirelogAnalyticsEvent.zza zza = new FirelogAnalyticsEvent.zza(getcontour);
        if (getcontour.RatingCompat == null) {
            z = false;
        }
        if (z) {
            zza.IconCompatParcelizer(getcontour.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void handleClickingOfStatementChannel() {
        getContour getcontour = this.settingTabPresenter;
        FirebaseModelInputs firebaseModelInputs = FirebaseModelInputs.write;
        if (getcontour.RatingCompat != null) {
            firebaseModelInputs.IconCompatParcelizer(getcontour.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(FirebaseAnalytics firebaseAnalytics) {
        Intent read = DeejungTransferLandingActivity.read(getActivity(), this.IconCompatParcelizer, firebaseAnalytics);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void IconCompatParcelizer(TextView textView, ImageView imageView, ImageView imageView2) {
        int read = setLastBaselineToBottomHeight.read(getActivity(), R.color.f66112131099766);
        textView.setTextColor(read);
        imageView.setAlpha(0.4f);
        imageView2.setColorFilter(read, PorterDuff.Mode.MULTIPLY);
    }

    public void onDestroy() {
        this.settingTabPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaMetadataCompat(boolean z) {
        this.layoutStatementChannel.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = StatementChannelLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity(), this.IconCompatParcelizer, this.MediaDescriptionCompat);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.ivErrorIcon.setImageResource(R.drawable.box_empty);
        this.tvErrorTitle.setText(R.string.auto_cc_detail_no_result_title);
        this.tvErrorDesc.setText(R.string.auto_cc_detail_no_result_desc);
        this.llErrorLayout.setVisibility(0);
        this.llContentViewLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.llErrorLayout.setVisibility(8);
        this.llContentViewLayout.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTempLimitIncreaseClick() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("cardmgmt_temp_limit");
        }
        getContour getcontour = this.settingTabPresenter;
        FirebaseMessagingRegistrar firebaseMessagingRegistrar = FirebaseMessagingRegistrar.IconCompatParcelizer;
        if (getcontour.RatingCompat != null) {
            firebaseMessagingRegistrar.IconCompatParcelizer(getcontour.RatingCompat);
        }
        getcontour.IconCompatParcelizer.write(getcontour.read);
        getcontour.IconCompatParcelizer.IconCompatParcelizer(new getContour.IconCompatParcelizer(getcontour, (byte) 0));
    }

    public final void MediaMetadataCompat() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("deejung_transfer_popup_notnow", zsyr2kArr);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("deejung_transfer_popup_verify", zsyr2kArr);
        }
    }

    public final void RatingCompat() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("requestccstmt_popup_notnow", zsyr2kArr);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("requestccstmt", zsyr2kArr);
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("requestccstmt_popup_verify", zsyr2kArr);
        }
    }

    public final void write(setResultDeserializer.write write) {
        FragmentActivity activity;
        postThirdPartySlipGenerate postthirdpartyslipgenerate = new postThirdPartySlipGenerate(R.string.ccr_email_verification_body, write);
        if (isAdded() && (activity = getActivity()) != null) {
            postthirdpartyslipgenerate.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public final void IconCompatParcelizer(setResultDeserializer.write write) {
        FragmentActivity activity;
        postThirdPartySlipGenerate postthirdpartyslipgenerate = new postThirdPartySlipGenerate(R.string.ccr_email_verification_body_deejung_transfer, write);
        if (isAdded() && (activity = getActivity()) != null) {
            postthirdpartyslipgenerate.MediaBrowserCompat$ItemReceiver(activity);
        }
    }
}
