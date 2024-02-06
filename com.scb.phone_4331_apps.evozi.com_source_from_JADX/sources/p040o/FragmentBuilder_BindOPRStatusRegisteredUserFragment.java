package p040o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.FragmentBuilder_BindOPRStatusRegisteredUserFragment */
public final class FragmentBuilder_BindOPRStatusRegisteredUserFragment {
    public int IconCompatParcelizer = -939524096;
    public float MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
    public float MediaBrowserCompat$ItemReceiver = 10.0f;
    public float read = BitmapDescriptorFactory.HUE_RED;
    public int write = 0;

    FragmentBuilder_BindOPRStatusRegisteredUserFragment() {
    }

    public static FragmentBuilder_BindOPRStatusRegisteredUserFragment MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet) {
        FragmentBuilder_BindOPRStatusRegisteredUserFragment fragmentBuilder_BindOPRStatusRegisteredUserFragment = new FragmentBuilder_BindOPRStatusRegisteredUserFragment();
        if (attributeSet == null) {
            return fragmentBuilder_BindOPRStatusRegisteredUserFragment;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CTRSM$MediaBrowserCompat$ItemReceiver.CropView);
        int i = CTRSM$MediaBrowserCompat$ItemReceiver.CropView_cropviewViewportRatio;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = obtainStyledAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED);
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            f2 = 0.0f;
        }
        fragmentBuilder_BindOPRStatusRegisteredUserFragment.MediaBrowserCompat$CustomActionResultReceiver = f2;
        float f3 = 10.0f;
        float f4 = obtainStyledAttributes.getFloat(CTRSM$MediaBrowserCompat$ItemReceiver.CropView_cropviewMaxScale, 10.0f);
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            f3 = f4;
        }
        fragmentBuilder_BindOPRStatusRegisteredUserFragment.MediaBrowserCompat$ItemReceiver = f3;
        float f5 = obtainStyledAttributes.getFloat(CTRSM$MediaBrowserCompat$ItemReceiver.CropView_cropviewMinScale, BitmapDescriptorFactory.HUE_RED);
        if (f5 > BitmapDescriptorFactory.HUE_RED) {
            f = f5;
        }
        fragmentBuilder_BindOPRStatusRegisteredUserFragment.read = f;
        fragmentBuilder_BindOPRStatusRegisteredUserFragment.IconCompatParcelizer = obtainStyledAttributes.getColor(CTRSM$MediaBrowserCompat$ItemReceiver.CropView_cropviewViewportOverlayColor, -939524096);
        fragmentBuilder_BindOPRStatusRegisteredUserFragment.write = obtainStyledAttributes.getDimensionPixelSize(CTRSM$MediaBrowserCompat$ItemReceiver.CropView_cropviewViewportOverlayPadding, 0);
        obtainStyledAttributes.recycle();
        return fragmentBuilder_BindOPRStatusRegisteredUserFragment;
    }
}
