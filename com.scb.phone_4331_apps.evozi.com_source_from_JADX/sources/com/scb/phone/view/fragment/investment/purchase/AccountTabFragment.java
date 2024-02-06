package com.scb.phone.view.fragment.investment.purchase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.purchase.AccountDetailsAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.CheckParameters$CheckCountry$MediaBrowserCompat$ItemReceiver;
import p040o.FragmentBuilder_BindBulkTransferSuccessFragment;
import p040o.HmlPinActivity;
import p040o.ImageCapturedListener;
import p040o.chain;
import p040o.immediateCheckedFuture;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public class AccountTabFragment extends BaseFragment implements ViewPager.MediaMetadataCompat, CheckParameters$CheckCountry$MediaBrowserCompat$ItemReceiver {
    int IconCompatParcelizer = 0;
    AccountDetailsAdapter MediaBrowserCompat$CustomActionResultReceiver;
    FragmentBuilder_BindBulkTransferSuccessFragment MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public ImageCapturedListener accountPayPresenter;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    TextView mEmptyCenterTitle;
    @BindView
    RelativeLayout mEmptyContainer;
    @BindView
    TextView mEmptyDescription;
    @BindView
    ImageView mEmptyImage;
    @BindView
    TextView mEmptyTitle;
    @BindView
    LinearLayout mErrorContainer;
    @BindView
    ViewPager mViewPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public static AccountTabFragment write(FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment, int i) {
        AccountTabFragment accountTabFragment = new AccountTabFragment();
        accountTabFragment.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindBulkTransferSuccessFragment;
        return accountTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88832131494110, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mViewPager.addOnPageChangeListener(this);
        this.accountPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        ImageCapturedListener imageCapturedListener = this.accountPayPresenter;
        if (imageCapturedListener.RatingCompat != null) {
            imageCapturedListener.RatingCompat.Keep();
        }
        imageCapturedListener.read.read();
        imageCapturedListener.read.IconCompatParcelizer(new ImageCapturedListener.read(imageCapturedListener, (byte) 0));
        return inflate;
    }

    public final void write() {
        this.mErrorContainer.setVisibility(0);
        this.mViewPager.setVisibility(8);
        this.mCircleIndicator.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public final void read(List<immediateCheckedFuture> list) {
        if (list.size() == 0) {
            this.mEmptyContainer.setVisibility(0);
            this.mEmptyTitle.setText(getResources().getString(R.string.account_empty_title));
            this.mEmptyTitle.setVisibility(0);
            this.mEmptyCenterTitle.setVisibility(8);
            this.mEmptyDescription.setVisibility(0);
            this.mEmptyDescription.setText(getResources().getString(R.string.account_empty_description));
            this.mViewPager.setVisibility(8);
            this.mCircleIndicator.setVisibility(8);
            this.mEmptyImage.setVisibility(8);
            return;
        }
        AccountDetailsAdapter accountDetailsAdapter = new AccountDetailsAdapter(getContext(), list);
        this.MediaBrowserCompat$CustomActionResultReceiver = accountDetailsAdapter;
        this.mViewPager.setAdapter(accountDetailsAdapter);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0, getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0);
        this.mViewPager.setOffscreenPageLimit(1);
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.mViewPager.setCurrentItem(0);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 0;
        if (list.size() == 1 || list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
        immediateCheckedFuture immediatecheckedfuture = this.MediaBrowserCompat$CustomActionResultReceiver.write.get(0);
        FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindBulkTransferSuccessFragment != null) {
            fragmentBuilder_BindBulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(immediatecheckedfuture, (chain) null);
        }
    }

    public void onPageSelected(int i) {
        this.IconCompatParcelizer = i;
        int i2 = 0;
        int[] iArr = {i - 1, i, i + 1};
        while (true) {
            View view = null;
            if (i2 >= 3) {
                break;
            }
            int i3 = iArr[i2];
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_ACCOUNT_LIST_ADAPTER");
                sb.append(i3);
                view = viewPager.findViewWithTag(sb.toString());
            }
            if (view != null) {
                if (i == i3) {
                    view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
                } else {
                    view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_white_rounded));
                }
            }
            i2++;
        }
        immediateCheckedFuture immediatecheckedfuture = this.MediaBrowserCompat$CustomActionResultReceiver.write.get(i);
        FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindBulkTransferSuccessFragment != null) {
            fragmentBuilder_BindBulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(immediatecheckedfuture, (chain) null);
        }
        AccountDetailsAdapter accountDetailsAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountDetailsAdapter != null) {
            accountDetailsAdapter.IconCompatParcelizer = i;
        }
    }
}
