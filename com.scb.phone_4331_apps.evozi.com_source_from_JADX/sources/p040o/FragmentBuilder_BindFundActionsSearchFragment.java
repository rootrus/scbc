package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.picasso.Picasso;

/* renamed from: o.FragmentBuilder_BindFundActionsSearchFragment */
final class FragmentBuilder_BindFundActionsSearchFragment extends BitmapDrawable {
    private static final Paint MediaBrowserCompat$ItemReceiver = new Paint();
    private final boolean IconCompatParcelizer;
    private final float MediaBrowserCompat$CustomActionResultReceiver;
    private final Picasso.read MediaBrowserCompat$SearchResultReceiver;
    private Drawable MediaMetadataCompat;
    private long RatingCompat;
    private boolean read;
    private int write = 255;

    static void MediaBrowserCompat$ItemReceiver(ImageView imageView, Context context, Bitmap bitmap, Picasso.read read2, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new FragmentBuilder_BindFundActionsSearchFragment(context, bitmap, drawable, read2, z, z2));
    }

    static void write(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    private FragmentBuilder_BindFundActionsSearchFragment(Context context, Bitmap bitmap, Drawable drawable, Picasso.read read2, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = context.getResources().getDisplayMetrics().density;
        this.MediaBrowserCompat$SearchResultReceiver = read2;
        if (read2 != Picasso.read.MEMORY && !z) {
            this.MediaMetadataCompat = drawable;
            this.read = true;
            this.RatingCompat = SystemClock.uptimeMillis();
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.read) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.RatingCompat)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.read = false;
                this.MediaMetadataCompat = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.MediaMetadataCompat;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.write) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.write);
            }
        }
        if (this.IconCompatParcelizer) {
            MediaBrowserCompat$ItemReceiver.setColor(-1);
            canvas.drawPath(MediaBrowserCompat$CustomActionResultReceiver((int) (this.MediaBrowserCompat$CustomActionResultReceiver * 16.0f)), MediaBrowserCompat$ItemReceiver);
            MediaBrowserCompat$ItemReceiver.setColor(this.MediaBrowserCompat$SearchResultReceiver.debugColor);
            canvas.drawPath(MediaBrowserCompat$CustomActionResultReceiver((int) (this.MediaBrowserCompat$CustomActionResultReceiver * 15.0f)), MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void setAlpha(int i) {
        this.write = i;
        Drawable drawable = this.MediaMetadataCompat;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.MediaMetadataCompat;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.MediaMetadataCompat;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    private static Path MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f = (float) i;
        path.lineTo(f, BitmapDescriptorFactory.HUE_RED);
        path.lineTo(BitmapDescriptorFactory.HUE_RED, f);
        return path;
    }
}
