package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class QuickTopUpFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private QuickTopUpFragment MediaBrowserCompat$ItemReceiver;

    public QuickTopUpFragment_ViewBinding(final QuickTopUpFragment quickTopUpFragment, View view) {
        super(quickTopUpFragment, view);
        this.MediaBrowserCompat$ItemReceiver = quickTopUpFragment;
        quickTopUpFragment.mNoFavouritesLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_favourites_linear_layout, "field 'mNoFavouritesLinearLayout'", LinearLayout.class);
        quickTopUpFragment.mFavouritesScrollView = (ScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourites_scroll_view, "field 'mFavouritesScrollView'", ScrollView.class);
        quickTopUpFragment.mFavouriteRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_recycler_view, "field 'mFavouriteRecyclerView'", RecyclerView.class);
        quickTopUpFragment.mReferenceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_view, "field 'mReferenceTextView'", TextView.class);
        quickTopUpFragment.mReferenceLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_label_text_view, "field 'mReferenceLabelTextView'", TextView.class);
        quickTopUpFragment.mRemainingLimitTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'mRemainingLimitTextView'", TextView.class);
        quickTopUpFragment.mAmountProgress = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_view_group_progress, "field 'mAmountProgress'", ViewGroup.class);
        quickTopUpFragment.mAmountRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_recycler_view, "field 'mAmountRecyclerView'", RecyclerView.class);
        quickTopUpFragment.mAmountTextInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_input, "field 'mAmountTextInputLayout'", TextInputLayout.class);
        quickTopUpFragment.mAmountValueEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_value_edit_text, "field 'mAmountValueEditText'", AmountEditText.class);
        quickTopUpFragment.mReviewSetupButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_continue, "field 'mReviewSetupButton'", DefaultButton.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.how_to_quick_top_up_text_view, "method 'onHowToClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuickTopUpFragment.this.onHowToClick();
            }
        });
    }

    public void read() {
        QuickTopUpFragment quickTopUpFragment = this.MediaBrowserCompat$ItemReceiver;
        if (quickTopUpFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            quickTopUpFragment.mNoFavouritesLinearLayout = null;
            quickTopUpFragment.mFavouritesScrollView = null;
            quickTopUpFragment.mFavouriteRecyclerView = null;
            quickTopUpFragment.mReferenceTextView = null;
            quickTopUpFragment.mReferenceLabelTextView = null;
            quickTopUpFragment.mRemainingLimitTextView = null;
            quickTopUpFragment.mAmountProgress = null;
            quickTopUpFragment.mAmountRecyclerView = null;
            quickTopUpFragment.mAmountTextInputLayout = null;
            quickTopUpFragment.mAmountValueEditText = null;
            quickTopUpFragment.mReviewSetupButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
