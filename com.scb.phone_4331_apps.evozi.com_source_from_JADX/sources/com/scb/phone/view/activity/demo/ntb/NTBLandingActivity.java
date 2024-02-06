package com.scb.phone.view.activity.demo.ntb;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.roughike.bottombar.BadgeContainer;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.DraggableFloatingActionButton;
import com.scb.phone.view.custom.ntb.NTBAdsDialog;
import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpTargetTabFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.C7106x42672190;
import p040o.C7291oV;
import p040o.C7293oX;
import p040o.C7294oY;
import p040o.C7367pc;
import p040o.CardView;
import p040o.DPI;
import p040o.DetectedReferenceFeature;
import p040o.Featuretype;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.FragmentBuilder_BindFundRedeemLandingFragment;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$lambda$0;
import p040o.getAdditionalRightScanLinesWidth;
import p040o.getGlareContours;
import p040o.getOversizeImage;
import p040o.getStopChequeVerification;
import p040o.inquiryMerchantSweepTransactions;
import p040o.inquiryMerchantTransactions;
import p040o.isRestrictedToPlacesOpenNow;
import p040o.nContextSetPriority;
import p040o.nativeCropImage;
import p040o.nativeGetShadowContours;
import p040o.nativeInit;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setBackingMap;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.zzwi;

public class NTBLandingActivity extends BaseActivity implements getAdditionalRightScanLinesWidth, ViewTreeObserver.OnGlobalLayoutListener, ZHER {
    private BottomBarTab MediaBrowserCompat$MediaItem;
    private C7106x42672190 MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private NTBLifestyleLandingFragment PlaybackStateCompat;
    @BindView
    ImageView mBlurBackgroundImageView;
    @BindView
    BottomBar mBottomNavigationView;
    @BindView
    FrameLayout mFragmentContainer;
    @BindView
    RelativeLayout mRootView;
    @BindView
    protected DraggableFloatingActionButton ntbButton;
    @HmlPinActivity
    public nativeGetShadowContours ntbLandingPresenter;
    @BindView
    ImageView tutorialImageView;
    @BindView
    FrameLayout tutorialView;

    public final void ActionBarContainer() {
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
    }

    public final void PlaybackStateCompat$CustomAction() {
    }

    public final void RatingCompat(access$2200 access_2200) {
    }

    public final void az_() {
    }

    public final void write(access$2200 access_2200) {
    }

    public static Intent IconCompatParcelizer(Context context, List<access$lambda$0> list) {
        Intent putParcelableArrayListExtra = new Intent(context, NTBLandingActivity.class).putParcelableArrayListExtra("INTRODUCTION_LIST", new ArrayList(list));
        putParcelableArrayListExtra.setFlags(268468224);
        return putParcelableArrayListExtra;
    }

