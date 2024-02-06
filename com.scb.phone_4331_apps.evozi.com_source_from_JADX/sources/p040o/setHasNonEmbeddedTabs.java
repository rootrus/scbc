package p040o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: o.setHasNonEmbeddedTabs */
public class setHasNonEmbeddedTabs {
    private boolean IconCompatParcelizer = false;
    private PorterDuff.Mode MediaBrowserCompat$CustomActionResultReceiver = null;
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private final CompoundButton RatingCompat;
    private boolean read;
    private ColorStateList write = null;

    public setHasNonEmbeddedTabs(CompoundButton compoundButton) {
        this.RatingCompat = compoundButton;
    }

    public void read(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.RatingCompat.getContext().obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton_android_button, 0)) != 0) {
                this.RatingCompat.setButtonDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.RatingCompat.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton_buttonTint)) {
                setTrackDrawable.write(this.RatingCompat, obtainStyledAttributes.getColorStateList(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton_buttonTintMode)) {
                setTrackDrawable.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, setWindowTitle.write(obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void MediaBrowserCompat$ItemReceiver(ColorStateList colorStateList) {
        this.write = colorStateList;
        this.IconCompatParcelizer = true;
        MediaBrowserCompat$ItemReceiver();
    }

    public void read(PorterDuff.Mode mode) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mode;
        this.MediaBrowserCompat$ItemReceiver = true;
        MediaBrowserCompat$ItemReceiver();
    }

    public void write() {
        if (this.read) {
            this.read = false;
            return;
        }
        this.read = true;
        MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver() {
        Drawable MediaBrowserCompat$CustomActionResultReceiver2 = setTrackDrawable.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
            return;
        }
        if (this.IconCompatParcelizer || this.MediaBrowserCompat$ItemReceiver) {
            Drawable mutate = setBaselineAligned.MediaBrowserCompat$MediaItem(MediaBrowserCompat$CustomActionResultReceiver2).mutate();
            if (this.IconCompatParcelizer) {
                setBaselineAligned.read(mutate, this.write);
            }
            if (this.MediaBrowserCompat$ItemReceiver) {
                setBaselineAligned.IconCompatParcelizer(mutate, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.RatingCompat.getDrawableState());
            }
            this.RatingCompat.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = p040o.setTrackDrawable.MediaBrowserCompat$CustomActionResultReceiver(r2.RatingCompat);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int IconCompatParcelizer(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.RatingCompat
            android.graphics.drawable.Drawable r0 = p040o.setTrackDrawable.MediaBrowserCompat$CustomActionResultReceiver(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setHasNonEmbeddedTabs.IconCompatParcelizer(int):int");
    }
}
