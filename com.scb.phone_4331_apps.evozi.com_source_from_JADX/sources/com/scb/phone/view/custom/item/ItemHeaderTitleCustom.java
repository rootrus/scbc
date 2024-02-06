package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.onGetStartedClick;

public final class ItemHeaderTitleCustom extends ItemTitleCustom {
    public ItemHeaderTitleCustom(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public ItemHeaderTitleCustom(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ItemHeaderTitleCustom(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemHeaderTitleCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81442131493370, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}
