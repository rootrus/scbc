package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.renderscript.Allocation;
import androidx.renderscript.Element;
import androidx.renderscript.Matrix3f;
import androidx.renderscript.RenderScript;
import androidx.renderscript.ScriptIntrinsicBlur;
import androidx.renderscript.ScriptIntrinsicColorMatrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.FragmentBuilder_BindHmlBusinessAddressFragment */
public final class FragmentBuilder_BindHmlBusinessAddressFragment {
    private static final float[] MediaBrowserCompat$ItemReceiver = {0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f};

    public static Bitmap write(Context context, Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, false);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(8.0f);
        ScriptIntrinsicColorMatrix create3 = ScriptIntrinsicColorMatrix.create(create, Element.U8_4(create));
        create3.setColorMatrix(new Matrix3f(MediaBrowserCompat$ItemReceiver));
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        create3.forEach(createTyped, createTyped);
        createTyped.copyTo(createScaledBitmap);
        return createScaledBitmap;
    }
}
