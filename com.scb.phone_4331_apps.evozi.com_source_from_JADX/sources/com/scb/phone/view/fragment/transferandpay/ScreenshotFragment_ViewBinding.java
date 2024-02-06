package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomMovieTicket;
import p040o.onStart;

public class ScreenshotFragment_ViewBinding extends BaseSuccessFragment_ViewBinding {
    private ScreenshotFragment MediaBrowserCompat$CustomActionResultReceiver;

    public ScreenshotFragment_ViewBinding(ScreenshotFragment screenshotFragment, View view) {
        super(screenshotFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = screenshotFragment;
        screenshotFragment.movieTicket = (CustomMovieTicket) onStart.IconCompatParcelizer(view, R.id.movie_ticket, "field 'movieTicket'", CustomMovieTicket.class);
        screenshotFragment.ticketDivider = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.ticket_divider, "field 'ticketDivider'", ViewGroup.class);
        screenshotFragment.leftCircleDivider = (ImageView) onStart.IconCompatParcelizer(view, R.id.left_circle_divider, "field 'leftCircleDivider'", ImageView.class);
        screenshotFragment.rightCircleDivider = (ImageView) onStart.IconCompatParcelizer(view, R.id.right_circle_divider, "field 'rightCircleDivider'", ImageView.class);
        screenshotFragment.additionalRecyclerView = (RecyclerView) onStart.IconCompatParcelizer(view, R.id.additional_recycler_view, "field 'additionalRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        ScreenshotFragment screenshotFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (screenshotFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            screenshotFragment.movieTicket = null;
            screenshotFragment.ticketDivider = null;
            screenshotFragment.leftCircleDivider = null;
            screenshotFragment.rightCircleDivider = null;
            screenshotFragment.additionalRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
