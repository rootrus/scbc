package com.scb.phone.view.activity.prelogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import com.scb.phone.view.activity.forgotpin.ForgotPinPersonalInfoActivity;
import com.scb.phone.view.activity.forgotpin.PinLockActivity;
import com.scb.phone.view.activity.juristic.JuristicResetPinLandingActivity;
import com.scb.phone.view.activity.privacymanagement.PrivacyConsentActivity;
import com.scb.phone.view.activity.theme.ThemesActivity;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.File;
import p040o.AlertController$RecycleListView;
import p040o.AppStatsClientEventLogger;
import p040o.C10832countrows;
import p040o.C1246xea60bf60;
import p040o.C3976aN;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindETBCheckIdentityFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaybackStateCompat;
import p040o.ZSYR2K;
import p040o.calcDsSize;
import p040o.generateBinaryImagesJsonString;
import p040o.getAverageSpotNoiseGroupingsPerSquareInch;
import p040o.getDbFieldKeyType;
import p040o.getDbFieldType;
import p040o.getDsHandle;
import p040o.getEventLogSize;
import p040o.getLeftArrowMask;
import p040o.getLibraryFile;
import p040o.getMinimumDate;
import p040o.infoWindowAnchor;
import p040o.onExportAppStatsRowEvent;
import p040o.setDsFieldType;
import p040o.setDsFilePath;
import p040o.setDsValueFloat;
import p040o.setDsValueLong;
import p040o.setDsValueString;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.synthesizeReport;
import p040o.zzmd;

public class PinLoginActivity extends BaseActivity implements MerchantService, getAverageSpotNoiseGroupingsPerSquareInch {
    public PlaybackStateCompat.CustomAction MediaBrowserCompat$SearchResultReceiver;
    @BindView
    ImageView bgLogin;
    @BindView
    ImageView buttonClose;
    @BindView
    CustomKeypad customKeypad;
    @BindView
    CustomPinInput customPinInput;
    @BindView
    ImageView imageAvatar;
    @HmlPinActivity
    public onExportAppStatsRowEvent presenter;
    @HmlPinActivity
    public FragmentBuilder_BindETBCheckIdentityFragment salesforceManager;
    @BindView
    TextView textSubtitle;
    @BindView
    TextView textUserName;
    @BindView
    TextView textWelcome;

    public final int ExpandedMenuView() {
        return R.style.f95802131820797;
    }

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public final void al_() {
    }

