package com.scb.phone.view.activity.additionaldocument;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import com.scb.phone.view.activity.additionaldocument.ReviewDocumentActivity;
import com.scb.phone.view.activity.hml.submission.C5634xbe8cfba3;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionTutorialsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckSCBSEligibilityActivity;
import p040o.CircularRevealCardView;
import p040o.CrashlyticsController;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.GoodToKnowActivity;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ReviewDeviceActivity;
import p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver;
import p040o.SettingsController;
import p040o.SettingsController$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.SettingsController$MediaBrowserCompat$SearchResultReceiver;
import p040o.SettingsController$MediaSessionCompat$QueueItem;
import p040o.SettingsController$MediaSessionCompat$Token;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getChequeStatusIssueDetail;
import p040o.getTopRightCornerHeight;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzcz;
import p040o.zzvb;

public class CropDocumentActivity extends BaseActivity implements getTopRightCornerHeight {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);
    private final boolean MediaBrowserCompat$SearchResultReceiver;
    private final boolean MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private final boolean MediaSessionCompat$ResultReceiverWrapper;
    private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
    @BindView
    public ImgReviewEditCntrl imageReview;
    @BindView
    public TextView instructionsInfoText;
    @HmlPinActivity
    public SettingsController presenter;
    @BindView
    public TextView retakeButton;
    @BindView
    public View rootView;
    @BindView
    public TextView seeInstructionsButton;

    static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        IconCompatParcelizer(SettingsController settingsController) {
            super(1, settingsController);
        }

        public final String getName() {
            return "analysisCompleteError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(SettingsController.class);
        }

        public final String getSignature() {
            return "analysisCompleteError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            ((SettingsController) this.receiver).MediaMetadataCompat(th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Image> {
        private /* synthetic */ CropDocumentActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(CropDocumentActivity cropDocumentActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = cropDocumentActivity;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            Image image = (Image) obj;
            ImgReviewEditCntrl imgReviewEditCntrl = this.MediaBrowserCompat$CustomActionResultReceiver.imageReview;
            if (imgReviewEditCntrl == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
            }
            imgReviewEditCntrl.setImage(image);
            ImgReviewEditCntrl imgReviewEditCntrl2 = this.MediaBrowserCompat$CustomActionResultReceiver.imageReview;
            if (imgReviewEditCntrl2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
            }
            onGetStartedClick.IconCompatParcelizer((Object) image, "image");
            QuickAnalysisFeedback imageQuickAnalysisFeedBack = image.getImageQuickAnalysisFeedBack();
            onGetStartedClick.IconCompatParcelizer((Object) imageQuickAnalysisFeedBack, "image.imageQuickAnalysisFeedBack");
            imgReviewEditCntrl2.setCropTetragon(imageQuickAnalysisFeedBack.getTetragonCorners());
            CropDocumentActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, image);
        }
    }

    static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        MediaMetadataCompat(SettingsController settingsController) {
            super(1, settingsController);
        }

        public final String getName() {
            return "documentProcessSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(SettingsController.class);
        }

        public final String getSignature() {
            return "documentProcessSuccess(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "p1");
            ((SettingsController) this.receiver).read(str);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        RatingCompat(SettingsController settingsController) {
            super(1, settingsController);
        }

        public final String getName() {
            return "documentProcessError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(SettingsController.class);
        }

        public final String getSignature() {
            return "documentProcessError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            SettingsController settingsController = (SettingsController) this.receiver;
            onGetStartedClick.write((Object) th, "error");
            settingsController.MediaBrowserCompat$ItemReceiver(settingsController.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void setRootView(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.rootView = view;
    }

    @OnClick
    public final void onDoneClicked() {
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = false;
        if (settingsController.RatingCompat != null) {
            settingsController.RatingCompat.AlertController$RecycleListView();
        }
        String str = settingsController.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HML", true)) {
            String str2 = settingsController.MediaBrowserCompat$ItemReceiver;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str2, "SALARY", true)) {
                writeUInt64NoTag.IconCompatParcelizer settingsController$MediaBrowserCompat$SearchResultReceiver = new SettingsController$MediaBrowserCompat$SearchResultReceiver(settingsController);
                if (settingsController.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    settingsController$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(settingsController.RatingCompat);
                    return;
                }
                return;
            }
        }
        writeUInt64NoTag.IconCompatParcelizer settingsController$MediaSessionCompat$QueueItem = new SettingsController$MediaSessionCompat$QueueItem(settingsController);
        if (settingsController.RatingCompat != null) {
            z = true;
        }
        if (z) {
            settingsController$MediaSessionCompat$QueueItem.IconCompatParcelizer(settingsController.RatingCompat);
        }
    }

    @OnClick
    public final void onRetakeClicked() {
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsController.read();
    }

    @OnClick
    public final void onSeeInstructionsClicked() {
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new SettingsController.ParcelableVolumeInfo(settingsController);
        if (settingsController.RatingCompat != null) {
            parcelableVolumeInfo.IconCompatParcelizer(settingsController.RatingCompat);
        }
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent read(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "applicationId");
            onGetStartedClick.write((Object) str2, "path");
            onGetStartedClick.write((Object) str3, "documentType");
            onGetStartedClick.write((Object) str4, "productType");
            onGetStartedClick.write((Object) str5, "flow");
            Intent intent = new Intent(context, CropDocumentActivity.class);
            intent.putExtra("IMAGE_PATH_TAG", str2);
            intent.putExtra("APPLICATION_ID_TAG", str);
            intent.putExtra("DOCUMENT_TYPE_TAG", str3);
            intent.putExtra("PRODUCT_TYPE_TAG", str4);
            intent.putExtra("FLOW_TAG", str5);
            intent.putExtra("FROM_GALLERY_TAG", z);
            return intent;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77212131492946);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsController.MediaBrowserCompat$ItemReceiver(this);
        SettingsController settingsController2 = this.presenter;
        if (settingsController2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stringExtra = getIntent().getStringExtra("IMAGE_PATH_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(IMAGE_PATH_TAG)");
        String stringExtra2 = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(APPLICATION_ID_TAG)");
        String stringExtra3 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(DOCUMENT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(PRODUCT_TYPE_TAG)");
        String stringExtra5 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra5, "intent.getStringExtra(FLOW_TAG)");
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("FROM_GALLERY_TAG", false);
        onGetStartedClick.write((Object) stringExtra, "path");
        onGetStartedClick.write((Object) stringExtra2, "applicationId");
        onGetStartedClick.write((Object) stringExtra3, "documentType");
        onGetStartedClick.write((Object) stringExtra4, "productType");
        onGetStartedClick.write((Object) stringExtra5, "flowType");
        settingsController2.read = stringExtra2;
        settingsController2.MediaDescriptionCompat = stringExtra;
        settingsController2.MediaBrowserCompat$ItemReceiver = stringExtra3;
        settingsController2.MediaBrowserCompat$SearchResultReceiver = stringExtra4;
        settingsController2.IconCompatParcelizer = stringExtra5;
        settingsController2.write = booleanExtra;
        if (settingsController2.RatingCompat != null) {
            settingsController2.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer settingsController$MediaSessionCompat$Token = new SettingsController$MediaSessionCompat$Token(stringExtra);
        if (settingsController2.RatingCompat != null) {
            settingsController$MediaSessionCompat$Token.IconCompatParcelizer(settingsController2.RatingCompat);
        }
        String str = settingsController2.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HML", true)) {
            writeUInt64NoTag.IconCompatParcelizer sethasdecor = new SettingsController.setHasDecor(stringExtra3);
            if (settingsController2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                sethasdecor.IconCompatParcelizer(settingsController2.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer() {
        ImgReviewEditCntrl imgReviewEditCntrl = this.imageReview;
        if (imgReviewEditCntrl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        imgReviewEditCntrl.showCropRectangle(true);
        ImgReviewEditCntrl imgReviewEditCntrl2 = this.imageReview;
        if (imgReviewEditCntrl2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        Context context = this;
        imgReviewEditCntrl2.setCropLineColor(setLastBaselineToBottomHeight.read(context, R.color.f65752131099729));
        ImgReviewEditCntrl imgReviewEditCntrl3 = this.imageReview;
        if (imgReviewEditCntrl3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        imgReviewEditCntrl3.setCropCornerColor(setLastBaselineToBottomHeight.read(context, R.color.f65752131099729));
        TextView textView = this.seeInstructionsButton;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("seeInstructionsButton");
        }
        String string = getString(R.string.auto_kofax_crop_instruction_text);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(string, 0));
        } else {
            textView.setText(Html.fromHtml(string));
        }
    }

    public void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        ReviewDocumentActivity.write write2 = ReviewDocumentActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        Intent intent = new Intent(context, ReviewDocumentActivity.class);
        intent.putExtra("IMAGE_PATH_TAG", str);
        intent.putExtra("APPLICATION_ID_TAG", str2);
        intent.putExtra("DOCUMENT_TYPE_TAG", str3);
        intent.putExtra("PRODUCT_TYPE_TAG", str4);
        intent.putExtra("FLOW_TAG", str5);
        intent.putExtra("FROM_GALLERY_TAG", z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        finish();
    }

    public void write(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        CaptureDocumentActivity.IconCompatParcelizer iconCompatParcelizer = CaptureDocumentActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$CustomActionResultReceiver = CaptureDocumentActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this, str, str2, str3, str4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "path");
        BScanCNotificationDeepLinkActivity<Image> MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(str);
        DebitCardMarketConductDeepLinkActivity write2 = new write(this);
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.MediaSessionCompat$Token = MediaBrowserCompat$CustomActionResultReceiver.write(write2, new DebitCardMarketConductDeepLinkActivity() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onGetStartedClick.IconCompatParcelizer(FundFactSheetActivity.this.invoke(obj), "invoke(...)");
            }
        });
    }

    public final void IconCompatParcelizer(String str, String str2) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "documentType");
        Context context = this;
        ImgReviewEditCntrl imgReviewEditCntrl = this.imageReview;
        if (imgReviewEditCntrl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        Image image = imgReviewEditCntrl.getImage();
        ImgReviewEditCntrl imgReviewEditCntrl2 = this.imageReview;
        if (imgReviewEditCntrl2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        BScanCNotificationDeepLinkActivity<zzvb> MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, image, str, imgReviewEditCntrl2.getCropTetragon());
        DirectDebitDeepLinkActivity cropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = new C8702xba928327(this, str2);
        HmlLatestPersonalInformationDeepLinkActivity.write(cropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver, "mapper is null");
        ReviewDeviceActivity reviewDeviceActivity = new ReviewDeviceActivity(MediaBrowserCompat$CustomActionResultReceiver, cropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver);
        DebitCardMarketConductDeepLinkActivity cropDocumentActivity$MediaBrowserCompat$ItemReceiver = new CropDocumentActivity$MediaBrowserCompat$ItemReceiver(this);
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.MediaSessionCompat$Token = reviewDeviceActivity.write(cropDocumentActivity$MediaBrowserCompat$ItemReceiver, new DebitCardMarketConductDeepLinkActivity() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onGetStartedClick.IconCompatParcelizer(FundFactSheetActivity.this.invoke(obj), "invoke(...)");
            }
        });
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "imagePath");
        Context context = this;
        ImgReviewEditCntrl imgReviewEditCntrl = this.imageReview;
        if (imgReviewEditCntrl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        Image image = imgReviewEditCntrl.getImage();
        ImgReviewEditCntrl imgReviewEditCntrl2 = this.imageReview;
        if (imgReviewEditCntrl2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        BScanCNotificationDeepLinkActivity<zzvb> MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, image, str, imgReviewEditCntrl2.getCropTetragon());
        DirectDebitDeepLinkActivity cropDocumentActivity$MediaBrowserCompat$SearchResultReceiver = new CropDocumentActivity$MediaBrowserCompat$SearchResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(cropDocumentActivity$MediaBrowserCompat$SearchResultReceiver, "mapper is null");
        ReviewDeviceActivity reviewDeviceActivity = new ReviewDeviceActivity(MediaBrowserCompat$CustomActionResultReceiver, cropDocumentActivity$MediaBrowserCompat$SearchResultReceiver);
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        DebitCardMarketConductDeepLinkActivity r2 = new DebitCardMarketConductDeepLinkActivity() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onGetStartedClick.IconCompatParcelizer(FundFactSheetActivity.this.invoke(obj), "invoke(...)");
            }
        };
        SettingsController settingsController2 = this.presenter;
        if (settingsController2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.MediaSessionCompat$Token = reviewDeviceActivity.write(r2, new DebitCardMarketConductDeepLinkActivity() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onGetStartedClick.IconCompatParcelizer(FundFactSheetActivity.this.invoke(obj), "invoke(...)");
            }
        });
    }

    private final void MediaBrowserCompat$ItemReceiver(boolean z, int i, int i2, int i3, int i4) {
        access$2200 access_2200 = new access$2200();
        if (!z) {
            i3 = i4;
        }
        access_2200.IconCompatParcelizer = getString(i3);
        if (!z) {
            i = i2;
        }
        access_2200.MediaBrowserCompat$ItemReceiver = getString(i);
        if (z) {
            access$2300 access_2300 = new access$2300();
            access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
            access_2300.read = access$2300.write.CUSTOM;
            access_2300.MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat(this);
            access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        } else {
            access$2300 access_23002 = new access$2300();
            access_23002.MediaBrowserCompat$ItemReceiver = getString(R.string.crop_document_error_button_proceed);
            access_23002.read = access$2300.write.JUST_DISMISS;
            access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_23002;
            access$2300 access_23003 = new access$2300();
            access_23003.MediaBrowserCompat$ItemReceiver = getString(R.string.crop_document_error_button_retake);
            access_23003.read = access$2300.write.CUSTOM;
            access_23003.MediaBrowserCompat$CustomActionResultReceiver = new ParcelableVolumeInfo(this);
            access_2200.write = access_23003;
        }
        write(access_2200);
    }

    static final class MediaDescriptionCompat implements Runnable {
        private /* synthetic */ CropDocumentActivity read;

        MediaDescriptionCompat(CropDocumentActivity cropDocumentActivity) {
            this.read = cropDocumentActivity;
        }

        public final void run() {
            SettingsController settingsController = this.read.presenter;
            if (settingsController == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = settingsController.IconCompatParcelizer;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
            }
            if (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HML", true)) {
                settingsController.read();
            }
        }
    }

    static final class ParcelableVolumeInfo implements Runnable {
        private /* synthetic */ CropDocumentActivity read;

        ParcelableVolumeInfo(CropDocumentActivity cropDocumentActivity) {
            this.read = cropDocumentActivity;
        }

        public final void run() {
            SettingsController settingsController = this.read.presenter;
            if (settingsController == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = settingsController.IconCompatParcelizer;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
            }
            if (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HML", true)) {
                settingsController.read();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsController.BlockingCrashEventListener blockingCrashEventListener, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity2) {
        onGetStartedClick.write((Object) blockingCrashEventListener, "display");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "retakeAction");
        onGetStartedClick.write((Object) fundActionsSuccessActivity2, "proceedAction");
        new getChequeStatusIssueDetail(this, blockingCrashEventListener, fundActionsSuccessActivity, fundActionsSuccessActivity2).show();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        TextView textView = this.seeInstructionsButton;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("seeInstructionsButton");
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void read() {
        TextView textView = this.retakeButton;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("retakeButton");
        }
        textView.setVisibility(8);
        View view = this.rootView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootView");
        }
        view.setBackgroundColor(setLastBaselineToBottomHeight.read(this, R.color.f65762131099730));
        TextView textView2 = this.instructionsInfoText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("instructionsInfoText");
        }
        textView2.setText(R.string.auto_kofax_crop_desc);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        Intent read2 = read(this, str2, str, str3, str4, str5, z);
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
    }

    public final void IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flowType");
        Intent IconCompatParcelizer2 = IconCompatParcelizer(this, str2, str, str3, str4, str5, z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onBackPressed() {
        SettingsController settingsController = this.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = settingsController.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        if (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HML", true)) {
            settingsController.read();
        }
    }

    public void onDestroy() {
        ImgReviewEditCntrl imgReviewEditCntrl = this.imageReview;
        if (imgReviewEditCntrl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        if (imgReviewEditCntrl.getImage() != null) {
            ImgReviewEditCntrl imgReviewEditCntrl2 = this.imageReview;
            if (imgReviewEditCntrl2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
            }
            imgReviewEditCntrl2.getImage().imageClearBitmap();
            ImgReviewEditCntrl imgReviewEditCntrl3 = this.imageReview;
            if (imgReviewEditCntrl3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
            }
            imgReviewEditCntrl3.clearImage();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaSessionCompat$Token;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onDestroy();
    }

    public Intent read(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5634xbe8cfba3 hmlDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentSubmissionTutorialsActivity.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        onGetStartedClick.write((Object) str2, "path");
        Intent MediaBrowserCompat$ItemReceiver = C5634xbe8cfba3.MediaBrowserCompat$ItemReceiver(context, str, str3, str4, str5);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "CROP_TUTORIAL_STEP");
        MediaBrowserCompat$ItemReceiver.putExtra("IMAGE_PATH_TAG", str2);
        MediaBrowserCompat$ItemReceiver.putExtra("FROM_GALLERY_TAG", z);
        MediaBrowserCompat$ItemReceiver.putExtra("ENABLE_NAVIGATION_TAG", false);
        return MediaBrowserCompat$ItemReceiver;
    }

    public Intent IconCompatParcelizer(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5634xbe8cfba3 hmlDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentSubmissionTutorialsActivity.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        onGetStartedClick.write((Object) str2, "path");
        Intent MediaBrowserCompat$ItemReceiver = C5634xbe8cfba3.MediaBrowserCompat$ItemReceiver(context, str, str3, str4, str5);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "REVIEW_TUTORIAL_STEP");
        MediaBrowserCompat$ItemReceiver.putExtra("IMAGE_PATH_TAG", str2);
        MediaBrowserCompat$ItemReceiver.putExtra("FROM_GALLERY_TAG", z);
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final /* synthetic */ void IconCompatParcelizer(CropDocumentActivity cropDocumentActivity, Image image) {
        QuickAnalysisFeedback imageQuickAnalysisFeedBack = image.getImageQuickAnalysisFeedBack();
        SettingsController settingsController = cropDocumentActivity.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) imageQuickAnalysisFeedBack, "feedback");
        boolean isBlurry = imageQuickAnalysisFeedBack.isBlurry();
        boolean isUndersaturated = imageQuickAnalysisFeedBack.isUndersaturated();
        boolean isLowContrastBackground = imageQuickAnalysisFeedBack.isLowContrastBackground();
        boolean isMissingBorders = imageQuickAnalysisFeedBack.isMissingBorders();
        boolean isOversaturated = imageQuickAnalysisFeedBack.isOversaturated();
        String str = settingsController.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        boolean z = true;
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HML", true)) {
            CircularRevealCardView circularRevealCardView = settingsController.MediaBrowserCompat$MediaItem;
            zzcz.zza.C10765zza zza = new zzcz.zza.C10765zza(isBlurry, isMissingBorders, isLowContrastBackground, isOversaturated, isUndersaturated);
            onGetStartedClick.write((Object) zza, "feedback");
            circularRevealCardView.write.MediaBrowserCompat$CustomActionResultReceiver(zza);
            if (isUndersaturated || isLowContrastBackground || isMissingBorders || isOversaturated) {
                writeUInt64NoTag.IconCompatParcelizer settingsController$MediaBrowserCompat$CustomActionResultReceiver = new SettingsController$MediaBrowserCompat$CustomActionResultReceiver(settingsController, isLowContrastBackground, isUndersaturated, isOversaturated, isMissingBorders);
                if (settingsController.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    settingsController$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(settingsController.RatingCompat);
                    return;
                }
                return;
            }
            if (settingsController.RatingCompat != null) {
                settingsController.RatingCompat.aj_();
            }
            writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new SettingsController.ParcelableVolumeInfo(settingsController);
            if (settingsController.RatingCompat == null) {
                z = false;
            }
            if (z) {
                parcelableVolumeInfo.IconCompatParcelizer(settingsController.RatingCompat);
            }
        } else if (isBlurry) {
            settingsController.MediaMetadataCompat(new Throwable(RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver.BLURRY.error));
        } else if (isLowContrastBackground) {
            settingsController.MediaMetadataCompat(new Throwable(RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver.LOW_CONTRAST.error));
        } else if (isUndersaturated || isOversaturated) {
            settingsController.MediaMetadataCompat(new Throwable(RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver.WRONG_SATURATION.error));
        } else {
            if (settingsController.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settingsController.RatingCompat.aj_();
            }
        }
    }

    public final void write() {
        MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, R.string.error_default_title, R.string.crop_document_warning_title, R.string.crop_document_error_blurry, R.string.crop_document_warning_blurry);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, R.string.error_default_title, R.string.crop_document_warning_title, R.string.crop_document_error_low_contrast, R.string.crop_document_warning_low_contrast);
    }

    public final void MediaMetadataCompat() {
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver, R.string.error_default_title, R.string.crop_document_warning_title, R.string.crop_document_error_missing_borders, R.string.crop_document_warning_missing_borders);
    }

    public final void RatingCompat() {
        MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$ResultReceiverWrapper, R.string.error_default_title, R.string.crop_document_warning_title, R.string.crop_document_error_saturation, R.string.crop_document_warning_saturation);
    }

    public final void MediaBrowserCompat$MediaItem() {
        MediaBrowserCompat$ItemReceiver(true, R.string.crop_document_error_wrong_file_title, R.string.crop_document_error_wrong_file_title, R.string.crop_document_error_wrong_file, R.string.crop_document_error_wrong_file);
    }
}
