package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomMovieTicket_ViewBinding implements Unbinder {
    private CustomMovieTicket MediaBrowserCompat$ItemReceiver;

    public CustomMovieTicket_ViewBinding(CustomMovieTicket customMovieTicket, View view) {
        this.MediaBrowserCompat$ItemReceiver = customMovieTicket;
        customMovieTicket.qrCode = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image_view, "field 'qrCode'", ImageView.class);
        customMovieTicket.poster = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.poster_image_view, "field 'poster'", ImageView.class);
        customMovieTicket.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'title'", TextView.class);
        customMovieTicket.cinemaLocation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cinema_location_text_view, "field 'cinemaLocation'", TextView.class);
        customMovieTicket.showtime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.showtime_text_view, "field 'showtime'", TextView.class);
        customMovieTicket.cinemaNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cinema_number_text_view, "field 'cinemaNumber'", TextView.class);
        customMovieTicket.seat = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.seat_text_view, "field 'seat'", TextView.class);
        customMovieTicket.bookingId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.booking_id_text_view, "field 'bookingId'", TextView.class);
    }

    public final void read() {
        CustomMovieTicket customMovieTicket = this.MediaBrowserCompat$ItemReceiver;
        if (customMovieTicket != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customMovieTicket.qrCode = null;
            customMovieTicket.poster = null;
            customMovieTicket.title = null;
            customMovieTicket.cinemaLocation = null;
            customMovieTicket.showtime = null;
            customMovieTicket.cinemaNumber = null;
            customMovieTicket.seat = null;
            customMovieTicket.bookingId = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
