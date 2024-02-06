package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.getAllowReturnTransitionOverlap;
import p040o.onGetStartedClick;
import p040o.zzvo;

public final class CustomGiftingView extends LinearLayout {
    @BindView
    public ImageView giftIcon;
    @BindView
    public TextView giftTextView;

    public final void setGiftIcon(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.giftIcon = imageView;
    }

    public final void setGiftTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.giftTextView = textView;
    }

    public CustomGiftingView(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver();
    }

    public CustomGiftingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver();
    }

    public CustomGiftingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver();
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        LayoutInflater.from(getContext()).inflate(R.layout.f81992131493425, this, true);
        ButterKnife.IconCompatParcelizer(this);
        ImageView imageView = this.giftIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("giftIcon");
        }
        imageView.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.f72292131165353);
        ImageView imageView2 = this.giftIcon;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("giftIcon");
        }
        imageView2.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.f72292131165353);
        TextView textView = this.giftTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("giftTextView");
        }
        textView.setText(R.string.transfer_gifting_input_title);
    }

    public final void setLayoutEnabled(boolean z) {
        setEnabled(z);
        setAlpha(z ? 1.0f : 0.6f);
    }

    public static final class IconCompatParcelizer implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ String write;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(String str) {
            this.write = str;
        }

        public final boolean write(Object obj) {
            return !this.write.equals(((zzvo) obj).write);
        }
    }
}
