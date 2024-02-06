package com.scb.phone.view.custom.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import java.util.List;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getOrderChequeVerification;

public class CustomKeypad extends LinearLayout {
    private getOrderChequeVerification MediaBrowserCompat$CustomActionResultReceiver;
    @BindViews
    List<View> buttons;
    @BindViews
    List<View> lines;
    private boolean write;

    public CustomKeypad(Context context) {
        super(context);
        IconCompatParcelizer(context, (AttributeSet) null);
    }

    public CustomKeypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        IconCompatParcelizer(context, attributeSet);
    }

    public CustomKeypad(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        IconCompatParcelizer(context, attributeSet);
    }

    private void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomKeypad, 0, 0);
        this.write = obtainStyledAttributes.getBoolean(0, false);
        inflate(getContext(), this.write ? R.layout.f84012131493627 : R.layout.f84002131493626, this);
        ButterKnife.IconCompatParcelizer(this);
        setEnabledLines(false);
        obtainStyledAttributes.recycle();
    }

    public void setKeypadListener(getOrderChequeVerification getorderchequeverification) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getorderchequeverification;
    }

    public void setEnabledLines(boolean z) {
        for (View visibility : this.lines) {
            visibility.setVisibility(z ? 0 : 8);
        }
        TypedValue typedValue = new TypedValue();
        int i = R.drawable.ripple_selector;
        if (z) {
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            i = typedValue.resourceId;
        }
        for (View backgroundResource : this.buttons) {
            backgroundResource.setBackgroundResource(i);
        }
    }

    @OnClick
    public void onNumberClick(Button button) {
        getOrderChequeVerification getorderchequeverification = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getorderchequeverification != null) {
            getorderchequeverification.read(button.getText().charAt(0));
        }
    }

    @OnClick
    public void onDelete() {
        getOrderChequeVerification getorderchequeverification = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getorderchequeverification != null) {
            getorderchequeverification.read();
        }
    }
}
