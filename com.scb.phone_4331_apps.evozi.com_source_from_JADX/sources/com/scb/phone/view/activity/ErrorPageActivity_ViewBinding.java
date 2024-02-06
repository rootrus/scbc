package com.scb.phone.view.activity;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ErrorPageActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ErrorPageActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public ErrorPageActivity_ViewBinding(final ErrorPageActivity errorPageActivity, View view) {
        super(errorPageActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = errorPageActivity;
        errorPageActivity.tvErrorPageTile = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_page_title, "field 'tvErrorPageTile'", TextView.class);
        errorPageActivity.tvErrorPageMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_page_msg, "field 'tvErrorPageMsg'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.switch_button, "method 'goToPersonalButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ErrorPageActivity.this.goToPersonalButtonClick();
            }
        });
    }

    public final void read() {
        ErrorPageActivity errorPageActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (errorPageActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            errorPageActivity.tvErrorPageTile = null;
            errorPageActivity.tvErrorPageMsg = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
