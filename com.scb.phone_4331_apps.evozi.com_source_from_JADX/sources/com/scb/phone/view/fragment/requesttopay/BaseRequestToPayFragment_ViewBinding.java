package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseRequestToPayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseRequestToPayFragment MediaBrowserCompat$CustomActionResultReceiver;

    public BaseRequestToPayFragment_ViewBinding(BaseRequestToPayFragment baseRequestToPayFragment, View view) {
        super(baseRequestToPayFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseRequestToPayFragment;
        baseRequestToPayFragment.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
        baseRequestToPayFragment.customSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner, "field 'customSpinner'", Spinner.class);
        baseRequestToPayFragment.selectionProxyTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selecting_proxy_textview, "field 'selectionProxyTextView'", TextView.class);
        baseRequestToPayFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
        baseRequestToPayFragment.toolbarProxy = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar_proxy_header, "field 'toolbarProxy'", Toolbar.class);
        baseRequestToPayFragment.proxyIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_proxy_id_header, "field 'proxyIdTextView'", TextView.class);
        baseRequestToPayFragment.newAliasLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.new_alias_layout, "field 'newAliasLayout'", RelativeLayout.class);
    }

    public void read() {
        BaseRequestToPayFragment baseRequestToPayFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (baseRequestToPayFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            baseRequestToPayFragment.container = null;
            baseRequestToPayFragment.customSpinner = null;
            baseRequestToPayFragment.selectionProxyTextView = null;
            baseRequestToPayFragment.scrollView = null;
            baseRequestToPayFragment.toolbarProxy = null;
            baseRequestToPayFragment.proxyIdTextView = null;
            baseRequestToPayFragment.newAliasLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
