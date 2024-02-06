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
import com.scb.phone.view.adapter.investment.purchase.CreditCardDetailsAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.CheckParameters;
import p040o.FragmentBuilder_BindBulkTransferSuccessFragment;
import p040o.HmlPinActivity;
import p040o.chain;
import p040o.getBitmapFromURI;
import p040o.immediateCheckedFuture;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public class CreditCardTabFragment extends BaseFragment implements ViewPager.MediaMetadataCompat, CheckParameters.CheckCountry.write {
    int IconCompatParcelizer = 0;
    CreditCardDetailsAdapter MediaBrowserCompat$CustomActionResultReceiver;
    FragmentBuilder_BindBulkTransferSuccessFragment MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public getBitmapFromURI creditCardPayPresenter;
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
    NoSwipeViewPager mViewPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public static CreditCardTabFragment write(FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment, int i) {
        CreditCardTabFragment creditCardTabFragment = new CreditCardTabFragment();
        creditCardTabFragment.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindBulkTransferSuccessFragment;
        return creditCardTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88842131494111, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mViewPager.addOnPageChangeListener(this);
        this.creditCardPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        getBitmapFromURI getbitmapfromuri = this.creditCardPayPresenter;
        if (getbitmapfromuri.RatingCompat != null) {
            getbitmapfromuri.RatingCompat.Keep();
        }
        getbitmapfromuri.read.write();
        getbitmapfromuri.read.IconCompatParcelizer(new getBitmapFromURI.read(getbitmapfromuri, (byte) 0));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mErrorContainer.setVisibility(0);
        this.mViewPager.setVisibility(8);
        this.mCircleIndicator.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public final void write(List<chain> list) {
        if (list.size() == 0) {
            this.mEmptyContainer.setVisibility(0);
            this.mEmptyTitle.setText(getResources().getString(R.string.credit_card_empty_title));
            this.mEmptyTitle.setVisibility(0);
            this.mEmptyCenterTitle.setVisibility(8);
            this.mEmptyDescription.setText(getResources().getString(R.string.credit_card_empty_description));
            this.mViewPager.setVisibility(8);
            this.mCircleIndicator.setVisibility(8);
            this.mEmptyImage.setVisibility(8);
            return;
        }
        CreditCardDetailsAdapter creditCardDetailsAdapter = new CreditCardDetailsAdapter(getContext(), list);
        this.MediaBrowserCompat$CustomActionResultReceiver = creditCardDetailsAdapter;
        this.mViewPager.setAdapter(creditCardDetailsAdapter);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0, getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0);
        this.mViewPager.setOffscreenPageLimit(1);
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = 0;
        if (list.size() == 1 || list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.get(0);
        FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindBulkTransferSuccessFragment != null) {
            fragmentBuilder_BindBulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver((immediateCheckedFuture) null, chain);
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
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (noSwipeViewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_CREDIT_CARD_LIST_ADAPTER");
                sb.append(i3);
                view = noSwipeViewPager.findViewWithTag(sb.toString());
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
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.get(i);
        FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindBulkTransferSuccessFragment != null) {
            fragmentBuilder_BindBulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver((immediateCheckedFuture) null, chain);
        }
        CreditCardDetailsAdapter creditCardDetailsAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (creditCardDetailsAdapter != null) {
            creditCardDetailsAdapter.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
    }
}
