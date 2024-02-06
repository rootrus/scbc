package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import p040o.callTask;

public class ItemSeparatorCustom extends ItemCustom<callTask> {
    public void setUpWithDisplay(callTask calltask) {
    }

    public ItemSeparatorCustom(Context context) {
        super(context);
    }

    public ItemSeparatorCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSeparatorCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81492131493375, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}
