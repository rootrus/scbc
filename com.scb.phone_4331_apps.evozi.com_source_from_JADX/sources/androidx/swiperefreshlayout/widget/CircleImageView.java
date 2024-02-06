package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.SwitchCompat;
import p040o.setLastBaselineToBottomHeight;

class CircleImageView extends ImageView {
    private Animation.AnimationListener IconCompatParcelizer;
    int read;

    CircleImageView(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (BitmapDescriptorFactory.HUE_RED * f);
        this.read = (int) (3.5f * f);
        if (Build.VERSION.SDK_INT >= 21) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            SwitchCompat.IconCompatParcelizer((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new IconCompatParcelizer(this.read));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.read, (float) i2, (float) i, 503316480);
            int i3 = this.read;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        SwitchCompat.IconCompatParcelizer((View) this, (Drawable) shapeDrawable);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!(Build.VERSION.SDK_INT >= 21)) {
            setMeasuredDimension(getMeasuredWidth() + (this.read << 1), getMeasuredHeight() + (this.read << 1));
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.IconCompatParcelizer = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.IconCompatParcelizer;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.IconCompatParcelizer;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColorRes(int i) {
        setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    class IconCompatParcelizer extends OvalShape {
        private Paint read = new Paint();

        IconCompatParcelizer(int i) {
            CircleImageView.this.read = i;
            read((int) rect().width());
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            read((int) f);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = CircleImageView.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (CircleImageView.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.read);
            canvas.drawCircle(f, height, (float) (width - CircleImageView.this.read), paint);
        }

        private void read(int i) {
            float f = (float) (i / 2);
            this.read.setShader(new RadialGradient(f, f, (float) CircleImageView.this.read, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }
    }
}
