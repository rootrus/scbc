package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.List;
import p040o.RestrictedComponentContainer;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomSeparatedViews extends LinearLayout {
    @BindView
    public LinearLayout items;

    public CustomSeparatedViews(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomSeparatedViews(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public CustomSeparatedViews(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84712131493698, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomSeparatedViews, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            ButterKnife.IconCompatParcelizer(this);
            if (z) {
                this.items.setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
            } else {
                this.items.setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f70982131100254));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void IconCompatParcelizer(List<View> list) {
        MediaBrowserCompat$CustomActionResultReceiver(list, R.layout.f84732131493700);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<View> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.items.addView(list.get(i2));
            if (i2 < list.size() - 1) {
                inflate(getContext(), i, this.items);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<RestrictedComponentContainer> list) {
        IconCompatParcelizer(list, R.layout.f84732131493700);
    }

    public final void IconCompatParcelizer(List<RestrictedComponentContainer> list, int i) {
        this.items.removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null) {
                this.items.addView(new CustomInfoItem(getContext(), list.get(i2)));
                if (i2 < list.size() - 1) {
                    inflate(getContext(), i, this.items);
                }
            }
        }
    }
}
