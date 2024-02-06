package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.af */
public class C8205af extends LinearLayout {
    public C8205af(Context context) {
        super(context);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setBackgroundColor(0);
        setBackgroundColor(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(progressBar);
    }
}
