package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.getSupportImageTintList;
import p040o.getSupportImageTintMode;
import p040o.setImageBitmap;
import p040o.setImageDrawable;
import p040o.setImageResource;

public class ConstraintLayout extends ViewGroup {
    private getSupportImageTintMode IconCompatParcelizer = null;
    private int MediaBrowserCompat$CustomActionResultReceiver = -1;
    SparseArray<View> MediaBrowserCompat$ItemReceiver = new SparseArray<>();
    private HashMap<String, Integer> MediaBrowserCompat$MediaItem = new HashMap<>();
    private int MediaBrowserCompat$SearchResultReceiver = -1;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f12x50fd9e4a = 7;
    private boolean MediaDescriptionCompat = true;
    private int MediaMetadataCompat = -1;
    private int MediaSessionCompat$QueueItem = 0;
    private int MediaSessionCompat$ResultReceiverWrapper = 0;
    private int MediaSessionCompat$Token = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private final ArrayList<setImageResource> ParcelableVolumeInfo = new ArrayList<>(100);
    private int RatingCompat = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    setImageDrawable read = new setImageDrawable();
    private ArrayList<ConstraintHelper> write = new ArrayList<>(4);

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.MediaBrowserCompat$MediaItem == null) {
                this.MediaBrowserCompat$MediaItem = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.MediaBrowserCompat$MediaItem.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final Object write(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.MediaBrowserCompat$MediaItem;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.MediaBrowserCompat$MediaItem.get(str);
    }

    public ConstraintLayout(Context context) {
        super(context);
        read((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        read(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        read(attributeSet);
    }

    public void setId(int i) {
        this.MediaBrowserCompat$ItemReceiver.remove(getId());
        super.setId(i);
        this.MediaBrowserCompat$ItemReceiver.put(getId(), this);
    }

    private void read(AttributeSet attributeSet) {
        this.read.MediaBrowserCompat$SearchResultReceiver = this;
        this.MediaBrowserCompat$ItemReceiver.put(getId(), this);
        this.IconCompatParcelizer = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_android_minWidth) {
                    this.MediaSessionCompat$ResultReceiverWrapper = obtainStyledAttributes.getDimensionPixelOffset(index, this.MediaSessionCompat$ResultReceiverWrapper);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_android_minHeight) {
                    this.MediaSessionCompat$QueueItem = obtainStyledAttributes.getDimensionPixelOffset(index, this.MediaSessionCompat$QueueItem);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_android_maxWidth) {
                    this.MediaSessionCompat$Token = obtainStyledAttributes.getDimensionPixelOffset(index, this.MediaSessionCompat$Token);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_android_maxHeight) {
                    this.RatingCompat = obtainStyledAttributes.getDimensionPixelOffset(index, this.RatingCompat);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f12x50fd9e4a = obtainStyledAttributes.getInt(index, this.f12x50fd9e4a);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        getSupportImageTintMode getsupportimagetintmode = new getSupportImageTintMode();
                        this.IconCompatParcelizer = getsupportimagetintmode;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    getSupportImageTintMode.write write2 = new getSupportImageTintMode.write((byte) 0);
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintSet);
                                    getSupportImageTintMode.MediaBrowserCompat$ItemReceiver(write2, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        write2.setTitle = true;
                                    }
                                    getsupportimagetintmode.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(write2.setForceShowIcon), write2);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused) {
                        this.IconCompatParcelizer = null;
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.read.setMenuPrepared = this.f12x50fd9e4a;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        Object obj = view == this ? this.read : view == null ? null : ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams()).setLogo;
        if ((view instanceof Guideline) && !(obj instanceof setImageBitmap)) {
            ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams();
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo = new setImageBitmap();
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setExpandedFormat = true;
            ((setImageBitmap) constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo).RatingCompat(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AbsActionBarView);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.write();
            ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams()).ActionMenuItemView = true;
            if (!this.write.contains(constraintHelper)) {
                this.write.add(constraintHelper);
            }
        }
        this.MediaBrowserCompat$ItemReceiver.put(view.getId(), view);
        this.MediaDescriptionCompat = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.MediaBrowserCompat$ItemReceiver.remove(view.getId());
        setImageResource setimageresource = view == this ? this.read : view == null ? null : ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams()).setLogo;
        this.read.setExpandedActionViewsExclusive.remove(setimageresource);
        setimageresource.AbsActionBarView = null;
        this.write.remove(view);
        this.ParcelableVolumeInfo.remove(setimageresource);
        this.MediaDescriptionCompat = true;
    }

    public void setMinWidth(int i) {
        if (i != this.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaSessionCompat$ResultReceiverWrapper = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.MediaSessionCompat$QueueItem) {
            this.MediaSessionCompat$QueueItem = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.RatingCompat) {
            this.RatingCompat = i;
            requestLayout();
        }
    }

    private final setImageResource MediaBrowserCompat$ItemReceiver(int i) {
        if (i == 0) {
            return this.read;
        }
        View view = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.read;
        }
        if (view == null) {
            return null;
        }
        return ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams()).setLogo;
    }

    private void write(int i, int i2) {
        boolean z;
        int baseline;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) childAt.getLayoutParams();
                setImageResource setimageresource = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo;
                if (!constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setExpandedFormat && !constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ActionMenuItemView) {
                    setimageresource.setTitleOptional = childAt.getVisibility();
                    int i8 = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.width;
                    int i9 = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.height;
                    boolean z2 = true;
                    if (constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setContentView || constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setActionBarVisibilityCallback || (!constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setContentView && constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker == 1) || constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.width == -1 || (!constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setActionBarVisibilityCallback && (constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setPadding == 1 || constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.height == -1))) {
                        if (i8 == 0) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -2);
                            z = true;
                        } else if (i8 == -1) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -1);
                            z = false;
                        } else {
                            z = i8 == -2;
                            i3 = getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -2);
                        } else if (i9 == -1) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -1);
                            z2 = false;
                        } else {
                            if (i9 != -2) {
                                z2 = false;
                            }
                            i4 = getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    setimageresource.IconCompatParcelizer(i8);
                    setimageresource.MediaBrowserCompat$CustomActionResultReceiver(i9);
                    if (z) {
                        setimageresource.setHideOnContentScrollEnabled = i8;
                    }
                    if (z2) {
                        setimageresource.setTransitioning = i9;
                    }
                    if (constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ListMenuItemView && (baseline = childAt.getBaseline()) != -1) {
                        setimageresource.MediaBrowserCompat$ItemReceiver = baseline;
                    }
                }
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        int i;
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt;
                if (placeholder.read != null) {
                    ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) placeholder.getLayoutParams();
                    ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2 = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) placeholder.read.getLayoutParams();
                    constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2.setLogo.setTitleOptional = 0;
                    setImageResource setimageresource = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo;
                    setImageResource setimageresource2 = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2.setLogo;
                    if (setimageresource2.setTitleOptional == 8) {
                        i = 0;
                    } else {
                        i = setimageresource2.ActionBarContextView;
                    }
                    setimageresource.IconCompatParcelizer(i);
                    setImageResource setimageresource3 = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo;
                    setImageResource setimageresource4 = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2.setLogo;
                    if (setimageresource4.setTitleOptional == 8) {
                        i2 = 0;
                    } else {
                        i2 = setimageresource4.PlaybackStateCompat;
                    }
                    setimageresource3.MediaBrowserCompat$CustomActionResultReceiver(i2);
                    constraintLayout$MediaBrowserCompat$CustomActionResultReceiver2.setLogo.setTitleOptional = 8;
                }
            }
        }
        int size = this.write.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.write.get(i4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0320  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.getPaddingTop()
            int r4 = r24.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r24.getPaddingLeft()
            int r5 = r24.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r24.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 8
            r9 = -1
            r10 = -2
            if (r7 >= r5) goto L_0x00d1
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 == r8) goto L_0x00cd
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r8 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r8
            o.setImageResource r13 = r8.setLogo
            boolean r14 = r8.setExpandedFormat
            if (r14 != 0) goto L_0x00cd
            boolean r14 = r8.ActionMenuItemView
            if (r14 != 0) goto L_0x00cd
            int r14 = r12.getVisibility()
            r13.setTitleOptional = r14
            int r14 = r8.width
            int r15 = r8.height
            if (r14 == 0) goto L_0x00ad
            if (r15 == 0) goto L_0x00ad
            if (r14 != r10) goto L_0x0050
            r16 = 1
            goto L_0x0052
        L_0x0050:
            r16 = 0
        L_0x0052:
            int r14 = getChildMeasureSpec(r1, r4, r14)
            if (r15 != r10) goto L_0x005a
            r11 = 1
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            int r10 = getChildMeasureSpec(r2, r3, r15)
            r12.measure(r14, r10)
            int r10 = r12.getMeasuredWidth()
            int r14 = r12.getMeasuredHeight()
            r13.IconCompatParcelizer((int) r10)
            r13.MediaBrowserCompat$CustomActionResultReceiver((int) r14)
            if (r16 == 0) goto L_0x0074
            r13.setHideOnContentScrollEnabled = r10
        L_0x0074:
            if (r11 == 0) goto L_0x0078
            r13.setTransitioning = r14
        L_0x0078:
            boolean r11 = r8.ListMenuItemView
            if (r11 == 0) goto L_0x0084
            int r11 = r12.getBaseline()
            if (r11 == r9) goto L_0x0084
            r13.MediaBrowserCompat$ItemReceiver = r11
        L_0x0084:
            boolean r9 = r8.setContentView
            if (r9 == 0) goto L_0x00cd
            boolean r8 = r8.setActionBarVisibilityCallback
            if (r8 == 0) goto L_0x00cd
            o.setSupportImageTintMode r8 = r13.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r8 != 0) goto L_0x0097
            o.setSupportImageTintMode r8 = new o.setSupportImageTintMode
            r8.<init>()
            r13.MenuItemWrapperICS$CollapsibleActionViewWrapper = r8
        L_0x0097:
            o.setSupportImageTintMode r8 = r13.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r8.MediaBrowserCompat$CustomActionResultReceiver(r10)
            o.setSupportImageTintMode r8 = r13.setVisibility
            if (r8 != 0) goto L_0x00a7
            o.setSupportImageTintMode r8 = new o.setSupportImageTintMode
            r8.<init>()
            r13.setVisibility = r8
        L_0x00a7:
            o.setSupportImageTintMode r8 = r13.setVisibility
            r8.MediaBrowserCompat$CustomActionResultReceiver(r14)
            goto L_0x00cd
        L_0x00ad:
            o.setSupportImageTintMode r8 = r13.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r8 != 0) goto L_0x00b8
            o.setSupportImageTintMode r8 = new o.setSupportImageTintMode
            r8.<init>()
            r13.MenuItemWrapperICS$CollapsibleActionViewWrapper = r8
        L_0x00b8:
            o.setSupportImageTintMode r8 = r13.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r8.read()
            o.setSupportImageTintMode r8 = r13.setVisibility
            if (r8 != 0) goto L_0x00c8
            o.setSupportImageTintMode r8 = new o.setSupportImageTintMode
            r8.<init>()
            r13.setVisibility = r8
        L_0x00c8:
            o.setSupportImageTintMode r8 = r13.setVisibility
            r8.read()
        L_0x00cd:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x00d1:
            o.setImageDrawable r7 = r0.read
            r7.setHasDecor()
            r12 = r0
            r7 = 0
        L_0x00d8:
            if (r7 >= r5) goto L_0x0339
            android.view.View r13 = r12.getChildAt(r7)
            int r14 = r13.getVisibility()
            if (r14 == r8) goto L_0x0324
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r14 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r14
            o.setImageResource r15 = r14.setLogo
            boolean r8 = r14.setExpandedFormat
            if (r8 != 0) goto L_0x0324
            boolean r8 = r14.ActionMenuItemView
            if (r8 != 0) goto L_0x0324
            int r8 = r13.getVisibility()
            r15.setTitleOptional = r8
            int r8 = r14.width
            int r9 = r14.height
            if (r8 == 0) goto L_0x010b
            if (r9 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r19 = r5
            r20 = r7
            r0 = r10
        L_0x0108:
            r6 = -1
            goto L_0x032a
        L_0x010b:
            o.setSupportImageTintList$read r10 = p040o.setSupportImageTintList.read.LEFT
            o.setSupportImageTintList r10 = r15.write((p040o.setSupportImageTintList.read) r10)
            o.AppCompatImageView r10 = r10.write
            o.setSupportImageTintList$read r11 = p040o.setSupportImageTintList.read.RIGHT
            o.setSupportImageTintList r11 = r15.write((p040o.setSupportImageTintList.read) r11)
            o.AppCompatImageView r11 = r11.write
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.LEFT
            o.setSupportImageTintList r6 = r15.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList r6 = r6.RatingCompat
            if (r6 == 0) goto L_0x0131
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.RIGHT
            o.setSupportImageTintList r6 = r15.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList r6 = r6.RatingCompat
            if (r6 == 0) goto L_0x0131
            r6 = 1
            goto L_0x0132
        L_0x0131:
            r6 = 0
        L_0x0132:
            o.setSupportImageTintList$read r0 = p040o.setSupportImageTintList.read.TOP
            o.setSupportImageTintList r0 = r15.write((p040o.setSupportImageTintList.read) r0)
            o.AppCompatImageView r0 = r0.write
            r19 = r5
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList r5 = r15.write((p040o.setSupportImageTintList.read) r5)
            o.AppCompatImageView r5 = r5.write
            r20 = r7
            o.setSupportImageTintList$read r7 = p040o.setSupportImageTintList.read.TOP
            o.setSupportImageTintList r7 = r15.write((p040o.setSupportImageTintList.read) r7)
            o.setSupportImageTintList r7 = r7.RatingCompat
            if (r7 == 0) goto L_0x015c
            o.setSupportImageTintList$read r7 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList r7 = r15.write((p040o.setSupportImageTintList.read) r7)
            o.setSupportImageTintList r7 = r7.RatingCompat
            if (r7 == 0) goto L_0x015c
            r7 = 1
            goto L_0x015d
        L_0x015c:
            r7 = 0
        L_0x015d:
            if (r8 != 0) goto L_0x0168
            if (r9 != 0) goto L_0x0168
            if (r6 == 0) goto L_0x0168
            if (r7 != 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r0 = -2
            goto L_0x0108
        L_0x0168:
            r21 = r14
            o.setImageDrawable r14 = r12.read
            o.setImageResource$read[] r14 = r14.AppCompatDelegateImpl$ListMenuDecorView
            r18 = 0
            r14 = r14[r18]
            r22 = r13
            o.setImageResource$read r13 = p040o.setImageResource.read.WRAP_CONTENT
            if (r14 == r13) goto L_0x017a
            r13 = 1
            goto L_0x017b
        L_0x017a:
            r13 = 0
        L_0x017b:
            o.setImageDrawable r12 = r12.read
            o.setImageResource$read[] r12 = r12.AppCompatDelegateImpl$ListMenuDecorView
            r14 = 1
            r12 = r12[r14]
            o.setImageResource$read r14 = p040o.setImageResource.read.WRAP_CONTENT
            if (r12 == r14) goto L_0x0188
            r12 = 1
            goto L_0x0189
        L_0x0188:
            r12 = 0
        L_0x0189:
            if (r13 != 0) goto L_0x019b
            o.setSupportImageTintMode r14 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r14 != 0) goto L_0x0196
            o.setSupportImageTintMode r14 = new o.setSupportImageTintMode
            r14.<init>()
            r15.MenuItemWrapperICS$CollapsibleActionViewWrapper = r14
        L_0x0196:
            o.setSupportImageTintMode r14 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r14.read()
        L_0x019b:
            if (r12 != 0) goto L_0x01ad
            o.setSupportImageTintMode r14 = r15.setVisibility
            if (r14 != 0) goto L_0x01a8
            o.setSupportImageTintMode r14 = new o.setSupportImageTintMode
            r14.<init>()
            r15.setVisibility = r14
        L_0x01a8:
            o.setSupportImageTintMode r14 = r15.setVisibility
            r14.read()
        L_0x01ad:
            r14 = 0
            if (r8 != 0) goto L_0x0216
            if (r13 == 0) goto L_0x020b
            int r8 = r15.setChecked
            if (r8 != 0) goto L_0x01d0
            float r8 = r15.f2633x50fd9e4a
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x01d0
            int r8 = r15.setExpandedFormat
            if (r8 != 0) goto L_0x01d0
            int r8 = r15.ActionMenuItemView
            if (r8 != 0) goto L_0x01d0
            o.setImageResource$read[] r8 = r15.AppCompatDelegateImpl$ListMenuDecorView
            r18 = 0
            r8 = r8[r18]
            o.setImageResource$read r14 = p040o.setImageResource.read.MATCH_CONSTRAINT
            if (r8 != r14) goto L_0x01d2
            r8 = 1
            goto L_0x01d4
        L_0x01d0:
            r18 = 0
        L_0x01d2:
            r8 = r18
        L_0x01d4:
            if (r8 == 0) goto L_0x020d
            if (r6 == 0) goto L_0x020d
            int r6 = r10.IconCompatParcelizer
            r8 = 1
            if (r6 == r8) goto L_0x01e0
            r17 = r18
            goto L_0x01e2
        L_0x01e0:
            r17 = r8
        L_0x01e2:
            if (r17 == 0) goto L_0x020d
            int r6 = r11.IconCompatParcelizer
            if (r6 == r8) goto L_0x01eb
            r6 = r18
            goto L_0x01ec
        L_0x01eb:
            r6 = 1
        L_0x01ec:
            if (r6 == 0) goto L_0x020d
            float r6 = r11.MediaBrowserCompat$SearchResultReceiver
            float r8 = r10.MediaBrowserCompat$SearchResultReceiver
            float r6 = r6 - r8
            int r6 = (int) r6
            o.setSupportImageTintMode r8 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r8 != 0) goto L_0x01ff
            o.setSupportImageTintMode r8 = new o.setSupportImageTintMode
            r8.<init>()
            r15.MenuItemWrapperICS$CollapsibleActionViewWrapper = r8
        L_0x01ff:
            o.setSupportImageTintMode r8 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r8.MediaBrowserCompat$CustomActionResultReceiver(r6)
            int r6 = getChildMeasureSpec(r1, r4, r6)
            r8 = r6
            r6 = -2
            goto L_0x0220
        L_0x020b:
            r18 = 0
        L_0x020d:
            r6 = -2
            int r8 = getChildMeasureSpec(r1, r4, r6)
            r13 = r18
            r6 = 1
            goto L_0x022d
        L_0x0216:
            r6 = -2
            r10 = -1
            r18 = 0
            if (r8 != r10) goto L_0x0223
            int r8 = getChildMeasureSpec(r1, r4, r10)
        L_0x0220:
            r6 = r18
            goto L_0x022d
        L_0x0223:
            if (r8 != r6) goto L_0x0227
            r6 = 1
            goto L_0x0229
        L_0x0227:
            r6 = r18
        L_0x0229:
            int r8 = getChildMeasureSpec(r1, r4, r8)
        L_0x022d:
            if (r9 != 0) goto L_0x0294
            if (r12 == 0) goto L_0x0288
            int r9 = r15.AppCompatActivity
            if (r9 != 0) goto L_0x0250
            float r9 = r15.f2633x50fd9e4a
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0250
            int r9 = r15.AppCompatViewInflater
            if (r9 != 0) goto L_0x0250
            int r9 = r15.setCheckable
            if (r9 != 0) goto L_0x0250
            o.setImageResource$read[] r9 = r15.AppCompatDelegateImpl$ListMenuDecorView
            r10 = 1
            r9 = r9[r10]
            o.setImageResource$read r10 = p040o.setImageResource.read.MATCH_CONSTRAINT
            if (r9 == r10) goto L_0x024e
            goto L_0x0250
        L_0x024e:
            r9 = 1
            goto L_0x0252
        L_0x0250:
            r9 = r18
        L_0x0252:
            if (r9 == 0) goto L_0x0288
            if (r7 == 0) goto L_0x0288
            int r7 = r0.IconCompatParcelizer
            r10 = 1
            if (r7 == r10) goto L_0x025e
            r7 = r18
            goto L_0x025f
        L_0x025e:
            r7 = r10
        L_0x025f:
            if (r7 == 0) goto L_0x0289
            int r7 = r5.IconCompatParcelizer
            if (r7 == r10) goto L_0x0268
            r7 = r18
            goto L_0x0269
        L_0x0268:
            r7 = r10
        L_0x0269:
            if (r7 == 0) goto L_0x0289
            float r5 = r5.MediaBrowserCompat$SearchResultReceiver
            float r0 = r0.MediaBrowserCompat$SearchResultReceiver
            float r5 = r5 - r0
            int r0 = (int) r5
            o.setSupportImageTintMode r5 = r15.setVisibility
            if (r5 != 0) goto L_0x027c
            o.setSupportImageTintMode r5 = new o.setSupportImageTintMode
            r5.<init>()
            r15.setVisibility = r5
        L_0x027c:
            o.setSupportImageTintMode r5 = r15.setVisibility
            r5.MediaBrowserCompat$CustomActionResultReceiver(r0)
            int r0 = getChildMeasureSpec(r2, r3, r0)
            r7 = r0
            r0 = -2
            goto L_0x029d
        L_0x0288:
            r10 = 1
        L_0x0289:
            r0 = -2
            int r5 = getChildMeasureSpec(r2, r3, r0)
            r7 = r10
            r12 = r18
        L_0x0291:
            r9 = r22
            goto L_0x02b2
        L_0x0294:
            r0 = -2
            r5 = -1
            r10 = 1
            if (r9 != r5) goto L_0x02a1
            int r7 = getChildMeasureSpec(r2, r3, r5)
        L_0x029d:
            r5 = r7
            r7 = r18
            goto L_0x0291
        L_0x02a1:
            if (r9 != r0) goto L_0x02a5
            r5 = r10
            goto L_0x02a7
        L_0x02a5:
            r5 = r18
        L_0x02a7:
            int r7 = getChildMeasureSpec(r2, r3, r9)
            r9 = r22
            r23 = r7
            r7 = r5
            r5 = r23
        L_0x02b2:
            r9.measure(r8, r5)
            int r5 = r9.getMeasuredWidth()
            int r8 = r9.getMeasuredHeight()
            r15.IconCompatParcelizer((int) r5)
            r15.MediaBrowserCompat$CustomActionResultReceiver((int) r8)
            if (r6 == 0) goto L_0x02c7
            r15.setHideOnContentScrollEnabled = r5
        L_0x02c7:
            if (r7 == 0) goto L_0x02cb
            r15.setTransitioning = r8
        L_0x02cb:
            r6 = 2
            if (r13 == 0) goto L_0x02df
            o.setSupportImageTintMode r7 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r7 != 0) goto L_0x02d9
            o.setSupportImageTintMode r7 = new o.setSupportImageTintMode
            r7.<init>()
            r15.MenuItemWrapperICS$CollapsibleActionViewWrapper = r7
        L_0x02d9:
            o.setSupportImageTintMode r7 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r7.MediaBrowserCompat$CustomActionResultReceiver(r5)
            goto L_0x02ee
        L_0x02df:
            o.setSupportImageTintMode r5 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r5 != 0) goto L_0x02ea
            o.setSupportImageTintMode r5 = new o.setSupportImageTintMode
            r5.<init>()
            r15.MenuItemWrapperICS$CollapsibleActionViewWrapper = r5
        L_0x02ea:
            o.setSupportImageTintMode r5 = r15.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r5.IconCompatParcelizer = r6
        L_0x02ee:
            if (r12 == 0) goto L_0x0301
            o.setSupportImageTintMode r5 = r15.setVisibility
            if (r5 != 0) goto L_0x02fb
            o.setSupportImageTintMode r5 = new o.setSupportImageTintMode
            r5.<init>()
            r15.setVisibility = r5
        L_0x02fb:
            o.setSupportImageTintMode r5 = r15.setVisibility
            r5.MediaBrowserCompat$CustomActionResultReceiver(r8)
            goto L_0x0310
        L_0x0301:
            o.setSupportImageTintMode r5 = r15.setVisibility
            if (r5 != 0) goto L_0x030c
            o.setSupportImageTintMode r5 = new o.setSupportImageTintMode
            r5.<init>()
            r15.setVisibility = r5
        L_0x030c:
            o.setSupportImageTintMode r5 = r15.setVisibility
            r5.IconCompatParcelizer = r6
        L_0x0310:
            r14 = r21
            boolean r5 = r14.ListMenuItemView
            if (r5 == 0) goto L_0x0320
            int r5 = r9.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x0321
            r15.MediaBrowserCompat$ItemReceiver = r5
            goto L_0x0321
        L_0x0320:
            r6 = -1
        L_0x0321:
            r12 = r24
            goto L_0x032d
        L_0x0324:
            r19 = r5
            r20 = r7
            r6 = r9
            r0 = r10
        L_0x032a:
            r10 = 1
            r18 = 0
        L_0x032d:
            int r7 = r20 + 1
            r8 = 8
            r10 = r0
            r9 = r6
            r5 = r19
            r0 = r24
            goto L_0x00d8
        L_0x0339:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.MediaBrowserCompat$CustomActionResultReceiver(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x08f4, code lost:
        if ((r5.setVisibility.IconCompatParcelizer == 1) == false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0aa2, code lost:
        if (r5 != r6) goto L_0x0aa4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r43
            int r3 = android.view.View.MeasureSpec.getMode(r42)
            int r4 = android.view.View.MeasureSpec.getSize(r42)
            int r5 = android.view.View.MeasureSpec.getMode(r43)
            int r6 = android.view.View.MeasureSpec.getSize(r43)
            int r7 = r41.getPaddingLeft()
            int r8 = r41.getPaddingTop()
            o.setImageDrawable r9 = r0.read
            r9.setHasNonEmbeddedTabs = r7
            o.setImageDrawable r9 = r0.read
            r9.setActionBarHideOffset = r8
            o.setImageDrawable r9 = r0.read
            int r10 = r0.MediaSessionCompat$Token
            int[] r9 = r9.setIcon
            r11 = 0
            r9[r11] = r10
            o.setImageDrawable r9 = r0.read
            int r10 = r0.RatingCompat
            int[] r9 = r9.setIcon
            r12 = 1
            r9[r12] = r10
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x004b
            o.setImageDrawable r9 = r0.read
            int r13 = r41.getLayoutDirection()
            if (r13 != r12) goto L_0x0048
            r13 = r12
            goto L_0x0049
        L_0x0048:
            r13 = r11
        L_0x0049:
            r9.setLogo = r13
        L_0x004b:
            int r9 = android.view.View.MeasureSpec.getMode(r42)
            int r13 = android.view.View.MeasureSpec.getSize(r42)
            int r14 = android.view.View.MeasureSpec.getMode(r43)
            int r15 = android.view.View.MeasureSpec.getSize(r43)
            int r16 = r41.getPaddingTop()
            int r17 = r41.getPaddingBottom()
            int r18 = r41.getPaddingLeft()
            int r19 = r41.getPaddingRight()
            o.setImageResource$read r20 = p040o.setImageResource.read.FIXED
            o.setImageResource$read r21 = p040o.setImageResource.read.FIXED
            r41.getLayoutParams()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r9 == r10) goto L_0x008c
            if (r9 == 0) goto L_0x0088
            if (r9 == r12) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            int r9 = r0.MediaSessionCompat$Token
            int r9 = java.lang.Math.min(r9, r13)
            int r18 = r18 + r19
            int r13 = r9 - r18
            goto L_0x008e
        L_0x0088:
            o.setImageResource$read r20 = p040o.setImageResource.read.WRAP_CONTENT
        L_0x008a:
            r13 = r11
            goto L_0x008e
        L_0x008c:
            o.setImageResource$read r20 = p040o.setImageResource.read.WRAP_CONTENT
        L_0x008e:
            r9 = r20
            if (r14 == r10) goto L_0x00a8
            if (r14 == 0) goto L_0x00a2
            if (r14 == r12) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            int r14 = r0.RatingCompat
            int r14 = java.lang.Math.min(r14, r15)
            int r16 = r16 + r17
            int r15 = r14 - r16
            goto L_0x00aa
        L_0x00a2:
            o.setImageResource$read r14 = p040o.setImageResource.read.WRAP_CONTENT
            r21 = r14
        L_0x00a6:
            r15 = r11
            goto L_0x00aa
        L_0x00a8:
            o.setImageResource$read r21 = p040o.setImageResource.read.WRAP_CONTENT
        L_0x00aa:
            r14 = r21
            o.setImageDrawable r12 = r0.read
            r12.write((int) r11)
            o.setImageDrawable r12 = r0.read
            r12.read((int) r11)
            o.setImageDrawable r12 = r0.read
            r12.IconCompatParcelizer((p040o.setImageResource.read) r9)
            o.setImageDrawable r9 = r0.read
            r9.IconCompatParcelizer((int) r13)
            o.setImageDrawable r9 = r0.read
            r9.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r14)
            o.setImageDrawable r9 = r0.read
            r9.MediaBrowserCompat$CustomActionResultReceiver((int) r15)
            o.setImageDrawable r9 = r0.read
            int r12 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r13 = r41.getPaddingLeft()
            int r12 = r12 - r13
            int r13 = r41.getPaddingRight()
            int r12 = r12 - r13
            r9.write((int) r12)
            o.setImageDrawable r9 = r0.read
            int r12 = r0.MediaSessionCompat$QueueItem
            int r13 = r41.getPaddingTop()
            int r12 = r12 - r13
            int r13 = r41.getPaddingBottom()
            int r12 = r12 - r13
            r9.read((int) r12)
            o.setImageDrawable r9 = r0.read
            int r12 = r9.setTitleOptional
            r13 = 8
            if (r12 != r13) goto L_0x00f6
            r9 = r11
            goto L_0x00f8
        L_0x00f6:
            int r9 = r9.ActionBarContextView
        L_0x00f8:
            o.setImageDrawable r12 = r0.read
            int r14 = r12.setTitleOptional
            if (r14 != r13) goto L_0x0100
            r12 = r11
            goto L_0x0102
        L_0x0100:
            int r12 = r12.PlaybackStateCompat
        L_0x0102:
            boolean r14 = r0.MediaDescriptionCompat
            if (r14 == 0) goto L_0x0710
            r0.MediaDescriptionCompat = r11
            int r14 = r41.getChildCount()
            r10 = r11
        L_0x010d:
            if (r10 >= r14) goto L_0x011e
            android.view.View r18 = r0.getChildAt(r10)
            boolean r18 = r18.isLayoutRequested()
            if (r18 == 0) goto L_0x011b
            r10 = 1
            goto L_0x011f
        L_0x011b:
            int r10 = r10 + 1
            goto L_0x010d
        L_0x011e:
            r10 = r11
        L_0x011f:
            if (r10 == 0) goto L_0x0702
            java.util.ArrayList<o.setImageResource> r10 = r0.ParcelableVolumeInfo
            r10.clear()
            boolean r10 = r41.isInEditMode()
            int r14 = r41.getChildCount()
            if (r10 == 0) goto L_0x016e
            r13 = r11
        L_0x0131:
            if (r13 >= r14) goto L_0x016e
            android.view.View r19 = r0.getChildAt(r13)
            android.content.res.Resources r15 = r41.getResources()     // Catch:{ NotFoundException -> 0x0168 }
            int r11 = r19.getId()     // Catch:{ NotFoundException -> 0x0168 }
            java.lang.String r11 = r15.getResourceName(r11)     // Catch:{ NotFoundException -> 0x0168 }
            int r15 = r19.getId()     // Catch:{ NotFoundException -> 0x0168 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NotFoundException -> 0x0168 }
            r2 = 0
            r0.setDesignInformation(r2, r11, r15)     // Catch:{ NotFoundException -> 0x0168 }
            r2 = 47
            int r2 = r11.indexOf(r2)     // Catch:{ NotFoundException -> 0x0168 }
            r15 = -1
            if (r2 == r15) goto L_0x015e
            int r2 = r2 + 1
            java.lang.String r11 = r11.substring(r2)     // Catch:{ NotFoundException -> 0x0168 }
        L_0x015e:
            int r2 = r19.getId()     // Catch:{ NotFoundException -> 0x0168 }
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r2)     // Catch:{ NotFoundException -> 0x0168 }
            r2.MediaSessionCompat$Token = r11     // Catch:{ NotFoundException -> 0x0168 }
        L_0x0168:
            int r13 = r13 + 1
            r2 = r43
            r11 = 0
            goto L_0x0131
        L_0x016e:
            r2 = 0
        L_0x016f:
            if (r2 >= r14) goto L_0x018e
            android.view.View r13 = r0.getChildAt(r2)
            if (r13 != r0) goto L_0x017a
            o.setImageDrawable r11 = r0.read
            goto L_0x0186
        L_0x017a:
            if (r13 != 0) goto L_0x017e
            r11 = 0
            goto L_0x0186
        L_0x017e:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r11 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r11
            o.setImageResource r11 = r11.setLogo
        L_0x0186:
            if (r11 == 0) goto L_0x018b
            r11.MediaBrowserCompat$MediaItem()
        L_0x018b:
            int r2 = r2 + 1
            goto L_0x016f
        L_0x018e:
            int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r13 = -1
            if (r2 == r13) goto L_0x0275
            r2 = 0
        L_0x0194:
            if (r2 >= r14) goto L_0x0275
            android.view.View r13 = r0.getChildAt(r2)
            int r15 = r13.getId()
            int r11 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r15 != r11) goto L_0x0257
            boolean r11 = r13 instanceof androidx.constraintlayout.widget.Constraints
            if (r11 == 0) goto L_0x0257
            androidx.constraintlayout.widget.Constraints r13 = (androidx.constraintlayout.widget.Constraints) r13
            o.getSupportImageTintMode r11 = r13.MediaBrowserCompat$CustomActionResultReceiver
            if (r11 != 0) goto L_0x01b3
            o.getSupportImageTintMode r11 = new o.getSupportImageTintMode
            r11.<init>()
            r13.MediaBrowserCompat$CustomActionResultReceiver = r11
        L_0x01b3:
            o.getSupportImageTintMode r11 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r15 = r13.getChildCount()
            java.util.HashMap<java.lang.Integer, o.getSupportImageTintMode$write> r1 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r1.clear()
            r1 = 0
        L_0x01bf:
            if (r1 >= r15) goto L_0x0246
            r23 = r15
            android.view.View r15 = r13.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r24 = r15.getLayoutParams()
            r25 = r7
            r7 = r24
            androidx.constraintlayout.widget.Constraints$read r7 = (androidx.constraintlayout.widget.Constraints.read) r7
            r24 = r8
            int r8 = r15.getId()
            r26 = r6
            r6 = -1
            if (r8 == r6) goto L_0x023e
            java.util.HashMap<java.lang.Integer, o.getSupportImageTintMode$write> r6 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r27 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x01fe
            java.util.HashMap<java.lang.Integer, o.getSupportImageTintMode$write> r5 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r28 = r4
            o.getSupportImageTintMode$write r4 = new o.getSupportImageTintMode$write
            r29 = r3
            r3 = 0
            r4.<init>(r3)
            r5.put(r6, r4)
            goto L_0x0202
        L_0x01fe:
            r29 = r3
            r28 = r4
        L_0x0202:
            java.util.HashMap<java.lang.Integer, o.getSupportImageTintMode$write> r3 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r4)
            o.getSupportImageTintMode$write r3 = (p040o.getSupportImageTintMode.write) r3
            boolean r4 = r15 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r4 == 0) goto L_0x022a
            androidx.constraintlayout.widget.ConstraintHelper r15 = (androidx.constraintlayout.widget.ConstraintHelper) r15
            r3.read((int) r8, (androidx.constraintlayout.widget.Constraints.read) r7)
            boolean r4 = r15 instanceof androidx.constraintlayout.widget.Barrier
            if (r4 == 0) goto L_0x022a
            r4 = 1
            r3.ListMenuItemView = r4
            androidx.constraintlayout.widget.Barrier r15 = (androidx.constraintlayout.widget.Barrier) r15
            int r4 = r15.MediaBrowserCompat$ItemReceiver
            r3.setPopupCallback = r4
            int[] r4 = r15.MediaBrowserCompat$CustomActionResultReceiver()
            r3.setGroupDividerEnabled = r4
        L_0x022a:
            r3.read((int) r8, (androidx.constraintlayout.widget.Constraints.read) r7)
            int r1 = r1 + 1
            r15 = r23
            r8 = r24
            r7 = r25
            r6 = r26
            r5 = r27
            r4 = r28
            r3 = r29
            goto L_0x01bf
        L_0x023e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L_0x0246:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
            o.getSupportImageTintMode r1 = r13.MediaBrowserCompat$CustomActionResultReceiver
            r0.IconCompatParcelizer = r1
            goto L_0x0263
        L_0x0257:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
        L_0x0263:
            int r2 = r2 + 1
            r1 = r42
            r8 = r24
            r7 = r25
            r6 = r26
            r5 = r27
            r4 = r28
            r3 = r29
            goto L_0x0194
        L_0x0275:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
            o.getSupportImageTintMode r1 = r0.IconCompatParcelizer
            if (r1 == 0) goto L_0x0288
            r1.IconCompatParcelizer(r0)
        L_0x0288:
            o.setImageDrawable r1 = r0.read
            java.util.ArrayList<o.setImageResource> r1 = r1.setExpandedActionViewsExclusive
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r0.write
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x02a8
            r2 = 0
        L_0x0298:
            if (r2 >= r1) goto L_0x02a8
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r3 = r0.write
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.ConstraintHelper r3 = (androidx.constraintlayout.widget.ConstraintHelper) r3
            r3.MediaBrowserCompat$CustomActionResultReceiver((androidx.constraintlayout.widget.ConstraintLayout) r0)
            int r2 = r2 + 1
            goto L_0x0298
        L_0x02a8:
            r1 = 0
        L_0x02a9:
            if (r1 >= r14) goto L_0x02e4
            android.view.View r2 = r0.getChildAt(r1)
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Placeholder
            if (r3 == 0) goto L_0x02e1
            androidx.constraintlayout.widget.Placeholder r2 = (androidx.constraintlayout.widget.Placeholder) r2
            int r3 = r2.IconCompatParcelizer
            r4 = -1
            if (r3 != r4) goto L_0x02c5
            boolean r3 = r2.isInEditMode()
            if (r3 != 0) goto L_0x02c5
            int r3 = r2.MediaBrowserCompat$ItemReceiver
            r2.setVisibility(r3)
        L_0x02c5:
            int r3 = r2.IconCompatParcelizer
            android.view.View r3 = r0.findViewById(r3)
            r2.read = r3
            if (r3 == 0) goto L_0x02e1
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r3 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r3
            r4 = 1
            r3.AppCompatViewInflater = r4
            android.view.View r3 = r2.read
            r4 = 0
            r3.setVisibility(r4)
            r2.setVisibility(r4)
        L_0x02e1:
            int r1 = r1 + 1
            goto L_0x02a9
        L_0x02e4:
            r1 = 0
        L_0x02e5:
            if (r1 >= r14) goto L_0x070e
            android.view.View r2 = r0.getChildAt(r1)
            if (r2 != r0) goto L_0x02f0
            o.setImageDrawable r3 = r0.read
            goto L_0x02fc
        L_0x02f0:
            if (r2 != 0) goto L_0x02f4
            r3 = 0
            goto L_0x02fc
        L_0x02f4:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r3 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r3
            o.setImageResource r3 = r3.setLogo
        L_0x02fc:
            if (r3 == 0) goto L_0x06fe
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r4 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r4
            r4.write()
            if (r10 == 0) goto L_0x0337
            android.content.res.Resources r5 = r41.getResources()     // Catch:{ NotFoundException -> 0x0337 }
            int r6 = r2.getId()     // Catch:{ NotFoundException -> 0x0337 }
            java.lang.String r5 = r5.getResourceName(r6)     // Catch:{ NotFoundException -> 0x0337 }
            int r6 = r2.getId()     // Catch:{ NotFoundException -> 0x0337 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NotFoundException -> 0x0337 }
            r7 = 0
            r0.setDesignInformation(r7, r5, r6)     // Catch:{ NotFoundException -> 0x0337 }
            java.lang.String r6 = "id/"
            int r6 = r5.indexOf(r6)     // Catch:{ NotFoundException -> 0x0337 }
            int r6 = r6 + 3
            java.lang.String r5 = r5.substring(r6)     // Catch:{ NotFoundException -> 0x0337 }
            int r6 = r2.getId()     // Catch:{ NotFoundException -> 0x0337 }
            o.setImageResource r6 = r0.MediaBrowserCompat$ItemReceiver(r6)     // Catch:{ NotFoundException -> 0x0337 }
            r6.MediaSessionCompat$Token = r5     // Catch:{ NotFoundException -> 0x0337 }
        L_0x0337:
            int r5 = r2.getVisibility()
            r3.setTitleOptional = r5
            boolean r5 = r4.AppCompatViewInflater
            if (r5 == 0) goto L_0x0345
            r5 = 8
            r3.setTitleOptional = r5
        L_0x0345:
            r3.MediaBrowserCompat$SearchResultReceiver = r2
            o.setImageDrawable r2 = r0.read
            java.util.ArrayList<o.setImageResource> r5 = r2.setExpandedActionViewsExclusive
            r5.add(r3)
            o.setImageResource r5 = r3.AbsActionBarView
            if (r5 == 0) goto L_0x035f
            o.setImageResource r5 = r3.AbsActionBarView
            o.drawableStateChanged r5 = (p040o.drawableStateChanged) r5
            java.util.ArrayList<o.setImageResource> r5 = r5.setExpandedActionViewsExclusive
            r5.remove(r3)
            r5 = 0
            r3.AbsActionBarView = r5
            goto L_0x0360
        L_0x035f:
            r5 = 0
        L_0x0360:
            r3.AbsActionBarView = r2
            boolean r2 = r4.setActionBarVisibilityCallback
            if (r2 == 0) goto L_0x036a
            boolean r2 = r4.setContentView
            if (r2 != 0) goto L_0x036f
        L_0x036a:
            java.util.ArrayList<o.setImageResource> r2 = r0.ParcelableVolumeInfo
            r2.add(r3)
        L_0x036f:
            boolean r2 = r4.setExpandedFormat
            if (r2 == 0) goto L_0x03b4
            o.setImageBitmap r3 = (p040o.setImageBitmap) r3
            int r2 = r4.MenuItemWrapperICS$CollapsibleActionViewWrapper
            int r6 = r4.setContentHeight
            float r7 = r4.setStackedBackground
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 17
            if (r8 >= r11) goto L_0x0387
            int r2 = r4.AlertController$RecycleListView
            int r6 = r4.AppCompatDialogFragment
            float r7 = r4.AppCompatDelegateImpl$ListMenuDecorView
        L_0x0387:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x039b
            if (r8 <= 0) goto L_0x0398
            r3.ActionBarOverlayLayout = r7
            r7 = -1
            r3.write = r7
            r3.IconCompatParcelizer = r7
            goto L_0x06fe
        L_0x0398:
            r7 = -1
            goto L_0x06fe
        L_0x039b:
            r7 = -1
            if (r2 == r7) goto L_0x03a8
            if (r2 < 0) goto L_0x06fe
            r3.ActionBarOverlayLayout = r4
            r3.write = r2
            r3.IconCompatParcelizer = r7
            goto L_0x06fe
        L_0x03a8:
            if (r6 == r7) goto L_0x06fe
            if (r6 < 0) goto L_0x06fe
            r3.ActionBarOverlayLayout = r4
            r3.write = r7
            r3.IconCompatParcelizer = r6
            goto L_0x06fe
        L_0x03b4:
            r7 = -1
            int r2 = r4.setChecked
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.setIcon
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.setTitleOptional
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.ActionBarContextView
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.setSubtitle
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.setTransitioning
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.MediaSessionCompat$QueueItem
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.MediaSessionCompat$ResultReceiverWrapper
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.ActionBarOverlayLayout
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.setHideOnContentScrollEnabled
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.MediaBrowserCompat$ItemReceiver
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.IconCompatParcelizer
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.MediaBrowserCompat$MediaItem
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.MediaSessionCompat$Token
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.write
            if (r2 != r7) goto L_0x03fd
            int r2 = r4.width
            if (r2 == r7) goto L_0x03fd
            int r2 = r4.height
            if (r2 != r7) goto L_0x06fe
        L_0x03fd:
            int r2 = r4.setSplitBackground
            int r6 = r4.setPrimaryBackground
            int r7 = r4.ActionBarContainer
            int r8 = r4.setCustomView
            int r11 = r4.MenuItemImpl
            int r13 = r4.setVisibility
            float r15 = r4.setTabContainer
            int r5 = android.os.Build.VERSION.SDK_INT
            r23 = r2
            r2 = 17
            if (r5 >= r2) goto L_0x0452
            int r5 = r4.setChecked
            int r6 = r4.setIcon
            int r7 = r4.setTitleOptional
            int r8 = r4.ActionBarContextView
            int r11 = r4.Keep
            int r13 = r4.PlaybackStateCompat$CustomAction
            float r15 = r4.setBackgroundResource
            r2 = -1
            if (r5 != r2) goto L_0x042e
            if (r6 != r2) goto L_0x042e
            r20 = r5
            int r5 = r4.setSubtitle
            if (r5 == r2) goto L_0x0431
            int r5 = r4.setSubtitle
        L_0x042e:
            r20 = r5
            goto L_0x0438
        L_0x0431:
            int r5 = r4.setTransitioning
            if (r5 == r2) goto L_0x0438
            int r5 = r4.setTransitioning
            r6 = r5
        L_0x0438:
            if (r7 != r2) goto L_0x044b
            if (r8 != r2) goto L_0x044b
            int r5 = r4.MediaSessionCompat$QueueItem
            if (r5 == r2) goto L_0x0444
            int r5 = r4.MediaSessionCompat$QueueItem
            r7 = r5
            goto L_0x044b
        L_0x0444:
            int r5 = r4.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == r2) goto L_0x044b
            int r5 = r4.MediaSessionCompat$ResultReceiverWrapper
            r8 = r5
        L_0x044b:
            r33 = r11
            r37 = r13
            r5 = r20
            goto L_0x0459
        L_0x0452:
            r2 = -1
            r33 = r11
            r37 = r13
            r5 = r23
        L_0x0459:
            int r11 = r4.write
            if (r11 == r2) goto L_0x0486
            int r2 = r4.write
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r2)
            if (r2 == 0) goto L_0x062b
            float r5 = r4.read
            int r6 = r4.MediaDescriptionCompat
            o.setSupportImageTintList$read r7 = p040o.setSupportImageTintList.read.CENTER
            o.setSupportImageTintList$read r8 = p040o.setSupportImageTintList.read.CENTER
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r7)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r8)
            r33 = 0
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r6
            r30.read(r31, r32, r33, r34, r35, r36)
            r3.MediaMetadataCompat = r5
            goto L_0x062b
        L_0x0486:
            if (r5 == r2) goto L_0x04a8
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r5)
            if (r2 == 0) goto L_0x04c9
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.LEFT
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.LEFT
            int r11 = r4.leftMargin
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r11
            r30.read(r31, r32, r33, r34, r35, r36)
            goto L_0x04c9
        L_0x04a8:
            if (r6 == r2) goto L_0x04ca
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r6)
            if (r2 == 0) goto L_0x04c9
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.LEFT
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.RIGHT
            int r11 = r4.leftMargin
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r11
            r30.read(r31, r32, r33, r34, r35, r36)
        L_0x04c9:
            r2 = -1
        L_0x04ca:
            if (r7 == r2) goto L_0x04ec
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r7)
            if (r2 == 0) goto L_0x050d
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.RIGHT
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.LEFT
            int r7 = r4.rightMargin
            o.setSupportImageTintList r34 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r35 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r38 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r39 = 0
            r40 = 1
            r36 = r7
            r34.read(r35, r36, r37, r38, r39, r40)
            goto L_0x050d
        L_0x04ec:
            if (r8 == r2) goto L_0x050d
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r8)
            if (r2 == 0) goto L_0x050d
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.RIGHT
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.RIGHT
            int r7 = r4.rightMargin
            o.setSupportImageTintList r34 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r35 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r38 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r39 = 0
            r40 = 1
            r36 = r7
            r34.read(r35, r36, r37, r38, r39, r40)
        L_0x050d:
            int r2 = r4.ActionBarOverlayLayout
            r5 = -1
            if (r2 == r5) goto L_0x0538
            int r2 = r4.ActionBarOverlayLayout
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r2)
            if (r2 == 0) goto L_0x0562
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.TOP
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.TOP
            int r7 = r4.topMargin
            int r8 = r4.setHasDecor
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r7
            r33 = r8
            r30.read(r31, r32, r33, r34, r35, r36)
            goto L_0x0562
        L_0x0538:
            int r2 = r4.setHideOnContentScrollEnabled
            r5 = -1
            if (r2 == r5) goto L_0x0562
            int r2 = r4.setHideOnContentScrollEnabled
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r2)
            if (r2 == 0) goto L_0x0562
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.TOP
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.BOTTOM
            int r7 = r4.topMargin
            int r8 = r4.setHasDecor
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r7
            r33 = r8
            r30.read(r31, r32, r33, r34, r35, r36)
        L_0x0562:
            int r2 = r4.MediaBrowserCompat$ItemReceiver
            r5 = -1
            if (r2 == r5) goto L_0x058d
            int r2 = r4.MediaBrowserCompat$ItemReceiver
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r2)
            if (r2 == 0) goto L_0x05b7
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.TOP
            int r7 = r4.bottomMargin
            int r8 = r4.f13x50fd9e4a
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r7
            r33 = r8
            r30.read(r31, r32, r33, r34, r35, r36)
            goto L_0x05b7
        L_0x058d:
            int r2 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r5 = -1
            if (r2 == r5) goto L_0x05b7
            int r2 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.setImageResource r2 = r0.MediaBrowserCompat$ItemReceiver(r2)
            if (r2 == 0) goto L_0x05b7
            o.setSupportImageTintList$read r5 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.BOTTOM
            int r7 = r4.bottomMargin
            int r8 = r4.f13x50fd9e4a
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r5)
            o.setSupportImageTintList r31 = r2.write((p040o.setSupportImageTintList.read) r6)
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r32 = r7
            r33 = r8
            r30.read(r31, r32, r33, r34, r35, r36)
        L_0x05b7:
            int r2 = r4.IconCompatParcelizer
            r5 = -1
            if (r2 == r5) goto L_0x060e
            android.util.SparseArray<android.view.View> r2 = r0.MediaBrowserCompat$ItemReceiver
            int r5 = r4.IconCompatParcelizer
            java.lang.Object r2 = r2.get(r5)
            android.view.View r2 = (android.view.View) r2
            int r5 = r4.IconCompatParcelizer
            o.setImageResource r5 = r0.MediaBrowserCompat$ItemReceiver(r5)
            if (r5 == 0) goto L_0x060e
            if (r2 == 0) goto L_0x060e
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            boolean r6 = r6 instanceof androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x060e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r2 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r2
            r6 = 1
            r4.ListMenuItemView = r6
            r2.ListMenuItemView = r6
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.BASELINE
            o.setSupportImageTintList r30 = r3.write((p040o.setSupportImageTintList.read) r2)
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.BASELINE
            o.setSupportImageTintList r31 = r5.write((p040o.setSupportImageTintList.read) r2)
            r32 = 0
            r33 = -1
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r34 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r35 = 0
            r36 = 1
            r30.read(r31, r32, r33, r34, r35, r36)
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.TOP
            o.setSupportImageTintList r2 = r3.write((p040o.setSupportImageTintList.read) r2)
            r2.MediaBrowserCompat$ItemReceiver()
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList r2 = r3.write((p040o.setSupportImageTintList.read) r2)
            r2.MediaBrowserCompat$ItemReceiver()
        L_0x060e:
            r2 = 0
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r5 < 0) goto L_0x061b
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x061b
            r3.setHasDecor = r15
        L_0x061b:
            float r5 = r4.setActionBarHideOffset
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x062b
            float r2 = r4.setActionBarHideOffset
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x062b
            float r2 = r4.setActionBarHideOffset
            r3.setTabContainer = r2
        L_0x062b:
            if (r10 == 0) goto L_0x063e
            int r2 = r4.MediaBrowserCompat$MediaItem
            r5 = -1
            if (r2 != r5) goto L_0x0636
            int r2 = r4.MediaSessionCompat$Token
            if (r2 == r5) goto L_0x063e
        L_0x0636:
            int r2 = r4.MediaBrowserCompat$MediaItem
            int r5 = r4.MediaSessionCompat$Token
            r3.setHasNonEmbeddedTabs = r2
            r3.setActionBarHideOffset = r5
        L_0x063e:
            boolean r2 = r4.setContentView
            if (r2 != 0) goto L_0x066b
            int r2 = r4.width
            r5 = -1
            if (r2 != r5) goto L_0x0661
            o.setImageResource$read r2 = p040o.setImageResource.read.MATCH_PARENT
            r3.IconCompatParcelizer((p040o.setImageResource.read) r2)
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.LEFT
            o.setSupportImageTintList r2 = r3.write((p040o.setSupportImageTintList.read) r2)
            int r5 = r4.leftMargin
            r2.MediaBrowserCompat$CustomActionResultReceiver = r5
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.RIGHT
            o.setSupportImageTintList r2 = r3.write((p040o.setSupportImageTintList.read) r2)
            int r5 = r4.rightMargin
            r2.MediaBrowserCompat$CustomActionResultReceiver = r5
            goto L_0x0675
        L_0x0661:
            o.setImageResource$read r2 = p040o.setImageResource.read.MATCH_CONSTRAINT
            r3.IconCompatParcelizer((p040o.setImageResource.read) r2)
            r2 = 0
            r3.IconCompatParcelizer((int) r2)
            goto L_0x0675
        L_0x066b:
            o.setImageResource$read r2 = p040o.setImageResource.read.FIXED
            r3.IconCompatParcelizer((p040o.setImageResource.read) r2)
            int r2 = r4.width
            r3.IconCompatParcelizer((int) r2)
        L_0x0675:
            boolean r2 = r4.setActionBarVisibilityCallback
            if (r2 != 0) goto L_0x06a2
            int r2 = r4.height
            r5 = -1
            if (r2 != r5) goto L_0x0698
            o.setImageResource$read r2 = p040o.setImageResource.read.MATCH_PARENT
            r3.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r2)
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.TOP
            o.setSupportImageTintList r2 = r3.write((p040o.setSupportImageTintList.read) r2)
            int r5 = r4.topMargin
            r2.MediaBrowserCompat$CustomActionResultReceiver = r5
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList r2 = r3.write((p040o.setSupportImageTintList.read) r2)
            int r5 = r4.bottomMargin
            r2.MediaBrowserCompat$CustomActionResultReceiver = r5
            goto L_0x06ac
        L_0x0698:
            o.setImageResource$read r2 = p040o.setImageResource.read.MATCH_CONSTRAINT
            r3.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r2)
            r2 = 0
            r3.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            goto L_0x06ac
        L_0x06a2:
            o.setImageResource$read r2 = p040o.setImageResource.read.FIXED
            r3.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r2)
            int r2 = r4.height
            r3.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
        L_0x06ac:
            java.lang.String r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x06b5
            java.lang.String r2 = r4.RatingCompat
            r3.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r2)
        L_0x06b5:
            float r2 = r4.setCheckable
            float[] r5 = r3.setSubtitle
            r6 = 0
            r5[r6] = r2
            float r2 = r4.setMenuPrepared
            float[] r5 = r3.setSubtitle
            r6 = 1
            r5[r6] = r2
            int r2 = r4.AppCompatActivity
            r3.Keep = r2
            int r2 = r4.setHasNonEmbeddedTabs
            r3.setStackedBackground = r2
            int r2 = r4.setItemInvoker
            int r5 = r4.setForceShowIcon
            int r6 = r4.setShortcut
            float r7 = r4.ExpandedMenuView
            r3.setChecked = r2
            r3.setExpandedFormat = r5
            r3.ActionMenuItemView = r6
            r3.setPadding = r7
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x06e6
            if (r2 != 0) goto L_0x06e6
            r3.setChecked = r7
        L_0x06e6:
            int r2 = r4.setPadding
            int r6 = r4.setGroupDividerEnabled
            int r8 = r4.setPopupCallback
            float r4 = r4.setTitle
            r3.AppCompatActivity = r2
            r3.AppCompatViewInflater = r6
            r3.setCheckable = r8
            r3.setShortcut = r4
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x06fe
            if (r2 != 0) goto L_0x06fe
            r3.AppCompatActivity = r7
        L_0x06fe:
            int r1 = r1 + 1
            goto L_0x02e5
        L_0x0702:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
        L_0x070e:
            r1 = 1
            goto L_0x071d
        L_0x0710:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
            r1 = 0
        L_0x071d:
            int r2 = r0.f12x50fd9e4a
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x0726
            r2 = 1
            goto L_0x0727
        L_0x0726:
            r2 = 0
        L_0x0727:
            if (r2 == 0) goto L_0x0758
            o.setImageDrawable r3 = r0.read
            r3.ParcelableVolumeInfo()
            o.setImageDrawable r3 = r0.read
            o.setImageResource$read[] r4 = r3.AppCompatDelegateImpl$ListMenuDecorView
            r5 = 0
            r4 = r4[r5]
            o.setImageResource$read r5 = p040o.setImageResource.read.WRAP_CONTENT
            if (r4 == r5) goto L_0x0742
            o.setSupportImageTintMode r4 = r3.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r4 == 0) goto L_0x0742
            o.setSupportImageTintMode r4 = r3.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r4.MediaBrowserCompat$CustomActionResultReceiver(r9)
        L_0x0742:
            o.setImageResource$read[] r4 = r3.AppCompatDelegateImpl$ListMenuDecorView
            r5 = 1
            r4 = r4[r5]
            o.setImageResource$read r5 = p040o.setImageResource.read.WRAP_CONTENT
            if (r4 == r5) goto L_0x0754
            o.setSupportImageTintMode r4 = r3.setVisibility
            if (r4 == 0) goto L_0x0754
            o.setSupportImageTintMode r3 = r3.setVisibility
            r3.MediaBrowserCompat$CustomActionResultReceiver(r12)
        L_0x0754:
            r41.MediaBrowserCompat$CustomActionResultReceiver(r42, r43)
            goto L_0x075b
        L_0x0758:
            r41.write(r42, r43)
        L_0x075b:
            r41.MediaBrowserCompat$CustomActionResultReceiver()
            int r3 = r41.getChildCount()
            if (r3 <= 0) goto L_0x076b
            if (r1 == 0) goto L_0x076b
            o.setImageDrawable r1 = r0.read
            p040o.AlertController$RecycleListView.write((p040o.setImageDrawable) r1)
        L_0x076b:
            o.setImageDrawable r1 = r0.read
            boolean r1 = r1.write
            if (r1 == 0) goto L_0x07c6
            o.setImageDrawable r1 = r0.read
            boolean r1 = r1.setShowingForActionMode
            if (r1 == 0) goto L_0x0797
            r1 = r29
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L_0x0794
            o.setImageDrawable r3 = r0.read
            int r3 = r3.setOnMenuItemClickListener
            r4 = r28
            if (r3 >= r4) goto L_0x078c
            o.setImageDrawable r3 = r0.read
            int r5 = r3.setOnMenuItemClickListener
            r3.IconCompatParcelizer((int) r5)
        L_0x078c:
            o.setImageDrawable r3 = r0.read
            o.setImageResource$read r5 = p040o.setImageResource.read.FIXED
            r3.IconCompatParcelizer((p040o.setImageResource.read) r5)
            goto L_0x079b
        L_0x0794:
            r4 = r28
            goto L_0x079b
        L_0x0797:
            r4 = r28
            r1 = r29
        L_0x079b:
            o.setImageDrawable r3 = r0.read
            boolean r3 = r3.setWindowCallback
            if (r3 == 0) goto L_0x07c1
            r3 = r27
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r5) goto L_0x07be
            o.setImageDrawable r5 = r0.read
            int r5 = r5.ActionMenuPresenter$OverflowMenuButton
            r6 = r26
            if (r5 >= r6) goto L_0x07b6
            o.setImageDrawable r5 = r0.read
            int r7 = r5.ActionMenuPresenter$OverflowMenuButton
            r5.MediaBrowserCompat$CustomActionResultReceiver((int) r7)
        L_0x07b6:
            o.setImageDrawable r5 = r0.read
            o.setImageResource$read r7 = p040o.setImageResource.read.FIXED
            r5.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r7)
            goto L_0x07ce
        L_0x07be:
            r6 = r26
            goto L_0x07ce
        L_0x07c1:
            r6 = r26
            r3 = r27
            goto L_0x07ce
        L_0x07c6:
            r6 = r26
            r3 = r27
            r4 = r28
            r1 = r29
        L_0x07ce:
            int r5 = r0.f12x50fd9e4a
            r7 = 32
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0834
            o.setImageDrawable r5 = r0.read
            int r7 = r5.setTitleOptional
            r8 = 8
            if (r7 != r8) goto L_0x07df
            r5 = 0
            goto L_0x07e1
        L_0x07df:
            int r5 = r5.ActionBarContextView
        L_0x07e1:
            o.setImageDrawable r7 = r0.read
            int r10 = r7.setTitleOptional
            if (r10 != r8) goto L_0x07e9
            r7 = 0
            goto L_0x07eb
        L_0x07e9:
            int r7 = r7.PlaybackStateCompat
        L_0x07eb:
            int r8 = r0.MediaMetadataCompat
            if (r8 == r5) goto L_0x07fc
            r8 = 1073741824(0x40000000, float:2.0)
            if (r1 != r8) goto L_0x07fe
            o.setImageDrawable r1 = r0.read
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r1 = r1.setWindowTitle
            r10 = 0
            p040o.AlertController$RecycleListView.write((java.util.List<p040o.setExpandActivityOverflowButtonContentDescription.C14841>) r1, (int) r10, (int) r5)
            goto L_0x07fe
        L_0x07fc:
            r8 = 1073741824(0x40000000, float:2.0)
        L_0x07fe:
            int r1 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r1 == r7) goto L_0x080c
            if (r3 != r8) goto L_0x080c
            o.setImageDrawable r1 = r0.read
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r1 = r1.setWindowTitle
            r3 = 1
            p040o.AlertController$RecycleListView.write((java.util.List<p040o.setExpandActivityOverflowButtonContentDescription.C14841>) r1, (int) r3, (int) r7)
        L_0x080c:
            o.setImageDrawable r1 = r0.read
            boolean r1 = r1.setShowingForActionMode
            if (r1 == 0) goto L_0x0820
            o.setImageDrawable r1 = r0.read
            int r1 = r1.setOnMenuItemClickListener
            if (r1 <= r4) goto L_0x0820
            o.setImageDrawable r1 = r0.read
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r1 = r1.setWindowTitle
            r3 = 0
            p040o.AlertController$RecycleListView.write((java.util.List<p040o.setExpandActivityOverflowButtonContentDescription.C14841>) r1, (int) r3, (int) r4)
        L_0x0820:
            o.setImageDrawable r1 = r0.read
            boolean r1 = r1.setWindowCallback
            if (r1 == 0) goto L_0x0834
            o.setImageDrawable r1 = r0.read
            int r1 = r1.ActionMenuPresenter$OverflowMenuButton
            if (r1 <= r6) goto L_0x0834
            o.setImageDrawable r1 = r0.read
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r1 = r1.setWindowTitle
            r3 = 1
            p040o.AlertController$RecycleListView.write((java.util.List<p040o.setExpandActivityOverflowButtonContentDescription.C14841>) r1, (int) r3, (int) r6)
        L_0x0834:
            int r1 = r41.getChildCount()
            if (r1 <= 0) goto L_0x083f
            o.setImageDrawable r1 = r0.read
            r1.MediaSessionCompat$QueueItem()
        L_0x083f:
            java.util.ArrayList<o.setImageResource> r1 = r0.ParcelableVolumeInfo
            int r1 = r1.size()
            int r3 = r41.getPaddingBottom()
            int r8 = r24 + r3
            int r3 = r41.getPaddingRight()
            int r7 = r25 + r3
            if (r1 <= 0) goto L_0x0aca
            o.setImageDrawable r4 = r0.read
            o.setImageResource$read[] r4 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r5 = 0
            r4 = r4[r5]
            o.setImageResource$read r6 = p040o.setImageResource.read.WRAP_CONTENT
            if (r4 != r6) goto L_0x0860
            r4 = 1
            goto L_0x0861
        L_0x0860:
            r4 = r5
        L_0x0861:
            o.setImageDrawable r6 = r0.read
            o.setImageResource$read[] r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            r10 = 1
            r6 = r6[r10]
            o.setImageResource$read r10 = p040o.setImageResource.read.WRAP_CONTENT
            if (r6 != r10) goto L_0x086e
            r6 = 1
            goto L_0x086f
        L_0x086e:
            r6 = r5
        L_0x086f:
            o.setImageDrawable r10 = r0.read
            int r11 = r10.setTitleOptional
            r13 = 8
            if (r11 != r13) goto L_0x0879
            r10 = r5
            goto L_0x087b
        L_0x0879:
            int r10 = r10.ActionBarContextView
        L_0x087b:
            int r11 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r10 = java.lang.Math.max(r10, r11)
            o.setImageDrawable r11 = r0.read
            int r14 = r11.setTitleOptional
            if (r14 != r13) goto L_0x0889
            r11 = r5
            goto L_0x088b
        L_0x0889:
            int r11 = r11.PlaybackStateCompat
        L_0x088b:
            int r13 = r0.MediaSessionCompat$QueueItem
            int r11 = java.lang.Math.max(r11, r13)
            r13 = r5
            r14 = r10
            r15 = r11
            r10 = r13
            r11 = r10
        L_0x0896:
            if (r10 >= r1) goto L_0x0a19
            java.util.ArrayList<o.setImageResource> r5 = r0.ParcelableVolumeInfo
            java.lang.Object r5 = r5.get(r10)
            o.setImageResource r5 = (p040o.setImageResource) r5
            java.lang.Object r3 = r5.MediaBrowserCompat$SearchResultReceiver
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x09ff
            android.view.ViewGroup$LayoutParams r19 = r3.getLayoutParams()
            r22 = r1
            r1 = r19
            androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver r1 = (androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) r1
            r19 = r12
            boolean r12 = r1.ActionMenuItemView
            if (r12 != 0) goto L_0x09f8
            boolean r12 = r1.setExpandedFormat
            if (r12 != 0) goto L_0x09f8
            int r12 = r3.getVisibility()
            r23 = r9
            r9 = 8
            if (r12 != r9) goto L_0x08c6
            r12 = 1
            goto L_0x08f7
        L_0x08c6:
            if (r2 == 0) goto L_0x08fd
            o.setSupportImageTintMode r9 = r5.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r9 != 0) goto L_0x08d3
            o.setSupportImageTintMode r9 = new o.setSupportImageTintMode
            r9.<init>()
            r5.MenuItemWrapperICS$CollapsibleActionViewWrapper = r9
        L_0x08d3:
            o.setSupportImageTintMode r9 = r5.MenuItemWrapperICS$CollapsibleActionViewWrapper
            int r9 = r9.IconCompatParcelizer
            r12 = 1
            if (r9 == r12) goto L_0x08dc
            r9 = 0
            goto L_0x08dd
        L_0x08dc:
            r9 = 1
        L_0x08dd:
            if (r9 == 0) goto L_0x08fd
            o.setSupportImageTintMode r9 = r5.setVisibility
            if (r9 != 0) goto L_0x08ea
            o.setSupportImageTintMode r9 = new o.setSupportImageTintMode
            r9.<init>()
            r5.setVisibility = r9
        L_0x08ea:
            o.setSupportImageTintMode r9 = r5.setVisibility
            int r9 = r9.IconCompatParcelizer
            r12 = 1
            if (r9 == r12) goto L_0x08f3
            r9 = 0
            goto L_0x08f4
        L_0x08f3:
            r9 = r12
        L_0x08f4:
            if (r9 != 0) goto L_0x08f7
            goto L_0x08fe
        L_0x08f7:
            r25 = r7
            r24 = r8
            goto L_0x0a09
        L_0x08fd:
            r12 = 1
        L_0x08fe:
            int r9 = r1.width
            r12 = -2
            if (r9 != r12) goto L_0x0910
            boolean r9 = r1.setContentView
            if (r9 == 0) goto L_0x0910
            int r9 = r1.width
            r12 = r42
            int r9 = getChildMeasureSpec(r12, r7, r9)
            goto L_0x0922
        L_0x0910:
            r12 = r42
            int r9 = r5.setTitleOptional
            r12 = 8
            if (r9 != r12) goto L_0x091a
            r9 = 0
            goto L_0x091c
        L_0x091a:
            int r9 = r5.ActionBarContextView
        L_0x091c:
            r12 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
        L_0x0922:
            int r12 = r1.height
            r25 = r7
            r7 = -2
            if (r12 != r7) goto L_0x0936
            boolean r7 = r1.setActionBarVisibilityCallback
            if (r7 == 0) goto L_0x0936
            int r7 = r1.height
            r12 = r43
            int r7 = getChildMeasureSpec(r12, r8, r7)
            goto L_0x0948
        L_0x0936:
            r12 = r43
            int r7 = r5.setTitleOptional
            r12 = 8
            if (r7 != r12) goto L_0x0940
            r7 = 0
            goto L_0x0942
        L_0x0940:
            int r7 = r5.PlaybackStateCompat
        L_0x0942:
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
        L_0x0948:
            r3.measure(r9, r7)
            int r7 = r3.getMeasuredWidth()
            int r9 = r3.getMeasuredHeight()
            int r12 = r5.setTitleOptional
            r24 = r8
            r8 = 8
            if (r12 != r8) goto L_0x095d
            r8 = 0
            goto L_0x095f
        L_0x095d:
            int r8 = r5.ActionBarContextView
        L_0x095f:
            if (r7 == r8) goto L_0x0994
            r5.IconCompatParcelizer((int) r7)
            if (r2 == 0) goto L_0x0976
            o.setSupportImageTintMode r8 = r5.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r8 != 0) goto L_0x0971
            o.setSupportImageTintMode r8 = new o.setSupportImageTintMode
            r8.<init>()
            r5.MenuItemWrapperICS$CollapsibleActionViewWrapper = r8
        L_0x0971:
            o.setSupportImageTintMode r8 = r5.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r8.MediaBrowserCompat$CustomActionResultReceiver(r7)
        L_0x0976:
            if (r4 == 0) goto L_0x0993
            int r7 = r5.setHasNonEmbeddedTabs
            int r8 = r5.ActionBarContextView
            int r7 = r7 + r8
            if (r7 <= r14) goto L_0x0993
            int r7 = r5.setHasNonEmbeddedTabs
            int r8 = r5.ActionBarContextView
            int r7 = r7 + r8
            o.setSupportImageTintList$read r8 = p040o.setSupportImageTintList.read.RIGHT
            o.setSupportImageTintList r8 = r5.write((p040o.setSupportImageTintList.read) r8)
            int r8 = r8.read()
            int r7 = r7 + r8
            int r14 = java.lang.Math.max(r14, r7)
        L_0x0993:
            r11 = 1
        L_0x0994:
            int r7 = r5.setTitleOptional
            r8 = 8
            if (r7 != r8) goto L_0x099c
            r7 = 0
            goto L_0x099e
        L_0x099c:
            int r7 = r5.PlaybackStateCompat
        L_0x099e:
            if (r9 == r7) goto L_0x09d4
            r5.MediaBrowserCompat$CustomActionResultReceiver((int) r9)
            if (r2 == 0) goto L_0x09b5
            o.setSupportImageTintMode r7 = r5.setVisibility
            if (r7 != 0) goto L_0x09b0
            o.setSupportImageTintMode r7 = new o.setSupportImageTintMode
            r7.<init>()
            r5.setVisibility = r7
        L_0x09b0:
            o.setSupportImageTintMode r7 = r5.setVisibility
            r7.MediaBrowserCompat$CustomActionResultReceiver(r9)
        L_0x09b5:
            if (r6 == 0) goto L_0x09d3
            int r7 = r5.setActionBarHideOffset
            int r8 = r5.PlaybackStateCompat
            int r7 = r7 + r8
            if (r7 <= r15) goto L_0x09d3
            int r7 = r5.setActionBarHideOffset
            int r8 = r5.PlaybackStateCompat
            int r7 = r7 + r8
            o.setSupportImageTintList$read r8 = p040o.setSupportImageTintList.read.BOTTOM
            o.setSupportImageTintList r8 = r5.write((p040o.setSupportImageTintList.read) r8)
            int r8 = r8.read()
            int r7 = r7 + r8
            int r7 = java.lang.Math.max(r15, r7)
            r15 = r7
        L_0x09d3:
            r11 = 1
        L_0x09d4:
            boolean r1 = r1.ListMenuItemView
            if (r1 == 0) goto L_0x09e7
            int r1 = r3.getBaseline()
            r7 = -1
            if (r1 == r7) goto L_0x09e8
            int r8 = r5.MediaBrowserCompat$ItemReceiver
            if (r1 == r8) goto L_0x09e8
            r5.MediaBrowserCompat$ItemReceiver = r1
            r11 = 1
            goto L_0x09e8
        L_0x09e7:
            r7 = -1
        L_0x09e8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 11
            if (r1 < r5) goto L_0x0a0a
            int r1 = r3.getMeasuredState()
            int r1 = combineMeasuredStates(r13, r1)
            r13 = r1
            goto L_0x0a0a
        L_0x09f8:
            r25 = r7
            r24 = r8
            r23 = r9
            goto L_0x0a09
        L_0x09ff:
            r22 = r1
            r25 = r7
            r24 = r8
            r23 = r9
            r19 = r12
        L_0x0a09:
            r7 = -1
        L_0x0a0a:
            int r10 = r10 + 1
            r12 = r19
            r1 = r22
            r9 = r23
            r8 = r24
            r7 = r25
            r5 = 0
            goto L_0x0896
        L_0x0a19:
            r22 = r1
            r25 = r7
            r24 = r8
            r23 = r9
            r19 = r12
            if (r11 == 0) goto L_0x0a70
            o.setImageDrawable r1 = r0.read
            r9 = r23
            r1.IconCompatParcelizer((int) r9)
            o.setImageDrawable r1 = r0.read
            r11 = r19
            r1.MediaBrowserCompat$CustomActionResultReceiver((int) r11)
            if (r2 == 0) goto L_0x0a3a
            o.setImageDrawable r1 = r0.read
            r1.setHasDecor()
        L_0x0a3a:
            o.setImageDrawable r1 = r0.read
            r1.MediaSessionCompat$QueueItem()
            o.setImageDrawable r1 = r0.read
            int r2 = r1.setTitleOptional
            r3 = 8
            if (r2 != r3) goto L_0x0a49
            r2 = 0
            goto L_0x0a4b
        L_0x0a49:
            int r2 = r1.ActionBarContextView
        L_0x0a4b:
            if (r2 >= r14) goto L_0x0a54
            o.setImageDrawable r1 = r0.read
            r1.IconCompatParcelizer((int) r14)
            r2 = 1
            goto L_0x0a55
        L_0x0a54:
            r2 = 0
        L_0x0a55:
            o.setImageDrawable r1 = r0.read
            int r4 = r1.setTitleOptional
            if (r4 != r3) goto L_0x0a5d
            r1 = 0
            goto L_0x0a5f
        L_0x0a5d:
            int r1 = r1.PlaybackStateCompat
        L_0x0a5f:
            if (r1 >= r15) goto L_0x0a68
            o.setImageDrawable r1 = r0.read
            r1.MediaBrowserCompat$CustomActionResultReceiver((int) r15)
            r12 = 1
            goto L_0x0a69
        L_0x0a68:
            r12 = r2
        L_0x0a69:
            if (r12 == 0) goto L_0x0a70
            o.setImageDrawable r1 = r0.read
            r1.MediaSessionCompat$QueueItem()
        L_0x0a70:
            r1 = r22
            r2 = 0
        L_0x0a73:
            if (r2 >= r1) goto L_0x0ac8
            java.util.ArrayList<o.setImageResource> r3 = r0.ParcelableVolumeInfo
            java.lang.Object r3 = r3.get(r2)
            o.setImageResource r3 = (p040o.setImageResource) r3
            java.lang.Object r4 = r3.MediaBrowserCompat$SearchResultReceiver
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0a86
        L_0x0a83:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0ac5
        L_0x0a86:
            int r5 = r4.getMeasuredWidth()
            int r6 = r3.setTitleOptional
            r7 = 8
            if (r6 != r7) goto L_0x0a92
            r6 = 0
            goto L_0x0a94
        L_0x0a92:
            int r6 = r3.ActionBarContextView
        L_0x0a94:
            if (r5 != r6) goto L_0x0aa4
            int r5 = r4.getMeasuredHeight()
            int r6 = r3.setTitleOptional
            if (r6 != r7) goto L_0x0aa0
            r6 = 0
            goto L_0x0aa2
        L_0x0aa0:
            int r6 = r3.PlaybackStateCompat
        L_0x0aa2:
            if (r5 == r6) goto L_0x0a83
        L_0x0aa4:
            int r5 = r3.setTitleOptional
            if (r5 == r7) goto L_0x0a83
            int r5 = r3.setTitleOptional
            if (r5 != r7) goto L_0x0aae
            r5 = 0
            goto L_0x0ab0
        L_0x0aae:
            int r5 = r3.ActionBarContextView
        L_0x0ab0:
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            int r8 = r3.setTitleOptional
            if (r8 != r7) goto L_0x0abc
            r3 = 0
            goto L_0x0abe
        L_0x0abc:
            int r3 = r3.PlaybackStateCompat
        L_0x0abe:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            r4.measure(r5, r3)
        L_0x0ac5:
            int r2 = r2 + 1
            goto L_0x0a73
        L_0x0ac8:
            r2 = r13
            goto L_0x0acf
        L_0x0aca:
            r25 = r7
            r24 = r8
            r2 = 0
        L_0x0acf:
            o.setImageDrawable r1 = r0.read
            int r3 = r1.setTitleOptional
            r4 = 8
            if (r3 != r4) goto L_0x0ad9
            r1 = 0
            goto L_0x0adb
        L_0x0ad9:
            int r1 = r1.ActionBarContextView
        L_0x0adb:
            int r1 = r1 + r25
            o.setImageDrawable r3 = r0.read
            int r5 = r3.setTitleOptional
            if (r5 != r4) goto L_0x0ae5
            r11 = 0
            goto L_0x0ae7
        L_0x0ae5:
            int r11 = r3.PlaybackStateCompat
        L_0x0ae7:
            int r11 = r11 + r24
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 11
            if (r3 < r4) goto L_0x0b26
            r3 = r42
            int r1 = resolveSizeAndState(r1, r3, r2)
            int r2 = r2 << 16
            r3 = r43
            int r2 = resolveSizeAndState(r11, r3, r2)
            int r3 = r0.MediaSessionCompat$Token
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r4
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.RatingCompat
            r2 = r2 & r4
            int r2 = java.lang.Math.min(r3, r2)
            o.setImageDrawable r3 = r0.read
            boolean r3 = r3.setUiOptions
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0b17
            r1 = r1 | r4
        L_0x0b17:
            o.setImageDrawable r3 = r0.read
            boolean r3 = r3.IconCompatParcelizer
            if (r3 == 0) goto L_0x0b1e
            r2 = r2 | r4
        L_0x0b1e:
            r0.setMeasuredDimension(r1, r2)
            r0.MediaMetadataCompat = r1
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            return
        L_0x0b26:
            r0.setMeasuredDimension(r1, r11)
            r0.MediaMetadataCompat = r1
            r0.MediaBrowserCompat$SearchResultReceiver = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View view;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) childAt.getLayoutParams();
            setImageResource setimageresource = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setLogo;
            if ((childAt.getVisibility() != 8 || constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setExpandedFormat || constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ActionMenuItemView || isInEditMode) && !constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatViewInflater) {
                int i8 = setimageresource.MediaSessionCompat$QueueItem + setimageresource.setForceShowIcon;
                int i9 = setimageresource.ParcelableVolumeInfo + setimageresource.ExpandedMenuView;
                if (setimageresource.setTitleOptional == 8) {
                    i5 = 0;
                } else {
                    i5 = setimageresource.ActionBarContextView;
                }
                int i10 = i5 + i8;
                if (setimageresource.setTitleOptional == 8) {
                    i6 = 0;
                } else {
                    i6 = setimageresource.PlaybackStateCompat;
                }
                int i11 = i6 + i9;
                childAt.layout(i8, i9, i10, i11);
                if ((childAt instanceof Placeholder) && (view = ((Placeholder) childAt).read) != null) {
                    view.setVisibility(0);
                    view.layout(i8, i9, i10, i11);
                }
            }
        }
        int size = this.write.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                this.write.get(i12).read();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.read.setMenuPrepared = i;
    }

    public static ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver write() {
        return new ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setConstraintSet(getSupportImageTintMode getsupportimagetintmode) {
        this.IconCompatParcelizer = getsupportimagetintmode;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i2;
                        float f2 = (float) i3;
                        float f3 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = f2;
                        float f5 = f2;
                        float f6 = f3;
                        float f7 = f;
                        Paint paint2 = paint;
                        canvas2.drawLine(f, f4, f6, f5, paint);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f3;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f5, f6, f9, paint);
                        float f10 = parseInt4;
                        float f11 = f7;
                        canvas2.drawLine(f8, f10, f11, f9, paint);
                        float f12 = f7;
                        canvas2.drawLine(f12, f10, f11, f5, paint);
                        paint.setColor(-16711936);
                        float f13 = f3;
                        Paint paint3 = paint;
                        canvas2.drawLine(f12, f5, f13, parseInt4, paint);
                        canvas2.drawLine(f12, parseInt4, f13, f5, paint);
                    }
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.MediaDescriptionCompat = true;
        this.MediaMetadataCompat = -1;
        this.MediaBrowserCompat$SearchResultReceiver = -1;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(getContext(), attributeSet);
    }
}
