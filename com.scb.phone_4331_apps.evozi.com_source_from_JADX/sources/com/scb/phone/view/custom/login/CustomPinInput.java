package com.scb.phone.view.custom.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.MerchantService;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getOrderChequeConfirm;
import p040o.getOrderChequeVerification;
import p040o.getStopChequeConfirm;
import p040o.show;

public class CustomPinInput extends LinearLayout implements getOrderChequeVerification {
    public boolean IconCompatParcelizer;
    public StringBuilder MediaBrowserCompat$CustomActionResultReceiver = new StringBuilder();
    public MerchantService MediaBrowserCompat$ItemReceiver;
    @BindView
    ImageView imageInput1;
    @BindView
    ImageView imageInput2;
    @BindView
    ImageView imageInput3;
    @BindView
    ImageView imageInput4;
    @BindView
    ImageView imageInput5;
    @BindView
    ImageView imageInput6;
    private Handler read = new Handler();
    private ImageView[] write;

    public CustomPinInput(Context context) {
        super(context);
        read(context, (AttributeSet) null);
    }

    public CustomPinInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        read(context, attributeSet);
    }

    public CustomPinInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        read(context, attributeSet);
    }

    private void read(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomPinInput, 0, 0);
        this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(0, false);
        inflate(getContext(), this.IconCompatParcelizer ? R.layout.f84342131493660 : R.layout.f84332131493659, this);
        ButterKnife.IconCompatParcelizer(this);
        this.write = new ImageView[]{this.imageInput1, this.imageInput2, this.imageInput3, this.imageInput4, this.imageInput5, this.imageInput6};
        obtainStyledAttributes.recycle();
    }

    public void setPinInputListener(MerchantService merchantService) {
        this.MediaBrowserCompat$ItemReceiver = merchantService;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        StringBuilder sb = this.MediaBrowserCompat$CustomActionResultReceiver;
        sb.delete(0, sb.length());
        show IconCompatParcelizer2 = show.IconCompatParcelizer((T[]) this.write);
        getOrderChequeConfirm getorderchequeconfirm = new getOrderChequeConfirm(this);
        while (IconCompatParcelizer2.IconCompatParcelizer.hasNext()) {
            getorderchequeconfirm.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.IconCompatParcelizer.next());
        }
    }

    public final void read(char c) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.length() < 6) {
            this.MediaBrowserCompat$CustomActionResultReceiver.append(c);
            this.write[this.MediaBrowserCompat$CustomActionResultReceiver.length() - 1].setImageResource(this.IconCompatParcelizer ? R.drawable.shape_pin_filled_white : R.drawable.shape_pin_filled);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.length() == 1) {
                this.MediaBrowserCompat$ItemReceiver.al_();
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.length() == 6 && this.MediaBrowserCompat$ItemReceiver != null) {
                this.read.post(new getStopChequeConfirm(this));
            }
        }
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.length() > 0) {
            int length = this.MediaBrowserCompat$CustomActionResultReceiver.length() - 1;
            this.MediaBrowserCompat$CustomActionResultReceiver.deleteCharAt(length);
            this.write[length].setImageResource(this.IconCompatParcelizer ? R.drawable.shape_pin_empty_white : R.drawable.shape_pin_empty);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.length() == 5) {
                this.MediaBrowserCompat$ItemReceiver.mo13717P_();
            }
        }
    }
}
