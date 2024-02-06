package com.scb.phone.view.fragment.investment.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.FundActionsSearchActivity;
import com.scb.phone.view.activity.investment.FundFactSheetActivity;
import com.scb.phone.view.activity.investment.assessment.QuestionnaireActivity;
import com.scb.phone.view.adapter.investment.FundClientListAdapter;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomFundSelect;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.investment.BaseScheduleFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindPredictiveTilesLearnMoreActivity;
import p040o.ActivityBuilder_BindPromptPayQRActivity;
import p040o.ActivityBuilder_BindQuickPromptPayActivity;
import p040o.C6397xabb2c88d;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindBulkTransferGroupsFragment;
import p040o.FragmentBuilder_BindBulkTransferSuccessFragment;
import p040o.HmlPinActivity;
import p040o.ImageCaptureView;
import p040o.ImageCaptureView_Factory;
import p040o.ImageCapturedEvent;
import p040o.InstallIdProvider;
import p040o.InstallerPackageNameProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.clearGlobalBitmap;
import p040o.doBackgroundInitializationAsync;
import p040o.getDestination;
import p040o.getOsBuildVersionString;
import p040o.immediateCheckedFuture;
import p040o.inject_previewFrameHandler;
import p040o.isProximityOn;
import p040o.markInitializationComplete;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.submitCreditLimitUpdate;
import p059me.relex.circleindicator.CircleIndicator;

