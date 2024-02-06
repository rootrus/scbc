package com.roughike.bottombar;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

class BottomBarBadge extends TextView {
    int read;
    boolean write = false;

    BottomBarBadge(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(BottomBarTab bottomBarTab) {
        AppCompatImageView appCompatImageView = bottomBarTab.MediaBrowserCompat$ItemReceiver;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int max = Math.max(getWidth(), getHeight());
        setX(appCompatImageView.getX() + ((float) (((double) appCompatImageView.getWidth()) / 1.25d)));
        setTranslationY(10.0f);
        if (layoutParams.width != max || layoutParams.height != max) {
            layoutParams.width = max;
            layoutParams.height = max;
            setLayoutParams(layoutParams);
        }
    }
}
