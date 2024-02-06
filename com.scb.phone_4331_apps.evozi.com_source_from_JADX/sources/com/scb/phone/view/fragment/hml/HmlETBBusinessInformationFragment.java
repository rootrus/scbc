package com.scb.phone.view.fragment.hml;

import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onGetStartedClick;

public final class HmlETBBusinessInformationFragment extends HmlBusinessInformationFragment {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void write() {
        ProgressStateBar progressStateBar = this.breadcrumbs;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar.setVisibility(8);
    }
}
