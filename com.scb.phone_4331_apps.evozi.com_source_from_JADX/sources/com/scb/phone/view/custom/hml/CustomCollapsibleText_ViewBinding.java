package com.scb.phone.view.custom.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class CustomCollapsibleText_ViewBinding implements Unbinder {
    private CustomCollapsibleText MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public CustomCollapsibleText_ViewBinding(final CustomCollapsibleText customCollapsibleText, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customCollapsibleText;
        customCollapsibleText.contentText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_content, "field 'contentText'", TextView.class);
        customCollapsibleText.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleText'", TextView.class);
        customCollapsibleText.arrowImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_arrow, "field 'arrowImage'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.cl_expand_button, "method 'onExpandClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomCollapsibleText.this.onExpandClicked();
            }
        });
    }

    public final void read() {
        CustomCollapsibleText customCollapsibleText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customCollapsibleText != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customCollapsibleText.contentText = null;
            customCollapsibleText.titleText = null;
            customCollapsibleText.arrowImage = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
