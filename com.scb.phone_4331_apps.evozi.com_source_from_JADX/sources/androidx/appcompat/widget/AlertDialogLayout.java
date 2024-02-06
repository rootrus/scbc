package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import p040o.AlertController$RecycleListView;
import p040o.SwitchCompat;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r0 = r10.getPaddingRight()
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.MediaDescriptionCompat()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r4 == r5) goto L_0x0031
            r5 = 80
            if (r4 == r5) goto L_0x0028
            int r13 = r10.getPaddingTop()
            goto L_0x003b
        L_0x0028:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L_0x003b
        L_0x0031:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r4 + r15
        L_0x003b:
            android.graphics.drawable.Drawable r15 = r10.MediaBrowserCompat$CustomActionResultReceiver()
            r1 = 0
            if (r15 != 0) goto L_0x0044
            r15 = r1
            goto L_0x0048
        L_0x0044:
            int r15 = r15.getIntrinsicHeight()
        L_0x0048:
            if (r1 >= r2) goto L_0x00ac
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto L_0x00a9
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x00a9
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r7 = (androidx.appcompat.widget.LinearLayoutCompat.write) r7
            int r8 = r7.RatingCompat
            if (r8 >= 0) goto L_0x006e
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r8 = r8 & r3
        L_0x006e:
            int r9 = p040o.SwitchCompat.m3079x50fd9e4a(r10)
            int r8 = p040o.setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(r8, r9)
            r8 = r8 & 7
            r9 = 1
            if (r8 == r9) goto L_0x0088
            r9 = 5
            if (r8 == r9) goto L_0x0082
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L_0x0095
        L_0x0082:
            int r8 = r14 - r12
            int r8 = r8 - r5
            int r9 = r7.rightMargin
            goto L_0x0094
        L_0x0088:
            int r8 = r14 - r11
            int r8 = r8 - r0
            int r8 = r8 - r5
            int r8 = r8 / 2
            int r8 = r8 + r11
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
        L_0x0094:
            int r8 = r8 - r9
        L_0x0095:
            boolean r9 = r10.MediaBrowserCompat$CustomActionResultReceiver((int) r1)
            if (r9 == 0) goto L_0x009c
            int r13 = r13 + r15
        L_0x009c:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r6 + r13
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r13 = r13 + r6
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0048
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == AlertController$RecycleListView.MediaDescriptionCompat.topPanel) {
                        view = childAt;
                    } else if (id == AlertController$RecycleListView.MediaDescriptionCompat.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == AlertController$RecycleListView.MediaDescriptionCompat.contentPanel || id == AlertController$RecycleListView.MediaDescriptionCompat.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i10++;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i9, 0);
                    paddingTop += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i9, 0);
                    View view4 = view2;
                    while (true) {
                        i4 = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(view4);
                        if (i4 <= 0) {
                            if (!(view4 instanceof ViewGroup)) {
                                break;
                            }
                            ViewGroup viewGroup = (ViewGroup) view4;
                            if (viewGroup.getChildCount() != 1) {
                                break;
                            }
                            view4 = viewGroup.getChildAt(0);
                        } else {
                            break;
                        }
                    }
                    i4 = 0;
                    i5 = view2.getMeasuredHeight() - i4;
                    paddingTop += i4;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        i8 = 0;
                    } else {
                        i8 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i9, i8);
                    i6 = view3.getMeasuredHeight();
                    paddingTop += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i11 = size - paddingTop;
                if (view2 != null) {
                    int min = Math.min(i11, i5);
                    if (min > 0) {
                        i11 -= min;
                        i7 = min + i4;
                    } else {
                        i7 = i4;
                    }
                    view2.measure(i9, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                    paddingTop = (paddingTop - i4) + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i11 > 0) {
                    view3.measure(i9, View.MeasureSpec.makeMeasureSpec(i11 + i6, mode));
                    paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        i12 = Math.max(i12, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i12 + getPaddingLeft() + getPaddingRight(), i9, i3), View.resolveSizeAndState(paddingTop, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayoutCompat.write write = (LinearLayoutCompat.write) childAt3.getLayoutParams();
                            if (write.width == -1) {
                                int i15 = write.height;
                                write.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                write.height = i15;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        int i16 = i2;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
