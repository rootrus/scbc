package com.scb.phone.view.custom.easycash;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomEasycashCommonSuccessView_ViewBinding implements Unbinder {
    private CustomEasycashCommonSuccessView write;

    public CustomEasycashCommonSuccessView_ViewBinding(CustomEasycashCommonSuccessView customEasycashCommonSuccessView, View view) {
        this.write = customEasycashCommonSuccessView;
        customEasycashCommonSuccessView.labelOne = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_one, "field 'labelOne'", CustomEasyCashSectionLabel.class);
        customEasycashCommonSuccessView.contentOne = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_one, "field 'contentOne'", CustomSeparatedViews.class);
        customEasycashCommonSuccessView.labelTwo = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_two, "field 'labelTwo'", CustomEasyCashSectionLabel.class);
        customEasycashCommonSuccessView.contentTwo = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_two, "field 'contentTwo'", CustomSeparatedViews.class);
        customEasycashCommonSuccessView.labelThree = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_three, "field 'labelThree'", CustomEasyCashSectionLabel.class);
        customEasycashCommonSuccessView.contentThree = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_three, "field 'contentThree'", CustomSeparatedViews.class);
    }

    public final void read() {
        CustomEasycashCommonSuccessView customEasycashCommonSuccessView = this.write;
        if (customEasycashCommonSuccessView != null) {
            this.write = null;
            customEasycashCommonSuccessView.labelOne = null;
            customEasycashCommonSuccessView.contentOne = null;
            customEasycashCommonSuccessView.labelTwo = null;
            customEasycashCommonSuccessView.contentTwo = null;
            customEasycashCommonSuccessView.labelThree = null;
            customEasycashCommonSuccessView.contentThree = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
