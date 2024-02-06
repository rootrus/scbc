package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.setMenuPrepared */
class setMenuPrepared {
    private static final RectF IconCompatParcelizer = new RectF();
    private static ConcurrentHashMap<String, Method> MediaBrowserCompat$ItemReceiver = new ConcurrentHashMap<>();
    private float MediaBrowserCompat$CustomActionResultReceiver = -1.0f;
    private boolean MediaBrowserCompat$MediaItem = false;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private int MediaDescriptionCompat = 0;
    private final Context MediaMetadataCompat;
    private final TextView MediaSessionCompat$QueueItem;
    private TextPaint MediaSessionCompat$ResultReceiverWrapper;
    private int[] RatingCompat = new int[0];
    private float read = -1.0f;
    private float write = -1.0f;

    setMenuPrepared(TextView textView) {
        this.MediaSessionCompat$QueueItem = textView;
        this.MediaMetadataCompat = textView.getContext();
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.MediaMetadataCompat.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeTextType)) {
            this.MediaDescriptionCompat = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            IconCompatParcelizer(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!MediaSessionCompat$ResultReceiverWrapper()) {
            this.MediaDescriptionCompat = 0;
        } else if (this.MediaDescriptionCompat == 1) {
            if (!this.MediaBrowserCompat$SearchResultReceiver) {
                DisplayMetrics displayMetrics = this.MediaMetadataCompat.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                IconCompatParcelizer(dimension2, dimension3, dimension);
            }
            RatingCompat();
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(int i) {
        if (!MediaSessionCompat$ResultReceiverWrapper()) {
            return;
        }
        if (i == 0) {
            MediaBrowserCompat$MediaItem();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.MediaMetadataCompat.getResources().getDisplayMetrics();
            IconCompatParcelizer(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (RatingCompat()) {
                read();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (MediaSessionCompat$ResultReceiverWrapper()) {
            DisplayMetrics displayMetrics = this.MediaMetadataCompat.getResources().getDisplayMetrics();
            IconCompatParcelizer(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (RatingCompat()) {
                read();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(int[] iArr, int i) throws IllegalArgumentException {
        if (MediaSessionCompat$ResultReceiverWrapper()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.MediaMetadataCompat.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver(iArr2);
                if (!MediaBrowserCompat$SearchResultReceiver()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.MediaBrowserCompat$SearchResultReceiver = false;
            }
            if (RatingCompat()) {
                read();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* access modifiers changed from: package-private */
    public int IconCompatParcelizer() {
        return Math.round(this.read);
    }

    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$ItemReceiver() {
        return Math.round(this.write);
    }

    /* access modifiers changed from: package-private */
    public int write() {
        return Math.round(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* access modifiers changed from: package-private */
    public int[] MediaBrowserCompat$CustomActionResultReceiver() {
        return this.RatingCompat;
    }

    private void IconCompatParcelizer(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver(iArr);
            MediaBrowserCompat$SearchResultReceiver();
        }
    }

    private boolean MediaBrowserCompat$SearchResultReceiver() {
        int length = this.RatingCompat.length;
        boolean z = length > 0;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        if (z) {
            this.MediaDescriptionCompat = 1;
            int[] iArr = this.RatingCompat;
            this.write = (float) iArr[0];
            this.MediaBrowserCompat$CustomActionResultReceiver = (float) iArr[length - 1];
            this.read = -1.0f;
        }
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    private int[] MediaBrowserCompat$CustomActionResultReceiver(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void IconCompatParcelizer(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size ");
            sb2.append("text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > BitmapDescriptorFactory.HUE_RED) {
            this.MediaDescriptionCompat = 1;
            this.write = f;
            this.MediaBrowserCompat$CustomActionResultReceiver = f2;
            this.read = f3;
            this.MediaBrowserCompat$SearchResultReceiver = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private boolean RatingCompat() {
        if (!MediaSessionCompat$ResultReceiverWrapper() || this.MediaDescriptionCompat != 1) {
            this.MediaBrowserCompat$MediaItem = false;
        } else {
            if (!this.MediaBrowserCompat$SearchResultReceiver || this.RatingCompat.length == 0) {
                float round = (float) Math.round(this.write);
                int i = 1;
                while (Math.round(this.read + round) <= Math.round(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                    i++;
                    round += this.read;
                }
                int[] iArr = new int[i];
                float f = this.write;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.read;
                }
                this.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver(iArr);
            }
            this.MediaBrowserCompat$MediaItem = true;
        }
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: package-private */
    public void read() {
        int i;
        if (MediaMetadataCompat()) {
            if (this.MediaBrowserCompat$MediaItem) {
                if (this.MediaSessionCompat$QueueItem.getMeasuredHeight() > 0 && this.MediaSessionCompat$QueueItem.getMeasuredWidth() > 0) {
                    if (((Boolean) MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue()) {
                        i = PKIFailureInfo.badCertTemplate;
                    } else {
                        i = (this.MediaSessionCompat$QueueItem.getMeasuredWidth() - this.MediaSessionCompat$QueueItem.getTotalPaddingLeft()) - this.MediaSessionCompat$QueueItem.getTotalPaddingRight();
                    }
                    int height = (this.MediaSessionCompat$QueueItem.getHeight() - this.MediaSessionCompat$QueueItem.getCompoundPaddingBottom()) - this.MediaSessionCompat$QueueItem.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (IconCompatParcelizer) {
                            IconCompatParcelizer.setEmpty();
                            IconCompatParcelizer.right = (float) i;
                            IconCompatParcelizer.bottom = (float) height;
                            float read2 = (float) read(IconCompatParcelizer);
                            if (read2 != this.MediaSessionCompat$QueueItem.getTextSize()) {
                                MediaBrowserCompat$ItemReceiver(0, read2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.MediaBrowserCompat$MediaItem = true;
        }
    }

    private void MediaBrowserCompat$MediaItem() {
        this.MediaDescriptionCompat = 0;
        this.write = -1.0f;
        this.MediaBrowserCompat$CustomActionResultReceiver = -1.0f;
        this.read = -1.0f;
        this.RatingCompat = new int[0];
        this.MediaBrowserCompat$MediaItem = false;
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(int i, float f) {
        Resources resources;
        Context context = this.MediaMetadataCompat;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        IconCompatParcelizer(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void IconCompatParcelizer(float f) {
        if (f != this.MediaSessionCompat$QueueItem.getPaint().getTextSize()) {
            this.MediaSessionCompat$QueueItem.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.MediaSessionCompat$QueueItem.isInLayout() : false;
            if (this.MediaSessionCompat$QueueItem.getLayout() != null) {
                this.MediaBrowserCompat$MediaItem = false;
                try {
                    Method write2 = write("nullLayouts");
                    if (write2 != null) {
                        write2.invoke(this.MediaSessionCompat$QueueItem, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.MediaSessionCompat$QueueItem.requestLayout();
                } else {
                    this.MediaSessionCompat$QueueItem.forceLayout();
                }
                this.MediaSessionCompat$QueueItem.invalidate();
            }
        }
    }

    private int read(RectF rectF) {
        int length = this.RatingCompat.length;
        if (length != 0) {
            int i = 0;
            int i2 = length - 1;
            int i3 = 1;
            while (true) {
                int i4 = i3;
                int i5 = i;
                i = i4;
                while (i <= i2) {
                    int i6 = (i + i2) / 2;
                    if (MediaBrowserCompat$ItemReceiver(this.RatingCompat[i6], rectF)) {
                        i3 = i6 + 1;
                    } else {
                        i5 = i6 - 1;
                        i2 = i5;
                    }
                }
                return this.RatingCompat[i5];
            }
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        CharSequence text = this.MediaSessionCompat$QueueItem.getText();
        TransformationMethod transformationMethod = this.MediaSessionCompat$QueueItem.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.MediaSessionCompat$QueueItem)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.MediaSessionCompat$QueueItem.getMaxLines() : -1;
        TextPaint textPaint = this.MediaSessionCompat$ResultReceiverWrapper;
        if (textPaint == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.MediaSessionCompat$ResultReceiverWrapper.set(this.MediaSessionCompat$QueueItem.getPaint());
        this.MediaSessionCompat$ResultReceiverWrapper.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout = IconCompatParcelizer(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = read(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    private StaticLayout IconCompatParcelizer(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.MediaSessionCompat$ResultReceiverWrapper, i).setAlignment(alignment).setLineSpacing(this.MediaSessionCompat$QueueItem.getLineSpacingExtra(), this.MediaSessionCompat$QueueItem.getLineSpacingMultiplier()).setIncludePad(this.MediaSessionCompat$QueueItem.getIncludeFontPadding()).setBreakStrategy(this.MediaSessionCompat$QueueItem.getBreakStrategy()).setHyphenationFrequency(this.MediaSessionCompat$QueueItem.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    private StaticLayout read(CharSequence charSequence, Layout.Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT >= 16) {
            f2 = this.MediaSessionCompat$QueueItem.getLineSpacingMultiplier();
            f = this.MediaSessionCompat$QueueItem.getLineSpacingExtra();
            z = this.MediaSessionCompat$QueueItem.getIncludeFontPadding();
        } else {
            f2 = ((Float) MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            f = ((Float) MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, "getLineSpacingExtra", Float.valueOf(BitmapDescriptorFactory.HUE_RED))).floatValue();
            z = ((Boolean) MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, "getIncludeFontPadding", Boolean.TRUE)).booleanValue();
        }
        return new StaticLayout(charSequence, this.MediaSessionCompat$ResultReceiverWrapper, i, alignment, f2, f, z);
    }

    private <T> T MediaBrowserCompat$ItemReceiver(Object obj, String str, T t) {
        try {
            return write(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return t;
        }
    }

    private Method write(String str) {
        try {
            Method method = MediaBrowserCompat$ItemReceiver.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                MediaBrowserCompat$ItemReceiver.put(str, method);
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean MediaMetadataCompat() {
        return MediaSessionCompat$ResultReceiverWrapper() && this.MediaDescriptionCompat != 0;
    }

    private boolean MediaSessionCompat$ResultReceiverWrapper() {
        return !(this.MediaSessionCompat$QueueItem instanceof AppCompatEditText);
    }
}
