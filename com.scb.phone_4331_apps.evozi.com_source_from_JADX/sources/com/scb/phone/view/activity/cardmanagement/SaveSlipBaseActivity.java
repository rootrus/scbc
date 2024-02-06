package com.scb.phone.view.activity.cardmanagement;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.custom.ccrredemption.ConfirmationThemeSlipLayout;
import java.util.Calendar;
import java.util.Locale;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.C7160iP;
import p040o.C7166iV;
import p040o.C7168iX;
import p040o.C7183jb;
import p040o.DebitCardResetOtpActivity;
import p040o.ExceptionResponse;
import p040o.FirebaseVisionCloudDocumentRecognizerOptions;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.getScbsOnboardingProductCatalog;
import p040o.onCheckBoxClick;
import p040o.setExitButtonEnabled;
import p040o.setLastBaselineToBottomHeight;

public abstract class SaveSlipBaseActivity<T> extends CCRBaseActivity implements ExceptionResponse {
    @BindView
    Button btnSaveSlip;
    @BindView
    ImageView imvSlipCurl;
    @HmlPinActivity
    public FirebaseVisionCloudDocumentRecognizerOptions saveSlipPresenter;
    @HmlPinActivity
    public setExitButtonEnabled themesSlipPresenter;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract int mo14047x50fd9e4a();

    public abstract T MediaSessionCompat$ResultReceiverWrapper();

    public abstract getScbsOnboardingProductCatalog<T> MediaSessionCompat$Token();

    public final void MediaSessionCompat$QueueItem() {
        this.saveSlipPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.imvSlipCurl.setColorFilter(setLastBaselineToBottomHeight.read(this, R.color.f66132131099768), PorterDuff.Mode.MULTIPLY);
        this.saveSlipPresenter.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        DebitCardResetOtpActivity.fromCallable(new C7160iP(this, MediaSessionCompat$ResultReceiverWrapper(), this, true)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new C7168iX(this), new C7166iV(this));
    }

    public final /* synthetic */ Uri write(Object obj, Context context, boolean z) throws Exception {
        Uri uri;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        String format = String.format(Locale.getDefault(), "scb-slip-%s.jpg", new Object[]{String.valueOf(timeInMillis)});
        Bitmap bitmap = null;
        try {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ConfirmationThemeSlipLayout confirmationThemeSlipLayout = new ConfirmationThemeSlipLayout(context);
            frameLayout.addView(confirmationThemeSlipLayout, -1, -2);
            View inflate = LayoutInflater.from(context).inflate(mo14047x50fd9e4a(), frameLayout, false);
            ((ImageView) inflate.findViewById(R.id.imv_bg_slip)).setVisibility(4);
            inflate.findViewById(R.id.layout_save_slip_root).setBackgroundColor(setLastBaselineToBottomHeight.read(this, 17170445));
            MediaSessionCompat$Token().read(obj, inflate, this);
            ((FrameLayout) confirmationThemeSlipLayout.findViewById(R.id.slip_content)).addView(inflate, -1, -2);
            setExitButtonEnabled setexitbuttonenabled = this.themesSlipPresenter;
            setexitbuttonenabled.read = confirmationThemeSlipLayout;
            setexitbuttonenabled.read();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            Bitmap IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer((View) confirmationThemeSlipLayout, displayMetrics.widthPixels, displayMetrics.widthPixels << 2);
            if (z) {
                uri = AlertController$RecycleListView.read(IconCompatParcelizer, format, context);
            } else {
                uri = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer, context, "screen_image.jpg");
            }
            if (IconCompatParcelizer != null) {
                IconCompatParcelizer.recycle();
            }
            return uri;
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            throw e;
        } catch (Throwable th) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C7183jb.write(this, i, iArr);
    }

    /* renamed from: M_ */
    public final void mo14072M_() {
        C7183jb.IconCompatParcelizer(this);
    }

    /* renamed from: N_ */
    public final void mo14074N_() {
        this.btnSaveSlip.setVisibility(0);
    }

    public static void AppCompatActivity() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void setContentView() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(SaveSlipBaseActivity saveSlipBaseActivity, Uri uri) {
        if (!uri.toString().isEmpty()) {
            AlertController$RecycleListView.write((Activity) saveSlipBaseActivity, (int) R.id.root, (int) R.drawable.ic_check_circle_white_24dp, saveSlipBaseActivity.getString(R.string.saved_slip_success), (int) R.color.f67402131099896);
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(SaveSlipBaseActivity saveSlipBaseActivity, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        AlertController$RecycleListView.write((Activity) saveSlipBaseActivity, (int) R.id.root, (int) R.drawable.ic_error_white_24dp, saveSlipBaseActivity.getString(R.string.save_slip_error), (int) R.color.f66062131099761);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSaveSlipClick() {
        C7183jb.IconCompatParcelizer(this);
    }
}
