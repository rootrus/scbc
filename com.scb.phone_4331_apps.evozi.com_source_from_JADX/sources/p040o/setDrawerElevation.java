package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.p042v1.XmlPullParser;
import p040o.ComponentActivity;

/* renamed from: o.setDrawerElevation */
public abstract class setDrawerElevation extends BetterViewPager {
    private static final String[] MediaMetadataCompat = {"android:visibility:visibility", "android:visibility:parent"};
    private int MediaBrowserCompat$MediaItem = 3;

    public Animator IconCompatParcelizer(View view, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        return null;
    }

    public Animator MediaBrowserCompat$ItemReceiver(View view, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        return null;
    }

    /* renamed from: o.setDrawerElevation$read */
    static class read {
        int IconCompatParcelizer;
        ViewGroup MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        boolean RatingCompat;
        ViewGroup read;
        boolean write;

        read() {
        }
    }

    public setDrawerElevation() {
    }

    public setDrawerElevation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onSaveInstanceState.write);
        int read2 = AlertController$RecycleListView.read(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (read2 == 0) {
            return;
        }
        if ((read2 & -4) == 0) {
            this.MediaBrowserCompat$MediaItem = read2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final void IconCompatParcelizer(int i) {
        if ((i & -4) == 0) {
            this.MediaBrowserCompat$MediaItem = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final int MediaMetadataCompat() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final String[] MediaBrowserCompat$ItemReceiver() {
        return MediaMetadataCompat;
    }

    private static void MediaBrowserCompat$ItemReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:visibility:visibility", Integer.valueOf(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver.getVisibility()));
        setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:visibility:parent", setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver.getParent());
        int[] iArr = new int[2];
        setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver.getLocationOnScreen(iArr);
        setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:visibility:screenLocation", iArr);
    }

    public void read(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        MediaBrowserCompat$ItemReceiver(setchildrendrawingorderenabledcompat);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        MediaBrowserCompat$ItemReceiver(setchildrendrawingorderenabledcompat);
    }

    private static read IconCompatParcelizer(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2) {
        read read2 = new read();
        read2.RatingCompat = false;
        read2.write = false;
        if (setchildrendrawingorderenabledcompat == null || !setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.containsKey("android:visibility:visibility")) {
            read2.MediaBrowserCompat$ItemReceiver = -1;
            read2.read = null;
        } else {
            read2.MediaBrowserCompat$ItemReceiver = ((Integer) setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.get("android:visibility:visibility")).intValue();
            read2.read = (ViewGroup) setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.get("android:visibility:parent");
        }
        if (setchildrendrawingorderenabledcompat2 == null || !setchildrendrawingorderenabledcompat2.MediaBrowserCompat$ItemReceiver.containsKey("android:visibility:visibility")) {
            read2.IconCompatParcelizer = -1;
            read2.MediaBrowserCompat$CustomActionResultReceiver = null;
        } else {
            read2.IconCompatParcelizer = ((Integer) setchildrendrawingorderenabledcompat2.MediaBrowserCompat$ItemReceiver.get("android:visibility:visibility")).intValue();
            read2.MediaBrowserCompat$CustomActionResultReceiver = (ViewGroup) setchildrendrawingorderenabledcompat2.MediaBrowserCompat$ItemReceiver.get("android:visibility:parent");
        }
        if (setchildrendrawingorderenabledcompat == null || setchildrendrawingorderenabledcompat2 == null) {
            if (setchildrendrawingorderenabledcompat == null && read2.IconCompatParcelizer == 0) {
                read2.write = true;
                read2.RatingCompat = true;
            } else if (setchildrendrawingorderenabledcompat2 == null && read2.MediaBrowserCompat$ItemReceiver == 0) {
                read2.write = false;
                read2.RatingCompat = true;
            }
        } else if (read2.MediaBrowserCompat$ItemReceiver == read2.IconCompatParcelizer && read2.read == read2.MediaBrowserCompat$CustomActionResultReceiver) {
            return read2;
        } else {
            if (read2.MediaBrowserCompat$ItemReceiver != read2.IconCompatParcelizer) {
                if (read2.MediaBrowserCompat$ItemReceiver == 0) {
                    read2.write = false;
                    read2.RatingCompat = true;
                } else if (read2.IconCompatParcelizer == 0) {
                    read2.write = true;
                    read2.RatingCompat = true;
                }
            } else if (read2.MediaBrowserCompat$CustomActionResultReceiver == null) {
                read2.write = false;
                read2.RatingCompat = true;
            } else if (read2.read == null) {
                read2.write = true;
                read2.RatingCompat = true;
            }
        }
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (IconCompatParcelizer(MediaBrowserCompat$ItemReceiver(r9, false), IconCompatParcelizer(r9, false)).RatingCompat == false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator read(android.view.ViewGroup r9, p040o.setChildrenDrawingOrderEnabledCompat r10, p040o.setChildrenDrawingOrderEnabledCompat r11) {
        /*
            r8 = this;
            o.setDrawerElevation$read r0 = IconCompatParcelizer((p040o.setChildrenDrawingOrderEnabledCompat) r10, (p040o.setChildrenDrawingOrderEnabledCompat) r11)
            boolean r1 = r0.RatingCompat
            r2 = 0
            if (r1 == 0) goto L_0x012f
            android.view.ViewGroup r1 = r0.read
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x012f
        L_0x0011:
            boolean r1 = r0.write
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0040
            int r9 = r8.MediaBrowserCompat$MediaItem
            r9 = r9 & r4
            if (r9 != r4) goto L_0x003f
            if (r11 == 0) goto L_0x003f
            if (r10 != 0) goto L_0x0038
            android.view.View r9 = r11.MediaBrowserCompat$CustomActionResultReceiver
            android.view.ViewParent r9 = r9.getParent()
            android.view.View r9 = (android.view.View) r9
            o.setChildrenDrawingOrderEnabledCompat r0 = r8.MediaBrowserCompat$ItemReceiver(r9, r3)
            o.setChildrenDrawingOrderEnabledCompat r9 = r8.IconCompatParcelizer(r9, r3)
            o.setDrawerElevation$read r9 = IconCompatParcelizer((p040o.setChildrenDrawingOrderEnabledCompat) r0, (p040o.setChildrenDrawingOrderEnabledCompat) r9)
            boolean r9 = r9.RatingCompat
            if (r9 != 0) goto L_0x003f
        L_0x0038:
            android.view.View r9 = r11.MediaBrowserCompat$CustomActionResultReceiver
            android.animation.Animator r9 = r8.MediaBrowserCompat$ItemReceiver(r9, r10)
            return r9
        L_0x003f:
            return r2
        L_0x0040:
            int r0 = r0.IconCompatParcelizer
            int r1 = r8.MediaBrowserCompat$MediaItem
            r5 = 2
            r1 = r1 & r5
            if (r1 != r5) goto L_0x012f
            if (r10 == 0) goto L_0x004d
            android.view.View r1 = r10.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x004e
        L_0x004d:
            r1 = r2
        L_0x004e:
            if (r11 == 0) goto L_0x0053
            android.view.View r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0054
        L_0x0053:
            r11 = r2
        L_0x0054:
            if (r11 == 0) goto L_0x006f
            android.view.ViewParent r6 = r11.getParent()
            if (r6 == 0) goto L_0x006f
            r6 = 4
            if (r0 == r6) goto L_0x006d
            if (r1 != r11) goto L_0x0062
            goto L_0x006d
        L_0x0062:
            android.view.ViewParent r11 = r1.getParent()
            android.view.View r11 = (android.view.View) r11
            android.view.View r1 = p040o.CoreComponentFactory.MediaBrowserCompat$ItemReceiver(r9, r1, r11)
            goto L_0x00b0
        L_0x006d:
            r1 = r2
            goto L_0x00b4
        L_0x006f:
            if (r11 == 0) goto L_0x0073
            r1 = r11
            goto L_0x00b0
        L_0x0073:
            if (r1 == 0) goto L_0x00b2
            android.view.ViewParent r11 = r1.getParent()
            if (r11 != 0) goto L_0x007c
            goto L_0x00b0
        L_0x007c:
            android.view.ViewParent r11 = r1.getParent()
            boolean r11 = r11 instanceof android.view.View
            if (r11 == 0) goto L_0x00b2
            android.view.ViewParent r11 = r1.getParent()
            android.view.View r11 = (android.view.View) r11
            o.setChildrenDrawingOrderEnabledCompat r6 = r8.IconCompatParcelizer(r11, r4)
            o.setChildrenDrawingOrderEnabledCompat r7 = r8.MediaBrowserCompat$ItemReceiver(r11, r4)
            o.setDrawerElevation$read r6 = IconCompatParcelizer((p040o.setChildrenDrawingOrderEnabledCompat) r6, (p040o.setChildrenDrawingOrderEnabledCompat) r7)
            boolean r6 = r6.RatingCompat
            if (r6 != 0) goto L_0x009f
            android.view.View r1 = p040o.CoreComponentFactory.MediaBrowserCompat$ItemReceiver(r9, r1, r11)
            goto L_0x00b0
        L_0x009f:
            android.view.ViewParent r1 = r11.getParent()
            if (r1 != 0) goto L_0x00af
            int r11 = r11.getId()
            r1 = -1
            if (r11 == r1) goto L_0x00af
            r9.findViewById(r11)
        L_0x00af:
            r1 = r2
        L_0x00b0:
            r11 = r2
            goto L_0x00b4
        L_0x00b2:
            r11 = r2
            r1 = r11
        L_0x00b4:
            if (r1 == 0) goto L_0x0107
            if (r10 == 0) goto L_0x0107
            java.util.Map<java.lang.String, java.lang.Object> r11 = r10.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r0)
            int[] r11 = (int[]) r11
            r0 = r11[r3]
            r11 = r11[r4]
            int[] r2 = new int[r5]
            r9.getLocationOnScreen(r2)
            r3 = r2[r3]
            int r0 = r0 - r3
            int r3 = r1.getLeft()
            int r0 = r0 - r3
            r1.offsetLeftAndRight(r0)
            r0 = r2[r4]
            int r11 = r11 - r0
            int r0 = r1.getTop()
            int r11 = r11 - r0
            r1.offsetTopAndBottom(r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r11 < r0) goto L_0x00ed
            o.NestedScrollView r11 = new o.NestedScrollView
            r11.<init>(r9)
            goto L_0x00f1
        L_0x00ed:
            o.setSmoothScrollingEnabled r11 = p040o.setSmoothScrollingEnabled.MediaBrowserCompat$ItemReceiver(r9)
        L_0x00f1:
            r11.IconCompatParcelizer(r1)
            android.animation.Animator r9 = r8.IconCompatParcelizer((android.view.View) r1, (p040o.setChildrenDrawingOrderEnabledCompat) r10)
            if (r9 != 0) goto L_0x00fe
            r11.MediaBrowserCompat$CustomActionResultReceiver(r1)
            goto L_0x0106
        L_0x00fe:
            o.setDrawerElevation$4 r10 = new o.setDrawerElevation$4
            r10.<init>(r11, r1)
            r9.addListener(r10)
        L_0x0106:
            return r9
        L_0x0107:
            if (r11 == 0) goto L_0x012f
            int r9 = r11.getVisibility()
            p040o.setFillViewport.write((android.view.View) r11, (int) r3)
            android.animation.Animator r10 = r8.IconCompatParcelizer((android.view.View) r11, (p040o.setChildrenDrawingOrderEnabledCompat) r10)
            if (r10 == 0) goto L_0x012b
            o.setDrawerElevation$IconCompatParcelizer r9 = new o.setDrawerElevation$IconCompatParcelizer
            r9.<init>(r11, r0)
            r10.addListener(r9)
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r11 < r0) goto L_0x0127
            r10.addPauseListener(r9)
        L_0x0127:
            r8.IconCompatParcelizer((p040o.BetterViewPager$MediaBrowserCompat$ItemReceiver) r9)
            goto L_0x012e
        L_0x012b:
            p040o.setFillViewport.write((android.view.View) r11, (int) r9)
        L_0x012e:
            return r10
        L_0x012f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setDrawerElevation.read(android.view.ViewGroup, o.setChildrenDrawingOrderEnabledCompat, o.setChildrenDrawingOrderEnabledCompat):android.animation.Animator");
    }

    public final boolean write(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2) {
        if (setchildrendrawingorderenabledcompat == null && setchildrendrawingorderenabledcompat2 == null) {
            return false;
        }
        if (setchildrendrawingorderenabledcompat != null && setchildrendrawingorderenabledcompat2 != null && setchildrendrawingorderenabledcompat2.MediaBrowserCompat$ItemReceiver.containsKey("android:visibility:visibility") != setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.containsKey("android:visibility:visibility")) {
            return false;
        }
        read IconCompatParcelizer2 = IconCompatParcelizer(setchildrendrawingorderenabledcompat, setchildrendrawingorderenabledcompat2);
        if (!IconCompatParcelizer2.RatingCompat) {
            return false;
        }
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver == 0 || IconCompatParcelizer2.IconCompatParcelizer == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o.setDrawerElevation$IconCompatParcelizer */
    static class IconCompatParcelizer extends AnimatorListenerAdapter implements BetterViewPager$MediaBrowserCompat$ItemReceiver, ComponentActivity.IconCompatParcelizer {
        private final int IconCompatParcelizer;
        private final ViewGroup MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver = false;
        private final View MediaDescriptionCompat;
        private boolean read;
        private final boolean write;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void read() {
        }

        IconCompatParcelizer(View view, int i) {
            this.MediaDescriptionCompat = view;
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = (ViewGroup) view.getParent();
            this.write = true;
            MediaBrowserCompat$ItemReceiver(true);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                setFillViewport.write(this.MediaDescriptionCompat, this.IconCompatParcelizer);
            }
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                setFillViewport.write(this.MediaDescriptionCompat, 0);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.MediaBrowserCompat$ItemReceiver = true;
        }

        public final void onAnimationEnd(Animator animator) {
            IconCompatParcelizer();
        }

        public final void write(BetterViewPager betterViewPager) {
            IconCompatParcelizer();
            betterViewPager.read((BetterViewPager$MediaBrowserCompat$ItemReceiver) this);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            MediaBrowserCompat$ItemReceiver(false);
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            MediaBrowserCompat$ItemReceiver(true);
        }

        private void IconCompatParcelizer() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                setFillViewport.write(this.MediaDescriptionCompat, this.IconCompatParcelizer);
                ViewGroup viewGroup = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            MediaBrowserCompat$ItemReceiver(false);
        }

        private void MediaBrowserCompat$ItemReceiver(boolean z) {
            ViewGroup viewGroup;
            if (this.write && this.read != z && (viewGroup = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
                this.read = z;
                if (Build.VERSION.SDK_INT >= 18) {
                    setNestedScrollingEnabled.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, z);
                } else {
                    setOnScrollChangeListener.read(viewGroup, z);
                }
            }
        }
    }
}
