package com.scb.phone.view.custom.investment.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSpinner;
import p040o.onGetStartedClick;

public final class CustomDropdownAwareSpinner extends AppCompatSpinner {
    private read MediaBrowserCompat$CustomActionResultReceiver;
    private boolean read;

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomDropdownAwareSpinner(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomDropdownAwareSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomDropdownAwareSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.read && z) {
            this.read = false;
            read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (read2 != null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    public final void setSpinnerEventsListener(read read2) {
        onGetStartedClick.write((Object) read2, "dropwDownEventListener");
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
    }

    public final boolean performClick() {
        this.read = true;
        return super.performClick();
    }
}
