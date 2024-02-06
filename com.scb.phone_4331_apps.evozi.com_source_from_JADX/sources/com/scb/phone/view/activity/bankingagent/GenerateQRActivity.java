package com.scb.phone.view.activity.bankingagent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYMM;
import p040o.endTask;
import p040o.getExitingScheduledExecutorService;
import p040o.getICheckDeserializerRtti;
import p040o.getQueryParamsFor;
import p040o.getQueryParamsFor$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getSignature;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class GenerateQRActivity extends BaseActivity implements getSignature {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private CountDownTimer MediaDescriptionCompat;
    private CustomDialog MediaMetadataCompat;
    @BindView
    public TextView amountTextView;
    @BindView
    public ImageView barcodeImageView;
    @BindView
    public TextView barcodeLabelTextView;
    @BindView
    public TextView expireTextView;
    @HmlPinActivity
    public getQueryParamsFor presenter;
    @BindView
    public ImageView qrImageView;

    public GenerateQRActivity() {
        FundActionsSuccessActivity mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) mediaMetadataCompat, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(mediaMetadataCompat);
    }

    public static final /* synthetic */ CountDownTimer read(GenerateQRActivity generateQRActivity) {
        CountDownTimer countDownTimer = generateQRActivity.MediaDescriptionCompat;
        if (countDownTimer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countDownTimer");
        }
        return countDownTimer;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76722131492897);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        getQueryParamsFor getqueryparamsfor = this.presenter;
        if (getqueryparamsfor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getqueryparamsfor.MediaBrowserCompat$ItemReceiver(this);
        getExitingScheduledExecutorService getexitingscheduledexecutorservice = (getExitingScheduledExecutorService) getIntent().getParcelableExtra("REVIEW_DISPLAY");
        endTask endtask = (endTask) getIntent().getParcelableExtra("GENERATE_QR_DISPLAY");
        if (getexitingscheduledexecutorservice != null && endtask != null) {
            setTabContainer();
            MediaSessionCompat$QueueItem(getString(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(getexitingscheduledexecutorservice.MediaBrowserCompat$MediaItem, "D", true) ? R.string.banking_deposits_generate_qr_title : R.string.banking_withdrawal_generate_qr_title));
            getQueryParamsFor getqueryparamsfor2 = this.presenter;
            if (getqueryparamsfor2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "reviewDisplay");
            onGetStartedClick.write((Object) endtask, "generateQRDisplay");
            getqueryparamsfor2.read = getexitingscheduledexecutorservice;
            getqueryparamsfor2.IconCompatParcelizer = endtask;
            getQueryParamsFor getqueryparamsfor3 = this.presenter;
            if (getqueryparamsfor3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getqueryparamsfor3.read();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onResume() {
        super.onResume();
        Window window = getWindow();
        onGetStartedClick.IconCompatParcelizer((Object) window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = 1.0f;
        Window window2 = getWindow();
        onGetStartedClick.IconCompatParcelizer((Object) window2, "window");
        window2.setAttributes(attributes);
        CustomDialog customDialog = this.MediaMetadataCompat;
        if (customDialog != null) {
            if (customDialog != null) {
                customDialog.show();
            }
            this.MediaMetadataCompat = null;
        }
    }

    public final void onPause() {
        super.onPause();
        Window window = getWindow();
        onGetStartedClick.IconCompatParcelizer((Object) window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = -1.0f;
        Window window2 = getWindow();
        onGetStartedClick.IconCompatParcelizer((Object) window2, "window");
        window2.setAttributes(attributes);
    }

    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.MediaDescriptionCompat;
        if (countDownTimer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countDownTimer");
        }
        countDownTimer.cancel();
        getQueryParamsFor getqueryparamsfor = this.presenter;
        if (getqueryparamsfor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getqueryparamsfor.onDestroy();
    }

    public final void onBackPressed() {
        getQueryParamsFor getqueryparamsfor = this.presenter;
        if (getqueryparamsfor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new getQueryParamsFor.write(getqueryparamsfor);
        if (getqueryparamsfor.RatingCompat != null) {
            write2.IconCompatParcelizer(getqueryparamsfor.RatingCompat);
        }
    }

    @OnClick
    public final void clickReturnToAccount() {
        getQueryParamsFor getqueryparamsfor = this.presenter;
        if (getqueryparamsfor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getQueryParamsFor$MediaBrowserCompat$CustomActionResultReceiver.write;
        if (getqueryparamsfor.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getqueryparamsfor.RatingCompat);
        }
    }

    public final void write(endTask endtask, getExitingScheduledExecutorService getexitingscheduledexecutorservice) {
        onGetStartedClick.write((Object) endtask, "generateQRDisplay");
        onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "reviewDisplay");
        TextView textView = this.barcodeLabelTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("barcodeLabelTextView");
        }
        textView.setText(endtask.IconCompatParcelizer);
        ImageView imageView = this.barcodeImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("barcodeImageView");
        }
        Bitmap MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(endtask.IconCompatParcelizer, 1000, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, new HashMap());
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "Utilities.generateBarcod…Utilities.BARCODE_HEIGHT)");
        imageView.setImageBitmap(MediaBrowserCompat$CustomActionResultReceiver);
        ImageView imageView2 = this.qrImageView;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrImageView");
        }
        Bitmap read2 = getICheckDeserializerRtti.read(endtask.write, 600, 600, new HashMap());
        onGetStartedClick.IconCompatParcelizer((Object) read2, "Utilities.generateQRBitM…lities.PROMPTPAY_QR_SIZE)");
        imageView2.setImageBitmap(read2);
        TextView textView2 = this.expireTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expireTextView");
        }
        textView2.setText(endtask.read);
        TextView textView3 = this.amountTextView;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountTextView");
        }
        textView3.setText(getexitingscheduledexecutorservice.RatingCompat);
    }

    public final void IconCompatParcelizer(long j) {
        CountDownTimer start = new GenerateQRActivity$MediaBrowserCompat$SearchResultReceiver(this, j).start();
        onGetStartedClick.IconCompatParcelizer((Object) start, "object : CountDownTimer(…      }\n        }.start()");
        this.MediaDescriptionCompat = start;
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "postingType");
        boolean MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "D", true);
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(MediaBrowserCompat$CustomActionResultReceiver ? R.string.banking_generate_deposit_qr_expired_qr_title : R.string.banking_generate_withdraw_qr_expired_qr_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(MediaBrowserCompat$CustomActionResultReceiver ? R.string.banking_generate_deposit_qr_expired_qr_message : R.string.banking_generate_withdraw_qr_expired_qr_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.banking_generate_qr_expired_qr_ok), new GenerateQRActivity$MediaBrowserCompat$MediaItem(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.banking_generate_qr_expired_qr_cancel), new RatingCompat(this));
        IconCompatParcelizer2.setCancelable(false);
        if (this.RatingCompat) {
            IconCompatParcelizer2.show();
        } else {
            this.MediaMetadataCompat = IconCompatParcelizer2;
        }
    }

    static final class RatingCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ GenerateQRActivity IconCompatParcelizer;

        RatingCompat(GenerateQRActivity generateQRActivity) {
            this.IconCompatParcelizer = generateQRActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            getQueryParamsFor getqueryparamsfor = this.IconCompatParcelizer.presenter;
            if (getqueryparamsfor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getQueryParamsFor.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getqueryparamsfor.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getqueryparamsfor.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.banking_generate_qr_confirm_exit_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.banking_generate_qr_confirm_exit_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.banking_generate_qr_confirm_exit_yes_exit), new read(this));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.banking_generate_qr_confirm_exit_not_now), GenerateQRActivity$MediaBrowserCompat$ItemReceiver.read);
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ GenerateQRActivity MediaBrowserCompat$CustomActionResultReceiver;

        read(GenerateQRActivity generateQRActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = generateQRActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            getQueryParamsFor getqueryparamsfor = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (getqueryparamsfor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getQueryParamsFor.MediaDescriptionCompat.write;
            if (getqueryparamsfor.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getqueryparamsfor.RatingCompat);
            }
            ZSYMM IconCompatParcelizer = GenerateQRActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (IconCompatParcelizer != null) {
                IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.scbAnalytics, "bankingagent_qrgenerated");
            }
        }
    }

    public final void read() {
        Intent addFlags = new Intent(this, ServiceAtBankingAgentActivity.class).addFlags(603979776);
        onGetStartedClick.IconCompatParcelizer((Object) addFlags, "Intent(this, ServiceAtBa… FLAG_ACTIVITY_CLEAR_TOP)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, addFlags).read();
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

    public final void write() {
        finish();
    }

    public final void IconCompatParcelizer() {
        HomeActivity.write((Context) this, true);
        finish();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "postingType");
        boolean MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "D", true);
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(MediaBrowserCompat$CustomActionResultReceiver ? R.string.banking_deposit_qr_return_to_account_title : R.string.banking_withdraw_qr_return_to_account_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(MediaBrowserCompat$CustomActionResultReceiver ? R.string.banking_deposit_qr_return_to_account_message : R.string.banking_withdraw_qr_return_to_account_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.banking_generate_qr_return_to_account_confirm), new write(this));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.banking_generate_qr_return_to_account_cancel), GenerateQRActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ GenerateQRActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(GenerateQRActivity generateQRActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = generateQRActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            getQueryParamsFor getqueryparamsfor = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (getqueryparamsfor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getQueryParamsFor.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
            if (getqueryparamsfor.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getqueryparamsfor.RatingCompat);
            }
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<ZSYMM> {
        private /* synthetic */ GenerateQRActivity IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(GenerateQRActivity generateQRActivity) {
            super(0);
            this.IconCompatParcelizer = generateQRActivity;
        }

        public final /* synthetic */ Object invoke() {
            return (ZSYMM) this.IconCompatParcelizer.getIntent().getParcelableExtra("banking_agent_bundle");
        }
    }

    public static final /* synthetic */ ZSYMM IconCompatParcelizer(GenerateQRActivity generateQRActivity) {
        return (ZSYMM) generateQRActivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
