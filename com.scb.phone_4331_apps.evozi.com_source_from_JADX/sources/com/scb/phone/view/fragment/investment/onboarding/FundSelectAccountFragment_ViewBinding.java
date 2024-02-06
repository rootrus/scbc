package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class FundSelectAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundSelectAccountFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public FundSelectAccountFragment_ViewBinding(final FundSelectAccountFragment fundSelectAccountFragment, View view) {
        super(fundSelectAccountFragment, view);
        this.IconCompatParcelizer = fundSelectAccountFragment;
        fundSelectAccountFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", ViewPager.class);
        fundSelectAccountFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        fundSelectAccountFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSelectAccountFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        FundSelectAccountFragment fundSelectAccountFragment = this.IconCompatParcelizer;
        if (fundSelectAccountFragment != null) {
            this.IconCompatParcelizer = null;
            fundSelectAccountFragment.mViewPager = null;
            fundSelectAccountFragment.mCircleIndicator = null;
            fundSelectAccountFragment.buttonNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
