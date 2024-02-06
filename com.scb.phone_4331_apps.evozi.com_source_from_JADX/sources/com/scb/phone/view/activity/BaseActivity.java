package com.scb.phone.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import com.androidadvance.topsnackbar.TSnackbar;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.activity.requesttopay.GoManagePromptPayActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p039io.github.inflationx.calligraphy3.TypefaceUtils;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule;
import p040o.ContactUsActivity_ViewBinding;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment;
import p040o.FragmentBuilder_BindBaseTargetSelectedFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.computeFloatSize;
import p040o.getBelowMinRearImageSize;
import p040o.getEventLogSize;
import p040o.getKernelIDDst;
import p040o.getOversizeImage;
import p040o.getSessionAppSize;
import p040o.getSessionAppSize$MediaBrowserCompat$ItemReceiver;
import p040o.infoWindowAnchor;
import p040o.isDirectory;
import p040o.onCheckBoxClick;
import p040o.onGetLayoutInflater;
import p040o.onGetStartedClick;
import p040o.onResponse;
import p040o.removeIfFromRandomAccessList;
import p040o.setBaselineAligned;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.snapshotForTest;
import p040o.zzmd;
import p040o.zzrp;
import p040o.zzwi;
import p040o.zzwm;

public class BaseActivity extends PreLoadCheckActivity implements getBelowMinRearImageSize, FragmentBuilder_BindBaseTargetSelectedFragment, DialogInterface.OnDismissListener {
    private BulkTransferDeepLinkActivity AlertController$RecycleListView;
    public boolean IconCompatParcelizer;
    private BulkTransferDeepLinkActivity Keep;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    private CustomDialog MediaBrowserCompat$MediaItem;
    private long MediaBrowserCompat$SearchResultReceiver = 0;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private long MediaMetadataCompat = 0;
    private BaseActivity$MediaBrowserCompat$CustomActionResultReceiver MediaSessionCompat$ResultReceiverWrapper;
    private Intent MediaSessionCompat$Token = null;
    private boolean PlaybackStateCompat = false;
    @HmlPinActivity
    public Context context;
    @HmlPinActivity
    public CheckCaptureModule.KtaExceptionResponseDeserializer inAppUpdateHelper;
    @BindView
    public TextView mActionBarTitle;
    @BindView
    protected ViewGroup mProgress;
    @BindView
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView
    public Toolbar mToolbar;
    public Keep read;
    @HmlPinActivity
    public getKernelIDDst scbAnalytics;
    @HmlPinActivity
    public getSessionAppSize sessionHandlerPresenter;
    private CustomDialog setHasDecor;
    protected boolean write = true;

    /* access modifiers changed from: protected */
    public int ExpandedMenuView() {
        return 0;
    }

