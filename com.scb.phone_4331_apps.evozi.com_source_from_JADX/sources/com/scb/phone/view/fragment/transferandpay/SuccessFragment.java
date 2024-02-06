package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.donations.SharingMomentsPreviewActivity;
import com.scb.phone.view.activity.requesttopay.EnterProxyActivity;
import com.scb.phone.view.activity.requesttopay.SummaryDetailActivity;
import com.scb.phone.view.activity.transferandpay.SuccessActivity;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.io.File;
import java.util.Objects;
import org.jmrtd.lds.ImageInfo;
import p040o.ActivityBuilder_ContributeTouchPointInputCidActivity;
import p040o.ActivityBuilder_ContributeTouchPointSelectAccountActivity;
import p040o.ActivityBuilder_ContributeTransferGiftingInputActivity;
import p040o.ActivityBuilder_ContributeVerifyIdentityActivity;
import p040o.ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.getDeviceFile;
import p040o.getOversizeImage;
import p040o.getRegistrationsAddresses;
import p040o.getTopLeftCornerWidth;
import p040o.getUuidUtf8Bytes;
import p040o.onCheckBoxClick;
import p040o.setImageOutListener;
import p040o.setTapText;

public class SuccessFragment extends BaseSuccessFragment implements getTopLeftCornerWidth.setForceShowIcon, ViewTreeObserver.OnGlobalLayoutListener, FragmentBuilder_BindBaseFragment {
    public CustomInputDialog IconCompatParcelizer;
    private boolean MediaBrowserCompat$MediaItem;
    private Uri MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat = false;
    private boolean MediaMetadataCompat = false;
    public getUuidUtf8Bytes RatingCompat;
    @BindView
    RecyclerView additionalRecyclerView;
    @BindView
    DefaultButton anotherTransactionButton;
    @BindView
    DefaultButton autoSaveOffDonationsSaveButton;
    @BindView
    DefaultButton autoSaveOffSaveButton;
    @BindView
    DefaultButton autoSaveOffShareButton;
    @BindView
    LinearLayout billLinearLayout;
    @BindView
    RelativeLayout billPaymentRelativeLayout;
    @BindView
    TextView coachmarkQRCodeSectionDescription;
    @BindView
    TextView coachmarkQRCodeSectionHeader;
    @BindView
    ImageView endSlipImage;
    @BindView
    ImageView expandIcon;
    @BindView
    View lineBlackView;
    @BindView
    View lineView;
    @BindView
    DefaultButton mFavouriteButton;
    @BindView
    ImageView mOverlayQRCodeSectionCoachmarkImageView;
    @BindView
    RelativeLayout mQRCodeSectionCoachmarkContainer;
    @BindView
    TextView mRemainingBalanceTextView;
    @BindView
    RelativeLayout mRootView;
    @BindView
    public TextView qrCodeDescriptionTextView;
    @BindView
    public ImageView qrCodeImageView;
    @BindView
    LinearLayout qrCodeLayout;
    @BindView
    public TextView qrCodeSectionHeaderTextView;
    @BindView
    LinearLayout qrCodeSectionView;
    @BindView
    public TextView refIdTextView;
    @BindView
    TextView returnTextView;
    @BindView
    TextView scheduleNote;
    @BindView
    DefaultButton shareButton;
    @BindView
    DefaultButton shareMomentButton;
    @BindView
    RelativeLayout slipRelativeLayout;
    @HmlPinActivity
    public setImageOutListener successPresenter;
    @HmlPinActivity
    public FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment successScreenshotHelper;

