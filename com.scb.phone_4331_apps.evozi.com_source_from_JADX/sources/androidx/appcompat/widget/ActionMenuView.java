package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.MenuItemImpl;
import p040o.MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setStackedBackground;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;
import p040o.setTabContainer;

public class ActionMenuView extends LinearLayoutCompat implements MenuItemImpl.write, setTabContainer {
    public boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    MenuItemImpl MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$SearchResultReceiver;
    private int MediaDescriptionCompat;
    private Context MediaMetadataCompat;
    private int RatingCompat;
    public setStackedBackground$MediaBrowserCompat$ItemReceiver mActionMenuPresenterCallback;
    public MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver mMenuBuilderCallback;
    public OnMenuItemClickListener mOnMenuItemClickListener;
    public ActionMenuPresenter read;
    private int write;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LinearLayoutCompat.write MediaBrowserCompat$ItemReceiver(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.RatingCompat = (int) (56.0f * f);
        this.MediaBrowserCompat$SearchResultReceiver = (int) (f * 4.0f);
        this.MediaMetadataCompat = context;
        this.MediaDescriptionCompat = 0;
    }

    public void setPopupTheme(int i) {
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            if (i == 0) {
                this.MediaMetadataCompat = getContext();
            } else {
                this.MediaMetadataCompat = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.read = actionMenuPresenter;
        actionMenuPresenter.PlaybackStateCompat = this;
        this.MediaBrowserCompat$ItemReceiver = actionMenuPresenter.f2647x50fd9e4a;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.read;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.write(false);
            if (this.read.IconCompatParcelizer()) {
                this.read.write();
                this.read.MediaBrowserCompat$MediaItem();
            }
        }
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        MenuItemImpl menuItemImpl;
        boolean z3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.MediaBrowserCompat$CustomActionResultReceiver = z4;
        if (z3 != z4) {
            this.write = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.MediaBrowserCompat$CustomActionResultReceiver || (menuItemImpl = this.MediaBrowserCompat$ItemReceiver) == null || size == this.write)) {
            this.write = size;
            menuItemImpl.IconCompatParcelizer(true);
        }
        int childCount = getChildCount();
        if (!this.MediaBrowserCompat$CustomActionResultReceiver || childCount <= 0) {
            int i10 = i2;
            for (int i11 = 0; i11 < childCount; i11++) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) getChildAt(i11).getLayoutParams();
                iconCompatParcelizer.rightMargin = 0;
                iconCompatParcelizer.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i12 = size2 - (paddingLeft + paddingRight);
        int i13 = this.RatingCompat;
        int i14 = i12 / i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i15 = i13 + ((i12 % i13) / i14);
        int childCount2 = getChildCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        int i19 = 0;
        int i20 = 0;
        long j = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i6 = mode;
                i7 = i12;
                i8 = size3;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i21 = i16 + 1;
                if (z6) {
                    int i22 = this.MediaBrowserCompat$SearchResultReceiver;
                    i8 = size3;
                    z2 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i8 = size3;
                    z2 = false;
                }
                IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) childAt.getLayoutParams();
                iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = z2;
                iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = z2 ? 1 : 0;
                iconCompatParcelizer2.read = z2;
                iconCompatParcelizer2.IconCompatParcelizer = z2;
                iconCompatParcelizer2.leftMargin = z2;
                iconCompatParcelizer2.rightMargin = z2;
                iconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver = z6 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i23 = iconCompatParcelizer2.write ? 1 : i14;
                int i24 = i21;
                IconCompatParcelizer iconCompatParcelizer3 = (IconCompatParcelizer) childAt.getLayoutParams();
                i7 = i12;
                i6 = mode;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i23 <= 0 || (z7 && i23 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i15, PKIFailureInfo.systemUnavail), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i15;
                    if (measuredWidth % i15 != 0) {
                        i9++;
                    }
                    if (z7 && i9 < 2) {
                        i9 = 2;
                    }
                }
                iconCompatParcelizer3.IconCompatParcelizer = !iconCompatParcelizer3.write && z7;
                iconCompatParcelizer3.read = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i9, 1073741824), makeMeasureSpec);
                i20 = Math.max(i20, i9);
                if (iconCompatParcelizer2.IconCompatParcelizer) {
                    i17++;
                }
                if (iconCompatParcelizer2.write) {
                    z5 = true;
                }
                i14 -= i9;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j |= (long) (1 << i18);
                }
                i16 = i24;
            }
            i18++;
            size3 = i8;
            i12 = i7;
            mode = i6;
        }
        int i25 = mode;
        int i26 = i12;
        int i27 = size3;
        int i28 = i19;
        int i29 = i20;
        boolean z8 = z5 && i16 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 > 0 && i14 > 0) {
                int i30 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int i31 = 0;
                int i32 = 0;
                long j2 = 0;
                while (i31 < childCount2) {
                    IconCompatParcelizer iconCompatParcelizer4 = (IconCompatParcelizer) getChildAt(i31).getLayoutParams();
                    int i33 = i28;
                    if (iconCompatParcelizer4.IconCompatParcelizer) {
                        if (iconCompatParcelizer4.read < i30) {
                            j2 = 1 << i31;
                            i30 = iconCompatParcelizer4.read;
                            i32 = 1;
                        } else if (iconCompatParcelizer4.read == i30) {
                            j2 |= 1 << i31;
                            i32++;
                        }
                    }
                    i31++;
                    i28 = i33;
                }
                i3 = i28;
                j |= j2;
                if (i32 > i14) {
                    break;
                }
                int i34 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    IconCompatParcelizer iconCompatParcelizer5 = (IconCompatParcelizer) childAt2.getLayoutParams();
                    int i35 = i17;
                    long j3 = (long) (1 << i34);
                    if ((j2 & j3) == 0) {
                        if (iconCompatParcelizer5.read == i30 + 1) {
                            j |= j3;
                        }
                        z = z8;
                    } else {
                        if (!z8 || !iconCompatParcelizer5.MediaBrowserCompat$SearchResultReceiver || i14 != 1) {
                            z = z8;
                        } else {
                            int i36 = this.MediaBrowserCompat$SearchResultReceiver;
                            z = z8;
                            childAt2.setPadding(i36 + i15, 0, i36, 0);
                        }
                        iconCompatParcelizer5.read++;
                        iconCompatParcelizer5.MediaBrowserCompat$CustomActionResultReceiver = true;
                        i14--;
                    }
                    i34++;
                    i17 = i35;
                    z8 = z;
                }
                i28 = i3;
                z9 = true;
            } else {
                i3 = i28;
            }
        }
        i3 = i28;
        boolean z10 = !z5 && i16 == 1;
        if (i14 > 0 && j != 0 && (i14 < i16 - 1 || z10 || i29 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((IconCompatParcelizer) getChildAt(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver) {
                    bitCount -= 0.5f;
                }
                int i37 = childCount2 - 1;
                if ((j & ((long) (1 << i37))) != 0 && !((IconCompatParcelizer) getChildAt(i37).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver) {
                    bitCount -= 0.5f;
                }
            }
            int i38 = bitCount > BitmapDescriptorFactory.HUE_RED ? (int) (((float) (i14 * i15)) / bitCount) : 0;
            for (int i39 = 0; i39 < childCount2; i39++) {
                if ((j & ((long) (1 << i39))) != 0) {
                    View childAt3 = getChildAt(i39);
                    IconCompatParcelizer iconCompatParcelizer6 = (IconCompatParcelizer) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        iconCompatParcelizer6.MediaBrowserCompat$ItemReceiver = i38;
                        iconCompatParcelizer6.MediaBrowserCompat$CustomActionResultReceiver = true;
                        if (i39 == 0 && !iconCompatParcelizer6.MediaBrowserCompat$SearchResultReceiver) {
                            iconCompatParcelizer6.leftMargin = (-i38) / 2;
                        }
                        z9 = true;
                    } else if (iconCompatParcelizer6.write) {
                        iconCompatParcelizer6.MediaBrowserCompat$ItemReceiver = i38;
                        iconCompatParcelizer6.MediaBrowserCompat$CustomActionResultReceiver = true;
                        iconCompatParcelizer6.rightMargin = (-i38) / 2;
                        z9 = true;
                    } else {
                        if (i39 != 0) {
                            iconCompatParcelizer6.leftMargin = i38 / 2;
                        }
                        if (i39 != childCount2 - 1) {
                            iconCompatParcelizer6.rightMargin = i38 / 2;
                        }
                    }
                }
            }
        }
        if (z9) {
            for (int i40 = 0; i40 < childCount2; i40++) {
                View childAt4 = getChildAt(i40);
                IconCompatParcelizer iconCompatParcelizer7 = (IconCompatParcelizer) childAt4.getLayoutParams();
                if (iconCompatParcelizer7.MediaBrowserCompat$CustomActionResultReceiver) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((iconCompatParcelizer7.read * i15) + iconCompatParcelizer7.MediaBrowserCompat$ItemReceiver, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i25 == 1073741824) {
            i4 = i27;
            i5 = i26;
        } else {
            i5 = i26;
            i4 = i3;
        }
        setMeasuredDimension(i5, i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean MediaBrowserCompat$ItemReceiver2 = setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) childAt.getLayoutParams();
                if (iconCompatParcelizer.write) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (write(i11)) {
                        measuredWidth += MediaBrowserCompat$MediaItem;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (MediaBrowserCompat$ItemReceiver2) {
                        i5 = getPaddingLeft() + iconCompatParcelizer.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - iconCompatParcelizer.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + iconCompatParcelizer.leftMargin) + iconCompatParcelizer.rightMargin;
                    write(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (MediaBrowserCompat$ItemReceiver2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !iconCompatParcelizer2.write) {
                    int i17 = width - iconCompatParcelizer2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + iconCompatParcelizer2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            IconCompatParcelizer iconCompatParcelizer3 = (IconCompatParcelizer) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !iconCompatParcelizer3.write) {
                int i20 = paddingLeft + iconCompatParcelizer3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + iconCompatParcelizer3.rightMargin + max;
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.read;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.write();
            ActionMenuPresenter$MediaBrowserCompat$ItemReceiver actionMenuPresenter$MediaBrowserCompat$ItemReceiver = actionMenuPresenter.read;
            if (actionMenuPresenter$MediaBrowserCompat$ItemReceiver != null) {
                actionMenuPresenter$MediaBrowserCompat$ItemReceiver.read();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        MediaBrowserCompat$ItemReceiver();
        ActionMenuPresenter actionMenuPresenter = this.read;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.write;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.RatingCompat = true;
        actionMenuPresenter.MediaMetadataCompat = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.IconCompatParcelizer = z;
    }

    protected static IconCompatParcelizer write(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            IconCompatParcelizer iconCompatParcelizer = layoutParams instanceof IconCompatParcelizer ? new IconCompatParcelizer((IconCompatParcelizer) layoutParams) : new IconCompatParcelizer(layoutParams);
            if (iconCompatParcelizer.RatingCompat <= 0) {
                iconCompatParcelizer.RatingCompat = 16;
            }
            return iconCompatParcelizer;
        }
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
        iconCompatParcelizer2.RatingCompat = 16;
        return iconCompatParcelizer2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof IconCompatParcelizer);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(menuItemImpl, (setStackedBackground) null, 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
        this.MediaBrowserCompat$ItemReceiver = menuItemImpl;
    }

    public final Menu MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            Context context = getContext();
            MenuItemImpl menuItemImpl = new MenuItemImpl(context);
            this.MediaBrowserCompat$ItemReceiver = menuItemImpl;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver((MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) new ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver(this));
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.read = actionMenuPresenter;
            actionMenuPresenter.MediaBrowserCompat$SearchResultReceiver = true;
            actionMenuPresenter.ParcelableVolumeInfo = true;
            ActionMenuPresenter actionMenuPresenter2 = this.read;
            setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = this.mActionMenuPresenterCallback;
            if (setstackedbackground_mediabrowsercompat_itemreceiver == null) {
                setstackedbackground_mediabrowsercompat_itemreceiver = new read();
            }
            actionMenuPresenter2.MediaSessionCompat$Token = setstackedbackground_mediabrowsercompat_itemreceiver;
            MenuItemImpl menuItemImpl2 = this.MediaBrowserCompat$ItemReceiver;
            ActionMenuPresenter actionMenuPresenter3 = this.read;
            Context context2 = this.MediaMetadataCompat;
            menuItemImpl2.f2552x50fd9e4a.add(new WeakReference(actionMenuPresenter3));
            actionMenuPresenter3.IconCompatParcelizer(context2, menuItemImpl2);
            menuItemImpl2.MediaDescriptionCompat = true;
            ActionMenuPresenter actionMenuPresenter4 = this.read;
            actionMenuPresenter4.PlaybackStateCompat = this;
            this.MediaBrowserCompat$ItemReceiver = actionMenuPresenter4.f2647x50fd9e4a;
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public void setMenuCallbacks(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver, MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) {
        this.mActionMenuPresenterCallback = setstackedbackground_mediabrowsercompat_itemreceiver;
        this.mMenuBuilderCallback = menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
    }

    private boolean write(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuView$MediaBrowserCompat$ItemReceiver)) {
            z = false | ((ActionMenuView$MediaBrowserCompat$ItemReceiver) childAt).write();
        }
        return (i <= 0 || !(childAt2 instanceof ActionMenuView$MediaBrowserCompat$ItemReceiver)) ? z : z | ((ActionMenuView$MediaBrowserCompat$ItemReceiver) childAt2).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.read.IconCompatParcelizer = z;
    }

    static class read implements setStackedBackground$MediaBrowserCompat$ItemReceiver {
        public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
            return false;
        }

        public final void read(MenuItemImpl menuItemImpl, boolean z) {
        }

        read() {
        }
    }

    public static class IconCompatParcelizer extends LinearLayoutCompat.write {
        @ViewDebug.ExportedProperty
        public boolean IconCompatParcelizer;
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        @ViewDebug.ExportedProperty
        public int MediaBrowserCompat$ItemReceiver;
        @ViewDebug.ExportedProperty
        public boolean MediaBrowserCompat$SearchResultReceiver;
        @ViewDebug.ExportedProperty
        public int read;
        @ViewDebug.ExportedProperty
        public boolean write;

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer);
            this.write = iconCompatParcelizer.write;
        }

        public IconCompatParcelizer() {
            super(-2, -2);
            this.write = false;
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        iconCompatParcelizer.RatingCompat = 16;
        return iconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j_ */
    public /* synthetic */ LinearLayoutCompat.write mo449j_() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        iconCompatParcelizer.RatingCompat = 16;
        return iconCompatParcelizer;
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new IconCompatParcelizer(getContext(), attributeSet);
    }

    public /* synthetic */ LinearLayoutCompat.write MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet) {
        return new IconCompatParcelizer(getContext(), attributeSet);
    }

    public static IconCompatParcelizer read() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        iconCompatParcelizer.RatingCompat = 16;
        iconCompatParcelizer.write = true;
        return iconCompatParcelizer;
    }
}
