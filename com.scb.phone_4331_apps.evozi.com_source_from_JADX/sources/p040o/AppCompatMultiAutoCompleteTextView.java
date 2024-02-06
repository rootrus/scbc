package p040o;

import android.graphics.Matrix;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import java.io.File;
import java.io.IOException;
import p040o.superDispatchKeyEvent;

/* renamed from: o.AppCompatMultiAutoCompleteTextView */
public class AppCompatMultiAutoCompleteTextView implements BetterViewPager$MediaBrowserCompat$ItemReceiver, postponeEnterTransition {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
    private final long IconCompatParcelizer;
    private isDetached MediaBrowserCompat$CustomActionResultReceiver;
    private final File MediaBrowserCompat$ItemReceiver;
    private final setEnterSharedElementCallback read;
    private final requireHost write;

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public void MediaBrowserCompat$ItemReceiver() {
    }

    public void read() {
    }

    public void write(BetterViewPager betterViewPager) {
    }

    public AppCompatMultiAutoCompleteTextView() {
    }

    /* renamed from: o.AppCompatMultiAutoCompleteTextView$read */
    public static final class read {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final int TextAppearance_Compat_Notification = 2131820941;
        public static final int TextAppearance_Compat_Notification_Info = 2131820942;
        public static final int TextAppearance_Compat_Notification_Line2 = 2131820944;
        public static final int TextAppearance_Compat_Notification_Time = 2131820947;
        public static final int TextAppearance_Compat_Notification_Title = 2131820949;
        public static final int Widget_Compat_NotificationActionContainer = 2131821334;
        public static final int Widget_Compat_NotificationActionText = 2131821335;
        public static final int Widget_Support_CoordinatorLayout = 2131821382;

        public void MediaBrowserCompat$ItemReceiver(View view) {
            if (view.getVisibility() == 0) {
                view.setTag(superDispatchKeyEvent.read.save_non_transition_alpha, (Object) null);
            }
        }

        public float IconCompatParcelizer(View view) {
            Float f = (Float) view.getTag(superDispatchKeyEvent.read.save_non_transition_alpha);
            if (f != null) {
                return view.getAlpha() / f.floatValue();
            }
            return view.getAlpha();
        }

        public void write(View view) {
            if (view.getTag(superDispatchKeyEvent.read.save_non_transition_alpha) == null) {
                view.setTag(superDispatchKeyEvent.read.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
            }
        }

        public void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
            view.setLeft(i);
            view.setTop(i2);
            view.setRight(i3);
            view.setBottom(i4);
        }

        public void write(View view, float f) {
            Float f2 = (Float) view.getTag(superDispatchKeyEvent.read.save_non_transition_alpha);
            if (f2 != null) {
                view.setAlpha(f2.floatValue() * f);
            } else {
                view.setAlpha(f);
            }
        }

