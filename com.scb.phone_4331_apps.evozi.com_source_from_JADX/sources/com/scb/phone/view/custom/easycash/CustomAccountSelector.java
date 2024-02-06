package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.easycash.AccountSelectorAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.getPersonalLimitUsage;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public class CustomAccountSelector extends LinearLayout {
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    public NoSwipeViewPager mViewPager;
    private int write;

    public CustomAccountSelector(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomAccountSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomAccountSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = R.drawable.bg_white_rounded;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80902131493316, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void IconCompatParcelizer(List<CrashlyticsReport.FilesPayload.File.Builder> list, CustomAccountSelector$MediaBrowserCompat$ItemReceiver customAccountSelector$MediaBrowserCompat$ItemReceiver) {
        this.mViewPager.setAdapter(new AccountSelectorAdapter(getContext(), list, new getPersonalLimitUsage(this, customAccountSelector$MediaBrowserCompat$ItemReceiver)));
        MediaBrowserCompat$ItemReceiver(list, customAccountSelector$MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.FilesPayload.File.Builder> list, final CustomAccountSelector$MediaBrowserCompat$ItemReceiver customAccountSelector$MediaBrowserCompat$ItemReceiver) {
        this.mViewPager.setClipToPadding(false);
        if (list.size() == 1) {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75532131166022), 0, 0, 0);
        } else {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        }
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.mViewPager.setCurrentItem(0);
        if (list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
        this.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                CustomAccountSelector.this.setSelectedAccountStyle(i);
                customAccountSelector$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
        });
    }

    public void setBackgroundDrawable(int i) {
        this.write = i;
    }

    public void setSelectedAccount(int i) {
        if (this.mViewPager.getAdapter() instanceof AccountSelectorAdapter) {
            ((AccountSelectorAdapter) this.mViewPager.getAdapter()).IconCompatParcelizer = i;
        }
        this.mViewPager.setCurrentItem(i);
        setSelectedAccountStyle(i);
    }

    public final CrashlyticsReport.FilesPayload.File.Builder write() {
        if (!(this.mViewPager.getAdapter() instanceof AccountSelectorAdapter)) {
            return null;
        }
        AccountSelectorAdapter accountSelectorAdapter = (AccountSelectorAdapter) this.mViewPager.getAdapter();
        int currentItem = this.mViewPager.getCurrentItem();
        if (currentItem < accountSelectorAdapter.getCount()) {
            return accountSelectorAdapter.read.get(currentItem);
        }
        return null;
    }

    public void setSelectedAccountStyle(int i) {
        int i2;
        int[] iArr = {i - 1, i, i + 1};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (noSwipeViewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_ACCOUNT_SELECTOR_ADAPTER_BACKGROUND");
                sb.append(i4);
                View findViewWithTag = noSwipeViewPager.findViewWithTag(sb.toString());
                NoSwipeViewPager noSwipeViewPager2 = this.mViewPager;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TAG_ACCOUNT_SELECTOR_ADAPTER_TEXT");
                sb2.append(i4);
                TextView textView = (TextView) noSwipeViewPager2.findViewWithTag(sb2.toString());
                if (findViewWithTag != null) {
                    if (i == i4) {
                        i2 = R.drawable.rounded_purple_view_pager;
                    } else {
                        i2 = this.write;
                    }
                    findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(getContext(), i2));
                }
                if (textView != null) {
                    textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i == i4 ? R.color.f66092131099764 : R.color.f66182131099773));
                }
            }
        }
    }
}
