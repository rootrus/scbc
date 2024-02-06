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
import com.scb.phone.view.adapter.easycash.CardLoanOfferViewPagerAdapter;
import java.util.List;
import p040o.NativeSessionFileProvider;
import p040o.setLastBaselineToBottomHeight;
import p040o.subscribe;
import p059me.relex.circleindicator.CircleIndicator;

public class CustomCreditCardPageSelector extends LinearLayout {
    @BindView
    ViewPager cardViewPager;
    @BindView
    protected CircleIndicator mCircleIndicator;
    @BindView
    TextView sectionHeader;

    public CustomCreditCardPageSelector(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomCreditCardPageSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomCreditCardPageSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81592131493385, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void IconCompatParcelizer(subscribe subscribe, ViewPager.MediaMetadataCompat mediaMetadataCompat) {
        this.sectionHeader.setText(subscribe.MediaBrowserCompat$ItemReceiver);
        write(subscribe.read, true, false, false, mediaMetadataCompat);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(subscribe subscribe, boolean z, ViewPager.MediaMetadataCompat mediaMetadataCompat) {
        this.sectionHeader.setText(subscribe.MediaBrowserCompat$ItemReceiver);
        write(subscribe.read, false, z, true, mediaMetadataCompat);
    }

    private void write(List<NativeSessionFileProvider> list, boolean z, boolean z2, boolean z3, ViewPager.MediaMetadataCompat mediaMetadataCompat) {
        this.cardViewPager.setAdapter(new CardLoanOfferViewPagerAdapter(list, z, z2));
        this.cardViewPager.setClipToPadding(false);
        this.cardViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75572131166026), 0, getResources().getDimensionPixelOffset(R.dimen.f75572131166026), 0);
        this.cardViewPager.clearOnPageChangeListeners();
        this.cardViewPager.addOnPageChangeListener(mediaMetadataCompat);
        mediaMetadataCompat.onPageSelected(0);
        if (z3) {
            this.mCircleIndicator.setViewPager(this.cardViewPager);
            this.cardViewPager.setCurrentItem(0);
            if (list.size() >= 10) {
                this.mCircleIndicator.setVisibility(8);
            } else {
                this.mCircleIndicator.setVisibility(0);
            }
        }
    }

    public final void read() {
        this.mCircleIndicator.setVisibility(8);
    }

    public void setSelectedCard(int i) {
        if (this.cardViewPager.getAdapter() instanceof CardLoanOfferViewPagerAdapter) {
            ((CardLoanOfferViewPagerAdapter) this.cardViewPager.getAdapter()).MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        int[] iArr = {i - 1, i, i + 1};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            ViewPager viewPager = this.cardViewPager;
            if (viewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_ACCOUNT_SELECTOR_ADAPTER_BACKGROUND");
                sb.append(i3);
                View findViewWithTag = viewPager.findViewWithTag(sb.toString());
                if (findViewWithTag != null) {
                    if (i == i3) {
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
                    } else {
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_white_rounded));
                    }
                }
            }
        }
    }
}
