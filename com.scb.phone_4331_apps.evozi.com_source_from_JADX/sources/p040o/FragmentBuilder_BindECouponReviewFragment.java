package p040o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;

/* renamed from: o.FragmentBuilder_BindECouponReviewFragment */
public final class FragmentBuilder_BindECouponReviewFragment implements OnDeviceIdExtractor_Factory {
    private final CheckCaptureModule IconCompatParcelizer;
    private final hasApi write;

    public FragmentBuilder_BindECouponReviewFragment() {
    }

    public static Paint MediaBrowserCompat$ItemReceiver(Context context) {
        float applyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(applyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    @HmlPinActivity
    public FragmentBuilder_BindECouponReviewFragment(CheckCaptureModule checkCaptureModule, hasApi hasapi) {
        this.IconCompatParcelizer = checkCaptureModule;
        this.write = hasapi;
    }

    public final DebitCardResetOtpActivity<setMapType> MediaBrowserCompat$ItemReceiver(makeMap makemap) {
        return this.IconCompatParcelizer.IconCompatParcelizer.getMobileList(makemap).map(new zzdh(this.write));
    }
}
