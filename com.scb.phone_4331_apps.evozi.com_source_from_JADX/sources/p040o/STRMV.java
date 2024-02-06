package p040o;

import android.graphics.Paint;

/* renamed from: o.STRMV */
public final class STRMV extends addOnSuccessListener$MediaBrowserCompat$ItemReceiver {
    public Paint IconCompatParcelizer;

    public STRMV(Paint paint, FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment) {
        super(paint, fragmentBuilder_BindOthersTabFragment);
        Paint paint2 = new Paint();
        this.IconCompatParcelizer = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.IconCompatParcelizer.setAntiAlias(true);
    }
}
