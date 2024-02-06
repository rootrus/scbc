package p040o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.setExpandedFormat;

/* renamed from: o.setCheckable */
public class setCheckable extends AppCompatViewInflater {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = setCheckable.class.getSimpleName();
    private setCheckable$MediaBrowserCompat$MediaItem IconCompatParcelizer;
    private IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private int MediaDescriptionCompat;
    private boolean read;
    private int write;

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public setCheckable() {
        this((IconCompatParcelizer) null, (Resources) null);
    }

    setCheckable(IconCompatParcelizer iconCompatParcelizer, Resources resources) {
        super((AppCompatViewInflater$MediaBrowserCompat$ItemReceiver) null);
        this.MediaDescriptionCompat = -1;
        this.write = -1;
        MediaBrowserCompat$CustomActionResultReceiver(new IconCompatParcelizer(iconCompatParcelizer, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static setCheckable write(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            setCheckable setcheckable = new setCheckable();
            setcheckable.read(context, resources, xmlPullParser, attributeSet, theme);
            return setcheckable;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    public void read(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int[] iArr = AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat_android_visible, true), true);
        IconCompatParcelizer(typedArray);
        write(resources);
        typedArray.recycle();
        MediaBrowserCompat$CustomActionResultReceiver(context, resources, xmlPullParser, attributeSet, theme);
        read();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.IconCompatParcelizer != null && (visible || z2)) {
            if (z) {
                this.IconCompatParcelizer.read();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        setCheckable$MediaBrowserCompat$MediaItem setcheckable_mediabrowsercompat_mediaitem = this.IconCompatParcelizer;
        if (setcheckable_mediabrowsercompat_mediaitem != null) {
            setcheckable_mediabrowsercompat_mediaitem.MediaBrowserCompat$ItemReceiver();
            this.IconCompatParcelizer = null;
            IconCompatParcelizer(this.MediaDescriptionCompat);
            this.MediaDescriptionCompat = -1;
            this.write = -1;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int read2 = this.MediaBrowserCompat$ItemReceiver.read(iArr);
        boolean z = read2 != MediaBrowserCompat$CustomActionResultReceiver() && (read(read2) || IconCompatParcelizer(read2));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    private boolean read(int i) {
        int i2;
        int read2;
        setCheckable$MediaBrowserCompat$MediaItem setcheckable_mediabrowsercompat_mediaitem;
        setCheckable$MediaBrowserCompat$MediaItem setcheckable_mediabrowsercompat_mediaitem2 = this.IconCompatParcelizer;
        if (setcheckable_mediabrowsercompat_mediaitem2 == null) {
            i2 = MediaBrowserCompat$CustomActionResultReceiver();
        } else if (i == this.MediaDescriptionCompat) {
            return true;
        } else {
            if (i != this.write || !setcheckable_mediabrowsercompat_mediaitem2.write()) {
                i2 = this.MediaDescriptionCompat;
                setcheckable_mediabrowsercompat_mediaitem2.MediaBrowserCompat$ItemReceiver();
            } else {
                setcheckable_mediabrowsercompat_mediaitem2.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaDescriptionCompat = this.write;
                this.write = i;
                return true;
            }
        }
        this.IconCompatParcelizer = null;
        this.write = -1;
        this.MediaDescriptionCompat = -1;
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        int MediaBrowserCompat$CustomActionResultReceiver2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i2);
        int MediaBrowserCompat$CustomActionResultReceiver3 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver3 == 0 || MediaBrowserCompat$CustomActionResultReceiver2 == 0 || (read2 = iconCompatParcelizer.read(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3)) < 0) {
            return false;
        }
        boolean MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3);
        IconCompatParcelizer(read2);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            setcheckable_mediabrowsercompat_mediaitem = new setCheckable$MediaBrowserCompat$CustomActionResultReceiver((AnimationDrawable) current, iconCompatParcelizer.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3), MediaBrowserCompat$ItemReceiver2);
        } else if (current instanceof dismiss) {
            setcheckable_mediabrowsercompat_mediaitem = new write((dismiss) current);
        } else {
            if (current instanceof Animatable) {
                setcheckable_mediabrowsercompat_mediaitem = new setCheckable$MediaBrowserCompat$ItemReceiver((Animatable) current);
            }
            return false;
        }
        setcheckable_mediabrowsercompat_mediaitem.read();
        this.IconCompatParcelizer = setcheckable_mediabrowsercompat_mediaitem;
        this.write = i2;
        this.MediaDescriptionCompat = i;
        return true;
    }

    /* renamed from: o.setCheckable$write */
    static class write extends setCheckable$MediaBrowserCompat$MediaItem {
        private final dismiss MediaBrowserCompat$CustomActionResultReceiver;

        write(dismiss dismiss) {
            super();
            this.MediaBrowserCompat$CustomActionResultReceiver = dismiss;
        }

        public void read() {
            this.MediaBrowserCompat$CustomActionResultReceiver.start();
        }

