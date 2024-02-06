package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void read(AttributeSet attributeSet) {
        super.read(attributeSet);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            View view = constraintLayout.MediaBrowserCompat$ItemReceiver.get(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 21) {
                    view.setElevation(elevation);
                }
            }
        }
    }

    public final void read() {
        ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) getLayoutParams();
        constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo.IconCompatParcelizer(0);
        constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo.MediaBrowserCompat$CustomActionResultReceiver(0);
    }
}
