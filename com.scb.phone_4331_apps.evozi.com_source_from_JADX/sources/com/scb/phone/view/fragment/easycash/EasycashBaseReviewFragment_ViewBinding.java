package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class EasycashBaseReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashBaseReviewFragment write;

    public EasycashBaseReviewFragment_ViewBinding(EasycashBaseReviewFragment easycashBaseReviewFragment, View view) {
        super(easycashBaseReviewFragment, view);
        this.write = easycashBaseReviewFragment;
        easycashBaseReviewFragment.sectionLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.section_layout, "field 'sectionLayout'", LinearLayout.class);
        easycashBaseReviewFragment.disclaimerHeader = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_header, "field 'disclaimerHeader'", CustomEasyCashSectionLabel.class);
        easycashBaseReviewFragment.disclaimerDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_description, "field 'disclaimerDescription'", TextView.class);
        easycashBaseReviewFragment.btnSubmit = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.confirm_button, "field 'btnSubmit'", Button.class);
    }

    public void read() {
        EasycashBaseReviewFragment easycashBaseReviewFragment = this.write;
        if (easycashBaseReviewFragment != null) {
            this.write = null;
            easycashBaseReviewFragment.sectionLayout = null;
            easycashBaseReviewFragment.disclaimerHeader = null;
            easycashBaseReviewFragment.disclaimerDescription = null;
            easycashBaseReviewFragment.btnSubmit = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
