package com.scb.phone.view.fragment.easycash;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.activity.easycash.NTBEasycashLandingActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.InputText;
import com.scb.phone.view.custom.easycash.CustomEmail;
import com.scb.phone.view.custom.easycash.CustomPhone;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.easycash.EasycashSuccessDialogFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.concurrent.TimeUnit;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BarCodeReader;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10889validateOtp;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.GpuDocumentDetector_Factory;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.ICheckDetector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidActivationService;
import p040o.forEachClear;
import p040o.getDocuments;
import p040o.getDocumentsWithDeepLink;
import p040o.getEkycMethods;
import p040o.getIdentifySetup;
import p040o.setAllowCollapse;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.submitResubmission;
import p040o.updateOccupation;

public abstract class BaseEasycashReferralSendFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.ParcelableVolumeInfo, EasycashSuccessDialogFragment.read {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    public ICheckDetector MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected AmountEditText amountEditText;
    @BindView
    protected DefaultButton buttonSend;
    @BindView
    protected CustomEmail emailEditText;
    @BindView
    protected TextInputLayout errorAmount;
    @BindView
    protected TextView headerInfo;
    @BindView
    protected InputText loansDetails;
    @BindView
    protected TextView name;
    @BindView
    protected CustomPhone phoneEditText;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected TextView textRemainingLimit;
    @BindView
    protected TextView titleName;
    @HmlPinActivity
    public forEachClear tracker;
    @BindView
    protected TextView tvPrivacyNotice;
    @BindView
    protected View vPrivacyNotice;

    public abstract void MediaSessionCompat$ResultReceiverWrapper();

