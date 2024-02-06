package com.scb.phone.view.fragment.requesttopay;

import android.os.Bundle;
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
import com.scb.phone.view.adapter.transferandpay.ProxySourceAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.C4962mZ;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.access$2200;
import p040o.getDocumentFramingError;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSymbol;
import p059me.relex.circleindicator.CircleIndicator;

public class PromptPayTargetSelectFragment extends BaseFragment implements ViewPager.MediaMetadataCompat, getDocumentFramingError.MediaMetadataCompat, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    PromptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private ProxySourceAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    LinearLayout mAccountSourceLayout;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    LinearLayout mEmptyCard;
    @BindView
    TextView mEmptyDescription;
    @BindView
    TextView mEmptyTitle;
    @BindView
    NoSwipeViewPager mViewPager;
    @HmlPinActivity
    public C4962mZ promptPayAccountTargetPresenter;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89622131494189, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mViewPager.addOnPageChangeListener(this);
        return inflate;
    }

    public void onDestroy() {
        this.promptPayAccountTargetPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<setSymbol> list) {
        ProxySourceAdapter proxySourceAdapter = new ProxySourceAdapter(getContext(), list, this);
        this.MediaBrowserCompat$CustomActionResultReceiver = proxySourceAdapter;
        this.mViewPager.setAdapter(proxySourceAdapter);
        this.mViewPager.setClipToPadding(false);
        if (list.size() == 1) {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75532131166022), 0, 0, 0);
        } else {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        }
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.mViewPager.setCurrentItem(0);
        PromptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver promptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
        if (promptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver != null) {
            promptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.write.get(0));
        }
        this.mAccountSourceLayout.setVisibility(0);
        this.mEmptyCard.setVisibility(8);
    }

    public final void write() {
        this.mAccountSourceLayout.setVisibility(8);
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
        this.mEmptyTitle.setGravity(3);
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
        this.mEmptyCard.setVisibility(0);
    }

    public final void read(int i) {
        this.mViewPager.setCurrentItem(i, true);
        write(i);
    }

    public void onPageSelected(int i) {
        write(i);
    }

    private void write(int i) {
        View view;
        int[] iArr = {i - 1, i, i + 1};
        if (i == 0) {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        } else {
            ProxySourceAdapter proxySourceAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (proxySourceAdapter == null || i != proxySourceAdapter.getCount() - 1) {
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
        PromptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver promptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
        if (promptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver != null) {
            promptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.write.get(i));
        }
        ProxySourceAdapter proxySourceAdapter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (proxySourceAdapter2 != null) {
            proxySourceAdapter2.IconCompatParcelizer = i;
        }
    }

    public final void ax_() {
        this.mViewPager.setAdapter(new ErrorPagerAdapter(getContext(), (access$2200) null));
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mCircleIndicator.setViewPager(this.mViewPager);
    }
}
