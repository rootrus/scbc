package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OnboardingCareerInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OnboardingCareerInformationFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public OnboardingCareerInformationFragment_ViewBinding(final OnboardingCareerInformationFragment onboardingCareerInformationFragment, View view) {
        super(onboardingCareerInformationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardingCareerInformationFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.rl_layout_business, "field 'rlBusinessLayout' and method 'startBusinessSearch'");
        onboardingCareerInformationFragment.rlBusinessLayout = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.rl_layout_business, "field 'rlBusinessLayout'", RelativeLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingCareerInformationFragment.this.startBusinessSearch();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_next_career_info, "field 'btNextCareerInfo' and method 'sendCareerInfo'");
        onboardingCareerInformationFragment.btNextCareerInfo = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_next_career_info, "field 'btNextCareerInfo'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingCareerInformationFragment.this.sendCareerInfo();
            }
        });
        onboardingCareerInformationFragment.tvOccupation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_occupation_career_info, "field 'tvOccupation'", TextView.class);
        onboardingCareerInformationFragment.tvBusiness = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_business_career_info, "field 'tvBusiness'", TextView.class);
        onboardingCareerInformationFragment.swtMonthlyIncome = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_monthly_salary_spinner, "field 'swtMonthlyIncome'", CustomSpinnerWithTitle.class);
        onboardingCareerInformationFragment.ivgTextWorkplace = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_text_workplace, "field 'ivgTextWorkplace'", CommonInputViewGroup.class);
        onboardingCareerInformationFragment.ivgTextPosition = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_text_position, "field 'ivgTextPosition'", CommonInputViewGroup.class);
        onboardingCareerInformationFragment.ivBusinessArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_image_arrow_business, "field 'ivBusinessArrow'", ImageView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.rl_layout_occupation, "method 'startOccupationSearch'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingCareerInformationFragment.this.startOccupationSearch();
            }
        });
    }

    public final void read() {
        OnboardingCareerInformationFragment onboardingCareerInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onboardingCareerInformationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            onboardingCareerInformationFragment.rlBusinessLayout = null;
            onboardingCareerInformationFragment.btNextCareerInfo = null;
            onboardingCareerInformationFragment.tvOccupation = null;
            onboardingCareerInformationFragment.tvBusiness = null;
            onboardingCareerInformationFragment.swtMonthlyIncome = null;
            onboardingCareerInformationFragment.ivgTextWorkplace = null;
            onboardingCareerInformationFragment.ivgTextPosition = null;
            onboardingCareerInformationFragment.ivBusinessArrow = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
