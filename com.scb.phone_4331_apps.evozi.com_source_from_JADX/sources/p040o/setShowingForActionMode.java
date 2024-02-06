package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setShowingForActionMode */
public class setShowingForActionMode {
    private static final int[] read = {16843067, 16843068};
    private final ProgressBar MediaBrowserCompat$CustomActionResultReceiver;
    private Bitmap write;

    public setShowingForActionMode(ProgressBar progressBar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = progressBar;
    }

    public void IconCompatParcelizer(AttributeSet attributeSet, int i) {
        Context context = this.MediaBrowserCompat$CustomActionResultReceiver.getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, read, i, 0));
        Drawable IconCompatParcelizer = mediaDescriptionCompat.IconCompatParcelizer(0);
        if (IconCompatParcelizer != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.setIndeterminateDrawable(read(IconCompatParcelizer));
        }
        Drawable IconCompatParcelizer2 = mediaDescriptionCompat.IconCompatParcelizer(1);
        if (IconCompatParcelizer2 != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.setProgressDrawable(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, false));
        }
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    private Drawable MediaBrowserCompat$ItemReceiver(Drawable drawable, boolean z) {
        if (drawable instanceof LinearLayoutCompat) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) drawable;
            Drawable MediaBrowserCompat$ItemReceiver = linearLayoutCompat.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver != null) {
                linearLayoutCompat.write(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = MediaBrowserCompat$ItemReceiver(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.write == null) {
                this.write = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(read());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable read(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(animationDrawable.getFrame(i), true);
            MediaBrowserCompat$ItemReceiver.setLevel(10000);
            animationDrawable2.addFrame(MediaBrowserCompat$ItemReceiver, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private Shape read() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    public Bitmap IconCompatParcelizer() {
        return this.write;
    }
}
