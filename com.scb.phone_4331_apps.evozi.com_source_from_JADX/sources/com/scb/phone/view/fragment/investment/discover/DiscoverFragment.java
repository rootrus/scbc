package com.scb.phone.view.fragment.investment.discover;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.discover.C5650xaa2579cd;
import com.scb.phone.view.activity.investment.discover.DiscoverDisclaimerActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverSearchActivity;
import com.scb.phone.view.activity.investment.discover.NtbDiscoverDisclaimerActivity;
import com.scb.phone.view.activity.investment.discover.NtbDiscoverSearchActivity;
import com.scb.phone.view.activity.investment.discover.NtbDiscoverSearchActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.adapter.investment.discover.HighlightRecycleAdapter;
import com.scb.phone.view.adapter.investment.discover.HighlightRecycleAdapter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.investment.discover.RecommendRecyclerAdapter;
import com.scb.phone.view.custom.InfiniteRecyclerView;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.investment.discover.DiscoverTopFundListFragment;
import com.scb.phone.view.fragment.investment.scbs.open.C6065x488a73a2;
import com.scb.phone.view.fragment.prepaid.traveltab.C6126x44f05478;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.ActivityBuilder_BindMileageConfirmRedemptionActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C6489x271d6c26;
import p040o.CheckCaptureModule;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsReportWithSessionId;
import p040o.CrashlyticsUncaughtExceptionHandler;
import p040o.FragmentBuilder_BindCreditCardFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportExtractor_Factory;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.forEachSrcAtop;
import p040o.isAutomaticDataCollectionEnabled;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setRequestPassword;
import p040o.setRequestPassword$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

