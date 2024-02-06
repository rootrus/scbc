package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView$MediaBrowserCompat$ItemReceiver;
import androidx.appcompat.widget.AppCompatTextView;
import p040o.ActionMenuPresenter$OverflowMenuButton;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.CheckCaptureModule;
import p040o.MenuItemImpl;
import p040o.setTabContainer;

public class ActionMenuItemView extends AppCompatTextView implements setTabContainer.read, View.OnClickListener, ActionMenuView$MediaBrowserCompat$ItemReceiver {
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    MenuItemImpl.write MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private CharSequence f3x50fd9e4a;
    private ActionMenuPresenter$OverflowMenuButton MediaDescriptionCompat;
    private Drawable MediaMetadataCompat;
    private int RatingCompat;
    MenuItemImpl mItemData;
    ActionMenuItemView$MediaBrowserCompat$ItemReceiver read;

    public final boolean read() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMenuItemView, i, 0);
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.RatingCompat = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.MediaBrowserCompat$SearchResultReceiver = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver();
        RatingCompat();
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        super.setPadding(i, i2, i3, i4);
    }

    public final MenuItemImpl IconCompatParcelizer() {
        return this.mItemData;
    }

    public final void read(MenuItemImpl menuItemImpl) {
        CharSequence charSequence;
        this.mItemData = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        if (read()) {
            charSequence = menuItemImpl.getTitleCondensed();
        } else {
            charSequence = menuItemImpl.getTitle();
        }
        setTitle(charSequence);
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new read();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton;
        if (!this.mItemData.hasSubMenu() || (actionMenuPresenter$OverflowMenuButton = this.MediaDescriptionCompat) == null || !actionMenuPresenter$OverflowMenuButton.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        MenuItemImpl.write write = this.MediaBrowserCompat$ItemReceiver;
        if (write != null) {
            write.MediaBrowserCompat$ItemReceiver(this.mItemData);
        }
    }

    public void setItemInvoker(MenuItemImpl.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public void setPopupCallback(ActionMenuItemView$MediaBrowserCompat$ItemReceiver actionMenuItemView$MediaBrowserCompat$ItemReceiver) {
        this.read = actionMenuItemView$MediaBrowserCompat$ItemReceiver;
    }

    public void setExpandedFormat(boolean z) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            MenuItemImpl menuItemImpl = this.mItemData;
            if (menuItemImpl != null) {
                MenuItemImpl menuItemImpl2 = menuItemImpl.write;
                menuItemImpl2.MediaDescriptionCompat = true;
                menuItemImpl2.IconCompatParcelizer(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r5.MediaBrowserCompat$CustomActionResultReceiver != false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void RatingCompat() {
        /*
            r5 = this;
            java.lang.CharSequence r0 = r5.f3x50fd9e4a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.graphics.drawable.Drawable r1 = r5.MediaMetadataCompat
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0021
            androidx.appcompat.view.menu.MenuItemImpl r1 = r5.mItemData
            int r1 = r1.MediaMetadataCompat
            r4 = 4
            r1 = r1 & r4
            if (r1 != r4) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x0022
            boolean r1 = r5.IconCompatParcelizer
            if (r1 != 0) goto L_0x0021
            boolean r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r2 = r3
        L_0x0022:
            r0 = r0 ^ r3
            r0 = r0 & r2
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.CharSequence r2 = r5.f3x50fd9e4a
            goto L_0x002b
        L_0x002a:
            r2 = r1
        L_0x002b:
            r5.setText(r2)
            androidx.appcompat.view.menu.MenuItemImpl r2 = r5.mItemData
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0048
            if (r0 == 0) goto L_0x003e
            r2 = r1
            goto L_0x0044
        L_0x003e:
            androidx.appcompat.view.menu.MenuItemImpl r2 = r5.mItemData
            java.lang.CharSequence r2 = r2.getTitle()
        L_0x0044:
            r5.setContentDescription(r2)
            goto L_0x004b
        L_0x0048:
            r5.setContentDescription(r2)
        L_0x004b:
            androidx.appcompat.view.menu.MenuItemImpl r2 = r5.mItemData
            java.lang.CharSequence r2 = r2.getTooltipText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            androidx.appcompat.view.menu.MenuItemImpl r0 = r5.mItemData
            java.lang.CharSequence r1 = r0.getTitle()
        L_0x0060:
            p040o.ActivityChooserView.MediaBrowserCompat$ItemReceiver(r5, r1)
            return
        L_0x0064:
            p040o.ActivityChooserView.MediaBrowserCompat$ItemReceiver(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.RatingCompat():void");
    }

    public void setIcon(Drawable drawable) {
        this.MediaMetadataCompat = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.RatingCompat;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.RatingCompat;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        RatingCompat();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3x50fd9e4a = charSequence;
        RatingCompat();
    }

    class read extends ActionMenuPresenter$OverflowMenuButton {
        public read() {
            super(ActionMenuItemView.this);
        }

        public final CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver() {
            if (ActionMenuItemView.this.read != null) {
                return ActionMenuItemView.this.read.read();
            }
            return null;
        }

        public final boolean read() {
            CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver2;
            if (ActionMenuItemView.this.MediaBrowserCompat$ItemReceiver == null || !ActionMenuItemView.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(ActionMenuItemView.this.mItemData) || (MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver()) == null || !MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean write() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.mItemData.getIcon() == null;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.MediaBrowserCompat$SearchResultReceiver) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.MediaBrowserCompat$MediaItem) : this.MediaBrowserCompat$MediaItem;
        if (mode != 1073741824 && this.MediaBrowserCompat$MediaItem > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!z && this.MediaMetadataCompat != null) {
            super.setPadding((getMeasuredWidth() - this.MediaMetadataCompat.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }
}