    public static SuccessFragment write(getUuidUtf8Bytes getuuidutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        SuccessFragment successFragment = new SuccessFragment();
        successFragment.setArguments(bundle);
        return successFragment;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 2131494246(0x7f0c0566, float:1.8611995E38)
            r3 = r23
            r4 = r24
            android.view.View r2 = r3.inflate(r2, r4, r1)
            android.os.Bundle r3 = r22.getArguments()
            if (r3 == 0) goto L_0x0385
            java.lang.String r4 = "com.scb.phone.EXTRA_SUCCESS"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            o.getUuidUtf8Bytes r3 = (p040o.getUuidUtf8Bytes) r3
            r0.RatingCompat = r3
            if (r3 == 0) goto L_0x0385
            o.setImageOutListener r3 = r0.successPresenter
            r3.MediaBrowserCompat$ItemReceiver(r0)
            o.getUuidUtf8Bytes r3 = r0.RatingCompat
            android.content.Context r4 = r22.getContext()
            r0.read(r3, r2, r4)
            o.getUuidUtf8Bytes r3 = r0.RatingCompat
            java.lang.String r3 = r3.MediaSessionCompat$ResultReceiverWrapper
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x004c
            o.getUuidUtf8Bytes r3 = r0.RatingCompat
            o.AutoValue_CrashlyticsReport_Session_Application r3 = r3.RatingCompat
            if (r3 == 0) goto L_0x004c
            o.getUuidUtf8Bytes r3 = r0.RatingCompat
            o.AutoValue_CrashlyticsReport_Session_Application r3 = r3.RatingCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r3 = r3.MediaBrowserCompat$ItemReceiver
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            o.getUuidUtf8Bytes r5 = r0.RatingCompat
            o.setUuidFromUtf8Bytes r5 = r5.PlaybackStateCompat
            o.getRamUsed r5 = r5.setShowingForActionMode
            r6 = 8
            if (r5 != 0) goto L_0x005f
            if (r3 != 0) goto L_0x006e
            o.setImageOutListener r5 = r0.successPresenter
            r5.write()
            goto L_0x006e
        L_0x005f:
            com.scb.phone.view.custom.common.DefaultButton r5 = r0.mFavouriteButton
            r5.setVisibility(r6)
            android.widget.TextView r5 = r0.mRemainingBalanceTextView
            r5.setVisibility(r6)
            android.widget.TextView r5 = r0.scheduleNote
            r5.setVisibility(r1)
        L_0x006e:
            android.widget.TextView r5 = r0.mRemainingBalanceTextView
            o.getUuidUtf8Bytes r7 = r0.RatingCompat
            o.setUuidFromUtf8Bytes r8 = r7.PlaybackStateCompat
            java.lang.String r8 = r8.MediaDescriptionCompat()
            java.lang.String r9 = "PP_SCB"
            boolean r8 = r9.equalsIgnoreCase(r8)
            java.lang.String r10 = "PURCHASE_CREDIT_CARD_FUNCTION"
            java.lang.String r11 = "rtp.payer"
            if (r8 != 0) goto L_0x00b0
            o.setUuidFromUtf8Bytes r8 = r7.PlaybackStateCompat
            java.lang.String r8 = r8.setOverflowReserved
            java.lang.String r12 = "PRESENT_TRANSFER_TYPE"
            boolean r8 = r12.equalsIgnoreCase(r8)
            if (r8 != 0) goto L_0x00b0
            o.setUuidFromUtf8Bytes r8 = r7.PlaybackStateCompat
            java.lang.String r8 = r8.MediaDescriptionCompat()
            boolean r8 = r11.equalsIgnoreCase(r8)
            if (r8 != 0) goto L_0x00b0
            o.setUuidFromUtf8Bytes r7 = r7.PlaybackStateCompat
            java.lang.String r7 = r7.MediaDescriptionCompat()
            boolean r7 = r10.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00b0
            r7 = 2131760419(0x7f101523, float:1.9151858E38)
            java.lang.String r7 = r0.getString(r7)
            goto L_0x00b7
        L_0x00b0:
            r7 = 2131760420(0x7f101524, float:1.915186E38)
            java.lang.String r7 = r0.getString(r7)
        L_0x00b7:
            r8 = 2
            java.lang.Object[] r12 = new java.lang.Object[r8]
            o.getUuidUtf8Bytes r13 = r0.RatingCompat
            o.setUuidFromUtf8Bytes r13 = r13.PlaybackStateCompat
            java.lang.String r13 = r13.MediaDescriptionCompat()
            int r14 = r13.hashCode()
            r16 = 6
            r17 = 4
            r18 = 7
            r19 = 5
            r20 = -1
            java.lang.String r8 = "TRANSFER"
            java.lang.String r15 = "PURCHASE_BILL_PAYMENT_FUNCTION"
            java.lang.String r6 = "rtp.requester"
            java.lang.String r4 = "BILLPAYMENT"
            java.lang.String r1 = "RTP_EBILL_PAYMENT_FUNCTION"
            r21 = r2
            java.lang.String r2 = "PURCHASE_TRANSFER_FUNCTION"
            switch(r14) {
                case -1927841485: goto L_0x0156;
                case -1844260907: goto L_0x014e;
                case -809785874: goto L_0x0145;
                case -658782923: goto L_0x013c;
                case -562916618: goto L_0x0131;
                case -522396193: goto L_0x0128;
                case -486974465: goto L_0x011f;
                case -445320196: goto L_0x0116;
                case -84093019: goto L_0x010b;
                case 51621: goto L_0x0101;
                case 80008848: goto L_0x00f6;
                case 467738251: goto L_0x00ec;
                case 2063509483: goto L_0x00e3;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            goto L_0x015f
        L_0x00e3:
            boolean r9 = r13.equals(r8)
            if (r9 == 0) goto L_0x015f
            r9 = 0
            goto L_0x0161
        L_0x00ec:
            boolean r9 = r13.equals(r15)
            if (r9 == 0) goto L_0x015f
            r9 = 10
            goto L_0x0161
        L_0x00f6:
            java.lang.String r9 = "TOPUP"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x015f
            r9 = 3
            goto L_0x0161
        L_0x0101:
            java.lang.String r9 = "3RD"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x015f
            r9 = 2
            goto L_0x0161
        L_0x010b:
            java.lang.String r9 = "PURCHASE_TOPUP_FUNCTION"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x015f
            r9 = 9
            goto L_0x0161
        L_0x0116:
            boolean r9 = r13.equals(r6)
            if (r9 == 0) goto L_0x015f
            r9 = r16
            goto L_0x0161
        L_0x011f:
            boolean r9 = r13.equals(r4)
            if (r9 == 0) goto L_0x015f
            r9 = r17
            goto L_0x0161
        L_0x0128:
            boolean r9 = r13.equals(r10)
            if (r9 == 0) goto L_0x015f
            r9 = 11
            goto L_0x0161
        L_0x0131:
            java.lang.String r9 = "LOANPAYMENT"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x015f
            r9 = r18
            goto L_0x0161
        L_0x013c:
            boolean r9 = r13.equals(r1)
            if (r9 == 0) goto L_0x015f
            r9 = r19
            goto L_0x0161
        L_0x0145:
            boolean r9 = r13.equals(r2)
            if (r9 == 0) goto L_0x015f
            r9 = 8
            goto L_0x0161
        L_0x014e:
            boolean r9 = r13.equals(r11)
            if (r9 == 0) goto L_0x015f
            r9 = 1
            goto L_0x0161
        L_0x0156:
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x015f
            r9 = 12
            goto L_0x0161
        L_0x015f:
            r9 = r20
        L_0x0161:
            switch(r9) {
                case 0: goto L_0x01af;
                case 1: goto L_0x01af;
                case 2: goto L_0x01a3;
                case 3: goto L_0x0197;
                case 4: goto L_0x018b;
                case 5: goto L_0x018b;
                case 6: goto L_0x017f;
                case 7: goto L_0x0173;
                case 8: goto L_0x0167;
                case 9: goto L_0x0167;
                case 10: goto L_0x0167;
                case 11: goto L_0x0167;
                case 12: goto L_0x0167;
                default: goto L_0x0164;
            }
        L_0x0164:
            java.lang.String r9 = ""
            goto L_0x01ba
        L_0x0167:
            r9 = 2131760221(0x7f10145d, float:1.9151456E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
            goto L_0x01ba
        L_0x0173:
            r9 = 2131758838(0x7f100ef6, float:1.9148651E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
            goto L_0x01ba
        L_0x017f:
            r9 = 2131760581(0x7f1015c5, float:1.9152187E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
            goto L_0x01ba
        L_0x018b:
            r9 = 2131756303(0x7f10050f, float:1.914351E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
            goto L_0x01ba
        L_0x0197:
            r9 = 2131761308(0x7f10189c, float:1.9153661E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
            goto L_0x01ba
        L_0x01a3:
            r9 = 2131757719(0x7f100a97, float:1.9146382E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
            goto L_0x01ba
        L_0x01af:
            r9 = 2131761356(0x7f1018cc, float:1.9153758E38)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r9 = r9.toLowerCase()
        L_0x01ba:
            r13 = 0
            r12[r13] = r9
            o.getUuidUtf8Bytes r9 = r0.RatingCompat
            java.lang.String r9 = r9.MediaSessionCompat$QueueItem
            r13 = 1
            r12[r13] = r9
            java.lang.String r7 = java.lang.String.format(r7, r12)
            r5.setText(r7)
            o.getUuidUtf8Bytes r5 = r0.RatingCompat
            java.lang.String r5 = r5.MediaBrowserCompat$MediaItem
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01dc
            com.scb.phone.view.custom.common.DefaultButton r5 = r0.mFavouriteButton
            r7 = 8
            r5.setVisibility(r7)
        L_0x01dc:
            o.getUuidUtf8Bytes r5 = r0.RatingCompat
            o.setUuidFromUtf8Bytes r5 = r5.PlaybackStateCompat
            java.lang.String r5 = r5.MediaDescriptionCompat()
            int r7 = r5.hashCode()
            switch(r7) {
                case -1844260907: goto L_0x0233;
                case -809785874: goto L_0x022a;
                case -658782923: goto L_0x0222;
                case -522396193: goto L_0x0219;
                case -486974465: goto L_0x0210;
                case -445320196: goto L_0x0208;
                case 467738251: goto L_0x01ff;
                case 499385956: goto L_0x01f5;
                case 2063509483: goto L_0x01ec;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            goto L_0x023b
        L_0x01ec:
            boolean r1 = r5.equals(r8)
            if (r1 == 0) goto L_0x023b
            r8 = r18
            goto L_0x023d
        L_0x01f5:
            java.lang.String r1 = "rtp.payer.notification"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x023b
            r8 = 2
            goto L_0x023d
        L_0x01ff:
            boolean r1 = r5.equals(r15)
            if (r1 == 0) goto L_0x023b
            r8 = r16
            goto L_0x023d
        L_0x0208:
            boolean r1 = r5.equals(r6)
            if (r1 == 0) goto L_0x023b
            r8 = 0
            goto L_0x023d
        L_0x0210:
            boolean r1 = r5.equals(r4)
            if (r1 == 0) goto L_0x023b
            r8 = 8
            goto L_0x023d
        L_0x0219:
            boolean r1 = r5.equals(r10)
            if (r1 == 0) goto L_0x023b
            r8 = r17
            goto L_0x023d
        L_0x0222:
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x023b
            r8 = 3
            goto L_0x023d
        L_0x022a:
            boolean r1 = r5.equals(r2)
            if (r1 == 0) goto L_0x023b
            r8 = r19
            goto L_0x023d
        L_0x0233:
            boolean r1 = r5.equals(r11)
            if (r1 == 0) goto L_0x023b
            r8 = 1
            goto L_0x023d
        L_0x023b:
            r8 = r20
        L_0x023d:
            r1 = 2131100257(0x7f060261, float:1.781289E38)
            switch(r8) {
                case 0: goto L_0x02d8;
                case 1: goto L_0x02be;
                case 2: goto L_0x02a3;
                case 3: goto L_0x0293;
                case 4: goto L_0x0293;
                case 5: goto L_0x0245;
                case 6: goto L_0x0245;
                case 7: goto L_0x0245;
                case 8: goto L_0x0245;
                default: goto L_0x0243;
            }
        L_0x0243:
            goto L_0x0346
        L_0x0245:
            o.getUuidUtf8Bytes r2 = r0.RatingCompat
            o.setUuidFromUtf8Bytes r2 = r2.PlaybackStateCompat
            o.CrashlyticsReport$Session$Event$Device r2 = r2.setShortcut
            if (r2 != 0) goto L_0x0346
            o.getUuidUtf8Bytes r2 = r0.RatingCompat
            java.lang.String r2 = r2.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == 0) goto L_0x0346
            o.getUuidUtf8Bytes r2 = r0.RatingCompat
            java.lang.String r2 = r2.MediaSessionCompat$ResultReceiverWrapper
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0346
            android.widget.RelativeLayout r2 = r0.mRootView
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnGlobalLayoutListener(r0)
            android.widget.LinearLayout r2 = r0.qrCodeLayout
            r4 = 0
            r2.setVisibility(r4)
            android.widget.TextView r2 = r0.refIdTextView
            o.getUuidUtf8Bytes r4 = r0.RatingCompat
            java.lang.String r4 = r4.ParcelableVolumeInfo
            r2.setText(r4)
            r22.AlertController$RecycleListView()
            o.getUuidUtf8Bytes r2 = r0.RatingCompat
            java.lang.String r2 = r2.MediaSessionCompat$ResultReceiverWrapper
            o.execute r4 = p040o.execute.M
            r5 = 500(0x1f4, float:7.0E-43)
            o.DebitCardResetOtpActivity r2 = p040o.getICheckDeserializerRtti.write(r2, r5, r5, r4)
            o.ActivityBuilder_ContributeTouchPointInstructionActivity r4 = new o.ActivityBuilder_ContributeTouchPointInstructionActivity
            r4.<init>(r0)
            o.ActivityBuilder_ContributeTouchPointPinActivity r5 = new o.ActivityBuilder_ContributeTouchPointPinActivity
            r5.<init>(r0)
            r2.subscribe(r4, r5)
            goto L_0x0346
        L_0x0293:
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.mFavouriteButton
            r4 = 8
            r2.setVisibility(r4)
            o.setImageOutListener r2 = r0.successPresenter
            o.getUuidUtf8Bytes r5 = r0.RatingCompat
            r2.read((p040o.getUuidUtf8Bytes) r5)
            goto L_0x0346
        L_0x02a3:
            r4 = 8
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.mFavouriteButton
            r2.setVisibility(r4)
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.anotherTransactionButton
            r5 = 0
            r2.setVisibility(r5)
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.anotherTransactionButton
            r6 = 2131761409(0x7f101901, float:1.9153866E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            goto L_0x0346
        L_0x02be:
            r4 = 8
            r5 = 0
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.mFavouriteButton
            r2.setVisibility(r4)
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.anotherTransactionButton
            r2.setVisibility(r5)
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.anotherTransactionButton
            r5 = 2131761411(0x7f101903, float:1.915387E38)
            java.lang.String r5 = r0.getString(r5)
            r2.setText(r5)
            goto L_0x0346
        L_0x02d8:
            r4 = 8
            android.content.Context r2 = r22.getContext()
            if (r2 == 0) goto L_0x0346
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.mFavouriteButton
            r2.setVisibility(r4)
            android.view.View r2 = r0.lineBlackView
            r2.setVisibility(r4)
            android.view.View r2 = r0.lineView
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.endSlipImage
            r2.setVisibility(r4)
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.anotherTransactionButton
            r4 = 0
            r2.setVisibility(r4)
            com.scb.phone.view.custom.common.DefaultButton r2 = r0.anotherTransactionButton
            r5 = 2131758874(0x7f100f1a, float:1.9148724E38)
            java.lang.String r5 = r0.getString(r5)
            r2.setText(r5)
            android.widget.TextView r2 = r0.returnTextView
            r5 = 2131761410(0x7f101902, float:1.9153868E38)
            java.lang.String r5 = r0.getString(r5)
            r2.setText(r5)
            android.widget.RelativeLayout r2 = r0.billPaymentRelativeLayout
            r2.setBackgroundResource(r4)
            android.widget.LinearLayout r2 = r0.billLinearLayout
            r2.setBackgroundResource(r4)
            android.widget.RelativeLayout r2 = r0.billPaymentRelativeLayout
            android.content.Context r4 = r22.getContext()
            r5 = 2131099768(0x7f060078, float:1.7811899E38)
            int r4 = p040o.setLastBaselineToBottomHeight.read(r4, r5)
            r2.setBackgroundColor(r4)
            android.widget.LinearLayout r2 = r0.billLinearLayout
            android.content.Context r4 = r22.getContext()
            int r4 = p040o.setLastBaselineToBottomHeight.read(r4, r1)
            r2.setBackgroundColor(r4)
            android.widget.RelativeLayout r2 = r0.slipRelativeLayout
            android.content.Context r4 = r22.getContext()
            int r4 = p040o.setLastBaselineToBottomHeight.read(r4, r1)
            r2.setBackgroundColor(r4)
        L_0x0346:
            if (r3 == 0) goto L_0x0387
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.userNote
            android.view.View r2 = r2.divider
            r3 = 0
            r2.setVisibility(r3)
            android.content.Context r2 = r22.getContext()
            androidx.recyclerview.widget.RecyclerView r3 = r0.additionalRecyclerView
            o.getUuidUtf8Bytes r4 = r0.RatingCompat
            o.AutoValue_CrashlyticsReport_Session_Application r4 = r4.RatingCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r4 = r4.MediaBrowserCompat$ItemReceiver
            r5 = 1
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.content.Context) r2, (androidx.recyclerview.widget.RecyclerView) r3, (java.util.List<p040o.CrashlyticsReport.Session.OperatingSystem.Builder>) r4, (p040o.FragmentBuilder_BindBaseFragment) r0, (boolean) r5)
            o.getUuidUtf8Bytes r2 = r0.RatingCompat
            boolean r2 = MediaBrowserCompat$ItemReceiver(r2)
            if (r2 == 0) goto L_0x0387
            androidx.fragment.app.FragmentActivity r2 = r22.getActivity()
            if (r2 == 0) goto L_0x0387
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.userNote
            android.view.View r2 = r2.divider
            r3 = 8
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r0.endSlipImage
            androidx.fragment.app.FragmentActivity r3 = r22.getActivity()
            int r1 = p040o.setLastBaselineToBottomHeight.read(r3, r1)
            r2.setBackgroundColor(r1)
            goto L_0x0387
        L_0x0385:
            r21 = r2
        L_0x0387:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.SuccessFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: J_ */
    public final void mo18708J_() {
        this.customTarget.setAddFavoriteButtonVisible(true);
    }

    /* renamed from: j_ */
    public final void mo18712j_(String str) {
        this.customTarget.setFavoriteName(str);
    }

    public final void MediaDescriptionCompat() {
        CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
        customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
        customTransferAndPayTarget.mFavouriteName.setVisibility(8);
        this.customTarget.setAddFavoriteButtonVisible(false);
    }

    public void onDestroy() {
        setImageOutListener setimageoutlistener = this.successPresenter;
        if (setimageoutlistener != null) {
            setimageoutlistener.onDestroy();
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity.read(this, i, iArr);
    }

    public final void IconCompatParcelizer(boolean z) {
        Context context = getContext();
        if (!isDetached() && context != null && !this.MediaBrowserCompat$MediaItem && this.RatingCompat.PlaybackStateCompat.setShowingForActionMode == null) {
            this.MediaBrowserCompat$MediaItem = !z;
            this.successScreenshotHelper.read(this.RatingCompat, context, true, z).subscribe(new ActivityBuilder_ContributeVerifyIdentityActivity(this), new ActivityBuilder_ContributeTouchPointInputCidActivity(this));
        }
    }

    private void write(File file) {
        if (file.isDirectory() && file.listFiles() != null) {
            for (File write : (File[]) Objects.requireNonNull(file.listFiles())) {
                write(write);
            }
        }
        try {
            file.deleteOnExit();
            onCheckBoxClick.IconCompatParcelizer("SuccessFragment: File deleted", new Object[0]);
        } catch (SecurityException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("SuccessFragment: File not deleted: ");
            sb.append(e.getMessage());
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), new Object[0]);
        }
    }

    public static void IconCompatParcelizer() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.MediaBrowserCompat$SearchResultReceiver;
        if (uri == null || uri.toString().isEmpty()) {
            read((int) R.string.share_error, getOversizeImage.ERROR);
            return;
        }
        if (getActivity() != null) {
            if (MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat)) {
                ((BaseActivity) getActivity()).scbAnalytics.write("share_slip_action", new ZSYR2K("source", "movie"));
            } else if (write()) {
                ((BaseActivity) getActivity()).scbAnalytics.write("billpay_slip", new ZSYR2K("source", AbsActionBarView()), new ZSYR2K("subtype", setVisibility()), new ZSYR2K("button", "share_slip"));
            } else {
                ((BaseActivity) getActivity()).mo13676d_("share_slip_action");
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", this.MediaBrowserCompat$SearchResultReceiver);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onAnotherTransferClick() {
        if (getActivity() instanceof SuccessActivity) {
            String MediaDescriptionCompat2 = this.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat();
            char c = 65535;
            int hashCode = MediaDescriptionCompat2.hashCode();
            if (hashCode != -1844260907) {
                if (hashCode != -445320196) {
                    if (hashCode == 499385956 && MediaDescriptionCompat2.equals("rtp.payer.notification")) {
                        c = 2;
                    }
                } else if (MediaDescriptionCompat2.equals("rtp.requester")) {
                    c = 0;
                }
            } else if (MediaDescriptionCompat2.equals("rtp.payer")) {
                c = 1;
            }
            if (c == 0) {
                Intent intent = new Intent(getContext(), EnterProxyActivity.class);
                intent.addFlags(603979776);
                intent.putExtra("com.scb.phone.Constants.RequestToPay.EXTRA_REQUESTER_REQ_STATUS", "ANOTHER");
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
                if (getActivity() != null) {
                    getActivity().finish();
                }
            } else if (c == 1) {
                Intent intent2 = new Intent(getContext(), SummaryDetailActivity.class);
                intent2.addFlags(603979776);
                intent2.putExtra("com.scb.phone.Constants.RequestToPay.EXTRA_REQUESTER_REQ_STATUS", "COMPLETED");
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        intent2 = setTapText.write(activity2, intent2).read();
                    }
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb2.append(intent2.getData());
                    sb2.append("\n with context ");
                    sb2.append(activity2.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                    startActivity(intent2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (getActivity() != null) {
                    getActivity().finish();
                }
            } else if (c == 2) {
                Intent intent3 = new Intent((SuccessActivity) getActivity(), HomeActivity.class);
                intent3.addFlags(268468224);
                intent3.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.notification_tab);
                intent3.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity3 = getActivity();
                    if (activity3 != null) {
                        intent3 = setTapText.write(activity3, intent3).read();
                    }
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb3 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb3.append(intent3.getData());
                    sb3.append("\n with context ");
                    sb3.append(activity3.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb3.toString());
                    startActivity(intent3);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                getActivity().finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    @OnClick
    @Optional
    public void onReturnHomeClick() {
        if (!(getActivity() instanceof SuccessActivity)) {
            return;
        }
        if (TextUtils.equals("rtp.requester", this.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
            Intent intent = new Intent(getContext(), EnterProxyActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.Constants.RequestToPay.EXTRA_REQUESTER_REQ_STATUS", "COMPLETED");
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
            getActivity().finish();
        } else if (TextUtils.equals("rtp.payer.notification", this.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
            Intent MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = ((SuccessActivity) getActivity()).mo15316x50fd9e4a();
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.addFlags(268468224);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = setTapText.write(activity2, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb2.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.getData());
                sb2.append("\n with context ");
                sb2.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                startActivity(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            getActivity().finish();
        } else {
            if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
                getActivity().finishAffinity();
            }
            Intent MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = ((SuccessActivity) getActivity()).mo15316x50fd9e4a();
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2 = setTapText.write(activity3, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb3 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb3.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2.getData());
                sb3.append("\n with context ");
                sb3.append(activity3.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb3.toString());
                startActivity(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver2);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onAddFavoriteClick() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
        String string = getString(R.string.favourite_name);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                SuccessFragment.this.IconCompatParcelizer.mErrorTextView.setVisibility(8);
            }
        });
        CustomInputDialog customInputDialog2 = this.IconCompatParcelizer;
        customInputDialog2.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.IconCompatParcelizer.setCanceledOnTouchOutside(false);
        this.IconCompatParcelizer.mEditTextView.setVisibility(0);
        CustomInputDialog customInputDialog3 = this.IconCompatParcelizer;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), ActivityBuilder_ContributeTouchPointSelectAccountActivity.IconCompatParcelizer);
        CustomInputDialog customInputDialog4 = this.IconCompatParcelizer;
        String string2 = getString(R.string.add_favourite);
        ActivityBuilder_ContributeTransferGiftingInputActivity activityBuilder_ContributeTransferGiftingInputActivity = new ActivityBuilder_ContributeTransferGiftingInputActivity(this);
        if (string2 != null) {
            customInputDialog4.mPositiveButton.setText(string2);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, activityBuilder_ContributeTransferGiftingInputActivity, false));
        }
        if (isAdded() && getContext() != null) {
            this.IconCompatParcelizer.show();
        }
    }

    /* renamed from: e_ */
    public final void mo18711e_(String str) {
        read((int) R.string.favourite_added_successfully, getOversizeImage.SUCCESS);
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
        this.customTarget.setFavoriteName(str);
        this.customTarget.setAddFavoriteButtonVisible(false);
    }

    /* renamed from: I_ */
    public final void mo18706I_() {
        this.MediaMetadataCompat = true;
        this.MediaDescriptionCompat = true;
        if (!this.RatingCompat.f2601x50fd9e4a) {
            this.shareButton.setVisibility(0);
            this.autoSaveOffSaveButton.setVisibility(8);
            this.autoSaveOffShareButton.setVisibility(8);
        } else {
            this.shareButton.setVisibility(8);
            this.shareMomentButton.setVisibility(0);
            this.autoSaveOffShareButton.setVisibility(0);
        }
        ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity.write(this, false);
    }

    /* renamed from: a_ */
    public final void mo18710a_(access$2200 access_2200) {
        String str;
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        if (customInputDialog != null) {
            if (access_2200.IconCompatParcelizer.length() > 0) {
                str = access_2200.IconCompatParcelizer;
            } else {
                str = access_2200.MediaBrowserCompat$ItemReceiver;
            }
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(str);
        }
    }

    public final void IconCompatParcelizer(getDeviceFile getdevicefile) {
        SharingMomentsPreviewActivity.read(getContext(), getdevicefile);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaDescriptionCompat = true;
        ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity.write(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipDonationsButton() {
        this.MediaDescriptionCompat = true;
        ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity.write(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void setShareMomentButton() {
        this.successPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
    }

    /* renamed from: G_ */
    public final void mo18704G_() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", AbsActionBarView()), new ZSYR2K("subtype", setVisibility()), new ZSYR2K("button", "share_moment")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpay_slip", zsyr2kArr);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void shareSlipButton() {
        onShareButtonClick();
    }

    private void read(int i, getOversizeImage getoversizeimage) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(i);
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.success_view_container, string, getoversizeimage);
            }
        }
    }

    @OnClick
    public void onClickQRCodeLayout() {
        if (this.qrCodeSectionView.getVisibility() == 8) {
            FragmentBuilder_BindDeejungPlansFragment.write(this.qrCodeSectionView);
        } else {
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.qrCodeSectionView);
        }
        FragmentBuilder_BindDeejungPlansFragment.read(this.expandIcon);
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @OnClick
    public void closeTutorial() {
        this.mRootView.removeView(this.mQRCodeSectionCoachmarkContainer);
        this.mRootView.removeView(this.mOverlayQRCodeSectionCoachmarkImageView);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (getContext() != null) {
            this.successPresenter.write();
        }
    }

    public static /* synthetic */ void read(SuccessFragment successFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = successFragment.getActivity();
        if (!successFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = successFragment.getActivity();
            if (activity2 != null) {
                String string = successFragment.getString(R.string.saved_slip_error);
                if (successFragment.getActivity() != null) {
                    ((BaseActivity) successFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(SuccessFragment successFragment, Uri uri) {
        successFragment.MediaBrowserCompat$SearchResultReceiver = uri;
        FragmentActivity activity = successFragment.getActivity();
        if (!uri.toString().isEmpty() && successFragment.getUserVisibleHint() && activity != null && successFragment.MediaDescriptionCompat) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = successFragment.getActivity();
            if (activity2 != null) {
                String string = successFragment.getString(R.string.saved_slip);
                if (successFragment.getActivity() != null) {
                    ((BaseActivity) successFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
            successFragment.MediaDescriptionCompat = false;
            if (successFragment.getContext() != null) {
                successFragment.write(new File(successFragment.getContext().getCacheDir(), "pullslip"));
            }
        }
    }

    /* renamed from: H_ */
    public final void mo18705H_() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            this.successScreenshotHelper.read(this.RatingCompat, context, this.MediaMetadataCompat, false).subscribe(new ActivityBuilder_ContributeVerifyIdentityActivity(this), new ActivityBuilder_ContributeTouchPointInputCidActivity(this));
        }
        this.MediaMetadataCompat = false;
        this.MediaDescriptionCompat = false;
        if (!this.RatingCompat.f2601x50fd9e4a) {
            this.autoSaveOffSaveButton.setVisibility(0);
            this.autoSaveOffShareButton.setVisibility(0);
            this.shareButton.setVisibility(8);
            return;
        }
        this.shareButton.setVisibility(8);
        this.shareMomentButton.setVisibility(0);
        this.autoSaveOffShareButton.setVisibility(0);
        this.autoSaveOffDonationsSaveButton.setVisibility(0);
    }
}
