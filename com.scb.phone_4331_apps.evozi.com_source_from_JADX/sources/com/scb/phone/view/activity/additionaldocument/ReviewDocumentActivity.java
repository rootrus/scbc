package com.scb.phone.view.activity.additionaldocument;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import com.scb.phone.view.activity.additionaldocument.ZoomDocumentActivity;
import com.scb.phone.view.activity.hml.HmlDocumentListActivity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.File;
import kotlin.TypeCastException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BillerDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C3785x9b905970;
import p040o.CheckSCBSEligibilityActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
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
import p040o.ServerExtractionParameters;
import p040o.SettingsJsonParser;
import p040o.SettingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.SettingsJsonParser$MediaBrowserCompat$MediaItem;
import p040o.SettingsJsonParser$MediaBrowserCompat$SearchResultReceiver;
import p040o.SettingsJsonParser$MediaSessionCompat$QueueItem;
import p040o.getLAR;
import p040o.getSupportImageTintMode;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class ReviewDocumentActivity extends BaseActivity implements getLAR {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    @BindView
    public TextView confirmTextView;
    @BindView
    public ImageView imageReview;
    @BindView
    public TextView infoText;
    @BindView
    public ConstraintLayout layout;
    @HmlPinActivity
    public SettingsJsonParser presenter;
    @BindView
    public View tapIcon;
    @BindView
    public View tapText;

    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
        private /* synthetic */ ReviewDocumentActivity MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(ReviewDocumentActivity reviewDocumentActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = reviewDocumentActivity;
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            onGetStartedClick.write((Object) bitmap, "img");
            return FragmentBuilder_BindDepositSelectorFragment.write((Context) this.MediaBrowserCompat$CustomActionResultReceiver, bitmap);
        }
    }

    static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        read(SettingsJsonParser settingsJsonParser) {
            super(1, settingsJsonParser);
        }

        public final String getName() {
            return "tiffPreviewCreationSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(SettingsJsonParser.class);
        }

        public final String getSignature() {
            return "tiffPreviewCreationSuccess(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "p1");
            SettingsJsonParser settingsJsonParser = (SettingsJsonParser) this.receiver;
            onGetStartedClick.write((Object) str, "imagePath");
            settingsJsonParser.MediaBrowserCompat$SearchResultReceiver = str;
            boolean z = true;
            if (settingsJsonParser.RatingCompat != null) {
                settingsJsonParser.RatingCompat.aj_();
            }
            writeUInt64NoTag.IconCompatParcelizer settingsJsonParser$MediaSessionCompat$QueueItem = new SettingsJsonParser$MediaSessionCompat$QueueItem(settingsJsonParser);
            if (settingsJsonParser.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settingsJsonParser$MediaSessionCompat$QueueItem.IconCompatParcelizer(settingsJsonParser.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class MediaDescriptionCompat<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
        private /* synthetic */ ReviewDocumentActivity read;

        MediaDescriptionCompat(ReviewDocumentActivity reviewDocumentActivity) {
            this.read = reviewDocumentActivity;
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            onGetStartedClick.write((Object) bitmap, "bitmap");
            return FragmentBuilder_BindDepositSelectorFragment.write((Context) this.read, bitmap);
        }
    }

    static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        MediaMetadataCompat(SettingsJsonParser settingsJsonParser) {
            super(1, settingsJsonParser);
        }

        public final String getName() {
            return "documentRotationSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(SettingsJsonParser.class);
        }

        public final String getSignature() {
            return "documentRotationSuccess(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "p1");
            ((SettingsJsonParser) this.receiver).write(str);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        RatingCompat(SettingsJsonParser settingsJsonParser) {
            super(1, settingsJsonParser);
        }

        public final String getName() {
            return "documentRotationError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(SettingsJsonParser.class);
        }

        public final String getSignature() {
            return "documentRotationError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            ((SettingsJsonParser) this.receiver).MediaDescriptionCompat(th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void setTapText(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.tapText = view;
    }

    public final void setTapIcon(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.tapIcon = view;
    }

    @OnClick
    public final void onRetakeClicked() {
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsJsonParser.read();
    }

    @OnClick
    public final void onDoneClicked() {
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (!settingsJsonParser.MediaMetadataCompat) {
            boolean z = true;
            if (settingsJsonParser.RatingCompat != null) {
                settingsJsonParser.RatingCompat.AlertController$RecycleListView();
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new SettingsJsonParser.IconCompatParcelizer(settingsJsonParser);
            if (settingsJsonParser.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(settingsJsonParser.RatingCompat);
            }
        }
    }

    @OnClick
    public final void onImageClicked() {
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (!settingsJsonParser.MediaMetadataCompat) {
            boolean z = true;
            settingsJsonParser.MediaMetadataCompat = true;
            writeUInt64NoTag.IconCompatParcelizer settingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver = new SettingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver(settingsJsonParser);
            if (settingsJsonParser.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(settingsJsonParser.RatingCompat);
            }
        }
    }

    @OnClick
    public final void onRotateClicked() {
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsJsonParser.MediaSessionCompat$QueueItem = (settingsJsonParser.MediaSessionCompat$QueueItem + 90) % 360;
        writeUInt64NoTag.IconCompatParcelizer settingsJsonParser$MediaBrowserCompat$MediaItem = new SettingsJsonParser$MediaBrowserCompat$MediaItem(settingsJsonParser);
        if (settingsJsonParser.RatingCompat != null) {
            settingsJsonParser$MediaBrowserCompat$MediaItem.IconCompatParcelizer(settingsJsonParser.RatingCompat);
        }
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79692131493194);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsJsonParser.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("IMAGE_PATH_TAG");
        SettingsJsonParser settingsJsonParser2 = this.presenter;
        if (settingsJsonParser2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "path");
        String stringExtra2 = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra3 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra5 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra5, "intent.getStringExtra(Constants.FLOW_TAG)");
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("FROM_GALLERY_TAG", false);
        boolean MediaBrowserCompat$MediaItem2 = FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$MediaItem(stringExtra);
        onGetStartedClick.write((Object) stringExtra, "path");
        onGetStartedClick.write((Object) stringExtra2, "applicationId");
        onGetStartedClick.write((Object) stringExtra3, "documentType");
        onGetStartedClick.write((Object) stringExtra4, "productType");
        onGetStartedClick.write((Object) stringExtra5, "flow");
        settingsJsonParser2.write = stringExtra2;
        settingsJsonParser2.MediaBrowserCompat$MediaItem = stringExtra;
        settingsJsonParser2.IconCompatParcelizer = stringExtra3;
        settingsJsonParser2.f2780x50fd9e4a = stringExtra4;
        settingsJsonParser2.MediaBrowserCompat$ItemReceiver = stringExtra5;
        settingsJsonParser2.read = booleanExtra;
        settingsJsonParser2.MediaDescriptionCompat = MediaBrowserCompat$MediaItem2;
        if (MediaBrowserCompat$MediaItem2) {
            if (settingsJsonParser2.RatingCompat != null) {
                settingsJsonParser2.RatingCompat.AlertController$RecycleListView();
            }
            writeUInt64NoTag.IconCompatParcelizer settingsJsonParser$MediaBrowserCompat$SearchResultReceiver = new SettingsJsonParser$MediaBrowserCompat$SearchResultReceiver(stringExtra);
            if (settingsJsonParser2.RatingCompat != null) {
                settingsJsonParser$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(settingsJsonParser2.RatingCompat);
            }
        } else {
            settingsJsonParser2.MediaBrowserCompat$SearchResultReceiver = stringExtra;
            writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new SettingsJsonParser.ParcelableVolumeInfo(settingsJsonParser2);
            if (settingsJsonParser2.RatingCompat != null) {
                parcelableVolumeInfo.IconCompatParcelizer(settingsJsonParser2.RatingCompat);
            }
        }
        String str = settingsJsonParser2.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flow");
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("hml", str, true)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3785x9b905970.MediaBrowserCompat$CustomActionResultReceiver;
            if (settingsJsonParser2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(settingsJsonParser2.RatingCompat);
            }
        }
        AppContextProvider.setContext(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, int i) {
        onGetStartedClick.write((Object) str, "path");
        WindowManager windowManager = getWindowManager();
        onGetStartedClick.IconCompatParcelizer((Object) windowManager, "windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        ExifInterface exifInterface = new ExifInterface(str);
        exifInterface.setAttribute("Orientation", i != 0 ? i != 90 ? i != 180 ? "8" : "3" : "6" : DiskLruCache.VERSION_1);
        exifInterface.saveAttributes();
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer2 = new FragmentBuilder_BindFundDetailSummaryFragment(Picasso.read(), Uri.fromFile(new File(str)), 0).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_CACHE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]);
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.read(i2, 0);
        ImageView imageView = this.imageReview;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageReview");
        }
        IconCompatParcelizer2.read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "path");
        WindowManager windowManager = getWindowManager();
        onGetStartedClick.IconCompatParcelizer((Object) windowManager, "windowManager");
        windowManager.getDefaultDisplay().getSize(new Point());
        BScanCNotificationDeepLinkActivity<Bitmap> IconCompatParcelizer2 = FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(str);
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        ReviewDeviceActivity reviewDeviceActivity = new ReviewDeviceActivity(IconCompatParcelizer2, iconCompatParcelizer);
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        DebitCardMarketConductDeepLinkActivity serverExtractionParameters = new ServerExtractionParameters(new read(settingsJsonParser));
        SettingsJsonParser settingsJsonParser2 = this.presenter;
        if (settingsJsonParser2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.MediaDescriptionCompat = reviewDeviceActivity.write(serverExtractionParameters, new ServerExtractionParameters(new ReviewDocumentActivity$MediaBrowserCompat$ItemReceiver(settingsJsonParser2)));
    }

    public void read(boolean z) {
        finish();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "path");
        ZoomDocumentActivity.write write2 = ZoomDocumentActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "path");
        Intent intent = new Intent(context, ZoomDocumentActivity.class);
        intent.putExtra("IMAGE_PATH_TAG", str);
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
    }

    public void write() {
        CaptureDocumentActivity.IconCompatParcelizer iconCompatParcelizer = CaptureDocumentActivity.MediaDescriptionCompat;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent MediaBrowserCompat$CustomActionResultReceiver = CaptureDocumentActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
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

    public final void read(String str, int i) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        onGetStartedClick.write((Object) str, "path");
        if (FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$MediaItem(str)) {
            Object systemService = getSystemService("activity");
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                int largeMemoryClass = activityManager.getLargeMemoryClass();
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                BScanCNotificationDeepLinkActivity<Bitmap> write2 = FragmentBuilder_BindDepositSelectorFragment.write(getIntent().getStringExtra("IMAGE_PATH_TAG"), i, largeMemoryClass, memoryInfo.totalMem - memoryInfo.threshold);
                DirectDebitDeepLinkActivity reviewDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = new C8706xae0289ef(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(reviewDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver, "mapper is null");
                ReviewDeviceActivity reviewDeviceActivity = new ReviewDeviceActivity(write2, reviewDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver);
                SettingsJsonParser settingsJsonParser = this.presenter;
                if (settingsJsonParser == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                DebitCardMarketConductDeepLinkActivity serverExtractionParameters = new ServerExtractionParameters(new MediaMetadataCompat(settingsJsonParser));
                SettingsJsonParser settingsJsonParser2 = this.presenter;
                if (settingsJsonParser2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                bulkTransferDeepLinkActivity = reviewDeviceActivity.write(serverExtractionParameters, new ServerExtractionParameters(new RatingCompat(settingsJsonParser2)));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
            }
        } else {
            BScanCNotificationDeepLinkActivity<Bitmap> MediaBrowserCompat$SearchResultReceiver2 = FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$SearchResultReceiver(getIntent().getStringExtra("IMAGE_PATH_TAG"));
            DirectDebitDeepLinkActivity mediaDescriptionCompat = new MediaDescriptionCompat(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(mediaDescriptionCompat, "mapper is null");
            ReviewDeviceActivity reviewDeviceActivity2 = new ReviewDeviceActivity(MediaBrowserCompat$SearchResultReceiver2, mediaDescriptionCompat);
            SettingsJsonParser settingsJsonParser3 = this.presenter;
            if (settingsJsonParser3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            DebitCardMarketConductDeepLinkActivity serverExtractionParameters2 = new ServerExtractionParameters(new ReviewDocumentActivity$MediaBrowserCompat$SearchResultReceiver(settingsJsonParser3));
            SettingsJsonParser settingsJsonParser4 = this.presenter;
            if (settingsJsonParser4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bulkTransferDeepLinkActivity = reviewDeviceActivity2.write(serverExtractionParameters2, new ServerExtractionParameters(new ReviewDocumentActivity$MediaBrowserCompat$MediaItem(settingsJsonParser4)));
        }
        this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
    }

    public void onResume() {
        super.onResume();
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsJsonParser.MediaMetadataCompat = false;
    }

    public void onDestroy() {
        super.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity2 != null) {
            bulkTransferDeepLinkActivity2.dispose();
        }
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsJsonParser.onDestroy();
    }

    public void onBackPressed() {
        SettingsJsonParser settingsJsonParser = this.presenter;
        if (settingsJsonParser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsJsonParser.read();
    }

    public final void write(String str, String str2, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) str, "titleError");
        onGetStartedClick.write((Object) str2, "errorDescription");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "actionConfirm");
        String string = getString(R.string.auto_kofax_rtti_retake);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_kofax_rtti_retake)");
        write(str, str2, string, new ReviewDocumentActivity$MediaSessionCompat$ResultReceiverWrapper(this, fundActionsSuccessActivity), (String) null, (FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity2) {
        onGetStartedClick.write((Object) str, "titleError");
        onGetStartedClick.write((Object) str2, "errorDescription");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "actionConfirm");
        onGetStartedClick.write((Object) fundActionsSuccessActivity2, "actionProceed");
        String string = getString(R.string.auto_kofax_rtti_retake);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_kofax_rtti_retake)");
        write(str, str2, string, new ReviewDocumentActivity$MediaSessionCompat$Token(this, fundActionsSuccessActivity), getString(R.string.auto_kofax_rtti_proceed), new C8707xf859f288(this, fundActionsSuccessActivity2));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        View view = this.tapIcon;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tapIcon");
        }
        view.setVisibility(0);
        View view2 = this.tapText;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tapText");
        }
        view2.setVisibility(0);
        TextView textView = this.infoText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("infoText");
        }
        textView.setText(R.string.auto_kofax_review_desc_2);
        getSupportImageTintMode getsupportimagetintmode = new getSupportImageTintMode();
        ConstraintLayout constraintLayout = this.layout;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layout");
        }
        int childCount = constraintLayout.getChildCount();
        getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.containsKey(Integer.valueOf(id))) {
                    getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(id), new getSupportImageTintMode.write((byte) 0));
                }
                getSupportImageTintMode.write write2 = getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(id));
                write2.read(id, constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
                write2.setMenu = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    write2.IconCompatParcelizer = childAt.getAlpha();
                    write2.setPrimaryBackground = childAt.getRotation();
                    write2.setStackedBackground = childAt.getRotationX();
                    write2.setSplitBackground = childAt.getRotationY();
                    write2.setTabContainer = childAt.getScaleX();
                    write2.ActionBarContainer = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        write2.setActionBarHideOffset = pivotX;
                        write2.setHasNonEmbeddedTabs = pivotY;
                    }
                    write2.setActionBarVisibilityCallback = childAt.getTranslationX();
                    write2.ActionBarOverlayLayout = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        write2.setShowingForActionMode = childAt.getTranslationZ();
                        if (write2.write) {
                            write2.MediaSessionCompat$QueueItem = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    write2.setItemInvoker = barrier.write.IconCompatParcelizer;
                    write2.setGroupDividerEnabled = barrier.MediaBrowserCompat$CustomActionResultReceiver();
                    write2.setPopupCallback = barrier.MediaBrowserCompat$ItemReceiver;
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        if (getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.containsKey(Integer.valueOf(R.id.tv_retake))) {
            getSupportImageTintMode.write write3 = getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(R.id.tv_retake));
            write3.MediaMetadataCompat = -1;
            write3.read = -1;
            write3.MediaBrowserCompat$CustomActionResultReceiver = -1;
            write3.setHasDecor = -1;
        }
        if (!getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.containsKey(Integer.valueOf(R.id.tv_retake))) {
            getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(R.id.tv_retake), new getSupportImageTintMode.write((byte) 0));
        }
        getSupportImageTintMode.write write4 = getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(R.id.tv_retake));
        write4.setHideOnContentScrollEnabled = 0;
        write4.setTransitioning = -1;
        write4.MediaBrowserCompat$ItemReceiver = -1;
        write4.setTitleOptional = 0;
        ConstraintLayout constraintLayout2 = this.layout;
        if (constraintLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layout");
        }
        getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver(constraintLayout2);
    }

    public final void read() {
        Intent MediaSessionCompat$Token = MediaSessionCompat$Token();
        MediaSessionCompat$Token.setFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaSessionCompat$Token).read();
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

    public Intent MediaSessionCompat$Token() {
        return new Intent(this, HmlDocumentListActivity.class);
    }

    private final void write(String str, String str2, String str3, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity, String str4, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity2) {
        HmlCommonCustomDialog hmlCommonCustomDialog = new HmlCommonCustomDialog(this);
        hmlCommonCustomDialog.setOnDismissListener(this);
        hmlCommonCustomDialog.IconCompatParcelizer(str);
        hmlCommonCustomDialog.read(str2);
        hmlCommonCustomDialog.MediaBrowserCompat$ItemReceiver(str3, fundActionsSuccessActivity);
        hmlCommonCustomDialog.write(str4, fundActionsSuccessActivity2);
        hmlCommonCustomDialog.setCancelable(false);
        hmlCommonCustomDialog.show();
    }
}
