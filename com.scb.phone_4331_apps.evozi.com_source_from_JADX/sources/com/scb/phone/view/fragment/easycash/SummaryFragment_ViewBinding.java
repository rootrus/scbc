package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private SummaryFragment write;

    public SummaryFragment_ViewBinding(final SummaryFragment summaryFragment, View view) {
        super(summaryFragment, view);
        this.write = summaryFragment;
        summaryFragment.labelOne = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_one, "field 'labelOne'", CustomEasyCashSectionLabel.class);
        summaryFragment.contentOne = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_one, "field 'contentOne'", CustomSeparatedViews.class);
        summaryFragment.labelTwo = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_two, "field 'labelTwo'", CustomEasyCashSectionLabel.class);
        summaryFragment.contentTwo = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_two, "field 'contentTwo'", CustomSeparatedViews.class);
        summaryFragment.labelThree = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_three, "field 'labelThree'", CustomEasyCashSectionLabel.class);
        summaryFragment.contentThree = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_three, "field 'contentThree'", CustomSeparatedViews.class);
        summaryFragment.disclaimerHeader = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_header, "field 'disclaimerHeader'", CustomEasyCashSectionLabel.class);
        summaryFragment.disclaimerDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_description, "field 'disclaimerDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.confirm_button, "method 'onConfirmButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SummaryFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        SummaryFragment summaryFragment = this.write;
        if (summaryFragment != null) {
            this.write = null;
            summaryFragment.labelOne = null;
            summaryFragment.contentOne = null;
            summaryFragment.labelTwo = null;
            summaryFragment.contentTwo = null;
            summaryFragment.labelThree = null;
            summaryFragment.contentThree = null;
            summaryFragment.disclaimerHeader = null;
            summaryFragment.disclaimerDescription = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
