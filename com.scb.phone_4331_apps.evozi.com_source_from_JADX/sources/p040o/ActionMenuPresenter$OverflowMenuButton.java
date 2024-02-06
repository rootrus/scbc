package p040o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.DropDownListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.CheckCaptureModule;

/* renamed from: o.ActionMenuPresenter$OverflowMenuButton */
public abstract class ActionMenuPresenter$OverflowMenuButton implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private Runnable IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    final View MediaBrowserCompat$ItemReceiver;
    private final float MediaBrowserCompat$MediaItem;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private Runnable MediaMetadataCompat;
    private final int[] RatingCompat = new int[2];
    private int read;
    private final int write;

    public abstract CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver();

    public void onViewAttachedToWindow(View view) {
    }

    public ActionMenuPresenter$OverflowMenuButton(View view) {
        this.MediaBrowserCompat$ItemReceiver = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.MediaBrowserCompat$MediaItem = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.MediaBrowserCompat$SearchResultReceiver = tapTimeout;
        this.write = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r11 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x0016
            boolean r12 = r10.write(r12)
            if (r12 != 0) goto L_0x0014
            boolean r12 = r10.write()
            if (r12 == 0) goto L_0x0014
            r12 = r0
            goto L_0x003d
        L_0x0014:
            r12 = r1
            goto L_0x003d
        L_0x0016:
            boolean r12 = r10.MediaBrowserCompat$ItemReceiver(r12)
            if (r12 == 0) goto L_0x0024
            boolean r12 = r10.read()
            if (r12 == 0) goto L_0x0024
            r12 = r1
            goto L_0x0025
        L_0x0024:
            r12 = r0
        L_0x0025:
            if (r12 == 0) goto L_0x003d
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r2 = r10.MediaBrowserCompat$ItemReceiver
            r2.onTouchEvent(r12)
            r12.recycle()
            goto L_0x0014
        L_0x003d:
            r10.MediaBrowserCompat$CustomActionResultReceiver = r12
            if (r12 != 0) goto L_0x0043
            if (r11 == 0) goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ActionMenuPresenter$OverflowMenuButton.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewDetachedFromWindow(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.read = -1;
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            this.MediaBrowserCompat$ItemReceiver.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean read() {
        CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver()) {
            return true;
        }
        MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean write() {
        CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || !MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver()) {
            return true;
        }
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaBrowserCompat$ItemReceiver(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.MediaBrowserCompat$ItemReceiver
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.read
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.MediaBrowserCompat$MediaItem
            boolean r6 = MediaBrowserCompat$CustomActionResultReceiver(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.MediaBrowserCompat$ItemReceiver()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.MediaBrowserCompat$ItemReceiver()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.read = r6
            java.lang.Runnable r6 = r5.IconCompatParcelizer
            if (r6 != 0) goto L_0x0052
            o.ActionMenuPresenter$OverflowMenuButton$MediaBrowserCompat$ItemReceiver r6 = new o.ActionMenuPresenter$OverflowMenuButton$MediaBrowserCompat$ItemReceiver
            r6.<init>(r5)
            r5.IconCompatParcelizer = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.IconCompatParcelizer
            int r1 = r5.MediaBrowserCompat$SearchResultReceiver
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.MediaMetadataCompat
            if (r6 != 0) goto L_0x0065
            o.ActionMenuPresenter$OverflowMenuButton$read r6 = new o.ActionMenuPresenter$OverflowMenuButton$read
            r6.<init>()
            r5.MediaMetadataCompat = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.MediaMetadataCompat
            int r1 = r5.write
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ActionMenuPresenter$OverflowMenuButton.MediaBrowserCompat$ItemReceiver(android.view.MotionEvent):boolean");
    }

    private void MediaBrowserCompat$ItemReceiver() {
        Runnable runnable = this.MediaMetadataCompat;
        if (runnable != null) {
            this.MediaBrowserCompat$ItemReceiver.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.IconCompatParcelizer;
        if (runnable2 != null) {
            this.MediaBrowserCompat$ItemReceiver.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer() {
        MediaBrowserCompat$ItemReceiver();
        View view = this.MediaBrowserCompat$ItemReceiver;
        if (view.isEnabled() && !view.isLongClickable() && read()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
    }

    private boolean write(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.MediaBrowserCompat$ItemReceiver;
        CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null && MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver() && (dropDownListView = (DropDownListView) MediaBrowserCompat$CustomActionResultReceiver2.write()) != null && dropDownListView.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            write(view, obtainNoHistory);
            read(dropDownListView, obtainNoHistory);
            boolean write2 = dropDownListView.write(obtainNoHistory, this.read);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (write2 && z) {
                return true;
            }
        }
        return false;
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean read(View view, MotionEvent motionEvent) {
        int[] iArr = this.RatingCompat;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private boolean write(View view, MotionEvent motionEvent) {
        int[] iArr = this.RatingCompat;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: o.ActionMenuPresenter$OverflowMenuButton$read */
    class read implements Runnable {
        read() {
        }

        public final void run() {
            ActionMenuPresenter$OverflowMenuButton.this.IconCompatParcelizer();
        }
    }
}