    public void ac_() {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        MediaBrowserCompat$CustomActionResultReceiver((getEventLogSize) this.sessionHandlerPresenter, (getBelowMinRearImageSize) this);
        FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment = ((AndroidApplication) getApplication()).MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment != null) {
            fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment.write = this;
        }
        if (zzmd.zzm.zzb.zza.JURISTIC.equals(setTitleOptional()) && ExpandedMenuView() > 0) {
            setTheme(ExpandedMenuView());
        }
    }

    public void onStart() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            String D_ = mo3026D_();
            if (!TextUtils.equals(D_, Locale.getDefault().getLanguage())) {
                super.mo3028a_(D_.toLowerCase());
            }
        }
        this.MediaBrowserCompat$ItemReceiver = false;
        super.onStart();
        this.RatingCompat = true;
    }

    public void onStop() {
        super.onStop();
        this.RatingCompat = false;
    }

    public void onDestroy() {
        aj_();
        CustomDialog customDialog = this.MediaBrowserCompat$MediaItem;
        if (customDialog != null && customDialog.isShowing()) {
            this.MediaBrowserCompat$MediaItem.dismiss();
            this.MediaBrowserCompat$MediaItem = null;
        }
        super.onDestroy();
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        if (SystemClock.elapsedRealtime() - this.MediaMetadataCompat >= 5000) {
            this.sessionHandlerPresenter.setHasDecor.IconCompatParcelizer.write();
            this.MediaMetadataCompat = SystemClock.elapsedRealtime();
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_USER_INTERACTION");
            sendBroadcast(intent);
        }
    }

    public void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
        ParcelableVolumeInfo(true);
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.AlertController$RecycleListView;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.AlertController$RecycleListView.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.Keep;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.Keep.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity3 = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity3 != null && !bulkTransferDeepLinkActivity3.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
    }

    public void onResume() {
        Boolean bool;
        zzwm zzwm;
        Integer num;
        super.onResume();
        getWindow().clearFlags(8192);
        int i = 0;
        if (setActionBarHideOffset()) {
            ParcelableVolumeInfo(false);
            MediaBrowserCompat$CustomActionResultReceiver((getEventLogSize) this.sessionHandlerPresenter, (getBelowMinRearImageSize) this);
            FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment = ((AndroidApplication) getApplication()).MediaBrowserCompat$ItemReceiver;
            if (fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment != null) {
                fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment.write = this;
            }
        }
        this.MediaBrowserCompat$SearchResultReceiver = removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver() - this.sessionHandlerPresenter.setHasDecor.IconCompatParcelizer.read();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.Keep;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.Keep.dispose();
        }
        this.Keep = setChildDrawingOrderCallback.IconCompatParcelizer(this, new IntentFilter("com.scb.phone/BROADCAST_USER_INTERACTION")).subscribe(new ServerProjectProvider.HttpClientHolder(this), isDirectory.MediaBrowserCompat$CustomActionResultReceiver);
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        String string = getString(R.string.app_update);
        IntentFilter intentFilter = new IntentFilter("IN_APP_UPDATE_TAG");
        intentFilter.addCategory(string);
        this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(this, intentFilter).subscribe(new ServerProjectProvider.C7082f(this), isDirectory.MediaBrowserCompat$CustomActionResultReceiver);
        setIcon();
        ActionBarContextView();
        if (this.ParcelableVolumeInfo != null) {
            infoWindowAnchor infowindowanchor = this.ParcelableVolumeInfo.MediaMetadataCompat;
            zzrp MediaBrowserCompat$ItemReceiver2 = infowindowanchor.write.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                bool = MediaBrowserCompat$ItemReceiver2.read;
            } else {
                bool = null;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
                zzwi write2 = infowindowanchor.MediaBrowserCompat$CustomActionResultReceiver.write();
                if (write2 != null) {
                    zzwm = write2.MediaSessionCompat$Token;
                } else {
                    zzwm = null;
                }
                if (zzwm != null) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - infowindowanchor.MediaBrowserCompat$ItemReceiver());
                    zzwi write3 = infowindowanchor.MediaBrowserCompat$CustomActionResultReceiver.write();
                    zzwm zzwm2 = write3 != null ? write3.MediaSessionCompat$Token : null;
                    if (!(zzwm2 == null || (num = zzwm2.read) == null)) {
                        i = num.intValue();
                    }
                    if (seconds > ((long) i)) {
                        infowindowanchor.write.IconCompatParcelizer(new zzrp((Boolean) null, (Integer) null, 7));
                    }
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        if (this.PlaybackStateCompat && menuItem.getItemId() == R.id.easycash_phone) {
            Intent intent = new Intent("android.intent.action.DIAL");
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(getResources().getString(R.string.easycash_contact_number));
            intent.setData(Uri.parse(sb.toString()));
            if (intent.resolveActivity(getPackageManager()) != null) {
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(this, intent).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb2.append(read2.getData());
                    sb2.append("\n with context ");
                    sb2.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                    startActivity(read2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.PlaybackStateCompat) {
            return true;
        }
        getMenuInflater().inflate(R.menu.f93022131558406, menu);
        if (setOverlayMode() != R.style.f93472131820562) {
            return true;
        }
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.easycash_phone).getIcon().mutate());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(this, R.color.f67252131099881));
        menu.findItem(R.id.easycash_phone).setIcon(MediaBrowserCompat$MediaItem2);
        return true;
    }

    private int setOverlayMode() {
        try {
            return getPackageManager().getActivityInfo(getComponentName(), 0).getThemeResource();
        } catch (PackageManager.NameNotFoundException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("could not find activity theme", new Object[0]);
            return R.style.f93422131820555;
        }
    }

    public void ay_() {
        ViewGroup viewGroup = this.mProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void write(Activity activity, int i, String str, getOversizeImage getoversizeimage) {
        int i2;
        int i3;
        if (getoversizeimage == getOversizeImage.SUCCESS) {
            i2 = R.drawable.ic_check_circle_white_24dp;
            i3 = R.color.f67402131099896;
        } else if (getoversizeimage == getOversizeImage.INFO) {
            i2 = R.drawable.info_icon;
            i3 = R.color.f70992131100255;
        } else {
            i2 = R.drawable.ic_error_white_24dp;
            i3 = R.color.f66062131099761;
        }
        int i4 = i2;
        int i5 = i3;
        if (this.IconCompatParcelizer) {
            AlertController$RecycleListView.read(activity, i, i4, str, R.color.f71012131100257, i5, AlertController$RecycleListView.IconCompatParcelizer((Context) this));
            return;
        }
        AlertController$RecycleListView.write(activity, i, i4, str, i5);
    }

    public /* synthetic */ void lambda$showInAppDownloaded$0$BaseActivity(View view) {
        CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = this.inAppUpdateHelper;
        ktaExceptionResponseDeserializer.read.MediaBrowserCompat$CustomActionResultReceiver();
        ktaExceptionResponseDeserializer.read.MediaBrowserCompat$ItemReceiver(ktaExceptionResponseDeserializer.write);
    }

    public final void ad_() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        IconCompatParcelizer2.setCancelable(false);
        String string = getString(R.string.root_checker_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.root_checker_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(getString(R.string.ok), new ServerProjectProvider.C7075b(this)).show();
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (this.ParcelableVolumeInfo != null) {
            getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
            geteventlogsize.read(geteventlogsize.IconCompatParcelizer, geteventlogsize.MediaBrowserCompat$ItemReceiver, geteventlogsize.read, geteventlogsize.write);
        }
    }

    /* renamed from: com.scb.phone.view.activity.BaseActivity$4 */
    static /* synthetic */ class C10694 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.access$2300$write[] r0 = p040o.access$2300.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.access$2300$write r1 = p040o.access$2300.write.LOGOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.access$2300$write r1 = p040o.access$2300.write.WIPE_CONFIG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.access$2300$write r1 = p040o.access$2300.write.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.access$2300$write r1 = p040o.access$2300.write.UPDATE_APP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.BaseActivity.C10694.<clinit>():void");
        }
    }

    public final void IconCompatParcelizer(access$2300 access_2300) {
        int i = C10694.write[access_2300.read.ordinal()];
        if (i == 1) {
            finish();
        } else if (i == 2 || i == 3) {
            MediaSessionCompat$Token(true);
        } else if (i == 4) {
            access_2300.MediaBrowserCompat$CustomActionResultReceiver.run();
        } else if (i == 5) {
            Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer((Context) this);
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
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) null));
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read3 = setTapText.write(this, intent).read();
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb2.append(read3.getData());
                    sb2.append("\n with context ");
                    sb2.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                    startActivity(read3);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Exception e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
    }

    public void PlaybackStateCompat$CustomAction() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void ActionBarContainer() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(currentFocus, 1);
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(currentFocus, 0);
        }
    }

    public void az_() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public void setContentHeight() {
        this.IconCompatParcelizer = true;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setPadding(0, AlertController$RecycleListView.IconCompatParcelizer((Context) this), 0, 0);
        }
    }

    public void setStackedBackground() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            read(toolbar);
            Keep B_ = mo11B_();
            this.read = B_;
            if (B_ != null) {
                B_.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) "");
            }
            TextView textView = this.mActionBarTitle;
            if (textView != null) {
                textView.setTextSize(2, ((float) getResources().getDimensionPixelSize(R.dimen.f71922131165260)) / getResources().getDisplayMetrics().density);
                this.mActionBarTitle.setTypeface(TypefaceUtils.load(getAssets(), "fonts/db_heavent_medium.ttf"));
                this.mActionBarTitle.setText(getTitle());
            }
            Drawable mutate = setLastBaselineToBottomHeight.write(this, R.drawable.ic_arrow_back_white_24dp).mutate();
            TextView textView2 = this.mActionBarTitle;
            if (textView2 != null) {
                mutate.setColorFilter(textView2.getCurrentTextColor(), PorterDuff.Mode.SRC_ATOP);
                this.read.read(mutate);
            }
        }
    }

    public final String setTitle() {
        TextView textView = this.mActionBarTitle;
        return textView != null ? String.valueOf(textView.getText()) : "";
    }

    public void setTitle(int i) {
        String string = getString(i);
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public final void MediaSessionCompat$QueueItem(String str) {
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void RatingCompat(boolean z) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_NEED_RELOAD", z);
        intent.addFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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

    /* renamed from: a_ */
    public final void mo3028a_(String str) {
        super.mo3028a_(str.toLowerCase());
    }

    public void attachBaseContext(Context context2) {
        super.attachBaseContext(ContactUsActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(onGetLayoutInflater.write(context2)));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        CustomDialog customDialog = this.MediaBrowserCompat$MediaItem;
        if (customDialog != null && customDialog.isShowing()) {
            this.MediaBrowserCompat$MediaItem.dismiss();
            this.MediaBrowserCompat$MediaItem = null;
        }
    }

    /* access modifiers changed from: private */
    public void setIcon() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.AlertController$RecycleListView;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.AlertController$RecycleListView.dispose();
        }
        if (mo13023x_()) {
            this.AlertController$RecycleListView = DebitCardResetOtpActivity.timer(5, TimeUnit.MINUTES).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new DebitCardMarketConductDeepLinkActivity() {
                public final void IconCompatParcelizer(Object obj) {
                    BaseActivity.this.setForceShowIcon();
                }
            }, isDirectory.MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        getSessionAppSize getsessionappsize = this.sessionHandlerPresenter;
        if (getsessionappsize != null && getsessionappsize.setHasDecor.IconCompatParcelizer.IconCompatParcelizer()) {
            setForceShowIcon();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        CustomDialog customDialog = this.setHasDecor;
        if (customDialog != null && customDialog.isShowing()) {
            this.setHasDecor.dismiss();
        }
    }

    /* renamed from: x_ */
    public boolean mo13023x_() {
        long j = this.MediaBrowserCompat$SearchResultReceiver;
        return 300000 > j && j > 0;
    }

    public final void setForceShowIcon() {
        if (!AlertController$RecycleListView.MediaBrowserCompat$MediaItem(getClass().getName()) || !this.write) {
            if (getApplication() instanceof AndroidApplication) {
                ((AndroidApplication) getApplication()).IconCompatParcelizer = true;
            }
        } else if (this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()) {
            MediaSessionCompat$Token(true);
        } else {
            this.sessionHandlerPresenter.setHasDecor.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(false);
            this.sessionHandlerPresenter.setHasDecor.IconCompatParcelizer.write();
            access$2200 access_2200 = new access$2200();
            access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.common_error);
            access_2200.IconCompatParcelizer = getString(R.string.session_expired);
            access$2300 access_2300 = new access$2300();
            access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
            access_2300.read = access$2300.write.LOGOUT;
            access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
            IconCompatParcelizer(access_2200);
            CustomDialog customDialog = this.MediaBrowserCompat$MediaItem;
            if (customDialog != null && customDialog.isShowing()) {
                this.MediaBrowserCompat$MediaItem.dismiss();
                this.MediaBrowserCompat$MediaItem = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$Token(String str) {
        access$2300.write write2 = access$2300.write.JUST_DISMISS;
        if ((this instanceof SplashActivity) || (this instanceof GoManagePromptPayActivity)) {
            write2 = access$2300.write.NAVIGATE_BACK;
        }
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.no_connection_title);
        access_2200.IconCompatParcelizer = str;
        access$2300 access_2300 = new access$2300();
        access_2300.read = write2;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final boolean setGroupDividerEnabled() {
        getSessionAppSize getsessionappsize = this.sessionHandlerPresenter;
        return getsessionappsize != null && getsessionappsize.setHasDecor.IconCompatParcelizer.IconCompatParcelizer();
    }

    public void startActivity(Intent intent) {
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver((Context) this) || !AlertController$RecycleListView.write(intent, (Context) this)) {
            Intent intent2 = this.MediaSessionCompat$Token;
            boolean z = false;
            if (intent2 != null && intent2.getBooleanExtra("FOR_RESULT", false)) {
                z = true;
            }
            int i = -1;
            if (z) {
                i = this.MediaSessionCompat$Token.getIntExtra("COACH_MARK_REQUEST_CODE", -1);
            }
            IconCompatParcelizer(intent, i, z);
            return;
        }
        MediaSessionCompat$Token(getString(R.string.no_connection_msg));
    }

    public void startActivityForResult(Intent intent, int i) {
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver((Context) this) || !AlertController$RecycleListView.write(intent, (Context) this)) {
            IconCompatParcelizer(intent, i, true);
        } else {
            MediaSessionCompat$Token(getString(R.string.no_connection_msg));
        }
    }

    public final void AbsActionBarView() {
        getKernelIDDst getkerneliddst = this.scbAnalytics;
        Collection<ZSYR2K> collection = getkerneliddst.IconCompatParcelizer;
        if (collection != null) {
            collection.clear();
            getkerneliddst.IconCompatParcelizer = null;
        }
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(Intent intent, int i, boolean z) {
        if (AlertController$RecycleListView.read(intent) && (!setGroupDividerEnabled() || mo13022E_())) {
            this.MediaSessionCompat$Token = intent.putExtra("COACH_MARK_REQUEST_CODE", i).putExtra("FOR_RESULT", z);
            super.startActivityForResult(PinLoginActivity.write((Context) this), 7134);
            setSubtitle();
        } else if (z) {
            super.startActivityForResult(intent, i);
        } else {
            super.startActivity(intent);
        }
    }

    public void setSubtitle() {
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    /* access modifiers changed from: protected */
    public final boolean setVisibility() {
        return removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver() - this.sessionHandlerPresenter.setHasDecor.IconCompatParcelizer.read() < 300000 && setGroupDividerEnabled();
    }

    /* renamed from: E_ */
    public boolean mo13022E_() {
        if (getApplication() instanceof AndroidApplication) {
            return ((AndroidApplication) getApplication()).IconCompatParcelizer;
        }
        return false;
    }

    /* renamed from: d_ */
    public final void mo13676d_(String str) {
        getKernelIDDst getkerneliddst = this.scbAnalytics;
        if (!(str == null || str.length() == 0)) {
            Bundle bundle = new Bundle();
            getkerneliddst.IconCompatParcelizer(bundle);
            bundle.putString("user_mode", getkerneliddst.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer().mode.toUpperCase());
            getkerneliddst.MediaBrowserCompat$ItemReceiver(bundle);
            getkerneliddst.write.logEvent(str, bundle);
        }
    }

    public final void write(String str, ZSYR2K... zsyr2kArr) {
        this.scbAnalytics.write(str, zsyr2kArr);
    }

    public final void setTransitioning() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.AlertController$RecycleListView;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.AlertController$RecycleListView.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.Keep;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.Keep.dispose();
        }
    }

    public final String read(String str, String str2) {
        return (getIntent() == null || getIntent().getStringExtra(str) == null) ? str2 : getIntent().getStringExtra(str);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("OUTSTATE_POST_LOGIN_INTENT", this.MediaSessionCompat$Token);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.MediaSessionCompat$Token = (Intent) bundle.getParcelable("OUTSTATE_POST_LOGIN_INTENT");
        }
    }

    public final void setSplitBackground() {
        mo13677k_(getString(R.string.forgot_pin_personal_info_error_hold));
    }

    public final void write(BaseActivity$MediaBrowserCompat$CustomActionResultReceiver baseActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaSessionCompat$ResultReceiverWrapper = baseActivity$MediaBrowserCompat$CustomActionResultReceiver;
        getSessionAppSize getsessionappsize = this.sessionHandlerPresenter;
        getsessionappsize.setHasDecor.MediaBrowserCompat$ItemReceiver();
        getsessionappsize.setHasDecor.IconCompatParcelizer(new getSessionAppSize$MediaBrowserCompat$ItemReceiver(getsessionappsize, (byte) 0));
    }

    public final void ab_() {
        BaseActivity$MediaBrowserCompat$CustomActionResultReceiver baseActivity$MediaBrowserCompat$CustomActionResultReceiver = this.MediaSessionCompat$ResultReceiverWrapper;
        if (baseActivity$MediaBrowserCompat$CustomActionResultReceiver != null) {
            baseActivity$MediaBrowserCompat$CustomActionResultReceiver.write();
        }
    }

    public final void setBackgroundResource() {
        MediaBrowserCompat$ItemReceiver(getString(R.string.toast_success_title));
    }

    public final void setPrimaryBackground() {
        this.PlaybackStateCompat = true;
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(BaseActivity baseActivity) {
        BaseActivity baseActivity2 = baseActivity;
        AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(baseActivity2, baseActivity.getWindow().getDecorView().getRootView(), 0, baseActivity.getString(R.string.download_complete), R.color.f66092131099764, R.color.f71012131100257, 0, (TSnackbar.IconCompatParcelizer) null, R.string.app_update, new View.OnClickListener() {
            public final void onClick(View view) {
                BaseActivity.this.lambda$showInAppDownloaded$0$BaseActivity(view);
            }
        }, 5000);
    }

    private void IconCompatParcelizer(access$2200 access_2200) {
        if (this.RatingCompat && !isFinishing()) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
            String str = access_2200.MediaBrowserCompat$ItemReceiver;
            if (!(str == null || str.length() == 0)) {
                IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                IconCompatParcelizer2.mTitleTextView.setText(str);
            }
            String str2 = access_2200.IconCompatParcelizer;
            if (true ^ (str2 == null || str2.length() == 0)) {
                IconCompatParcelizer2.mTextTextView.setVisibility(0);
                IconCompatParcelizer2.mTextTextView.setText(str2);
            }
            this.setHasDecor = IconCompatParcelizer2;
            access$2300 access_2300 = access_2200.MediaBrowserCompat$CustomActionResultReceiver;
            if (access_2300 != null) {
                this.setHasDecor.IconCompatParcelizer(access_2300.MediaBrowserCompat$ItemReceiver, new ServerProjectProvider.C7077d(this, access_2300));
            }
            access$2300 access_23002 = access_2200.write;
            if (access_23002 != null) {
                this.setHasDecor.MediaBrowserCompat$ItemReceiver(access_23002.MediaBrowserCompat$ItemReceiver, new ServerProjectProvider.C7076c(this, access_23002));
            }
            this.setHasDecor.setCancelable(false);
            this.setHasDecor.setOnDismissListener(this);
            this.setHasDecor.show();
            RatingCompat(access_2200);
        }
    }

    /* access modifiers changed from: protected */
    public void ListMenuItemView() {
        Keep keep;
        if (this.RatingCompat && (keep = this.read) != null) {
            keep.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        this.RatingCompat = true;
        if (i != 7134) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && (intent2 = this.MediaSessionCompat$Token) != null) {
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
            this.MediaSessionCompat$Token = null;
        }
    }

    public void MenuItemWrapperICS$CollapsibleActionViewWrapper() {
        boolean z = true;
        this.RatingCompat = true;
        if (setVisibility() && this.ParcelableVolumeInfo != null) {
            getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
            computeFloatSize computefloatsize = computeFloatSize.IconCompatParcelizer;
            if (geteventlogsize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                computefloatsize.IconCompatParcelizer(geteventlogsize.RatingCompat);
            }
        } else if (AlertController$RecycleListView.RatingCompat(getClass().getName())) {
            ActionBarOverlayLayout();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        CustomDialog customDialog = this.MediaBrowserCompat$MediaItem;
        if (customDialog != null && customDialog.isShowing()) {
            this.MediaBrowserCompat$MediaItem.dismiss();
            this.MediaBrowserCompat$MediaItem = null;
        }
    }

    public final void MenuItemImpl() {
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        getSessionAppSize getsessionappsize = this.sessionHandlerPresenter;
        getsessionappsize.setHasDecor.MediaBrowserCompat$ItemReceiver();
        getsessionappsize.setHasDecor.IconCompatParcelizer(new getSessionAppSize$MediaBrowserCompat$ItemReceiver(getsessionappsize, (byte) 0));
    }

    /* access modifiers changed from: protected */
    public final void setTabContainer() {
        Keep keep;
        if (this.RatingCompat && (keep = this.read) != null) {
            keep.MediaBrowserCompat$CustomActionResultReceiver(true);
        }
    }

    public void write(access$2200 access_2200) {
        if ((this.RatingCompat || !isFinishing()) && !this.MediaBrowserCompat$CustomActionResultReceiver) {
            CustomDialog customDialog = this.setHasDecor;
            if (customDialog == null || customDialog.isShowing()) {
                CustomDialog customDialog2 = this.MediaBrowserCompat$MediaItem;
                if (customDialog2 != null && customDialog2.isShowing()) {
                    this.MediaBrowserCompat$MediaItem.dismiss();
                    this.MediaBrowserCompat$MediaItem = null;
                }
                CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
                String str = access_2200.MediaBrowserCompat$ItemReceiver;
                if (!(str == null || str.length() == 0)) {
                    IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                    IconCompatParcelizer2.mTitleTextView.setText(str);
                }
                String str2 = access_2200.IconCompatParcelizer;
                if (true ^ (str2 == null || str2.length() == 0)) {
                    IconCompatParcelizer2.mTextTextView.setVisibility(0);
                    IconCompatParcelizer2.mTextTextView.setText(str2);
                }
                this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
                access$2300 access_2300 = access_2200.MediaBrowserCompat$CustomActionResultReceiver;
                if (access_2300 != null) {
                    this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(access_2300.MediaBrowserCompat$ItemReceiver, new onResponse(this, access_2300));
                }
                access$2300 access_23002 = access_2200.write;
                if (access_23002 != null) {
                    this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(access_23002.MediaBrowserCompat$ItemReceiver, new DialogInterface.OnClickListener(access_23002) {
                        private final /* synthetic */ access$2300 MediaBrowserCompat$ItemReceiver;

                        {
                            this.MediaBrowserCompat$ItemReceiver = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            BaseActivity baseActivity = BaseActivity.this;
                            access$2300 access_2300 = this.MediaBrowserCompat$ItemReceiver;
                            dialogInterface.dismiss();
                            baseActivity.IconCompatParcelizer(access_2300);
                        }
                    });
                }
                this.MediaBrowserCompat$MediaItem.setCancelable(false);
                this.MediaBrowserCompat$MediaItem.setOnDismissListener(this);
                this.MediaBrowserCompat$MediaItem.show();
                RatingCompat(access_2200);
            }
        }
    }

    /* renamed from: k_ */
    public final void mo13677k_(String str) {
        if (this.RatingCompat || !isFinishing()) {
            aj_();
            View inflate = getLayoutInflater().inflate(R.layout.f92892131494518, (ViewGroup) findViewById(R.id.toast_layout_root));
            ((TextView) inflate.findViewById(R.id.text)).setText(str);
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(55, 0, 0);
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }
    }

    public void Keep() {
        ViewGroup viewGroup;
        if (this.RatingCompat && (viewGroup = this.mProgress) != null) {
            viewGroup.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        if (this.RatingCompat || !isFinishing()) {
            aj_();
            View inflate = getLayoutInflater().inflate(R.layout.f92902131494519, (ViewGroup) findViewById(R.id.toast_layout_root));
            ((TextView) inflate.findViewById(R.id.text)).setText(str);
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(55, 0, 0);
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }
    }

    public void RatingCompat(access$2200 access_2200) {
        snapshotForTest snapshotfortest;
        if (access_2200 != null && (snapshotfortest = access_2200.read) != null && this.scbAnalytics != null && snapshotfortest.IconCompatParcelizer != 0) {
            ZSYR2K zsyr2k = new ZSYR2K("error_type", snapshotfortest.write);
            ZSYR2K zsyr2k2 = new ZSYR2K("rquid", snapshotfortest.MediaBrowserCompat$ItemReceiver);
            ZSYR2K zsyr2k3 = new ZSYR2K("endpoint", snapshotfortest.MediaBrowserCompat$CustomActionResultReceiver);
            this.scbAnalytics.write("front_end_error", zsyr2k, zsyr2k2, zsyr2k3);
        }
    }
}
