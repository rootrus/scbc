package com.thunderhead.android.infrastructure.p057ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.ThunderheadRecyclerView */
public final class ThunderheadRecyclerView extends RecyclerView {
    private RecyclerView.read setPrimaryBackground = new RecyclerView.read() {
        public final void write() {
            super.write();
            ThunderheadRecyclerView.this.MediaBrowserCompat$SearchResultReceiver();
        }

        public final void write(int i, int i2) {
            super.write(i, i2);
            ThunderheadRecyclerView.this.MediaBrowserCompat$SearchResultReceiver();
        }

        public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
            super.MediaBrowserCompat$ItemReceiver(i, i2);
            ThunderheadRecyclerView.this.MediaBrowserCompat$SearchResultReceiver();
        }
    };
    private View setStackedBackground;

    public ThunderheadRecyclerView(Context context) {
        super(context);
    }

    public ThunderheadRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThunderheadRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void setEmptyView(View view) {
        this.setStackedBackground = view;
        MediaBrowserCompat$SearchResultReceiver();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.setStackedBackground != null) {
            int i = 0;
            boolean z = this.MediaDescriptionCompat == null || this.MediaDescriptionCompat.IconCompatParcelizer() == 0;
            this.setStackedBackground.setVisibility(z ? 0 : 8);
            if (z) {
                i = 8;
            }
            setVisibility(i);
        }
    }

    public final void setAdapter(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        RecyclerView.IconCompatParcelizer iconCompatParcelizer2 = this.MediaDescriptionCompat;
        super.setAdapter(iconCompatParcelizer);
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer2.IconCompatParcelizer.unregisterObserver(this.setPrimaryBackground);
        }
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer.registerObserver(this.setPrimaryBackground);
        }
    }
}
