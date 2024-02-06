package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;
import p040o.ContentFrameLayout;

/* renamed from: o.setLogo */
public class setLogo {
    private boolean IconCompatParcelizer;
    private AlertController$RecycleListView.write MediaBrowserCompat$CustomActionResultReceiver;
    private AlertController$RecycleListView.write MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem = 0;
    private AlertController$RecycleListView.write MediaBrowserCompat$SearchResultReceiver;
    private Typeface MediaDescriptionCompat;
    private AlertController$RecycleListView.write MediaMetadataCompat;
    private final TextView MediaSessionCompat$Token;
    private AlertController$RecycleListView.write RatingCompat;
    private AlertController$RecycleListView.write read;
    private final setMenuPrepared write;

    public setLogo(TextView textView) {
        this.MediaSessionCompat$Token = textView;
        this.write = new setMenuPrepared(textView);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void read(android.util.AttributeSet r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.widget.TextView r3 = r0.MediaSessionCompat$Token
            android.content.Context r3 = r3.getContext()
            o.ActionBarOverlayLayout r4 = p040o.ActionBarOverlayLayout.IconCompatParcelizer()
            int[] r5 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper
            o.AlertController$RecycleListView$MediaDescriptionCompat r6 = new o.AlertController$RecycleListView$MediaDescriptionCompat
            r7 = 0
            android.content.res.TypedArray r5 = r3.obtainStyledAttributes(r1, r5, r2, r7)
            r6.<init>(r3, r5)
            int r5 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_textAppearance
            android.content.res.TypedArray r8 = r6.MediaBrowserCompat$ItemReceiver
            r9 = -1
            int r5 = r8.getResourceId(r5, r9)
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableLeft
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            boolean r8 = r10.hasValue(r8)
            if (r8 == 0) goto L_0x003d
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableLeft
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r10.getResourceId(r8, r7)
            o.AlertController$RecycleListView$write r8 = write(r3, r4, r8)
            r0.read = r8
        L_0x003d:
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableTop
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            boolean r8 = r10.hasValue(r8)
            if (r8 == 0) goto L_0x0055
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableTop
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r10.getResourceId(r8, r7)
            o.AlertController$RecycleListView$write r8 = write(r3, r4, r8)
            r0.MediaMetadataCompat = r8
        L_0x0055:
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableRight
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            boolean r8 = r10.hasValue(r8)
            if (r8 == 0) goto L_0x006d
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableRight
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r10.getResourceId(r8, r7)
            o.AlertController$RecycleListView$write r8 = write(r3, r4, r8)
            r0.RatingCompat = r8
        L_0x006d:
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableBottom
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            boolean r8 = r10.hasValue(r8)
            if (r8 == 0) goto L_0x0085
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableBottom
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r10.getResourceId(r8, r7)
            o.AlertController$RecycleListView$write r8 = write(r3, r4, r8)
            r0.MediaBrowserCompat$CustomActionResultReceiver = r8
        L_0x0085:
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r8 < r10) goto L_0x00bb
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableStart
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            boolean r8 = r10.hasValue(r8)
            if (r8 == 0) goto L_0x00a3
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableStart
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r10.getResourceId(r8, r7)
            o.AlertController$RecycleListView$write r8 = write(r3, r4, r8)
            r0.MediaBrowserCompat$SearchResultReceiver = r8
        L_0x00a3:
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableEnd
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            boolean r8 = r10.hasValue(r8)
            if (r8 == 0) goto L_0x00bb
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextHelper_android_drawableEnd
            android.content.res.TypedArray r10 = r6.MediaBrowserCompat$ItemReceiver
            int r8 = r10.getResourceId(r8, r7)
            o.AlertController$RecycleListView$write r4 = write(r3, r4, r8)
            r0.MediaBrowserCompat$ItemReceiver = r4
        L_0x00bb:
            android.content.res.TypedArray r4 = r6.MediaBrowserCompat$ItemReceiver
            r4.recycle()
            android.widget.TextView r4 = r0.MediaSessionCompat$Token
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r8 = 23
            r10 = 0
            if (r5 == r9) goto L_0x0136
            int[] r11 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance
            o.AlertController$RecycleListView$MediaDescriptionCompat r12 = new o.AlertController$RecycleListView$MediaDescriptionCompat
            android.content.res.TypedArray r5 = r3.obtainStyledAttributes(r5, r11)
            r12.<init>(r3, r5)
            if (r4 != 0) goto L_0x00ee
            int r5 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps
            android.content.res.TypedArray r11 = r12.MediaBrowserCompat$ItemReceiver
            boolean r5 = r11.hasValue(r5)
            if (r5 == 0) goto L_0x00ee
            int r5 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps
            android.content.res.TypedArray r11 = r12.MediaBrowserCompat$ItemReceiver
            boolean r5 = r11.getBoolean(r5, r7)
            r11 = 1
            goto L_0x00f0
        L_0x00ee:
            r5 = r7
            r11 = r5
        L_0x00f0:
            r0.write((android.content.Context) r3, (p040o.AlertController$RecycleListView.MediaDescriptionCompat) r12)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r8) goto L_0x012e
            int r13 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor
            android.content.res.TypedArray r14 = r12.MediaBrowserCompat$ItemReceiver
            boolean r13 = r14.hasValue(r13)
            if (r13 == 0) goto L_0x0108
            int r13 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor
            android.content.res.ColorStateList r13 = r12.MediaBrowserCompat$CustomActionResultReceiver(r13)
            goto L_0x0109
        L_0x0108:
            r13 = r10
        L_0x0109:
            int r14 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorHint
            android.content.res.TypedArray r15 = r12.MediaBrowserCompat$ItemReceiver
            boolean r14 = r15.hasValue(r14)
            if (r14 == 0) goto L_0x011a
            int r14 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r14 = r12.MediaBrowserCompat$CustomActionResultReceiver(r14)
            goto L_0x011b
        L_0x011a:
            r14 = r10
        L_0x011b:
            int r15 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorLink
            android.content.res.TypedArray r6 = r12.MediaBrowserCompat$ItemReceiver
            boolean r6 = r6.hasValue(r15)
            if (r6 == 0) goto L_0x012b
            int r6 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r10 = r12.MediaBrowserCompat$CustomActionResultReceiver(r6)
        L_0x012b:
            r6 = r10
            r10 = r14
            goto L_0x0130
        L_0x012e:
            r6 = r10
            r13 = r6
        L_0x0130:
            android.content.res.TypedArray r12 = r12.MediaBrowserCompat$ItemReceiver
            r12.recycle()
            goto L_0x013a
        L_0x0136:
            r5 = r7
            r11 = r5
            r6 = r10
            r13 = r6
        L_0x013a:
            int[] r12 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance
            o.AlertController$RecycleListView$MediaDescriptionCompat r14 = new o.AlertController$RecycleListView$MediaDescriptionCompat
            android.content.res.TypedArray r12 = r3.obtainStyledAttributes(r1, r12, r2, r7)
            r14.<init>(r3, r12)
            if (r4 != 0) goto L_0x015c
            int r12 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps
            android.content.res.TypedArray r15 = r14.MediaBrowserCompat$ItemReceiver
            boolean r12 = r15.hasValue(r12)
            if (r12 == 0) goto L_0x015c
            int r5 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps
            android.content.res.TypedArray r11 = r14.MediaBrowserCompat$ItemReceiver
            boolean r5 = r11.getBoolean(r5, r7)
            r16 = 1
            goto L_0x015e
        L_0x015c:
            r16 = r11
        L_0x015e:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 >= r8) goto L_0x0192
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor
            android.content.res.TypedArray r11 = r14.MediaBrowserCompat$ItemReceiver
            boolean r8 = r11.hasValue(r8)
            if (r8 == 0) goto L_0x0172
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor
            android.content.res.ColorStateList r13 = r14.MediaBrowserCompat$CustomActionResultReceiver(r8)
        L_0x0172:
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorHint
            android.content.res.TypedArray r11 = r14.MediaBrowserCompat$ItemReceiver
            boolean r8 = r11.hasValue(r8)
            if (r8 == 0) goto L_0x0182
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r14.MediaBrowserCompat$CustomActionResultReceiver(r8)
        L_0x0182:
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorLink
            android.content.res.TypedArray r11 = r14.MediaBrowserCompat$ItemReceiver
            boolean r8 = r11.hasValue(r8)
            if (r8 == 0) goto L_0x0192
            int r6 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r6 = r14.MediaBrowserCompat$CustomActionResultReceiver(r6)
        L_0x0192:
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r8 < r11) goto L_0x01b2
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize
            android.content.res.TypedArray r11 = r14.MediaBrowserCompat$ItemReceiver
            boolean r8 = r11.hasValue(r8)
            if (r8 == 0) goto L_0x01b2
            int r8 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize
            android.content.res.TypedArray r11 = r14.MediaBrowserCompat$ItemReceiver
            int r8 = r11.getDimensionPixelSize(r8, r9)
            if (r8 != 0) goto L_0x01b2
            android.widget.TextView r8 = r0.MediaSessionCompat$Token
            r11 = 0
            r8.setTextSize(r7, r11)
        L_0x01b2:
            r0.write((android.content.Context) r3, (p040o.AlertController$RecycleListView.MediaDescriptionCompat) r14)
            android.content.res.TypedArray r8 = r14.MediaBrowserCompat$ItemReceiver
            r8.recycle()
            if (r13 == 0) goto L_0x01c1
            android.widget.TextView r8 = r0.MediaSessionCompat$Token
            r8.setTextColor(r13)
        L_0x01c1:
            if (r10 == 0) goto L_0x01c8
            android.widget.TextView r8 = r0.MediaSessionCompat$Token
            r8.setHintTextColor(r10)
        L_0x01c8:
            if (r6 == 0) goto L_0x01cf
            android.widget.TextView r8 = r0.MediaSessionCompat$Token
            r8.setLinkTextColor(r6)
        L_0x01cf:
            if (r4 != 0) goto L_0x01d6
            if (r16 == 0) goto L_0x01d6
            r0.MediaBrowserCompat$ItemReceiver(r5)
        L_0x01d6:
            android.graphics.Typeface r4 = r0.MediaDescriptionCompat
            if (r4 == 0) goto L_0x01e1
            android.widget.TextView r5 = r0.MediaSessionCompat$Token
            int r6 = r0.MediaBrowserCompat$MediaItem
            r5.setTypeface(r4, r6)
        L_0x01e1:
            o.setMenuPrepared r4 = r0.write
            r4.MediaBrowserCompat$ItemReceiver((android.util.AttributeSet) r1, (int) r2)
            boolean r2 = p040o.setTrackTintList.write
            if (r2 == 0) goto L_0x0225
            o.setMenuPrepared r2 = r0.write
            int r2 = r2.MediaDescriptionCompat()
            if (r2 == 0) goto L_0x0225
            o.setMenuPrepared r2 = r0.write
            int[] r2 = r2.MediaBrowserCompat$CustomActionResultReceiver()
            int r4 = r2.length
            if (r4 <= 0) goto L_0x0225
            android.widget.TextView r4 = r0.MediaSessionCompat$Token
            int r4 = r4.getAutoSizeStepGranularity()
            float r4 = (float) r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0220
            android.widget.TextView r2 = r0.MediaSessionCompat$Token
            o.setMenuPrepared r4 = r0.write
            int r4 = r4.MediaBrowserCompat$ItemReceiver()
            o.setMenuPrepared r5 = r0.write
            int r5 = r5.write()
            o.setMenuPrepared r6 = r0.write
            int r6 = r6.IconCompatParcelizer()
            r2.setAutoSizeTextTypeUniformWithConfiguration(r4, r5, r6, r7)
            goto L_0x0225
        L_0x0220:
            android.widget.TextView r4 = r0.MediaSessionCompat$Token
            r4.setAutoSizeTextTypeUniformWithPresetSizes(r2, r7)
        L_0x0225:
            int[] r2 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView
            o.AlertController$RecycleListView$MediaDescriptionCompat r4 = new o.AlertController$RecycleListView$MediaDescriptionCompat
            android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r1, r2)
            r4.<init>(r3, r1)
            int r1 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_firstBaselineToTopHeight
            android.content.res.TypedArray r2 = r4.MediaBrowserCompat$ItemReceiver
            int r1 = r2.getDimensionPixelSize(r1, r9)
            int r2 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_lastBaselineToBottomHeight
            android.content.res.TypedArray r3 = r4.MediaBrowserCompat$ItemReceiver
            int r2 = r3.getDimensionPixelSize(r2, r9)
            int r3 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_lineHeight
            android.content.res.TypedArray r5 = r4.MediaBrowserCompat$ItemReceiver
            int r3 = r5.getDimensionPixelSize(r3, r9)
            android.content.res.TypedArray r4 = r4.MediaBrowserCompat$ItemReceiver
            r4.recycle()
            if (r1 == r9) goto L_0x0254
            android.widget.TextView r4 = r0.MediaSessionCompat$Token
            p040o.setNavigationContentDescription.IconCompatParcelizer(r4, r1)
        L_0x0254:
            if (r2 == r9) goto L_0x025b
            android.widget.TextView r1 = r0.MediaSessionCompat$Token
            p040o.setNavigationContentDescription.write(r1, r2)
        L_0x025b:
            if (r3 == r9) goto L_0x0262
            android.widget.TextView r1 = r0.MediaSessionCompat$Token
            p040o.setNavigationContentDescription.MediaBrowserCompat$ItemReceiver((android.widget.TextView) r1, (int) r3)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setLogo.read(android.util.AttributeSet, int):void");
    }

    private void write(Context context, AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat) {
        String string;
        this.MediaBrowserCompat$MediaItem = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textStyle, this.MediaBrowserCompat$MediaItem);
        boolean z = true;
        if (!mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_fontFamily)) {
            if (!mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_fontFamily)) {
                if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_typeface)) {
                    this.IconCompatParcelizer = false;
                    int i = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_typeface, 1);
                    if (i == 1) {
                        this.MediaDescriptionCompat = Typeface.SANS_SERIF;
                        return;
                    } else if (i == 2) {
                        this.MediaDescriptionCompat = Typeface.SERIF;
                        return;
                    } else if (i == 3) {
                        this.MediaDescriptionCompat = Typeface.MONOSPACE;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Typeface typeface = null;
        this.MediaDescriptionCompat = null;
        int i2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_fontFamily) ? AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_fontFamily : AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_fontFamily;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.MediaSessionCompat$Token);
            C15025 r4 = new ContentFrameLayout.read() {
                public void MediaBrowserCompat$CustomActionResultReceiver(int i) {
                }

                public void MediaBrowserCompat$ItemReceiver(Typeface typeface) {
                    setLogo.this.read((WeakReference<TextView>) weakReference, typeface);
                }
            };
            try {
                int i3 = this.MediaBrowserCompat$MediaItem;
                int resourceId = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (mediaDescriptionCompat.IconCompatParcelizer == null) {
                        mediaDescriptionCompat.IconCompatParcelizer = new TypedValue();
                    }
                    typeface = ContentFrameLayout.MediaBrowserCompat$ItemReceiver(mediaDescriptionCompat.read, resourceId, mediaDescriptionCompat.IconCompatParcelizer, i3, r4);
                }
                this.MediaDescriptionCompat = typeface;
                if (typeface != null) {
                    z = false;
                }
                this.IconCompatParcelizer = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.MediaDescriptionCompat == null && (string = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getString(i2)) != null) {
            this.MediaDescriptionCompat = Typeface.create(string, this.MediaBrowserCompat$MediaItem);
        }
    }

    /* access modifiers changed from: package-private */
    public void read(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.IconCompatParcelizer) {
            this.MediaDescriptionCompat = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.MediaBrowserCompat$MediaItem);
            }
        }
    }

    public void IconCompatParcelizer(Context context, int i) {
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2;
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(i, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance));
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps)) {
            MediaBrowserCompat$ItemReceiver(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor) && (MediaBrowserCompat$CustomActionResultReceiver2 = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor)) != null) {
                this.MediaSessionCompat$Token.setTextColor(MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize)) {
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize, -1) == 0) {
                this.MediaSessionCompat$Token.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
            }
        }
        write(context, mediaDescriptionCompat);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        Typeface typeface = this.MediaDescriptionCompat;
        if (typeface != null) {
            this.MediaSessionCompat$Token.setTypeface(typeface, this.MediaBrowserCompat$MediaItem);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaSessionCompat$Token.setAllCaps(z);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!(this.read == null && this.MediaMetadataCompat == null && this.RatingCompat == null && this.MediaBrowserCompat$CustomActionResultReceiver == null)) {
            Drawable[] compoundDrawables = this.MediaSessionCompat$Token.getCompoundDrawables();
            MediaBrowserCompat$CustomActionResultReceiver(compoundDrawables[0], this.read);
            MediaBrowserCompat$CustomActionResultReceiver(compoundDrawables[1], this.MediaMetadataCompat);
            MediaBrowserCompat$CustomActionResultReceiver(compoundDrawables[2], this.RatingCompat);
            MediaBrowserCompat$CustomActionResultReceiver(compoundDrawables[3], this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver != null || this.MediaBrowserCompat$ItemReceiver != null) {
            Drawable[] compoundDrawablesRelative = this.MediaSessionCompat$Token.getCompoundDrawablesRelative();
            MediaBrowserCompat$CustomActionResultReceiver(compoundDrawablesRelative[0], this.MediaBrowserCompat$SearchResultReceiver);
            MediaBrowserCompat$CustomActionResultReceiver(compoundDrawablesRelative[2], this.MediaBrowserCompat$ItemReceiver);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable, AlertController$RecycleListView.write write2) {
        if (drawable != null && write2 != null) {
            ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(drawable, write2, this.MediaSessionCompat$Token.getDrawableState());
        }
    }

    private static AlertController$RecycleListView.write write(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        ColorStateList write2 = actionBarOverlayLayout.write(context, i);
        if (write2 == null) {
            return null;
        }
        AlertController$RecycleListView.write write3 = new AlertController$RecycleListView.write();
        write3.read = true;
        write3.MediaBrowserCompat$ItemReceiver = write2;
        return write3;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(boolean z, int i, int i2, int i3, int i4) {
        if (!setTrackTintList.write) {
            read();
        }
    }

    public void write(int i, float f) {
        if (!setTrackTintList.write && !MediaBrowserCompat$SearchResultReceiver()) {
            MediaBrowserCompat$ItemReceiver(i, f);
        }
    }

    public void read() {
        this.write.read();
    }

    public boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.write.MediaMetadataCompat();
    }

    private void MediaBrowserCompat$ItemReceiver(int i, float f) {
        this.write.MediaBrowserCompat$ItemReceiver(i, f);
    }

    public void read(int i) {
        this.write.MediaBrowserCompat$ItemReceiver(i);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.write.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, i4);
    }

    public void IconCompatParcelizer(int[] iArr, int i) throws IllegalArgumentException {
        this.write.MediaBrowserCompat$ItemReceiver(iArr, i);
    }

    public int RatingCompat() {
        return this.write.MediaDescriptionCompat();
    }

    public int write() {
        return this.write.IconCompatParcelizer();
    }

    public int IconCompatParcelizer() {
        return this.write.MediaBrowserCompat$ItemReceiver();
    }

    public int MediaBrowserCompat$ItemReceiver() {
        return this.write.write();
    }

    public int[] MediaDescriptionCompat() {
        return this.write.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
