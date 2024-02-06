package com.scb.phone.view.custom.debitcard;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.MerchantService;
import p040o.getOrderChequeVerification;
import p040o.onGetStartedClick;

public final class CustomPinWithMaxInput extends LinearLayout implements getOrderChequeVerification {
    private ArrayList<ImageView> IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public final StringBuilder MediaBrowserCompat$ItemReceiver;
    @BindView
    public ImageView imageInput1;
    @BindView
    public ImageView imageInput2;
    @BindView
    public ImageView imageInput3;
    @BindView
    public ImageView imageInput4;
    @BindView
    public ImageView imageInput5;
    @BindView
    public ImageView imageInput6;
    private final Handler read;
    /* access modifiers changed from: private */
    public MerchantService write;

    public CustomPinWithMaxInput(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomPinWithMaxInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomPinWithMaxInput(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomPinWithMaxInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        this.MediaBrowserCompat$ItemReceiver = new StringBuilder();
        this.read = new Handler();
        this.MediaBrowserCompat$CustomActionResultReceiver = 6;
        LayoutInflater.from(context).inflate(R.layout.f84332131493659, this, true);
        ButterKnife.IconCompatParcelizer(this);
        ImageView[] imageViewArr = new ImageView[6];
        ImageView imageView = this.imageInput1;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInput1");
        }
        imageViewArr[0] = imageView;
        ImageView imageView2 = this.imageInput2;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInput2");
        }
        imageViewArr[1] = imageView2;
        ImageView imageView3 = this.imageInput3;
        if (imageView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInput3");
        }
        imageViewArr[2] = imageView3;
        ImageView imageView4 = this.imageInput4;
        if (imageView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInput4");
        }
        imageViewArr[3] = imageView4;
        ImageView imageView5 = this.imageInput5;
        if (imageView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInput5");
        }
        imageViewArr[4] = imageView5;
        ImageView imageView6 = this.imageInput6;
        if (imageView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageInput6");
        }
        imageViewArr[5] = imageView6;
        this.IconCompatParcelizer = HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(imageViewArr);
    }

    public final void setImageInput1(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.imageInput1 = imageView;
    }

    public final void setImageInput2(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.imageInput2 = imageView;
    }

    public final void setImageInput3(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.imageInput3 = imageView;
    }

    public final void setImageInput4(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.imageInput4 = imageView;
    }

    public final void setImageInput5(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.imageInput5 = imageView;
    }

    public final void setImageInput6(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.imageInput6 = imageView;
    }

    public final void setPinInputListener(MerchantService merchantService) {
        onGetStartedClick.write((Object) merchantService, "pinInputListener");
        this.write = merchantService;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        StringBuilder sb = this.MediaBrowserCompat$ItemReceiver;
        sb.delete(0, sb.length());
        ArrayList<ImageView> arrayList = this.IconCompatParcelizer;
        if (arrayList != null) {
            for (ImageView imageResource : arrayList) {
                imageResource.setImageResource(R.drawable.shape_pin_empty);
            }
        }
    }

    public final void read(char c) {
        MerchantService merchantService;
        if (this.MediaBrowserCompat$ItemReceiver.length() < this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver.append(c);
            ArrayList<ImageView> arrayList = this.IconCompatParcelizer;
            if (arrayList != null) {
                arrayList.get(this.MediaBrowserCompat$ItemReceiver.length() - 1).setImageResource(R.drawable.shape_pin_filled);
            }
            if (this.MediaBrowserCompat$ItemReceiver.length() == 1 && (merchantService = this.write) != null) {
                merchantService.al_();
            }
            if (this.MediaBrowserCompat$ItemReceiver.length() == this.MediaBrowserCompat$CustomActionResultReceiver && this.write != null) {
                this.read.post(new C8945xfa665e9d(this));
            }
        }
    }

    public final void read() {
        MerchantService merchantService;
        if (this.MediaBrowserCompat$ItemReceiver.length() > 0) {
            int length = this.MediaBrowserCompat$ItemReceiver.length() - 1;
            this.MediaBrowserCompat$ItemReceiver.deleteCharAt(length);
            ArrayList<ImageView> arrayList = this.IconCompatParcelizer;
            if (arrayList != null) {
                arrayList.get(length).setImageResource(R.drawable.shape_pin_empty);
            }
            if (this.MediaBrowserCompat$ItemReceiver.length() == this.MediaBrowserCompat$CustomActionResultReceiver - 1 && (merchantService = this.write) != null) {
                merchantService.mo13717P_();
            }
        }
    }

    public final void setMaximumInput(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        ArrayList<ImageView> arrayList = this.IconCompatParcelizer;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 < this.MediaBrowserCompat$CustomActionResultReceiver) {
                    ImageView imageView = arrayList.get(i2);
                    onGetStartedClick.IconCompatParcelizer((Object) imageView, "it.get(i)");
                    imageView.setVisibility(0);
                } else {
                    ImageView imageView2 = arrayList.get(i2);
                    onGetStartedClick.IconCompatParcelizer((Object) imageView2, "it.get(i)");
                    imageView2.setVisibility(8);
                }
            }
        }
        invalidate();
    }
}
