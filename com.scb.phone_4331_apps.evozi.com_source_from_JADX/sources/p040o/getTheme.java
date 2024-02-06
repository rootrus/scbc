package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.getTheme */
public class getTheme extends getShowsDialog {
    static final PorterDuff.Mode MediaBrowserCompat$CustomActionResultReceiver = PorterDuff.Mode.SRC_IN;
    private boolean IconCompatParcelizer;
    private ColorFilter MediaBrowserCompat$ItemReceiver;
    private PorterDuffColorFilter MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private final float[] MediaDescriptionCompat;
    private final Matrix MediaMetadataCompat;
    private getTheme$MediaBrowserCompat$MediaItem MediaSessionCompat$ResultReceiverWrapper;
    private final Rect RatingCompat;
    private Drawable.ConstantState read;

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

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

    getTheme() {
        this.IconCompatParcelizer = true;
        this.MediaDescriptionCompat = new float[9];
        this.MediaMetadataCompat = new Matrix();
        this.RatingCompat = new Rect();
        this.MediaSessionCompat$ResultReceiverWrapper = new getTheme$MediaBrowserCompat$MediaItem();
    }

    getTheme(getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem) {
        this.IconCompatParcelizer = true;
        this.MediaDescriptionCompat = new float[9];
        this.MediaMetadataCompat = new Matrix();
        this.RatingCompat = new Rect();
        this.MediaSessionCompat$ResultReceiverWrapper = gettheme_mediabrowsercompat_mediaitem;
        this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat, gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a);
    }

    public Drawable mutate() {
        if (this.write != null) {
            this.write.mutate();
            return this;
        }
        if (!this.MediaBrowserCompat$SearchResultReceiver && super.mutate() == this) {
            this.MediaSessionCompat$ResultReceiverWrapper = new getTheme$MediaBrowserCompat$MediaItem(this.MediaSessionCompat$ResultReceiverWrapper);
            this.MediaBrowserCompat$SearchResultReceiver = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public Object IconCompatParcelizer(String str) {
        return this.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.RatingCompat.get(str);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.write != null && Build.VERSION.SDK_INT >= 24) {
            return new RatingCompat(this.write.getConstantState());
        }
        this.MediaSessionCompat$ResultReceiverWrapper.RatingCompat = getChangingConfigurations();
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public void draw(Canvas canvas) {
        if (this.write != null) {
            this.write.draw(canvas);
            return;
        }
        copyBounds(this.RatingCompat);
        if (this.RatingCompat.width() > 0 && this.RatingCompat.height() > 0) {
            ColorFilter colorFilter = this.MediaBrowserCompat$ItemReceiver;
            if (colorFilter == null) {
                colorFilter = this.MediaBrowserCompat$MediaItem;
            }
            canvas.getMatrix(this.MediaMetadataCompat);
            this.MediaMetadataCompat.getValues(this.MediaDescriptionCompat);
            float abs = Math.abs(this.MediaDescriptionCompat[0]);
            float abs2 = Math.abs(this.MediaDescriptionCompat[4]);
            float abs3 = Math.abs(this.MediaDescriptionCompat[1]);
            float abs4 = Math.abs(this.MediaDescriptionCompat[3]);
            if (!(abs3 == BitmapDescriptorFactory.HUE_RED && abs4 == BitmapDescriptorFactory.HUE_RED)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.RatingCompat.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.RatingCompat.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.RatingCompat.left, (float) this.RatingCompat.top);
                if (read()) {
                    canvas.translate((float) this.RatingCompat.width(), BitmapDescriptorFactory.HUE_RED);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.RatingCompat.offsetTo(0, 0);
                this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(min, min2);
                if (!this.IconCompatParcelizer) {
                    this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(min, min2);
                } else if (!this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver()) {
                    this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(min, min2);
                    this.MediaSessionCompat$ResultReceiverWrapper.write();
                }
                this.MediaSessionCompat$ResultReceiverWrapper.write(canvas, colorFilter, this.RatingCompat);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.write != null) {
            return setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.write);
        }
        return this.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.write != null) {
            this.write.setAlpha(i);
        } else if (this.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.getRootAlpha() != i) {
            this.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.write != null) {
            this.write.setColorFilter(colorFilter);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = colorFilter;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter MediaBrowserCompat$ItemReceiver(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.write != null) {
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.write, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.write != null) {
            setBaselineAligned.read(this.write, colorStateList);
            return;
        }
        getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem = this.MediaSessionCompat$ResultReceiverWrapper;
        if (gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat != colorStateList) {
            gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat = colorStateList;
            this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, colorStateList, gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.write != null) {
            setBaselineAligned.IconCompatParcelizer(this.write, mode);
            return;
        }
        getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem = this.MediaSessionCompat$ResultReceiverWrapper;
        if (gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a != mode) {
            gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a = mode;
            this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat, mode);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r1.MediaSessionCompat$ResultReceiverWrapper;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.write
            if (r0 == 0) goto L_0x000b
            android.graphics.drawable.Drawable r0 = r1.write
            boolean r0 = r0.isStateful()
            return r0
        L_0x000b:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x002d
            o.getTheme$MediaBrowserCompat$MediaItem r0 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.IconCompatParcelizer()
            if (r0 != 0) goto L_0x002d
            o.getTheme$MediaBrowserCompat$MediaItem r0 = r1.MediaSessionCompat$ResultReceiverWrapper
            android.content.res.ColorStateList r0 = r0.MediaMetadataCompat
            if (r0 == 0) goto L_0x002b
            o.getTheme$MediaBrowserCompat$MediaItem r0 = r1.MediaSessionCompat$ResultReceiverWrapper
            android.content.res.ColorStateList r0 = r0.MediaMetadataCompat
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r0 = 0
            goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getTheme.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.write != null) {
            return this.write.setState(iArr);
        }
        getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z = false;
        if (!(gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat == null || gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a == null)) {
            this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat, gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a);
            invalidateSelf();
            z = true;
        }
        if (!gettheme_mediabrowsercompat_mediaitem.IconCompatParcelizer() || !gettheme_mediabrowsercompat_mediaitem.MediaBrowserCompat$CustomActionResultReceiver(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        if (this.write != null) {
            return this.write.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.write != null) {
            return this.write.getIntrinsicWidth();
        }
        return (int) this.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public int getIntrinsicHeight() {
        if (this.write != null) {
            return this.write.getIntrinsicHeight();
        }
        return (int) this.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver;
    }

    public boolean canApplyTheme() {
        if (this.write == null) {
            return false;
        }
        setBaselineAligned.write(this.write);
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.write != null) {
            return setBaselineAligned.MediaDescriptionCompat(this.write);
        }
        return this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer;
    }

    public void setAutoMirrored(boolean z) {
        if (this.write != null) {
            setBaselineAligned.read(this.write, z);
        } else {
            this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.getTheme MediaBrowserCompat$CustomActionResultReceiver(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            o.getTheme r0 = new o.getTheme
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p040o.ContentFrameLayout.read(r6, r7, r8)
            r0.write = r6
            android.graphics.drawable.Drawable r6 = r0.write
            o.getTheme$RatingCompat r7 = new o.getTheme$RatingCompat
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()
            r7.<init>(r6)
            r0.read = r7
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            r4 = 2
            if (r3 == r4) goto L_0x0035
            r5 = 1
            if (r3 != r5) goto L_0x002b
        L_0x0035:
            if (r3 != r4) goto L_0x003c
            o.getTheme r6 = IconCompatParcelizer(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            return r6
        L_0x003c:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0044:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004d
        L_0x0049:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getTheme.MediaBrowserCompat$CustomActionResultReceiver(android.content.res.Resources, int, android.content.res.Resources$Theme):o.getTheme");
    }

    public static getTheme IconCompatParcelizer(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        getTheme gettheme = new getTheme();
        gettheme.inflate(resources, xmlPullParser, attributeSet, theme);
        return gettheme;
    }

    static int write(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.write != null) {
            this.write.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        if (this.write != null) {
            setBaselineAligned.write(this.write, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem = this.MediaSessionCompat$ResultReceiverWrapper;
        gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo = new MediaDescriptionCompat();
        int[] iArr = DialogFragment.MediaSessionCompat$ResultReceiverWrapper;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser);
        typedArray.recycle();
        gettheme_mediabrowsercompat_mediaitem.RatingCompat = getChangingConfigurations();
        gettheme_mediabrowsercompat_mediaitem.MediaBrowserCompat$ItemReceiver = true;
        read(resources, xmlPullParser, attributeSet, theme);
        this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat, gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a);
    }

    private static PorterDuff.Mode IconCompatParcelizer(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem = this.MediaSessionCompat$ResultReceiverWrapper;
        MediaDescriptionCompat mediaDescriptionCompat = gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo;
        gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a = IconCompatParcelizer(AlertController$RecycleListView.read(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat = colorStateList;
        }
        gettheme_mediabrowsercompat_mediaitem.IconCompatParcelizer = AlertController$RecycleListView.read(typedArray, xmlPullParser, "autoMirrored", 5, gettheme_mediabrowsercompat_mediaitem.IconCompatParcelizer);
        mediaDescriptionCompat.MediaSessionCompat$Token = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "viewportWidth", 7, mediaDescriptionCompat.MediaSessionCompat$Token);
        mediaDescriptionCompat.MediaDescriptionCompat = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "viewportHeight", 8, mediaDescriptionCompat.MediaDescriptionCompat);
        if (mediaDescriptionCompat.MediaSessionCompat$Token <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (mediaDescriptionCompat.MediaDescriptionCompat > BitmapDescriptorFactory.HUE_RED) {
            mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver = typedArray.getDimension(3, mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = typedArray.getDimension(2, mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver);
            if (mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver <= BitmapDescriptorFactory.HUE_RED) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver > BitmapDescriptorFactory.HUE_RED) {
                mediaDescriptionCompat.setAlpha(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "alpha", 4, mediaDescriptionCompat.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver = string;
                    mediaDescriptionCompat.RatingCompat.put(string, mediaDescriptionCompat);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    private void read(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem = this.MediaSessionCompat$ResultReceiverWrapper;
        MediaDescriptionCompat mediaDescriptionCompat = gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(mediaDescriptionCompat.MediaMetadataCompat);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) arrayDeque.peek();
                if ("path".equals(name)) {
                    read read2 = new read();
                    read2.MediaBrowserCompat$ItemReceiver(resources, attributeSet, theme, xmlPullParser);
                    iconCompatParcelizer.read.add(read2);
                    if (read2.getPathName() != null) {
                        mediaDescriptionCompat.RatingCompat.put(read2.getPathName(), read2);
                    }
                    z = false;
                    gettheme_mediabrowsercompat_mediaitem.RatingCompat = read2.f2596x50fd9e4a | gettheme_mediabrowsercompat_mediaitem.RatingCompat;
                } else if ("clip-path".equals(name)) {
                    getTheme$MediaBrowserCompat$ItemReceiver gettheme_mediabrowsercompat_itemreceiver = new getTheme$MediaBrowserCompat$ItemReceiver();
                    gettheme_mediabrowsercompat_itemreceiver.read(resources, attributeSet, theme, xmlPullParser);
                    iconCompatParcelizer.read.add(gettheme_mediabrowsercompat_itemreceiver);
                    if (gettheme_mediabrowsercompat_itemreceiver.getPathName() != null) {
                        mediaDescriptionCompat.RatingCompat.put(gettheme_mediabrowsercompat_itemreceiver.getPathName(), gettheme_mediabrowsercompat_itemreceiver);
                    }
                    gettheme_mediabrowsercompat_mediaitem.RatingCompat = gettheme_mediabrowsercompat_itemreceiver.f2596x50fd9e4a | gettheme_mediabrowsercompat_mediaitem.RatingCompat;
                } else if ("group".equals(name)) {
                    IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
                    iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(resources, attributeSet, theme, xmlPullParser);
                    iconCompatParcelizer.read.add(iconCompatParcelizer2);
                    arrayDeque.push(iconCompatParcelizer2);
                    if (iconCompatParcelizer2.getGroupName() != null) {
                        mediaDescriptionCompat.RatingCompat.put(iconCompatParcelizer2.getGroupName(), iconCompatParcelizer2);
                    }
                    gettheme_mediabrowsercompat_mediaitem.RatingCompat = iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver | gettheme_mediabrowsercompat_mediaitem.RatingCompat;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.IconCompatParcelizer = z;
    }

    private boolean read() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || setBaselineAligned.MediaBrowserCompat$CustomActionResultReceiver(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.write != null) {
            this.write.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.write != null) {
            return this.write.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.MediaSessionCompat$ResultReceiverWrapper.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.write != null) {
            this.write.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.write != null) {
            this.write.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.write != null) {
            return this.write.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.write != null) {
            this.write.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: o.getTheme$RatingCompat */
    static class RatingCompat extends Drawable.ConstantState {
        private final Drawable.ConstantState read;

        public RatingCompat(Drawable.ConstantState constantState) {
            this.read = constantState;
        }

        public Drawable newDrawable() {
            getTheme gettheme = new getTheme();
            gettheme.write = (VectorDrawable) this.read.newDrawable();
            return gettheme;
        }

        public Drawable newDrawable(Resources resources) {
            getTheme gettheme = new getTheme();
            gettheme.write = (VectorDrawable) this.read.newDrawable(resources);
            return gettheme;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            getTheme gettheme = new getTheme();
            gettheme.write = (VectorDrawable) this.read.newDrawable(resources, theme);
            return gettheme;
        }

        public boolean canApplyTheme() {
            return this.read.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.read.getChangingConfigurations();
        }
    }

    /* renamed from: o.getTheme$MediaDescriptionCompat */
    static class MediaDescriptionCompat {

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static final Matrix f2595x50fd9e4a = new Matrix();
        private PathMeasure AlertController$RecycleListView;
        Paint IconCompatParcelizer;
        float MediaBrowserCompat$CustomActionResultReceiver;
        float MediaBrowserCompat$ItemReceiver;
        Paint MediaBrowserCompat$MediaItem;
        String MediaBrowserCompat$SearchResultReceiver;
        float MediaDescriptionCompat;
        final IconCompatParcelizer MediaMetadataCompat;
        private int MediaSessionCompat$QueueItem;
        private final Path MediaSessionCompat$ResultReceiverWrapper;
        float MediaSessionCompat$Token;
        private final Matrix ParcelableVolumeInfo;
        final setTextAppearance<String, Object> RatingCompat;
        int read;
        private final Path setHasDecor;
        Boolean write;

        private static float IconCompatParcelizer(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public MediaDescriptionCompat() {
            this.ParcelableVolumeInfo = new Matrix();
            this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
            this.MediaSessionCompat$Token = BitmapDescriptorFactory.HUE_RED;
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
            this.read = 255;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.write = null;
            this.RatingCompat = new setTextAppearance<>();
            this.MediaMetadataCompat = new IconCompatParcelizer();
            this.MediaSessionCompat$ResultReceiverWrapper = new Path();
            this.setHasDecor = new Path();
        }

        public void setRootAlpha(int i) {
            this.read = i;
        }

        public int getRootAlpha() {
            return this.read;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public MediaDescriptionCompat(MediaDescriptionCompat mediaDescriptionCompat) {
            this.ParcelableVolumeInfo = new Matrix();
            this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
            this.MediaSessionCompat$Token = BitmapDescriptorFactory.HUE_RED;
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
            this.read = 255;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.write = null;
            setTextAppearance<String, Object> settextappearance = new setTextAppearance<>();
            this.RatingCompat = settextappearance;
            this.MediaMetadataCompat = new IconCompatParcelizer(mediaDescriptionCompat.MediaMetadataCompat, settextappearance);
            this.MediaSessionCompat$ResultReceiverWrapper = new Path(mediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper);
            this.setHasDecor = new Path(mediaDescriptionCompat.setHasDecor);
            this.MediaBrowserCompat$CustomActionResultReceiver = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$ItemReceiver = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
            this.MediaSessionCompat$Token = mediaDescriptionCompat.MediaSessionCompat$Token;
            this.MediaDescriptionCompat = mediaDescriptionCompat.MediaDescriptionCompat;
            this.MediaSessionCompat$QueueItem = mediaDescriptionCompat.MediaSessionCompat$QueueItem;
            this.read = mediaDescriptionCompat.read;
            this.MediaBrowserCompat$SearchResultReceiver = mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
            String str = mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
            if (str != null) {
                this.RatingCompat.put(str, this);
            }
            this.write = mediaDescriptionCompat.write;
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            iconCompatParcelizer.write.set(matrix);
            iconCompatParcelizer.write.preConcat(iconCompatParcelizer.IconCompatParcelizer);
            canvas.save();
            for (int i3 = 0; i3 < iconCompatParcelizer.read.size(); i3++) {
                getTheme$MediaBrowserCompat$CustomActionResultReceiver gettheme_mediabrowsercompat_customactionresultreceiver = iconCompatParcelizer.read.get(i3);
                if (gettheme_mediabrowsercompat_customactionresultreceiver instanceof IconCompatParcelizer) {
                    MediaBrowserCompat$CustomActionResultReceiver((IconCompatParcelizer) gettheme_mediabrowsercompat_customactionresultreceiver, iconCompatParcelizer.write, canvas, i, i2, colorFilter);
                } else if (gettheme_mediabrowsercompat_customactionresultreceiver instanceof write) {
                    read(iconCompatParcelizer, (write) gettheme_mediabrowsercompat_customactionresultreceiver, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void IconCompatParcelizer(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, f2595x50fd9e4a, canvas, i, i2, colorFilter);
        }

        private void read(IconCompatParcelizer iconCompatParcelizer, write write2, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f;
            write write3 = write2;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            float f2 = ((float) i) / this.MediaSessionCompat$Token;
            float f3 = ((float) i2) / this.MediaDescriptionCompat;
            float min = Math.min(f2, f3);
            Matrix matrix = iconCompatParcelizer.write;
            this.ParcelableVolumeInfo.set(matrix);
            this.ParcelableVolumeInfo.postScale(f2, f3);
            float IconCompatParcelizer2 = IconCompatParcelizer(matrix);
            if (IconCompatParcelizer2 != BitmapDescriptorFactory.HUE_RED) {
                write3.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
                Path path = this.MediaSessionCompat$ResultReceiverWrapper;
                this.setHasDecor.reset();
                if (write2.IconCompatParcelizer()) {
                    this.setHasDecor.addPath(path, this.ParcelableVolumeInfo);
                    canvas2.clipPath(this.setHasDecor);
                    return;
                }
                read read2 = (read) write3;
                if (!(read2.MediaSessionCompat$Token == BitmapDescriptorFactory.HUE_RED && read2.MediaBrowserCompat$MediaItem == 1.0f)) {
                    float f4 = read2.MediaSessionCompat$Token;
                    float f5 = read2.MediaSessionCompat$QueueItem;
                    float f6 = read2.MediaBrowserCompat$MediaItem;
                    float f7 = read2.MediaSessionCompat$QueueItem;
                    if (this.AlertController$RecycleListView == null) {
                        this.AlertController$RecycleListView = new PathMeasure();
                    }
                    this.AlertController$RecycleListView.setPath(this.MediaSessionCompat$ResultReceiverWrapper, false);
                    float length = this.AlertController$RecycleListView.getLength();
                    float f8 = ((f4 + f5) % 1.0f) * length;
                    float f9 = ((f6 + f7) % 1.0f) * length;
                    path.reset();
                    if (f8 > f9) {
                        this.AlertController$RecycleListView.getSegment(f8, length, path, true);
                        PathMeasure pathMeasure = this.AlertController$RecycleListView;
                        f = BitmapDescriptorFactory.HUE_RED;
                        pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, f9, path, true);
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                        this.AlertController$RecycleListView.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(f, f);
                }
                this.setHasDecor.addPath(path, this.ParcelableVolumeInfo);
                if (read2.read.MediaBrowserCompat$CustomActionResultReceiver()) {
                    setLineHeight setlineheight = read2.read;
                    if (this.IconCompatParcelizer == null) {
                        Paint paint = new Paint(1);
                        this.IconCompatParcelizer = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.IconCompatParcelizer;
                    if (setlineheight.write()) {
                        Shader IconCompatParcelizer3 = setlineheight.IconCompatParcelizer();
                        IconCompatParcelizer3.setLocalMatrix(this.ParcelableVolumeInfo);
                        paint2.setShader(IconCompatParcelizer3);
                        paint2.setAlpha(Math.round(read2.MediaBrowserCompat$ItemReceiver * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(getTheme.write(setlineheight.read(), read2.MediaBrowserCompat$ItemReceiver));
                    }
                    paint2.setColorFilter(colorFilter2);
                    this.setHasDecor.setFillType(read2.write == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas2.drawPath(this.setHasDecor, paint2);
                }
                if (read2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                    setLineHeight setlineheight2 = read2.MediaBrowserCompat$CustomActionResultReceiver;
                    if (this.MediaBrowserCompat$MediaItem == null) {
                        Paint paint3 = new Paint(1);
                        this.MediaBrowserCompat$MediaItem = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.MediaBrowserCompat$MediaItem;
                    if (read2.RatingCompat != null) {
                        paint4.setStrokeJoin(read2.RatingCompat);
                    }
                    if (read2.MediaMetadataCompat != null) {
                        paint4.setStrokeCap(read2.MediaMetadataCompat);
                    }
                    paint4.setStrokeMiter(read2.MediaBrowserCompat$SearchResultReceiver);
                    if (setlineheight2.write()) {
                        Shader IconCompatParcelizer4 = setlineheight2.IconCompatParcelizer();
                        IconCompatParcelizer4.setLocalMatrix(this.ParcelableVolumeInfo);
                        paint4.setShader(IconCompatParcelizer4);
                        paint4.setAlpha(Math.round(read2.IconCompatParcelizer * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(getTheme.write(setlineheight2.read(), read2.IconCompatParcelizer));
                    }
                    paint4.setColorFilter(colorFilter2);
                    paint4.setStrokeWidth(read2.MediaDescriptionCompat * min * IconCompatParcelizer2);
                    canvas2.drawPath(this.setHasDecor, paint4);
                }
            }
        }

        private float IconCompatParcelizer(Matrix matrix) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
            matrix.mapVectors(fArr);
            float IconCompatParcelizer2 = IconCompatParcelizer(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > BitmapDescriptorFactory.HUE_RED) {
                return Math.abs(IconCompatParcelizer2) / max;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        public boolean MediaBrowserCompat$CustomActionResultReceiver() {
            if (this.write == null) {
                this.write = Boolean.valueOf(this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver());
            }
            return this.write.booleanValue();
        }

        public boolean read(int[] iArr) {
            return this.MediaMetadataCompat.read(iArr);
        }
    }

    /* renamed from: o.getTheme$IconCompatParcelizer */
    static class IconCompatParcelizer extends getTheme$MediaBrowserCompat$CustomActionResultReceiver {
        final Matrix IconCompatParcelizer = new Matrix();
        float MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        int MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem = null;
        private float MediaBrowserCompat$SearchResultReceiver = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private int[] f2594x50fd9e4a;
        private float MediaDescriptionCompat = 1.0f;
        private float MediaMetadataCompat = 1.0f;
        private float MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
        private float MediaSessionCompat$ResultReceiverWrapper = BitmapDescriptorFactory.HUE_RED;
        private float RatingCompat = BitmapDescriptorFactory.HUE_RED;
        final ArrayList<getTheme$MediaBrowserCompat$CustomActionResultReceiver> read = new ArrayList<>();
        final Matrix write = new Matrix();

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, setTextAppearance<String, Object> settextappearance) {
            super();
            write write2;
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            this.RatingCompat = iconCompatParcelizer.RatingCompat;
            this.MediaDescriptionCompat = iconCompatParcelizer.MediaDescriptionCompat;
            this.MediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat;
            this.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaSessionCompat$QueueItem = iconCompatParcelizer.MediaSessionCompat$QueueItem;
            this.f2594x50fd9e4a = iconCompatParcelizer.f2594x50fd9e4a;
            String str = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
            this.MediaBrowserCompat$MediaItem = str;
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                settextappearance.put(str, this);
            }
            this.IconCompatParcelizer.set(iconCompatParcelizer.IconCompatParcelizer);
            ArrayList<getTheme$MediaBrowserCompat$CustomActionResultReceiver> arrayList = iconCompatParcelizer.read;
            for (int i = 0; i < arrayList.size(); i++) {
                getTheme$MediaBrowserCompat$CustomActionResultReceiver gettheme_mediabrowsercompat_customactionresultreceiver = arrayList.get(i);
                if (gettheme_mediabrowsercompat_customactionresultreceiver instanceof IconCompatParcelizer) {
                    this.read.add(new IconCompatParcelizer((IconCompatParcelizer) gettheme_mediabrowsercompat_customactionresultreceiver, settextappearance));
                } else {
                    if (gettheme_mediabrowsercompat_customactionresultreceiver instanceof read) {
                        write2 = new read((read) gettheme_mediabrowsercompat_customactionresultreceiver);
                    } else if (gettheme_mediabrowsercompat_customactionresultreceiver instanceof getTheme$MediaBrowserCompat$ItemReceiver) {
                        write2 = new getTheme$MediaBrowserCompat$ItemReceiver((getTheme$MediaBrowserCompat$ItemReceiver) gettheme_mediabrowsercompat_customactionresultreceiver);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.read.add(write2);
                    if (write2.ParcelableVolumeInfo != null) {
                        settextappearance.put(write2.ParcelableVolumeInfo, write2);
                    }
                }
            }
        }

        public IconCompatParcelizer() {
            super();
        }

        public String getGroupName() {
            return this.MediaBrowserCompat$MediaItem;
        }

        public Matrix getLocalMatrix() {
            return this.IconCompatParcelizer;
        }

        public void MediaBrowserCompat$ItemReceiver(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            int[] iArr = DialogFragment.MediaBrowserCompat$MediaItem;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser);
            typedArray.recycle();
        }

        private void MediaBrowserCompat$ItemReceiver(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2594x50fd9e4a = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "rotation", 5, this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$SearchResultReceiver = typedArray.getFloat(1, this.MediaBrowserCompat$SearchResultReceiver);
            this.RatingCompat = typedArray.getFloat(2, this.RatingCompat);
            this.MediaDescriptionCompat = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "scaleX", 3, this.MediaDescriptionCompat);
            this.MediaMetadataCompat = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "scaleY", 4, this.MediaMetadataCompat);
            this.MediaSessionCompat$ResultReceiverWrapper = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "translateX", 6, this.MediaSessionCompat$ResultReceiverWrapper);
            this.MediaSessionCompat$QueueItem = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "translateY", 7, this.MediaSessionCompat$QueueItem);
            String string = typedArray.getString(0);
            if (string != null) {
                this.MediaBrowserCompat$MediaItem = string;
            }
            read();
        }

        private void read() {
            this.IconCompatParcelizer.reset();
            this.IconCompatParcelizer.postTranslate(-this.MediaBrowserCompat$SearchResultReceiver, -this.RatingCompat);
            this.IconCompatParcelizer.postScale(this.MediaDescriptionCompat, this.MediaMetadataCompat);
            this.IconCompatParcelizer.postRotate(this.MediaBrowserCompat$CustomActionResultReceiver, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.IconCompatParcelizer.postTranslate(this.MediaSessionCompat$ResultReceiverWrapper + this.MediaBrowserCompat$SearchResultReceiver, this.MediaSessionCompat$QueueItem + this.RatingCompat);
        }

        public float getRotation() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public void setRotation(float f) {
            if (f != this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = f;
                read();
            }
        }

        public float getPivotX() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        public void setPivotX(float f) {
            if (f != this.MediaBrowserCompat$SearchResultReceiver) {
                this.MediaBrowserCompat$SearchResultReceiver = f;
                read();
            }
        }

        public float getPivotY() {
            return this.RatingCompat;
        }

        public void setPivotY(float f) {
            if (f != this.RatingCompat) {
                this.RatingCompat = f;
                read();
            }
        }

        public float getScaleX() {
            return this.MediaDescriptionCompat;
        }

        public void setScaleX(float f) {
            if (f != this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = f;
                read();
            }
        }

        public float getScaleY() {
            return this.MediaMetadataCompat;
        }

        public void setScaleY(float f) {
            if (f != this.MediaMetadataCompat) {
                this.MediaMetadataCompat = f;
                read();
            }
        }

        public float getTranslateX() {
            return this.MediaSessionCompat$ResultReceiverWrapper;
        }

        public void setTranslateX(float f) {
            if (f != this.MediaSessionCompat$ResultReceiverWrapper) {
                this.MediaSessionCompat$ResultReceiverWrapper = f;
                read();
            }
        }

        public float getTranslateY() {
            return this.MediaSessionCompat$QueueItem;
        }

        public void setTranslateY(float f) {
            if (f != this.MediaSessionCompat$QueueItem) {
                this.MediaSessionCompat$QueueItem = f;
                read();
            }
        }

        public boolean MediaBrowserCompat$ItemReceiver() {
            for (int i = 0; i < this.read.size(); i++) {
                if (this.read.get(i).MediaBrowserCompat$ItemReceiver()) {
                    return true;
                }
            }
            return false;
        }

        public boolean read(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.read.size(); i++) {
                z |= this.read.get(i).read(iArr);
            }
            return z;
        }
    }

    /* renamed from: o.getTheme$write */
    static abstract class write extends getTheme$MediaBrowserCompat$CustomActionResultReceiver {

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        int f2596x50fd9e4a;
        protected ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] MediaSessionCompat$ResultReceiverWrapper = null;
        String ParcelableVolumeInfo;

        public boolean IconCompatParcelizer() {
            return false;
        }

        public write() {
            super();
        }

        public write(write write) {
            super();
            this.ParcelableVolumeInfo = write.ParcelableVolumeInfo;
            this.f2596x50fd9e4a = write.f2596x50fd9e4a;
            this.MediaSessionCompat$ResultReceiverWrapper = ButtonBarLayout.MediaBrowserCompat$ItemReceiver(write.MediaSessionCompat$ResultReceiverWrapper);
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(Path path) {
            path.reset();
            ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr = this.MediaSessionCompat$ResultReceiverWrapper;
            if (buttonBarLayout$MediaBrowserCompat$ItemReceiverArr != null) {
                ButtonBarLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(buttonBarLayout$MediaBrowserCompat$ItemReceiverArr, path);
            }
        }

        public String getPathName() {
            return this.ParcelableVolumeInfo;
        }

        public ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] getPathData() {
            return this.MediaSessionCompat$ResultReceiverWrapper;
        }

        public void setPathData(ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr) {
            if (!ButtonBarLayout.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper, buttonBarLayout$MediaBrowserCompat$ItemReceiverArr)) {
                this.MediaSessionCompat$ResultReceiverWrapper = ButtonBarLayout.MediaBrowserCompat$ItemReceiver(buttonBarLayout$MediaBrowserCompat$ItemReceiverArr);
                return;
            }
            ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2 = this.MediaSessionCompat$ResultReceiverWrapper;
            for (int i = 0; i < buttonBarLayout$MediaBrowserCompat$ItemReceiverArr.length; i++) {
                buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i].MediaBrowserCompat$CustomActionResultReceiver = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i].MediaBrowserCompat$CustomActionResultReceiver;
                for (int i2 = 0; i2 < buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i].MediaBrowserCompat$ItemReceiver.length; i2++) {
                    buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i].MediaBrowserCompat$ItemReceiver[i2] = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i].MediaBrowserCompat$ItemReceiver[i2];
                }
            }
        }
    }

    /* renamed from: o.getTheme$read */
    static class read extends write {
        float IconCompatParcelizer = 1.0f;
        setLineHeight MediaBrowserCompat$CustomActionResultReceiver;
        float MediaBrowserCompat$ItemReceiver = 1.0f;
        float MediaBrowserCompat$MediaItem = 1.0f;
        float MediaBrowserCompat$SearchResultReceiver = 4.0f;
        float MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
        Paint.Cap MediaMetadataCompat = Paint.Cap.BUTT;
        float MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
        float MediaSessionCompat$Token = BitmapDescriptorFactory.HUE_RED;
        Paint.Join RatingCompat = Paint.Join.MITER;
        setLineHeight read;
        private int[] setHasDecor;
        int write = 0;

        public read() {
        }

        public read(read read2) {
            super(read2);
            this.setHasDecor = read2.setHasDecor;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaDescriptionCompat = read2.MediaDescriptionCompat;
            this.IconCompatParcelizer = read2.IconCompatParcelizer;
            this.read = read2.read;
            this.write = read2.write;
            this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver;
            this.MediaSessionCompat$Token = read2.MediaSessionCompat$Token;
            this.MediaBrowserCompat$MediaItem = read2.MediaBrowserCompat$MediaItem;
            this.MediaSessionCompat$QueueItem = read2.MediaSessionCompat$QueueItem;
            this.MediaMetadataCompat = read2.MediaMetadataCompat;
            this.RatingCompat = read2.RatingCompat;
            this.MediaBrowserCompat$SearchResultReceiver = read2.MediaBrowserCompat$SearchResultReceiver;
        }

        private Paint.Cap IconCompatParcelizer(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join MediaBrowserCompat$CustomActionResultReceiver(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void MediaBrowserCompat$ItemReceiver(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            int[] iArr = DialogFragment.MediaSessionCompat$Token;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, theme);
            typedArray.recycle();
        }

        private void MediaBrowserCompat$ItemReceiver(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.setHasDecor = null;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.ParcelableVolumeInfo = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.MediaSessionCompat$ResultReceiverWrapper = ButtonBarLayout.write(string2);
                }
                this.read = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, theme, "fillColor", 1);
                this.MediaBrowserCompat$ItemReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "fillAlpha", 12, this.MediaBrowserCompat$ItemReceiver);
                this.MediaMetadataCompat = IconCompatParcelizer(AlertController$RecycleListView.read(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.MediaMetadataCompat);
                this.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView.read(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.RatingCompat);
                this.MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.MediaBrowserCompat$SearchResultReceiver);
                this.MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, theme, "strokeColor", 3);
                this.IconCompatParcelizer = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "strokeAlpha", 11, this.IconCompatParcelizer);
                this.MediaDescriptionCompat = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "strokeWidth", 4, this.MediaDescriptionCompat);
                this.MediaBrowserCompat$MediaItem = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "trimPathEnd", 6, this.MediaBrowserCompat$MediaItem);
                this.MediaSessionCompat$QueueItem = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "trimPathOffset", 7, this.MediaSessionCompat$QueueItem);
                this.MediaSessionCompat$Token = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "trimPathStart", 5, this.MediaSessionCompat$Token);
                this.write = AlertController$RecycleListView.read(typedArray, xmlPullParser, "fillType", 13, this.write);
            }
        }

        public boolean MediaBrowserCompat$ItemReceiver() {
            return this.read.MediaBrowserCompat$ItemReceiver() || this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        }

        public boolean read(int[] iArr) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write(iArr) | this.read.write(iArr);
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i);
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.MediaDescriptionCompat;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.MediaDescriptionCompat = f;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.IconCompatParcelizer;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.IconCompatParcelizer = f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.read.read();
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.read.MediaBrowserCompat$ItemReceiver(i);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.MediaBrowserCompat$ItemReceiver = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.MediaSessionCompat$Token;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.MediaSessionCompat$Token = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.MediaBrowserCompat$MediaItem;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.MediaBrowserCompat$MediaItem = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.MediaSessionCompat$QueueItem;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.MediaSessionCompat$QueueItem = f;
        }
    }
}
