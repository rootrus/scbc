package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomURLEditTextWithButtonView_ViewBinding implements Unbinder {
    private CustomURLEditTextWithButtonView IconCompatParcelizer;

    public CustomURLEditTextWithButtonView_ViewBinding(CustomURLEditTextWithButtonView customURLEditTextWithButtonView, View view) {
        this.IconCompatParcelizer = customURLEditTextWithButtonView;
        customURLEditTextWithButtonView.componentBaseLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_base, "field 'componentBaseLinearLayout'", LinearLayout.class);
        customURLEditTextWithButtonView.urlTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_url_title, "field 'urlTitle'", TextView.class);
        customURLEditTextWithButtonView.urlEt = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_url_field, "field 'urlEt'", EditText.class);
        customURLEditTextWithButtonView.previewBt = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_preview, "field 'previewBt'", Button.class);
        customURLEditTextWithButtonView.urlErrorMsgTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_url_error_msg, "field 'urlErrorMsgTv'", TextView.class);
        customURLEditTextWithButtonView.deleteUrlImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_trash, "field 'deleteUrlImageView'", ImageView.class);
        customURLEditTextWithButtonView.clearButtonImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_clear, "field 'clearButtonImageView'", ImageView.class);
    }

    public final void read() {
        CustomURLEditTextWithButtonView customURLEditTextWithButtonView = this.IconCompatParcelizer;
        if (customURLEditTextWithButtonView != null) {
            this.IconCompatParcelizer = null;
            customURLEditTextWithButtonView.componentBaseLinearLayout = null;
            customURLEditTextWithButtonView.urlTitle = null;
            customURLEditTextWithButtonView.urlEt = null;
            customURLEditTextWithButtonView.previewBt = null;
            customURLEditTextWithButtonView.urlErrorMsgTv = null;
            customURLEditTextWithButtonView.deleteUrlImageView = null;
            customURLEditTextWithButtonView.clearButtonImageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
