package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.initiateEkycRegistration;

public class BubbleSelector extends FrameLayout {
    public read MediaBrowserCompat$ItemReceiver;
    @BindView
    Button button;
    public boolean read;
    public String write;

    public interface read {
        void write(String str, boolean z);
    }

    public BubbleSelector(Context context) {
        this(context, (AttributeSet) null);
    }

    public BubbleSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public BubbleSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.read = false;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81122131493338, this, true);
        ButterKnife.IconCompatParcelizer(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.BubbleSelector, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(0);
            if (string2 != null) {
                setKey(string2);
            }
            if (string != null) {
                this.button.setText(string);
            }
            obtainStyledAttributes.recycle();
            this.button.setOnClickListener(new initiateEkycRegistration(this));
            setSelected(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setKey(String str) {
        this.write = str;
    }

    public void setSelected(boolean z) {
        this.read = z;
        this.button.setSelected(z);
        setTextColor(getResources().getColor(z ? R.color.f71012131100257 : R.color.f67252131099881));
    }

    public void setTextColor(int i) {
        this.button.setTextColor(i);
    }

    public boolean isSelected() {
        return this.read;
    }
}
