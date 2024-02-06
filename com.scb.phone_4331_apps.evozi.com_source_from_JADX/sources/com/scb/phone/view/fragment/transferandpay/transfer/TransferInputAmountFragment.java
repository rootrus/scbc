package com.scb.phone.view.fragment.transferandpay.transfer;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferGiftingInputActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomGiftingView;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.transferandpay.BaseDuplicatedTransferFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BillCaptureModule_GetIBillDeserializerRttiFactory;
import p040o.BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
import p040o.BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import p040o.BillWorkflowActivity;
import p040o.BillWorkflowActivity_MembersInjector;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindAccountTabFragment;
import p040o.FragmentBuilder_BindActivateChequeInputFragment;
import p040o.FragmentBuilder_BindAddFavoriteTransferInputFragment;
import p040o.FragmentBuilder_BindAddFavoriteTransferTargetTabFragment;
import p040o.FragmentBuilder_BindAddressSearchFragment;
import p040o.FragmentBuilder_BindBranchTabFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IBillExtractorListener;
import p040o.IGoogleMapDelegate;
import p040o.MyECouponActivity_ViewBinding;
import p040o.animateCameraWithCallback;
import p040o.eventFromJson;
import p040o.eventToJson;
import p040o.getAddressLine1;
import p040o.getICheckDeserializerRtti;
import p040o.getKernelIDSrcIn;
import p040o.getOversizeImage;
import p040o.getRamUsed;
import p040o.getShortName;
import p040o.getTopLeftCornerWidth;
import p040o.onInfoWindowLongClick;
import p040o.parseSession;
import p040o.proxyGetExtractionParameters;
import p040o.proxyGetIBillDeserializerKta;
import p040o.reportToJson;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.zzag;
import p040o.zzmd;

public class TransferInputAmountFragment extends BaseDuplicatedTransferFragment implements getTopLeftCornerWidth.setIcon, FragmentBuilder_BindBranchTabFragment {
    /* access modifiers changed from: private */
    public double IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private BulkTransferDeepLinkActivity f3101x50fd9e4a;
    private String MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private getRamUsed MediaSessionCompat$ResultReceiverWrapper;
    private getKernelIDSrcIn ParcelableVolumeInfo;
    private Drawable RatingCompat;
    @BindView
    protected DefaultButton buttonReview;
    @BindView
    protected CustomGiftingView customGiftingView;
    @BindView
    protected CustomScheduleView customScheduleView;
    @BindView
    protected EditText editAccountNumber;
    @BindView
    protected AmountEditText editAmount;
    @BindView
    protected ImageView editImageView;
    @BindView
    protected LinearLayout giftLayout;
    @BindView
    protected ImageView imageIcon;
    @BindView
    TextInputLayout inputLayout;
    @BindView
    protected NoteEditText noteEditText;
    @BindView
    protected LinearLayout noteLayout;
    @HmlPinActivity
    public IBillExtractorListener presenter;
    @BindView
    protected TextView remainingLimit;
    @BindView
    protected TextView remainingLimitError;
    @BindView
    protected LinearLayout remainingLimitLinearLayout;
    @BindView
    protected View scheduleLine;
    @BindView
    protected TextView textAccountNumber;
    @BindView
    protected TextView textRemainingLimit;
    @BindView
    protected TextView textTitle;
    @BindView
    protected ViewGroup viewGroupAccountNumber;

