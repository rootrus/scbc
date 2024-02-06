package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.dismiss */
public class dismiss extends getShowsDialog implements setDrawerTitle {
    final Drawable.Callback IconCompatParcelizer;
    private write MediaBrowserCompat$CustomActionResultReceiver;
    ArrayList<Object> MediaBrowserCompat$ItemReceiver;
    private ArgbEvaluator MediaBrowserCompat$MediaItem;
    private Context MediaDescriptionCompat;
    private Animator.AnimatorListener read;

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    dismiss() {
        this((Context) null, (write) null, (Resources) null);
    }

    private dismiss(Context context) {
        this(context, (write) null, (Resources) null);
    }

    private dismiss(Context context, write write2, Resources resources) {
        this.MediaBrowserCompat$MediaItem = null;
        this.read = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.IconCompatParcelizer = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                dismiss.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                dismiss.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                dismiss.this.unscheduleSelf(runnable);
            }
        };
        this.MediaDescriptionCompat = context;
        if (write2 != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = new write(context, write2, this.IconCompatParcelizer, resources);
        }
    }

    public Drawable mutate() {
        if (this.write != null) {
            this.write.mutate();
        }
        return this;
    }

    public static dismiss MediaBrowserCompat$ItemReceiver(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        dismiss dismiss = new dismiss(context);
        dismiss.inflate(resources, xmlPullParser, attributeSet, theme);
        return dismiss;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.write == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new dismiss$MediaBrowserCompat$CustomActionResultReceiver(this.write.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.write != null) {
            return this.write.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void draw(Canvas canvas) {
        if (this.write != null) {
            this.write.draw(canvas);
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.draw(canvas);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.write.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.write != null) {
            this.write.setBounds(rect);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.write != null) {
            return this.write.setState(iArr);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.write != null) {
            return this.write.setLevel(i);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setLevel(i);
    }

    public int getAlpha() {
        if (this.write != null) {
            return setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.write);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.write != null) {
            this.write.setAlpha(i);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.write != null) {
            this.write.setColorFilter(colorFilter);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.write != null) {
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.write, i);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.write != null) {
            setBaselineAligned.read(this.write, colorStateList);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.write != null) {
            setBaselineAligned.IconCompatParcelizer(this.write, mode);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.write != null) {
            return this.write.setVisible(z, z2);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.write != null) {
            return this.write.isStateful();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.isStateful();
    }

    public int getOpacity() {
        if (this.write != null) {
            return this.write.getOpacity();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.write != null) {
            return this.write.getIntrinsicWidth();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.write != null) {
            return this.write.getIntrinsicHeight();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.write != null) {
            return setBaselineAligned.MediaDescriptionCompat(this.write);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.write != null) {
            setBaselineAligned.read(this.write, z);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        if (this.write != null) {
            setBaselineAligned.write(this.write, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    int[] iArr = DialogFragment.IconCompatParcelizer;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    int resourceId = typedArray.getResourceId(0, 0);
                    if (resourceId != 0) {
                        getTheme MediaBrowserCompat$CustomActionResultReceiver2 = getTheme.MediaBrowserCompat$CustomActionResultReceiver(resources, resourceId, theme);
                        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(false);
                        MediaBrowserCompat$CustomActionResultReceiver2.setCallback(this.IconCompatParcelizer);
                        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != null) {
                            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setCallback((Drawable.Callback) null);
                        }
                        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver2;
                    }
                    typedArray.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, DialogFragment.write);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.MediaDescriptionCompat;
                        if (context != null) {
                            MediaBrowserCompat$CustomActionResultReceiver(string, getDialog.MediaBrowserCompat$ItemReceiver(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.write != null) {
            setBaselineAligned.read(this.write, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.write != null) {
            return setBaselineAligned.write(this.write);
        }
        return false;
    }

    /* renamed from: o.dismiss$write */
    static class write extends Drawable.ConstantState {
        getTheme IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        ArrayList<Animator> MediaBrowserCompat$ItemReceiver;
        setTextAppearance<Animator, String> read;
        AnimatorSet write;

        public write(Context context, write write2, Drawable.Callback callback, Resources resources) {
            if (write2 != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
                getTheme gettheme = write2.IconCompatParcelizer;
                if (gettheme != null) {
                    Drawable.ConstantState constantState = gettheme.getConstantState();
                    if (resources != null) {
                        this.IconCompatParcelizer = (getTheme) constantState.newDrawable(resources);
                    } else {
                        this.IconCompatParcelizer = (getTheme) constantState.newDrawable();
                    }
                    getTheme gettheme2 = (getTheme) this.IconCompatParcelizer.mutate();
                    this.IconCompatParcelizer = gettheme2;
                    gettheme2.setCallback(callback);
                    this.IconCompatParcelizer.setBounds(write2.IconCompatParcelizer.getBounds());
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(false);
                }
                ArrayList<Animator> arrayList = write2.MediaBrowserCompat$ItemReceiver;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.MediaBrowserCompat$ItemReceiver = new ArrayList<>(size);
                    this.read = new setTextAppearance<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = write2.MediaBrowserCompat$ItemReceiver.get(i);
                        Animator clone = animator.clone();
                        String str = write2.read.get(animator);
                        clone.setTarget(this.IconCompatParcelizer.IconCompatParcelizer(str));
                        this.MediaBrowserCompat$ItemReceiver.add(clone);
                        this.read.put(clone, str);
                    }
                    read();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public void read() {
            if (this.write == null) {
                this.write = new AnimatorSet();
            }
            this.write.playTogether(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                MediaBrowserCompat$ItemReceiver(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.MediaBrowserCompat$MediaItem == null) {
                    this.MediaBrowserCompat$MediaItem = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.MediaBrowserCompat$MediaItem);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, Animator animator) {
        animator.setTarget(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.IconCompatParcelizer(str));
        if (Build.VERSION.SDK_INT < 21) {
            MediaBrowserCompat$ItemReceiver(animator);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = new ArrayList<>();
            this.MediaBrowserCompat$CustomActionResultReceiver.read = new setTextAppearance<>();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.add(animator);
        this.MediaBrowserCompat$CustomActionResultReceiver.read.put(animator, str);
    }

    public boolean isRunning() {
        if (this.write != null) {
            return ((AnimatedVectorDrawable) this.write).isRunning();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.write.isRunning();
    }

    public void start() {
        if (this.write != null) {
            ((AnimatedVectorDrawable) this.write).start();
        } else if (!this.MediaBrowserCompat$CustomActionResultReceiver.write.isStarted()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.write != null) {
            ((AnimatedVectorDrawable) this.write).stop();
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.write.end();
        }
    }
}
