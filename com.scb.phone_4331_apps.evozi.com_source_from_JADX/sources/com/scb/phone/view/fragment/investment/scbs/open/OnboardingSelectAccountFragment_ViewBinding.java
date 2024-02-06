package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class OnboardingSelectAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OnboardingSelectAccountFragment MediaBrowserCompat$CustomActionResultReceiver;

    public OnboardingSelectAccountFragment_ViewBinding(final OnboardingSelectAccountFragment onboardingSelectAccountFragment, View view) {
        super(onboardingSelectAccountFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardingSelectAccountFragment;
        onboardingSelectAccountFragment.accountViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_registration_account, "field 'accountViewPager'", ViewPager.class);
        onboardingSelectAccountFragment.circleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_indicator, "field 'circleIndicator'", CircleIndicator.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'clickNext'");
        onboardingSelectAccountFragment.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'nextButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingSelectAccountFragment.this.clickNext();
            }
        });
    }

    public final void read() {
        OnboardingSelectAccountFragment onboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onboardingSelectAccountFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            onboardingSelectAccountFragment.accountViewPager = null;
            onboardingSelectAccountFragment.circleIndicator = null;
            onboardingSelectAccountFragment.nextButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