    public static TransferInputAmountFragment write(parseSession parsesession, String str, getShortName getshortname, double d, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", parsesession);
        bundle.putString("com.scb.phone.EXTRA_ACCOUNT_NUMBER", str);
        bundle.putSerializable("com.scb.phone.EXTRA_ACCOUNT_TYPE", getshortname);
        bundle.putDouble("com.scb.phone.EXTRA_ACCOUNT_BALANCE", d);
        bundle.putString("source", str2);
        TransferInputAmountFragment transferInputAmountFragment = new TransferInputAmountFragment();
        transferInputAmountFragment.setArguments(bundle);
        return transferInputAmountFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        View inflate = layoutInflater.inflate(R.layout.f90262131494253, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.editAmount.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.RatingCompat = setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_place_holder);
        this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS")).subscribe(new FragmentBuilder_BindAddFavoriteTransferTargetTabFragment(this), FragmentBuilder_BindAddressSearchFragment.write);
        this.f3101x50fd9e4a = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new FragmentBuilder_BindAddFavoriteTransferInputFragment(this), FragmentBuilder_BindAddressSearchFragment.write);
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments != null) {
            IBillExtractorListener iBillExtractorListener = this.presenter;
            String string = arguments.getString("com.scb.phone.EXTRA_ACCOUNT_NUMBER");
            double d = arguments.getDouble("com.scb.phone.EXTRA_ACCOUNT_BALANCE");
            iBillExtractorListener.MediaMetadataCompat = (parseSession) arguments.getParcelable("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA");
            iBillExtractorListener.MediaBrowserCompat$SearchResultReceiver = string;
            iBillExtractorListener.MediaBrowserCompat$MediaItem = (getShortName) arguments.getSerializable("com.scb.phone.EXTRA_ACCOUNT_TYPE");
            proxyGetIBillDeserializerKta proxygetibilldeserializerkta = new proxyGetIBillDeserializerKta(d);
            if (iBillExtractorListener.RatingCompat != null) {
                proxygetibilldeserializerkta.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
            }
            BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory billCaptureModule_GetIExceptionResponseDeserializerRttiFactory = new BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory(iBillExtractorListener);
            if (iBillExtractorListener.RatingCompat != null) {
                billCaptureModule_GetIExceptionResponseDeserializerRttiFactory.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
            }
        }
        this.ParcelableVolumeInfo = new getKernelIDSrcIn();
        String AbsActionBarView = AbsActionBarView();
        this.MediaBrowserCompat$CustomActionResultReceiver = AbsActionBarView;
        this.ParcelableVolumeInfo.read(AbsActionBarView);
        this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(this.presenter.MediaMetadataCompat.RatingCompat.toString());
        getKernelIDSrcIn getkernelidsrcin = this.ParcelableVolumeInfo;
        if (getActivity() != null) {
            getkernelidsrcin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "transfer_input");
        }
        IBillExtractorListener iBillExtractorListener2 = this.presenter;
        if (iBillExtractorListener2.MediaBrowserCompat$ItemReceiver != null) {
            proxyGetExtractionParameters proxygetextractionparameters = new proxyGetExtractionParameters(iBillExtractorListener2);
            if (iBillExtractorListener2.RatingCompat != null) {
                proxygetextractionparameters.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
            }
        } else if (iBillExtractorListener2.IconCompatParcelizer != null) {
            BillCaptureModule_GetIBillDeserializerRttiFactory billCaptureModule_GetIBillDeserializerRttiFactory = new BillCaptureModule_GetIBillDeserializerRttiFactory(iBillExtractorListener2);
            if (iBillExtractorListener2.RatingCompat != null) {
                billCaptureModule_GetIBillDeserializerRttiFactory.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
            }
        }
        IBillExtractorListener iBillExtractorListener3 = this.presenter;
        if (iBillExtractorListener3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iBillExtractorListener3.RatingCompat.Keep();
        }
        iBillExtractorListener3.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver("TRANSFER", iBillExtractorListener3.MediaMetadataCompat.RatingCompat.name());
        iBillExtractorListener3.ParcelableVolumeInfo.IconCompatParcelizer(new IBillExtractorListener.IconCompatParcelizer(iBillExtractorListener3, (byte) 0));
        IBillExtractorListener iBillExtractorListener4 = this.presenter;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        } else {
            zza = null;
        }
        iBillExtractorListener4.write(zza);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        IBillExtractorListener iBillExtractorListener = this.presenter;
        if (!iBillExtractorListener.read) {
            if (iBillExtractorListener.RatingCompat != null) {
                iBillExtractorListener.RatingCompat.aj_();
            }
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        if (this.MediaBrowserCompat$ItemReceiver != null && !this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.f3101x50fd9e4a;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.f3101x50fd9e4a.dispose();
        }
        this.ParcelableVolumeInfo = null;
        super.onDestroy();
    }

    @OnClick
    public void navigateBack() {
        getContext().sendBroadcast(new Intent("com.scb.phone/BROADCAST_TRANSFER_BACK_STEP"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReviewButtonClick() {
        /*
            r16 = this;
            r0 = r16
            o.IBillExtractorListener r1 = r0.presenter
            com.scb.phone.view.custom.common.NoteEditText r2 = r0.noteEditText
            android.widget.EditText r2 = r2.mNoteEditText
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            T r3 = r1.RatingCompat
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0018
            r3 = r5
            goto L_0x0019
        L_0x0018:
            r3 = r4
        L_0x0019:
            if (r3 == 0) goto L_0x0044
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0042
            java.lang.String r3 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 != 0) goto L_0x0042
            o.getIJsonExactionHelperKta r2 = p040o.getIJsonExactionHelperKta.IconCompatParcelizer
            T r3 = r1.RatingCompat
            if (r3 == 0) goto L_0x0039
            r3 = r5
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            if (r3 == 0) goto L_0x0044
            T r1 = r1.RatingCompat
            r2.IconCompatParcelizer(r1)
            goto L_0x0044
        L_0x0042:
            r1 = r5
            goto L_0x0045
        L_0x0044:
            r1 = r4
        L_0x0045:
            if (r1 == 0) goto L_0x01a6
            o.IBillExtractorListener r1 = r0.presenter
            java.lang.String r1 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x004f
            r1 = r5
            goto L_0x0050
        L_0x004f:
            r1 = r4
        L_0x0050:
            if (r1 == 0) goto L_0x01a6
            r16.PlaybackStateCompat$CustomAction()
            r16.AlertController$RecycleListView()
            android.view.ViewGroup r1 = r0.viewGroupAccountNumber
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x006b
            android.widget.EditText r1 = r0.editAccountNumber
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            o.IBillExtractorListener r7 = r0.presenter
            double r8 = r0.IconCompatParcelizer
            com.scb.phone.view.custom.common.NoteEditText r3 = r0.noteEditText
            android.widget.EditText r3 = r3.mNoteEditText
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            o.getRamUsed r13 = r0.MediaSessionCompat$ResultReceiverWrapper
            boolean r6 = r7.read
            if (r6 != 0) goto L_0x01a6
            r7.read = r5
            o.parseSession r6 = r7.MediaMetadataCompat
            boolean r10 = r6 instanceof p040o.eventToJson
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0126
            r10 = r6
            o.eventToJson r10 = (p040o.eventToJson) r10
            java.lang.String r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.zzag$zzb r12 = r7.IconCompatParcelizer
            if (r12 == 0) goto L_0x009a
            o.a_ r1 = r12.write
            java.lang.String r1 = r1.IconCompatParcelizer
            goto L_0x00a6
        L_0x009a:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            r1 = r11
            goto L_0x00a6
        L_0x00a5:
            r1 = r6
        L_0x00a6:
            java.lang.String r6 = r10.MediaBrowserCompat$ItemReceiver
            java.lang.String r11 = "000"
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "014"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r6 = r10.MediaBrowserCompat$ItemReceiver
        L_0x00b5:
            r11 = r6
            o.parseSession r6 = r7.MediaMetadataCompat
            o.IGoogleMapDelegate r6 = r6.RatingCompat
            java.lang.String r12 = r7.MediaBrowserCompat$SearchResultReceiver
            o.getShortName r14 = r7.MediaBrowserCompat$MediaItem
            java.lang.String r10 = r10.read
            o.parseSession r15 = r7.MediaMetadataCompat
            java.lang.String r15 = r15.IconCompatParcelizer
            r7.f3156x50fd9e4a = r6
            o.ImmutableSortedMapFauxverideShim r2 = new o.ImmutableSortedMapFauxverideShim
            r2.<init>()
            java.lang.String r6 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((p040o.IGoogleMapDelegate) r6)
            r2.MediaDescriptionCompat = r6
            r2.write = r12
            java.lang.String r6 = r14.value
            r2.read = r6
            r2.MediaBrowserCompat$CustomActionResultReceiver = r1
            r2.IconCompatParcelizer = r11
            java.lang.String r1 = p040o.removeIfFromRandomAccessList.read((double) r8)
            r2.MediaBrowserCompat$ItemReceiver = r1
            if (r13 == 0) goto L_0x00f9
            java.lang.String r1 = r13.IconCompatParcelizer
            java.lang.String r6 = r13.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r6 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r6)
            java.lang.String r8 = r13.read
            java.lang.String r8 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r8)
            o.setActivity r9 = new o.setActivity
            java.lang.String r12 = r13.write
            r9.<init>(r1, r6, r8, r12)
            goto L_0x00fa
        L_0x00f9:
            r9 = 0
        L_0x00fa:
            r2.MediaBrowserCompat$MediaItem = r9
            if (r3 == 0) goto L_0x0105
            int r1 = r3.length()
            if (r1 == 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r4 = r5
        L_0x0106:
            if (r4 == 0) goto L_0x010a
            r1 = 0
            goto L_0x010b
        L_0x010a:
            r1 = r3
        L_0x010b:
            o.paddedPartition<java.lang.String> r4 = r2.MediaBrowserCompat$SearchResultReceiver
            r4.MediaBrowserCompat$ItemReceiver = r1
            o.AppMeasurementSdk$OnEventListener r1 = r7.ParcelableVolumeInfo
            o.AbstractMultimap$MultisetEntry r1 = r1.read
            o.DebitCardResetOtpActivity r1 = r1.write((p040o.ImmutableSortedMapFauxverideShim) r2)
            o.AppMeasurementSdk$OnEventListener r4 = r7.ParcelableVolumeInfo
            o.IBillExtractorListener$MediaBrowserCompat$CustomActionResultReceiver r5 = new o.IBillExtractorListener$MediaBrowserCompat$CustomActionResultReceiver
            r6 = r5
            r8 = r2
            r9 = r15
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4.write(r1, r5)
            return
        L_0x0126:
            boolean r1 = r6 instanceof p040o.eventFromJson
            if (r1 == 0) goto L_0x01a6
            o.eventFromJson r6 = (p040o.eventFromJson) r6
            o.IGoogleMapDelegate r1 = r6.RatingCompat
            java.lang.String r2 = r7.MediaBrowserCompat$SearchResultReceiver
            o.getShortName r10 = r7.MediaBrowserCompat$MediaItem
            o.animateCameraWithCallback r12 = r6.MediaBrowserCompat$MediaItem
            java.lang.String r13 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.String r14 = r6.IconCompatParcelizer
            r7.f3156x50fd9e4a = r1
            o.Interner r1 = new o.Interner
            r1.<init>()
            o.IGoogleMapDelegate r6 = p040o.IGoogleMapDelegate.PROMPTPAY
            java.lang.String r6 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((p040o.IGoogleMapDelegate) r6)
            r1.MediaDescriptionCompat = r6
            r1.MediaBrowserCompat$ItemReceiver = r2
            java.lang.String r2 = r10.value
            r1.IconCompatParcelizer = r2
            int[] r2 = p040o.getICheckDeserializerRtti.C13363.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r12.ordinal()
            r2 = r2[r6]
            if (r2 == r5) goto L_0x015e
            r6 = 2
            if (r2 == r6) goto L_0x015b
            goto L_0x0160
        L_0x015b:
            java.lang.String r11 = "MOB"
            goto L_0x0160
        L_0x015e:
            java.lang.String r11 = "CID"
        L_0x0160:
            r1.RatingCompat = r11
            r1.MediaBrowserCompat$CustomActionResultReceiver = r13
            java.lang.String r2 = p040o.removeIfFromRandomAccessList.read((double) r8)
            r1.read = r2
            if (r3 == 0) goto L_0x0173
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0173
            goto L_0x0174
        L_0x0173:
            r4 = r5
        L_0x0174:
            if (r4 == 0) goto L_0x0178
            r2 = 0
            goto L_0x0179
        L_0x0178:
            r2 = r3
        L_0x0179:
            o.paddedPartition<java.lang.String> r4 = r1.write
            r4.MediaBrowserCompat$ItemReceiver = r2
            o.onInfoWindowLongClick r2 = r7.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x018f
            java.lang.String r2 = r2.setCheckable
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x018f
            o.onInfoWindowLongClick r2 = r7.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = r2.setCheckable
            r1.MediaBrowserCompat$SearchResultReceiver = r2
        L_0x018f:
            o.AppMeasurementSdk$OnEventListener r2 = r7.ParcelableVolumeInfo
            o.AbstractMultimap$MultisetEntry r2 = r2.read
            o.DebitCardResetOtpActivity r2 = r2.write((p040o.Interner) r1)
            o.AppMeasurementSdk$OnEventListener r4 = r7.ParcelableVolumeInfo
            o.IBillExtractorListener$read r5 = new o.IBillExtractorListener$read
            r6 = r5
            r8 = r12
            r9 = r1
            r10 = r14
            r11 = r3
            r6.<init>(r8, r9, r10, r11)
            r4.write(r2, r5)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.transfer.TransferInputAmountFragment.onReviewButtonClick():void");
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate) {
        PlaybackStateCompat$CustomAction();
        aj_();
        Intent intent = new Intent(getContext(), TransferReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TYPE", iGoogleMapDelegate);
        intent.putExtra("source", this.MediaBrowserCompat$CustomActionResultReceiver);
        intent.putExtra("subtype", this.presenter.MediaMetadataCompat.RatingCompat.toString());
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

    public final void read(String str) {
        read(true);
        this.remainingLimit.setText(str);
        this.MediaDescriptionCompat = str;
    }

    public final void write(String str) {
        this.MediaBrowserCompat$MediaItem = str;
    }

    public final void read(zzag.zzb zzb) {
        this.editImageView.setVisibility(8);
        this.editAccountNumber.setText(zzb.write.IconCompatParcelizer);
        this.editAccountNumber.setVisibility(8);
        this.viewGroupAccountNumber.setVisibility(8);
        this.textTitle.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(zzb.write.IconCompatParcelizer, false));
    }

    public final void write() {
        this.noteEditText.write();
    }

    public final void ay_() {
        super.ay_();
        this.remainingLimitLinearLayout.setVisibility(0);
    }

    public final void RatingCompat() {
        read(false);
    }

    private void read(boolean z) {
        int i = 8;
        this.remainingLimitError.setVisibility(z ? 8 : 0);
        this.textRemainingLimit.setVisibility(z ? 0 : 8);
        TextView textView = this.remainingLimit;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final void IconCompatParcelizer() {
        navigateBack();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.editAmount.setAvailableBalanceCurrencyFormattingTextWatcher(d);
        }
    }

    public final void MediaDescriptionCompat() {
        DefaultButton defaultButton = this.buttonReview;
        defaultButton.setButtonEnabled(!defaultButton.isEnabled());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.customGiftingView.setLayoutEnabled(true);
    }

    public final void read() {
        this.customGiftingView.setLayoutEnabled(false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.giftLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(reportToJson reporttojson) {
        TransferGiftingInputActivity.MediaBrowserCompat$ItemReceiver(getActivity(), reporttojson);
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z) {
        if (!z && getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(this.editAmount.getText().toString())) {
            this.editAmount.setText("");
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(getActivity(), ScheduleLandingActivity.class);
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
            startActivityForResult(intent, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            this.MediaSessionCompat$ResultReceiverWrapper = (getRamUsed) intent.getParcelableExtra("SCHEDULE_DETAIL");
            if (this.noteLayout.getVisibility() == 0) {
                this.noteLayout.setVisibility(8);
                if (!this.noteEditText.mNoteEditText.getText().toString().isEmpty()) {
                    FragmentActivity activity = getActivity();
                    String string = getString(R.string.topup_input_010);
                    getOversizeImage getoversizeimage = getOversizeImage.ERROR;
                    if (getActivity() != null) {
                        ((BaseActivity) getActivity()).write(activity, R.id.container, string, getoversizeimage);
                    }
                    this.noteEditText.mNoteEditText.setText("");
                }
            }
            FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.editAmount.read;
            if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
                fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(Double.MAX_VALUE);
            }
            this.textRemainingLimit.setText(getString(R.string.schedule_transfer_limit));
            this.remainingLimit.setText(this.MediaBrowserCompat$MediaItem);
            this.customScheduleView.setScheduleView(this.MediaSessionCompat$ResultReceiverWrapper, true);
        } else if (i2 == 1) {
            this.textRemainingLimit.setText(getString(R.string.transfer_remaining_limit));
            this.remainingLimit.setText(this.MediaDescriptionCompat);
            this.customScheduleView.read();
            this.noteLayout.setVisibility(0);
            this.MediaSessionCompat$ResultReceiverWrapper = null;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.presenter.write = false;
    }

    public static /* synthetic */ void IconCompatParcelizer(TransferInputAmountFragment transferInputAmountFragment) {
        String str;
        IBillExtractorListener iBillExtractorListener = transferInputAmountFragment.presenter;
        boolean z = true;
        boolean z2 = !transferInputAmountFragment.inputLayout.MediaBrowserCompat$MediaItem.IconCompatParcelizer;
        String obj = transferInputAmountFragment.editAmount.getText().toString();
        boolean isEnabled = transferInputAmountFragment.buttonReview.isEnabled();
        if (iBillExtractorListener.RatingCompat != null) {
            if (isEnabled != (z2 && (str = iBillExtractorListener.MediaBrowserCompat$SearchResultReceiver) != null && !str.isEmpty() && IBillExtractorListener.read(obj))) {
                BillWorkflowActivity.C6337a aVar = BillWorkflowActivity.C6337a.MediaBrowserCompat$CustomActionResultReceiver;
                if (iBillExtractorListener.RatingCompat != null) {
                    aVar.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
                }
            }
        }
        IBillExtractorListener iBillExtractorListener2 = transferInputAmountFragment.presenter;
        String obj2 = transferInputAmountFragment.viewGroupAccountNumber.getVisibility() == 0 ? transferInputAmountFragment.editAccountNumber.getText().toString() : null;
        String obj3 = transferInputAmountFragment.editAmount.getText().toString();
        getRamUsed getramused = transferInputAmountFragment.MediaSessionCompat$ResultReceiverWrapper;
        if (iBillExtractorListener2.MediaMetadataCompat instanceof eventToJson) {
            if ((iBillExtractorListener2.RatingCompat != null) && "014".equals(((eventToJson) iBillExtractorListener2.MediaMetadataCompat).MediaBrowserCompat$ItemReceiver) && getramused == null && IBillExtractorListener.read(obj3) && IBillExtractorListener.MediaBrowserCompat$ItemReceiver(obj2)) {
                getAddressLine1 getaddressline1 = getAddressLine1.read;
                if (iBillExtractorListener2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getaddressline1.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
                    return;
                }
                return;
            }
        }
        if (iBillExtractorListener2.MediaMetadataCompat instanceof eventFromJson) {
            if ((iBillExtractorListener2.RatingCompat != null) && IBillExtractorListener.read(obj3) && IBillExtractorListener.MediaBrowserCompat$ItemReceiver(((eventFromJson) iBillExtractorListener2.MediaMetadataCompat).MediaBrowserCompat$ItemReceiver)) {
                getAddressLine1 getaddressline12 = getAddressLine1.read;
                if (iBillExtractorListener2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getaddressline12.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
                    return;
                }
                return;
            }
        }
        BillWorkflowActivity_MembersInjector billWorkflowActivity_MembersInjector = BillWorkflowActivity_MembersInjector.MediaBrowserCompat$ItemReceiver;
        if (iBillExtractorListener2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            billWorkflowActivity_MembersInjector.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
        }
    }

    public static /* synthetic */ void write(TransferInputAmountFragment transferInputAmountFragment) {
        IBillExtractorListener iBillExtractorListener = transferInputAmountFragment.presenter;
        zzmd.zzm.zzb.zza zza = null;
        iBillExtractorListener.MediaBrowserCompat$SearchResultReceiver = null;
        iBillExtractorListener.MediaBrowserCompat$MediaItem = null;
        transferInputAmountFragment.buttonReview.setButtonEnabled(false);
        transferInputAmountFragment.giftLayout.setVisibility(0);
        transferInputAmountFragment.customGiftingView.setLayoutEnabled(false);
        IBillExtractorListener iBillExtractorListener2 = transferInputAmountFragment.presenter;
        if (transferInputAmountFragment.getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) transferInputAmountFragment.getActivity()).setTitleOptional();
        }
        iBillExtractorListener2.write(zza);
    }

    @OnClick
    public void onGiftingClick() {
        String str = null;
        String obj = this.viewGroupAccountNumber.getVisibility() == 0 ? this.editAccountNumber.getText().toString() : null;
        IBillExtractorListener iBillExtractorListener = this.presenter;
        double d = this.IconCompatParcelizer;
        onInfoWindowLongClick oninfowindowlongclick = iBillExtractorListener.MediaBrowserCompat$ItemReceiver;
        if (oninfowindowlongclick != null) {
            str = oninfowindowlongclick.AppCompatDialogFragment;
        }
        parseSession parsesession = iBillExtractorListener.MediaMetadataCompat;
        boolean z = true;
        if (parsesession instanceof eventToJson) {
            BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory billCaptureModule_GetIExceptionResponseDeserializerKtaFactory = new BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory(new reportToJson(iBillExtractorListener.MediaMetadataCompat.RatingCompat, iBillExtractorListener.MediaBrowserCompat$SearchResultReceiver, obj, (animateCameraWithCallback) null, (String) null, ((eventToJson) iBillExtractorListener.MediaMetadataCompat).MediaBrowserCompat$ItemReceiver, str, d));
            if (iBillExtractorListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billCaptureModule_GetIExceptionResponseDeserializerKtaFactory.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
            }
        } else if (parsesession instanceof eventFromJson) {
            BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory billCaptureModule_GetIExceptionResponseDeserializerKtaFactory2 = new BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory(new reportToJson(iBillExtractorListener.MediaMetadataCompat.RatingCompat, iBillExtractorListener.MediaBrowserCompat$SearchResultReceiver, (String) null, ((eventFromJson) iBillExtractorListener.MediaMetadataCompat).MediaBrowserCompat$MediaItem, ((eventFromJson) iBillExtractorListener.MediaMetadataCompat).MediaBrowserCompat$ItemReceiver, (String) null, str, d));
            if (iBillExtractorListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billCaptureModule_GetIExceptionResponseDeserializerKtaFactory2.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
            }
        }
    }

    public final void read(onInfoWindowLongClick oninfowindowlongclick) {
        this.IconCompatParcelizer = oninfowindowlongclick.MediaBrowserCompat$MediaItem;
        this.editImageView.setVisibility(8);
        this.editAmount.setFormattedAmount(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.IconCompatParcelizer));
        if (this.IconCompatParcelizer > 0.0d && oninfowindowlongclick.PlaybackStateCompat$CustomAction) {
            this.editAmount.setEnabled(false);
        }
        this.editAccountNumber.setText(oninfowindowlongclick.MediaBrowserCompat$ItemReceiver);
        this.editAccountNumber.setEnabled(false);
    }

    public final void read(parseSession parsesession) {
        this.textTitle.setText(parsesession.MediaDescriptionCompat);
        String str = parsesession.write;
        this.textAccountNumber.setText(str);
        if (parsesession instanceof eventToJson) {
            boolean z = !TextUtils.isEmpty(str);
            this.textAccountNumber.setVisibility(z ? 0 : 8);
            this.viewGroupAccountNumber.setVisibility(z ? 8 : 0);
        } else if (parsesession instanceof eventFromJson) {
            this.textAccountNumber.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            this.viewGroupAccountNumber.setVisibility(8);
        }
        Context context = getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, this.RatingCompat, this.imageIcon, parsesession.read, context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
        this.remainingLimit.setText(parsesession.IconCompatParcelizer);
        this.buttonReview.setButtonEnabled(false);
        this.giftLayout.setVisibility(0);
        this.customGiftingView.setLayoutEnabled(false);
        boolean z2 = parsesession instanceof eventFromJson;
        this.MediaMetadataCompat = z2;
        if (z2) {
            this.customScheduleView.setVisibility(8);
            this.scheduleLine.setVisibility(8);
        }
        this.customScheduleView.setOnEditClickListener(this);
        if (this.MediaMetadataCompat) {
            AmountEditText amountEditText = this.editAmount;
            amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.inputLayout, 9.9999999999E8d, 0.0d, getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account)));
        } else {
            FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.editAmount.read;
            if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
                fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(Double.MAX_VALUE);
            }
        }
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                double unused = TransferInputAmountFragment.this.IconCompatParcelizer = d;
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                TransferInputAmountFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.editAmount.setOnFocusChangeListener(new FragmentBuilder_BindActivateChequeInputFragment(this));
        this.editAmount.setHandleDismissKeyboard(new FragmentBuilder_BindAccountTabFragment(this));
    }
}
