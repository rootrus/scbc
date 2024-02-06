package com.scb.phone.view.fragment.chequemanagement;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import p040o.getUuidUtf8Bytes;

public class ChequeScreenshotFragment extends BaseChequeReviewFragment {
    @BindView
    TextView dateTimeTextView;
    @BindView
    TextView refIdTextView;
    @BindView
    TextView titleSuccessTextView;

    public final void write(getUuidUtf8Bytes getuuidutf8bytes, View view, Context context) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.titleSuccessTextView.setText(getuuidutf8bytes.AlertController$RecycleListView);
        this.refIdTextView.setText(getuuidutf8bytes.MediaSessionCompat$Token);
        this.dateTimeTextView.setText(getuuidutf8bytes.MediaDescriptionCompat);
        super.MediaBrowserCompat$CustomActionResultReceiver(getuuidutf8bytes.PlaybackStateCompat, view, context);
    }
}
