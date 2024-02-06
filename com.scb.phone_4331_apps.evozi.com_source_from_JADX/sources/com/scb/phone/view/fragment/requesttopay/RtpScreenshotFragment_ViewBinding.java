package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseReviewFragment_ViewBinding;
import p040o.onStart;

public class RtpScreenshotFragment_ViewBinding extends BaseReviewFragment_ViewBinding {
    private RtpScreenshotFragment IconCompatParcelizer;

    public RtpScreenshotFragment_ViewBinding(RtpScreenshotFragment rtpScreenshotFragment, View view) {
        super(rtpScreenshotFragment, view);
        this.IconCompatParcelizer = rtpScreenshotFragment;
        rtpScreenshotFragment.rtpRequestNoteLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rtp_request_note_layout, "field 'rtpRequestNoteLayout'", LinearLayout.class);
        rtpScreenshotFragment.rtpRequestNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rtp_request_note_description, "field 'rtpRequestNote'", TextView.class);
    }

    public final void read() {
        RtpScreenshotFragment rtpScreenshotFragment = this.IconCompatParcelizer;
        if (rtpScreenshotFragment != null) {
            this.IconCompatParcelizer = null;
            rtpScreenshotFragment.rtpRequestNoteLayout = null;
            rtpScreenshotFragment.rtpRequestNote = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