        public void read(View view, Matrix matrix) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                read(view2, matrix);
                matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            }
            matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
            Matrix matrix2 = view.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix.preConcat(matrix2);
            }
        }

        public void MediaBrowserCompat$ItemReceiver(View view, Matrix matrix) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                MediaBrowserCompat$ItemReceiver(view2, matrix);
                matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
            }
            matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
            Matrix matrix2 = view.getMatrix();
            if (!matrix2.isIdentity()) {
                Matrix matrix3 = new Matrix();
                if (matrix2.invert(matrix3)) {
                    matrix.postConcat(matrix3);
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x006c }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x009c }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00a8 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00b4 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00c0 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00cc }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00d8 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00e4 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00f0 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00fc }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0108 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0114 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatMultiAutoCompleteTextView.read.<clinit>():void");
        }
    }

    /* renamed from: o.AppCompatMultiAutoCompleteTextView$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final int alpha = 2130968620;
        public static final int coordinatorLayoutStyle = 2130968834;
        public static final int font = 2130968941;
        public static final int fontProviderAuthority = 2130968944;
        public static final int fontProviderCerts = 2130968945;
        public static final int fontProviderFetchStrategy = 2130968946;
        public static final int fontProviderFetchTimeout = 2130968947;
        public static final int fontProviderPackage = 2130968948;
        public static final int fontProviderQuery = 2130968949;
        public static final int fontStyle = 2130968950;
        public static final int fontVariationSettings = 2130968951;
        public static final int fontWeight = 2130968952;
        public static final int keylines = 2130969031;
        public static final int layout_anchor = 2130969047;
        public static final int layout_anchorGravity = 2130969048;
        public static final int layout_behavior = 2130969049;
        public static final int layout_dodgeInsetEdges = 2130969096;
        public static final int layout_insetEdge = 2130969109;
        public static final int layout_keyline = 2130969110;
        public static final int statusBarBackground = 2130969351;
        public static final int ttcIndex = 2130969516;
        public final setAutoSizeTextTypeWithDefaults<View> MediaBrowserCompat$CustomActionResultReceiver = new setAutoSizeTextTypeWithDefaults<>();
        public final setTextAppearance<View, setChildrenDrawingOrderEnabledCompat> MediaBrowserCompat$ItemReceiver = new setTextAppearance<>();
        public final setTextAppearance<String, View> read = new setTextAppearance<>();
        public final SparseArray<View> write = new SparseArray<>();

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x006c }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatMultiAutoCompleteTextView.IconCompatParcelizer.<clinit>():void");
        }
    }

    @Deprecated
    public AppCompatMultiAutoCompleteTextView(File file, long j) {
        this.write = new requireHost();
        this.MediaBrowserCompat$ItemReceiver = file;
        this.IconCompatParcelizer = j;
        this.read = new setEnterSharedElementCallback();
    }

    private isDetached IconCompatParcelizer() throws IOException {
        isDetached isdetached;
        synchronized (this) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = isDetached.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
            }
            isdetached = this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return isdetached;
    }

    public final File write(isStateSaved isstatesaved) {
        String write2 = this.read.write(isstatesaved);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(write2);
            sb.append(" for for Key: ");
            sb.append(isstatesaved);
            Log.v("DiskLruCacheWrapper", sb.toString());
        }
        try {
            isDetached$MediaBrowserCompat$CustomActionResultReceiver read2 = IconCompatParcelizer().read(write2);
            if (read2 != null) {
                return read2.MediaBrowserCompat$CustomActionResultReceiver[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(p040o.isStateSaved r6, p040o.postponeEnterTransition.write r7) {
        /*
            r5 = this;
            o.setEnterSharedElementCallback r0 = r5.read
            java.lang.String r0 = r0.write(r6)
            o.requireHost r1 = r5.write
            monitor-enter(r1)
            java.util.Map<java.lang.String, o.requireHost$IconCompatParcelizer> r2 = r1.read     // Catch:{ all -> 0x00b9 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00b9 }
            o.requireHost$IconCompatParcelizer r2 = (p040o.requireHost.IconCompatParcelizer) r2     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x001e
            o.requireHost$MediaBrowserCompat$CustomActionResultReceiver r2 = r1.IconCompatParcelizer     // Catch:{ all -> 0x00b9 }
            o.requireHost$IconCompatParcelizer r2 = r2.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x00b9 }
            java.util.Map<java.lang.String, o.requireHost$IconCompatParcelizer> r3 = r1.read     // Catch:{ all -> 0x00b9 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00b9 }
        L_0x001e:
            int r3 = r2.read     // Catch:{ all -> 0x00b9 }
            r4 = 1
            int r3 = r3 + r4
            r2.read = r3     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)
            java.util.concurrent.locks.Lock r1 = r2.IconCompatParcelizer
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Put: Obtained: "
            r1.append(r2)     // Catch:{ all -> 0x00b2 }
            r1.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = " for for Key: "
            r1.append(r2)     // Catch:{ all -> 0x00b2 }
            r1.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "DiskLruCacheWrapper"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b2 }
            android.util.Log.v(r6, r1)     // Catch:{ all -> 0x00b2 }
        L_0x0051:
            o.isDetached r6 = r5.IconCompatParcelizer()     // Catch:{ IOException -> 0x00a0 }
            o.isDetached$MediaBrowserCompat$CustomActionResultReceiver r1 = r6.read(r0)     // Catch:{ IOException -> 0x00a0 }
            if (r1 == 0) goto L_0x0061
        L_0x005b:
            o.requireHost r6 = r5.write
            r6.write(r0)
            return
        L_0x0061:
            o.isDetached$IconCompatParcelizer r6 = r6.write(r0)     // Catch:{ IOException -> 0x00a0 }
            if (r6 == 0) goto L_0x0089
            java.io.File r1 = r6.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x0080 }
            boolean r7 = r7.write(r1)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x0078
            o.isDetached r7 = p040o.isDetached.this     // Catch:{ all -> 0x0080 }
            r7.MediaBrowserCompat$CustomActionResultReceiver(r6, r4)     // Catch:{ all -> 0x0080 }
            r6.write = r4     // Catch:{ all -> 0x0080 }
        L_0x0078:
            boolean r7 = r6.write     // Catch:{ IOException -> 0x00a0 }
            if (r7 != 0) goto L_0x005b
            r6.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x005b }
            goto L_0x005b
        L_0x0080:
            r7 = move-exception
            boolean r1 = r6.write     // Catch:{ IOException -> 0x00a0 }
            if (r1 != 0) goto L_0x0088
            r6.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            throw r7     // Catch:{ IOException -> 0x00a0 }
        L_0x0089:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0 }
            r7.<init>()     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00a0 }
            r7.append(r0)     // Catch:{ IOException -> 0x00a0 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00a0 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00a0 }
            throw r6     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            r6 = move-exception
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x005b
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00b2 }
            goto L_0x005b
        L_0x00b2:
            r6 = move-exception
            o.requireHost r7 = r5.write
            r7.write(r0)
            throw r6
        L_0x00b9:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatMultiAutoCompleteTextView.write(o.isStateSaved, o.postponeEnterTransition$write):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    static {
        /*
            o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatMultiAutoCompleteTextView.<clinit>():void");
    }
}
