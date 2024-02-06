package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C1346xf91fc122;
import p040o.C7345pG;
import p040o.IOrientationGuidanceCalculator;
import p040o.Image;
import p040o.MyECouponActivity_ViewBinding;
import p040o.animateCamera;
import p040o.getLegacySharedPrefs;
import p040o.getTimeOutParameters;
import p040o.getTotalRamInBytes;
import p040o.isEmulator;
import p040o.isRooted;
import p040o.setTapText;

public class EasycashActivity extends BaseActivity implements getTimeOutParameters, IOrientationGuidanceCalculator {
    private isRooted AlertController$RecycleListView;
    private getLegacySharedPrefs Keep;
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private isEmulator MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private getTotalRamInBytes MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    private String PlaybackStateCompat;
    private String PlaybackStateCompat$CustomAction;
    @BindView
    protected ProgressStateBar progressStateBar;
    private String setHasDecor;

    public final /* synthetic */ <F extends BaseFragment & C1346xf91fc122> void IconCompatParcelizer(Fragment fragment, F f) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((getTimeOutParameters) this, fragment, (BaseFragment) f, (String) null);
    }

    public final /* synthetic */ void write(C1346xf91fc122 gettimeoutparameters_mediabrowsercompat_customactionresultreceiver) {
        AlertController$RecycleListView.read((getTimeOutParameters) this, gettimeoutparameters_mediabrowsercompat_customactionresultreceiver);
    }

    public static void IconCompatParcelizer(Context context, getLegacySharedPrefs getlegacysharedprefs, String str, String str2) {
        Intent intent = new Intent(context, EasycashActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", str);
        intent.putExtra("com.scb.phone.view.activity.easycash.MONTHLY_INCOME", str2);
        write(intent, getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, isRooted isrooted, getLegacySharedPrefs getlegacysharedprefs) {
        Intent intent = new Intent(context, EasycashActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", "PURPOSEFUL");
        intent.putExtra("com.scb.phone.view.activity.easycash.PURPOSEFUL_LOAN_DISPLAY", isrooted);
        write(intent, getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, String str, getLegacySharedPrefs getlegacysharedprefs) {
        Intent intent = new Intent(context, EasycashActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", "COMMERCIAL");
        intent.putExtra("NCB_TRANSACTION_ID", str);
        write(intent, getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Activity activity, getLegacySharedPrefs getlegacysharedprefs, String str, String str2) {
        Intent intent = new Intent(activity, EasycashActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", "HOME");
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_APPLICATION_ID", str);
        intent.putExtra("NCB_TRANSACTION_ID", str2);
        write(intent, getlegacysharedprefs);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivityForResult(read, 12032);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void read(Activity activity, getLegacySharedPrefs getlegacysharedprefs) {
        Intent intent = new Intent(activity, EasycashActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", "CAR");
        write(intent, getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void IconCompatParcelizer(Activity activity, getTotalRamInBytes gettotalraminbytes, getLegacySharedPrefs getlegacysharedprefs) {
        Intent intent = new Intent(activity, EasycashActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", "HOME");
        intent.putExtra("com.scb.phone.view.activity.easycash.MORTGAGE_TOPUP_DISPLAY", gettotalraminbytes);
        write(intent, getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void write(Intent intent, getLegacySharedPrefs getlegacysharedprefs) {
        if (getlegacysharedprefs != null) {
            intent.putExtra("com.scb.phone.view.activity.easycash.TILE_DISPLAY", getlegacysharedprefs);
            intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_TYPE", getlegacysharedprefs.MediaDescriptionCompat);
            intent.putExtra("com.scb.phone.view.activity.easycash.FLOW_TYPE", getlegacysharedprefs.MediaMetadataCompat);
            intent.putExtra("com.scb.phone.view.activity.easycash.MINIMUM_INCOME", getlegacysharedprefs.MediaSessionCompat$ResultReceiverWrapper);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.app.Activity) r9)
            r10 = 2131492908(0x7f0c002c, float:1.8609281E38)
            r9.setContentView(r10)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r9)
            r9.setStackedBackground()
            android.content.Intent r10 = r9.getIntent()
            if (r10 == 0) goto L_0x0096
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.PRODUCT_TYPE"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.PlaybackStateCompat$CustomAction = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.PRODUCT_GROUP"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.PlaybackStateCompat = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.FLOW_TYPE"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.MediaMetadataCompat = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.MINIMUM_INCOME"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.MediaBrowserCompat$MediaItem = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "NCB_TRANSACTION_ID"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.setHasDecor = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.MONTHLY_INCOME"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.MediaSessionCompat$Token = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.TILE_DISPLAY"
            android.os.Parcelable r10 = r10.getParcelableExtra(r0)
            o.getLegacySharedPrefs r10 = (p040o.getLegacySharedPrefs) r10
            r9.Keep = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.PURPOSEFUL_LOAN_DISPLAY"
            android.os.Parcelable r10 = r10.getParcelableExtra(r0)
            o.isRooted r10 = (p040o.isRooted) r10
            r9.AlertController$RecycleListView = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.MORTGAGE_TOPUP_DISPLAY"
            android.os.Parcelable r10 = r10.getParcelableExtra(r0)
            o.getTotalRamInBytes r10 = (p040o.getTotalRamInBytes) r10
            r9.MediaSessionCompat$ResultReceiverWrapper = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.view.activity.easycash.EXTRA_APPLICATION_ID"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.MediaBrowserCompat$SearchResultReceiver = r10
        L_0x0096:
            java.lang.String r10 = r9.PlaybackStateCompat
            int r0 = r10.hashCode()
            r1 = 3
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 5
            r6 = 2
            r7 = -1
            switch(r0) {
                case -348127329: goto L_0x00d9;
                case 66484: goto L_0x00cf;
                case 2223327: goto L_0x00c5;
                case 63893315: goto L_0x00bb;
                case 72606051: goto L_0x00b1;
                case 1387439946: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00e3
        L_0x00a7:
            java.lang.String r0 = "COMMERCIAL"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00e3
            r10 = r1
            goto L_0x00e4
        L_0x00b1:
            java.lang.String r0 = "LOANS"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00e3
            r10 = r2
            goto L_0x00e4
        L_0x00bb:
            java.lang.String r0 = "CARDS"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00e3
            r10 = r3
            goto L_0x00e4
        L_0x00c5:
            java.lang.String r0 = "HOME"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00e3
            r10 = r4
            goto L_0x00e4
        L_0x00cf:
            java.lang.String r0 = "CAR"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00e3
            r10 = r5
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r0 = "PURPOSEFUL"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00e3
            r10 = r6
            goto L_0x00e4
        L_0x00e3:
            r10 = r7
        L_0x00e4:
            r0 = 0
            if (r10 == 0) goto L_0x015a
            r8 = 2130903042(0x7f030002, float:1.741289E38)
            if (r10 == r2) goto L_0x014b
            if (r10 == r6) goto L_0x013c
            if (r10 == r1) goto L_0x012f
            if (r10 == r4) goto L_0x0104
            if (r10 == r5) goto L_0x00f7
            r10 = r0
            goto L_0x016b
        L_0x00f7:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String[] r0 = r10.getStringArray(r8)
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMCMCInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMCMCInformationFragment.MediaBrowserCompat$SearchResultReceiver()
            goto L_0x016b
        L_0x0104:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String[] r0 = r10.getStringArray(r8)
            java.lang.String r10 = r9.PlaybackStateCompat$CustomAction
            int r1 = r10.hashCode()
            r2 = 277399877(0x1088c945, float:5.3952646E-29)
            if (r1 != r2) goto L_0x0120
            java.lang.String r1 = "HOME_TOP_UP"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r3 = r7
        L_0x0121:
            if (r3 == 0) goto L_0x0128
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMHMCInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMHMCInformationFragment.MediaBrowserCompat$MediaItem()
            goto L_0x016b
        L_0x0128:
            o.getTotalRamInBytes r10 = r9.MediaSessionCompat$ResultReceiverWrapper
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesRefillableInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesRefillableInformationFragment.MediaBrowserCompat$CustomActionResultReceiver((p040o.getTotalRamInBytes) r10)
            goto L_0x016b
        L_0x012f:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String[] r0 = r10.getStringArray(r8)
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesCommercialLoanInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesCommercialLoanInformationFragment.IconCompatParcelizer()
            goto L_0x016b
        L_0x013c:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String[] r0 = r10.getStringArray(r8)
            o.isRooted r10 = r9.AlertController$RecycleListView
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesPurposefulLoanInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesPurposefulLoanInformationFragment.read((p040o.isRooted) r10)
            goto L_0x016b
        L_0x014b:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String[] r0 = r10.getStringArray(r8)
            java.lang.String r10 = r9.MediaSessionCompat$Token
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesLoanInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesLoanInformationFragment.IconCompatParcelizer(r10)
            goto L_0x016b
        L_0x015a:
            android.content.res.Resources r10 = r9.getResources()
            r0 = 2130903041(0x7f030001, float:1.7412889E38)
            java.lang.String[] r0 = r10.getStringArray(r0)
            java.lang.String r10 = r9.MediaSessionCompat$Token
            com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesCardInformationFragment r10 = com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesCardInformationFragment.IconCompatParcelizer(r10)
        L_0x016b:
            com.scb.phone.view.custom.common.ProgressStateBar r1 = r9.progressStateBar
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.setStates(r0)
            if (r10 == 0) goto L_0x0190
            o.setTitleMarginStart r0 = r9.getSupportFragmentManager()
            o.CardView r0 = r0.read()
            r1 = 2131297116(0x7f09035c, float:1.8212168E38)
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getSimpleName()
            o.CardView r10 = r0.IconCompatParcelizer(r1, r10, r2)
            r10.write()
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.easycash.EasycashActivity.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.scb.phone.view.activity.easycash.PRODUCT_TYPE", this.PlaybackStateCompat$CustomAction);
        bundle.putString("com.scb.phone.view.activity.easycash.PRODUCT_GROUP", this.PlaybackStateCompat);
        bundle.putString("com.scb.phone.view.activity.easycash.FLOW_TYPE", this.MediaMetadataCompat);
        bundle.putString("com.scb.phone.view.activity.easycash.MINIMUM_INCOME", this.MediaBrowserCompat$MediaItem);
        bundle.putString("NCB_TRANSACTION_ID", this.setHasDecor);
        bundle.putString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME", this.MediaSessionCompat$Token);
        bundle.putParcelable("com.scb.phone.view.activity.easycash.TILE_DISPLAY", this.Keep);
        bundle.putParcelable("com.scb.phone.view.activity.easycash.PURPOSEFUL_LOAN_DISPLAY", this.AlertController$RecycleListView);
        bundle.putParcelable("com.scb.phone.view.activity.easycash.MORTGAGE_TOPUP_DISPLAY", this.MediaSessionCompat$ResultReceiverWrapper);
        bundle.putParcelable("com.scb.phone.view.activity.easycash.PURPOSEFUL_LOAN_INFO", this.MediaDescriptionCompat);
        bundle.putString("com.scb.phone.view.activity.easycash.EXTRA_APPLICATION_ID", this.MediaBrowserCompat$SearchResultReceiver);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.PlaybackStateCompat$CustomAction = bundle.getString("com.scb.phone.view.activity.easycash.PRODUCT_TYPE");
        this.PlaybackStateCompat = bundle.getString("com.scb.phone.view.activity.easycash.PRODUCT_GROUP");
        this.MediaMetadataCompat = bundle.getString("com.scb.phone.view.activity.easycash.FLOW_TYPE");
        this.MediaBrowserCompat$MediaItem = bundle.getString("com.scb.phone.view.activity.easycash.MINIMUM_INCOME");
        this.setHasDecor = bundle.getString("NCB_TRANSACTION_ID");
        this.MediaSessionCompat$Token = bundle.getString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME");
        this.Keep = (getLegacySharedPrefs) bundle.getParcelable("com.scb.phone.view.activity.easycash.TILE_DISPLAY");
        this.AlertController$RecycleListView = (isRooted) bundle.getParcelable("com.scb.phone.view.activity.easycash.PURPOSEFUL_LOAN_DISPLAY");
        this.MediaSessionCompat$ResultReceiverWrapper = (getTotalRamInBytes) bundle.getParcelable("com.scb.phone.view.activity.easycash.MORTGAGE_TOPUP_DISPLAY");
        this.MediaDescriptionCompat = (isEmulator) bundle.getParcelable("com.scb.phone.view.activity.easycash.PURPOSEFUL_LOAN_INFO");
        this.MediaBrowserCompat$SearchResultReceiver = bundle.getString("com.scb.phone.view.activity.easycash.EXTRA_APPLICATION_ID");
    }

    public final String MediaBrowserCompat$SearchResultReceiver() {
        return this.PlaybackStateCompat$CustomAction;
    }

    public final String MediaMetadataCompat() {
        return this.PlaybackStateCompat;
    }

    public final String IconCompatParcelizer() {
        return this.setHasDecor;
    }

    public final getLegacySharedPrefs MediaDescriptionCompat() {
        return this.Keep;
    }

    public final isRooted MediaBrowserCompat$MediaItem() {
        return this.AlertController$RecycleListView;
    }

    public final getTotalRamInBytes MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final String write() {
        return this.MediaMetadataCompat;
    }

    public void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof EasycashIssuerLandingFragment) {
            ((EasycashIssuerLandingFragment) findFragmentById).MediaBrowserCompat$ItemReceiver();
        }
        super.onBackPressed();
        Fragment findFragmentById2 = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById2 instanceof BreadcrumbFragment) {
            ((BreadcrumbFragment) findFragmentById2).setPadding();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final ProgressStateBar ParcelableVolumeInfo() {
        return this.progressStateBar;
    }

    public final getTimeOutParameters.write MediaSessionCompat$ResultReceiverWrapper() {
        return new C7345pG(this);
    }

    public final isEmulator MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final void IconCompatParcelizer(isEmulator isemulator) {
        this.MediaDescriptionCompat = isemulator;
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    public final String read() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final void read(animateCamera animatecamera) {
        super.onBackPressed();
        EasycashOccupationInfoFragment easycashOccupationInfoFragment = (EasycashOccupationInfoFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        easycashOccupationInfoFragment.IconCompatParcelizer(animatecamera);
        easycashOccupationInfoFragment.setPadding();
    }

    public final void MediaBrowserCompat$ItemReceiver(animateCamera animatecamera) {
        super.onBackPressed();
        EasycashContactInformationFragment easycashContactInformationFragment = (EasycashContactInformationFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        Image.C34591 r1 = easycashContactInformationFragment.presenter;
        r1.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem = animatecamera;
        r1.IconCompatParcelizer(true);
        easycashContactInformationFragment.setPadding();
    }

    public final void RatingCompat() {
        super.onBackPressed();
        EasycashIssuerLandingFragment easycashIssuerLandingFragment = (EasycashIssuerLandingFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        easycashIssuerLandingFragment.write();
        easycashIssuerLandingFragment.setPadding();
    }

    public final /* synthetic */ <F extends BaseFragment & C1346xf91fc122> void MediaBrowserCompat$ItemReceiver(F f) {
        getSupportFragmentManager().read().write(R.id.container, f, f.getClass().getSimpleName()).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }

    public final /* synthetic */ <F extends BaseFragment & C1346xf91fc122> void write(F f) {
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, f, f.getClass().getSimpleName()).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }
}
