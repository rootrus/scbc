package p059me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* renamed from: me.relex.circleindicator.SnackbarBehavior */
public class SnackbarBehavior extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<BaseCircleIndicator> {
    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, View view, View view2) {
        BaseCircleIndicator baseCircleIndicator = (BaseCircleIndicator) view;
        List<View> write = coordinatorLayout.write((View) baseCircleIndicator);
        int size = write.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < size; i++) {
            View view3 = write.get(i);
            if ((view3 instanceof Snackbar.SnackbarLayout) && coordinatorLayout.MediaBrowserCompat$ItemReceiver((View) baseCircleIndicator, view3)) {
                f = Math.min(f, view3.getTranslationY() - ((float) view3.getHeight()));
            }
        }
        baseCircleIndicator.setTranslationY(f);
        return true;
    }

    public SnackbarBehavior() {
    }

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final /* bridge */ /* synthetic */ boolean read(View view, View view2) {
        return view2 instanceof Snackbar.SnackbarLayout;
    }
}
