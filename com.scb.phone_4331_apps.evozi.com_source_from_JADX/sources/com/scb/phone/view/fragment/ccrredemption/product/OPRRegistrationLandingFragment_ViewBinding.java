package com.scb.phone.view.fragment.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OPRRegistrationLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View RatingCompat;
    private OPRRegistrationLandingFragment write;

    public OPRRegistrationLandingFragment_ViewBinding(final OPRRegistrationLandingFragment oPRRegistrationLandingFragment, View view) {
        super(oPRRegistrationLandingFragment, view);
        this.write = oPRRegistrationLandingFragment;
        oPRRegistrationLandingFragment.imvProductDetail = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_product_detail, "field 'imvProductDetail'", ImageView.class);
        oPRRegistrationLandingFragment.txvProductName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_name, "field 'txvProductName'", TextView.class);
        oPRRegistrationLandingFragment.txvProductDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_details, "field 'txvProductDetails'", TextView.class);
        oPRRegistrationLandingFragment.txvMaskedCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.masked_card_number, "field 'txvMaskedCardNumber'", TextView.class);
        oPRRegistrationLandingFragment.txvNickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nickname, "field 'txvNickname'", TextView.class);
        oPRRegistrationLandingFragment.txvPointsCash = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.points_cash, "field 'txvPointsCash'", TextView.class);
        oPRRegistrationLandingFragment.txvMinimumPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.minimum_points, "field 'txvMinimumPoints'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_view_rewards, "field 'btnViewRewards' and method 'onRewardsClick'");
        oPRRegistrationLandingFragment.btnViewRewards = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_view_rewards, "field 'btnViewRewards'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OPRRegistrationLandingFragment.this.onRewardsClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.minimum_points_layout, "field 'minimumPointsLayout' and method 'onMinimumPointsClick'");
        oPRRegistrationLandingFragment.minimumPointsLayout = (CardView) onStart.write(IconCompatParcelizer3, R.id.minimum_points_layout, "field 'minimumPointsLayout'", CardView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OPRRegistrationLandingFragment.this.onMinimumPointsClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_register, "field 'registerButton' and method 'onRegisterClick'");
        oPRRegistrationLandingFragment.registerButton = (Button) onStart.write(IconCompatParcelizer4, R.id.btn_register, "field 'registerButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OPRRegistrationLandingFragment.this.onRegisterClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.points_cash_layout, "field 'pointsCashLayout' and method 'onPointsPlusCashClick'");
        oPRRegistrationLandingFragment.pointsCashLayout = (CardView) onStart.write(IconCompatParcelizer5, R.id.points_cash_layout, "field 'pointsCashLayout'", CardView.class);
        this.RatingCompat = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OPRRegistrationLandingFragment.this.onPointsPlusCashClick();
            }
        });
        oPRRegistrationLandingFragment.oneCardAllowedLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.only_one_card_allowed_label, "field 'oneCardAllowedLabel'", TextView.class);
        oPRRegistrationLandingFragment.rewardsErrorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_rewards_error, "field 'rewardsErrorLayout'", ViewGroup.class);
        oPRRegistrationLandingFragment.txvErrorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_generic_error, "field 'txvErrorMessage'", TextView.class);
        oPRRegistrationLandingFragment.txvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'txvErrorTitle'", TextView.class);
        oPRRegistrationLandingFragment.txvErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_icon, "field 'txvErrorIcon'", ImageView.class);
        oPRRegistrationLandingFragment.layoutRegistration = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_registration_page, "field 'layoutRegistration'", LinearLayout.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.terms_and_conditions, "method 'handleClickOfTermsAndConditions'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OPRRegistrationLandingFragment.this.handleClickOfTermsAndConditions();
            }
        });
    }

    public final void read() {
        OPRRegistrationLandingFragment oPRRegistrationLandingFragment = this.write;
        if (oPRRegistrationLandingFragment != null) {
            this.write = null;
            oPRRegistrationLandingFragment.imvProductDetail = null;
            oPRRegistrationLandingFragment.txvProductName = null;
            oPRRegistrationLandingFragment.txvProductDetails = null;
            oPRRegistrationLandingFragment.txvMaskedCardNumber = null;
            oPRRegistrationLandingFragment.txvNickname = null;
            oPRRegistrationLandingFragment.txvPointsCash = null;
            oPRRegistrationLandingFragment.txvMinimumPoints = null;
            oPRRegistrationLandingFragment.btnViewRewards = null;
            oPRRegistrationLandingFragment.minimumPointsLayout = null;
            oPRRegistrationLandingFragment.registerButton = null;
            oPRRegistrationLandingFragment.pointsCashLayout = null;
            oPRRegistrationLandingFragment.oneCardAllowedLabel = null;
            oPRRegistrationLandingFragment.rewardsErrorLayout = null;
            oPRRegistrationLandingFragment.txvErrorMessage = null;
            oPRRegistrationLandingFragment.txvErrorTitle = null;
            oPRRegistrationLandingFragment.txvErrorIcon = null;
            oPRRegistrationLandingFragment.layoutRegistration = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
