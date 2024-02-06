package p040o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.DropDownListView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule;

/* renamed from: o.setUiOptions */
public class setUiOptions implements CheckCaptureModule.C6375a, Runnable, AdapterView.OnItemSelectedListener, AbsListView.OnScrollListener, View.OnTouchListener {
    private static Method MediaBrowserCompat$ItemReceiver;
    private static Method MediaBrowserCompat$SearchResultReceiver;
    private static Method read;
    private AdapterView.OnItemSelectedListener ActionMenuItemView;
    private int AlertController$RecycleListView;
    private final write AppCompatActivity;
    private boolean AppCompatDelegateImpl$ListMenuDecorView;
    private AdapterView.OnItemClickListener AppCompatDialogFragment;
    private boolean AppCompatViewInflater;
    int IconCompatParcelizer;
    private int Keep;
    final Handler MediaBrowserCompat$CustomActionResultReceiver;
    private Context MediaBrowserCompat$MediaItem;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f2652x50fd9e4a;
    final setUiOptions$MediaBrowserCompat$CustomActionResultReceiver MediaDescriptionCompat;
    private ListAdapter MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private View ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    public PopupWindow RatingCompat;
    private Rect setBackgroundResource;
    private DataSetObserver setCheckable;
    private boolean setChecked;
    private boolean setContentView;
    private boolean setExpandedFormat;
    private Drawable setHasDecor;
    private int setIcon;
    private Runnable setItemInvoker;
    private final setUiOptions setPadding;
    private View setPopupCallback;
    private final Rect setShortcut;
    private final setUiOptions setTitle;
    DropDownListView write;

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    static {
        try {
            MediaBrowserCompat$ItemReceiver = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            read = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            MediaBrowserCompat$SearchResultReceiver = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public setUiOptions(Context context) {
        this(context, (AttributeSet) null, AlertController$RecycleListView.read.listPopupWindowStyle);
    }

    public setUiOptions(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.listPopupWindowStyle);
    }

    public setUiOptions(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public setUiOptions(Context context, AttributeSet attributeSet, int i, int i2) {
        this.MediaSessionCompat$Token = -2;
        this.AlertController$RecycleListView = -2;
        this.PlaybackStateCompat$CustomAction = 1002;
        this.AppCompatDelegateImpl$ListMenuDecorView = true;
        this.f2652x50fd9e4a = 0;
        this.MediaSessionCompat$QueueItem = false;
        this.setContentView = false;
        this.IconCompatParcelizer = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.setIcon = 0;
        this.MediaDescriptionCompat = new setUiOptions$MediaBrowserCompat$CustomActionResultReceiver(this);
        this.setTitle = this;
        this.setPadding = this;
        this.AppCompatActivity = new write();
        this.setShortcut = new Rect();
        this.MediaBrowserCompat$MediaItem = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ListPopupWindow, i, i2);
        this.MediaSessionCompat$ResultReceiverWrapper = obtainStyledAttributes.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.Keep = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.PlaybackStateCompat = true;
        }
        obtainStyledAttributes.recycle();
        setOverlayMode setoverlaymode = new setOverlayMode(context, attributeSet, i, i2);
        this.RatingCompat = setoverlaymode;
        setoverlaymode.setInputMethodMode(1);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.setCheckable;
        if (dataSetObserver == null) {
            this.setCheckable = new setUiOptions$MediaBrowserCompat$ItemReceiver(this);
        } else {
            ListAdapter listAdapter2 = this.MediaMetadataCompat;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.MediaMetadataCompat = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.setCheckable);
        }
        DropDownListView dropDownListView = this.write;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.MediaMetadataCompat);
        }
    }

    public void RatingCompat(int i) {
        this.setIcon = i;
    }

    public void write(boolean z) {
        this.setExpandedFormat = z;
        this.RatingCompat.setFocusable(z);
    }

    public boolean ParcelableVolumeInfo() {
        return this.setExpandedFormat;
    }

    public Drawable RatingCompat() {
        return this.RatingCompat.getBackground();
    }

    public void read(Drawable drawable) {
        this.RatingCompat.setBackgroundDrawable(drawable);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.RatingCompat.setAnimationStyle(i);
    }

    public View MediaBrowserCompat$MediaItem() {
        return this.ParcelableVolumeInfo;
    }

    public void IconCompatParcelizer(View view) {
        this.ParcelableVolumeInfo = view;
    }

    public int MediaMetadataCompat() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public void read(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
    }

    public int MediaSessionCompat$Token() {
        if (!this.PlaybackStateCompat) {
            return 0;
        }
        return this.Keep;
    }

    public void MediaBrowserCompat$SearchResultReceiver(int i) {
        this.Keep = i;
        this.PlaybackStateCompat = true;
    }

    public void write(Rect rect) {
        this.setBackgroundResource = rect;
    }

    public void write(int i) {
        this.f2652x50fd9e4a = i;
    }

    public int MediaSessionCompat$QueueItem() {
        return this.AlertController$RecycleListView;
    }

    public void MediaDescriptionCompat(int i) {
        this.AlertController$RecycleListView = i;
    }

    public void IconCompatParcelizer(int i) {
        Drawable background = this.RatingCompat.getBackground();
        if (background != null) {
            background.getPadding(this.setShortcut);
            this.AlertController$RecycleListView = this.setShortcut.left + this.setShortcut.right + i;
            return;
        }
        MediaDescriptionCompat(i);
    }

    public void IconCompatParcelizer(AdapterView.OnItemClickListener onItemClickListener) {
        this.AppCompatDialogFragment = onItemClickListener;
    }

    public void MediaDescriptionCompat() {
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        boolean MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
        setCollapsible.write(this.RatingCompat, this.PlaybackStateCompat$CustomAction);
        boolean z = true;
        if (!this.RatingCompat.isShowing()) {
            int i = this.AlertController$RecycleListView;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = MediaBrowserCompat$MediaItem().getWidth();
            }
            int i2 = this.MediaSessionCompat$Token;
            if (i2 == -1) {
                MediaBrowserCompat$ItemReceiver2 = -1;
            } else if (i2 != -2) {
                MediaBrowserCompat$ItemReceiver2 = i2;
            }
            this.RatingCompat.setWidth(i);
            this.RatingCompat.setHeight(MediaBrowserCompat$ItemReceiver2);
            MediaBrowserCompat$CustomActionResultReceiver(true);
            this.RatingCompat.setOutsideTouchable(!this.setContentView && !this.MediaSessionCompat$QueueItem);
            this.RatingCompat.setTouchInterceptor(this.setTitle);
            if (this.AppCompatViewInflater) {
                setCollapsible.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, this.setChecked);
            }
            Method method = MediaBrowserCompat$SearchResultReceiver;
            if (method != null) {
                try {
                    method.invoke(this.RatingCompat, new Object[]{this.setBackgroundResource});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            setCollapsible.MediaBrowserCompat$ItemReceiver(this.RatingCompat, MediaBrowserCompat$MediaItem(), this.MediaSessionCompat$ResultReceiverWrapper, this.Keep, this.f2652x50fd9e4a);
            this.write.setSelection(-1);
            if (!this.setExpandedFormat || this.write.isInTouchMode()) {
                MediaBrowserCompat$SearchResultReceiver();
            }
            if (!this.setExpandedFormat) {
                this.MediaBrowserCompat$CustomActionResultReceiver.post(this.AppCompatActivity);
            }
        } else if (SwitchCompat.setExpandedFormat(MediaBrowserCompat$MediaItem())) {
            int i3 = this.AlertController$RecycleListView;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = MediaBrowserCompat$MediaItem().getWidth();
            }
            int i4 = this.MediaSessionCompat$Token;
            if (i4 == -1) {
                if (!MediaSessionCompat$ResultReceiverWrapper2) {
                    MediaBrowserCompat$ItemReceiver2 = -1;
                }
                if (MediaSessionCompat$ResultReceiverWrapper2) {
                    this.RatingCompat.setWidth(this.AlertController$RecycleListView == -1 ? -1 : 0);
                    this.RatingCompat.setHeight(0);
                } else {
                    this.RatingCompat.setWidth(this.AlertController$RecycleListView == -1 ? -1 : 0);
                    this.RatingCompat.setHeight(-1);
                }
            } else if (i4 != -2) {
                MediaBrowserCompat$ItemReceiver2 = i4;
            }
            PopupWindow popupWindow = this.RatingCompat;
            if (this.setContentView || this.MediaSessionCompat$QueueItem) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.RatingCompat.update(MediaBrowserCompat$MediaItem(), this.MediaSessionCompat$ResultReceiverWrapper, this.Keep, i3 < 0 ? -1 : i3, MediaBrowserCompat$ItemReceiver2 < 0 ? -1 : MediaBrowserCompat$ItemReceiver2);
        }
    }

    public void IconCompatParcelizer() {
        this.RatingCompat.dismiss();
        read();
        this.RatingCompat.setContentView((View) null);
        this.write = null;
        this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this.MediaDescriptionCompat);
    }

    public void IconCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.RatingCompat.setOnDismissListener(onDismissListener);
    }

    private void read() {
        View view = this.setPopupCallback;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.setPopupCallback);
            }
        }
    }

    public void MediaBrowserCompat$ItemReceiver(int i) {
        this.RatingCompat.setInputMethodMode(i);
    }

    public void MediaBrowserCompat$MediaItem(int i) {
        DropDownListView dropDownListView = this.write;
        if (MediaBrowserCompat$CustomActionResultReceiver() && dropDownListView != null) {
            dropDownListView.read = false;
            dropDownListView.setSelection(i);
            if (dropDownListView.getChoiceMode() != 0) {
                dropDownListView.setItemChecked(i, true);
            }
        }
    }

    public void MediaBrowserCompat$SearchResultReceiver() {
        DropDownListView dropDownListView = this.write;
        if (dropDownListView != null) {
            dropDownListView.read = true;
            dropDownListView.requestLayout();
        }
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.RatingCompat.isShowing();
    }

    public boolean MediaSessionCompat$ResultReceiverWrapper() {
        return this.RatingCompat.getInputMethodMode() == 2;
    }

    public ListView write() {
        return this.write;
    }

    /* access modifiers changed from: protected */
    public DropDownListView IconCompatParcelizer(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.DropDownListView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int MediaBrowserCompat$ItemReceiver() {
        /*
            r12 = this;
            androidx.appcompat.widget.DropDownListView r0 = r12.write
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b4
            android.content.Context r0 = r12.MediaBrowserCompat$MediaItem
            r12.setItemInvoker = r12
            boolean r5 = r12.setExpandedFormat
            r5 = r5 ^ r3
            androidx.appcompat.widget.DropDownListView r5 = r12.IconCompatParcelizer(r0, r5)
            r12.write = r5
            android.graphics.drawable.Drawable r6 = r12.setHasDecor
            if (r6 == 0) goto L_0x001d
            r5.setSelector(r6)
        L_0x001d:
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            android.widget.ListAdapter r6 = r12.MediaMetadataCompat
            r5.setAdapter(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            android.widget.AdapterView$OnItemClickListener r6 = r12.AppCompatDialogFragment
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            r5.setFocusable(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            r5.setOnItemSelectedListener(r12)
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            o.setUiOptions r6 = r12.setPadding
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.ActionMenuItemView
            if (r5 == 0) goto L_0x004a
            androidx.appcompat.widget.DropDownListView r6 = r12.write
            r6.setOnItemSelectedListener(r5)
        L_0x004a:
            androidx.appcompat.widget.DropDownListView r5 = r12.write
            android.view.View r6 = r12.setPopupCallback
            if (r6 == 0) goto L_0x00ad
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.setIcon
            if (r8 == 0) goto L_0x0085
            if (r8 == r3) goto L_0x007e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.setIcon
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x008b
        L_0x007e:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008b
        L_0x0085:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008b:
            int r0 = r12.AlertController$RecycleListView
            if (r0 < 0) goto L_0x0091
            r5 = r1
            goto L_0x0093
        L_0x0091:
            r0 = r4
            r5 = r0
        L_0x0093:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00ae
        L_0x00ad:
            r0 = r4
        L_0x00ae:
            android.widget.PopupWindow r6 = r12.RatingCompat
            r6.setContentView(r5)
            goto L_0x00cf
        L_0x00b4:
            android.widget.PopupWindow r0 = r12.RatingCompat
            r0.getContentView()
            android.view.View r0 = r12.setPopupCallback
            if (r0 == 0) goto L_0x00ce
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00cf
        L_0x00ce:
            r0 = r4
        L_0x00cf:
            android.widget.PopupWindow r5 = r12.RatingCompat
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f1
            android.graphics.Rect r6 = r12.setShortcut
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.setShortcut
            int r5 = r5.top
            android.graphics.Rect r6 = r12.setShortcut
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r12.PlaybackStateCompat
            if (r6 != 0) goto L_0x00f7
            android.graphics.Rect r6 = r12.setShortcut
            int r6 = r6.top
            int r6 = -r6
            r12.Keep = r6
            goto L_0x00f7
        L_0x00f1:
            android.graphics.Rect r5 = r12.setShortcut
            r5.setEmpty()
            r5 = r4
        L_0x00f7:
            android.widget.PopupWindow r6 = r12.RatingCompat
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 == r7) goto L_0x0101
            r3 = r4
        L_0x0101:
            android.view.View r4 = r12.MediaBrowserCompat$MediaItem()
            int r6 = r12.Keep
            int r3 = r12.write(r4, r6, r3)
            boolean r4 = r12.MediaSessionCompat$QueueItem
            if (r4 != 0) goto L_0x0175
            int r4 = r12.MediaSessionCompat$Token
            if (r4 == r2) goto L_0x0175
            int r4 = r12.AlertController$RecycleListView
            r6 = -2
            if (r4 == r6) goto L_0x013c
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0121
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0156
        L_0x0121:
            android.content.Context r2 = r12.MediaBrowserCompat$MediaItem
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.setShortcut
            int r4 = r4.left
            android.graphics.Rect r6 = r12.setShortcut
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0156
        L_0x013c:
            android.content.Context r2 = r12.MediaBrowserCompat$MediaItem
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.setShortcut
            int r4 = r4.left
            android.graphics.Rect r6 = r12.setShortcut
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0156:
            r7 = r1
            androidx.appcompat.widget.DropDownListView r6 = r12.write
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.write(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0173
            androidx.appcompat.widget.DropDownListView r2 = r12.write
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r3 = r12.write
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0173:
            int r1 = r1 + r0
            return r1
        L_0x0175:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setUiOptions.MediaBrowserCompat$ItemReceiver():int");
    }

    public void read(boolean z) {
        this.AppCompatViewInflater = true;
        this.setChecked = z;
    }

    /* renamed from: o.setUiOptions$write */
    class write implements Runnable {
        write() {
        }

        public final void run() {
            setUiOptions.this.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Method method = MediaBrowserCompat$ItemReceiver;
        if (method != null) {
            try {
                method.invoke(this.RatingCompat, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int write(View view, int i, boolean z) {
        Method method = read;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.RatingCompat, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.RatingCompat.getMaxAvailableHeight(view, i);
    }

    public void run() {
        View MediaBrowserCompat$MediaItem2 = MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem2 != null && MediaBrowserCompat$MediaItem2.getWindowToken() != null) {
            MediaDescriptionCompat();
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        DropDownListView dropDownListView;
        if (i != -1 && (dropDownListView = this.write) != null) {
            dropDownListView.read = false;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !MediaSessionCompat$ResultReceiverWrapper() && this.RatingCompat.getContentView() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this.MediaDescriptionCompat);
            this.MediaDescriptionCompat.run();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (popupWindow = this.RatingCompat) != null && popupWindow.isShowing() && x >= 0 && x < this.RatingCompat.getWidth() && y >= 0 && y < this.RatingCompat.getHeight()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.postDelayed(this.MediaDescriptionCompat, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this.MediaDescriptionCompat);
            return false;
        }
    }
}
