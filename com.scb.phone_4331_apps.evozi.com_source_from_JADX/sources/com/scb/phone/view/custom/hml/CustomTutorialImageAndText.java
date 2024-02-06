package com.scb.phone.view.custom.hml;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import org.bouncycastle.i18n.MessageBundle;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;

public final class CustomTutorialImageAndText extends RelativeLayout {
    @BindView
    public ImageView imageView;
    @BindView
    public TextView textView;

    public final void setImageView(ImageView imageView2) {
        onGetStartedClick.write((Object) imageView2, "<set-?>");
        this.imageView = imageView2;
    }

    public final void setTextView(TextView textView2) {
        onGetStartedClick.write((Object) textView2, "<set-?>");
        this.textView = textView2;
    }

    public CustomTutorialImageAndText(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver((AttributeSet) null);
    }

    public CustomTutorialImageAndText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver(attributeSet);
    }

    public CustomTutorialImageAndText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver(attributeSet);
    }

    private void MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet) {
        ButterKnife.IconCompatParcelizer(this, LayoutInflater.from(getContext()).inflate(R.layout.f85132131493740, this, true));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomTutorialImageAndText);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                onGetStartedClick.IconCompatParcelizer((Object) string, "description");
                setText(string);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                onGetStartedClick.IconCompatParcelizer((Object) drawable, "image");
                setImage(drawable);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setText(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView2 = this.textView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textView");
        }
        textView2.setText(str);
    }

    public final void setImage(int i) {
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageView");
        }
        imageView2.setImageResource(i);
    }

    public final void setImage(String str, int i) {
        onGetStartedClick.write((Object) str, "imgUrl");
        if (!TextUtils.isEmpty(str)) {
            getContext();
            ImageView imageView2 = this.imageView;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageView");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(i, imageView2, str);
        }
    }

    public final void setImage(Drawable drawable) {
        onGetStartedClick.write((Object) drawable, "imgDrawable");
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageView");
        }
        imageView2.setImageDrawable(drawable);
    }
}
