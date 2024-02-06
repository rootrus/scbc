package com.scb.phone.view.fragment.purchase;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.purchase.PurchaseAccountSourceAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeMwCoachMarkActivity;
import p040o.C10178z;
import p040o.C4862jX;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.getCarbonStrip$MediaBrowserCompat$ItemReceiver;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public class PurchaseDepositFragment extends BaseFragment implements getCarbonStrip$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    PurchaseAccountSourceAdapter IconCompatParcelizer;
    /* access modifiers changed from: private */
    public PurchaseDepositInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder MediaMetadataCompat;
    @BindView
    LinearLayout layoutNoAccount;
    @BindView
    CircleIndicator mIndicator;
    @HmlPinActivity
    public C10178z.C54691 mPresenter;
    @BindView
    NoSwipeViewPager mViewPager;
    @BindView
    TextView tvNoCardTitle;

    public static PurchaseDepositFragment MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN", builder);
        PurchaseDepositFragment purchaseDepositFragment = new PurchaseDepositFragment();
        purchaseDepositFragment.setArguments(bundle);
        return purchaseDepositFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89122131494139, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.mIndicator.setViewPager(this.mViewPager);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN") == null)) {
            this.MediaMetadataCompat = (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN");
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.tvNoCardTitle.setText(Html.fromHtml(getString(R.string.purchase_account_empty_title)));
        this.MediaBrowserCompat$CustomActionResultReceiver = PurchaseDepositInputFragment.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat);
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.deposit_input_container, this.MediaBrowserCompat$CustomActionResultReceiver).write();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C10178z.C54691 r4 = this.mPresenter;
        C4862jX jXVar = C4862jX.MediaBrowserCompat$ItemReceiver;
        if (r4.RatingCompat != null) {
            jXVar.IconCompatParcelizer(r4.RatingCompat);
        }
        r4.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        r4.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C10178z.C54691.IconCompatParcelizer());
    }

    public void onDestroy() {
        super.onDestroy();
        this.mPresenter.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        PurchaseDepositInputFragment purchaseDepositInputFragment;
        this.IconCompatParcelizer = new PurchaseAccountSourceAdapter(getContext(), list, this);
        this.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                PurchaseDepositFragment.MediaBrowserCompat$ItemReceiver(PurchaseDepositFragment.this, i);
                if (PurchaseDepositFragment.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    PurchaseDepositFragment.this.MediaBrowserCompat$CustomActionResultReceiver.read(PurchaseDepositFragment.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i));
                }
            }
        });
        this.mViewPager.setAdapter(this.IconCompatParcelizer);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setVisibility(0);
        this.mIndicator.setVisibility(0);
        if (list.size() == 1) {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75532131166022), 0, 0, 0);
        } else {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        }
        if (list.size() > 0 && (purchaseDepositInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            purchaseDepositInputFragment.read(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(0));
        }
        this.mIndicator.setViewPager(this.mViewPager);
        PurchaseDepositInputFragment purchaseDepositInputFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (purchaseDepositInputFragment2 != null) {
            purchaseDepositInputFragment2.purchaseDepositInputPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ErrorPagerAdapter errorPagerAdapter = new ErrorPagerAdapter(getContext(), ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.ACCOUNT_SUMMARY_ERROR, new ActivityBuilder_ContributeMwCoachMarkActivity(this));
        this.mViewPager.setVisibility(0);
        this.mViewPager.setAdapter(errorPagerAdapter);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mIndicator.setVisibility(8);
    }

    public final void write() {
        this.mViewPager.setVisibility(8);
        this.mIndicator.setVisibility(8);
        this.layoutNoAccount.setVisibility(0);
        PurchaseDepositInputFragment purchaseDepositInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (purchaseDepositInputFragment != null) {
            purchaseDepositInputFragment.purchaseDepositInputPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat);
        }
    }

    public final void read() {
        this.mIndicator.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mIndicator.setVisibility(8);
    }

    public final void read(int i) {
        write(i);
        this.mViewPager.setCurrentItem(i);
    }

    private void write(int i) {
        int[] iArr = {i - 1, i, i + 1};
        if (i == 0) {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        } else {
            PurchaseAccountSourceAdapter purchaseAccountSourceAdapter = this.IconCompatParcelizer;
            if (purchaseAccountSourceAdapter == null || i != purchaseAccountSourceAdapter.getCount() - 1) {
                this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75502131166019), 0, getResources().getDimensionPixelOffset(R.dimen.f75502131166019), 0);
            } else {
                this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0, getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0);
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (noSwipeViewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_ACCOUNT_SOURCE_ADAPTER");
                sb.append(i3);
                View findViewWithTag = noSwipeViewPager.findViewWithTag(sb.toString());
                NoSwipeViewPager noSwipeViewPager2 = this.mViewPager;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TAG_ACCOUNT_SOURCE_ADAPTER_TEXT");
                sb2.append(i3);
                TextView textView = (TextView) noSwipeViewPager2.findViewWithTag(sb2.toString());
                if (!(findViewWithTag == null || textView == null)) {
                    if (i == i3) {
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
                        textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
                    } else {
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_white_rounded_with_border));
                        textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
                    }
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(PurchaseDepositFragment purchaseDepositFragment, int i) {
        purchaseDepositFragment.write(i);
        PurchaseAccountSourceAdapter purchaseAccountSourceAdapter = purchaseDepositFragment.IconCompatParcelizer;
        if (purchaseAccountSourceAdapter != null) {
            purchaseAccountSourceAdapter.IconCompatParcelizer = i;
        }
    }
}