    public static final /* synthetic */ void read(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((BaseEasycashReferralSendFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$CustomActionResultReceiver.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
    }

    public void IconCompatParcelizer(CrashlyticsBackgroundWorker.C32131 r12) {
        this.name.setText(r12.MediaBrowserCompat$ItemReceiver);
        this.phoneEditText.setNecessaryInfo(r12.RatingCompat, getString(R.string.easycash_invalid_format), new getEkycMethods(this));
        this.emailEditText.setNecessaryInfo(r12.read, getString(R.string.easycash_invalid_format), new getIdentifySetup(this));
        this.IconCompatParcelizer = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new updateOccupation(this), C10889validateOtp.MediaBrowserCompat$ItemReceiver);
        AmountEditText amountEditText2 = this.amountEditText;
        amountEditText2.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText2, this.errorAmount, 9.9999999999E8d, r12.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), getResources().getString(R.string.easycash_invalid_amount), (String) null, getResources().getString(R.string.easycash_invalid_amount_transfer_input)));
        this.amountEditText.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
    }

    public final void write(CrashlyticsBackgroundWorker.C32142 r3) {
        this.tvPrivacyNotice.setText(setAllowCollapse.write(r3.IconCompatParcelizer, 0));
        this.tvPrivacyNotice.setMovementMethod(new PrepaidActivationService(new getDocuments(this)));
    }

    public final void RatingCompat() {
        this.vPrivacyNotice.setVisibility(8);
    }

    public final void MediaDescriptionCompat() {
        this.buttonSend.setButtonEnabled(false);
    }

    public final void read() {
        this.amountEditText.setHandleDismissKeyboard(new submitResubmission(this));
    }

    public final void aH_() {
        DefaultButton defaultButton = this.buttonSend;
        defaultButton.setButtonEnabled(!defaultButton.isEnabled());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r1 != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        /*
            r5 = this;
            o.forEachClear r0 = r5.tracker
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0015
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            com.scb.phone.view.activity.BaseActivity r1 = (com.scb.phone.view.activity.BaseActivity) r1
            o.getKernelIDDst r1 = r1.scbAnalytics
            java.lang.String r2 = "apply_loan_referral_confirmation"
            r0.MediaBrowserCompat$ItemReceiver(r1, r2)
        L_0x0015:
            o.serializeEvent$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.serializeEvent$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>()
            r1 = 2131757230(0x7f1008ae, float:1.914539E38)
            java.lang.String r1 = r5.getString(r1)
            r0.read = r1
            o.ICheckDetector r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.getStartFinalizer r2 = r1.MediaDescriptionCompat
            o.ServerProjectProvider$15 r2 = r2.write
            o.setBearing r2 = r2.read()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0033
            r2 = r3
            goto L_0x0034
        L_0x0033:
            r2 = r4
        L_0x0034:
            if (r2 != 0) goto L_0x0059
            o.CameraSource$ShutterCallback r1 = r1.IconCompatParcelizer
            o.getFrontException r2 = r1.MediaBrowserCompat$ItemReceiver
            o.zzwi r2 = r2.write()
            if (r2 == 0) goto L_0x0055
            o.getFrontException r2 = r1.MediaBrowserCompat$ItemReceiver
            o.zzwi r2 = r2.write()
            o.PlaceFilter$zzb r2 = r2.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == 0) goto L_0x0055
            o.getFrontException r1 = r1.MediaBrowserCompat$ItemReceiver
            o.zzwi r1 = r1.write()
            o.PlaceFilter$zzb r1 = r1.MediaSessionCompat$ResultReceiverWrapper
            boolean r1 = r1.MediaBrowserCompat$ItemReceiver
            goto L_0x0056
        L_0x0055:
            r1 = r4
        L_0x0056:
            if (r1 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = r4
        L_0x005a:
            if (r3 == 0) goto L_0x0064
            r1 = 2131757229(0x7f1008ad, float:1.9145388E38)
            java.lang.String r1 = r5.getString(r1)
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            r0.MediaBrowserCompat$ItemReceiver = r1
            r1 = 2131757239(0x7f1008b7, float:1.9145408E38)
            java.lang.String r1 = r5.getString(r1)
            r0.IconCompatParcelizer = r1
            r1 = 2131757233(0x7f1008b1, float:1.9145396E38)
            java.lang.String r1 = r5.getString(r1)
            r0.write = r1
            o.serializeEvent r1 = new o.serializeEvent
            r1.<init>(r0, r4)
            com.scb.phone.view.fragment.easycash.EasycashSuccessDialogFragment r0 = com.scb.phone.view.fragment.easycash.EasycashSuccessDialogFragment.write(r1)
            o.setTitleMarginStart r1 = r5.getChildFragmentManager()
            o.CardView r1 = r1.read()
            java.lang.String r2 = "referral_dialog"
            r0.show((p040o.CardView) r1, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.BaseEasycashReferralSendFragment.MediaBrowserCompat$SearchResultReceiver():void");
    }

    public void IconCompatParcelizer() {
        this.loansDetails.setOnInputChangeListener(new getDocumentsWithDeepLink(this));
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.loansDetails.read(getResources().getString(R.string.favorite_invalid_character));
    }

    public final void MediaMetadataCompat() {
        InputText inputText = this.loansDetails;
        inputText.errorText.setVisibility(8);
        inputText.inputEditText.setBackground(setLastBaselineToBottomHeight.write(inputText.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getContext(), PinLoginActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14259x50fd9e4a() {
        ICheckDetector iCheckDetector = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (iCheckDetector.MediaDescriptionCompat.write.read() != null) {
            GpuDocumentDetector_Factory gpuDocumentDetector_Factory = GpuDocumentDetector_Factory.MediaBrowserCompat$ItemReceiver;
            if (iCheckDetector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gpuDocumentDetector_Factory.IconCompatParcelizer(iCheckDetector.RatingCompat);
                return;
            }
            return;
        }
        BarCodeReader.Symbology symbology = BarCodeReader.Symbology.read;
        if (iCheckDetector.RatingCompat == null) {
            z = false;
        }
        if (z) {
            symbology.IconCompatParcelizer(iCheckDetector.RatingCompat);
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        Intent write = EasycashCreditPowerInputActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }

    public final void write() {
        NTBEasycashLandingActivity.MediaBrowserCompat$ItemReceiver(getContext());
    }
}
