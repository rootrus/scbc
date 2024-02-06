package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import p040o.getSupportImageTintList;
import p040o.setSupportButtonTintMode;

public class Barrier extends ConstraintHelper {
    public int MediaBrowserCompat$ItemReceiver;
    private int MediaMetadataCompat;
    public setSupportButtonTintMode write;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public void setType(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaMetadataCompat = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            if (i2 == 5) {
                this.MediaMetadataCompat = 0;
            } else if (i2 == 6) {
                this.MediaMetadataCompat = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.MediaBrowserCompat$ItemReceiver;
                if (i3 == 5) {
                    this.MediaMetadataCompat = 1;
                } else if (i3 == 6) {
                    this.MediaMetadataCompat = 0;
                }
            } else {
                int i4 = this.MediaBrowserCompat$ItemReceiver;
                if (i4 == 5) {
                    this.MediaMetadataCompat = 0;
                } else if (i4 == 6) {
                    this.MediaMetadataCompat = 1;
                }
            }
        }
        this.write.write = this.MediaMetadataCompat;
    }

    /* access modifiers changed from: protected */
    public final void read(AttributeSet attributeSet) {
        super.read(attributeSet);
        this.write = new setSupportButtonTintMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.write.IconCompatParcelizer = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.read = this.write;
        write();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.write.IconCompatParcelizer = z;
    }
}
