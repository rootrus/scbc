package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.SwitchCompat;

public class ButtonBarLayout extends LinearLayout {
    private int read = -1;
    private boolean write;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ButtonBarLayout);
        this.write = obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.write != z) {
            this.write = z;
            if (!z && getOrientation() == 1) {
                write(false);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.write) {
            if (size > this.read) {
                if (getOrientation() == 1) {
                    write(false);
                }
            }
            this.read = size;
        }
        if ((getOrientation() == 1) || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, PKIFailureInfo.systemUnavail);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.write) {
            if (!(getOrientation() == 1)) {
                if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                    write(true);
                    z = true;
                }
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (getOrientation() == 1) {
                i5 = 1;
            }
            if (i5 != 0) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingTop += getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            } else {
                i5 = paddingTop + getPaddingBottom();
            }
        }
        if (SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this) != i5) {
            setMinimumHeight(i5);
        }
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    private void write(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }
}