public final class DiscoverFragment extends BaseFragment implements PassportExtractor_Factory, ActivityBuilder_BindMileageConfirmRedemptionActivity {
    private boolean IconCompatParcelizer;
    private HighlightRecycleAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final LinearLayoutManager MediaBrowserCompat$MediaItem = new LinearLayoutManager(0, false);
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private RecommendRecyclerAdapter MediaDescriptionCompat;
    private forEachSrcAtop MediaMetadataCompat;
    private final HmlVerifyEmailActivity MediaSessionCompat$ResultReceiverWrapper;
    private final LinearLayoutManager ParcelableVolumeInfo;
    private boolean RatingCompat;
    @BindView
    public ViewGroup clBanner;
    @BindView
    public ViewGroup clError;
    @HmlPinActivity
    public setRequestPassword discoverLandingPresenter;
    @BindView
    public PageIndicatorView indicatorHighLightBanner;
    @BindView
    public PageIndicatorView indicatorRecommendBanner;
    @BindView
    public ViewGroup layoutSearch;
    @BindView
    public ViewGroup llHighlightHolder;
    @BindView
    public ViewGroup llRecommendHeader;
    @BindView
    public ViewGroup llRecommendHolder;
    @BindView
    public TextView tvRecommendDate;
    @BindView
    public InfiniteRecyclerView vpHighLightBanner;
    @BindView
    public InfiniteRecyclerView vpRecommendBanner;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    private static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((DiscoverFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((DiscoverFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public DiscoverFragment() {
        FundActionsSuccessActivity discoverFragment$MediaBrowserCompat$ItemReceiver = new DiscoverFragment$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) discoverFragment$MediaBrowserCompat$ItemReceiver, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(discoverFragment$MediaBrowserCompat$ItemReceiver);
        FundActionsSuccessActivity read2 = new read(this);
        onGetStartedClick.write((Object) read2, "initializer");
        this.MediaSessionCompat$ResultReceiverWrapper = new HmlVerifyPhoneTermsConditionsActivity(read2);
        getActivity();
        getActivity();
        this.ParcelableVolumeInfo = new LinearLayoutManager(0, false);
    }

    public static final /* synthetic */ HighlightRecycleAdapter IconCompatParcelizer(DiscoverFragment discoverFragment) {
        HighlightRecycleAdapter highlightRecycleAdapter = discoverFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (highlightRecycleAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("highlightAdapter");
        }
        return highlightRecycleAdapter;
    }

    public static final /* synthetic */ RecommendRecyclerAdapter MediaBrowserCompat$CustomActionResultReceiver(DiscoverFragment discoverFragment) {
        RecommendRecyclerAdapter recommendRecyclerAdapter = discoverFragment.MediaDescriptionCompat;
        if (recommendRecyclerAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recommendAdapter");
        }
        return recommendRecyclerAdapter;
    }

    private static final /* synthetic */ void read(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((DiscoverFragment) fragment).startActivityForResult(intent, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final class IconCompatParcelizer {
        public List<C6065x488a73a2> IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;
        public List<C6126x44f05478> write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(List<C6065x488a73a2> list, String str, String str2, String str3, String str4, String str5, List<C6126x44f05478> list2, String str6, String str7) {
            this.IconCompatParcelizer = list;
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.MediaBrowserCompat$MediaItem = str2;
            this.MediaMetadataCompat = str3;
            this.RatingCompat = str4;
            this.MediaBrowserCompat$ItemReceiver = str5;
            this.write = list2;
            this.read = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = str7;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86742131493901, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        FragmentActivity activity = getActivity();
        String str = null;
        Intent intent = activity != null ? activity.getIntent() : null;
        if (intent != null) {
            str = intent.getStringExtra("com.scb.phone.INVESTMENT_TILE");
        }
        this.RatingCompat = str != null && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) intent.getStringExtra("com.scb.phone.INVESTMENT_TILE"), (Object) "com.scb.phone.INVESTMENT_TILE");
        this.IconCompatParcelizer = intent != null && intent.getBooleanExtra("EXTRA_NTB", false);
        if (this.RatingCompat) {
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("mf_customer", "0"), new ZSYR2K("source", "landing")};
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("mutualfund_discover_landing", zsyr2kArr);
            }
        }
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        setRequestPassword setrequestpassword = this.discoverLandingPresenter;
        if (setrequestpassword == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
        }
        setrequestpassword.MediaBrowserCompat$ItemReceiver(this);
        MediaBrowserCompat$ItemReceiver(false);
        read(false);
        this.MediaBrowserCompat$CustomActionResultReceiver = new HighlightRecycleAdapter(new ArrayList(), new MediaDescriptionCompat(this));
        InfiniteRecyclerView infiniteRecyclerView = this.vpHighLightBanner;
        if (infiniteRecyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpHighLightBanner");
        }
        infiniteRecyclerView.setLayoutManager(this.MediaBrowserCompat$MediaItem);
        HighlightRecycleAdapter highlightRecycleAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (highlightRecycleAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("highlightAdapter");
        }
        infiniteRecyclerView.setAdapter(highlightRecycleAdapter);
        InfiniteRecyclerView.setOnSnapPositionChangeListener$default(infiniteRecyclerView, (C6489x271d6c26) null, new RatingCompat(this), 1, (Object) null);
        this.MediaDescriptionCompat = new RecommendRecyclerAdapter(new ArrayList(), new DiscoverFragment$MediaBrowserCompat$SearchResultReceiver(this));
        InfiniteRecyclerView infiniteRecyclerView2 = this.vpRecommendBanner;
        if (infiniteRecyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpRecommendBanner");
        }
        infiniteRecyclerView2.setLayoutManager(this.ParcelableVolumeInfo);
        RecommendRecyclerAdapter recommendRecyclerAdapter = this.MediaDescriptionCompat;
        if (recommendRecyclerAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recommendAdapter");
        }
        infiniteRecyclerView2.setAdapter(recommendRecyclerAdapter);
        InfiniteRecyclerView.setOnSnapPositionChangeListener$default(infiniteRecyclerView2, (C6489x271d6c26) null, new MediaMetadataCompat(this), 1, (Object) null);
        ViewGroup viewGroup = this.clError;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clError");
        }
        viewGroup.setOnClickListener(new write(this));
        ViewGroup viewGroup2 = this.layoutSearch;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearch");
        }
        viewGroup2.setOnClickListener(new DiscoverFragment$MediaBrowserCompat$CustomActionResultReceiver(this));
        setRequestPassword setrequestpassword2 = this.discoverLandingPresenter;
        if (setrequestpassword2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
        }
        setrequestpassword2.write();
        forEachSrcAtop foreachsrcatop = new forEachSrcAtop();
        this.MediaMetadataCompat = foreachsrcatop;
        ZTBSV ztbsv = foreachsrcatop;
        String str = forEachSrcAtop.read.write;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        setRequestPassword setrequestpassword = this.discoverLandingPresenter;
        if (setrequestpassword == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
        }
        setrequestpassword.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            setRequestPassword setrequestpassword = this.discoverLandingPresenter;
            if (setrequestpassword == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
            }
            view.setVisibility(setrequestpassword.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write.MediaMetadataCompat() ? 0 : 8);
        }
        InfiniteRecyclerView infiniteRecyclerView = this.vpHighLightBanner;
        if (infiniteRecyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpHighLightBanner");
        }
        getResources();
        infiniteRecyclerView.MediaMetadataCompat();
    }

    public final void onPause() {
        InfiniteRecyclerView infiniteRecyclerView = this.vpHighLightBanner;
        if (infiniteRecyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpHighLightBanner");
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = infiniteRecyclerView.setStackedBackground;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onPause();
    }

    public final void MediaDescriptionCompat() {
        setRequestPassword setrequestpassword = this.discoverLandingPresenter;
        if (setrequestpassword == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
        }
        if (!setrequestpassword.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write.MediaMetadataCompat()) {
            writeUInt64NoTag.IconCompatParcelizer setrequestpassword_mediabrowsercompat_itemreceiver = new setRequestPassword$MediaBrowserCompat$ItemReceiver(setrequestpassword);
            if (setrequestpassword.RatingCompat != null) {
                setrequestpassword_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setrequestpassword.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            DiscoverDisclaimerActivity.read read2 = DiscoverDisclaimerActivity.MediaBrowserCompat$MediaItem;
            Context context = activity;
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, DiscoverDisclaimerActivity.class);
            intent.setFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(intent, 10001);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            NtbDiscoverDisclaimerActivity.write write2 = NtbDiscoverDisclaimerActivity.MediaDescriptionCompat;
            Context context = activity;
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, NtbDiscoverDisclaimerActivity.class);
            intent.setFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivityForResult(intent, 10001);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (10001 == i && -1 != i2) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (10002 == i && -1 == i2) {
            MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsUncaughtExceptionHandler> list) {
        onGetStartedClick.write((Object) list, "list");
        HighlightRecycleAdapter highlightRecycleAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (highlightRecycleAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("highlightAdapter");
        }
        onGetStartedClick.write((Object) list, "list");
        highlightRecycleAdapter.read.clear();
        highlightRecycleAdapter.read.addAll(list);
        highlightRecycleAdapter.IconCompatParcelizer.write();
        int size = list.size();
        int i = 8;
        if (size > 0) {
            InfiniteRecyclerView infiniteRecyclerView = this.vpHighLightBanner;
            if (infiniteRecyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpHighLightBanner");
            }
            infiniteRecyclerView.setVisibility(0);
            PageIndicatorView pageIndicatorView = this.indicatorHighLightBanner;
            if (pageIndicatorView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorHighLightBanner");
            }
            pageIndicatorView.setCount(size);
            PageIndicatorView pageIndicatorView2 = this.indicatorHighLightBanner;
            if (pageIndicatorView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorHighLightBanner");
            }
            pageIndicatorView2.setAnimationDuration(0);
            PageIndicatorView pageIndicatorView3 = this.indicatorHighLightBanner;
            if (pageIndicatorView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorHighLightBanner");
            }
            if (size < 10) {
                i = 0;
            }
            pageIndicatorView3.setVisibility(i);
        } else {
            InfiniteRecyclerView infiniteRecyclerView2 = this.vpHighLightBanner;
            if (infiniteRecyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpHighLightBanner");
            }
            infiniteRecyclerView2.setVisibility(8);
        }
        boolean z = true;
        if (list.size() > 1) {
            z = false;
        }
        MediaBrowserCompat$ItemReceiver(z);
        ViewGroup viewGroup = this.llHighlightHolder;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llHighlightHolder");
        }
        viewGroup.setVisibility(0);
    }

    public final void read(List<CrashlyticsReportWithSessionId> list) {
        onGetStartedClick.write((Object) list, "list");
        RecommendRecyclerAdapter recommendRecyclerAdapter = this.MediaDescriptionCompat;
        if (recommendRecyclerAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recommendAdapter");
        }
        onGetStartedClick.write((Object) list, "list");
        recommendRecyclerAdapter.read.clear();
        recommendRecyclerAdapter.read.addAll(list);
        recommendRecyclerAdapter.IconCompatParcelizer.write();
        int size = list.size();
        int i = 8;
        if (size > 0) {
            InfiniteRecyclerView infiniteRecyclerView = this.vpRecommendBanner;
            if (infiniteRecyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpRecommendBanner");
            }
            infiniteRecyclerView.setVisibility(0);
            PageIndicatorView pageIndicatorView = this.indicatorRecommendBanner;
            if (pageIndicatorView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorRecommendBanner");
            }
            pageIndicatorView.setCount(size);
            PageIndicatorView pageIndicatorView2 = this.indicatorRecommendBanner;
            if (pageIndicatorView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorRecommendBanner");
            }
            pageIndicatorView2.setAnimationDuration(0);
            PageIndicatorView pageIndicatorView3 = this.indicatorRecommendBanner;
            if (pageIndicatorView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorRecommendBanner");
            }
            if (size < 10) {
                i = 0;
            }
            pageIndicatorView3.setVisibility(i);
        } else {
            InfiniteRecyclerView infiniteRecyclerView2 = this.vpRecommendBanner;
            if (infiniteRecyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpRecommendBanner");
            }
            infiniteRecyclerView2.setVisibility(8);
        }
        boolean z = true;
        if (list.size() > 1) {
            z = false;
        }
        read(z);
        ViewGroup viewGroup = this.llRecommendHeader;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llRecommendHeader");
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.llRecommendHolder;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llRecommendHolder");
        }
        viewGroup2.setVisibility(0);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "asOfDate");
        TextView textView = this.tvRecommendDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRecommendDate");
        }
        textView.setText(str);
    }

    public final void write(String str, List<isAutomaticDataCollectionEnabled> list, String str2, boolean z) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) list, "list");
        ViewGroup viewGroup = this.clBanner;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clBanner");
        }
        viewGroup.setVisibility(0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            DiscoverTopFundListFragment.write write2 = DiscoverTopFundListFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) list, "list");
            onGetStartedClick.write((Object) str, "txnDate");
            DiscoverTopFundListFragment discoverTopFundListFragment = new DiscoverTopFundListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("com.scb.phone.view.fragment.investment.discover.DiscoverTopFundListFragment.applicationId", str2);
            bundle.putParcelableArrayList("com.scb.phone.EXTRA_LIST", new ArrayList(list));
            bundle.putString("com.scb.phone.EXTRA_TRANSACTION_DATE", str);
            bundle.putBoolean("com.scb.phone.EXTRA_IS_NTB_USER", z);
            discoverTopFundListFragment.setArguments(bundle);
            activity.getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.layoutTopList, discoverTopFundListFragment).IconCompatParcelizer();
        }
    }

    public final void write() {
        ViewGroup viewGroup = this.clError;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clError");
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.clBanner;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clBanner");
        }
        viewGroup2.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) activity).MediaBrowserCompat$ItemReceiver((int) R.string.investment_ntb_does_not_support_title).IconCompatParcelizer((int) R.string.investment_ntb_does_not_support_text);
            IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ok), DiscoverFragment$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver).show();
        }
    }

    public final void RatingCompat() {
        ViewGroup viewGroup = this.clError;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clError");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.clBanner;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clBanner");
        }
        viewGroup2.setVisibility(0);
    }

    public final void read() {
        if (getActivity() instanceof CheckCaptureModule.C6375a.RatingCompat) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ((CheckCaptureModule.C6375a.RatingCompat) activity).read();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.views.AccountSummaryView.GoInvestmentView");
        }
    }

    public final void RatingCompat(String str) {
        forEachSrcAtop foreachsrcatop = this.MediaMetadataCompat;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, str);
        forEachSrcAtop foreachsrcatop2 = this.MediaMetadataCompat;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        ZTBSV ztbsv = foreachsrcatop2;
        String str2 = forEachSrcAtop.read.MediaBrowserCompat$ItemReceiver;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str2);
        }
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "webViewUrl");
        Context context = getContext();
        if (context != null) {
            if (str2 == null) {
                str2 = "";
            }
            Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(context, str, str2);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "position");
        forEachSrcAtop foreachsrcatop = this.MediaMetadataCompat;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.MediaBrowserCompat$ItemReceiver();
        forEachSrcAtop foreachsrcatop2 = this.MediaMetadataCompat;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.write, str);
        forEachSrcAtop foreachsrcatop3 = this.MediaMetadataCompat;
        if (foreachsrcatop3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        ZTBSV ztbsv = foreachsrcatop3;
        String str2 = forEachSrcAtop.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str2);
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public final void write(String str, String str2, String str3) {
        forEachSrcAtop foreachsrcatop = this.MediaMetadataCompat;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, str3);
        forEachSrcAtop foreachsrcatop2 = this.MediaMetadataCompat;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, str2);
        forEachSrcAtop foreachsrcatop3 = this.MediaMetadataCompat;
        if (foreachsrcatop3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        ZTBSV ztbsv = foreachsrcatop3;
        String str4 = forEachSrcAtop.read.MediaBrowserCompat$SearchResultReceiver;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str4);
        }
        Context context = getContext();
        if (context != null) {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, str);
            map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat, str2);
            PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(context, hashMap, true, (Intent) null);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, MediaBrowserCompat$CustomActionResultReceiver2).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final int MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        if (z) {
            return (i - ((Number) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).intValue()) / 2;
        }
        return i - ((Number) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).intValue();
    }

    private final int IconCompatParcelizer(boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        if (z) {
            return (i - ((Number) this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver()).intValue()) / 2;
        }
        return i - ((Number) this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver()).intValue();
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ DiscoverFragment write;

        write(DiscoverFragment discoverFragment) {
            this.write = discoverFragment;
        }

        public final void onClick(View view) {
            setRequestPassword setrequestpassword = this.write.discoverLandingPresenter;
            if (setrequestpassword == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
            }
            setrequestpassword.write();
        }
    }

    /* access modifiers changed from: private */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof BaseActivity)) {
            activity = null;
        }
        BaseActivity baseActivity = (BaseActivity) activity;
        if (baseActivity != null) {
            boolean z = !this.IconCompatParcelizer && baseActivity.setGroupDividerEnabled() && !baseActivity.mo13022E_();
            if (this.IconCompatParcelizer) {
                NtbDiscoverSearchActivity$MediaBrowserCompat$ItemReceiver ntbDiscoverSearchActivity$MediaBrowserCompat$ItemReceiver = NtbDiscoverSearchActivity.MediaBrowserCompat$MediaItem;
                Context context = baseActivity;
                onGetStartedClick.write((Object) context, "context");
                Intent intent = new Intent(context, NtbDiscoverSearchActivity.class);
                intent.setFlags(603979776);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                IconCompatParcelizer(this, intent);
            } else if (z) {
                C5650xaa2579cd discoverSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = DiscoverSearchActivity.MediaDescriptionCompat;
                Context context2 = baseActivity;
                onGetStartedClick.write((Object) context2, "context");
                Intent intent2 = new Intent(context2, DiscoverSearchActivity.class);
                intent2.setFlags(603979776);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                MediaBrowserCompat$ItemReceiver(this, intent2);
            } else {
                Intent write2 = PinLoginActivity.write((Context) baseActivity);
                write2.setFlags(603979776);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                read(this, write2);
            }
        }
    }

    private final void MediaBrowserCompat$ItemReceiver(boolean z) {
        InfiniteRecyclerView infiniteRecyclerView = this.vpHighLightBanner;
        if (infiniteRecyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpHighLightBanner");
        }
        infiniteRecyclerView.setPadding(z ? MediaBrowserCompat$CustomActionResultReceiver(true) : 0, (int) getResources().getDimension(R.dimen.f73452131165702), MediaBrowserCompat$CustomActionResultReceiver(z), (int) getResources().getDimension(R.dimen.f73452131165702));
    }

    private final void read(boolean z) {
        InfiniteRecyclerView infiniteRecyclerView = this.vpRecommendBanner;
        if (infiniteRecyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpRecommendBanner");
        }
        infiniteRecyclerView.setPadding(z ? IconCompatParcelizer(true) : 0, (int) getResources().getDimension(R.dimen.f73452131165702), IconCompatParcelizer(z), (int) getResources().getDimension(R.dimen.f73452131165702));
    }

    public static final class MediaDescriptionCompat implements HighlightRecycleAdapter$MediaBrowserCompat$ItemReceiver<CrashlyticsUncaughtExceptionHandler> {
        private /* synthetic */ DiscoverFragment MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(DiscoverFragment discoverFragment) {
            this.MediaBrowserCompat$ItemReceiver = discoverFragment;
        }

        public final /* synthetic */ void read(Object obj, String str) {
            CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = (CrashlyticsUncaughtExceptionHandler) obj;
            onGetStartedClick.write((Object) crashlyticsUncaughtExceptionHandler, "display");
            onGetStartedClick.write((Object) str, "position");
            setRequestPassword setrequestpassword = this.MediaBrowserCompat$ItemReceiver.discoverLandingPresenter;
            if (setrequestpassword == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
            }
            onGetStartedClick.write((Object) crashlyticsUncaughtExceptionHandler, "highlight");
            onGetStartedClick.write((Object) str, "position");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new setRequestPassword.IconCompatParcelizer(str, crashlyticsUncaughtExceptionHandler, crashlyticsUncaughtExceptionHandler.IconCompatParcelizer);
            if (setrequestpassword.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setrequestpassword.RatingCompat);
            }
        }
    }

    public static final class RatingCompat implements FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer {
        private /* synthetic */ DiscoverFragment MediaBrowserCompat$ItemReceiver;

        RatingCompat(DiscoverFragment discoverFragment) {
            this.MediaBrowserCompat$ItemReceiver = discoverFragment;
        }

        public final void read(int i) {
            PageIndicatorView pageIndicatorView = this.MediaBrowserCompat$ItemReceiver.indicatorHighLightBanner;
            if (pageIndicatorView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorHighLightBanner");
            }
            pageIndicatorView.setSelection(DiscoverFragment.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver).read(i));
        }
    }

    public static final class MediaMetadataCompat implements FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer {
        private /* synthetic */ DiscoverFragment read;

        MediaMetadataCompat(DiscoverFragment discoverFragment) {
            this.read = discoverFragment;
        }

        public final void read(int i) {
            PageIndicatorView pageIndicatorView = this.read.indicatorRecommendBanner;
            if (pageIndicatorView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("indicatorRecommendBanner");
            }
            pageIndicatorView.setSelection(DiscoverFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read).read(i));
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<Integer> {
        private /* synthetic */ DiscoverFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(DiscoverFragment discoverFragment) {
            super(0);
            this.read = discoverFragment;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.read.getResources().getDimensionPixelOffset(R.dimen.f73082131165536));
        }
    }

    public static final DiscoverFragment MediaBrowserCompat$MediaItem() {
        return new DiscoverFragment();
    }
}
