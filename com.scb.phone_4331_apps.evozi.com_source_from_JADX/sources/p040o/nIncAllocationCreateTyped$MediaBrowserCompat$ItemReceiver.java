package p040o;

import android.graphics.drawable.Drawable;

/* renamed from: o.nIncAllocationCreateTyped$MediaBrowserCompat$ItemReceiver */
class nIncAllocationCreateTyped$MediaBrowserCompat$ItemReceiver extends Drawable.ConstantState {
    private /* synthetic */ nIncAllocationCreateTyped IconCompatParcelizer;

    public final int getChangingConfigurations() {
        return 0;
    }

    private nIncAllocationCreateTyped$MediaBrowserCompat$ItemReceiver(nIncAllocationCreateTyped nincallocationcreatetyped) {
        this.IconCompatParcelizer = nincallocationcreatetyped;
    }

    /* synthetic */ nIncAllocationCreateTyped$MediaBrowserCompat$ItemReceiver(nIncAllocationCreateTyped nincallocationcreatetyped, byte b) {
        this(nincallocationcreatetyped);
    }

    public final Drawable newDrawable() {
        return this.IconCompatParcelizer;
    }
}