    public static Intent write(Context context) {
        Intent intent = new Intent(context, PinLoginActivity.class);
        intent.setFlags(67108864);
        return intent;
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, PinLoginActivity.class);
        intent.putExtra("EXTRA_FROM_ADD_DEVICE", true);
        return intent;
    }

    public static Intent read(Context context, LogFileManager.DirectoryProvider directoryProvider) {
        Intent intent = new Intent(context, PinLoginActivity.class);
        intent.putExtra("preloadCheckDisplay", directoryProvider);
        intent.putExtra("EXTRA_FROM_TERMS_AND_CONDITIONS", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79292131493154);
        mo13676d_("login_pin");
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setContentHeight();
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            applicationContext.deleteDatabase("webview.db");
            applicationContext.deleteDatabase("webviewCache.db");
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("com.scb.phone.EXTRA_SUBTITLE");
        if (TextUtils.isEmpty(stringExtra)) {
            this.textSubtitle.setText(getString(R.string.enter_pin_to_login));
        } else {
            this.textSubtitle.setText(stringExtra);
        }
        this.customPinInput.setPinInputListener(this);
        this.customKeypad.setKeypadListener(this.customPinInput);
        this.customKeypad.setEnabledLines(true);
        onExportAppStatsRowEvent onexportappstatsrowevent = this.presenter;
        setDsFieldType setdsfieldtype = new setDsFieldType(onexportappstatsrowevent);
        boolean z = false;
        if (onexportappstatsrowevent.RatingCompat != null) {
            setdsfieldtype.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
        }
        onExportAppStatsRowEvent onexportappstatsrowevent2 = this.presenter;
        infoWindowAnchor infowindowanchor = onexportappstatsrowevent2.IconCompatParcelizer;
        infowindowanchor.MediaBrowserCompat$ItemReceiver(infowindowanchor.write(), new setDsValueString(onexportappstatsrowevent2));
        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_FROM_ADD_DEVICE", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_FROM_TERMS_AND_CONDITIONS", false);
            onExportAppStatsRowEvent onexportappstatsrowevent3 = this.presenter;
            zzmd.zzm.zzb.zza titleOptional = setTitleOptional();
            onexportappstatsrowevent3.MediaSessionCompat$QueueItem = titleOptional;
            onexportappstatsrowevent3.MediaBrowserCompat$MediaItem = booleanExtra;
            onexportappstatsrowevent3.MediaDescriptionCompat = booleanExtra2;
            onexportappstatsrowevent3.f2906x50fd9e4a = (LogFileManager.DirectoryProvider) getIntent().getParcelableExtra("preloadCheckDisplay");
            onexportappstatsrowevent3.ParcelableVolumeInfo = !booleanExtra;
            if (zzmd.zzm.zzb.zza.INDIVIDUAL == titleOptional) {
                if (onexportappstatsrowevent3.MediaBrowserCompat$SearchResultReceiver.RatingCompat.MediaBrowserCompat$ItemReceiver() && !onexportappstatsrowevent3.MediaBrowserCompat$SearchResultReceiver.RatingCompat.write()) {
                    setDsValueFloat setdsvaluefloat = new setDsValueFloat(onexportappstatsrowevent3);
                    if (onexportappstatsrowevent3.RatingCompat != null) {
                        setdsvaluefloat.IconCompatParcelizer(onexportappstatsrowevent3.RatingCompat);
                    }
                }
                if (Build.VERSION.SDK_INT >= 23 && !booleanExtra) {
                    String MediaBrowserCompat$CustomActionResultReceiver = onexportappstatsrowevent3.read.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                    if (MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        onexportappstatsrowevent3.MediaBrowserCompat$ItemReceiver = onexportappstatsrowevent3.write.get();
                        onexportappstatsrowevent3.write();
                    }
                }
            } else {
                C3976aN aNVar = C3976aN.write;
                if (onexportappstatsrowevent3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    aNVar.IconCompatParcelizer(onexportappstatsrowevent3.RatingCompat);
                }
            }
            onexportappstatsrowevent3.write(!onexportappstatsrowevent3.ParcelableVolumeInfo, C10832countrows.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void IconCompatParcelizer(File file) {
        Drawable write = setLastBaselineToBottomHeight.write(getApplicationContext(), R.drawable.bg_money_out);
        getApplicationContext();
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(file, this.bgLogin, write);
    }

    public final void MediaSessionCompat$QueueItem() {
        this.textSubtitle.setText(getString(R.string.enter_pin_to_login_juristic));
        this.bgLogin.setImageResource(R.drawable.bg_money_out_juristic);
    }

    public final void IconCompatParcelizer() {
        this.buttonClose.setVisibility(8);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        PinLockActivity.read(this);
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void setContentHeight() {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.buttonClose.setPadding(32, AlertController$RecycleListView.IconCompatParcelizer((Context) this), 0, 32);
        this.textWelcome.setPadding(0, AlertController$RecycleListView.IconCompatParcelizer((Context) this), 0, 0);
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34104 r3) {
        this.textUserName.setText(r3.RatingCompat);
        this.textWelcome.setText(r3.read);
        FragmentBuilder_BindDepositSelectorFragment.read(AlertController$RecycleListView.read((Context) this), this.imageAvatar, r3.MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.presenter.MediaBrowserCompat$ItemReceiver(str, true);
    }

    public void MediaDescriptionCompat() {
        setResult(-1);
        boolean z = false;
        if (getApplication() instanceof AndroidApplication) {
            ((AndroidApplication) getApplication()).IconCompatParcelizer = false;
        }
        onExportAppStatsRowEvent onexportappstatsrowevent = this.presenter;
        if (onexportappstatsrowevent.MediaDescriptionCompat) {
            if (!onexportappstatsrowevent.f2906x50fd9e4a.MediaSessionCompat$QueueItem && onexportappstatsrowevent.f2906x50fd9e4a.read) {
                String str = onexportappstatsrowevent.f2906x50fd9e4a.IconCompatParcelizer;
                if (!(str == null || str.equals(""))) {
                    setDsValueLong setdsvaluelong = new setDsValueLong(onexportappstatsrowevent);
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        setdsvaluelong.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            if (!onexportappstatsrowevent.f2906x50fd9e4a.MediaSessionCompat$QueueItem && onexportappstatsrowevent.f2906x50fd9e4a.read) {
                String str2 = onexportappstatsrowevent.f2906x50fd9e4a.IconCompatParcelizer;
                if (str2 == null || str2.equals("")) {
                    getDbFieldType getdbfieldtype = new getDbFieldType(onexportappstatsrowevent);
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        getdbfieldtype.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            calcDsSize calcdssize = new calcDsSize(onexportappstatsrowevent);
            if (onexportappstatsrowevent.RatingCompat != null) {
                z = true;
            }
            if (z) {
                calcdssize.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                return;
            }
            return;
        }
        AppStatsClientEventLogger appStatsClientEventLogger = AppStatsClientEventLogger.IconCompatParcelizer;
        if (onexportappstatsrowevent.RatingCompat != null) {
            z = true;
        }
        if (z) {
            appStatsClientEventLogger.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(LogFileManager.DirectoryProvider directoryProvider) {
        Intent MediaBrowserCompat$ItemReceiver = MarketingCSentWebViewActivity.MediaBrowserCompat$ItemReceiver((Context) this, directoryProvider);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public final void MediaBrowserCompat$ItemReceiver(generateBinaryImagesJsonString generatebinaryimagesjsonstring, LogFileManager.DirectoryProvider directoryProvider) {
        Intent read = PrivacyConsentActivity.read(this, generatebinaryimagesjsonstring, getLibraryFile.PRELOAD_CHECK, directoryProvider, false);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(LogFileManager.DirectoryProvider directoryProvider) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = ThemesActivity.MediaBrowserCompat$CustomActionResultReceiver(this, directoryProvider);
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
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public final void IconCompatParcelizer(LogFileManager.DirectoryProvider directoryProvider) {
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        boolean z = true;
        synthesizeReport synthesizereport = new synthesizeReport(directoryProvider, getCallingActivity() != null && getCallingActivity().getClassName().contains("DeepLink"));
        if (geteventlogsize.RatingCompat == null) {
            z = false;
        }
        if (z) {
            synthesizereport.IconCompatParcelizer(geteventlogsize.RatingCompat);
        }
    }

    public final void write(String str) {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
        AlertController$RecycleListView.read(this, R.id.view_group_root, R.drawable.ic_error_white_24dp, str, R.color.f71012131100257, R.color.f66062131099761, AlertController$RecycleListView.IconCompatParcelizer((Context) this));
    }

    public final void read(String str) {
        FragmentBuilder_BindETBCheckIdentityFragment.IconCompatParcelizer(str);
    }

    public final void MediaMetadataCompat() {
        Intent intent = new Intent(this, PinLockActivity.class);
        intent.addFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15076x50fd9e4a() {
        ActionBarOverlayLayout();
    }

    public final void MediaSessionCompat$QueueItem(LogFileManager.DirectoryProvider directoryProvider) {
        super.MediaSessionCompat$QueueItem(directoryProvider);
        onExportAppStatsRowEvent onexportappstatsrowevent = this.presenter;
        onexportappstatsrowevent.MediaBrowserCompat$ItemReceiver(onexportappstatsrowevent.MediaMetadataCompat, false);
    }

    @OnClick
    public void onCloseClick() {
        this.presenter.read();
    }

    public void onBackPressed() {
        this.presenter.read();
    }

    @OnClick
    public void onForgotPinClick() {
        onExportAppStatsRowEvent onexportappstatsrowevent = this.presenter;
        boolean z = true;
        if (zzmd.zzm.zzb.zza.JURISTIC == onexportappstatsrowevent.MediaSessionCompat$QueueItem) {
            getDbFieldKeyType getdbfieldkeytype = getDbFieldKeyType.write;
            if (onexportappstatsrowevent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdbfieldkeytype.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
            }
        } else if (onexportappstatsrowevent.MediaBrowserCompat$MediaItem) {
            getDsHandle getdshandle = getDsHandle.read;
            if (onexportappstatsrowevent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdshandle.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
            }
        } else {
            setDsFilePath setdsfilepath = setDsFilePath.write;
            if (onexportappstatsrowevent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setdsfilepath.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ForgotPinPersonalInfoActivity.read(this);
    }

    public final void ak_() {
        ForgotPinPersonalInfoActivity.write(this);
    }

    public final void IconCompatParcelizer(String str) {
        mo3028a_(str);
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent write = JuristicResetPinLandingActivity.write(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        getLeftArrowMask getleftarrowmask = new getLeftArrowMask(this);
        View inflate = getLayoutInflater().inflate(R.layout.f85352131493762, (ViewGroup) null);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.fingerprint_dialog_title));
        sb.append(" \"");
        sb.append(getString(R.string.app_name));
        sb.append("\"");
        ((TextView) inflate.findViewById(R.id.tv_fp_title)).setText(sb.toString());
        ((Button) inflate.findViewById(R.id.btn_fp_cancel)).setOnClickListener(new getMinimumDate(getleftarrowmask));
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(this);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.write = false;
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
        PlaybackStateCompat.CustomAction write = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        this.MediaBrowserCompat$SearchResultReceiver = write;
        write.show();
    }

    public final void MediaSessionCompat$Token() {
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$SearchResultReceiver;
        if (customAction != null && customAction.isShowing()) {
            ((TextView) this.MediaBrowserCompat$SearchResultReceiver.findViewById(R.id.tv_fp_title)).setText(R.string.fingerprint_dialog_title_try_again);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$SearchResultReceiver;
        if (customAction != null && !customAction.isShowing()) {
            this.presenter.write();
        }
    }

    public final void write() {
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$SearchResultReceiver;
        if (customAction != null) {
            customAction.dismiss();
        }
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        this.textSubtitle.setText(R.string.fingerprint_new_enrollment);
    }

    public final void RatingCompat() {
        AlertController$RecycleListView.read(this, R.id.view_group_root, R.drawable.ic_error_white_24dp, getString(R.string.other_error), R.color.f71012131100257, R.color.f66062131099761, AlertController$RecycleListView.IconCompatParcelizer((Context) this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            setResult(i2);
            finish();
        }
    }

    public final void read(String str, String str2, String str3) {
        this.scbAnalytics.write("pin_login_delay", new ZSYR2K("errorDateTime", str), new ZSYR2K("delayTime", str2), new ZSYR2K("errorCount", str3));
    }

    public final void read() {
        finish();
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public final void MenuItemWrapperICS$CollapsibleActionViewWrapper() {
        this.RatingCompat = true;
    }
}
