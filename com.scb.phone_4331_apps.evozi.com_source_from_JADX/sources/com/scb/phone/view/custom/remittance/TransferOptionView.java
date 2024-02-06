package com.scb.phone.view.custom.remittance;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.C3085x7c929f5b;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getViewModelStore;
import p040o.onGetStartedClick;

public final class TransferOptionView extends LinearLayout {
    @BindView
    public ConstraintLayout clTransfer;
    @BindView
    public ImageView ivTransfer;
    @BindView
    public TextView tvTransfer;

    public TransferOptionView(Context context) {
        super(context);
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f83682131493594, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setClTransfer(ConstraintLayout constraintLayout) {
        onGetStartedClick.write((Object) constraintLayout, "<set-?>");
        this.clTransfer = constraintLayout;
    }

    public final void setTvTransfer(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvTransfer = textView;
    }

    public final void setIvTransfer(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.ivTransfer = imageView;
    }

    public final void setChannel(C3085x7c929f5b.C30861 r5, FundFactSheetActivity<? super C3085x7c929f5b.C30861, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) r5, "channelDisplay");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onClick");
        ConstraintLayout constraintLayout = this.clTransfer;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clTransfer");
        }
        constraintLayout.setVisibility(0);
        getViewModelStore<Drawable> MediaBrowserCompat$ItemReceiver = Glide.MediaBrowserCompat$ItemReceiver(getContext()).MediaBrowserCompat$ItemReceiver(r5.write);
        ImageView imageView = this.ivTransfer;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivTransfer");
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(imageView);
        TextView textView = this.tvTransfer;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTransfer");
        }
        textView.setText(r5.MediaBrowserCompat$SearchResultReceiver);
        ConstraintLayout constraintLayout2 = this.clTransfer;
        if (constraintLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clTransfer");
        }
        constraintLayout2.setOnClickListener(new read(fundFactSheetActivity, r5));
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ C3085x7c929f5b.C30861 MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FundFactSheetActivity read;

        read(FundFactSheetActivity fundFactSheetActivity, C3085x7c929f5b.C30861 r2) {
            this.read = fundFactSheetActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = r2;
        }

        public final void onClick(View view) {
            this.read.invoke(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
