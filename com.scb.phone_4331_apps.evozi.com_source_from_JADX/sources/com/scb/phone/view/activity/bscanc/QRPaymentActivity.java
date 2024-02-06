package com.scb.phone.view.activity.bscanc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.CountDownTimer;
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
import com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity;
import com.scb.phone.view.activity.bscanc.ManageQrToPayActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Arrays;
import p040o.CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver;
import p040o.FundOnboardingSuccessActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.shouldSendGlobalHeartBeat;
import p040o.shouldSendGlobalHeartBeat$MediaBrowserCompat$MediaItem;
import p040o.shutdownNow;
import p040o.writeUInt64NoTag;

public final class QRPaymentActivity extends BaseActivity implements CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver {
    public static final QRPaymentActivity$MediaBrowserCompat$CustomActionResultReceiver MediaDescriptionCompat = new QRPaymentActivity$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private shutdownNow MediaBrowserCompat$SearchResultReceiver;
    private CountDownTimer MediaMetadataCompat;
    private CustomDialog MediaSessionCompat$Token;
    @BindView
    public ImageView imgQR;
    @HmlPinActivity
    public shouldSendGlobalHeartBeat presenter;
    @BindView
    public TextView tvExpiryDateTime;
    @BindView
    public TextView tvRemainingLimit;
    @BindView
    public TextView tvValidDuration;