        public void MediaBrowserCompat$ItemReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver.stop();
        }
    }

    private void IconCompatParcelizer(TypedArray typedArray) {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        if (Build.VERSION.SDK_INT >= 21) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver |= typedArray.getChangingConfigurations();
        }
        iconCompatParcelizer.read(typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat_android_variablePadding, iconCompatParcelizer.ExpandedMenuView));
        iconCompatParcelizer.write(typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat_android_constantSize, iconCompatParcelizer.PlaybackStateCompat$CustomAction));
        iconCompatParcelizer.write(typedArray.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat_android_enterFadeDuration, iconCompatParcelizer.setBackgroundResource));
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(typedArray.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat_android_exitFadeDuration, iconCompatParcelizer.AppCompatActivity));
        setDither(typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableCompat_android_dither, iconCompatParcelizer.setHasDecor));
    }

    private void read() {
        onStateChange(getState());
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        IconCompatParcelizer(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        MediaBrowserCompat$ItemReceiver(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private int MediaBrowserCompat$ItemReceiver(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int next;
        int[] iArr = AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableTransition;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = typedArray.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArray.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArray.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable MediaBrowserCompat$ItemReceiver2 = resourceId3 > 0 ? AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(context, resourceId3) : null;
        boolean z = typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArray.recycle();
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                MediaBrowserCompat$ItemReceiver2 = dismiss.MediaBrowserCompat$ItemReceiver(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                MediaBrowserCompat$ItemReceiver2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                MediaBrowserCompat$ItemReceiver2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(resourceId, resourceId2, MediaBrowserCompat$ItemReceiver2, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    private int IconCompatParcelizer(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int next;
        int[] iArr = AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableItem;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = typedArray.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArray.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable MediaBrowserCompat$ItemReceiver2 = resourceId2 > 0 ? AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(context, resourceId2) : null;
        typedArray.recycle();
        int[] MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(attributeSet);
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                MediaBrowserCompat$ItemReceiver2 = getTheme.IconCompatParcelizer(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                MediaBrowserCompat$ItemReceiver2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                MediaBrowserCompat$ItemReceiver2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3, MediaBrowserCompat$ItemReceiver2, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }

    public Drawable mutate() {
        if (!this.read && super.mutate() == this) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            this.read = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: write */
    public IconCompatParcelizer MediaBrowserCompat$ItemReceiver() {
        return new IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, this, (Resources) null);
    }

    /* renamed from: o.setCheckable$IconCompatParcelizer */
    static class IconCompatParcelizer extends AppCompatViewInflater$MediaBrowserCompat$ItemReceiver {
        setAutoSizeTextTypeWithDefaults<Long> MediaBrowserCompat$CustomActionResultReceiver;
        setButtonDrawable<Integer> read;

        private static long MediaDescriptionCompat(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, setCheckable setcheckable, Resources resources) {
            super(iconCompatParcelizer, setcheckable, resources);
            if (iconCompatParcelizer != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                this.read = iconCompatParcelizer.read;
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = new setAutoSizeTextTypeWithDefaults<>();
            this.read = new setButtonDrawable<>();
        }

        /* access modifiers changed from: package-private */
        public void MediaBrowserCompat$ItemReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.clone();
            this.read = this.read.clone();
        }

        /* access modifiers changed from: package-private */
        public int IconCompatParcelizer(int i, int i2, Drawable drawable, boolean z) {
            int read2 = super.read(drawable);
            long MediaDescriptionCompat = MediaDescriptionCompat(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) read2;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat, Long.valueOf(j2 | j));
            if (z) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return read2;
        }

        /* access modifiers changed from: package-private */
        public int IconCompatParcelizer(int[] iArr, Drawable drawable, int i) {
            int IconCompatParcelizer = super.IconCompatParcelizer(iArr, drawable);
            this.read.read(IconCompatParcelizer, Integer.valueOf(i));
            return IconCompatParcelizer;
        }

        /* access modifiers changed from: package-private */
        public int read(int[] iArr) {
            int IconCompatParcelizer = super.IconCompatParcelizer(iArr);
            if (IconCompatParcelizer >= 0) {
                return IconCompatParcelizer;
            }
            return super.IconCompatParcelizer(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int MediaBrowserCompat$CustomActionResultReceiver(int i) {
            if (i < 0) {
                return 0;
            }
            return this.read.MediaBrowserCompat$ItemReceiver(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int read(int i, int i2) {
            return (int) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean IconCompatParcelizer(int i, int i2) {
            return (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean MediaBrowserCompat$ItemReceiver(int i, int i2) {
            return (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new setCheckable(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new setCheckable(this, resources);
        }
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(setExpandedFormat.read read2) {
        super.MediaBrowserCompat$CustomActionResultReceiver(read2);
        if (read2 instanceof IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver = (IconCompatParcelizer) read2;
        }
    }

    /* renamed from: o.setCheckable$read */
    static class read implements TimeInterpolator {
        private int IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private int[] MediaBrowserCompat$ItemReceiver;

        read(AnimationDrawable animationDrawable, boolean z) {
            MediaBrowserCompat$CustomActionResultReceiver(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        public int MediaBrowserCompat$CustomActionResultReceiver(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.MediaBrowserCompat$CustomActionResultReceiver = numberOfFrames;
            int[] iArr = this.MediaBrowserCompat$ItemReceiver;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.MediaBrowserCompat$ItemReceiver = new int[numberOfFrames];
            }
            int[] iArr2 = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.IconCompatParcelizer = i;
            return i;
        }

        /* access modifiers changed from: package-private */
        public int MediaBrowserCompat$ItemReceiver() {
            return this.IconCompatParcelizer;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.IconCompatParcelizer)) + 0.5f);
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int[] iArr = this.MediaBrowserCompat$ItemReceiver;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.IconCompatParcelizer) : BitmapDescriptorFactory.HUE_RED);
        }
    }
}
