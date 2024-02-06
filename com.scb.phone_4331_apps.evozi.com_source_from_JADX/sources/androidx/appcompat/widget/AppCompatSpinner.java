package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import p040o.ActionMenuPresenter$OverflowMenuButton;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.SwitchCompat;
import p040o.setActionBarHideOffset;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setShowText;
import p040o.setUiOptions;

public class AppCompatSpinner extends Spinner implements setShowText {
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {16843505};
    write IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    private SpinnerAdapter MediaBrowserCompat$MediaItem;
    private final Context MediaBrowserCompat$SearchResultReceiver;
    private final boolean MediaDescriptionCompat;
    private ActionMenuPresenter$OverflowMenuButton RatingCompat;
    private final setActionBarHideOffset read;
    final Rect write;

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r12 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r12 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.write = r0
            int[] r0 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner
            o.AlertController$RecycleListView$MediaDescriptionCompat r1 = new o.AlertController$RecycleListView$MediaDescriptionCompat
            r2 = 0
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r0, r10, r2)
            r1.<init>(r8, r0)
            o.setActionBarHideOffset r0 = new o.setActionBarHideOffset
            r0.<init>(r7)
            r7.read = r0
            r0 = 0
            if (r12 == 0) goto L_0x0028
            o.setPopupCallback r3 = new o.setPopupCallback
            r3.<init>((android.content.Context) r8, (android.content.res.Resources.Theme) r12)
            r7.MediaBrowserCompat$SearchResultReceiver = r3
            goto L_0x0045
        L_0x0028:
            int r12 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner_popupTheme
            android.content.res.TypedArray r3 = r1.MediaBrowserCompat$ItemReceiver
            int r12 = r3.getResourceId(r12, r2)
            if (r12 == 0) goto L_0x003a
            o.setPopupCallback r3 = new o.setPopupCallback
            r3.<init>((android.content.Context) r8, (int) r12)
            r7.MediaBrowserCompat$SearchResultReceiver = r3
            goto L_0x0045
        L_0x003a:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0042
            r12 = r8
            goto L_0x0043
        L_0x0042:
            r12 = r0
        L_0x0043:
            r7.MediaBrowserCompat$SearchResultReceiver = r12
        L_0x0045:
            android.content.Context r12 = r7.MediaBrowserCompat$SearchResultReceiver
            r3 = 1
            if (r12 == 0) goto L_0x00c0
            r12 = -1
            if (r11 != r12) goto L_0x007d
            int[] r12 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r2)     // Catch:{ Exception -> 0x0067, all -> 0x0065 }
            boolean r4 = r12.hasValue(r2)     // Catch:{ Exception -> 0x0063 }
            if (r4 == 0) goto L_0x005d
            int r11 = r12.getInt(r2, r2)     // Catch:{ Exception -> 0x0063 }
        L_0x005d:
            if (r12 == 0) goto L_0x007d
            goto L_0x0073
        L_0x0060:
            r8 = move-exception
            r0 = r12
            goto L_0x0077
        L_0x0063:
            r4 = move-exception
            goto L_0x006a
        L_0x0065:
            r8 = move-exception
            goto L_0x0077
        L_0x0067:
            r12 = move-exception
            r4 = r12
            r12 = r0
        L_0x006a:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x0060 }
            if (r12 == 0) goto L_0x007d
        L_0x0073:
            r12.recycle()
            goto L_0x007d
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            r0.recycle()
        L_0x007c:
            throw r8
        L_0x007d:
            if (r11 != r3) goto L_0x00c0
            androidx.appcompat.widget.AppCompatSpinner$write r11 = new androidx.appcompat.widget.AppCompatSpinner$write
            android.content.Context r12 = r7.MediaBrowserCompat$SearchResultReceiver
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.MediaBrowserCompat$SearchResultReceiver
            int[] r4 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner
            o.AlertController$RecycleListView$MediaDescriptionCompat r5 = new o.AlertController$RecycleListView$MediaDescriptionCompat
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r9, r4, r10, r2)
            r5.<init>(r12, r2)
            int r12 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner_android_dropDownWidth
            r2 = -2
            android.content.res.TypedArray r4 = r5.MediaBrowserCompat$ItemReceiver
            int r12 = r4.getLayoutDimension(r12, r2)
            r7.MediaBrowserCompat$ItemReceiver = r12
            int r12 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r12 = r5.MediaBrowserCompat$ItemReceiver(r12)
            r11.read((android.graphics.drawable.Drawable) r12)
            int r12 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner_android_prompt
            android.content.res.TypedArray r2 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.String r12 = r2.getString(r12)
            r11.MediaBrowserCompat$CustomActionResultReceiver((java.lang.CharSequence) r12)
            android.content.res.TypedArray r12 = r5.MediaBrowserCompat$ItemReceiver
            r12.recycle()
            r7.IconCompatParcelizer = r11
            androidx.appcompat.widget.AppCompatSpinner$1 r12 = new androidx.appcompat.widget.AppCompatSpinner$1
            r12.<init>(r7, r11)
            r7.RatingCompat = r12
        L_0x00c0:
            int r11 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Spinner_android_entries
            android.content.res.TypedArray r12 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.CharSequence[] r11 = r12.getTextArray(r11)
            if (r11 == 0) goto L_0x00da
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r2, r11)
            int r8 = p040o.AlertController$RecycleListView.MediaMetadataCompat.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        L_0x00da:
            android.content.res.TypedArray r8 = r1.MediaBrowserCompat$ItemReceiver
            r8.recycle()
            r7.MediaDescriptionCompat = r3
            android.widget.SpinnerAdapter r8 = r7.MediaBrowserCompat$MediaItem
            if (r8 == 0) goto L_0x00ea
            r7.setAdapter(r8)
            r7.MediaBrowserCompat$MediaItem = r0
        L_0x00ea:
            o.setActionBarHideOffset r8 = r7.read
            r8.IconCompatParcelizer(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public Context getPopupContext() {
        if (this.IconCompatParcelizer != null) {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.read(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            return write2.RatingCompat();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.MediaBrowserCompat$SearchResultReceiver(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            return write2.MediaSessionCompat$Token();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.read(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            return write2.MediaMetadataCompat();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.IconCompatParcelizer != null) {
            this.MediaBrowserCompat$ItemReceiver = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.IconCompatParcelizer != null) {
            return this.MediaBrowserCompat$ItemReceiver;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.MediaDescriptionCompat) {
            this.MediaBrowserCompat$MediaItem = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.IconCompatParcelizer != null) {
            Context context = this.MediaBrowserCompat$SearchResultReceiver;
            if (context == null) {
                context = getContext();
            }
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((ListAdapter) new AppCompatSpinner$MediaBrowserCompat$ItemReceiver(spinnerAdapter, context.getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        write write2 = this.IconCompatParcelizer;
        if (write2 != null && write2.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.IconCompatParcelizer.IconCompatParcelizer();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = this.RatingCompat;
        if (actionMenuPresenter$OverflowMenuButton == null || !actionMenuPresenter$OverflowMenuButton.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.IconCompatParcelizer != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), read(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        write write2 = this.IconCompatParcelizer;
        if (write2 == null) {
            return super.performClick();
        }
        if (write2.MediaBrowserCompat$CustomActionResultReceiver()) {
            return true;
        }
        this.IconCompatParcelizer.MediaDescriptionCompat();
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        write write2 = this.IconCompatParcelizer;
        return write2 != null ? write2.read() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.MediaBrowserCompat$ItemReceiver(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$ItemReceiver();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.IconCompatParcelizer(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.write();
        }
    }

    /* access modifiers changed from: package-private */
    public int read(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.write);
        return i + this.write.left + this.write.right;
    }

    class write extends setUiOptions {
        ListAdapter MediaBrowserCompat$ItemReceiver;
        private final Rect MediaBrowserCompat$MediaItem = new Rect();
        private CharSequence MediaMetadataCompat;

        public write(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            IconCompatParcelizer((View) AppCompatSpinner.this);
            write(true);
            RatingCompat(0);
            IconCompatParcelizer((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(AppCompatSpinner.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, write.this.MediaBrowserCompat$ItemReceiver.getItemId(i));
                    }
                    write.this.IconCompatParcelizer();
                }
            });
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(ListAdapter listAdapter) {
            super.MediaBrowserCompat$CustomActionResultReceiver(listAdapter);
            this.MediaBrowserCompat$ItemReceiver = listAdapter;
        }

        public CharSequence read() {
            return this.MediaMetadataCompat;
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) {
            this.MediaMetadataCompat = charSequence;
        }

        /* access modifiers changed from: package-private */
        public void MediaBrowserCompat$ItemReceiver() {
            Drawable RatingCompat = RatingCompat();
            int i = 0;
            if (RatingCompat != null) {
                RatingCompat.getPadding(AppCompatSpinner.this.write);
                i = setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(AppCompatSpinner.this) ? AppCompatSpinner.this.write.right : -AppCompatSpinner.this.write.left;
            } else {
                Rect rect = AppCompatSpinner.this.write;
                AppCompatSpinner.this.write.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.MediaBrowserCompat$ItemReceiver == -2) {
                int read2 = AppCompatSpinner.this.read((SpinnerAdapter) this.MediaBrowserCompat$ItemReceiver, RatingCompat());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.write.left) - AppCompatSpinner.this.write.right;
                if (read2 > i2) {
                    read2 = i2;
                }
                IconCompatParcelizer(Math.max(read2, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.MediaBrowserCompat$ItemReceiver == -1) {
                IconCompatParcelizer((width - paddingLeft) - paddingRight);
            } else {
                IconCompatParcelizer(AppCompatSpinner.this.MediaBrowserCompat$ItemReceiver);
            }
            read(setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(AppCompatSpinner.this) ? i + ((width - paddingRight) - MediaSessionCompat$QueueItem()) : i + paddingLeft);
        }

        public void MediaDescriptionCompat() {
            ViewTreeObserver viewTreeObserver;
            boolean MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver(2);
            super.MediaDescriptionCompat();
            write().setChoiceMode(1);
            MediaBrowserCompat$MediaItem(AppCompatSpinner.this.getSelectedItemPosition());
            if (!MediaBrowserCompat$CustomActionResultReceiver && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                final C00231 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        write write = write.this;
                        if (!write.MediaBrowserCompat$CustomActionResultReceiver((View) AppCompatSpinner.this)) {
                            write.this.IconCompatParcelizer();
                            return;
                        }
                        write.this.MediaBrowserCompat$ItemReceiver();
                        write.super.MediaDescriptionCompat();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                IconCompatParcelizer((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        public boolean MediaBrowserCompat$CustomActionResultReceiver(View view) {
            return SwitchCompat.setExpandedFormat(view) && view.getGlobalVisibleRect(this.MediaBrowserCompat$MediaItem);
        }
    }
}
