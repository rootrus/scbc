package com.scb.phone.view.fragment.requesttopay;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.view.fragment.transferandpay.BaseReviewFragment;
import p040o.setUuidFromUtf8Bytes;

public class RtpScreenshotFragment extends BaseReviewFragment {
    @BindView
    TextView rtpRequestNote;
    @BindView
    LinearLayout rtpRequestNoteLayout;

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, View view, Context context) {
        super.MediaBrowserCompat$ItemReceiver(setuuidfromutf8bytes, view, context);
        this.customTarget.setAddFavoriteButtonVisible(false);
        this.userNote.setVisibility(8);
        this.billerNote.setVisibility(8);
        if (!TextUtils.isEmpty(setuuidfromutf8bytes.setForceShowIcon)) {
            this.fullDivider.setVisibility(8);
            this.rtpRequestNoteLayout.setVisibility(0);
            this.rtpRequestNote.setText(setuuidfromutf8bytes.setForceShowIcon);
        }
    }
}