    public static Intent write(Context context, boolean z) {
        return new Intent(context, NTBLandingActivity.class).putExtra("EXTRA_SHOULD_NAVIGATE_TO_REGISTRATION_METHOD", z).setFlags(268468224);
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof NTBLifestyleLandingFragment) {
            this.PlaybackStateCompat = (NTBLifestyleLandingFragment) fragment;
        }
    }

    public void onCreate(Bundle bundle) {
        BottomBarTab bottomBarTab;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79072131493132);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("ntb_landing");
        boolean z = false;
        for (int i = 0; i < this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver.getChildCount(); i++) {
            View childAt = this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver.getChildAt(i);
            if (childAt instanceof BadgeContainer) {
                bottomBarTab = BottomBar.MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
            } else {
                bottomBarTab = (BottomBarTab) childAt;
            }
            bottomBarTab.setGravity(16);
        }
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.MediaMetadataCompat = R.id.fragment_container_home;
        this.ntbLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        nativeGetShadowContours nativegetshadowcontours = this.ntbLandingPresenter;
        zzwi write = nativegetshadowcontours.MediaBrowserCompat$ItemReceiver.read.write();
        if (!(write == null || write.f3005x50fd9e4a == null || write.f3005x50fd9e4a.IconCompatParcelizer == null || write.f3005x50fd9e4a.IconCompatParcelizer.length() == 0)) {
            nativeCropImage nativecropimage = new nativeCropImage(nativegetshadowcontours, write.f3005x50fd9e4a.IconCompatParcelizer);
            if (nativegetshadowcontours.RatingCompat != null) {
                nativecropimage.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
            }
        }
        Featuretype featuretype = Featuretype.write;
        if (nativegetshadowcontours.RatingCompat != null) {
            featuretype.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
        }
        nativeGetShadowContours nativegetshadowcontours2 = this.ntbLandingPresenter;
        nativegetshadowcontours2.MediaMetadataCompat.IconCompatParcelizer.read((Boolean) null);
        nativegetshadowcontours2.read.MediaBrowserCompat$ItemReceiver.write((Boolean) null);
        CardView read = getSupportFragmentManager().read();
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            z = getIntent().getExtras().getBoolean("EXTRA_SHOULD_NAVIGATE_TO_REGISTRATION_METHOD", false);
        }
        read.write(this.MediaMetadataCompat, NTBLifestyleLandingFragment.MediaBrowserCompat$ItemReceiver(z), "LANDING_PAGE_TAG");
        read.MediaBrowserCompat$ItemReceiver();
        this.mBottomNavigationView.setOnTabSelectListener(new C7294oY(this));
        this.mBottomNavigationView.setOnTabReselectListener(this);
        this.mBottomNavigationView.setDefaultTab(R.id.landing_page_tab);
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = (BottomBarTab) this.mBottomNavigationView.MediaBrowserCompat$ItemReceiver.findViewById(R.id.notification_tab);
        }
        setContentHeight();
        nativeGetShadowContours nativegetshadowcontours3 = this.ntbLandingPresenter;
        nativegetshadowcontours3.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer(true);
        nativegetshadowcontours3.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35284.NTB_LIFE_STYLE_LANDING.name());
    }

    public void onBackPressed() {
        if (this.tutorialView.getVisibility() == 0) {
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver);
        } else {
            super.onBackPressed();
        }
    }

    public final void write(String str) {
        if (!isFinishing() && !TextUtils.isEmpty(str)) {
            write(this, R.id.fragment_container_home, str, getOversizeImage.ERROR);
        }
    }

    public final void read() {
        if (this.tutorialView.getVisibility() == 0) {
            MediaBrowserCompat$CustomActionResultReceiver((C7106x42672190) null);
        }
    }

    public final void IconCompatParcelizer(String str) {
        write(str, (C7106x42672190) null);
    }

    public final void write(String str, C7106x42672190 getadditionalrightscanlineswidth_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$SearchResultReceiver = getadditionalrightscanlineswidth_mediabrowsercompat_customactionresultreceiver;
        if (this.MediaSessionCompat$Token == 0 || this.MediaSessionCompat$ResultReceiverWrapper == 0) {
            this.MediaDescriptionCompat = str;
            return;
        }
        this.mBottomNavigationView.setVisibility(8);
        this.mFragmentContainer.setVisibility(8);
        this.tutorialView.setOnClickListener(new C7291oV(this, getadditionalrightscanlineswidth_mediabrowsercompat_customactionresultreceiver));
        AlertController$RecycleListView();
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (config != null) {
            read.write = config;
            int i = (int) (((float) this.MediaSessionCompat$ResultReceiverWrapper) * 0.7f);
            write.MediaBrowserCompat$CustomActionResultReceiver.read((int) (((float) this.MediaSessionCompat$Token) * 0.7f), i);
            write.read(this.tutorialImageView, new FragmentBuilder_BindEkycFragment() {
                public final void MediaBrowserCompat$ItemReceiver() {
                    NTBLandingActivity.this.aj_();
                    NTBLandingActivity.this.tutorialView.setVisibility(0);
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                    NTBLandingActivity.this.aj_();
                    NTBLandingActivity.this.MediaBrowserCompat$CustomActionResultReceiver((C7106x42672190) null);
                    NTBLandingActivity nTBLandingActivity = NTBLandingActivity.this;
                    String string = nTBLandingActivity.getString(R.string.ntb_lifestyle_content_is_unavailable);
                    if (!nTBLandingActivity.isFinishing() && !TextUtils.isEmpty(string)) {
                        nTBLandingActivity.write(nTBLandingActivity, R.id.fragment_container_home, string, getOversizeImage.ERROR);
                    }
                }
            });
            this.MediaDescriptionCompat = null;
            return;
        }
        throw new IllegalArgumentException("config == null");
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.MediaSessionCompat$Token = this.mRootView.getWidth();
        this.MediaSessionCompat$ResultReceiverWrapper = this.mRootView.getHeight();
        nativeGetShadowContours nativegetshadowcontours = this.ntbLandingPresenter;
        ArrayList parcelableArrayListExtra = getIntent() != null ? getIntent().getParcelableArrayListExtra("INTRODUCTION_LIST") : null;
        boolean z = true;
        if (parcelableArrayListExtra != null) {
            DetectedReferenceFeature.DetectedFeatureType detectedFeatureType = new DetectedReferenceFeature.DetectedFeatureType(parcelableArrayListExtra);
            if (nativegetshadowcontours.RatingCompat != null) {
                detectedFeatureType.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
            }
        } else {
            DPI dpi = DPI.read;
            if (nativegetshadowcontours.RatingCompat != null) {
                dpi.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
            }
        }
        getGlareContours getglarecontours = getGlareContours.read;
        if (nativegetshadowcontours.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getglarecontours.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            write(str, this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final void IconCompatParcelizer() {
        this.ntbLandingPresenter.read();
    }

    public final void read(List<access$lambda$0> list) {
        this.mBottomNavigationView.setVisibility(8);
        FragmentBuilder_BindDepositSelectorFragment.write((Context) this, this.mRootView, this.mBlurBackgroundImageView);
        Intent putParcelableArrayListExtra = new Intent(getApplicationContext(), IntroductionActivity.class).putParcelableArrayListExtra("INTRODUCTION_LIST", new ArrayList(list));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putParcelableArrayListExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            boolean z = false;
            this.mBottomNavigationView.setVisibility(0);
            this.mBlurBackgroundImageView.setVisibility(8);
            nativeGetShadowContours nativegetshadowcontours = this.ntbLandingPresenter;
            DPI dpi = DPI.read;
            if (nativegetshadowcontours.RatingCompat != null) {
                z = true;
            }
            if (z) {
                dpi.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C7106x42672190 getadditionalrightscanlineswidth_mediabrowsercompat_customactionresultreceiver) {
        BottomBar bottomBar;
        this.tutorialView.setVisibility(8);
        this.tutorialView.setOnClickListener((View.OnClickListener) null);
        this.mBottomNavigationView.setVisibility(0);
        this.mFragmentContainer.setVisibility(0);
        this.tutorialImageView.setImageBitmap((Bitmap) null);
        if (!isFinishing() && (bottomBar = this.mBottomNavigationView) != null) {
            bottomBar.setDefaultTabPosition(0);
        }
        if (getadditionalrightscanlineswidth_mediabrowsercompat_customactionresultreceiver != null) {
            getadditionalrightscanlineswidth_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.ntbLandingPresenter.read();
    }

    public final void read(String str) {
        if (this.ntbButton != null) {
            Picasso.read().write(str).read(this.ntbButton, (FragmentBuilder_BindEkycFragment) null);
            this.ntbButton.setBackgroundTintList(ColorStateList.valueOf(0));
            DraggableFloatingActionButton draggableFloatingActionButton = this.ntbButton;
            if (draggableFloatingActionButton.IconCompatParcelizer == null) {
                draggableFloatingActionButton.IconCompatParcelizer = draggableFloatingActionButton.write();
            }
            draggableFloatingActionButton.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((nContextSetPriority.IconCompatParcelizer) null, true);
        }
    }

    public final void write() {
        DraggableFloatingActionButton draggableFloatingActionButton = this.ntbButton;
        if (draggableFloatingActionButton != null) {
            draggableFloatingActionButton.setOnClickListener(new C7293oX(this));
        }
    }

    public void onDestroy() {
        this.ntbLandingPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4) {
        String str5;
        nativeGetShadowContours nativegetshadowcontours = this.ntbLandingPresenter;
        String D_ = mo3026D_();
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = nativegetshadowcontours.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$CustomActionResultReceiver;
        if (isrestrictedtoplacesopennow == null) {
            str5 = null;
        } else if ("th".equalsIgnoreCase(D_)) {
            str5 = isrestrictedtoplacesopennow.MediaBrowserCompat$MediaItem;
        } else {
            str5 = isrestrictedtoplacesopennow.write;
        }
        NTBAdsDialog nTBAdsDialog = new NTBAdsDialog(this, str, str2, str3, str5, str4, new NTBAdsDialog.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                NTBLandingActivity.this.ntbLandingPresenter.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.read(str);
            }

            public final void read(C7367pc pcVar) {
                nativeGetShadowContours nativegetshadowcontours = NTBLandingActivity.this.ntbLandingPresenter;
                String str = pcVar.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = pcVar.MediaBrowserCompat$ItemReceiver;
                setBackingMap setbackingmap = nativegetshadowcontours.ParcelableVolumeInfo;
                OffsetDateTime now = OffsetDateTime.now();
                onGetStartedClick.IconCompatParcelizer((Object) now, "now");
                setbackingmap.write(new TopUpTargetTabFragment.read(str, "popup", str2, now));
                NTBLandingActivity.this.scbAnalytics.write("ntb_pop_up_ad", new ZSYR2K("ads_name", pcVar.MediaBrowserCompat$CustomActionResultReceiver), new ZSYR2K("user_action", pcVar.write), new ZSYR2K("tick_checkbox", pcVar.read), new ZSYR2K("ads_id", pcVar.MediaBrowserCompat$ItemReceiver));
            }

            public final void IconCompatParcelizer() {
                NTBLandingActivity.this.ntbLandingPresenter.f2898x50fd9e4a = true;
            }

            public final void IconCompatParcelizer(String str) {
                NTBLandingActivity.MediaBrowserCompat$ItemReceiver(NTBLandingActivity.this, str);
            }
        });
        nTBAdsDialog.requestWindowFeature(1);
        nTBAdsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        nTBAdsDialog.getWindow().setFlags(262144, 262144);
        nTBAdsDialog.setContentView(R.layout.f84022131493628);
        ButterKnife.write((Dialog) nTBAdsDialog);
        nTBAdsDialog.setCanceledOnTouchOutside(true);
        nTBAdsDialog.ivClose.setOnClickListener(new inquiryMerchantSweepTransactions(nTBAdsDialog));
        nTBAdsDialog.setOnDismissListener(new getStopChequeVerification(nTBAdsDialog));
        nTBAdsDialog.ivAdsImage.setOnClickListener(new inquiryMerchantTransactions(nTBAdsDialog));
        NTBAdsDialog.C58423 r10 = new FragmentBuilder_BindFundRedeemLandingFragment() {
            public final void read(Bitmap bitmap) {
                if ("FakeWhite".equalsIgnoreCase(NTBAdsDialog.this.MediaBrowserCompat$SearchResultReceiver)) {
                    NTBAdsDialog.this.ivClose.setColorFilter(setLastBaselineToBottomHeight.read(NTBAdsDialog.this.getContext(), R.color.f66132131099768));
                    TextView textView = NTBAdsDialog.this.doNotShowTextView;
                    NTBAdsDialog.this.getContext();
                    textView.setTextColor(-658442);
                    NTBAdsDialog.this.lightCheckBox.setVisibility(0);
                } else {
                    NTBAdsDialog.this.ivClose.setColorFilter(setLastBaselineToBottomHeight.read(NTBAdsDialog.this.getContext(), R.color.f66092131099764));
                    TextView textView2 = NTBAdsDialog.this.doNotShowTextView;
                    NTBAdsDialog.this.getContext();
                    textView2.setTextColor(-13290951);
                    NTBAdsDialog.this.darkCheckBox.setVisibility(0);
                }
                int i = (int) (((float) NTBAdsDialog.this.getContext().getResources().getDisplayMetrics().widthPixels) * 0.9f);
                NTBAdsDialog.this.ivAdsImage.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i, (int) (((double) i) * (((double) bitmap.getHeight()) / ((double) bitmap.getWidth()))), false));
                if ((NTBAdsDialog.this.RatingCompat instanceof Activity) && !((Activity) NTBAdsDialog.this.RatingCompat).isFinishing()) {
                    NTBAdsDialog.this.show();
                    NTBAdsDialog.this.IconCompatParcelizer.IconCompatParcelizer();
                }
            }

            public final void write(Drawable drawable) {
                onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("onBitmapFailed", new Object[0]);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
                onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("onPrepareLoad", new Object[0]);
            }
        };
        nTBAdsDialog.ivAdsImage.setTag(r10);
        nTBAdsDialog.getContext();
        FragmentBuilder_BindDepositSelectorFragment.write(nTBAdsDialog.MediaBrowserCompat$MediaItem, (FragmentBuilder_BindFundRedeemLandingFragment) r10);
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(NTBLandingActivity nTBLandingActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity.EXTRA_FROM_NTB", true);
            intent.setData(Uri.parse(str));
            intent.setFlags(603979776);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(nTBLandingActivity, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(nTBLandingActivity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                nTBLandingActivity.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException | NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(NTBLandingActivity nTBLandingActivity, int i) {
        boolean z = false;
        int i2 = i == R.id.account_summary_tab ? 1 : i == R.id.request_to_pay_tab ? 2 : i == R.id.notification_tab ? 3 : i == R.id.more_options_tab ? 4 : 0;
        nativeGetShadowContours nativegetshadowcontours = nTBLandingActivity.ntbLandingPresenter;
        nativeInit nativeinit = new nativeInit(nativegetshadowcontours, i2, nTBLandingActivity.mo3026D_());
        if (nativegetshadowcontours.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativeinit.IconCompatParcelizer(nativegetshadowcontours.RatingCompat);
        }
    }

    public /* synthetic */ void lambda$setOnClickFloatingButton$1$NTBLandingActivity(View view) {
        NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.PlaybackStateCompat;
        if (nTBLifestyleLandingFragment != null && nTBLifestyleLandingFragment.isAdded()) {
            this.PlaybackStateCompat.write(false);
        }
    }
}
