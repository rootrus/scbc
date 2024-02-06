package com.scb.phone.view.fragment.purchase;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentReviewActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpReviewActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_ContributeMwCurrentUserEwalletActivity;
import p040o.ActivityBuilder_ContributeMwEditCreateQrActivity;
import p040o.ActivityBuilder_ContributeMwLandingActivity;
import p040o.ActivityBuilder_ContributeMwManageWalletActivity;
import p040o.ActivityBuilder_ContributeMwOnBoardSuccessActivity;
import p040o.ActivityBuilder_ContributeMwOnboardInfoActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4853jO;
import p040o.C4895kb;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaFragment;
import p040o.animateCameraWithCallback;
import p040o.getCarbonStrip;
import p040o.getEasycashIntroductions;
import p040o.getICheckDeserializerRtti;
import p040o.parseEventLog;
import p040o.parseEventSignal;
import p040o.parseReport;
import p040o.putInstance;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class PurchaseDepositInputFragment extends BaseFragment implements getCarbonStrip.IconCompatParcelizer {
    private double IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private getEasycashIntroductions MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private FragmentBuilder_BindEasycashContactInformationFragment MediaMetadataCompat;
    private CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder RatingCompat;
    @BindView
    protected LinearLayout billDetail;
    @BindView
    protected DefaultButton buttonReview;
    @BindView
    protected TextView contactAccount;
    @BindView
    protected TextView contactAccountNumber;
    @BindView
    protected AmountEditText editAmount;
    @BindView
    protected ImageView imageIcon;
    @BindView
    LinearLayout inputContent;
    @BindView
    protected TextInputLayout inputLayout;
    @BindView
    protected TextView invoiceAccount;
    @BindView
    protected TextView invoiceAccountNumber;
    @BindView
    protected RecyclerView mRecyclerView;
    @BindView
    protected NoteEditText noteEditText;
    @HmlPinActivity
    public C4895kb purchaseDepositInputPresenter;
    @BindView
    protected TextView refThreeId;
    @BindView
    protected TextView refThreeLabel;
    @BindView
    protected LinearLayout refThreeLayout;
    @BindView
    protected LinearLayout refTwoLayout;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected TextView textNumber;
    @BindView
    protected TextView textRemainingLimit;
    @BindView
    protected TextView textTitle;

    private static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Intent intent) {
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
            ((PurchaseDepositInputFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static PurchaseDepositInputFragment MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN", builder);
        PurchaseDepositInputFragment purchaseDepositInputFragment = new PurchaseDepositInputFragment();
        purchaseDepositInputFragment.setArguments(bundle);
        return purchaseDepositInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder;
        animateCameraWithCallback animatecamerawithcallback;
        View inflate = layoutInflater.inflate(R.layout.f89142131494141, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN") == null)) {
            this.RatingCompat = (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN");
        }
        C4895kb kbVar = this.purchaseDepositInputPresenter;
        kbVar.MediaDescriptionCompat = this.RatingCompat;
        boolean z = true;
        if ((kbVar.RatingCompat != null) && (builder = kbVar.MediaDescriptionCompat) != null) {
            kbVar.write = builder.MediaBrowserCompat$ItemReceiver;
            String str = kbVar.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 79006) {
                if (hashCode != 79440) {
                    if (hashCode == 79564 && str.equals("PTP")) {
                        c = 2;
                    }
                } else if (str.equals("PPP")) {
                    c = 0;
                }
            } else if (str.equals("PBP")) {
                c = 1;
            }
            if (c == 0) {
                int i = kbVar.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.length() != 13 ? 10 : 13;
                if (i == 13) {
                    animatecamerawithcallback = animateCameraWithCallback.CID;
                } else {
                    animatecamerawithcallback = animateCameraWithCallback.MOB;
                }
                int i2 = getICheckDeserializerRtti.C13363.MediaBrowserCompat$CustomActionResultReceiver[animatecamerawithcallback.ordinal()];
                C4853jO jOVar = new C4853jO(kbVar, getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(i2 != 1 ? i2 != 2 ? "" : "MOB" : "CID", kbVar.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver), i);
                if (kbVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    jOVar.IconCompatParcelizer(kbVar.RatingCompat);
                }
                kbVar.write("TRANSFER");
            } else if (c == 1 || c == 2) {
                if (kbVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kbVar.RatingCompat.Keep();
                }
            }
        }
        this.buttonReview.setButtonEnabled(false);
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = new FragmentBuilder_BindEasycashContactInformationFragment(this.editAmount, this.inputLayout, 9.9999999999E8d, 9.9999999999E8d, 0.0d, getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.invalid_amount_transfer_input));
        this.MediaMetadataCompat = fragmentBuilder_BindEasycashContactInformationFragment;
        this.editAmount.setCurrencyFormattingTextWatcher(fragmentBuilder_BindEasycashContactInformationFragment);
        this.editAmount.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                PurchaseDepositInputFragment.read(PurchaseDepositInputFragment.this, d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                PurchaseDepositInputFragment.this.MediaBrowserCompat$SearchResultReceiver();
                PurchaseDepositInputFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        return inflate;
    }

    public final void read(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver = builder;
        this.buttonReview.setButtonEnabled(this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver(this.editAmount.getText().toString()));
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.MediaMetadataCompat;
        if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
            fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        double d = this.IconCompatParcelizer;
        if (d == 0.0d) {
            this.inputLayout.setError(getString(R.string.edit_favourite_empty));
            this.inputLayout.setErrorEnabled(true);
            this.buttonReview.setButtonEnabled(false);
            return;
        }
        if (d > this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue()) {
            this.inputLayout.setError(getString(R.string.not_enough_funds_on_selected_account));
            this.inputLayout.setErrorEnabled(true);
            this.buttonReview.setButtonEnabled(false);
            return;
        }
        this.inputLayout.setError((CharSequence) null);
        this.inputLayout.setErrorEnabled(false);
        this.buttonReview.setButtonEnabled(this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver(this.editAmount.getText().toString()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReviewButtonClick() {
        /*
            r14 = this;
            o.kb r0 = r14.purchaseDepositInputPresenter
            com.scb.phone.view.custom.common.NoteEditText r1 = r14.noteEditText
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            T r2 = r0.RatingCompat
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0016
            r2 = r4
            goto L_0x0017
        L_0x0016:
            r2 = r3
        L_0x0017:
            if (r2 == 0) goto L_0x0042
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0040
            o.jG r1 = p040o.C10022jG.MediaBrowserCompat$CustomActionResultReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0037
            r2 = r4
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            if (r2 == 0) goto L_0x0042
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x0042
        L_0x0040:
            r0 = r4
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            if (r0 == 0) goto L_0x022e
            r14.PlaybackStateCompat$CustomAction()
            r14.AlertController$RecycleListView()
            com.scb.phone.view.custom.common.AmountEditText r0 = r14.editAmount
            android.text.Editable r0 = r0.getText()
            r1 = -1
            if (r0 != 0) goto L_0x005d
            o.getEasycashIntroductions r0 = r14.MediaBrowserCompat$SearchResultReceiver
            int r0 = r0.write()
            if (r0 != r1) goto L_0x005d
            return
        L_0x005d:
            boolean r0 = r14.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0068
            o.getEasycashIntroductions r0 = r14.MediaBrowserCompat$SearchResultReceiver
            java.lang.Double r0 = r0.MediaBrowserCompat$ItemReceiver()
            goto L_0x0076
        L_0x0068:
            com.scb.phone.view.custom.common.AmountEditText r0 = r14.editAmount
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.Double r0 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r0)
        L_0x0076:
            double r5 = r0.doubleValue()
            r14.IconCompatParcelizer = r5
            o.kb r8 = r14.purchaseDepositInputPresenter
            java.lang.String r11 = r14.MediaDescriptionCompat
            com.scb.phone.view.custom.common.NoteEditText r0 = r14.noteEditText
            android.widget.EditText r0 = r0.mNoteEditText
            android.text.Editable r0 = r0.getText()
            java.lang.String r12 = r0.toString()
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r0 = r8.MediaDescriptionCompat
            java.lang.String r0 = r0.MediaBrowserCompat$SearchResultReceiver
            int r2 = r0.hashCode()
            r7 = 79006(0x1349e, float:1.10711E-40)
            r9 = 2
            if (r2 == r7) goto L_0x00b8
            r7 = 79440(0x13650, float:1.11319E-40)
            if (r2 == r7) goto L_0x00ae
            r7 = 79564(0x136cc, float:1.11493E-40)
            if (r2 != r7) goto L_0x00c1
            java.lang.String r2 = "PTP"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c1
            r1 = r9
            goto L_0x00c1
        L_0x00ae:
            java.lang.String r2 = "PPP"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c1
            r1 = r3
            goto L_0x00c1
        L_0x00b8:
            java.lang.String r2 = "PBP"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c1
            r1 = r4
        L_0x00c1:
            r0 = 0
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x01a8
            if (r1 == r4) goto L_0x0123
            if (r1 != r9) goto L_0x022e
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x00d0
            r0 = r4
            goto L_0x00d1
        L_0x00d0:
            r0 = r3
        L_0x00d1:
            if (r0 == 0) goto L_0x0122
            o.jZ r0 = p040o.C4864jZ.MediaBrowserCompat$ItemReceiver
            T r1 = r8.RatingCompat
            if (r1 == 0) goto L_0x00da
            r3 = r4
        L_0x00da:
            if (r3 == 0) goto L_0x00e1
            T r1 = r8.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x00e1:
            o.AbstractService r0 = r8.MediaBrowserCompat$MediaItem
            o.setZoomControlsEnabled r1 = r8.MediaBrowserCompat$SearchResultReceiver
            o.parseEventSignal r0 = r0.IconCompatParcelizer(r1)
            o.consumingIterable r1 = p040o.consumingIterable.MediaBrowserCompat$CustomActionResultReceiver()
            o.CrashlyticsReport$FilesPayload$File$Builder r2 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = r2.MediaSessionCompat$Token
            r1.MediaBrowserCompat$CustomActionResultReceiver = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaMetadataCompat
            r1.MediaDescriptionCompat = r2
            java.lang.String r2 = p040o.removeIfFromRandomAccessList.read((double) r5)
            r1.MediaBrowserCompat$ItemReceiver = r2
            java.lang.String r2 = "TOPUP"
            r1.IconCompatParcelizer = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            int r2 = java.lang.Integer.parseInt(r2)
            r1.read = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaBrowserCompat$MediaItem
            r1.RatingCompat = r2
            o.getAppIdOrigin r2 = r8.MediaMetadataCompat
            r2.write(r1)
            o.getAppIdOrigin r1 = r8.MediaMetadataCompat
            o.kb$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.kb$MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r8, r0)
            r1.IconCompatParcelizer(r2)
        L_0x0122:
            return
        L_0x0123:
            T r1 = r8.RatingCompat
            if (r1 == 0) goto L_0x0129
            r1 = r4
            goto L_0x012a
        L_0x0129:
            r1 = r3
        L_0x012a:
            if (r1 == 0) goto L_0x01a7
            o.jZ r1 = p040o.C4864jZ.MediaBrowserCompat$ItemReceiver
            T r7 = r8.RatingCompat
            if (r7 == 0) goto L_0x0134
            r7 = r4
            goto L_0x0135
        L_0x0134:
            r7 = r3
        L_0x0135:
            if (r7 == 0) goto L_0x013c
            T r7 = r8.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x013c:
            o.putInstance r1 = p040o.putInstance.IconCompatParcelizer()
            o.CrashlyticsReport$FilesPayload$File$Builder r7 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.String r7 = r7.MediaSessionCompat$Token
            r1.MediaBrowserCompat$ItemReceiver = r7
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r7 = r8.MediaDescriptionCompat
            java.lang.String r7 = r7.MediaBrowserCompat$ItemReceiver
            r1.MediaBrowserCompat$CustomActionResultReceiver = r7
            java.lang.String r5 = p040o.removeIfFromRandomAccessList.read((double) r5)
            r1.IconCompatParcelizer = r5
            o.StreetViewPanoramaFragment$zzb r5 = p040o.StreetViewPanoramaFragment.zzb.SCAN
            java.lang.String r5 = p040o.putInstance.MediaBrowserCompat$CustomActionResultReceiver(r5)
            r1.MediaSessionCompat$ResultReceiverWrapper = r5
            r1.MediaBrowserCompat$SearchResultReceiver = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r5 = r8.MediaDescriptionCompat
            java.lang.String r5 = r5.MediaMetadataCompat
            if (r5 != 0) goto L_0x0163
            r5 = r2
        L_0x0163:
            r1.MediaSessionCompat$Token = r5
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r5 = r8.MediaDescriptionCompat
            java.lang.String r5 = r5.RatingCompat
            if (r5 != 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r5
        L_0x016d:
            r1.f2924x50fd9e4a = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaDescriptionCompat
            r1.AlertController$RecycleListView = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaBrowserCompat$MediaItem
            r1.Keep = r2
            if (r12 == 0) goto L_0x0184
            int r2 = r12.length()
            if (r2 == 0) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r3 = r4
        L_0x0185:
            if (r3 == 0) goto L_0x0188
            r12 = r0
        L_0x0188:
            o.paddedPartition<java.lang.String> r0 = r1.write
            r0.MediaBrowserCompat$ItemReceiver = r12
            o.include r0 = r8.IconCompatParcelizer
            r0.MediaBrowserCompat$ItemReceiver((p040o.putInstance) r1)
            o.include r0 = r8.IconCompatParcelizer
            o.kb$write r1 = new o.kb$write
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaMetadataCompat
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r3 = r8.MediaDescriptionCompat
            java.lang.String r3 = r3.RatingCompat
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r4 = r8.MediaDescriptionCompat
            java.lang.String r4 = r4.MediaDescriptionCompat
            r1.<init>(r2, r3, r4)
            r0.IconCompatParcelizer(r1)
        L_0x01a7:
            return
        L_0x01a8:
            T r1 = r8.RatingCompat
            if (r1 == 0) goto L_0x01ae
            r1 = r4
            goto L_0x01af
        L_0x01ae:
            r1 = r3
        L_0x01af:
            if (r1 == 0) goto L_0x022e
            o.jZ r1 = p040o.C4864jZ.MediaBrowserCompat$ItemReceiver
            T r7 = r8.RatingCompat
            if (r7 == 0) goto L_0x01b9
            r7 = r4
            goto L_0x01ba
        L_0x01b9:
            r7 = r3
        L_0x01ba:
            if (r7 == 0) goto L_0x01c1
            T r7 = r8.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x01c1:
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r1 = r8.MediaDescriptionCompat
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            int r1 = p040o.C4895kb.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r1)
            o.animateCameraWithCallback r1 = p040o.C4895kb.MediaBrowserCompat$CustomActionResultReceiver((int) r1)
            o.Interner r10 = new o.Interner
            r10.<init>()
            o.IGoogleMapDelegate r7 = p040o.IGoogleMapDelegate.PROMPTPAY
            java.lang.String r7 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((p040o.IGoogleMapDelegate) r7)
            r10.MediaDescriptionCompat = r7
            o.CrashlyticsReport$FilesPayload$File$Builder r7 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.String r7 = r7.MediaSessionCompat$Token
            r10.MediaBrowserCompat$ItemReceiver = r7
            o.CrashlyticsReport$FilesPayload$File$Builder r7 = r8.MediaBrowserCompat$ItemReceiver
            o.getShortName r7 = r7.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r7 = r7.value
            r10.IconCompatParcelizer = r7
            int[] r7 = p040o.getICheckDeserializerRtti.C13363.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r1.ordinal()
            r7 = r7[r13]
            if (r7 == r4) goto L_0x01f8
            if (r7 == r9) goto L_0x01f5
            goto L_0x01fa
        L_0x01f5:
            java.lang.String r2 = "MOB"
            goto L_0x01fa
        L_0x01f8:
            java.lang.String r2 = "CID"
        L_0x01fa:
            r10.RatingCompat = r2
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r2 = r8.MediaDescriptionCompat
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            r10.MediaBrowserCompat$CustomActionResultReceiver = r2
            java.lang.String r2 = p040o.removeIfFromRandomAccessList.read((double) r5)
            r10.read = r2
            if (r12 == 0) goto L_0x0211
            int r2 = r12.length()
            if (r2 == 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            r3 = r4
        L_0x0212:
            if (r3 == 0) goto L_0x0215
            goto L_0x0216
        L_0x0215:
            r0 = r12
        L_0x0216:
            o.paddedPartition<java.lang.String> r2 = r10.write
            r2.MediaBrowserCompat$ItemReceiver = r0
            o.AppMeasurementSdk$OnEventListener r0 = r8.f2883x50fd9e4a
            o.AbstractMultimap$MultisetEntry r0 = r0.read
            o.DebitCardResetOtpActivity r0 = r0.write((p040o.Interner) r10)
            o.AppMeasurementSdk$OnEventListener r2 = r8.f2883x50fd9e4a
            o.kb$MediaBrowserCompat$SearchResultReceiver r3 = new o.kb$MediaBrowserCompat$SearchResultReceiver
            r7 = r3
            r9 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r2.write(r0, r3)
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.purchase.PurchaseDepositInputFragment.onReviewButtonClick():void");
    }

    public final void RatingCompat(String str) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), setLastBaselineToBottomHeight.write(getContext(), R.drawable.biller_place_holder), this.imageIcon, str, getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.textTitle.setText(str);
            this.textTitle.setVisibility(0);
        }
    }

    public final void MediaDescriptionCompat(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.textNumber.setText(str);
            this.textNumber.setVisibility(0);
        }
    }

    public final void write(String str) {
        this.inputLayout.setVisibility(0);
        this.editAmount.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.noteEditText.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, int i) {
        this.imageIcon.setImageResource(i == 10 ? R.drawable.icon_prompt_pay_mobile : R.drawable.icon_prompt_pay_cid);
        this.textNumber.setVisibility(0);
        this.textNumber.setText(str);
        this.inputLayout.setVisibility(0);
        this.editAmount.setText(str2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        if (execution != null) {
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), setLastBaselineToBottomHeight.write(getContext(), R.drawable.biller_place_holder), this.imageIcon, execution.MediaBrowserCompat$CustomActionResultReceiver(), getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
            this.textTitle.setVisibility(0);
            this.textTitle.setText(execution.read());
            this.textNumber.setVisibility(0);
            this.textNumber.setText(execution.MediaDescriptionCompat);
            this.billDetail.setVisibility(0);
            this.contactAccount.setText(execution.setIcon);
            this.contactAccountNumber.setText(execution.setPopupCallback);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.refTwoLayout.setVisibility(0);
        this.invoiceAccount.setText(execution.setPadding);
        this.invoiceAccountNumber.setText(execution.setGroupDividerEnabled);
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution) {
        this.refThreeLayout.setVisibility(0);
        this.refThreeLabel.setText(execution.setItemInvoker);
        this.refThreeId.setText(execution.ExpandedMenuView);
    }

    public final void read(boolean z) {
        this.editAmount.setEnabled(z);
    }

    public final void IconCompatParcelizer() {
        super.Keep();
        MediaBrowserCompat$ItemReceiver(false);
    }

    public final void write() {
        super.ay_();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.textRemainingLimit.setText(R.string.limit_not_available);
        MediaBrowserCompat$ItemReceiver(true);
    }

    private void MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = 0;
        this.remainingLimitLinearLayout.setVisibility(z ? 0 : 8);
        this.remainingLimitError.setVisibility(z ? 8 : 0);
        this.textRemainingLimit.setVisibility(z ? 0 : 8);
        TextView textView = this.remainingLimit;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaDescriptionCompat = str;
        this.textRemainingLimit.setText(getString(R.string.remaining_transfer_limit, str));
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final void read(String str) {
        this.MediaDescriptionCompat = str;
        this.textRemainingLimit.setText(getString(R.string.limit_top_up_remaining, str));
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final void read(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), onClickListener);
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeMwOnboardInfoActivity.write).show();
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, boolean z) {
        write(MediaBrowserCompat$ItemReceiver(signal, z));
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, boolean z) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.credit_card_alert_information_title).MediaBrowserCompat$ItemReceiver(getString(R.string.credit_card_alert_information_description));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeMwCurrentUserEwalletActivity(this, signal, z));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeMwOnBoardSuccessActivity.MediaBrowserCompat$ItemReceiver).show();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(parseEventLog parseeventlog, parseEventSignal parseeventsignal) {
        parseEventLog parseeventlog2 = parseeventlog;
        parseEventSignal parseeventsignal2 = parseeventsignal;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        String str = parseeventlog2.IconCompatParcelizer;
        this.inputLayout.setVisibility(0);
        this.editAmount.setCustomHint(str, this.inputLayout);
        this.editAmount.setHint(str);
        this.editAmount.setOnFocusChangeListener(new ActivityBuilder_ContributeMwEditCreateQrActivity(this));
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = new FragmentBuilder_BindEasycashContactInformationFragment(this.editAmount, this.inputLayout, parseeventlog2.MediaBrowserCompat$ItemReceiver.doubleValue(), this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), parseeventlog2.read.doubleValue(), getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.invalid_amount_transfer_input));
        this.MediaMetadataCompat = fragmentBuilder_BindEasycashContactInformationFragment;
        this.editAmount.setCurrencyFormattingTextWatcher(fragmentBuilder_BindEasycashContactInformationFragment);
        if (parseeventsignal.IconCompatParcelizer() && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(parseeventsignal2.MediaBrowserCompat$SearchResultReceiver)) {
            this.editAmount.setText(parseeventsignal2.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final /* synthetic */ void write(boolean z) {
        if (!z && getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(this.editAmount.getText().toString())) {
            this.editAmount.setText("");
        }
    }

    public final void IconCompatParcelizer(parseEventLog parseeventlog, parseEventSignal parseeventsignal) {
        MediaBrowserCompat$CustomActionResultReceiver(parseeventlog, parseeventsignal);
        String str = parseeventsignal.MediaBrowserCompat$SearchResultReceiver;
        if (!getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str)) {
            this.editAmount.setText(str);
        }
        if (parseeventsignal.MediaSessionCompat$ResultReceiverWrapper) {
            this.editAmount.setEnabled(getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z) {
        setuuidfromutf8bytes.MediaMetadataCompat("PURCHASE_TOPUP_FUNCTION");
        String str = this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
        setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes.IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str, z));
        MediaBrowserCompat$ItemReceiver.ListMenuItemView = str;
        MediaBrowserCompat$ItemReceiver.setGroupDividerEnabled = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb);
        MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView = this.textNumber.getText().toString();
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        MediaBrowserCompat$ItemReceiver.setOnMenuItemClickListener = this.noteEditText.mNoteEditText.getText().toString();
        Intent intent = new Intent(getContext(), TopUpReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.TransferTabFragment.REVIEW_TITLE", getString(R.string.purchase_review_title));
        intent.putExtra("com.scb.phone.analytics.KEY_EVENT_START", "purchase_review");
        intent.putExtra("com.scb.phone.analytics.KEY_EVENT_FINISH", "purchase_slip");
        intent.putExtra("subtype", "topup");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<Integer> list) {
        this.mRecyclerView.setVisibility(0);
        this.inputLayout.setVisibility(8);
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.editAmount.setImeOptions(6);
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        Double valueOf = Double.valueOf(0.0d);
        if (this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver != null) {
            valueOf = this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        }
        getEasycashIntroductions geteasycashintroductions = new getEasycashIntroductions(list, valueOf);
        this.MediaBrowserCompat$SearchResultReceiver = geteasycashintroductions;
        this.mRecyclerView.setAdapter(geteasycashintroductions);
        this.MediaBrowserCompat$MediaItem = DebitCardResetOtpActivity.interval(500, TimeUnit.MILLISECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_ContributeMwLandingActivity(this), ActivityBuilder_ContributeMwManageWalletActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void onDestroy() {
        super.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void write(List<Integer> list, String str) {
        MediaBrowserCompat$CustomActionResultReceiver(list);
        this.MediaBrowserCompat$SearchResultReceiver.write(str);
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate) {
        Intent intent = new Intent(getContext(), TransferReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TYPE", iGoogleMapDelegate);
        intent.putExtra("com.scb.phone.TransferTabFragment.REVIEW_TITLE", getString(R.string.purchase_review_title));
        intent.putExtra("com.scb.phone.analytics.KEY_EVENT_START", "purchase_review");
        intent.putExtra("com.scb.phone.analytics.KEY_EVENT_FINISH", "purchase_slip");
        intent.putExtra("subtype", "transfer");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, boolean z) {
        String str;
        String str2;
        String str3;
        CrashlyticsReport.Session.Event.Application.Execution execution = this.purchaseDepositInputPresenter.read;
        CrashlyticsReport.FilesPayload.File.Builder builder = this.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver;
        String str4 = "";
        String str5 = TextUtils.isEmpty(execution.MediaDescriptionCompat) ? str4 : execution.MediaDescriptionCompat;
        if (TextUtils.isEmpty(signal.setPopupTheme)) {
            str = str4;
        } else {
            str = getString(R.string.ebill_selected_reference, execution.setIcon, signal.setPopupTheme);
        }
        if (TextUtils.isEmpty(signal.ActionMenuView$OnMenuItemClickListener)) {
            str2 = str4;
        } else {
            str2 = getString(R.string.ebill_selected_reference, execution.setPadding, signal.ActionMenuView$OnMenuItemClickListener);
        }
        if (!TextUtils.isEmpty(signal.ActivityChooserView)) {
            str4 = getString(R.string.ebill_selected_reference, execution.setItemInvoker, signal.ActivityChooserView);
        }
        if (execution.AppCompatDialogFragment != null) {
            str3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str, str2);
        } else {
            str3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str5, str, str2, str4);
        }
        ArrayList arrayList = new ArrayList();
        parseReport.IconCompatParcelizer iconCompatParcelizer = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = signal.IconCompatParcelizer;
        iconCompatParcelizer.read = signal.MediaBrowserCompat$SearchResultReceiver;
        arrayList.add(new parseReport(iconCompatParcelizer, (byte) 0));
        parseReport.IconCompatParcelizer iconCompatParcelizer2 = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = signal.write;
        iconCompatParcelizer2.read = signal.MediaBrowserCompat$MediaItem;
        arrayList.add(new parseReport(iconCompatParcelizer2, (byte) 0));
        parseReport.IconCompatParcelizer iconCompatParcelizer3 = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver = signal.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer3.read = signal.MediaMetadataCompat;
        arrayList.add(new parseReport(iconCompatParcelizer3, (byte) 0));
        parseReport.IconCompatParcelizer iconCompatParcelizer4 = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = signal.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer4.read = signal.setMenuCallbacks;
        arrayList.add(new parseReport(iconCompatParcelizer4, (byte) 0));
        setUuidFromUtf8Bytes IconCompatParcelizer2 = new setUuidFromUtf8Bytes().write(signal.MediaBrowserCompat$ItemReceiver()).IconCompatParcelizer(builder.MediaSessionCompat$Token);
        IconCompatParcelizer2.ListMenuItemView = builder.MediaSessionCompat$Token;
        setUuidFromUtf8Bytes MediaMetadataCompat2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(builder.MediaSessionCompat$Token, z)).MediaMetadataCompat("PURCHASE_BILL_PAYMENT_FUNCTION");
        MediaMetadataCompat2.setGroupDividerEnabled = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb);
        MediaMetadataCompat2.AppCompatDialogFragment = this.RatingCompat.MediaBrowserCompat$ItemReceiver;
        setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver2 = MediaMetadataCompat2.MediaBrowserCompat$CustomActionResultReceiver(signal.IconCompatParcelizer());
        MediaBrowserCompat$CustomActionResultReceiver2.PlaybackStateCompat = execution.ParcelableVolumeInfo;
        MediaBrowserCompat$CustomActionResultReceiver2.setContentView = this.RatingCompat.IconCompatParcelizer.write;
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = this.editAmount.getText().toString();
        read.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
        MediaBrowserCompat$CustomActionResultReceiver2.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        MediaBrowserCompat$CustomActionResultReceiver2.setSubtitle = signal.setPopupTheme;
        MediaBrowserCompat$CustomActionResultReceiver2.ActionBarContextView = signal.ActionMenuView$OnMenuItemClickListener;
        MediaBrowserCompat$CustomActionResultReceiver2.setHideOnContentScrollEnabled = signal.ActivityChooserView;
        MediaBrowserCompat$CustomActionResultReceiver2.ActionBarOverlayLayout = signal.setExpandActivityOverflowButtonContentDescription;
        MediaBrowserCompat$CustomActionResultReceiver2.setActionBarVisibilityCallback = signal.setDefaultActionButtonContentDescription;
        setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem2 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem(signal.onMenuItemClick);
        MediaBrowserCompat$MediaItem2.setTitle = putInstance.MediaBrowserCompat$CustomActionResultReceiver(StreetViewPanoramaFragment.zzb.SCAN);
        MediaBrowserCompat$MediaItem2.ExpandedMenuView = String.valueOf(this.RatingCompat.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$MediaItem2.AppCompatActivity = Uri.parse(execution.MediaBrowserCompat$CustomActionResultReceiver());
        MediaBrowserCompat$MediaItem2.AlertController$RecycleListView = str3;
        setUuidFromUtf8Bytes read2 = MediaBrowserCompat$MediaItem2.read(signal.setExpandActivityOverflowButtonDrawable);
        read2.setOnMenuItemClickListener = this.noteEditText.mNoteEditText.getText().toString();
        return read2;
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getActivity(), BillPaymentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.TransferTabFragment.REVIEW_TITLE", getString(R.string.purchase_review_title));
        intent.putExtra("com.scb.phone.analytics.KEY_EVENT_START", "purchase_review");
        intent.putExtra("com.scb.phone.analytics.KEY_EVENT_FINISH", "purchase_slip");
        intent.putExtra("subtype", "billpay");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        MediaBrowserCompat$CustomActionResultReceiver((Fragment) this, intent);
    }

    public final void Keep() {
        super.Keep();
        this.inputContent.setVisibility(8);
    }

    public final void ay_() {
        super.ay_();
        this.inputContent.setVisibility(0);
    }

    static /* synthetic */ void read(PurchaseDepositInputFragment purchaseDepositInputFragment, double d) {
        purchaseDepositInputFragment.IconCompatParcelizer = d;
        purchaseDepositInputFragment.buttonReview.setButtonEnabled(purchaseDepositInputFragment.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver(purchaseDepositInputFragment.editAmount.getText().toString()));
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(PurchaseDepositInputFragment purchaseDepositInputFragment) {
        purchaseDepositInputFragment.buttonReview.setButtonEnabled(purchaseDepositInputFragment.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver() != null ? purchaseDepositInputFragment.purchaseDepositInputPresenter.MediaBrowserCompat$ItemReceiver(String.valueOf(purchaseDepositInputFragment.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver())) : false);
    }
}
