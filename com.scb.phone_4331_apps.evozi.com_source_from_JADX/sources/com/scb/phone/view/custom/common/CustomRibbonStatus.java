package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;

public final class CustomRibbonStatus extends ConstraintLayout {
    private String IconCompatParcelizer;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ImageView ivIcon;
    @BindView
    public TextView tvAction;
    @BindView
    public TextView tvContent;
    private String write;

    public final void setIvIcon(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.ivIcon = imageView;
    }

    public final void setTvContent(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvContent = textView;
    }

    public final void setTvAction(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvAction = textView;
    }

    public CustomRibbonStatus(Context context) {
        super(context);
        IconCompatParcelizer((AttributeSet) null);
    }

    public CustomRibbonStatus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        IconCompatParcelizer(attributeSet);
    }

    public CustomRibbonStatus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        IconCompatParcelizer(attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private final void IconCompatParcelizer(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(R.layout.f84652131493692, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomRibbonStatus, 0, 0);
            try {
                Resources resources = getResources();
                int resourceId = obtainStyledAttributes.getResourceId(2, R.drawable.ic_paid);
                Context context = getContext();
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                Drawable drawable = resources.getDrawable(resourceId, context.getTheme());
                onGetStartedClick.IconCompatParcelizer((Object) drawable, "resources.getDrawable(\n …           context.theme)");
                this.MediaBrowserCompat$CustomActionResultReceiver = drawable;
                String string = obtainStyledAttributes.getString(1);
                String str = "";
                if (string == null) {
                    string = str;
                }
                this.write = string;
                String string2 = obtainStyledAttributes.getString(0);
                if (string2 != null) {
                    str = string2;
                }
                this.IconCompatParcelizer = str;
                obtainStyledAttributes.recycle();
                MediaBrowserCompat$ItemReceiver();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        ImageView imageView = this.ivIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivIcon");
        }
        Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("icon");
        }
        imageView.setImageDrawable(drawable);
        TextView textView = this.tvContent;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvContent");
        }
        String str = this.write;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("content");
        }
        textView.setText(str);
        TextView textView2 = this.tvAction;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAction");
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("action");
        }
        textView2.setText(str2);
    }

    public final void setIcon(Drawable drawable) {
        onGetStartedClick.write((Object) drawable, "icon");
        ImageView imageView = this.ivIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivIcon");
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setContent(String str) {
        onGetStartedClick.write((Object) str, "content");
        TextView textView = this.tvContent;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvContent");
        }
        textView.setText(str);
    }

    public final void setAction(String str) {
        onGetStartedClick.write((Object) str, "action");
        TextView textView = this.tvAction;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAction");
        }
        textView.setText(str);
    }

    public final void setActionListener(View.OnClickListener onClickListener) {
        onGetStartedClick.write((Object) onClickListener, "event");
        TextView textView = this.tvAction;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAction");
        }
        textView.setOnClickListener(onClickListener);
    }
}