public class FundPurchaseLandingFragment extends BaseScheduleFragment<clearGlobalBitmap> implements ViewPager.MediaMetadataCompat, C6397xabb2c88d, FragmentBuilder_BindBulkTransferGroupsFragment, FragmentBuilder_BindBulkTransferSuccessFragment, TabLayout$MediaBrowserCompat$ItemReceiver {
    private submitCreditLimitUpdate IconCompatParcelizer;
    private FundClientListAdapter MediaBrowserCompat$MediaItem;
    @BindView
    DefaultButton buttonReview;
    @BindView
    public LinearLayout clientNoLayout;
    @BindView
    AmountEditText editAmount;
    @HmlPinActivity
    public clearGlobalBitmap fundPurchasePresenter;
    @BindView
    CustomFundSelect fundSelect;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    LinearLayout mFundPayContainer;
    @BindView
    LinearLayout mFundPayFragmentContainer;
    @BindView
    TextView mFundPayTitle;
    @BindView
    NoSwipeViewPager mViewPager;
    @BindView
    NestedScrollView nestedScrollView;
    @BindView
    TabLayout tabLayout;
    @BindView
    FragmentWrapContentViewPager tabPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89152131494142, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.fundPurchasePresenter.MediaBrowserCompat$ItemReceiver(this);
        clearGlobalBitmap clearglobalbitmap = this.fundPurchasePresenter;
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.AlertController$RecycleListView();
        }
        clearglobalbitmap.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver();
        clearglobalbitmap.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new clearGlobalBitmap.IconCompatParcelizer(clearglobalbitmap, (byte) 0));
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            clearGlobalBitmap clearglobalbitmap2 = this.fundPurchasePresenter;
            InstallIdProvider installIdProvider = (InstallIdProvider) getActivity().getIntent().getParcelableExtra("com.scb.phone.PURCHASE_FUND_SEARCH_SELECTED");
            int intExtra = getActivity().getIntent().getIntExtra("SELECTED_CLIENT_LIST_POSITION", 0);
            clearglobalbitmap2.MediaSessionCompat$QueueItem = installIdProvider;
            clearglobalbitmap2.ParcelableVolumeInfo = intExtra;
            if (installIdProvider != null) {
                ImageCaptureView_Factory imageCaptureView_Factory = new ImageCaptureView_Factory(installIdProvider);
                if (clearglobalbitmap2.RatingCompat != null) {
                    imageCaptureView_Factory.IconCompatParcelizer(clearglobalbitmap2.RatingCompat);
                }
                ImageCaptureView.C34681 r6 = ImageCaptureView.C34681.read;
                if (clearglobalbitmap2.RatingCompat != null) {
                    r6.IconCompatParcelizer(clearglobalbitmap2.RatingCompat);
                }
            } else {
                ImageCapturedEvent imageCapturedEvent = ImageCapturedEvent.IconCompatParcelizer;
                if (clearglobalbitmap2.RatingCompat != null) {
                    imageCapturedEvent.IconCompatParcelizer(clearglobalbitmap2.RatingCompat);
                }
            }
        }
        this.mViewPager.addOnPageChangeListener(this);
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.fund_purchase_landing_title));
        setActionBarVisibilityCallback();
        this.buttonReview.setButtonEnabled(false);
        if (this.fundPurchasePresenter.MediaDescriptionCompat()) {
            this.buttonReview.setButtonEnabled(true);
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfschedule_purchase");
        }
        return inflate;
    }

    public final void IconCompatParcelizer() {
        this.fundSelect.setFundTitle(R.string.select_fund_title);
        this.fundSelect.setFundCode(getResources().getString(R.string.select_fund_subtitle));
        this.mFundPayContainer.setVisibility(8);
    }

    public final void read(markInitializationComplete markinitializationcomplete) {
        clearGlobalBitmap clearglobalbitmap = this.fundPurchasePresenter;
        List<doBackgroundInitializationAsync> list = markinitializationcomplete.MediaBrowserCompat$ItemReceiver;
        clearglobalbitmap.MediaBrowserCompat$MediaItem = list;
        if (list != null) {
            inject_previewFrameHandler inject_previewframehandler = new inject_previewFrameHandler(clearglobalbitmap, list);
            if (clearglobalbitmap.RatingCompat != null) {
                inject_previewframehandler.IconCompatParcelizer(clearglobalbitmap.RatingCompat);
            }
        }
        this.fundSelect.setOnFundSelectClickListener(this);
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                FundPurchaseLandingFragment.write(FundPurchaseLandingFragment.this, d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                FundPurchaseLandingFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.fund_purchase_landing_title));
        setActionBarVisibilityCallback();
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, List<doBackgroundInitializationAsync> list) {
        FundClientListAdapter fundClientListAdapter = new FundClientListAdapter(getContext(), list);
        this.MediaBrowserCompat$MediaItem = fundClientListAdapter;
        this.mViewPager.setAdapter(fundClientListAdapter);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0, getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0);
        this.mViewPager.setOffscreenPageLimit(1);
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.mViewPager.setCurrentItem(i);
        if (list.size() == 1 || list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
        this.fundPurchasePresenter.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(immediateCheckedFuture immediatecheckedfuture, chain chain) {
        if (immediatecheckedfuture != null) {
            this.fundPurchasePresenter.MediaBrowserCompat$ItemReceiver = immediatecheckedfuture.AppCompatViewInflater;
        } else if (chain != null) {
            this.fundPurchasePresenter.MediaMetadataCompat = chain.MediaDescriptionCompat;
            this.fundPurchasePresenter.MediaBrowserCompat$SearchResultReceiver = chain.MediaSessionCompat$Token;
        }
    }

    public final void write() {
        this.mFundPayContainer.setVisibility(0);
        if (!DiskLruCache.VERSION_1.equals(this.fundPurchasePresenter.MediaSessionCompat$QueueItem.RatingCompat) || !DiskLruCache.VERSION_1.equals(this.fundPurchasePresenter.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem)) {
            this.tabLayout.setVisibility(8);
            this.tabPager.setVisibility(8);
            this.IconCompatParcelizer = null;
            this.mFundPayFragmentContainer.setVisibility(0);
            if (DiskLruCache.VERSION_1.equals(this.fundPurchasePresenter.MediaSessionCompat$QueueItem.RatingCompat)) {
                this.mFundPayTitle.setText(R.string.fund_pay_by_account_no);
                getChildFragmentManager().read().IconCompatParcelizer(R.id.fund_pay_fragment_container, AccountTabFragment.write(this, 0), getString(R.string.fund_pay_account_fragment)).write();
            }
            if (DiskLruCache.VERSION_1.equals(this.fundPurchasePresenter.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem)) {
                this.mFundPayTitle.setText(R.string.fund_pay_by_CREDIT_CARD);
                getChildFragmentManager().read().IconCompatParcelizer(R.id.fund_pay_fragment_container, CreditCardTabFragment.write(this, 1), getString(R.string.fund_pay_credit_card_fragment)).write();
                return;
            }
            return;
        }
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        this.mFundPayFragmentContainer.setVisibility(8);
        this.mFundPayTitle.setText(R.string.fund_pay_by);
        this.tabLayout.setVisibility(0);
        this.tabPager.setVisibility(0);
        submitCreditLimitUpdate submitcreditlimitupdate = new submitCreditLimitUpdate(getChildFragmentManager(), getContext(), this);
        this.IconCompatParcelizer = submitcreditlimitupdate;
        this.tabPager.setAdapter(submitcreditlimitupdate);
        this.tabLayout.setupWithViewPager(this.tabPager);
        this.tabLayout.addOnTabSelectedListener(this);
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        this.fundPurchasePresenter.MediaBrowserCompat$SearchResultReceiver();
    }

    public final void IconCompatParcelizer(InstallerPackageNameProvider installerPackageNameProvider) {
        Intent intent = new Intent(getContext(), FundActionsSearchActivity.class);
        intent.putExtra("com.scb.phone.FUND_ACTION_INDICATOR", "FUND_ACTION_PURCHASE");
        intent.putExtra("com.scb.phone.ARGS_FUND_SEARCH_DATA", installerPackageNameProvider);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 7001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(getOsBuildVersionString getosbuildversionstring) {
        Context context = getContext();
        if (context != null) {
            Intent IconCompatParcelizer2 = QuestionnaireActivity.IconCompatParcelizer(context, getClass().getName(), getosbuildversionstring, "mfschedule_purchasefundfact");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(IconCompatParcelizer2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 7001) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = "page_purchase";
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.fundPurchasePresenter.MediaSessionCompat$QueueItem = (InstallIdProvider) intent.getParcelableExtra("com.scb.phone.PURCHASE_FUND_SEARCH_SELECTED");
            write(this.fundPurchasePresenter.MediaSessionCompat$QueueItem);
            this.fundPurchasePresenter.MediaDescriptionCompat = true;
        }
    }

    public final void write(InstallIdProvider installIdProvider) {
        this.fundSelect.setFundTitle(R.string.select_fund_title);
        this.fundSelect.setFundCode(installIdProvider.MediaBrowserCompat$ItemReceiver);
        this.fundSelect.description.setVisibility(0);
        this.fundSelect.setDescription(installIdProvider.MediaBrowserCompat$SearchResultReceiver);
    }

    public void onResume() {
        super.onResume();
        if (!(getActivity() == null || getActivity().getIntent() == null || !DiskLruCache.VERSION_1.equals(getActivity().getIntent().getStringExtra("com.scb.phone.PURCHASE_FUND_ANOTHER_TRANSACTION")))) {
            this.fundPurchasePresenter.ParcelableVolumeInfo = 0;
            MediaBrowserCompat$MediaItem();
            this.fundSelect.setFundCode(getResources().getString(R.string.select_fund_subtitle));
            this.fundSelect.description.setVisibility(8);
            this.mFundPayContainer.setVisibility(8);
            this.buttonReview.setButtonEnabled(false);
            if (this.fundPurchasePresenter.MediaDescriptionCompat()) {
                this.buttonReview.setButtonEnabled(true);
            }
            getActivity().setIntent((Intent) null);
        }
        if (this.fundPurchasePresenter.MediaDescriptionCompat) {
            this.fundPurchasePresenter.MediaDescriptionCompat = false;
            MediaBrowserCompat$MediaItem();
            write();
            this.buttonReview.setButtonEnabled(false);
            if (this.fundPurchasePresenter.MediaDescriptionCompat()) {
                this.buttonReview.setButtonEnabled(true);
            }
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.fundPurchasePresenter.IconCompatParcelizer = 0.0d;
        this.editAmount.setText("");
        this.editAmount.setHint(R.string.transfer_to_account_amount_hint);
        this.editAmount.post(new ActivityBuilder_BindPredictiveTilesLearnMoreActivity(this));
    }

    public final void MediaMetadataCompat() {
        this.fundSelect.setFundCode(getResources().getString(R.string.select_fund_subtitle));
        this.fundSelect.description.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(getOsBuildVersionString getosbuildversionstring) {
        getosbuildversionstring.write();
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = FundFactSheetActivity.MediaBrowserCompat$ItemReceiver(context, getosbuildversionstring.write(), getosbuildversionstring, "mfschedule_purchasefundfact");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        this.mFundPayContainer.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str, String str2, isProximityOn isproximityon) {
        write(str, str2, R.string.ok, new ActivityBuilder_BindQuickPromptPayActivity(this, isproximityon));
    }

    @OnClick
    public void onReviewButtonClick() {
        int i;
        PlaybackStateCompat$CustomAction();
        AlertController$RecycleListView();
        clearGlobalBitmap clearglobalbitmap = this.fundPurchasePresenter;
        TabLayout.IconCompatParcelizer iconCompatParcelizer = this.tabLayout.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            i = iconCompatParcelizer.read;
        } else {
            i = -1;
        }
        clearglobalbitmap.IconCompatParcelizer(i);
    }

    static /* synthetic */ void write(FundPurchaseLandingFragment fundPurchaseLandingFragment, double d) {
        fundPurchaseLandingFragment.fundPurchasePresenter.IconCompatParcelizer = d;
        fundPurchaseLandingFragment.buttonReview.setButtonEnabled(false);
        if (fundPurchaseLandingFragment.fundPurchasePresenter.MediaDescriptionCompat()) {
            fundPurchaseLandingFragment.buttonReview.setButtonEnabled(true);
        }
    }

    public final /* bridge */ /* synthetic */ getDestination MediaDescriptionCompat() {
        return this.fundPurchasePresenter;
    }

    public void onPageSelected(int i) {
        View view;
        this.fundPurchasePresenter.ParcelableVolumeInfo = i;
        int[] iArr = {i - 1, i, i + 1};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (noSwipeViewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_PURCHASE_CLIENT_LIST_ADAPTER");
                sb.append(i3);
                view = noSwipeViewPager.findViewWithTag(sb.toString());
            } else {
                view = null;
            }
            if (view != null) {
                if (i == i3) {
                    view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
                } else {
                    view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_white_rounded));
                }
            }
        }
        this.fundPurchasePresenter.MediaBrowserCompat$CustomActionResultReceiver(i);
        FundClientListAdapter fundClientListAdapter = this.MediaBrowserCompat$MediaItem;
        if (fundClientListAdapter != null) {
            fundClientListAdapter.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        this.fundPurchasePresenter.MediaBrowserCompat$MediaItem();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r4 = (com.scb.phone.view.fragment.investment.purchase.CreditCardTabFragment) r3.IconCompatParcelizer.instantiateItem((android.view.ViewGroup) r3.tabLayout, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(com.google.android.material.tabs.TabLayout.IconCompatParcelizer r4) {
        /*
            r3 = this;
            int r4 = r4.read
            r0 = 0
            if (r4 == 0) goto L_0x0028
            r1 = 1
            if (r4 != r1) goto L_0x0048
            o.submitCreditLimitUpdate r4 = r3.IconCompatParcelizer
            com.google.android.material.tabs.TabLayout r2 = r3.tabLayout
            java.lang.Object r4 = r4.instantiateItem((android.view.ViewGroup) r2, (int) r1)
            com.scb.phone.view.fragment.investment.purchase.CreditCardTabFragment r4 = (com.scb.phone.view.fragment.investment.purchase.CreditCardTabFragment) r4
            com.scb.phone.view.adapter.investment.purchase.CreditCardDetailsAdapter r1 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0027
            int r2 = r4.IconCompatParcelizer
            java.util.List<o.chain> r1 = r1.IconCompatParcelizer
            java.lang.Object r1 = r1.get(r2)
            o.chain r1 = (p040o.chain) r1
            o.FragmentBuilder_BindBulkTransferSuccessFragment r4 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x0027
            r4.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
        L_0x0027:
            return
        L_0x0028:
            o.submitCreditLimitUpdate r4 = r3.IconCompatParcelizer
            com.google.android.material.tabs.TabLayout r1 = r3.tabLayout
            r2 = 0
            java.lang.Object r4 = r4.instantiateItem((android.view.ViewGroup) r1, (int) r2)
            com.scb.phone.view.fragment.investment.purchase.AccountTabFragment r4 = (com.scb.phone.view.fragment.investment.purchase.AccountTabFragment) r4
            com.scb.phone.view.adapter.investment.purchase.AccountDetailsAdapter r1 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0048
            int r2 = r4.IconCompatParcelizer
            java.util.List<o.immediateCheckedFuture> r1 = r1.write
            java.lang.Object r1 = r1.get(r2)
            o.immediateCheckedFuture r1 = (p040o.immediateCheckedFuture) r1
            o.FragmentBuilder_BindBulkTransferSuccessFragment r4 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x0048
            r4.MediaBrowserCompat$CustomActionResultReceiver(r1, r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.purchase.FundPurchaseLandingFragment.write(com.google.android.material.tabs.TabLayout$IconCompatParcelizer):void");
    }

    public final void write(getOsBuildVersionString getosbuildversionstring, CrashlyticsCore.C32462 r5) {
        write(r5.MediaBrowserCompat$CustomActionResultReceiver, r5.IconCompatParcelizer, r5.read.equals("P") ? R.string.proceed : R.string.ok, new ActivityBuilder_BindPromptPayQRActivity(this, getosbuildversionstring));
    }
}
