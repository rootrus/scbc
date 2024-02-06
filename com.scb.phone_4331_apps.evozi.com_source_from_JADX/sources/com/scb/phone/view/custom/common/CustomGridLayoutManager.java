package com.scb.phone.view.custom.common;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public class CustomGridLayoutManager extends GridLayoutManager {
    public boolean setExpandedFormat = true;

    public CustomGridLayoutManager(Context context) {
        super(3, 1, false);
    }

    public final boolean read() {
        return this.setExpandedFormat && super.read();
    }
}
