package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import p040o.setPrinter;

/* renamed from: o.setUseDefaultMargins */
public class setUseDefaultMargins extends Drawable implements setPrinter$MediaBrowserCompat$ItemReceiver, Animatable, setDrawerTitle {
    private boolean IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private Paint MediaMetadataCompat;
    private boolean RatingCompat;
    public final write read;
    private Rect write;

    public int getOpacity() {
        return -2;
    }

    public setUseDefaultMargins(Context context, isHidden ishidden, onCreateAnimation<Bitmap> oncreateanimation, int i, int i2, Bitmap bitmap) {
        this(new write(new setPrinter(Glide.IconCompatParcelizer(context), ishidden, i, i2, oncreateanimation, bitmap)));
    }

    setUseDefaultMargins(write write2) {
        this.RatingCompat = true;
        this.MediaBrowserCompat$SearchResultReceiver = -1;
        this.read = write2;
    }

    public void start() {
        this.MediaDescriptionCompat = true;
        this.MediaBrowserCompat$MediaItem = 0;
        if (this.RatingCompat) {
            read();
        }
    }

    public void stop() {
        this.MediaDescriptionCompat = false;
        write();
    }

    private void read() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.read.IconCompatParcelizer.MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem() != 1) {
                if (!this.IconCompatParcelizer) {
                    this.IconCompatParcelizer = true;
                    setPrinter setprinter = this.read.IconCompatParcelizer;
                    if (setprinter.MediaDescriptionCompat) {
                        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                    } else if (!setprinter.read.contains(this)) {
                        boolean isEmpty = setprinter.read.isEmpty();
                        setprinter.read.add(this);
                        if (isEmpty && !setprinter.MediaBrowserCompat$SearchResultReceiver) {
                            setprinter.MediaBrowserCompat$SearchResultReceiver = true;
                            setprinter.MediaDescriptionCompat = false;
                            setprinter.write();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    return;
                }
            }
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    }

    private void write() {
        this.IconCompatParcelizer = false;
        setPrinter setprinter = this.read.IconCompatParcelizer;
        setprinter.read.remove(this);
        if (setprinter.read.isEmpty()) {
            setprinter.MediaBrowserCompat$SearchResultReceiver = false;
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.RatingCompat = z;
            if (!z) {
                write();
            } else if (this.MediaDescriptionCompat) {
                read();
            }
            return super.setVisible(z, z2);
        }
        throw new IllegalArgumentException("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    }

    public int getIntrinsicWidth() {
        return this.read.IconCompatParcelizer.ParcelableVolumeInfo;
    }

    public int getIntrinsicHeight() {
        return this.read.IconCompatParcelizer.MediaMetadataCompat;
    }

    public boolean isRunning() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.write == null) {
                    this.write = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.write);
                this.MediaBrowserCompat$ItemReceiver = false;
            }
            setPrinter setprinter = this.read.IconCompatParcelizer;
            setPrinter.write write2 = setprinter.write;
            if (write2 != null) {
                bitmap = write2.IconCompatParcelizer;
            } else {
                bitmap = setprinter.MediaBrowserCompat$ItemReceiver;
            }
            if (this.write == null) {
                this.write = new Rect();
            }
            Rect rect = this.write;
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.MediaMetadataCompat);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.read;
    }

    /* renamed from: o.setUseDefaultMargins$write */
    public static final class write extends Drawable.ConstantState {
        public final setPrinter IconCompatParcelizer;

        public final int getChangingConfigurations() {
            return 0;
        }

        write(setPrinter setprinter) {
            this.IconCompatParcelizer = setprinter;
        }

        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public final Drawable newDrawable() {
            return new setUseDefaultMargins(this);
        }
    }

    public final void IconCompatParcelizer() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        setPrinter.write write2 = this.read.IconCompatParcelizer.write;
        if ((write2 != null ? write2.MediaBrowserCompat$ItemReceiver : -1) == this.read.IconCompatParcelizer.MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem() - 1) {
            this.MediaBrowserCompat$MediaItem++;
        }
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        if (i != -1 && this.MediaBrowserCompat$MediaItem >= i) {
            stop();
        }
    }

    public void setAlpha(int i) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new Paint(2);
        }
        this.MediaMetadataCompat.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new Paint(2);
        }
        this.MediaMetadataCompat.setColorFilter(colorFilter);
    }
}
