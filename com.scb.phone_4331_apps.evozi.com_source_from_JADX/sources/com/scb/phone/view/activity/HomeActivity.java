package com.scb.phone.view.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.roughike.bottombar.BadgeContainer;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.bankingaccount.BankingActionActivity;
import com.scb.phone.view.activity.chequemanagement.activatecheque.ActivateChequeLandingActivity;
import com.scb.phone.view.activity.chequemanagement.chequestatus.ChequeStatusActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.adapter.C1111xc07df820;
import com.scb.phone.view.adapter.notification.NotificationAdapter;
import com.scb.phone.view.custom.KnockKnockView;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.accountsummary.AccountSummaryFragment;
import com.scb.phone.view.fragment.landingpage.LandingFragment;
import com.scb.phone.view.fragment.moneyaction.MoneyActionFragment;
import com.scb.phone.view.fragment.moreoptions.MoreOptionsFragment;
import com.scb.phone.view.fragment.notification.NotificationFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import p040o.ActivityBuilder_ContributeFundOtpActivity;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.BundleCacheProvider;
import p040o.BundleCacheProvider_Factory;
import p040o.C10829Sizeof;
import p040o.C6377x418fbbc1;
import p040o.CardView;
import p040o.CheckCaptureModule;
import p040o.CrashlyticsReportPersistence;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.IBundle;
import p040o.IBundleCacheProvider;
import p040o.IBundleFile;
import p040o.Licensing;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProxySourceAdapter$ItemViewHolder;
import p040o.ServerProjectProvider_MembersInjector;
import p040o.ZHER;
import p040o.cacheProject;
import p040o.cacheVariant;
import p040o.clearCache;
import p040o.computeEnumSizeNoTag;
import p040o.computeUInt32SizeNoTag;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.generateEventFilename;
import p040o.getAbsolutePath;
import p040o.getCar;
import p040o.getEventAppCustomAttributeSize;
import p040o.getICheckDeserializerRtti;
import p040o.getIdType;
import p040o.getLatestModelDataBuildInfo;
import p040o.getLatestVersionForProject;
import p040o.getNextTransition;
import p040o.getServerUrl;
import p040o.getSessionIdForFile;
import p040o.inject_connectivityManager;
import p040o.isDirectory;
import p040o.isSupportFragmentClass;
import p040o.lambda$capAndGetOpenSessions$3;
import p040o.onGetStartedClick;
import p040o.part;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNdkPayload;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.show;
import p040o.zzmd;
import p059me.relex.circleindicator.CircleIndicator;

public class HomeActivity extends BaseActivity implements getCar, ViewTreeObserver.OnGlobalLayoutListener, ZHER, C1111xc07df820, ViewPager.MediaMetadataCompat, LandingFragment.read, LandingFragment.write {
    private static boolean MediaDescriptionCompat = false;
    private int AlertController$RecycleListView;
    private String[] AppCompatActivity = {"LANDING_PAGE_TAG", "ACCOUNT_SUMMARY_TAG", "MONEY_OUT_TAG", "NOTIFICATION_TAG", "MORE_OPTIONS_TAG"};
    private List<String> AppCompatDelegateImpl$ListMenuDecorView = new ArrayList();
    private String AppCompatDialogFragment;
    private List<Integer> Keep = new ArrayList();
    public boolean MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaMetadataCompat;
    private BottomBarTab MediaSessionCompat$ResultReceiverWrapper;
    private C6377x418fbbc1 MediaSessionCompat$Token = new getAbsolutePath(this);
    private List<String> PlaybackStateCompat = new ArrayList();
    private ImageView PlaybackStateCompat$CustomAction;
    @BindView
    ImageView fastPaySettingCoachmarkImage;
    @HmlPinActivity
    public getEventAppCustomAttributeSize homePresenter;
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @BindView
    public ImageView ivJuristicCoachMark;
    @BindView
    KnockKnockView knockView;
    @BindView
    ImageView mBlurBackgroundImageView;
    @BindView
    public BottomBar mBottomNavigationView;
    @BindView
    FrameLayout mFragmentContainer;
    @BindView
    LinearLayout mLifestyleTutorialContainer;
    @BindView
    CircleIndicator mLifestyleTutorialIndicator;
    @BindView
    ViewPager mLifestyleTutorialViewPager;
    @BindView
    public RelativeLayout mRemoveTileLayout;
    @BindView
    public TextView mRemoveTileTextView;
    @BindView
    RelativeLayout mRootView;
    @BindView
    public ImageView mTrashImageView;
    @BindView
    public FrameLayout moneyOutTutorial;
    private boolean setBackgroundResource = false;
    private BulkTransferDeepLinkActivity setContentView;
    private Queue<Runnable> setExpandedFormat = new ArrayDeque();
    private boolean setHasDecor = false;

    /* access modifiers changed from: protected */
    public final int ExpandedMenuView() {
        return R.style.f95792131820796;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
    }

