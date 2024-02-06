package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.squareup.picasso.Picasso$MediaBrowserCompat$CustomActionResultReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Calendar;
import org.jmrtd.lds.ImageInfo;
import p040o.AnimatorListener;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.BankingServicesDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.HmlETBLandingActivity;
import p040o.IIdExtractor;
import p040o.IIdExtractor$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBuildVersion;
import p040o.getOversizeImage;
import p040o.getWeekDayTextAppearance;
import p040o.onAnimationEnd;
import p040o.onCheckBoxClick;
import p040o.onDrawColor;
import p040o.onStart;
import p040o.setTapText;

public class MwCreateQrActivity extends BaseActivity implements IIdExtractor.write {
    public IIdExtractor$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private Uri MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    @BindView
    CustomTransferAndPayItem amountItem;
    @BindView
    public ImageView imageShopCover;
    @BindView
    LinearLayout layoutDynamicAmount;
    @BindView
    public ConstraintLayout layoutEmptyShopCover;
    @BindView
    LinearLayout layoutShopRefence;
    @BindView
    ImageView qrCodeImageView;
    @BindView
    View separator1;
    @BindView
    View separator2;
    @BindView
    TextView shopReferenceValue;
    @BindView
    TextView tvAccountName;
    @BindView
    TextView tvAmount;
    @BindView
    TextView tvDailyLimit;
    @BindView
    TextView tvNameEN;
    @BindView
    TextView tvNameTH;
    @BindView
    TextView tvPayWalletId;

    public class MwScreenshotDisplay_ViewBinding implements Unbinder {
        private MwScreenshotDisplay MediaBrowserCompat$CustomActionResultReceiver;

