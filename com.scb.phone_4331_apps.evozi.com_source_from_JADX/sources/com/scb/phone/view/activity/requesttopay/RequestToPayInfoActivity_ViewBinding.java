package com.scb.phone.view.activity.requesttopay;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class RequestToPayInfoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RequestToPayInfoActivity MediaBrowserCompat$CustomActionResultReceiver;

    public RequestToPayInfoActivity_ViewBinding(RequestToPayInfoActivity requestToPayInfoActivity, View view) {
        super(requestToPayInfoActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = requestToPayInfoActivity;
        requestToPayInfoActivity.mBenefitsParagraph = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.web_view_request_money, "field 'mBenefitsParagraph'", WebView.class);
    }

    public final void read() {
        RequestToPayInfoActivity requestToPayInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (requestToPayInfoActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            requestToPayInfoActivity.mBenefitsParagraph = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
