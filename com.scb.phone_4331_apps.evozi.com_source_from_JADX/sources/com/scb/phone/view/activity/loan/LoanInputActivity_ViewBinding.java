package com.scb.phone.view.activity.loan;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import p040o.onCreateDialog;
import p040o.onStart;

public class LoanInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private LoanInputActivity MediaBrowserCompat$CustomActionResultReceiver;

    public LoanInputActivity_ViewBinding(final LoanInputActivity loanInputActivity, View view) {
        super(loanInputActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = loanInputActivity;
        loanInputActivity.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        loanInputActivity.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        loanInputActivity.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
        loanInputActivity.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        loanInputActivity.noteLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_layout, "field 'noteLayout'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        loanInputActivity.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LoanInputActivity.this.onReviewButtonClick();
            }
        });
        loanInputActivity.tabAmountSelect = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_amount_select, "field 'tabAmountSelect'", CustomTabLayout.class);
        loanInputActivity.viewPagerAmountSelect = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_amount_select, "field 'viewPagerAmountSelect'", WrapContentViewPager.class);
    }

    public final void read() {
        LoanInputActivity loanInputActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (loanInputActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            loanInputActivity.imageIcon = null;
            loanInputActivity.textTitle = null;
            loanInputActivity.textAccountNumber = null;
            loanInputActivity.noteEditText = null;
            loanInputActivity.noteLayout = null;
            loanInputActivity.buttonReview = null;
            loanInputActivity.tabAmountSelect = null;
            loanInputActivity.viewPagerAmountSelect = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