    public static final /* synthetic */ CountDownTimer MediaBrowserCompat$CustomActionResultReceiver(QRPaymentActivity qRPaymentActivity) {
        CountDownTimer countDownTimer = qRPaymentActivity.MediaMetadataCompat;
        if (countDownTimer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countDownTimer");
        }
        return countDownTimer;
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f76852131492910);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            shutdownNow shutdownnow = (shutdownNow) extras.getParcelable("EXTRAS_BSCANC_ENTRY_POINT_DISPLAY");
            if (shutdownnow != null) {
                onGetStartedClick.IconCompatParcelizer((Object) shutdownnow, "bcScanData");
                this.MediaBrowserCompat$SearchResultReceiver = shutdownnow;
            }
            this.MediaBrowserCompat$MediaItem = extras.getString("EXTRAS_SUCCESS_MESSAGE");
        }
        super.setStackedBackground();
        setTitle(R.string.qr_payment_title);
        setTabContainer();
        m2831x50fd9e4a();
        shouldSendGlobalHeartBeat shouldsendglobalheartbeat = this.presenter;
        if (shouldsendglobalheartbeat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        shouldsendglobalheartbeat.MediaBrowserCompat$ItemReceiver(this);
        shouldSendGlobalHeartBeat shouldsendglobalheartbeat2 = this.presenter;
        if (shouldsendglobalheartbeat2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        shutdownNow shutdownnow2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (shutdownnow2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bScanCEntryPointDisplay");
        }
        Bitmap MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = m2831x50fd9e4a();
        String str = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) shutdownnow2, "bScanCEntryPointDisplay");
        onGetStartedClick.write((Object) MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, "bitmapQR");
        writeUInt64NoTag.IconCompatParcelizer shouldsendglobalheartbeat_mediabrowsercompat_mediaitem = new shouldSendGlobalHeartBeat$MediaBrowserCompat$MediaItem(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, shutdownnow2, str);
        boolean z = true;
        if (shouldsendglobalheartbeat2.RatingCompat != null) {
            shouldsendglobalheartbeat_mediabrowsercompat_mediaitem.IconCompatParcelizer(shouldsendglobalheartbeat2.RatingCompat);
        }
        shouldSendGlobalHeartBeat shouldsendglobalheartbeat3 = this.presenter;
        if (shouldsendglobalheartbeat3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        shutdownNow shutdownnow3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (shutdownnow3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bScanCEntryPointDisplay");
        }
        onGetStartedClick.write((Object) shutdownnow3, "bScanCEntryPointDisplay");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new shouldSendGlobalHeartBeat.IconCompatParcelizer(((Integer.parseInt(shutdownnow3.MediaBrowserCompat$CustomActionResultReceiver) * 60) * 1000) - 20000);
        if (shouldsendglobalheartbeat3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(shouldsendglobalheartbeat3.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.qr_payment_title);
        setTabContainer();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "displaySuccessMessage");
        write(this, R.id.view_group_root, str, getOversizeImage.SUCCESS);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final Bitmap m2831x50fd9e4a() {
        shutdownNow shutdownnow = this.MediaBrowserCompat$SearchResultReceiver;
        if (shutdownnow == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bScanCEntryPointDisplay");
        }
        Bitmap MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(shutdownnow.MediaBrowserCompat$ItemReceiver, BitmapFactory.decodeResource(getResources(), R.drawable.thai_qr_logo), 5.0d);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "Utilities.generateQRCode…_LOGO_PERCENT.toDouble())");
        return MediaBrowserCompat$ItemReceiver;
    }

    public static final class read extends CountDownTimer {
        private /* synthetic */ QRPaymentActivity MediaBrowserCompat$CustomActionResultReceiver;

        public final void onTick(long j) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(QRPaymentActivity qRPaymentActivity, long j) {
            super(j, 1000);
            this.MediaBrowserCompat$CustomActionResultReceiver = qRPaymentActivity;
        }

        public final void onFinish() {
            QRPaymentActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver).cancel();
            shouldSendGlobalHeartBeat shouldsendglobalheartbeat = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (shouldsendglobalheartbeat == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = shouldSendGlobalHeartBeat.read.MediaBrowserCompat$ItemReceiver;
            if (shouldsendglobalheartbeat.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(shouldsendglobalheartbeat.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        CountDownTimer start = new read(this, (long) i).start();
        onGetStartedClick.IconCompatParcelizer((Object) start, "object : CountDownTimer(…      }\n        }.start()");
        this.MediaMetadataCompat = start;
    }

    public final void IconCompatParcelizer(Bitmap bitmap) {
        onGetStartedClick.write((Object) bitmap, "bitmap");
        ImageView imageView = this.imgQR;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imgQR");
        }
        imageView.setImageBitmap(bitmap);
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "validDuration");
        onGetStartedClick.write((Object) str2, "expiryDateTime");
        TextView textView = this.tvValidDuration;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvValidDuration");
        }
        textView.setText(getString(R.string.qr_payment_show_this_qr, new Object[]{str}));
        TextView textView2 = this.tvExpiryDateTime;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpiryDateTime");
        }
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = getString(R.string.qr_expired_on);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.qr_expired_on)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView2.setText(format);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "remainingLimit");
        TextView textView = this.tvRemainingLimit;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemainingLimit");
        }
        textView.setText(str);
    }

    public final void IconCompatParcelizer() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.qr_expired_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.qr_expired_dialog_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "CustomDialog.create(this….qr_expired_dialog_desc))");
        this.MediaSessionCompat$Token = IconCompatParcelizer2;
        IconCompatParcelizer2.IconCompatParcelizer(getString(R.string.qr_expired_dialog_ok), new IconCompatParcelizer(this));
        CustomDialog customDialog = this.MediaSessionCompat$Token;
        if (customDialog == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expiredWarningDialog");
        }
        customDialog.MediaBrowserCompat$ItemReceiver(getString(R.string.qr_expired_dialog_cancel), new QRPaymentActivity$MediaBrowserCompat$ItemReceiver(this));
        CustomDialog customDialog2 = this.MediaSessionCompat$Token;
        if (customDialog2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expiredWarningDialog");
        }
        customDialog2.setCancelable(false);
        CustomDialog customDialog3 = this.MediaSessionCompat$Token;
        if (customDialog3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expiredWarningDialog");
        }
        customDialog3.show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ QRPaymentActivity IconCompatParcelizer;

        IconCompatParcelizer(QRPaymentActivity qRPaymentActivity) {
            this.IconCompatParcelizer = qRPaymentActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            shouldSendGlobalHeartBeat shouldsendglobalheartbeat = this.IconCompatParcelizer.presenter;
            if (shouldsendglobalheartbeat == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = shouldSendGlobalHeartBeat.write.MediaBrowserCompat$ItemReceiver;
            if (shouldsendglobalheartbeat.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(shouldsendglobalheartbeat.RatingCompat);
            }
        }
    }

    @OnClick
    public final void navigateToManageQR() {
        ManageQrToPayActivity.IconCompatParcelizer iconCompatParcelizer = ManageQrToPayActivity.MediaDescriptionCompat;
        Context context = this;
        shutdownNow shutdownnow = this.MediaBrowserCompat$SearchResultReceiver;
        if (shutdownnow == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bScanCEntryPointDisplay");
        }
        Intent MediaBrowserCompat$CustomActionResultReceiver = ManageQrToPayActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(context, shutdownnow.write, false);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 1112);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1112) {
            String string = (intent == null || !intent.getBooleanExtra("EXTRAS_DISPLAY_SUCCESS", false)) ? null : getString(R.string.myqr_input_success);
            BScanCEntryPointActivity.write write = BScanCEntryPointActivity.MediaDescriptionCompat;
            Intent read2 = BScanCEntryPointActivity.write.read(this, string);
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
            finish();
        }
    }

    @OnClick
    public final void navigateToAccountSummary() {
        HomeActivity.write((Context) this, true);
    }

    public final void write() {
        BScanCEntryPointActivity.write write = BScanCEntryPointActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, BScanCEntryPointActivity.class);
        intent.putExtra("KEYS_IS_SETTING_PAGE", false);
        Intent intent2 = new Intent(intent);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent2).read();
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

    public final void MediaBrowserCompat$ItemReceiver() {
        RatingCompat(false);
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
        CountDownTimer countDownTimer = this.MediaMetadataCompat;
        if (countDownTimer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countDownTimer");
        }
        countDownTimer.cancel();
        shouldSendGlobalHeartBeat shouldsendglobalheartbeat = this.presenter;
        if (shouldsendglobalheartbeat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        shouldsendglobalheartbeat.onDestroy();
        super.onDestroy();
    }
}
