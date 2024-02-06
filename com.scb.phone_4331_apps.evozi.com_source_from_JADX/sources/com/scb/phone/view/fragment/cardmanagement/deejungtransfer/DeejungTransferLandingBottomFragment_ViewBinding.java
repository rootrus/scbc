package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungTransferLandingBottomFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private DeejungTransferLandingBottomFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View write;

    public DeejungTransferLandingBottomFragment_ViewBinding(final DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment, View view) {
        super(deejungTransferLandingBottomFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingBottomFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.transfer_amount, "field 'transferAmountView' and method 'onTransferAmountFocusChange'");
        deejungTransferLandingBottomFragment.transferAmountView = (EditText) onStart.write(IconCompatParcelizer2, R.id.transfer_amount, "field 'transferAmountView'", EditText.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                DeejungTransferLandingBottomFragment.this.onTransferAmountFocusChange();
            }
        });
        deejungTransferLandingBottomFragment.divider = onStart.IconCompatParcelizer(view, R.id.divider2, "field 'divider'");
        deejungTransferLandingBottomFragment.remainingLimitLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_label, "field 'remainingLimitLabel'", TextView.class);
        deejungTransferLandingBottomFragment.transferAmountError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_error_transfer_amount, "field 'transferAmountError'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.installment_plans_layout, "field 'installmentsPlansLayout' and method 'handleClickOfInstallmentPlans'");
        deejungTransferLandingBottomFragment.installmentsPlansLayout = (CardView) onStart.write(IconCompatParcelizer3, R.id.installment_plans_layout, "field 'installmentsPlansLayout'", CardView.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferLandingBottomFragment.this.handleClickOfInstallmentPlans();
            }
        });
        deejungTransferLandingBottomFragment.selectPaymentLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_payment_method_label, "field 'selectPaymentLabel'", TextView.class);
        deejungTransferLandingBottomFragment.installmentIconImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_icon_installments, "field 'installmentIconImage'", ImageView.class);
        deejungTransferLandingBottomFragment.installmentPlanLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.installment_plan_label, "field 'installmentPlanLabel'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.min_or_max_layout, "field 'minMaxLayout' and method 'handleClickOfMinMaxPlans'");
        deejungTransferLandingBottomFragment.minMaxLayout = (CardView) onStart.write(IconCompatParcelizer4, R.id.min_or_max_layout, "field 'minMaxLayout'", CardView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferLandingBottomFragment.this.handleClickOfMinMaxPlans();
            }
        });
        deejungTransferLandingBottomFragment.minMaxIconImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_icon_min_max, "field 'minMaxIconImage'", ImageView.class);
        deejungTransferLandingBottomFragment.minMaxPlanLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.min_or_full_plan_label, "field 'minMaxPlanLabel'", TextView.class);
        deejungTransferLandingBottomFragment.txvGeneralTerms = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.general_terms, "field 'txvGeneralTerms'", TextView.class);
        deejungTransferLandingBottomFragment.planFragmentContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.plans_fragment_container, "field 'planFragmentContainer'", FrameLayout.class);
        deejungTransferLandingBottomFragment.plansLoaderView = onStart.IconCompatParcelizer(view, R.id.plan_loader, "field 'plansLoaderView'");
        deejungTransferLandingBottomFragment.layoutReviewButtonMinMax = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_review_min_max, "field 'layoutReviewButtonMinMax'", ViewGroup.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.button_review_min_max, "method 'handleReviewButtonForMinMaxFlow'");
        this.IconCompatParcelizer = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferLandingBottomFragment.this.handleReviewButtonForMinMaxFlow();
            }
        });
    }

    public final void read() {
        DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deejungTransferLandingBottomFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            deejungTransferLandingBottomFragment.transferAmountView = null;
            deejungTransferLandingBottomFragment.divider = null;
            deejungTransferLandingBottomFragment.remainingLimitLabel = null;
            deejungTransferLandingBottomFragment.transferAmountError = null;
            deejungTransferLandingBottomFragment.installmentsPlansLayout = null;
            deejungTransferLandingBottomFragment.selectPaymentLabel = null;
            deejungTransferLandingBottomFragment.installmentIconImage = null;
            deejungTransferLandingBottomFragment.installmentPlanLabel = null;
            deejungTransferLandingBottomFragment.minMaxLayout = null;
            deejungTransferLandingBottomFragment.minMaxIconImage = null;
            deejungTransferLandingBottomFragment.minMaxPlanLabel = null;
            deejungTransferLandingBottomFragment.txvGeneralTerms = null;
            deejungTransferLandingBottomFragment.planFragmentContainer = null;
            deejungTransferLandingBottomFragment.plansLoaderView = null;
            deejungTransferLandingBottomFragment.layoutReviewButtonMinMax = null;
            this.MediaBrowserCompat$MediaItem.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
