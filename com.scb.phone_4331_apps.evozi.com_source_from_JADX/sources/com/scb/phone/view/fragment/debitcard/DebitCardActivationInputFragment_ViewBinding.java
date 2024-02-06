package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.item.ItemIconCustom;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class DebitCardActivationInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardActivationInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public DebitCardActivationInputFragment_ViewBinding(final DebitCardActivationInputFragment debitCardActivationInputFragment, View view) {
        super(debitCardActivationInputFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardActivationInputFragment;
        debitCardActivationInputFragment.rootConstraint = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_constraint, "field 'rootConstraint'", ConstraintLayout.class);
        debitCardActivationInputFragment.cardViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'cardViewPager'", ViewPager.class);
        debitCardActivationInputFragment.cardInputEditText = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.debit_card_input_edit_text, "field 'cardInputEditText'", CustomEditText.class);
        debitCardActivationInputFragment.cardInputError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.debit_card_input_error_text_view, "field 'cardInputError'", TextView.class);
        debitCardActivationInputFragment.accountCustomComponent = (ItemIconCustom) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_custom_view, "field 'accountCustomComponent'", ItemIconCustom.class);
        debitCardActivationInputFragment.circleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.circle_indicator, "field 'circleIndicator'", CircleIndicator.class);
        debitCardActivationInputFragment.emptyStateGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_state, "field 'emptyStateGroup'", Group.class);
        debitCardActivationInputFragment.contentDisplayStateGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_display_state, "field 'contentDisplayStateGroup'", Group.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.activate_button, "field 'activateButton' and method 'onActivateButtonClicked'");
        debitCardActivationInputFragment.activateButton = (Button) onStart.write(IconCompatParcelizer, R.id.activate_button, "field 'activateButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardActivationInputFragment.this.onActivateButtonClicked();
            }
        });
    }

    public final void read() {
        DebitCardActivationInputFragment debitCardActivationInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (debitCardActivationInputFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            debitCardActivationInputFragment.rootConstraint = null;
            debitCardActivationInputFragment.cardViewPager = null;
            debitCardActivationInputFragment.cardInputEditText = null;
            debitCardActivationInputFragment.cardInputError = null;
            debitCardActivationInputFragment.accountCustomComponent = null;
            debitCardActivationInputFragment.circleIndicator = null;
            debitCardActivationInputFragment.emptyStateGroup = null;
            debitCardActivationInputFragment.contentDisplayStateGroup = null;
            debitCardActivationInputFragment.activateButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
