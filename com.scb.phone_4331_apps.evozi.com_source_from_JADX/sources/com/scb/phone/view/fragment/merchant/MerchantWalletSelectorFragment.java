package com.scb.phone.view.fragment.merchant;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.deposit.MerchantWalletSelectorAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.doWriteToLog;
import p059me.relex.circleindicator.CircleIndicator;

public class MerchantWalletSelectorFragment extends BaseFragment {
    protected C1120xb01419fd MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected CircleIndicator mCircleIndicator;
    @BindView
    protected ViewPager mViewPager;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88382131494065, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void IconCompatParcelizer(List<doWriteToLog> list) {
        this.mViewPager.setAdapter(new MerchantWalletSelectorAdapter(list));
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (MerchantWalletSelectorFragment.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    MerchantWalletSelectorFragment.this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
                }
            }
        });
        this.mCircleIndicator.setViewPager(this.mViewPager);
        if (list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
    }

    public final void IconCompatParcelizer(int i) {
        C1120xb01419fd merchantWalletSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.mViewPager.getCurrentItem() != i;
        this.mViewPager.setCurrentItem(i, false);
        if (!z && (merchantWalletSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            merchantWalletSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver.write(i);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1120xb01419fd) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C1120xb01419fd) context;
        }
    }
}
