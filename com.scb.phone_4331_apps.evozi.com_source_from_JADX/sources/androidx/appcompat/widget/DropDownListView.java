package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p040o.AlertController$RecycleListView;
import p040o.setChecked;
import p040o.setContentInsetEndWithActions;

public class DropDownListView extends ListView {
    private Field IconCompatParcelizer;
    DropDownListView$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private setContentInsetEndWithActions MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private write f8x50fd9e4a;
    private int MediaDescriptionCompat = 0;
    private int MediaMetadataCompat = 0;
    private int MediaSessionCompat$QueueItem = 0;
    private final Rect ParcelableVolumeInfo = new Rect();
    private int RatingCompat = 0;
    public boolean read;
    private boolean write;

    public DropDownListView(Context context, boolean z) {
        super(context, (AttributeSet) null, AlertController$RecycleListView.read.dropDownListViewStyle);
        this.MediaBrowserCompat$ItemReceiver = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.IconCompatParcelizer = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.MediaBrowserCompat$ItemReceiver && this.read) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.MediaBrowserCompat$ItemReceiver || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.MediaBrowserCompat$ItemReceiver || super.isFocused();
    }

    public boolean hasFocus() {
        return this.MediaBrowserCompat$ItemReceiver || super.hasFocus();
    }

    public void setSelector(Drawable drawable) {
        write write2 = drawable != null ? new write(drawable) : null;
        this.f8x50fd9e4a = write2;
        super.setSelector(write2);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.MediaDescriptionCompat = rect.left;
        this.MediaSessionCompat$QueueItem = rect.top;
        this.RatingCompat = rect.right;
        this.MediaMetadataCompat = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            super.drawableStateChanged();
            write write2 = this.f8x50fd9e4a;
            if (write2 != null) {
                write2.MediaBrowserCompat$ItemReceiver = true;
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.MediaBrowserCompat$MediaItem = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        DropDownListView$MediaBrowserCompat$ItemReceiver dropDownListView$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (dropDownListView$MediaBrowserCompat$ItemReceiver != null) {
            dropDownListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
            dropDownListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.removeCallbacks(dropDownListView$MediaBrowserCompat$ItemReceiver);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int write(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    static class write extends setChecked {
        boolean MediaBrowserCompat$ItemReceiver = true;

        write(Drawable drawable) {
            super(drawable);
        }

        public final boolean setState(int[] iArr) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                return super.setState(iArr);
            }
            return false;
        }

        public final void draw(Canvas canvas) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            DropDownListView$MediaBrowserCompat$ItemReceiver dropDownListView$MediaBrowserCompat$ItemReceiver = new DropDownListView$MediaBrowserCompat$ItemReceiver(this);
            this.MediaBrowserCompat$CustomActionResultReceiver = dropDownListView$MediaBrowserCompat$ItemReceiver;
            dropDownListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.post(dropDownListView$MediaBrowserCompat$ItemReceiver);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                MediaBrowserCompat$ItemReceiver();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean write(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0016
            r0 = 2
            if (r3 == r0) goto L_0x0014
            r0 = 3
            if (r3 == r0) goto L_0x012b
            goto L_0x0129
        L_0x0014:
            r0 = r4
            goto L_0x0017
        L_0x0016:
            r0 = r5
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 < 0) goto L_0x012b
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0031
            r3 = r4
            goto L_0x012d
        L_0x0031:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.write = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r0 < r11) goto L_0x0048
            r1.drawableHotspotChanged(r7, r6)
        L_0x0048:
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0051
            r1.setPressed(r4)
        L_0x0051:
            r16.layoutChildren()
            int r0 = r1.MediaBrowserCompat$MediaItem
            if (r0 == r9) goto L_0x006e
            int r12 = r16.getFirstVisiblePosition()
            int r0 = r0 - r12
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006e
            if (r0 == r10) goto L_0x006e
            boolean r12 = r0.isPressed()
            if (r12 == 0) goto L_0x006e
            r0.setPressed(r5)
        L_0x006e:
            r1.MediaBrowserCompat$MediaItem = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            int r12 = r10.getTop()
            float r12 = (float) r12
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r11) goto L_0x0085
            float r0 = r7 - r0
            float r11 = r6 - r12
            r10.drawableHotspotChanged(r0, r11)
        L_0x0085:
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x008e
            r10.setPressed(r4)
        L_0x008e:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0098
            if (r8 == r9) goto L_0x0098
            r12 = r4
            goto L_0x0099
        L_0x0098:
            r12 = r5
        L_0x0099:
            if (r12 == 0) goto L_0x009e
            r11.setVisible(r5, r5)
        L_0x009e:
            android.graphics.Rect r0 = r1.ParcelableVolumeInfo
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.MediaDescriptionCompat
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.MediaSessionCompat$QueueItem
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.RatingCompat
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.MediaMetadataCompat
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.IconCompatParcelizer     // Catch:{ IllegalAccessException -> 0x00eb }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00eb }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00eb }
            if (r5 == r0) goto L_0x00ef
            java.lang.reflect.Field r5 = r1.IconCompatParcelizer     // Catch:{ IllegalAccessException -> 0x00eb }
            r0 = r0 ^ r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00eb }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00eb }
            if (r8 == r9) goto L_0x00ef
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ef:
            if (r12 == 0) goto L_0x010b
            android.graphics.Rect r0 = r1.ParcelableVolumeInfo
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 == 0) goto L_0x0103
            r12 = 0
            goto L_0x0104
        L_0x0103:
            r12 = r4
        L_0x0104:
            r13 = 0
            r11.setVisible(r12, r13)
            p040o.setBaselineAligned.IconCompatParcelizer(r11, r5, r0)
        L_0x010b:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0116
            if (r8 == r9) goto L_0x0116
            p040o.setBaselineAligned.IconCompatParcelizer(r0, r7, r6)
        L_0x0116:
            androidx.appcompat.widget.DropDownListView$write r0 = r1.f8x50fd9e4a
            if (r0 == 0) goto L_0x011d
            r5 = 0
            r0.MediaBrowserCompat$ItemReceiver = r5
        L_0x011d:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0129
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0129:
            r0 = r4
            goto L_0x012c
        L_0x012b:
            r0 = 0
        L_0x012c:
            r3 = 0
        L_0x012d:
            if (r0 == 0) goto L_0x0131
            if (r3 == 0) goto L_0x014a
        L_0x0131:
            r3 = 0
            r1.write = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.MediaBrowserCompat$MediaItem
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x014a
            r5.setPressed(r3)
        L_0x014a:
            if (r0 == 0) goto L_0x0163
            o.setContentInsetEndWithActions r3 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r3 != 0) goto L_0x0157
            o.setContentInsetEndWithActions r3 = new o.setContentInsetEndWithActions
            r3.<init>(r1)
            r1.MediaBrowserCompat$SearchResultReceiver = r3
        L_0x0157:
            o.setContentInsetEndWithActions r3 = r1.MediaBrowserCompat$SearchResultReceiver
            boolean r5 = r3.MediaBrowserCompat$ItemReceiver
            r3.MediaBrowserCompat$ItemReceiver = r4
            o.setContentInsetEndWithActions r3 = r1.MediaBrowserCompat$SearchResultReceiver
            r3.onTouch(r1, r2)
            goto L_0x0171
        L_0x0163:
            o.setContentInsetEndWithActions r2 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x0171
            boolean r3 = r2.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x016e
            r2.IconCompatParcelizer()
        L_0x016e:
            r3 = 0
            r2.MediaBrowserCompat$ItemReceiver = r3
        L_0x0171:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.write(android.view.MotionEvent, int):boolean");
    }

    private void MediaBrowserCompat$ItemReceiver() {
        Drawable selector = getSelector();
        if (selector != null && this.write && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.ParcelableVolumeInfo.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.ParcelableVolumeInfo);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
