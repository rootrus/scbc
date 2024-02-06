package com.scb.phone.view.custom.investment.onboarding;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomTextViewNavigation_ViewBinding implements Unbinder {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CustomTextViewNavigation MediaBrowserCompat$ItemReceiver;

    public CustomTextViewNavigation_ViewBinding(final CustomTextViewNavigation customTextViewNavigation, View view) {
        this.MediaBrowserCompat$ItemReceiver = customTextViewNavigation;
        customTextViewNavigation.labelTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'labelTitle'", TextView.class);
        customTextViewNavigation.textViewDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_view_description, "field 'textViewDesc'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.layout_detail_navigation, "field 'layoutDetailNavigation' and method 'onClickDetailNavigation'");
        customTextViewNavigation.layoutDetailNavigation = (RelativeLayout) onStart.write(IconCompatParcelizer, R.id.layout_detail_navigation, "field 'layoutDetailNavigation'", RelativeLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomTextViewNavigation.this.onClickDetailNavigation();
            }
        });
    }

    public final void read() {
        CustomTextViewNavigation customTextViewNavigation = this.MediaBrowserCompat$ItemReceiver;
        if (customTextViewNavigation != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customTextViewNavigation.labelTitle = null;
            customTextViewNavigation.textViewDesc = null;
            customTextViewNavigation.layoutDetailNavigation = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
