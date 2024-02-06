package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.HashMap;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getICheckDeserializerRtti;

public class CustomMovieTicket extends LinearLayout {
    @BindView
    TextView bookingId;
    @BindView
    TextView cinemaLocation;
    @BindView
    TextView cinemaNumber;
    @BindView
    ImageView poster;
    @BindView
    ImageView qrCode;
    @BindView
    TextView seat;
    @BindView
    TextView showtime;
    @BindView
    TextView title;

    public CustomMovieTicket(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f91562131494383, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setPoster(String str) {
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.poster, str);
    }

    public void setTitle(String str) {
        this.title.setText(str);
    }

    public void setCinemaLocation(String str) {
        this.cinemaLocation.setText(str);
    }

    public void setShowtime(String str) {
        this.showtime.setText(str);
    }

    public void setCinemaNumber(String str) {
        this.cinemaNumber.setText(str);
    }

    public void setSeat(String str) {
        this.seat.setText(str);
    }

    public void setBookingId(String str) {
        this.bookingId.setText(str);
    }

    public void setQrCode(String str) {
        Bitmap read = getICheckDeserializerRtti.read(str, 500, 500, new HashMap());
        if (read != null) {
            this.qrCode.setImageBitmap(read);
        }
    }
}
