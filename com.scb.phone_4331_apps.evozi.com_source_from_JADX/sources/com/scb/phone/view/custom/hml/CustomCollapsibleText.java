package com.scb.phone.view.custom.hml;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import org.bouncycastle.i18n.MessageBundle;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;

public final class CustomCollapsibleText extends CardView {
    @BindView
    public ImageView arrowImage;
    @BindView
    public TextView contentText;
    @BindView
    public TextView titleText;

    @OnClick
    public final void onExpandClicked() {
        TextView textView = this.contentText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("contentText");
        }
        TextView textView2 = this.contentText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("contentText");
        }
        textView.setVisibility(textView2.getVisibility() == 0 ? 8 : 0);
        write();
    }

    public final void setContentText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.contentText = textView;
    }

    public final void setTitleText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.titleText = textView;
    }

    public final void setArrowImage(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.arrowImage = imageView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCollapsibleText(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        read((AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCollapsibleText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        read(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCollapsibleText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        read(attributeSet);
    }

    private void read(AttributeSet attributeSet) {
        ButterKnife.IconCompatParcelizer(this, LayoutInflater.from(getContext()).inflate(R.layout.f81352131493361, this, true));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomCollapsibleText);
            int i = 0;
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                onGetStartedClick.IconCompatParcelizer((Object) string, "description");
                setText(string);
            }
            String string2 = obtainStyledAttributes.getString(2);
            if (string2 != null) {
                onGetStartedClick.IconCompatParcelizer((Object) string2, MessageBundle.TITLE_ENTRY);
                setTitle(string2);
            }
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            TextView textView = this.contentText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("contentText");
            }
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
            write();
            obtainStyledAttributes.recycle();
        }
    }

    private final void write() {
        ImageView imageView = this.arrowImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("arrowImage");
        }
        TextView textView = this.contentText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("contentText");
        }
        imageView.setImageResource(textView.getVisibility() == 0 ? R.drawable.arrow_up : R.drawable.arrow_down);
    }

    public final void setText(String str) {
        onGetStartedClick.write((Object) str, "description");
        TextView textView = this.contentText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("contentText");
        }
        textView.setText(str);
    }

    public final void setTitle(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.titleText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleText");
        }
        textView.setText(str);
    }
}