    public static final /* synthetic */ void read(Activity activity, Intent intent) {
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((HomeActivity) activity).startActivityForResult(read, 322);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void write(Activity activity, Intent intent) {
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((HomeActivity) activity).startActivityForResult(read, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((HomeActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void write(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((HomeActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void read(Context context, LogFileManager.DirectoryProvider directoryProvider) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_PRELOAD_CHECK", directoryProvider);
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

    public static void write(Context context, boolean z) {
        if (context != null) {
            Intent putExtra = new Intent(context, HomeActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", z);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, putExtra).read();
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
    }

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, HomeActivity.class).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab).addFlags(603979776);
    }

    public static Intent read(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("EXTRA_NAVIGATE_TO_BANKING_ACTION", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78372131493062);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.setContentView = setChildDrawingOrderCallback.IconCompatParcelizer(this, new IntentFilter("com.scb.phone/BROADCAST_SHOW_QUICK_OPERATION_SNACK_BAR")).subscribe(new cacheVariant(this), isDirectory.MediaBrowserCompat$CustomActionResultReceiver);
        this.homePresenter.MediaBrowserCompat$ItemReceiver(this);
        setMenu();
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.AlertController$RecycleListView = R.id.fragment_container_home;
        write(bundle);
        this.MediaMetadataCompat = true;
        getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
        if (geteventappcustomattributesize.write.IconCompatParcelizer.read()) {
            part part = part.IconCompatParcelizer;
            if (geteventappcustomattributesize.RatingCompat != null) {
                part.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
            }
            geteventappcustomattributesize.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(false);
        }
        MediaDescriptionCompat = true;
        if (getIntent().getBooleanExtra("EXTRA_NAVIGATE_TO_BANKING_ACTION", false)) {
            Intent intent = new Intent(this, BankingActionActivity.class);
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
    }

    public static boolean AppCompatDelegateImpl$ListMenuDecorView() {
        return MediaDescriptionCompat;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            super.onResume()
            o.getEventAppCustomAttributeSize r0 = r5.homePresenter
            if (r0 == 0) goto L_0x0056
            o.getEulerY r1 = r0.MediaBrowserCompat$ItemReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.MediaBrowserCompat$ItemReceiver
            o.GoogleMap$OnMarkerDragListener r1 = r1.AppCompatDelegateImpl$ListMenuDecorView()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0026
            o.getEulerY r1 = r0.MediaBrowserCompat$ItemReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.MediaBrowserCompat$ItemReceiver
            o.GoogleMap$OnMarkerDragListener r1 = r1.AppCompatDelegateImpl$ListMenuDecorView()
            int r1 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r1 <= 0) goto L_0x0021
            r1 = r2
            goto L_0x0022
        L_0x0021:
            r1 = r3
        L_0x0022:
            if (r1 == 0) goto L_0x0026
            r1 = r2
            goto L_0x0027
        L_0x0026:
            r1 = r3
        L_0x0027:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.read
            if (r4 != 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r1)
            r0.read = r2
            goto L_0x0056
        L_0x0033:
            boolean r4 = r4.get()
            if (r4 == r1) goto L_0x0056
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.read
            r4.set(r1)
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x0044
            r1 = r2
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            if (r1 == 0) goto L_0x0056
            o.computeUInt64SizeNoTag r1 = p040o.computeUInt64SizeNoTag.write
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = r3
        L_0x004f:
            if (r2 == 0) goto L_0x0056
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0056:
            java.lang.String r0 = r5.AppCompatDialogFragment
            if (r0 == 0) goto L_0x0061
            boolean r1 = r5.MediaMetadataCompat
            if (r1 != 0) goto L_0x0061
            r5.write((java.lang.String) r0)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.HomeActivity.onResume():void");
    }

    private void MediaBrowserCompat$ItemReceiver(Intent intent) {
        if (intent != null && intent.hasExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT")) {
            BottomBar bottomBar = this.mBottomNavigationView;
            bottomBar.read(((BottomBarTab) bottomBar.MediaBrowserCompat$ItemReceiver.findViewById(intent.getIntExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", 0))).read);
            this.setHasDecor = intent.getBooleanExtra("com.scb.phone.EXTRA_FROM_BANKING_ACTION", false);
            if (intent.getBooleanExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", false)) {
                Intent intent2 = new Intent();
                intent2.setAction("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH");
                sendBroadcast(intent2);
            }
            getIntent().removeExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 2
            switch(r0) {
                case -1418518766: goto L_0x0034;
                case 1408470602: goto L_0x002a;
                case 1636776975: goto L_0x0020;
                case 1887270438: goto L_0x0016;
                case 2096255055: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "MORE_OPTIONS_TAG"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = r1
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "NOTIFICATION_TAG"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = r2
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "ACCOUNT_SUMMARY_TAG"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "MONEY_OUT_TAG"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = r4
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "LANDING_PAGE_TAG"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 0
            goto L_0x003f
        L_0x003e:
            r6 = -1
        L_0x003f:
            if (r6 == 0) goto L_0x0061
            if (r6 == r3) goto L_0x005b
            if (r6 == r4) goto L_0x0055
            if (r6 == r2) goto L_0x004f
            if (r6 != r1) goto L_0x0066
            java.lang.String r6 = "moreoptionsmenu"
            r5.mo13676d_(r6)
            return
        L_0x004f:
            java.lang.String r6 = "notificationcenter"
            r5.mo13676d_(r6)
            return
        L_0x0055:
            java.lang.String r6 = "moneymovement_landing"
            r5.mo13676d_(r6)
            return
        L_0x005b:
            java.lang.String r6 = "accountsummary_landing"
            r5.mo13676d_(r6)
            return
        L_0x0061:
            java.lang.String r6 = "lifestyle_landing"
            r5.mo13676d_(r6)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.HomeActivity.write(java.lang.String):void");
    }

    public void onStop() {
        super.onStop();
        this.MediaMetadataCompat = false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if (intent.hasExtra("FROM_LINK_TAG")) {
            setIntent(intent);
            String action = getIntent().getAction();
            if (action != null) {
                this.homePresenter.IconCompatParcelizer(action);
                return;
            }
            return;
        }
        MediaBrowserCompat$ItemReceiver(intent);
    }

    private void write(Bundle bundle) {
        if (getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("com.scb.phone.EXTRA_NEED_RELOAD", false) || this.setBackgroundResource) {
            if (!(getIntent() == null || getIntent().getExtras() == null || getIntent().getExtras().getParcelable("com.scb.phone.EXTRA_PRELOAD_CHECK") == null)) {
                getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
                if (!(geteventappcustomattributesize.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write() == null || geteventappcustomattributesize.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$SearchResultReceiver == null)) {
                    String replace = "3.40.1".replace("-prod", "");
                    String str = geteventappcustomattributesize.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$SearchResultReceiver;
                    if ((geteventappcustomattributesize.RatingCompat != null) && geteventappcustomattributesize.read()) {
                        if (getICheckDeserializerRtti.write(str, replace).intValue() > 0) {
                            lambda$capAndGetOpenSessions$3 lambda_capandgetopensessions_3 = lambda$capAndGetOpenSessions$3.MediaBrowserCompat$CustomActionResultReceiver;
                            if (geteventappcustomattributesize.RatingCompat != null) {
                                lambda_capandgetopensessions_3.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                            }
                        } else {
                            generateEventFilename generateeventfilename = generateEventFilename.write;
                            if (geteventappcustomattributesize.RatingCompat != null) {
                                generateeventfilename.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                            }
                        }
                    }
                }
                if (bundle == null) {
                    getEventAppCustomAttributeSize geteventappcustomattributesize2 = this.homePresenter;
                    if (!(!getEventAppCustomAttributeSize.MediaBrowserCompat$CustomActionResultReceiver(geteventappcustomattributesize2.IconCompatParcelizer(), geteventappcustomattributesize2.MediaBrowserCompat$CustomActionResultReceiver()).isEmpty())) {
                        this.homePresenter.IconCompatParcelizer(setTitleOptional());
                    }
                }
            }
            getEventAppCustomAttributeSize geteventappcustomattributesize3 = this.homePresenter;
            geteventappcustomattributesize3.MediaMetadataCompat.IconCompatParcelizer();
            geteventappcustomattributesize3.MediaMetadataCompat.IconCompatParcelizer(new getEventAppCustomAttributeSize.IconCompatParcelizer(geteventappcustomattributesize3, (byte) 0));
            CardView read = getSupportFragmentManager().read();
            read.write(this.AlertController$RecycleListView, new LandingFragment(), "LANDING_PAGE_TAG");
            read.MediaBrowserCompat$ItemReceiver();
            setWindowCallback();
            return;
        }
        this.setBackgroundResource = true;
        setIntent(getIntent().putExtra("com.scb.phone.EXTRA_NEED_RELOAD", false));
        ActionBarOverlayLayout();
    }

    public final void IconCompatParcelizer(getSessionIdForFile getsessionidforfile) {
        this.setExpandedFormat.add(new cacheProject(this, getsessionidforfile));
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(this, ChequeStatusActivity.class);
        intent.putExtra("insufficient", true);
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

    public final void MediaMetadataCompat() {
        Intent intent = new Intent(this, ActivateChequeLandingActivity.class);
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

    public final void MediaBrowserCompat$ItemReceiver() {
        CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = this.inAppUpdateHelper;
        C6377x418fbbc1 checkCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$ItemReceiver = this.MediaSessionCompat$Token;
        onGetStartedClick.write((Object) this, "activity");
        onGetStartedClick.write((Object) checkCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$ItemReceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ktaExceptionResponseDeserializer.MediaBrowserCompat$ItemReceiver = checkCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$ItemReceiver;
        ktaExceptionResponseDeserializer.read.write().read(new CheckCaptureModule.KtaExceptionResponseDeserializer.IconCompatParcelizer(ktaExceptionResponseDeserializer, 0, this, 8726));
        this.homePresenter.write();
    }

    public final void read() {
        CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = this.inAppUpdateHelper;
        onGetStartedClick.write((Object) this, "activity");
        ktaExceptionResponseDeserializer.read.write().read(new CheckCaptureModule.KtaExceptionResponseDeserializer.IconCompatParcelizer(ktaExceptionResponseDeserializer, 1, this, 8725));
        this.homePresenter.write();
    }

    public final void MediaSessionCompat$QueueItem() {
        mo13677k_(getString(R.string.push_notification_enable_error));
    }

    public final void setContentView() {
        MediaBrowserCompat$ItemReceiver(getString(R.string.push_notification_enable_success));
    }

    public final void write() {
        this.ivJuristicCoachMark.setVisibility(0);
        this.mBottomNavigationView.setVisibility(8);
        int[] iArr = {0};
        this.ivJuristicCoachMark.setImageLevel(iArr[0]);
        this.ivJuristicCoachMark.setOnClickListener(new inject_connectivityManager(this, iArr));
    }

    public final void IconCompatParcelizer() {
        isSupportFragmentClass issupportfragmentclass;
        LandingFragment landingFragment = (LandingFragment) getSupportFragmentManager().findFragmentByTag("LANDING_PAGE_TAG");
        if (landingFragment != null) {
            C10829Sizeof.C37931 r0 = landingFragment.landingPagePresenter;
            List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list = r0.IconCompatParcelizer;
            if (list != null) {
                show show = new show(list);
                show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, Licensing.LicenseServerType.read));
                if (show2.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                if (issupportfragmentclass.IconCompatParcelizer != null) {
                    T t = issupportfragmentclass.IconCompatParcelizer;
                    if (t != null) {
                        r0.write((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) t);
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                }
            }
            setIntent(getIntent().setAction((String) null));
        }
    }

    private void setMenu() {
        BottomBarTab bottomBarTab;
        for (int i = 0; i < this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver.getChildCount(); i++) {
            View childAt = this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver.getChildAt(i);
            if (childAt instanceof BadgeContainer) {
                bottomBarTab = BottomBar.MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
            } else {
                bottomBarTab = (BottomBarTab) childAt;
            }
            bottomBarTab.setGravity(16);
        }
    }

    private void setWindowCallback() {
        this.mBottomNavigationView.setOnTabSelectListener(new ServerProjectProvider_MembersInjector(this));
        this.mBottomNavigationView.setOnTabReselectListener(this);
        this.mBottomNavigationView.setDefaultTab(R.id.landing_page_tab);
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = (BottomBarTab) this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver.findViewById(R.id.notification_tab);
        }
    }

    private void RatingCompat(String str) {
        if (!setGroupDividerEnabled() || mo13022E_()) {
            Intent write = PinLoginActivity.write((Context) this);
            IntentTidInjectionActivityAspect.aspectOf();
            write((Activity) this, write);
            setSubtitle();
            return;
        }
        MediaBrowserCompat$SearchResultReceiver(str);
    }

    private void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.write = !AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(str);
        if (this.ParcelableVolumeInfo != null) {
            this.ParcelableVolumeInfo.MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(str);
        }
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        CardView read = supportFragmentManager.read();
        for (String findFragmentByTag : this.AppCompatActivity) {
            Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(findFragmentByTag);
            if (findFragmentByTag2 != null) {
                read.MediaBrowserCompat$ItemReceiver(findFragmentByTag2);
            }
        }
        Fragment findFragmentByTag3 = supportFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag3 != null) {
            if (findFragmentByTag3 instanceof MoneyActionFragment) {
                setOverlayMode();
            }
            read.IconCompatParcelizer(findFragmentByTag3);
        } else if ("ACCOUNT_SUMMARY_TAG".equals(str)) {
            read.write(this.AlertController$RecycleListView, new AccountSummaryFragment(), "ACCOUNT_SUMMARY_TAG");
        } else if ("MONEY_OUT_TAG".equals(str)) {
            read.write(this.AlertController$RecycleListView, MoneyActionFragment.read(setOverlayMode()), "MONEY_OUT_TAG");
        } else if ("NOTIFICATION_TAG".equals(str)) {
            read.write(this.AlertController$RecycleListView, new NotificationFragment(), "NOTIFICATION_TAG");
        } else if ("MORE_OPTIONS_TAG".equals(str)) {
            read.write(this.AlertController$RecycleListView, MoreOptionsFragment.IconCompatParcelizer(this.homePresenter.MediaBrowserCompat$ItemReceiver()), "MORE_OPTIONS_TAG");
        }
        if (!TextUtils.isEmpty(str)) {
            write(str);
        }
        read.MediaBrowserCompat$CustomActionResultReceiver();
        if (Build.VERSION.SDK_INT < 24) {
            supportFragmentManager.IconCompatParcelizer();
        }
    }

    private byte[] setOverlayMode() {
        FrameLayout frameLayout = this.mFragmentContainer;
        Bitmap IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer((View) frameLayout, frameLayout.getWidth(), this.mFragmentContainer.getHeight());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (IconCompatParcelizer == null) {
            return new byte[0];
        }
        IconCompatParcelizer.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
        IconCompatParcelizer.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public void onBackPressed() {
        if (this.moneyOutTutorial.getVisibility() == 0) {
            this.moneyOutTutorial.animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new BundleCacheProvider(this));
            return;
        }
        String str = this.AppCompatDialogFragment;
        if (str == null || "LANDING_PAGE_TAG".equals(str)) {
            this.homePresenter.MediaSessionCompat$ResultReceiverWrapper = false;
            this.homePresenter.MediaSessionCompat$QueueItem.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(false);
            if (getApplication() instanceof AndroidApplication) {
                ((AndroidApplication) getApplication()).IconCompatParcelizer = true;
            }
            super.onBackPressed();
            return;
        }
        BottomBar bottomBar = this.mBottomNavigationView;
        bottomBar.read(((BottomBarTab) bottomBar.MediaBrowserCompat$ItemReceiver.findViewById(R.id.landing_page_tab)).read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH");
        sendBroadcast(intent);
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.setContentView;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.setContentView.dispose();
        }
        this.homePresenter.onDestroy();
        if (this.PlaybackStateCompat$CustomAction != null) {
            Picasso read = Picasso.read();
            ImageView imageView = this.PlaybackStateCompat$CustomAction;
            if (imageView != null) {
                read.write((Object) imageView);
            } else {
                throw new IllegalArgumentException("view cannot be null.");
            }
        }
        this.setExpandedFormat.clear();
        MediaDescriptionCompat = false;
        CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = this.inAppUpdateHelper;
        ktaExceptionResponseDeserializer.read.MediaBrowserCompat$ItemReceiver(ktaExceptionResponseDeserializer.write);
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        BottomBarTab bottomBarTab = this.MediaSessionCompat$ResultReceiverWrapper;
        if (bottomBarTab != null) {
            bottomBarTab.setBadgeCount(i);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r0.equals("OLD_LIFE_STYLE_TUTORIAL") != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(java.util.Set<java.lang.String> r5) {
        /*
            r4 = this;
            o.getEventAppCustomAttributeSize r0 = r4.homePresenter
            java.util.List r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List r5 = p040o.getEventAppCustomAttributeSize.MediaBrowserCompat$CustomActionResultReceiver((java.util.Set<java.lang.String>) r5, (java.util.List<java.lang.String>) r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x036d
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r0 = r5.hasNext()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0322
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.hashCode()
            switch(r3) {
                case -2027331403: goto L_0x00b6;
                case -1205983050: goto L_0x00ab;
                case -1096257064: goto L_0x00a1;
                case -439050656: goto L_0x0096;
                case -403062857: goto L_0x008d;
                case -375168409: goto L_0x0082;
                case 16117471: goto L_0x0078;
                case 454252204: goto L_0x006d;
                case 921967214: goto L_0x0063;
                case 1019523709: goto L_0x0058;
                case 1061911864: goto L_0x004d;
                case 1262276620: goto L_0x0042;
                case 1596774289: goto L_0x0037;
                case 1656066037: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x00c0
        L_0x002c:
            java.lang.String r1 = "QR_PAYMENT_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 7
            goto L_0x00c1
        L_0x0037:
            java.lang.String r1 = "FASTPAY_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 5
            goto L_0x00c1
        L_0x0042:
            java.lang.String r1 = "QR_CODE_SECTION_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 2
            goto L_0x00c1
        L_0x004d:
            java.lang.String r1 = "STATIC_TILES_EASY_CASH_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 4
            goto L_0x00c1
        L_0x0058:
            java.lang.String r1 = "MAILING_ADDRESS_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 12
            goto L_0x00c1
        L_0x0063:
            java.lang.String r1 = "ANNOTATION_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 6
            goto L_0x00c1
        L_0x006d:
            java.lang.String r1 = "E_MARKETPLACE_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 13
            goto L_0x00c1
        L_0x0078:
            java.lang.String r1 = "REMITTANCE_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = r2
            goto L_0x00c1
        L_0x0082:
            java.lang.String r1 = "JUST_FOR_YOU_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 11
            goto L_0x00c1
        L_0x008d:
            java.lang.String r2 = "OLD_LIFE_STYLE_TUTORIAL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x0096:
            java.lang.String r1 = "JURISTIC_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 9
            goto L_0x00c1
        L_0x00a1:
            java.lang.String r1 = "PREDICTIVE_TILES_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 1
            goto L_0x00c1
        L_0x00ab:
            java.lang.String r1 = "HML_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 10
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r1 = "STATIC_TILES_CUSTOMIZATION_TUTORIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            r1 = 3
            goto L_0x00c1
        L_0x00c0:
            r1 = -1
        L_0x00c1:
            switch(r1) {
                case 0: goto L_0x02b4;
                case 1: goto L_0x028e;
                case 2: goto L_0x0268;
                case 3: goto L_0x0242;
                case 4: goto L_0x021c;
                case 5: goto L_0x01f6;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01aa;
                case 8: goto L_0x0184;
                case 9: goto L_0x015e;
                case 10: goto L_0x0138;
                case 11: goto L_0x0112;
                case 12: goto L_0x00ec;
                case 13: goto L_0x00c6;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            goto L_0x0014
        L_0x00c6:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231444(0x7f0802d4, float:1.807897E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131756202(0x7f1004aa, float:1.9143305E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131756201(0x7f1004a9, float:1.9143303E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x00ec:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231465(0x7f0802e9, float:1.8079012E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131756200(0x7f1004a8, float:1.91433E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131756199(0x7f1004a7, float:1.9143299E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0112:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231443(0x7f0802d3, float:1.8078967E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131756204(0x7f1004ac, float:1.9143309E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131756203(0x7f1004ab, float:1.9143307E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0138:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231442(0x7f0802d2, float:1.8078965E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758767(0x7f100eaf, float:1.9148507E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758780(0x7f100ebc, float:1.9148534E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x015e:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231440(0x7f0802d0, float:1.8078961E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758765(0x7f100ead, float:1.9148503E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758778(0x7f100eba, float:1.914853E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0184:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231441(0x7f0802d1, float:1.8078963E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758766(0x7f100eae, float:1.9148505E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758779(0x7f100ebb, float:1.9148532E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x01aa:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231439(0x7f0802cf, float:1.807896E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758764(0x7f100eac, float:1.9148501E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758777(0x7f100eb9, float:1.9148528E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x01d0:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231452(0x7f0802dc, float:1.8078985E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758775(0x7f100eb7, float:1.9148524E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758788(0x7f100ec4, float:1.914855E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x01f6:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231451(0x7f0802db, float:1.8078983E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758774(0x7f100eb6, float:1.9148521E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758787(0x7f100ec3, float:1.9148548E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x021c:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231450(0x7f0802da, float:1.8078981E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758773(0x7f100eb5, float:1.914852E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758786(0x7f100ec2, float:1.9148546E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0242:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231449(0x7f0802d9, float:1.807898E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758772(0x7f100eb4, float:1.9148517E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758785(0x7f100ec1, float:1.9148544E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0268:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231448(0x7f0802d8, float:1.8078977E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758771(0x7f100eb3, float:1.9148515E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758784(0x7f100ec0, float:1.9148542E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x028e:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231447(0x7f0802d7, float:1.8078975E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758770(0x7f100eb2, float:1.9148513E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758783(0x7f100ebf, float:1.914854E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x02b4:
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231438(0x7f0802ce, float:1.8078957E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231445(0x7f0802d5, float:1.8078971E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = r4.Keep
            r1 = 2131231446(0x7f0802d6, float:1.8078973E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758763(0x7f100eab, float:1.91485E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758768(0x7f100eb0, float:1.914851E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            r1 = 2131758769(0x7f100eb1, float:1.9148511E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758776(0x7f100eb8, float:1.9148526E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758781(0x7f100ebd, float:1.9148536E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r1 = 2131758782(0x7f100ebe, float:1.9148538E38)
            java.lang.String r1 = r4.getString(r1)
            r0.add(r1)
            goto L_0x0014
        L_0x0322:
            java.util.List<java.lang.Integer> r5 = r4.Keep
            int r5 = r5.size()
            java.util.List<java.lang.String> r0 = r4.PlaybackStateCompat
            int r0 = r0.size()
            if (r5 != r0) goto L_0x036d
            java.util.List<java.lang.String> r5 = r4.PlaybackStateCompat
            int r5 = r5.size()
            java.util.List<java.lang.String> r0 = r4.AppCompatDelegateImpl$ListMenuDecorView
            int r0 = r0.size()
            if (r5 != r0) goto L_0x036d
            com.roughike.bottombar.BottomBar r5 = r4.mBottomNavigationView
            r5.setVisibility(r2)
            android.widget.RelativeLayout r5 = r4.mRootView
            android.widget.ImageView r0 = r4.mBlurBackgroundImageView
            p040o.FragmentBuilder_BindDepositSelectorFragment.write((android.content.Context) r4, (android.widget.RelativeLayout) r5, (android.widget.ImageView) r0)
            com.scb.phone.view.adapter.LifestyleTutorialViewPagerAdapter r5 = new com.scb.phone.view.adapter.LifestyleTutorialViewPagerAdapter
            java.util.List<java.lang.Integer> r0 = r4.Keep
            java.util.List<java.lang.String> r2 = r4.PlaybackStateCompat
            java.util.List<java.lang.String> r3 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r5.<init>(r4, r0, r2, r3)
            r5.write = r4
            androidx.viewpager.widget.ViewPager r0 = r4.mLifestyleTutorialViewPager
            r0.setAdapter(r5)
            me.relex.circleindicator.CircleIndicator r5 = r4.mLifestyleTutorialIndicator
            androidx.viewpager.widget.ViewPager r0 = r4.mLifestyleTutorialViewPager
            r5.setViewPager(r0)
            androidx.viewpager.widget.ViewPager r5 = r4.mLifestyleTutorialViewPager
            r5.addOnPageChangeListener(r4)
            android.widget.LinearLayout r5 = r4.mLifestyleTutorialContainer
            r5.setVisibility(r1)
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.HomeActivity.write(java.util.Set):void");
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.mBottomNavigationView.setVisibility(8);
        this.moneyOutTutorial.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver(getSessionIdForFile getsessionidforfile) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        View inflate = getLayoutInflater().inflate(R.layout.f84022131493628, (ViewGroup) null);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(inflate);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_close_ads);
        TextView textView = (TextView) inflate.findViewById(R.id.do_not_show_text_view);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.light_checkbox);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.dark_checkbox);
        this.PlaybackStateCompat$CustomAction = (ImageView) inflate.findViewById(R.id.iv_ads);
        imageView.setOnClickListener(new getLatestVersionForProject(dialog));
        dialog.setOnDismissListener(new IBundleFile(this, checkBox, checkBox2, getsessionidforfile));
        int i = (int) (((float) getResources().getDisplayMetrics().widthPixels) * 0.9f);
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(getsessionidforfile.MediaBrowserCompat$CustomActionResultReceiver);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (config != null) {
            read.write = config;
            write.MediaBrowserCompat$CustomActionResultReceiver.read(i, 0);
            final getSessionIdForFile getsessionidforfile2 = getsessionidforfile;
            final ImageView imageView2 = imageView;
            final TextView textView2 = textView;
            final CheckBox checkBox3 = checkBox;
            final CheckBox checkBox4 = checkBox2;
            final Dialog dialog2 = dialog;
            write.read(this.PlaybackStateCompat$CustomAction, new FragmentBuilder_BindEkycFragment() {
                public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                }

                public final void MediaBrowserCompat$ItemReceiver() {
                    if (!HomeActivity.this.f2526x50fd9e4a) {
                        if ("FakeWhite".equalsIgnoreCase(getsessionidforfile2.MediaBrowserCompat$ItemReceiver)) {
                            imageView2.setColorFilter(setLastBaselineToBottomHeight.read(HomeActivity.this, R.color.f66132131099768));
                            textView2.setTextColor(-658442);
                            checkBox3.setVisibility(0);
                        } else {
                            imageView2.setColorFilter(setLastBaselineToBottomHeight.read(HomeActivity.this, R.color.f66092131099764));
                            textView2.setTextColor(-13290951);
                            checkBox4.setVisibility(0);
                        }
                        dialog2.show();
                    }
                }
            });
            this.PlaybackStateCompat$CustomAction.setOnClickListener(new clearCache(this, getsessionidforfile2, checkBox, checkBox2, dialog));
            return;
        }
        throw new IllegalArgumentException("config == null");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13766x50fd9e4a() {
        BottomBar bottomBar = this.mBottomNavigationView;
        bottomBar.read(((BottomBarTab) bottomBar.MediaBrowserCompat$ItemReceiver.findViewById(R.id.notification_tab)).read);
        setIntent(getIntent().setAction((String) null));
    }

    public final void MediaSessionCompat$Token() {
        BottomBar bottomBar = this.mBottomNavigationView;
        bottomBar.read(((BottomBarTab) bottomBar.MediaBrowserCompat$ItemReceiver.findViewById(R.id.landing_page_tab)).read);
        setIntent(getIntent().setAction((String) null));
    }

    public final void MediaSessionCompat$QueueItem(LogFileManager.DirectoryProvider directoryProvider) {
        super.MediaSessionCompat$QueueItem(directoryProvider);
        getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
        geteventappcustomattributesize.MediaMetadataCompat.IconCompatParcelizer();
        geteventappcustomattributesize.MediaMetadataCompat.IconCompatParcelizer(new getEventAppCustomAttributeSize.IconCompatParcelizer(geteventappcustomattributesize, (byte) 0));
        if (this.setBackgroundResource) {
            this.setBackgroundResource = false;
            CardView read = getSupportFragmentManager().read();
            read.write(this.AlertController$RecycleListView, new LandingFragment(), "LANDING_PAGE_TAG");
            read.MediaBrowserCompat$ItemReceiver();
            setWindowCallback();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        Fragment findFragmentByTag;
        if (i == R.id.notification_tab && (findFragmentByTag = getSupportFragmentManager().findFragmentByTag("NOTIFICATION_TAG")) != null) {
            NotificationFragment notificationFragment = (NotificationFragment) findFragmentByTag;
            NotificationAdapter notificationAdapter = notificationFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (notificationAdapter != null) {
                notificationAdapter.write.clear();
                notificationAdapter.IconCompatParcelizer.write();
            }
            NotificationAdapter notificationAdapter2 = notificationFragment.MediaBrowserCompat$CustomActionResultReceiver;
            ActivityBuilder_ContributeFundOtpActivity activityBuilder_ContributeFundOtpActivity = new ActivityBuilder_ContributeFundOtpActivity(notificationFragment, (setNdkPayload) null);
            if (!notificationAdapter2.MediaBrowserCompat$ItemReceiver) {
                notificationAdapter2.MediaBrowserCompat$ItemReceiver = true;
                activityBuilder_ContributeFundOtpActivity.MediaBrowserCompat$ItemReceiver(true);
            }
        }
    }

    public void onPageClick(View view) {
        int currentItem = this.mLifestyleTutorialViewPager.getCurrentItem() + 1;
        if (currentItem < this.mLifestyleTutorialViewPager.getAdapter().getCount()) {
            this.mLifestyleTutorialViewPager.setCurrentItem(currentItem);
        } else {
            closeTutorial();
        }
    }

    @OnClick
    public void closeTutorial() {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(this, "android.permission.ACCESS_FINE_LOCATION")) {
            this.homePresenter.IconCompatParcelizer(setTitleOptional());
        }
        Runnable poll = this.setExpandedFormat.poll();
        if (poll != null) {
            poll.run();
        }
        boolean z = false;
        this.mBottomNavigationView.setVisibility(0);
        this.mRootView.removeView(this.mLifestyleTutorialContainer);
        this.mRootView.removeView(this.mBlurBackgroundImageView);
        if (getICheckDeserializerRtti.read((Context) this) != 0) {
            z = true;
        }
        if (z) {
            getServerUrl.read(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void RatingCompat(boolean z) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_NEED_RELOAD", z);
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

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
        zzmd.zzm.zzb.zza titleOptional = setTitleOptional();
        boolean z = true;
        if ((geteventappcustomattributesize.RatingCompat != null) && !geteventappcustomattributesize.MediaBrowserCompat$MediaItem.write.RatingCompat() && zzmd.zzm.zzb.zza.JURISTIC.equals(titleOptional)) {
            geteventappcustomattributesize.MediaBrowserCompat$MediaItem.write.AppCompatDelegateImpl$ListMenuDecorView();
            computeUInt32SizeNoTag computeuint32sizenotag = computeUInt32SizeNoTag.read;
            if (geteventappcustomattributesize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                computeuint32sizenotag.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
            boolean z2 = true;
            if (geteventappcustomattributesize.RatingCompat != null) {
                geteventappcustomattributesize.MediaMetadataCompat.IconCompatParcelizer.AppCompatDialogFragment();
                CrashlyticsReportPersistence crashlyticsReportPersistence = new CrashlyticsReportPersistence(geteventappcustomattributesize.IconCompatParcelizer());
                if (geteventappcustomattributesize.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    crashlyticsReportPersistence.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                }
                geteventappcustomattributesize.MediaMetadataCompat.IconCompatParcelizer.setHasDecor();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        getServerUrl.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
        this.homePresenter.IconCompatParcelizer(setTitleOptional());
    }

    /* renamed from: z_ */
    public final void mo3031z_() {
        super.mo3031z_();
        getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
        geteventappcustomattributesize.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.read();
        geteventappcustomattributesize.MediaMetadataCompat.read.IconCompatParcelizer();
    }

    /* renamed from: F_ */
    public final void mo3027F_() {
        Runnable poll = this.setExpandedFormat.poll();
        if (poll != null) {
            poll.run();
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof LandingFragment) {
            LandingFragment landingFragment = (LandingFragment) fragment;
            landingFragment.MediaMetadataCompat = this;
            landingFragment.MediaDescriptionCompat = this;
        }
    }

    public final void setItemInvoker() {
        if (getIntent().hasExtra("FROM_LINK_TAG")) {
            String action = getIntent().getAction();
            if (action != null) {
                this.homePresenter.IconCompatParcelizer(action);
                return;
            }
            return;
        }
        MediaBrowserCompat$ItemReceiver(getIntent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("OUTSTATE_CURRENT_FRAGMENT", this.AppCompatDialogFragment);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.AppCompatDialogFragment = bundle.getString("OUTSTATE_CURRENT_FRAGMENT");
        }
    }

    public final void setIcon() {
        this.mBottomNavigationView.setVisibility(8);
        if (mo3026D_().equalsIgnoreCase("en")) {
            this.fastPaySettingCoachmarkImage.setImageResource(R.drawable.coachmark_qr_setting_en);
        } else if (mo3026D_().equalsIgnoreCase("th")) {
            this.fastPaySettingCoachmarkImage.setImageResource(R.drawable.coachmark_qr_setting_th);
        }
        this.fastPaySettingCoachmarkImage.setVisibility(0);
    }

    public static /* synthetic */ void read(HomeActivity homeActivity, int i) {
        boolean z = false;
        switch (i) {
            case R.id.account_summary_tab /*2131296295*/:
                if (!"ACCOUNT_SUMMARY_TAG".equals(homeActivity.AppCompatDialogFragment)) {
                    homeActivity.mo13676d_("action_nav_accountsummary");
                    homeActivity.AppCompatDialogFragment = "ACCOUNT_SUMMARY_TAG";
                    homeActivity.RatingCompat("ACCOUNT_SUMMARY_TAG");
                    return;
                }
                return;
            case R.id.landing_page_tab /*2131298688*/:
                if (!"LANDING_PAGE_TAG".equals(homeActivity.AppCompatDialogFragment)) {
                    homeActivity.mo13676d_("action_nav_lifestylelanding");
                    homeActivity.AppCompatDialogFragment = "LANDING_PAGE_TAG";
                    homeActivity.MediaBrowserCompat$SearchResultReceiver("LANDING_PAGE_TAG");
                    return;
                }
                return;
            case R.id.more_options_tab /*2131299312*/:
                if (!"MORE_OPTIONS_TAG".equals(homeActivity.AppCompatDialogFragment)) {
                    homeActivity.mo13676d_("action_nav_moreoptionsmenu");
                    homeActivity.AppCompatDialogFragment = "MORE_OPTIONS_TAG";
                    homeActivity.RatingCompat("MORE_OPTIONS_TAG");
                    return;
                }
                return;
            case R.id.notification_tab /*2131299397*/:
                if (!"NOTIFICATION_TAG".equals(homeActivity.AppCompatDialogFragment)) {
                    homeActivity.mo13676d_("action_nav_notificationcenter");
                    homeActivity.AppCompatDialogFragment = "NOTIFICATION_TAG";
                    homeActivity.RatingCompat("NOTIFICATION_TAG");
                    BottomBarTab bottomBarTab = homeActivity.MediaSessionCompat$ResultReceiverWrapper;
                    if (bottomBarTab != null) {
                        bottomBarTab.setBadgeCount(0);
                        return;
                    }
                    return;
                }
                return;
            case R.id.request_to_pay_tab /*2131299870*/:
                if (!"MONEY_OUT_TAG".equals(homeActivity.AppCompatDialogFragment)) {
                    homeActivity.mo13676d_("action_nav_moneymovement");
                    getEventAppCustomAttributeSize geteventappcustomattributesize = homeActivity.homePresenter;
                    zzmd.zzm.zzb.zza titleOptional = homeActivity.setTitleOptional();
                    if (geteventappcustomattributesize.MediaMetadataCompat.write.MediaBrowserCompat$SearchResultReceiver()) {
                        if ((geteventappcustomattributesize.RatingCompat != null) && !zzmd.zzm.zzb.zza.JURISTIC.equals(titleOptional)) {
                            computeEnumSizeNoTag computeenumsizenotag = computeEnumSizeNoTag.IconCompatParcelizer;
                            if (geteventappcustomattributesize.RatingCompat != null) {
                                z = true;
                            }
                            if (z) {
                                computeenumsizenotag.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                            }
                            geteventappcustomattributesize.MediaMetadataCompat.write.ExpandedMenuView();
                        }
                    }
                    homeActivity.AppCompatDialogFragment = "MONEY_OUT_TAG";
                    homeActivity.MediaBrowserCompat$SearchResultReceiver("MONEY_OUT_TAG");
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(HomeActivity homeActivity, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", false);
        boolean booleanExtra2 = intent.getBooleanExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        if (booleanExtra) {
            AlertController$RecycleListView.read(homeActivity, R.id.view_group_root, booleanExtra2 ? R.drawable.ic_check_circle_white_24dp : R.drawable.ic_error_white_24dp, intent.getStringExtra("com.scb.phone.EXTRA_MESSAGE"), R.color.f71012131100257, booleanExtra2 ? R.color.f67402131099896 : R.color.f66062131099761, AlertController$RecycleListView.IconCompatParcelizer((Context) homeActivity));
        }
    }

    @OnClick
    public void closeMoneyOutTutorial() {
        this.moneyOutTutorial.animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new BundleCacheProvider(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.RatingCompat = true;
        if (i == 7134) {
            if (i2 != -1) {
                BottomBar bottomBar = this.mBottomNavigationView;
                bottomBar.read(((BottomBarTab) bottomBar.MediaBrowserCompat$ItemReceiver.findViewById(R.id.landing_page_tab)).read);
                this.MediaMetadataCompat = true;
                if (this.setHasDecor) {
                    this.setHasDecor = false;
                    Intent intent2 = new Intent(this, BankingActionActivity.class);
                    IntentTidInjectionContextAspect.aspectOf();
                    try {
                        Intent read = setTapText.write(this, intent2).read();
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
            } else if ("MONEY_OUT_TAG".equals(this.AppCompatDialogFragment) || this.MediaBrowserCompat$SearchResultReceiver) {
                super.onActivityResult(i, i2, intent);
            } else {
                MediaBrowserCompat$SearchResultReceiver(this.AppCompatDialogFragment);
            }
        } else if (i != 322) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.homePresenter.RatingCompat();
        }
        this.MediaBrowserCompat$SearchResultReceiver = false;
    }

    public final void MenuItemWrapperICS$CollapsibleActionViewWrapper() {
        this.RatingCompat = true;
        if (setVisibility()) {
            getEventAppCustomAttributeSize geteventappcustomattributesize = this.homePresenter;
            geteventappcustomattributesize.MediaMetadataCompat.IconCompatParcelizer();
            geteventappcustomattributesize.MediaMetadataCompat.IconCompatParcelizer(new getEventAppCustomAttributeSize.IconCompatParcelizer(geteventappcustomattributesize, (byte) 0));
        } else if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(this.AppCompatDialogFragment)) {
            ActionBarOverlayLayout();
        } else {
            getEventAppCustomAttributeSize geteventappcustomattributesize2 = this.homePresenter;
            geteventappcustomattributesize2.MediaMetadataCompat.IconCompatParcelizer();
            geteventappcustomattributesize2.MediaMetadataCompat.IconCompatParcelizer(new getEventAppCustomAttributeSize.IconCompatParcelizer(geteventappcustomattributesize2, (byte) 0));
        }
    }

    @OnClick
    public void onFastPaySettingCoachmarkClicked() {
        this.fastPaySettingCoachmarkImage.setVisibility(8);
        this.mBottomNavigationView.setVisibility(0);
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.fastpay_transfer_dialog_description);
        if (true ^ (string == null || string.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.fastpay_transfer_dialog_ok_button), new BundleCacheProvider_Factory(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.fastpay_transfer_dialog_cancel_button), new getLatestModelDataBuildInfo(this)).show();
    }

    public final void IconCompatParcelizer(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(603979776);
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

    public final void MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH");
        sendBroadcast(intent);
        this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver((int) R.id.account_summary_tab);
        setIntent(getIntent().setAction((String) null));
    }

    public final void AppCompatActivity() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.onboarding_registration_push_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.onboarding_registration_push_sub_title);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.onboarding_registration_push_button_ok), new IBundle(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.onboarding_registration_button_cancel), IBundleCacheProvider.MediaBrowserCompat$CustomActionResultReceiver).show();
    }
}