        public MwScreenshotDisplay_ViewBinding(MwScreenshotDisplay mwScreenshotDisplay, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mwScreenshotDisplay;
            mwScreenshotDisplay.qrCodeImageViewScreen = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_qr_code, "field 'qrCodeImageViewScreen'", ImageView.class);
            mwScreenshotDisplay.imageShopCoverScreen = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_shop_cover, "field 'imageShopCoverScreen'", ImageView.class);
            mwScreenshotDisplay.tvPayWalletIdScreen = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_pay_wallet_id, "field 'tvPayWalletIdScreen'", TextView.class);
            mwScreenshotDisplay.shopNoteItemScreen = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.shop_reference, "field 'shopNoteItemScreen'", CustomTransferAndPayItem.class);
            mwScreenshotDisplay.amountItemScreen = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amountItemScreen'", CustomTransferAndPayItem.class);
            mwScreenshotDisplay.tvNameTHScreen = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_name_th, "field 'tvNameTHScreen'", TextView.class);
            mwScreenshotDisplay.tvNameENScreen = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_name_en, "field 'tvNameENScreen'", TextView.class);
            mwScreenshotDisplay.tvAmountScreen = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'tvAmountScreen'", TextView.class);
            mwScreenshotDisplay.tvAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name, "field 'tvAccountName'", TextView.class);
            mwScreenshotDisplay.layoutDynamicAmountScreen = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_dynamic_amount, "field 'layoutDynamicAmountScreen'", LinearLayout.class);
            mwScreenshotDisplay.separator1Screen = onStart.IconCompatParcelizer(view, R.id.separator1, "field 'separator1Screen'");
            mwScreenshotDisplay.separator2Screen = onStart.IconCompatParcelizer(view, R.id.separator2, "field 'separator2Screen'");
        }

        public final void read() {
            MwScreenshotDisplay mwScreenshotDisplay = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (mwScreenshotDisplay != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                mwScreenshotDisplay.qrCodeImageViewScreen = null;
                mwScreenshotDisplay.imageShopCoverScreen = null;
                mwScreenshotDisplay.tvPayWalletIdScreen = null;
                mwScreenshotDisplay.shopNoteItemScreen = null;
                mwScreenshotDisplay.amountItemScreen = null;
                mwScreenshotDisplay.tvNameTHScreen = null;
                mwScreenshotDisplay.tvNameENScreen = null;
                mwScreenshotDisplay.tvAmountScreen = null;
                mwScreenshotDisplay.tvAccountName = null;
                mwScreenshotDisplay.layoutDynamicAmountScreen = null;
                mwScreenshotDisplay.separator1Screen = null;
                mwScreenshotDisplay.separator2Screen = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, MwCreateQrActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78832131493108);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_create_qr_title);
        setTabContainer();
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this);
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        getWeekDayTextAppearance.write(this, false);
    }

    public final void read(Bitmap bitmap) {
        this.qrCodeImageView.setImageBitmap(bitmap);
    }

    public final void write(String str) {
        this.layoutDynamicAmount.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
        this.tvAmount.setText(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.amountItem.setVisibility(z ? 0 : 8);
        this.amountItem.setValue(getString(R.string.mw_create_qr_amount));
        this.amountItem.mDividerView.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str) {
        this.layoutEmptyShopCover.setVisibility(8);
        this.imageShopCover.setVisibility(0);
        FragmentBuilder_BindDepositSelectorFragment.read(str, this.imageShopCover, (Picasso$MediaBrowserCompat$CustomActionResultReceiver) new onDrawColor(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.imageShopCover.setVisibility(8);
        this.layoutEmptyShopCover.setVisibility(0);
    }

    public final void read() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        MediaBrowserCompat$CustomActionResultReceiver.addFlags(603979776);
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
        finish();
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.shopReferenceValue.setText(str);
            this.layoutShopRefence.setVisibility(0);
            return;
        }
        this.layoutShopRefence.setVisibility(8);
    }

    public final void read(String str) {
        this.tvDailyLimit.setVisibility(0);
        String string = getString(R.string.mw_create_qr_daily_limit_link, new Object[]{str});
        TextView textView = this.tvDailyLimit;
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(string, 0));
        } else {
            textView.setText(Html.fromHtml(string));
        }
        this.tvDailyLimit.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        getWeekDayTextAppearance.IconCompatParcelizer(this, i, iArr);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        getWeekDayTextAppearance.write(this, true);
    }

    public final void write(boolean z) {
        if (this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver() != null) {
            DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new MwCreateQrActivity$MediaBrowserCompat$CustomActionResultReceiver(), new MwScreenshotDisplay(String.format("QR_%s", new Object[]{String.valueOf(Calendar.getInstance().getTimeInMillis())}), this.MediaBrowserCompat$MediaItem.read(), this.MediaMetadataCompat, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(), z), getBaseContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new AnimatorListener(this), new onAnimationEnd(this));
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.MediaDescriptionCompat;
        if (uri == null || uri.toString().isEmpty()) {
            write(this, R.id.view_container, getString(R.string.share_error), getOversizeImage.ERROR);
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", this.MediaDescriptionCompat);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, createChooser).read();
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

    @OnClick
    public void onCreateQRCodeButtonClick() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver(this, this.MediaMetadataCompat, this.MediaBrowserCompat$SearchResultReceiver);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1324);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onReturnHomeClick() {
        HomeActivity.write((Context) this, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1324) {
            this.MediaBrowserCompat$MediaItem.write(MwEditCreateQrActivity.MediaBrowserCompat$ItemReceiver(intent));
            this.MediaMetadataCompat = MwEditCreateQrActivity.read(intent);
            this.MediaBrowserCompat$SearchResultReceiver = MwEditCreateQrActivity.write(intent);
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(MwEditCreateQrActivity.MediaBrowserCompat$ItemReceiver(intent), MwEditCreateQrActivity.read(intent), MwEditCreateQrActivity.write(intent));
        }
    }

    public class MwScreenshotDisplay extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        String IconCompatParcelizer;
        String MediaBrowserCompat$MediaItem;
        getBuildVersion MediaMetadataCompat;
        @BindView
        CustomTransferAndPayItem amountItemScreen;
        @BindView
        ImageView imageShopCoverScreen;
        @BindView
        LinearLayout layoutDynamicAmountScreen;
        @BindView
        ImageView qrCodeImageViewScreen;
        String read;
        @BindView
        View separator1Screen;
        @BindView
        View separator2Screen;
        @BindView
        CustomTransferAndPayItem shopNoteItemScreen;
        @BindView
        TextView tvAccountName;
        @BindView
        TextView tvAmountScreen;
        @BindView
        TextView tvNameENScreen;
        @BindView
        TextView tvNameTHScreen;
        @BindView
        TextView tvPayWalletIdScreen;

        public MwScreenshotDisplay(String str, String str2, String str3, String str4, getBuildVersion getbuildversion, boolean z) {
            super(R.layout.f91572131494384, str, false, z);
            this.IconCompatParcelizer = str2;
            this.read = str3;
            this.MediaBrowserCompat$MediaItem = str4;
            this.MediaMetadataCompat = getbuildversion;
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(MwCreateQrActivity mwCreateQrActivity, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        mwCreateQrActivity.write(mwCreateQrActivity, R.id.view_container, mwCreateQrActivity.getString(R.string.mw_create_qr_slip_fail_message), getOversizeImage.ERROR);
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(MwCreateQrActivity mwCreateQrActivity, Uri uri) {
        mwCreateQrActivity.MediaDescriptionCompat = uri;
        if (!uri.toString().isEmpty() && mwCreateQrActivity.MediaSessionCompat$ResultReceiverWrapper) {
            mwCreateQrActivity.write(mwCreateQrActivity, R.id.view_container, mwCreateQrActivity.getString(R.string.mw_create_qr_slip_success_message), getOversizeImage.SUCCESS);
            mwCreateQrActivity.MediaSessionCompat$ResultReceiverWrapper = false;
        }
    }

    public final void IconCompatParcelizer(getBuildVersion getbuildversion) {
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = getbuildversion.MediaBrowserCompat$ItemReceiver;
        this.tvNameTH.setText(crashlyticsReportSessionEventEncoder.write);
        String str = crashlyticsReportSessionEventEncoder.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null || str.isEmpty()) {
            this.tvNameEN.setVisibility(8);
        } else {
            this.tvNameEN.setText(str);
            this.tvNameEN.setVisibility(0);
        }
        this.tvPayWalletId.setText(getbuildversion.write);
        this.tvAccountName.setText(getbuildversion.read.IconCompatParcelizer);
    }
}
