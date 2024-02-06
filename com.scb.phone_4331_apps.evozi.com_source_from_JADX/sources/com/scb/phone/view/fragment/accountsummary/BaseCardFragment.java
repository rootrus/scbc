package com.scb.phone.view.fragment.accountsummary;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.accountsummary.BaseAdBannerView;
import com.scb.phone.view.custom.accountsummary.ImageAdBannerView;
import com.scb.phone.view.custom.accountsummary.ImageAndTextAdBannerView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C6378xfcd837d4;
import p040o.EasycashNcbRepositoryModule;
import p040o.FragmentBuilder_BindBaseEBillSubscriptionReviewFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDSrcAtop;
import p040o.getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver;
import p040o.immediateFuture;
import p040o.makeChecked;
import p040o.onActivityCreated;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.remainingCapacity;
import p040o.setTapText;
import p059me.relex.circleindicator.CircleIndicator;

public class BaseCardFragment extends BaseFragment implements C6378xfcd837d4 {
    protected BulkTransferDeepLinkActivity IconCompatParcelizer;
    ErrorPagerAdapter MediaBrowserCompat$CustomActionResultReceiver;
    protected BulkTransferDeepLinkActivity MediaMetadataCompat;
    @BindView
    FrameLayout bannerContainer;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    RelativeLayout mParentLayout;
    @BindView
    ViewPager mViewPager;

    public void Keep() {
        MediaBrowserCompat$CustomActionResultReceiver(new EasycashNcbRepositoryModule(getContext()));
    }

    public void ax_() {
        ErrorPagerAdapter errorPagerAdapter = new ErrorPagerAdapter(getContext(), ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.ACCOUNT_SUMMARY_ERROR);
        this.MediaBrowserCompat$CustomActionResultReceiver = errorPagerAdapter;
        MediaBrowserCompat$CustomActionResultReceiver(errorPagerAdapter);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(onActivityCreated onactivitycreated) {
        this.mViewPager.setAdapter(onactivitycreated);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mCircleIndicator.setViewPager(this.mViewPager);
    }

    /* access modifiers changed from: protected */
    public final void read(List<? extends remainingCapacity> list) {
        this.mCircleIndicator.setViewPager(this.mViewPager);
        if (list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(immediateFuture immediatefuture, FragmentBuilder_BindBaseEBillSubscriptionReviewFragment fragmentBuilder_BindBaseEBillSubscriptionReviewFragment) {
        BaseAdBannerView baseAdBannerView;
        if (this.bannerContainer != null) {
            if (immediatefuture.MediaBrowserCompat$MediaItem == makeChecked.IMAGE) {
                baseAdBannerView = new ImageAdBannerView(getContext());
            } else {
                baseAdBannerView = new ImageAndTextAdBannerView(getContext());
            }
            this.bannerContainer.removeAllViews();
            baseAdBannerView.setId(immediatefuture.IconCompatParcelizer.hashCode());
            baseAdBannerView.setDisplay(immediatefuture);
            baseAdBannerView.setContextualBannerListener(fragmentBuilder_BindBaseEBillSubscriptionReviewFragment);
            this.bannerContainer.setVisibility(0);
            this.bannerContainer.addView(baseAdBannerView);
        }
    }

    /* access modifiers changed from: protected */
    public final void read(String str, String str2) {
        if (this.bannerContainer != null) {
            getKernelIDSrcAtop.read read = getKernelIDSrcAtop.CREATOR;
            onGetStartedClick.write((Object) str, "adId");
            onGetStartedClick.write((Object) str2, "adName");
            read(getKernelIDSrcAtop.read.read(str, str2, getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver.CLOSE));
            this.bannerContainer.removeAllViews();
            this.bannerContainer.setVisibility(8);
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException | NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}
