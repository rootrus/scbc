package com.pdfview.subsamplincscaleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.DGER;
import p040o.DSBMV;
import p040o.DSPMV;
import p040o.DSPR$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.DSPR2;
import p040o.DSYR2;
import p040o.DSYR2K;
import p040o.DebitCardResetOtpActivity;
import p040o.GoogleMap;
import p040o.IdWorkflowActivity;
import p040o.ImmutableMultiset;

public class SubsamplingScaleImageView extends View {
    /* access modifiers changed from: private */
    public static final List<Integer> IconCompatParcelizer = Arrays.asList(new Integer[]{2, 1});
    private static final List<Integer> MediaBrowserCompat$CustomActionResultReceiver = Arrays.asList(new Integer[]{2, 1, 3, 4});
    /* access modifiers changed from: private */
    public static final String MediaBrowserCompat$ItemReceiver = SubsamplingScaleImageView.class.getSimpleName();
    private static Bitmap.Config MediaBrowserCompat$MediaItem;
    private static final List<Integer> RatingCompat = Arrays.asList(new Integer[]{1, 2, 3});
    private static final List<Integer> read = Arrays.asList(new Integer[]{0, 90, Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256), 270, -1});
    private static final List<Integer> write = Arrays.asList(new Integer[]{1, 2, 3});
    private int AbsActionBarView;
    /* access modifiers changed from: private */
    public boolean ActionBarContainer;
    /* access modifiers changed from: private */
    public boolean ActionBarContextView;
    private int ActionBarOverlayLayout;
    private final Handler ActionMenuItemView;
    private GestureDetector ActionMenuPresenter$OverflowMenuButton;
    /* access modifiers changed from: private */
    public float ActionMenuView;
    /* access modifiers changed from: private */
    public boolean ActionMenuView$OnMenuItemClickListener;
    /* access modifiers changed from: private */
    public PointF ActivityChooserView;
    private final float AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private float AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    private boolean AppCompatViewInflater;
    private int ExpandedMenuView;
    private IdWorkflowActivity.C69161 Keep;
    /* access modifiers changed from: private */
    public int ListMenuItemView;
    private Bitmap MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2429x50fd9e4a;
    /* access modifiers changed from: private */
    public write MediaDescriptionCompat;
    private DSPMV<? extends IdWorkflowActivity> MediaMetadataCompat;
    private Paint MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private Paint MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public read MenuItemImpl;
    private MediaDescriptionCompat MenuItemWrapperICS$CollapsibleActionViewWrapper;
    private boolean ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final ReadWriteLock PlaybackStateCompat;
    private Paint PlaybackStateCompat$CustomAction;
    private DSPMV<? extends IdWorkflowActivity.C69161> setActionBarHideOffset;
    private int setActionBarVisibilityCallback;
    private int setBackgroundResource;
    private Executor setCheckable;
    private int setChecked;
    private int setContentHeight;
    private final float[] setContentView;
    private final float setCustomView;
    private Uri setExpandedActionViewsExclusive;
    private boolean setExpandedFormat;
    private float setForceShowIcon;
    private int setGroupDividerEnabled;
    private GestureDetector setHasDecor;
    /* access modifiers changed from: private */
    public boolean setHasNonEmbeddedTabs;
    /* access modifiers changed from: private */
    public PointF setHideOnContentScrollEnabled;
    /* access modifiers changed from: private */
    public boolean setIcon;
    private boolean setItemInvoker;
    private RectF setLogo;
    private PointF setMenu;
    private float setMenuCallbacks;
    private Rect setMenuPrepared;
    private Paint setOnMenuItemClickListener;
    private Map<Integer, List<C1017x7620d44b>> setOverflowIcon;
    /* access modifiers changed from: private */
    public PointF setOverflowReserved;
    private int setOverlayMode;
    private Matrix setPadding;
    /* access modifiers changed from: private */
    public boolean setPopupCallback;
    private PointF setPopupTheme;
    /* access modifiers changed from: private */
    public PointF setPresenter;
    private int setPrimaryBackground;
    private float setShortcut;
    private PointF setShowingForActionMode;
    private Float setSplitBackground;
    /* access modifiers changed from: private */
    public boolean setStackedBackground;
    /* access modifiers changed from: private */
    public PointF setSubtitle;
    private Rect setTabContainer;
    private int setTitle;
    /* access modifiers changed from: private */
    public PointF setTitleOptional;
    /* access modifiers changed from: private */
    public float setTransitioning;
    private final float[] setUiOptions;
    /* access modifiers changed from: private */
    public View.OnLongClickListener setVisibility;
    /* access modifiers changed from: private */
    public float setWindowCallback;
    private RatingCompat setWindowTitle;

    public interface IconCompatParcelizer {
        DebitCardResetOtpActivity<GoogleMap.OnMyLocationClickListener> MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        DebitCardResetOtpActivity<GoogleMap.OnMyLocationClickListener> write(ImmutableMultiset.FieldSettersHolder fieldSettersHolder);
    }

    public interface MediaDescriptionCompat {
    }

    public interface read {
    }

    static /* synthetic */ Rect MediaSessionCompat$Token(SubsamplingScaleImageView subsamplingScaleImageView) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void IconCompatParcelizer(com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView r3, android.graphics.Bitmap r4) {
        /*
            monitor-enter(r3)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "onPreviewLoaded"
            boolean r2 = r3.ParcelableVolumeInfo     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0034 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0034 }
        L_0x0013:
            android.graphics.Bitmap r0 = r3.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x002f
            boolean r0 = r3.AppCompatViewInflater     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x001c
            goto L_0x002f
        L_0x001c:
            r3.MediaBrowserCompat$SearchResultReceiver = r4     // Catch:{ all -> 0x0034 }
            r4 = 1
            r3.f2429x50fd9e4a = r4     // Catch:{ all -> 0x0034 }
            boolean r4 = r3.MediaMetadataCompat()     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x002d
            r3.invalidate()     // Catch:{ all -> 0x0034 }
            r3.requestLayout()     // Catch:{ all -> 0x0034 }
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r4.recycle()     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.IconCompatParcelizer(com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView, android.graphics.Bitmap):void");
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(SubsamplingScaleImageView subsamplingScaleImageView, Bitmap bitmap, int i) {
        synchronized (subsamplingScaleImageView) {
            Object[] objArr = new Object[0];
            if (subsamplingScaleImageView.ParcelableVolumeInfo) {
                Log.d(MediaBrowserCompat$ItemReceiver, String.format("onImageLoaded", objArr));
            }
            if (subsamplingScaleImageView.setOverlayMode > 0 && subsamplingScaleImageView.setActionBarVisibilityCallback > 0 && !(subsamplingScaleImageView.setOverlayMode == bitmap.getWidth() && subsamplingScaleImageView.setActionBarVisibilityCallback == bitmap.getHeight())) {
                subsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(false);
            }
            if (subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver != null && !subsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper) {
                subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver.recycle();
            }
            subsamplingScaleImageView.f2429x50fd9e4a = false;
            subsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper = false;
            subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver = bitmap;
            subsamplingScaleImageView.setOverlayMode = bitmap.getWidth();
            subsamplingScaleImageView.setActionBarVisibilityCallback = bitmap.getHeight();
            subsamplingScaleImageView.ActionBarOverlayLayout = i;
            boolean MediaMetadataCompat2 = subsamplingScaleImageView.MediaMetadataCompat();
            boolean MediaBrowserCompat$MediaItem2 = subsamplingScaleImageView.MediaBrowserCompat$MediaItem();
            if (!subsamplingScaleImageView.AppCompatViewInflater && MediaBrowserCompat$MediaItem2) {
                subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver();
                subsamplingScaleImageView.AppCompatViewInflater = true;
            }
            if (MediaMetadataCompat2 || MediaBrowserCompat$MediaItem2) {
                subsamplingScaleImageView.invalidate();
                subsamplingScaleImageView.requestLayout();
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(SubsamplingScaleImageView subsamplingScaleImageView, IdWorkflowActivity.C69161 r6, int i, int i2, int i3) {
        synchronized (subsamplingScaleImageView) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(subsamplingScaleImageView.setContentHeight)};
            if (subsamplingScaleImageView.ParcelableVolumeInfo) {
                Log.d(MediaBrowserCompat$ItemReceiver, String.format("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", objArr));
            }
            if (subsamplingScaleImageView.setOverlayMode > 0 && subsamplingScaleImageView.setActionBarVisibilityCallback > 0 && !(subsamplingScaleImageView.setOverlayMode == i && subsamplingScaleImageView.setActionBarVisibilityCallback == i2)) {
                subsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(false);
                if (subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver != null) {
                    if (!subsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper) {
                        subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver.recycle();
                    }
                    subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver = null;
                    subsamplingScaleImageView.f2429x50fd9e4a = false;
                    subsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper = false;
                }
            }
            subsamplingScaleImageView.Keep = r6;
            subsamplingScaleImageView.setOverlayMode = i;
            subsamplingScaleImageView.setActionBarVisibilityCallback = i2;
            subsamplingScaleImageView.ActionBarOverlayLayout = i3;
            subsamplingScaleImageView.MediaMetadataCompat();
            boolean MediaBrowserCompat$MediaItem2 = subsamplingScaleImageView.MediaBrowserCompat$MediaItem();
            if (!subsamplingScaleImageView.AppCompatViewInflater && MediaBrowserCompat$MediaItem2) {
                subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver();
                subsamplingScaleImageView.AppCompatViewInflater = true;
            }
            if (!MediaBrowserCompat$MediaItem2 && subsamplingScaleImageView.setTitle > 0 && subsamplingScaleImageView.setTitle != Integer.MAX_VALUE && subsamplingScaleImageView.setGroupDividerEnabled > 0 && subsamplingScaleImageView.setGroupDividerEnabled != Integer.MAX_VALUE && subsamplingScaleImageView.getWidth() > 0 && subsamplingScaleImageView.getHeight() > 0) {
                subsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(new Point(subsamplingScaleImageView.setTitle, subsamplingScaleImageView.setGroupDividerEnabled));
            }
            subsamplingScaleImageView.invalidate();
            subsamplingScaleImageView.requestLayout();
        }
    }

    static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(SubsamplingScaleImageView subsamplingScaleImageView) {
        synchronized (subsamplingScaleImageView) {
            Object[] objArr = new Object[0];
            if (subsamplingScaleImageView.ParcelableVolumeInfo) {
                Log.d(MediaBrowserCompat$ItemReceiver, String.format("onTileLoaded", objArr));
            }
            subsamplingScaleImageView.MediaMetadataCompat();
            boolean MediaBrowserCompat$MediaItem2 = subsamplingScaleImageView.MediaBrowserCompat$MediaItem();
            if (!subsamplingScaleImageView.AppCompatViewInflater && MediaBrowserCompat$MediaItem2) {
                subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver();
                subsamplingScaleImageView.AppCompatViewInflater = true;
            }
            if (subsamplingScaleImageView.MediaBrowserCompat$MediaItem() && subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver != null) {
                if (!subsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper) {
                    subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver.recycle();
                }
                subsamplingScaleImageView.MediaBrowserCompat$SearchResultReceiver = null;
                subsamplingScaleImageView.f2429x50fd9e4a = false;
                subsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper = false;
            }
            subsamplingScaleImageView.invalidate();
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        this.setExpandedFormat = true;
        this.setContentHeight = 0;
        this.setShortcut = 2.0f;
        this.setForceShowIcon = RatingCompat();
        this.AbsActionBarView = -1;
        this.setPrimaryBackground = 1;
        this.ExpandedMenuView = 1;
        this.setTitle = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.setGroupDividerEnabled = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.setCheckable = AsyncTask.THREAD_POOL_EXECUTOR;
        this.AppCompatActivity = true;
        this.setStackedBackground = true;
        this.ActionMenuView$OnMenuItemClickListener = true;
        this.ActionBarContainer = true;
        this.AppCompatDelegateImpl$ListMenuDecorView = 1.0f;
        this.AppCompatDialogFragment = 1;
        this.setBackgroundResource = 500;
        this.PlaybackStateCompat = new ReentrantReadWriteLock(true);
        this.MediaMetadataCompat = new DSBMV(DSYR2K.class);
        this.setActionBarHideOffset = new DSBMV(DSYR2.class);
        this.setUiOptions = new float[8];
        this.setContentView = new float[8];
        this.AlertController$RecycleListView = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        MediaBrowserCompat$ItemReceiver(context);
        this.ActionMenuItemView = new Handler(new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.setVisibility != null) {
                    int unused = SubsamplingScaleImageView.this.ListMenuItemView = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.setVisibility);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener((View.OnLongClickListener) null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView);
            if (obtainStyledAttributes.hasValue(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_assetName) && (string = obtainStyledAttributes.getString(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_assetName)) != null && string.length() > 0) {
                DGER MediaBrowserCompat$CustomActionResultReceiver2 = DGER.MediaBrowserCompat$CustomActionResultReceiver(string);
                MediaBrowserCompat$CustomActionResultReceiver2.write = true;
                setImage(MediaBrowserCompat$CustomActionResultReceiver2);
            }
            if (obtainStyledAttributes.hasValue(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_src) && (resourceId = obtainStyledAttributes.getResourceId(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_src, 0)) > 0) {
                DGER write2 = DGER.write(resourceId);
                write2.write = true;
                setImage(write2);
            }
            if (obtainStyledAttributes.hasValue(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_panEnabled)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_panEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_zoomEnabled)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_zoomEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_quickScaleEnabled)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_quickScaleEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_tileBackgroundColor)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(DSPR$MediaBrowserCompat$CustomActionResultReceiver.SubsamplingScaleImageView_tileBackgroundColor, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.setCustomView = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static Bitmap.Config IconCompatParcelizer() {
        return MediaBrowserCompat$MediaItem;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        MediaBrowserCompat$MediaItem = config;
    }

    public final void setOrientation(int i) {
        if (read.contains(Integer.valueOf(i))) {
            this.setContentHeight = i;
            MediaBrowserCompat$CustomActionResultReceiver(false);
            invalidate();
            requestLayout();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid orientation: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setImage(DGER dger) {
        setImage(dger, (DGER) null, (DSPR2) null);
    }

    public final void setImage(DGER dger, DSPR2 dspr2) {
        setImage(dger, (DGER) null, dspr2);
    }

    public final void setImage(DGER dger, DGER dger2) {
        setImage(dger, dger2, (DSPR2) null);
    }

    public final void setImage(DGER dger, DGER dger2, DSPR2 dspr2) {
        if (dger != null) {
            MediaBrowserCompat$CustomActionResultReceiver(true);
            if (!(dspr2 == null || dspr2 == null || !read.contains(Integer.valueOf(dspr2.write)))) {
                this.setContentHeight = dspr2.write;
                this.setSplitBackground = Float.valueOf(dspr2.IconCompatParcelizer);
                this.setMenu = new PointF(dspr2.MediaBrowserCompat$CustomActionResultReceiver, dspr2.MediaBrowserCompat$ItemReceiver);
                invalidate();
            }
            if (dger2 == null) {
                this.setMenuPrepared = null;
                Uri uri = dger.read;
                this.setExpandedActionViewsExclusive = uri;
                if (uri == null && dger.MediaBrowserCompat$ItemReceiver != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("android.resource://");
                    sb.append(getContext().getPackageName());
                    sb.append("/");
                    sb.append(dger.MediaBrowserCompat$ItemReceiver);
                    this.setExpandedActionViewsExclusive = Uri.parse(sb.toString());
                }
                if (!dger.write) {
                    new C1016xd5f05c2a(this, getContext(), this.MediaMetadataCompat, this.setExpandedActionViewsExclusive, false).executeOnExecutor(this.setCheckable, new Void[0]);
                    return;
                }
                new MediaMetadataCompat(this, getContext(), this.setActionBarHideOffset, this.setExpandedActionViewsExclusive).executeOnExecutor(this.setCheckable, new Void[0]);
                return;
            }
            throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
        }
        throw new NullPointerException("imageSource must not be null");
    }

    /* JADX INFO: finally extract failed */
    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("reset newImage=");
        sb.append(z);
        String obj = sb.toString();
        Object[] objArr = new Object[0];
        if (this.ParcelableVolumeInfo) {
            Log.d(MediaBrowserCompat$ItemReceiver, String.format(obj, objArr));
        }
        this.setWindowCallback = BitmapDescriptorFactory.HUE_RED;
        this.ActionMenuView = BitmapDescriptorFactory.HUE_RED;
        this.setPresenter = null;
        this.ActivityChooserView = null;
        this.setPopupTheme = null;
        this.setSplitBackground = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.setMenu = null;
        this.setShowingForActionMode = null;
        this.setIcon = false;
        this.setItemInvoker = false;
        this.setPopupCallback = false;
        this.ListMenuItemView = 0;
        this.setChecked = 0;
        this.setOverflowReserved = null;
        this.setMenuCallbacks = BitmapDescriptorFactory.HUE_RED;
        this.setTransitioning = BitmapDescriptorFactory.HUE_RED;
        this.ActionBarContextView = false;
        this.setSubtitle = null;
        this.setTitleOptional = null;
        this.setHideOnContentScrollEnabled = null;
        this.MediaDescriptionCompat = null;
        this.setWindowTitle = null;
        this.setPadding = null;
        this.setLogo = null;
        if (z) {
            this.setExpandedActionViewsExclusive = null;
            this.PlaybackStateCompat.writeLock().lock();
            try {
                if (this.Keep != null) {
                    this.Keep.MediaBrowserCompat$ItemReceiver();
                    this.Keep = null;
                }
                this.PlaybackStateCompat.writeLock().unlock();
                Bitmap bitmap = this.MediaBrowserCompat$SearchResultReceiver;
                if (bitmap != null && !this.MediaSessionCompat$ResultReceiverWrapper) {
                    bitmap.recycle();
                }
                this.setOverlayMode = 0;
                this.setActionBarVisibilityCallback = 0;
                this.ActionBarOverlayLayout = 0;
                this.setMenuPrepared = null;
                this.setTabContainer = null;
                this.setHasNonEmbeddedTabs = false;
                this.AppCompatViewInflater = false;
                this.MediaBrowserCompat$SearchResultReceiver = null;
                this.f2429x50fd9e4a = false;
                this.MediaSessionCompat$ResultReceiverWrapper = false;
            } catch (Throwable th) {
                this.PlaybackStateCompat.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<C1017x7620d44b>> map = this.setOverflowIcon;
        if (map != null) {
            for (Map.Entry<Integer, List<C1017x7620d44b>> value : map.entrySet()) {
                for (C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver : (List) value.getValue()) {
                    subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = false;
                    if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
                        subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.recycle();
                        subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = null;
                    }
                }
            }
            this.setOverflowIcon = null;
        }
        MediaBrowserCompat$ItemReceiver(getContext());
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver(final Context context) {
        this.setHasDecor = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.setStackedBackground || !SubsamplingScaleImageView.this.setHasNonEmbeddedTabs || SubsamplingScaleImageView.this.setPresenter == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.setIcon))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF(SubsamplingScaleImageView.this.setPresenter.x + (f * 0.25f), SubsamplingScaleImageView.this.setPresenter.y + (f2 * 0.25f));
                SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver = new SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView.this, new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.setWindowCallback, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.setWindowCallback), (byte) 0);
                if (SubsamplingScaleImageView.IconCompatParcelizer.contains(1)) {
                    subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = 1;
                    subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.write = false;
                    subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.read = 3;
                    subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.read();
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown easing type: ");
                sb.append(1);
                throw new IllegalArgumentException(sb.toString());
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public final boolean onDoubleTap(MotionEvent motionEvent) {
                if (!SubsamplingScaleImageView.this.ActionMenuView$OnMenuItemClickListener || !SubsamplingScaleImageView.this.setHasNonEmbeddedTabs || SubsamplingScaleImageView.this.setPresenter == null) {
                    return super.onDoubleTapEvent(motionEvent);
                }
                SubsamplingScaleImageView.this.MediaBrowserCompat$ItemReceiver(context);
                if (SubsamplingScaleImageView.this.ActionBarContainer) {
                    PointF unused = SubsamplingScaleImageView.this.setOverflowReserved = new PointF(motionEvent.getX(), motionEvent.getY());
                    PointF unused2 = SubsamplingScaleImageView.this.ActivityChooserView = new PointF(SubsamplingScaleImageView.this.setPresenter.x, SubsamplingScaleImageView.this.setPresenter.y);
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    float unused3 = subsamplingScaleImageView.ActionMenuView = subsamplingScaleImageView.setWindowCallback;
                    boolean unused4 = SubsamplingScaleImageView.this.setPopupCallback = true;
                    boolean unused5 = SubsamplingScaleImageView.this.setIcon = true;
                    float unused6 = SubsamplingScaleImageView.this.setTransitioning = -1.0f;
                    SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                    PointF MediaBrowserCompat$SearchResultReceiver = subsamplingScaleImageView2.setOverflowReserved;
                    PointF unused7 = subsamplingScaleImageView2.setSubtitle = subsamplingScaleImageView2.read(MediaBrowserCompat$SearchResultReceiver.x, MediaBrowserCompat$SearchResultReceiver.y, new PointF());
                    PointF unused8 = SubsamplingScaleImageView.this.setHideOnContentScrollEnabled = new PointF(motionEvent.getX(), motionEvent.getY());
                    PointF unused9 = SubsamplingScaleImageView.this.setTitleOptional = new PointF(SubsamplingScaleImageView.this.setSubtitle.x, SubsamplingScaleImageView.this.setSubtitle.y);
                    boolean unused10 = SubsamplingScaleImageView.this.ActionBarContextView = false;
                    return false;
                }
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                subsamplingScaleImageView3.MediaBrowserCompat$CustomActionResultReceiver(subsamplingScaleImageView3.read(pointF.x, pointF.y, new PointF()), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
        });
        this.ActionMenuPresenter$OverflowMenuButton = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2)};
        if (this.ParcelableVolumeInfo) {
            Log.d(MediaBrowserCompat$ItemReceiver, String.format("onSizeChanged %dx%d -> %dx%d", objArr));
        }
        PointF write2 = write();
        if (this.setHasNonEmbeddedTabs && write2 != null) {
            this.MediaDescriptionCompat = null;
            this.setSplitBackground = Float.valueOf(this.setWindowCallback);
            this.setMenu = write2;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = false;
        boolean z2 = mode != 1073741824;
        if (mode2 != 1073741824) {
            z = true;
        }
        if (this.setOverlayMode > 0 && this.setActionBarVisibilityCallback > 0) {
            if (z2 && z) {
                size = MediaSessionCompat$ResultReceiverWrapper();
                size2 = MediaDescriptionCompat();
            } else if (z) {
                size2 = (int) ((((double) MediaDescriptionCompat()) / ((double) MediaSessionCompat$ResultReceiverWrapper())) * ((double) size));
            } else if (z2) {
                size = (int) ((((double) MediaSessionCompat$ResultReceiverWrapper()) / ((double) MediaDescriptionCompat())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        write write2 = this.MediaDescriptionCompat;
        if (write2 == null || write2.read) {
            this.MediaDescriptionCompat = null;
            if (this.setPresenter == null) {
                GestureDetector gestureDetector2 = this.ActionMenuPresenter$OverflowMenuButton;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                }
                return true;
            } else if (this.setPopupCallback || ((gestureDetector = this.setHasDecor) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.ActivityChooserView == null) {
                    this.ActivityChooserView = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.setPopupTheme == null) {
                    this.setPopupTheme = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                if (this.setOverflowReserved == null) {
                    this.setOverflowReserved = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                this.setPopupTheme.set(this.setPresenter);
                boolean IconCompatParcelizer2 = IconCompatParcelizer(motionEvent);
                write(this.setPopupTheme);
                if (IconCompatParcelizer2 || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else {
                this.setIcon = false;
                this.setItemInvoker = false;
                this.ListMenuItemView = 0;
                return true;
            }
        } else {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ce, code lost:
        if ((r1 * ((float) r5)) < ((float) getHeight())) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x030b, code lost:
        if ((r1 * ((float) r5)) >= ((float) getWidth())) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x030e, code lost:
        IconCompatParcelizer(true);
        r1 = r0.setOverflowReserved;
        r2 = r0.setSubtitle;
        r5 = r2.x;
        r2 = r2.y;
        r6 = new android.graphics.PointF();
        r8 = r0.setPresenter;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0320, code lost:
        if (r8 != null) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0323, code lost:
        r4 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0325, code lost:
        if (r8 != null) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0327, code lost:
        r5 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0329, code lost:
        r5 = (r5 * r0.setWindowCallback) + r8.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x032f, code lost:
        r8 = r0.setPresenter;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0331, code lost:
        if (r8 != null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0334, code lost:
        r4 = r8.y + (r2 * r0.setWindowCallback);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x033a, code lost:
        r6.set(r5, r4);
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x033e, code lost:
        r1.set(r4);
        r0.ActivityChooserView.set(r0.setPresenter);
        r0.ActionMenuView = r0.setWindowCallback;
        r2 = com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0124, code lost:
        if ((r1 * ((float) r3)) < ((float) getHeight())) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0161, code lost:
        if ((r1 * ((float) r3)) >= ((float) getWidth())) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0164, code lost:
        IconCompatParcelizer(true);
        r0.setOverflowReserved.set(r4, r12);
        r0.ActivityChooserView.set(r0.setPresenter);
        r0.ActionMenuView = r0.setWindowCallback;
        r0.setMenuCallbacks = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04c1 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean IconCompatParcelizer(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getPointerCount()
            int r3 = r17.getAction()
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 2
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x053d
            if (r3 == r8) goto L_0x04c3
            if (r3 == r6) goto L_0x0029
            r9 = 5
            if (r3 == r9) goto L_0x053d
            r9 = 6
            if (r3 == r9) goto L_0x04c3
            r9 = 261(0x105, float:3.66E-43)
            if (r3 == r9) goto L_0x053d
            r4 = 262(0x106, float:3.67E-43)
            if (r3 == r4) goto L_0x04c3
            r4 = r7
            goto L_0x04c2
        L_0x0029:
            int r3 = r0.ListMenuItemView
            if (r3 <= 0) goto L_0x04b4
            r3 = 1084227584(0x40a00000, float:5.0)
            r9 = 270(0x10e, float:3.78E-43)
            r10 = 90
            r11 = -1
            if (r2 < r6) goto L_0x01f1
            float r2 = r1.getX(r7)
            float r4 = r1.getX(r8)
            float r12 = r1.getY(r7)
            float r13 = r1.getY(r8)
            float r2 = r2 - r4
            float r12 = r12 - r13
            float r2 = r2 * r2
            float r12 = r12 * r12
            float r2 = r2 + r12
            double r12 = (double) r2
            double r12 = java.lang.Math.sqrt(r12)
            float r2 = (float) r12
            float r4 = r1.getX(r7)
            float r12 = r1.getX(r8)
            float r4 = r4 + r12
            float r4 = r4 / r5
            float r12 = r1.getY(r7)
            float r1 = r1.getY(r8)
            float r12 = r12 + r1
            float r12 = r12 / r5
            boolean r1 = r0.ActionMenuView$OnMenuItemClickListener
            if (r1 == 0) goto L_0x04b4
            android.graphics.PointF r1 = r0.setOverflowReserved
            float r1 = r1.x
            android.graphics.PointF r5 = r0.setOverflowReserved
            float r5 = r5.y
            float r1 = r1 - r4
            float r5 = r5 - r12
            float r1 = r1 * r1
            float r5 = r5 * r5
            float r1 = r1 + r5
            double r13 = (double) r1
            double r13 = java.lang.Math.sqrt(r13)
            float r1 = (float) r13
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0090
            float r1 = r0.setMenuCallbacks
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0090
            boolean r1 = r0.setItemInvoker
            if (r1 == 0) goto L_0x04b4
        L_0x0090:
            r0.setIcon = r8
            r0.setItemInvoker = r8
            float r1 = r0.setWindowCallback
            double r13 = (double) r1
            float r1 = r0.setShortcut
            float r3 = r0.setMenuCallbacks
            float r3 = r2 / r3
            float r5 = r0.ActionMenuView
            float r3 = r3 * r5
            float r1 = java.lang.Math.min(r1, r3)
            r0.setWindowCallback = r1
            float r3 = r16.RatingCompat()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x00c5
            r0.setMenuCallbacks = r2
            float r1 = r16.RatingCompat()
            r0.ActionMenuView = r1
            android.graphics.PointF r1 = r0.setOverflowReserved
            r1.set(r4, r12)
            android.graphics.PointF r1 = r0.ActivityChooserView
            android.graphics.PointF r2 = r0.setPresenter
            r1.set(r2)
            r1 = r8
            goto L_0x01e7
        L_0x00c5:
            boolean r1 = r0.setStackedBackground
            if (r1 == 0) goto L_0x017a
            android.graphics.PointF r1 = r0.setOverflowReserved
            float r1 = r1.x
            android.graphics.PointF r3 = r0.ActivityChooserView
            float r3 = r3.x
            android.graphics.PointF r5 = r0.setOverflowReserved
            float r5 = r5.y
            android.graphics.PointF r6 = r0.ActivityChooserView
            float r6 = r6.y
            float r15 = r0.setWindowCallback
            float r7 = r0.ActionMenuView
            float r15 = r15 / r7
            android.graphics.PointF r7 = r0.setPresenter
            float r1 = r1 - r3
            float r1 = r1 * r15
            float r1 = r4 - r1
            r7.x = r1
            android.graphics.PointF r1 = r0.setPresenter
            float r5 = r5 - r6
            float r5 = r5 * r15
            float r3 = r12 - r5
            r1.y = r3
            int r1 = r0.setContentHeight
            if (r1 != r11) goto L_0x00f4
            int r1 = r0.ActionBarOverlayLayout
        L_0x00f4:
            if (r1 == r10) goto L_0x00fb
            if (r1 == r9) goto L_0x00fb
            int r1 = r0.setActionBarVisibilityCallback
            goto L_0x00fd
        L_0x00fb:
            int r1 = r0.setOverlayMode
        L_0x00fd:
            double r5 = (double) r1
            double r5 = r5 * r13
            int r1 = r16.getHeight()
            double r8 = (double) r1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0129
            float r1 = r0.setWindowCallback
            int r3 = r0.setContentHeight
            if (r3 != r11) goto L_0x0110
            int r3 = r0.ActionBarOverlayLayout
        L_0x0110:
            if (r3 == r10) goto L_0x0119
            r5 = 270(0x10e, float:3.78E-43)
            if (r3 == r5) goto L_0x0119
            int r3 = r0.setActionBarVisibilityCallback
            goto L_0x011b
        L_0x0119:
            int r3 = r0.setOverlayMode
        L_0x011b:
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r16.getHeight()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r1 = 1
            goto L_0x0164
        L_0x0129:
            int r1 = r0.setContentHeight
            if (r1 != r11) goto L_0x012f
            int r1 = r0.ActionBarOverlayLayout
        L_0x012f:
            if (r1 == r10) goto L_0x0138
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 == r3) goto L_0x0138
            int r1 = r0.setOverlayMode
            goto L_0x013a
        L_0x0138:
            int r1 = r0.setActionBarVisibilityCallback
        L_0x013a:
            double r5 = (double) r1
            double r13 = r13 * r5
            int r1 = r16.getWidth()
            double r5 = (double) r1
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01a2
            float r1 = r0.setWindowCallback
            int r3 = r0.setContentHeight
            if (r3 != r11) goto L_0x014d
            int r3 = r0.ActionBarOverlayLayout
        L_0x014d:
            if (r3 == r10) goto L_0x0156
            r5 = 270(0x10e, float:3.78E-43)
            if (r3 == r5) goto L_0x0156
            int r3 = r0.setOverlayMode
            goto L_0x0158
        L_0x0156:
            int r3 = r0.setActionBarVisibilityCallback
        L_0x0158:
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r16.getWidth()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x01a2
            goto L_0x0127
        L_0x0164:
            r0.IconCompatParcelizer((boolean) r1)
            android.graphics.PointF r1 = r0.setOverflowReserved
            r1.set(r4, r12)
            android.graphics.PointF r1 = r0.ActivityChooserView
            android.graphics.PointF r3 = r0.setPresenter
            r1.set(r3)
            float r1 = r0.setWindowCallback
            r0.ActionMenuView = r1
            r0.setMenuCallbacks = r2
            goto L_0x01a2
        L_0x017a:
            android.graphics.PointF r1 = r0.setShowingForActionMode
            if (r1 == 0) goto L_0x01a4
            android.graphics.PointF r1 = r0.setPresenter
            int r2 = r16.getWidth()
            int r2 = r2 / r6
            float r2 = (float) r2
            float r3 = r0.setWindowCallback
            android.graphics.PointF r4 = r0.setShowingForActionMode
            float r4 = r4.x
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.x = r2
            android.graphics.PointF r1 = r0.setPresenter
            int r2 = r16.getHeight()
            int r2 = r2 / r6
            float r2 = (float) r2
            float r3 = r0.setWindowCallback
            android.graphics.PointF r4 = r0.setShowingForActionMode
            float r4 = r4.y
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.y = r2
        L_0x01a2:
            r1 = 1
            goto L_0x01e7
        L_0x01a4:
            android.graphics.PointF r1 = r0.setPresenter
            int r2 = r16.getWidth()
            int r2 = r2 / r6
            float r2 = (float) r2
            float r3 = r0.setWindowCallback
            int r4 = r0.setContentHeight
            if (r4 != r11) goto L_0x01b4
            int r4 = r0.ActionBarOverlayLayout
        L_0x01b4:
            if (r4 == r10) goto L_0x01bd
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x01bd
            int r4 = r0.setOverlayMode
            goto L_0x01bf
        L_0x01bd:
            int r4 = r0.setActionBarVisibilityCallback
        L_0x01bf:
            int r4 = r4 / r6
            float r4 = (float) r4
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.x = r2
            android.graphics.PointF r1 = r0.setPresenter
            int r2 = r16.getHeight()
            int r2 = r2 / r6
            float r2 = (float) r2
            float r3 = r0.setWindowCallback
            int r4 = r0.setContentHeight
            if (r4 != r11) goto L_0x01d5
            int r4 = r0.ActionBarOverlayLayout
        L_0x01d5:
            if (r4 == r10) goto L_0x01de
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x01de
            int r4 = r0.setActionBarVisibilityCallback
            goto L_0x01e0
        L_0x01de:
            int r4 = r0.setOverlayMode
        L_0x01e0:
            int r4 = r4 / r6
            float r4 = (float) r4
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.y = r2
            goto L_0x01a2
        L_0x01e7:
            r0.IconCompatParcelizer((boolean) r1)
            boolean r1 = r0.AppCompatActivity
            r0.read((boolean) r1)
            goto L_0x04b2
        L_0x01f1:
            boolean r2 = r0.setPopupCallback
            if (r2 == 0) goto L_0x03c6
            android.graphics.PointF r2 = r0.setHideOnContentScrollEnabled
            float r2 = r2.y
            float r3 = r17.getY()
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r5
            float r3 = r0.setCustomView
            float r2 = r2 + r3
            float r3 = r0.setTransitioning
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0210
            r0.setTransitioning = r2
        L_0x0210:
            float r3 = r17.getY()
            android.graphics.PointF r5 = r0.setTitleOptional
            float r5 = r5.y
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x021e
            r3 = 1
            goto L_0x021f
        L_0x021e:
            r3 = 0
        L_0x021f:
            android.graphics.PointF r5 = r0.setTitleOptional
            float r1 = r17.getY()
            r8 = 0
            r5.set(r8, r1)
            float r1 = r0.setTransitioning
            float r1 = r2 / r1
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r5 - r1
            float r1 = java.lang.Math.abs(r1)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r9
            r9 = 1022739087(0x3cf5c28f, float:0.03)
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0243
            boolean r9 = r0.ActionBarContextView
            if (r9 == 0) goto L_0x03b9
        L_0x0243:
            r7 = 1
            r0.ActionBarContextView = r7
            float r9 = r0.setTransitioning
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0251
            if (r3 == 0) goto L_0x0250
            float r5 = r5 + r1
            goto L_0x0251
        L_0x0250:
            float r5 = r5 - r1
        L_0x0251:
            float r1 = r0.setWindowCallback
            double r12 = (double) r1
            float r1 = r16.RatingCompat()
            float r3 = r0.setShortcut
            float r9 = r0.setWindowCallback
            float r9 = r9 * r5
            float r3 = java.lang.Math.min(r3, r9)
            float r1 = java.lang.Math.max(r1, r3)
            r0.setWindowCallback = r1
            boolean r1 = r0.setStackedBackground
            if (r1 == 0) goto L_0x034e
            android.graphics.PointF r1 = r0.setOverflowReserved
            float r1 = r1.x
            android.graphics.PointF r3 = r0.ActivityChooserView
            float r3 = r3.x
            android.graphics.PointF r5 = r0.setOverflowReserved
            float r5 = r5.y
            android.graphics.PointF r6 = r0.ActivityChooserView
            float r6 = r6.y
            float r9 = r0.setWindowCallback
            float r14 = r0.ActionMenuView
            float r9 = r9 / r14
            android.graphics.PointF r14 = r0.setPresenter
            android.graphics.PointF r7 = r0.setOverflowReserved
            float r7 = r7.x
            float r1 = r1 - r3
            float r1 = r1 * r9
            float r7 = r7 - r1
            r14.x = r7
            android.graphics.PointF r1 = r0.setPresenter
            android.graphics.PointF r3 = r0.setOverflowReserved
            float r3 = r3.y
            float r5 = r5 - r6
            float r5 = r5 * r9
            float r3 = r3 - r5
            r1.y = r3
            int r1 = r0.setContentHeight
            if (r1 != r11) goto L_0x029c
            int r1 = r0.ActionBarOverlayLayout
        L_0x029c:
            if (r1 == r10) goto L_0x02a5
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 == r3) goto L_0x02a5
            int r1 = r0.setActionBarVisibilityCallback
            goto L_0x02a7
        L_0x02a5:
            int r1 = r0.setOverlayMode
        L_0x02a7:
            double r5 = (double) r1
            double r5 = r5 * r12
            int r1 = r16.getHeight()
            double r8 = (double) r1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d3
            float r1 = r0.setWindowCallback
            int r5 = r0.setContentHeight
            if (r5 != r11) goto L_0x02ba
            int r5 = r0.ActionBarOverlayLayout
        L_0x02ba:
            if (r5 == r10) goto L_0x02c3
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 == r6) goto L_0x02c3
            int r5 = r0.setActionBarVisibilityCallback
            goto L_0x02c5
        L_0x02c3:
            int r5 = r0.setOverlayMode
        L_0x02c5:
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = r16.getHeight()
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d1
            goto L_0x02d3
        L_0x02d1:
            r1 = 1
            goto L_0x030e
        L_0x02d3:
            int r1 = r0.setContentHeight
            if (r1 != r11) goto L_0x02d9
            int r1 = r0.ActionBarOverlayLayout
        L_0x02d9:
            if (r1 == r10) goto L_0x02e2
            r5 = 270(0x10e, float:3.78E-43)
            if (r1 == r5) goto L_0x02e2
            int r1 = r0.setOverlayMode
            goto L_0x02e4
        L_0x02e2:
            int r1 = r0.setActionBarVisibilityCallback
        L_0x02e4:
            double r5 = (double) r1
            double r12 = r12 * r5
            int r1 = r16.getWidth()
            double r5 = (double) r1
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x03b9
            float r1 = r0.setWindowCallback
            int r5 = r0.setContentHeight
            if (r5 != r11) goto L_0x02f7
            int r5 = r0.ActionBarOverlayLayout
        L_0x02f7:
            if (r5 == r10) goto L_0x0300
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 == r6) goto L_0x0300
            int r5 = r0.setOverlayMode
            goto L_0x0302
        L_0x0300:
            int r5 = r0.setActionBarVisibilityCallback
        L_0x0302:
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = r16.getWidth()
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x03b9
            goto L_0x02d1
        L_0x030e:
            r0.IconCompatParcelizer((boolean) r1)
            android.graphics.PointF r1 = r0.setOverflowReserved
            android.graphics.PointF r2 = r0.setSubtitle
            float r5 = r2.x
            float r2 = r2.y
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>()
            android.graphics.PointF r8 = r0.setPresenter
            if (r8 != 0) goto L_0x0323
            goto L_0x033e
        L_0x0323:
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r8 != 0) goto L_0x0329
            r5 = r4
            goto L_0x032f
        L_0x0329:
            float r9 = r0.setWindowCallback
            float r5 = r5 * r9
            float r8 = r8.x
            float r5 = r5 + r8
        L_0x032f:
            android.graphics.PointF r8 = r0.setPresenter
            if (r8 != 0) goto L_0x0334
            goto L_0x033a
        L_0x0334:
            float r4 = r0.setWindowCallback
            float r2 = r2 * r4
            float r4 = r8.y
            float r4 = r4 + r2
        L_0x033a:
            r6.set(r5, r4)
            r4 = r6
        L_0x033e:
            r1.set(r4)
            android.graphics.PointF r1 = r0.ActivityChooserView
            android.graphics.PointF r2 = r0.setPresenter
            r1.set(r2)
            float r1 = r0.setWindowCallback
            r0.ActionMenuView = r1
            r2 = 0
            goto L_0x03b9
        L_0x034e:
            android.graphics.PointF r1 = r0.setShowingForActionMode
            if (r1 == 0) goto L_0x0377
            android.graphics.PointF r1 = r0.setPresenter
            int r3 = r16.getWidth()
            int r3 = r3 / r6
            float r3 = (float) r3
            float r4 = r0.setWindowCallback
            android.graphics.PointF r5 = r0.setShowingForActionMode
            float r5 = r5.x
            float r4 = r4 * r5
            float r3 = r3 - r4
            r1.x = r3
            android.graphics.PointF r1 = r0.setPresenter
            int r3 = r16.getHeight()
            int r3 = r3 / r6
            float r3 = (float) r3
            float r4 = r0.setWindowCallback
            android.graphics.PointF r5 = r0.setShowingForActionMode
            float r5 = r5.y
            float r4 = r4 * r5
            float r3 = r3 - r4
            r1.y = r3
            goto L_0x03b9
        L_0x0377:
            android.graphics.PointF r1 = r0.setPresenter
            int r3 = r16.getWidth()
            int r3 = r3 / r6
            float r3 = (float) r3
            float r4 = r0.setWindowCallback
            int r5 = r0.setContentHeight
            if (r5 != r11) goto L_0x0387
            int r5 = r0.ActionBarOverlayLayout
        L_0x0387:
            if (r5 == r10) goto L_0x0390
            r8 = 270(0x10e, float:3.78E-43)
            if (r5 == r8) goto L_0x0390
            int r5 = r0.setOverlayMode
            goto L_0x0392
        L_0x0390:
            int r5 = r0.setActionBarVisibilityCallback
        L_0x0392:
            int r5 = r5 / r6
            float r5 = (float) r5
            float r4 = r4 * r5
            float r3 = r3 - r4
            r1.x = r3
            android.graphics.PointF r1 = r0.setPresenter
            int r3 = r16.getHeight()
            int r3 = r3 / r6
            float r3 = (float) r3
            float r4 = r0.setWindowCallback
            int r5 = r0.setContentHeight
            if (r5 != r11) goto L_0x03a8
            int r5 = r0.ActionBarOverlayLayout
        L_0x03a8:
            if (r5 == r10) goto L_0x03b1
            r8 = 270(0x10e, float:3.78E-43)
            if (r5 == r8) goto L_0x03b1
            int r5 = r0.setActionBarVisibilityCallback
            goto L_0x03b3
        L_0x03b1:
            int r5 = r0.setOverlayMode
        L_0x03b3:
            int r5 = r5 / r6
            float r5 = (float) r5
            float r4 = r4 * r5
            float r3 = r3 - r4
            r1.y = r3
        L_0x03b9:
            r0.setTransitioning = r2
            r1 = 1
            r0.IconCompatParcelizer((boolean) r1)
            boolean r1 = r0.AppCompatActivity
            r0.read((boolean) r1)
            goto L_0x04b2
        L_0x03c6:
            boolean r2 = r0.setIcon
            if (r2 != 0) goto L_0x04b4
            float r2 = r17.getX()
            android.graphics.PointF r4 = r0.setOverflowReserved
            float r4 = r4.x
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r4 = r17.getY()
            android.graphics.PointF r5 = r0.setOverflowReserved
            float r5 = r5.y
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            float r5 = r0.AlertController$RecycleListView
            float r5 = r5 * r3
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x03f3
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x03f3
            boolean r6 = r0.setItemInvoker
            if (r6 == 0) goto L_0x04b4
        L_0x03f3:
            android.graphics.PointF r6 = r0.setPresenter
            android.graphics.PointF r8 = r0.ActivityChooserView
            float r8 = r8.x
            float r9 = r17.getX()
            android.graphics.PointF r10 = r0.setOverflowReserved
            float r10 = r10.x
            float r9 = r9 - r10
            float r8 = r8 + r9
            r6.x = r8
            android.graphics.PointF r6 = r0.setPresenter
            android.graphics.PointF r8 = r0.ActivityChooserView
            float r8 = r8.y
            float r1 = r17.getY()
            android.graphics.PointF r9 = r0.setOverflowReserved
            float r9 = r9.y
            float r1 = r1 - r9
            float r8 = r8 + r1
            r6.y = r8
            android.graphics.PointF r1 = r0.setPresenter
            float r1 = r1.x
            android.graphics.PointF r6 = r0.setPresenter
            float r6 = r6.y
            r7 = 1
            r0.IconCompatParcelizer((boolean) r7)
            android.graphics.PointF r8 = r0.setPresenter
            float r8 = r8.x
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x042d
            r1 = 1
            goto L_0x042e
        L_0x042d:
            r1 = 0
        L_0x042e:
            android.graphics.PointF r8 = r0.setPresenter
            float r8 = r8.y
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0438
            r8 = 1
            goto L_0x0439
        L_0x0438:
            r8 = 0
        L_0x0439:
            if (r1 == 0) goto L_0x0445
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0445
            boolean r9 = r0.setItemInvoker
            if (r9 != 0) goto L_0x0445
            r9 = 1
            goto L_0x0446
        L_0x0445:
            r9 = 0
        L_0x0446:
            if (r8 == 0) goto L_0x0452
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0452
            boolean r2 = r0.setItemInvoker
            if (r2 != 0) goto L_0x0452
            r2 = 1
            goto L_0x0453
        L_0x0452:
            r2 = 0
        L_0x0453:
            android.graphics.PointF r10 = r0.setPresenter
            float r10 = r10.y
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0464
            r6 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 * r5
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0464
            r6 = 1
            goto L_0x0465
        L_0x0464:
            r6 = 0
        L_0x0465:
            if (r9 != 0) goto L_0x0477
            if (r2 != 0) goto L_0x0477
            if (r1 == 0) goto L_0x0473
            if (r8 == 0) goto L_0x0473
            if (r6 != 0) goto L_0x0473
            boolean r1 = r0.setItemInvoker
            if (r1 == 0) goto L_0x0477
        L_0x0473:
            r1 = 1
            r0.setItemInvoker = r1
            goto L_0x048f
        L_0x0477:
            if (r3 > 0) goto L_0x047d
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x048f
        L_0x047d:
            r1 = 0
            r0.ListMenuItemView = r1
            android.os.Handler r2 = r0.ActionMenuItemView
            r3 = 1
            r2.removeMessages(r3)
            android.view.ViewParent r2 = r16.getParent()
            if (r2 == 0) goto L_0x048f
            r2.requestDisallowInterceptTouchEvent(r1)
        L_0x048f:
            boolean r1 = r0.setStackedBackground
            if (r1 != 0) goto L_0x04ad
            android.graphics.PointF r1 = r0.setPresenter
            android.graphics.PointF r2 = r0.ActivityChooserView
            float r2 = r2.x
            r1.x = r2
            android.graphics.PointF r1 = r0.setPresenter
            android.graphics.PointF r2 = r0.ActivityChooserView
            float r2 = r2.y
            r1.y = r2
            android.view.ViewParent r1 = r16.getParent()
            if (r1 == 0) goto L_0x04ad
            r2 = 0
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x04ad:
            boolean r1 = r0.AppCompatActivity
            r0.read((boolean) r1)
        L_0x04b2:
            r1 = 1
            goto L_0x04b5
        L_0x04b4:
            r1 = 0
        L_0x04b5:
            if (r1 == 0) goto L_0x04c1
            android.os.Handler r1 = r0.ActionMenuItemView
            r3 = 1
            r1.removeMessages(r3)
            r16.invalidate()
            return r3
        L_0x04c1:
            r4 = 0
        L_0x04c2:
            return r4
        L_0x04c3:
            r4 = r7
            r3 = r8
            android.os.Handler r5 = r0.ActionMenuItemView
            r5.removeMessages(r3)
            boolean r3 = r0.setPopupCallback
            if (r3 == 0) goto L_0x04db
            r0.setPopupCallback = r4
            boolean r3 = r0.ActionBarContextView
            if (r3 != 0) goto L_0x04db
            android.graphics.PointF r3 = r0.setSubtitle
            android.graphics.PointF r4 = r0.setOverflowReserved
            r0.MediaBrowserCompat$CustomActionResultReceiver((android.graphics.PointF) r3, (android.graphics.PointF) r4)
        L_0x04db:
            int r3 = r0.ListMenuItemView
            if (r3 <= 0) goto L_0x0532
            boolean r3 = r0.setIcon
            if (r3 != 0) goto L_0x04e7
            boolean r3 = r0.setItemInvoker
            if (r3 == 0) goto L_0x0532
        L_0x04e7:
            boolean r3 = r0.setIcon
            if (r3 == 0) goto L_0x051f
            if (r2 != r6) goto L_0x051f
            r3 = 1
            r0.setItemInvoker = r3
            android.graphics.PointF r4 = r0.ActivityChooserView
            android.graphics.PointF r5 = r0.setPresenter
            float r5 = r5.x
            android.graphics.PointF r7 = r0.setPresenter
            float r7 = r7.y
            r4.set(r5, r7)
            int r4 = r17.getActionIndex()
            if (r4 != r3) goto L_0x0512
            android.graphics.PointF r4 = r0.setOverflowReserved
            r5 = 0
            float r7 = r1.getX(r5)
            float r1 = r1.getY(r5)
            r4.set(r7, r1)
            goto L_0x051f
        L_0x0512:
            android.graphics.PointF r4 = r0.setOverflowReserved
            float r5 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r4.set(r5, r1)
        L_0x051f:
            r1 = 3
            if (r2 >= r1) goto L_0x0526
            r1 = 0
            r0.setIcon = r1
            goto L_0x0527
        L_0x0526:
            r1 = 0
        L_0x0527:
            if (r2 >= r6) goto L_0x052d
            r0.setItemInvoker = r1
            r0.ListMenuItemView = r1
        L_0x052d:
            r3 = 1
            r0.read((boolean) r3)
            return r3
        L_0x0532:
            r1 = 0
            r3 = 1
            if (r2 != r3) goto L_0x053c
            r0.setIcon = r1
            r0.setItemInvoker = r1
            r0.ListMenuItemView = r1
        L_0x053c:
            return r3
        L_0x053d:
            r3 = r8
            r0.MediaDescriptionCompat = r4
            android.view.ViewParent r4 = r16.getParent()
            if (r4 == 0) goto L_0x0549
            r4.requestDisallowInterceptTouchEvent(r3)
        L_0x0549:
            int r4 = r0.ListMenuItemView
            int r4 = java.lang.Math.max(r4, r2)
            r0.ListMenuItemView = r4
            if (r2 < r6) goto L_0x05ad
            boolean r2 = r0.ActionMenuView$OnMenuItemClickListener
            if (r2 == 0) goto L_0x05a2
            r2 = 0
            float r4 = r1.getX(r2)
            float r6 = r1.getX(r3)
            float r8 = r1.getY(r2)
            float r2 = r1.getY(r3)
            float r4 = r4 - r6
            float r8 = r8 - r2
            float r4 = r4 * r4
            float r8 = r8 * r8
            float r4 = r4 + r8
            double r2 = (double) r4
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            float r3 = r0.setWindowCallback
            r0.ActionMenuView = r3
            r0.setMenuCallbacks = r2
            android.graphics.PointF r2 = r0.ActivityChooserView
            android.graphics.PointF r3 = r0.setPresenter
            float r3 = r3.x
            android.graphics.PointF r4 = r0.setPresenter
            float r4 = r4.y
            r2.set(r3, r4)
            android.graphics.PointF r2 = r0.setOverflowReserved
            r3 = 0
            float r4 = r1.getX(r3)
            r6 = 1
            float r7 = r1.getX(r6)
            float r4 = r4 + r7
            float r4 = r4 / r5
            float r3 = r1.getY(r3)
            float r1 = r1.getY(r6)
            float r3 = r3 + r1
            float r3 = r3 / r5
            r2.set(r4, r3)
            goto L_0x05a6
        L_0x05a2:
            r6 = r3
            r3 = 0
            r0.ListMenuItemView = r3
        L_0x05a6:
            android.os.Handler r1 = r0.ActionMenuItemView
            r1.removeMessages(r6)
            r4 = r6
            goto L_0x05d5
        L_0x05ad:
            boolean r2 = r0.setPopupCallback
            if (r2 != 0) goto L_0x05d4
            android.graphics.PointF r2 = r0.ActivityChooserView
            android.graphics.PointF r3 = r0.setPresenter
            float r3 = r3.x
            android.graphics.PointF r4 = r0.setPresenter
            float r4 = r4.y
            r2.set(r3, r4)
            android.graphics.PointF r2 = r0.setOverflowReserved
            float r3 = r17.getX()
            float r1 = r17.getY()
            r2.set(r3, r1)
            android.os.Handler r1 = r0.ActionMenuItemView
            r2 = 600(0x258, double:2.964E-321)
            r4 = 1
            r1.sendEmptyMessageDelayed(r4, r2)
            goto L_0x05d5
        L_0x05d4:
            r4 = 1
        L_0x05d5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.IconCompatParcelizer(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$CustomActionResultReceiver(PointF pointF, PointF pointF2) {
        int i;
        int i2;
        if (!this.setStackedBackground) {
            PointF pointF3 = this.setShowingForActionMode;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = this.setShowingForActionMode.y;
            } else {
                int i3 = this.setContentHeight;
                if (i3 == -1) {
                    i3 = this.ActionBarOverlayLayout;
                }
                if (i3 == 90 || i3 == 270) {
                    i = this.setActionBarVisibilityCallback;
                } else {
                    i = this.setOverlayMode;
                }
                pointF.x = (float) (i / 2);
                int i4 = this.setContentHeight;
                if (i4 == -1) {
                    i4 = this.ActionBarOverlayLayout;
                }
                if (i4 == 90 || i4 == 270) {
                    i2 = this.setOverlayMode;
                } else {
                    i2 = this.setActionBarVisibilityCallback;
                }
                pointF.y = (float) (i2 / 2);
            }
        }
        float min = Math.min(this.setShortcut, this.AppCompatDelegateImpl$ListMenuDecorView);
        float f = this.setWindowCallback;
        boolean z = ((double) f) <= ((double) min) * 0.9d || f == this.setForceShowIcon;
        if (!z) {
            min = RatingCompat();
        }
        float f2 = min;
        int i5 = this.AppCompatDialogFragment;
        if (i5 == 3) {
            setScaleAndCenter(f2, pointF);
        } else if (i5 == 2 || !z || !this.setStackedBackground) {
            SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver = new SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(this, f2, pointF, (byte) 0);
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = false;
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = (long) this.setBackgroundResource;
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.read = 4;
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver.read();
        } else if (i5 == 1) {
            SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver2 = new SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(this, f2, pointF, pointF2, (byte) 0);
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer = false;
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = (long) this.setBackgroundResource;
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver2.read = 4;
            subsamplingScaleImageView$MediaBrowserCompat$ItemReceiver2.read();
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.MediaSessionCompat$QueueItem == null) {
            Paint paint = new Paint();
            this.MediaSessionCompat$QueueItem = paint;
            paint.setAntiAlias(true);
            this.MediaSessionCompat$QueueItem.setFilterBitmap(true);
            this.MediaSessionCompat$QueueItem.setDither(true);
        }
        if ((this.PlaybackStateCompat$CustomAction == null || this.MediaSessionCompat$Token == null) && this.ParcelableVolumeInfo) {
            Paint paint2 = new Paint();
            this.PlaybackStateCompat$CustomAction = paint2;
            paint2.setTextSize((float) ((int) (this.AlertController$RecycleListView * 12.0f)));
            this.PlaybackStateCompat$CustomAction.setColor(-65281);
            this.PlaybackStateCompat$CustomAction.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.MediaSessionCompat$Token = paint3;
            paint3.setColor(-65281);
            this.MediaSessionCompat$Token.setStyle(Paint.Style.STROKE);
            this.MediaSessionCompat$Token.setStrokeWidth((float) ((int) this.AlertController$RecycleListView));
        }
        if (this.setOverlayMode != 0 && this.setActionBarVisibilityCallback != 0 && getWidth() != 0 && getHeight() != 0) {
            if (this.setOverflowIcon == null && this.Keep != null) {
                MediaBrowserCompat$CustomActionResultReceiver(new Point(Math.min(canvas.getMaximumBitmapWidth(), this.setTitle), Math.min(canvas.getMaximumBitmapHeight(), this.setGroupDividerEnabled)));
            }
            if (MediaMetadataCompat()) {
                MediaBrowserCompat$SearchResultReceiver();
                write write2 = this.MediaDescriptionCompat;
                if (!(write2 == null || write2.ParcelableVolumeInfo == null)) {
                    if (this.setPopupTheme == null) {
                        this.setPopupTheme = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    }
                    this.setPopupTheme.set(this.setPresenter);
                    long currentTimeMillis = System.currentTimeMillis() - this.MediaDescriptionCompat.MediaSessionCompat$Token;
                    boolean z = currentTimeMillis > this.MediaDescriptionCompat.IconCompatParcelizer;
                    long min = Math.min(currentTimeMillis, this.MediaDescriptionCompat.IconCompatParcelizer);
                    this.setWindowCallback = IconCompatParcelizer(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver, min, this.MediaDescriptionCompat.MediaMetadataCompat, this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem - this.MediaDescriptionCompat.MediaMetadataCompat, this.MediaDescriptionCompat.IconCompatParcelizer);
                    float IconCompatParcelizer2 = IconCompatParcelizer(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver, min, this.MediaDescriptionCompat.ParcelableVolumeInfo.x, this.MediaDescriptionCompat.MediaSessionCompat$QueueItem.x - this.MediaDescriptionCompat.ParcelableVolumeInfo.x, this.MediaDescriptionCompat.IconCompatParcelizer);
                    float IconCompatParcelizer3 = IconCompatParcelizer(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver, min, this.MediaDescriptionCompat.ParcelableVolumeInfo.y, this.MediaDescriptionCompat.MediaSessionCompat$QueueItem.y - this.MediaDescriptionCompat.ParcelableVolumeInfo.y, this.MediaDescriptionCompat.IconCompatParcelizer);
                    PointF pointF = this.setPresenter;
                    float f16 = pointF.x;
                    float f17 = this.MediaDescriptionCompat.RatingCompat.x;
                    PointF pointF2 = this.setPresenter;
                    if (pointF2 == null) {
                        f14 = Float.NaN;
                    } else {
                        f14 = (f17 * this.setWindowCallback) + pointF2.x;
                    }
                    pointF.x = f16 - (f14 - IconCompatParcelizer2);
                    PointF pointF3 = this.setPresenter;
                    float f18 = pointF3.y;
                    float f19 = this.MediaDescriptionCompat.RatingCompat.y;
                    PointF pointF4 = this.setPresenter;
                    if (pointF4 == null) {
                        f15 = Float.NaN;
                    } else {
                        f15 = (f19 * this.setWindowCallback) + pointF4.y;
                    }
                    pointF3.y = f18 - (f15 - IconCompatParcelizer3);
                    IconCompatParcelizer(z || this.MediaDescriptionCompat.MediaMetadataCompat == this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem);
                    write(this.setPopupTheme);
                    read(z);
                    if (z) {
                        this.MediaDescriptionCompat = null;
                    }
                    invalidate();
                }
                if (this.setOverflowIcon == null || !MediaBrowserCompat$MediaItem()) {
                    Bitmap bitmap = this.MediaBrowserCompat$SearchResultReceiver;
                    if (bitmap != null) {
                        float f20 = this.setWindowCallback;
                        if (this.f2429x50fd9e4a) {
                            float width = f20 * (((float) this.setOverlayMode) / ((float) bitmap.getWidth()));
                            f20 = this.setWindowCallback * (((float) this.setActionBarVisibilityCallback) / ((float) this.MediaBrowserCompat$SearchResultReceiver.getHeight()));
                            f9 = width;
                        } else {
                            f9 = f20;
                        }
                        if (this.setPadding == null) {
                            this.setPadding = new Matrix();
                        }
                        this.setPadding.reset();
                        this.setPadding.postScale(f9, f20);
                        Matrix matrix = this.setPadding;
                        int i = this.setContentHeight;
                        if (i == -1) {
                            i = this.ActionBarOverlayLayout;
                        }
                        matrix.postRotate((float) i);
                        this.setPadding.postTranslate(this.setPresenter.x, this.setPresenter.y);
                        int i2 = this.setContentHeight;
                        if (i2 == -1) {
                            i2 = this.ActionBarOverlayLayout;
                        }
                        if (i2 == 180) {
                            Matrix matrix2 = this.setPadding;
                            float f21 = this.setWindowCallback;
                            matrix2.postTranslate(((float) this.setOverlayMode) * f21, f21 * ((float) this.setActionBarVisibilityCallback));
                        } else {
                            int i3 = this.setContentHeight;
                            if (i3 == -1) {
                                i3 = this.ActionBarOverlayLayout;
                            }
                            if (i3 == 90) {
                                this.setPadding.postTranslate(this.setWindowCallback * ((float) this.setActionBarVisibilityCallback), BitmapDescriptorFactory.HUE_RED);
                            } else {
                                int i4 = this.setContentHeight;
                                if (i4 == -1) {
                                    i4 = this.ActionBarOverlayLayout;
                                }
                                if (i4 == 270) {
                                    this.setPadding.postTranslate(BitmapDescriptorFactory.HUE_RED, this.setWindowCallback * ((float) this.setOverlayMode));
                                }
                            }
                        }
                        if (this.setOnMenuItemClickListener != null) {
                            if (this.setLogo == null) {
                                this.setLogo = new RectF();
                            }
                            this.setLogo.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (this.f2429x50fd9e4a ? this.MediaBrowserCompat$SearchResultReceiver.getWidth() : this.setOverlayMode), (float) (this.f2429x50fd9e4a ? this.MediaBrowserCompat$SearchResultReceiver.getHeight() : this.setActionBarVisibilityCallback));
                            this.setPadding.mapRect(this.setLogo);
                            canvas2.drawRect(this.setLogo, this.setOnMenuItemClickListener);
                        }
                        canvas2.drawBitmap(this.MediaBrowserCompat$SearchResultReceiver, this.setPadding, this.MediaSessionCompat$QueueItem);
                    }
                } else {
                    int min2 = Math.min(this.setChecked, MediaBrowserCompat$ItemReceiver(this.setWindowCallback));
                    boolean z2 = false;
                    for (Map.Entry next : this.setOverflowIcon.entrySet()) {
                        if (((Integer) next.getKey()).intValue() == min2) {
                            for (C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver : (List) next.getValue()) {
                                if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver && (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver || subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver == null)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry next2 : this.setOverflowIcon.entrySet()) {
                        if (((Integer) next2.getKey()).intValue() == min2 || z2) {
                            for (C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2 : (List) next2.getValue()) {
                                Rect rect = subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.read;
                                Rect rect2 = subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat;
                                float f22 = (float) rect.left;
                                PointF pointF5 = this.setPresenter;
                                if (pointF5 == null) {
                                    f10 = Float.NaN;
                                } else {
                                    f10 = (f22 * this.setWindowCallback) + pointF5.x;
                                }
                                int i5 = (int) f10;
                                float f23 = (float) rect.top;
                                PointF pointF6 = this.setPresenter;
                                if (pointF6 == null) {
                                    f11 = Float.NaN;
                                } else {
                                    f11 = (f23 * this.setWindowCallback) + pointF6.y;
                                }
                                int i6 = (int) f11;
                                float f24 = (float) rect.right;
                                PointF pointF7 = this.setPresenter;
                                if (pointF7 == null) {
                                    f12 = Float.NaN;
                                } else {
                                    f12 = (f24 * this.setWindowCallback) + pointF7.x;
                                }
                                int i7 = (int) f12;
                                float f25 = (float) rect.bottom;
                                PointF pointF8 = this.setPresenter;
                                if (pointF8 == null) {
                                    f13 = Float.NaN;
                                } else {
                                    f13 = (f25 * this.setWindowCallback) + pointF8.y;
                                }
                                rect2.set(i5, i6, i7, (int) f13);
                                if (!subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver && subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver != null) {
                                    if (this.setOnMenuItemClickListener != null) {
                                        canvas2.drawRect(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat, this.setOnMenuItemClickListener);
                                    }
                                    if (this.setPadding == null) {
                                        this.setPadding = new Matrix();
                                    }
                                    this.setPadding.reset();
                                    MediaBrowserCompat$ItemReceiver(this.setUiOptions, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver.getWidth(), BitmapDescriptorFactory.HUE_RED, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver.getWidth(), (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver.getHeight(), BitmapDescriptorFactory.HUE_RED, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver.getHeight());
                                    int i8 = this.setContentHeight;
                                    if (i8 == -1) {
                                        i8 = this.ActionBarOverlayLayout;
                                    }
                                    if (i8 == 0) {
                                        MediaBrowserCompat$ItemReceiver(this.setContentView, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom);
                                    } else {
                                        int i9 = this.setContentHeight;
                                        if (i9 == -1) {
                                            i9 = this.ActionBarOverlayLayout;
                                        }
                                        if (i9 == 90) {
                                            MediaBrowserCompat$ItemReceiver(this.setContentView, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top);
                                        } else {
                                            int i10 = this.setContentHeight;
                                            if (i10 == -1) {
                                                i10 = this.ActionBarOverlayLayout;
                                            }
                                            if (i10 == 180) {
                                                MediaBrowserCompat$ItemReceiver(this.setContentView, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top);
                                            } else {
                                                int i11 = this.setContentHeight;
                                                if (i11 == -1) {
                                                    i11 = this.ActionBarOverlayLayout;
                                                }
                                                if (i11 == 270) {
                                                    MediaBrowserCompat$ItemReceiver(this.setContentView, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.right, (float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.bottom);
                                                }
                                            }
                                        }
                                    }
                                    this.setPadding.setPolyToPoly(this.setUiOptions, 0, this.setContentView, 0, 4);
                                    canvas2.drawBitmap(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver, this.setPadding, this.MediaSessionCompat$QueueItem);
                                    if (this.ParcelableVolumeInfo) {
                                        canvas2.drawRect(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat, this.MediaSessionCompat$Token);
                                    }
                                } else if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver && this.ParcelableVolumeInfo) {
                                    canvas2.drawText("LOADING", (float) (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left + ((int) (this.AlertController$RecycleListView * 5.0f))), (float) (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top + ((int) (this.AlertController$RecycleListView * 35.0f))), this.PlaybackStateCompat$CustomAction);
                                }
                                if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$SearchResultReceiver && this.ParcelableVolumeInfo) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("ISS ");
                                    sb.append(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.IconCompatParcelizer);
                                    sb.append(" RECT ");
                                    sb.append(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.read.top);
                                    sb.append(",");
                                    sb.append(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.read.left);
                                    sb.append(",");
                                    sb.append(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.read.bottom);
                                    sb.append(",");
                                    sb.append(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.read.right);
                                    canvas2.drawText(sb.toString(), (float) (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.left + ((int) (this.AlertController$RecycleListView * 5.0f))), (float) (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver2.MediaMetadataCompat.top + ((int) (this.AlertController$RecycleListView * 15.0f))), this.PlaybackStateCompat$CustomAction);
                                }
                            }
                        }
                    }
                }
                if (this.ParcelableVolumeInfo) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scale: ");
                    sb2.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(this.setWindowCallback)}));
                    sb2.append(" (");
                    sb2.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(RatingCompat())}));
                    sb2.append(" - ");
                    sb2.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(this.setShortcut)}));
                    sb2.append(")");
                    String obj = sb2.toString();
                    float f26 = this.AlertController$RecycleListView;
                    canvas2.drawText(obj, (float) ((int) (f26 * 5.0f)), (float) ((int) (f26 * 15.0f)), this.PlaybackStateCompat$CustomAction);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Translate: ");
                    sb3.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(this.setPresenter.x)}));
                    sb3.append(":");
                    sb3.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(this.setPresenter.y)}));
                    String obj2 = sb3.toString();
                    float f27 = this.AlertController$RecycleListView;
                    canvas2.drawText(obj2, (float) ((int) (f27 * 5.0f)), (float) ((int) (f27 * 30.0f)), this.PlaybackStateCompat$CustomAction);
                    PointF write3 = write();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Source center: ");
                    sb4.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(write3.x)}));
                    sb4.append(":");
                    sb4.append(String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(write3.y)}));
                    String obj3 = sb4.toString();
                    float f28 = this.AlertController$RecycleListView;
                    canvas2.drawText(obj3, (float) ((int) (f28 * 5.0f)), (float) ((int) (f28 * 45.0f)), this.PlaybackStateCompat$CustomAction);
                    write write4 = this.MediaDescriptionCompat;
                    if (write4 != null) {
                        PointF pointF9 = write4.MediaBrowserCompat$SearchResultReceiver;
                        float f29 = pointF9.x;
                        float f30 = pointF9.y;
                        PointF pointF10 = new PointF();
                        PointF pointF11 = this.setPresenter;
                        if (pointF11 == null) {
                            pointF10 = null;
                        } else {
                            if (pointF11 == null) {
                                f7 = Float.NaN;
                            } else {
                                f7 = (f29 * this.setWindowCallback) + pointF11.x;
                            }
                            PointF pointF12 = this.setPresenter;
                            if (pointF12 == null) {
                                f8 = Float.NaN;
                            } else {
                                f8 = (f30 * this.setWindowCallback) + pointF12.y;
                            }
                            pointF10.set(f7, f8);
                        }
                        PointF pointF13 = this.MediaDescriptionCompat.MediaDescriptionCompat;
                        float f31 = pointF13.x;
                        float f32 = pointF13.y;
                        PointF pointF14 = new PointF();
                        PointF pointF15 = this.setPresenter;
                        if (pointF15 == null) {
                            pointF14 = null;
                        } else {
                            if (pointF15 == null) {
                                f5 = Float.NaN;
                            } else {
                                f5 = (f31 * this.setWindowCallback) + pointF15.x;
                            }
                            PointF pointF16 = this.setPresenter;
                            if (pointF16 == null) {
                                f6 = Float.NaN;
                            } else {
                                f6 = (f32 * this.setWindowCallback) + pointF16.y;
                            }
                            pointF14.set(f5, f6);
                        }
                        PointF pointF17 = this.MediaDescriptionCompat.RatingCompat;
                        float f33 = pointF17.x;
                        float f34 = pointF17.y;
                        PointF pointF18 = new PointF();
                        PointF pointF19 = this.setPresenter;
                        if (pointF19 == null) {
                            pointF18 = null;
                        } else {
                            if (pointF19 == null) {
                                f3 = Float.NaN;
                            } else {
                                f3 = (f33 * this.setWindowCallback) + pointF19.x;
                            }
                            PointF pointF20 = this.setPresenter;
                            if (pointF20 == null) {
                                f4 = Float.NaN;
                            } else {
                                f4 = (f34 * this.setWindowCallback) + pointF20.y;
                            }
                            pointF18.set(f3, f4);
                        }
                        canvas2.drawCircle(pointF10.x, pointF10.y, (float) ((int) (this.AlertController$RecycleListView * 10.0f)), this.MediaSessionCompat$Token);
                        this.MediaSessionCompat$Token.setColor(-65536);
                        canvas2.drawCircle(pointF14.x, pointF14.y, (float) ((int) (this.AlertController$RecycleListView * 20.0f)), this.MediaSessionCompat$Token);
                        this.MediaSessionCompat$Token.setColor(-16776961);
                        canvas2.drawCircle(pointF18.x, pointF18.y, (float) ((int) (this.AlertController$RecycleListView * 25.0f)), this.MediaSessionCompat$Token);
                        this.MediaSessionCompat$Token.setColor(-16711681);
                        canvas2.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) ((int) (this.AlertController$RecycleListView * 30.0f)), this.MediaSessionCompat$Token);
                    }
                    if (this.setOverflowReserved != null) {
                        this.MediaSessionCompat$Token.setColor(-65536);
                        canvas2.drawCircle(this.setOverflowReserved.x, this.setOverflowReserved.y, (float) ((int) (this.AlertController$RecycleListView * 20.0f)), this.MediaSessionCompat$Token);
                    }
                    if (this.setSubtitle != null) {
                        this.MediaSessionCompat$Token.setColor(-16776961);
                        float f35 = this.setSubtitle.x;
                        PointF pointF21 = this.setPresenter;
                        if (pointF21 == null) {
                            f = Float.NaN;
                        } else {
                            f = (f35 * this.setWindowCallback) + pointF21.x;
                        }
                        float f36 = this.setSubtitle.y;
                        PointF pointF22 = this.setPresenter;
                        if (pointF22 == null) {
                            f2 = Float.NaN;
                        } else {
                            f2 = (f36 * this.setWindowCallback) + pointF22.y;
                        }
                        canvas2.drawCircle(f, f2, (float) ((int) (this.AlertController$RecycleListView * 35.0f)), this.MediaSessionCompat$Token);
                    }
                    if (this.setHideOnContentScrollEnabled != null && this.setPopupCallback) {
                        this.MediaSessionCompat$Token.setColor(-16711681);
                        canvas2.drawCircle(this.setHideOnContentScrollEnabled.x, this.setHideOnContentScrollEnabled.y, (float) ((int) (this.AlertController$RecycleListView * 30.0f)), this.MediaSessionCompat$Token);
                    }
                    this.MediaSessionCompat$Token.setColor(-65281);
                }
            }
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    private boolean MediaBrowserCompat$MediaItem() {
        boolean z = true;
        if (!this.setExpandedFormat || (this.MediaBrowserCompat$SearchResultReceiver != null && !this.f2429x50fd9e4a)) {
            return true;
        }
        Map<Integer, List<C1017x7620d44b>> map = this.setOverflowIcon;
        if (map == null) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((Integer) next.getKey()).intValue() == this.setChecked) {
                for (C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver : (List) next.getValue()) {
                    if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver || subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    private boolean MediaMetadataCompat() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.setOverlayMode > 0 && this.setActionBarVisibilityCallback > 0 && (this.MediaBrowserCompat$SearchResultReceiver != null || MediaBrowserCompat$MediaItem());
        if (!this.setHasNonEmbeddedTabs && z) {
            MediaBrowserCompat$SearchResultReceiver();
            this.setHasNonEmbeddedTabs = true;
        }
        return z;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Point point) {
        int i;
        int i2;
        synchronized (this) {
            Object[] objArr = {Integer.valueOf(point.x), Integer.valueOf(point.y)};
            if (this.ParcelableVolumeInfo) {
                Log.d(MediaBrowserCompat$ItemReceiver, String.format("initialiseBaseLayer maxTileDimensions=%dx%d", objArr));
            }
            RatingCompat ratingCompat = new RatingCompat(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), (byte) 0);
            this.setWindowTitle = ratingCompat;
            IconCompatParcelizer(true, ratingCompat);
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.setWindowTitle.MediaBrowserCompat$CustomActionResultReceiver);
            this.setChecked = MediaBrowserCompat$ItemReceiver2;
            if (MediaBrowserCompat$ItemReceiver2 > 1) {
                this.setChecked = MediaBrowserCompat$ItemReceiver2 / 2;
            }
            if (this.setChecked == 1) {
                int i3 = this.setContentHeight;
                if (i3 == -1) {
                    i3 = this.ActionBarOverlayLayout;
                }
                if (i3 == 90 || i3 == 270) {
                    i = this.setActionBarVisibilityCallback;
                } else {
                    i = this.setOverlayMode;
                }
                if (i < point.x) {
                    int i4 = this.setContentHeight;
                    if (i4 == -1) {
                        i4 = this.ActionBarOverlayLayout;
                    }
                    if (i4 == 90 || i4 == 270) {
                        i2 = this.setOverlayMode;
                    } else {
                        i2 = this.setActionBarVisibilityCallback;
                    }
                    if (i2 < point.y) {
                        this.Keep.MediaBrowserCompat$ItemReceiver();
                        this.Keep = null;
                        new C1016xd5f05c2a(this, getContext(), this.MediaMetadataCompat, this.setExpandedActionViewsExclusive, false).executeOnExecutor(this.setCheckable, new Void[0]);
                    }
                }
            }
            IconCompatParcelizer(point);
            List<C1017x7620d44b> list = this.setOverflowIcon.get(Integer.valueOf(this.setChecked));
            if (this.setExpandedFormat) {
                for (C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$MediaItem : list) {
                    new SubsamplingScaleImageView$MediaBrowserCompat$MediaItem(this, this.Keep, subsamplingScaleImageView$MediaBrowserCompat$MediaItem).executeOnExecutor(this.setCheckable, new Void[0]);
                }
                read(true);
            } else {
                new SubsamplingScaleImageView$MediaBrowserCompat$MediaItem(this, this.Keep, (C1017x7620d44b) list.get(0)).executeOnExecutor(this.setCheckable, new Void[0]);
            }
        }
    }

    private void read(boolean z) {
        if (this.Keep != null && this.setOverflowIcon != null) {
            int min = Math.min(this.setChecked, MediaBrowserCompat$ItemReceiver(this.setWindowCallback));
            for (Map.Entry<Integer, List<C1017x7620d44b>> value : this.setOverflowIcon.entrySet()) {
                for (C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver : (List) value.getValue()) {
                    if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer < min || (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer > min && subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer != this.setChecked)) {
                        subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = false;
                        if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
                            subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.recycle();
                            subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = null;
                        }
                    }
                    if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer == min) {
                        if (IconCompatParcelizer(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver)) {
                            subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = true;
                            if (!subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver && subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver == null && z) {
                                new SubsamplingScaleImageView$MediaBrowserCompat$MediaItem(this, this.Keep, subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver).executeOnExecutor(this.setCheckable, new Void[0]);
                            }
                        } else if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer != this.setChecked || !this.setExpandedFormat) {
                            subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = false;
                            if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
                                subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.recycle();
                                subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = null;
                            }
                        }
                    } else if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer == this.setChecked) {
                        subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = true;
                    }
                }
            }
        }
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.setOverlayMode > 0 && this.setActionBarVisibilityCallback > 0) {
            if (!(this.setMenu == null || (f = this.setSplitBackground) == null)) {
                this.setWindowCallback = f.floatValue();
                if (this.setPresenter == null) {
                    this.setPresenter = new PointF();
                }
                this.setPresenter.x = ((float) (getWidth() / 2)) - (this.setWindowCallback * this.setMenu.x);
                this.setPresenter.y = ((float) (getHeight() / 2)) - (this.setWindowCallback * this.setMenu.y);
                this.setMenu = null;
                this.setSplitBackground = null;
                IconCompatParcelizer(true);
                read(true);
            }
            IconCompatParcelizer(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e A[LOOP:0: B:56:0x009a->B:58:0x009e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int MediaBrowserCompat$ItemReceiver(float r7) {
        /*
            r6 = this;
            int r0 = r6.AbsActionBarView
            if (r0 <= 0) goto L_0x0019
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.xdpi
            float r0 = r0.ydpi
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = r6.AbsActionBarView
            float r0 = (float) r0
            float r0 = r0 / r1
            float r7 = r7 * r0
        L_0x0019:
            int r0 = r6.setContentHeight
            r1 = -1
            if (r0 != r1) goto L_0x0020
            int r0 = r6.ActionBarOverlayLayout
        L_0x0020:
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 90
            if (r0 == r3) goto L_0x002b
            if (r0 == r2) goto L_0x002b
            int r0 = r6.setOverlayMode
            goto L_0x002d
        L_0x002b:
            int r0 = r6.setActionBarVisibilityCallback
        L_0x002d:
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r4 = r6.setContentHeight
            if (r4 != r1) goto L_0x0036
            int r4 = r6.ActionBarOverlayLayout
        L_0x0036:
            if (r4 == r3) goto L_0x003d
            if (r4 == r2) goto L_0x003d
            int r4 = r6.setActionBarVisibilityCallback
            goto L_0x003f
        L_0x003d:
            int r4 = r6.setOverlayMode
        L_0x003f:
            float r4 = (float) r4
            float r4 = r4 * r7
            int r7 = (int) r4
            if (r0 == 0) goto L_0x00a1
            if (r7 == 0) goto L_0x00a1
            int r4 = r6.setContentHeight
            if (r4 != r1) goto L_0x004c
            int r4 = r6.ActionBarOverlayLayout
        L_0x004c:
            if (r4 == r3) goto L_0x0053
            if (r4 == r2) goto L_0x0053
            int r4 = r6.setActionBarVisibilityCallback
            goto L_0x0055
        L_0x0053:
            int r4 = r6.setOverlayMode
        L_0x0055:
            r5 = 1
            if (r4 > r7) goto L_0x006b
            int r4 = r6.setContentHeight
            if (r4 != r1) goto L_0x005e
            int r4 = r6.ActionBarOverlayLayout
        L_0x005e:
            if (r4 == r3) goto L_0x0065
            if (r4 == r2) goto L_0x0065
            int r4 = r6.setOverlayMode
            goto L_0x0067
        L_0x0065:
            int r4 = r6.setActionBarVisibilityCallback
        L_0x0067:
            if (r4 > r0) goto L_0x006b
            r7 = r5
            goto L_0x009a
        L_0x006b:
            int r4 = r6.setContentHeight
            if (r4 != r1) goto L_0x0071
            int r4 = r6.ActionBarOverlayLayout
        L_0x0071:
            if (r4 == r3) goto L_0x0078
            if (r4 == r2) goto L_0x0078
            int r4 = r6.setActionBarVisibilityCallback
            goto L_0x007a
        L_0x0078:
            int r4 = r6.setOverlayMode
        L_0x007a:
            float r4 = (float) r4
            float r7 = (float) r7
            float r4 = r4 / r7
            int r7 = java.lang.Math.round(r4)
            int r4 = r6.setContentHeight
            if (r4 != r1) goto L_0x0087
            int r4 = r6.ActionBarOverlayLayout
        L_0x0087:
            if (r4 == r3) goto L_0x008e
            if (r4 == r2) goto L_0x008e
            int r1 = r6.setOverlayMode
            goto L_0x0090
        L_0x008e:
            int r1 = r6.setActionBarVisibilityCallback
        L_0x0090:
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            if (r7 < r0) goto L_0x009a
            r7 = r0
        L_0x009a:
            int r0 = r5 << 1
            if (r0 >= r7) goto L_0x00a0
            r5 = r0
            goto L_0x009a
        L_0x00a0:
            return r5
        L_0x00a1:
            r7 = 32
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver(float):int");
    }

    /* access modifiers changed from: private */
    public void IconCompatParcelizer(boolean z, RatingCompat ratingCompat) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        if (this.setPrimaryBackground == 2 && this.setHasNonEmbeddedTabs) {
            z = false;
        }
        PointF pointF = ratingCompat.read;
        float min = Math.min(this.setShortcut, Math.max(RatingCompat(), ratingCompat.MediaBrowserCompat$CustomActionResultReceiver));
        int i4 = this.setContentHeight;
        if (i4 == -1) {
            i4 = this.ActionBarOverlayLayout;
        }
        if (i4 == 90 || i4 == 270) {
            i = this.setActionBarVisibilityCallback;
        } else {
            i = this.setOverlayMode;
        }
        float f3 = ((float) i) * min;
        int i5 = this.setContentHeight;
        if (i5 == -1) {
            i5 = this.ActionBarOverlayLayout;
        }
        if (i5 == 90 || i5 == 270) {
            i2 = this.setOverlayMode;
        } else {
            i2 = this.setActionBarVisibilityCallback;
        }
        float f4 = ((float) i2) * min;
        if (this.setPrimaryBackground == 3 && this.setHasNonEmbeddedTabs) {
            pointF.x = Math.max(pointF.x, ((float) (getWidth() / 2)) - f3);
            pointF.y = Math.max(pointF.y, ((float) (getHeight() / 2)) - f4);
        } else if (z) {
            pointF.x = Math.max(pointF.x, ((float) getWidth()) - f3);
            pointF.y = Math.max(pointF.y, ((float) getHeight()) - f4);
        } else {
            pointF.x = Math.max(pointF.x, -f3);
            pointF.y = Math.max(pointF.y, -f4);
        }
        float f5 = 0.5f;
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? ((float) getPaddingLeft()) / ((float) (getPaddingLeft() + getPaddingRight())) : 0.5f;
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f5 = ((float) getPaddingTop()) / ((float) (getPaddingTop() + getPaddingBottom()));
        }
        if (this.setPrimaryBackground == 3 && this.setHasNonEmbeddedTabs) {
            f = (float) Math.max(0, getWidth() / 2);
            i3 = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = Math.max(BitmapDescriptorFactory.HUE_RED, (((float) getWidth()) - f3) * paddingLeft);
            f2 = Math.max(BitmapDescriptorFactory.HUE_RED, (((float) getHeight()) - f4) * f5);
            pointF.x = Math.min(pointF.x, f);
            pointF.y = Math.min(pointF.y, f2);
            ratingCompat.MediaBrowserCompat$CustomActionResultReceiver = min;
        } else {
            f = (float) Math.max(0, getWidth());
            i3 = Math.max(0, getHeight());
        }
        f2 = (float) i3;
        pointF.x = Math.min(pointF.x, f);
        pointF.y = Math.min(pointF.y, f2);
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver = min;
    }

    private void IconCompatParcelizer(boolean z) {
        boolean z2;
        int i;
        int i2;
        if (this.setPresenter == null) {
            z2 = true;
            this.setPresenter = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            z2 = false;
        }
        if (this.setWindowTitle == null) {
            this.setWindowTitle = new RatingCompat(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), (byte) 0);
        }
        this.setWindowTitle.MediaBrowserCompat$CustomActionResultReceiver = this.setWindowCallback;
        this.setWindowTitle.read.set(this.setPresenter);
        IconCompatParcelizer(z, this.setWindowTitle);
        this.setWindowCallback = this.setWindowTitle.MediaBrowserCompat$CustomActionResultReceiver;
        this.setPresenter.set(this.setWindowTitle.read);
        if (z2 && this.ExpandedMenuView != 4) {
            PointF pointF = this.setPresenter;
            int i3 = this.setContentHeight;
            if (i3 == -1) {
                i3 = this.ActionBarOverlayLayout;
            }
            if (i3 == 90 || i3 == 270) {
                i = this.setActionBarVisibilityCallback;
            } else {
                i = this.setOverlayMode;
            }
            float f = (float) (i / 2);
            int i4 = this.setContentHeight;
            if (i4 == -1) {
                i4 = this.ActionBarOverlayLayout;
            }
            if (i4 == 90 || i4 == 270) {
                i2 = this.setOverlayMode;
            } else {
                i2 = this.setActionBarVisibilityCallback;
            }
            pointF.set(IconCompatParcelizer(f, (float) (i2 / 2), this.setWindowCallback));
        }
    }

    private void IconCompatParcelizer(Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Point point2 = point;
        boolean z = false;
        boolean z2 = true;
        Object[] objArr = {Integer.valueOf(point2.x), Integer.valueOf(point2.y)};
        if (this.ParcelableVolumeInfo) {
            Log.d(MediaBrowserCompat$ItemReceiver, String.format("initialiseTileMap maxTileDimensions=%dx%d", objArr));
        }
        this.setOverflowIcon = new LinkedHashMap();
        int i7 = this.setChecked;
        int i8 = 1;
        int i9 = 1;
        while (true) {
            int i10 = this.setContentHeight;
            int i11 = -1;
            if (i10 == -1) {
                i10 = this.ActionBarOverlayLayout;
            }
            if (i10 == 90 || i10 == 270) {
                i = this.setActionBarVisibilityCallback;
            } else {
                i = this.setOverlayMode;
            }
            int i12 = i / i8;
            int i13 = this.setContentHeight;
            if (i13 == -1) {
                i13 = this.ActionBarOverlayLayout;
            }
            if (i13 == 90 || i13 == 270) {
                i2 = this.setOverlayMode;
            } else {
                i2 = this.setActionBarVisibilityCallback;
            }
            int i14 = i2 / i9;
            int i15 = i12 / i7;
            int i16 = i14 / i7;
            while (true) {
                if (i15 + i8 + (z2 ? 1 : 0) > point2.x || (((double) i15) > ((double) getWidth()) * 1.25d && i7 < this.setChecked)) {
                    boolean z3 = z2;
                    boolean z4 = z;
                    boolean z5 = z3;
                    i8++;
                    int i17 = this.setContentHeight;
                    i11 = -1;
                    if (i17 == -1) {
                        i17 = this.ActionBarOverlayLayout;
                    }
                    if (i17 == 90 || i17 == 270) {
                        i3 = this.setActionBarVisibilityCallback;
                    } else {
                        i3 = this.setOverlayMode;
                    }
                    i12 = i3 / i8;
                    i15 = i12 / i7;
                    boolean z6 = z4;
                    z2 = z5;
                    z = z6;
                }
            }
            while (true) {
                if (i16 + i9 + (z2 ? 1 : 0) > point2.y || (((double) i16) > ((double) getHeight()) * 1.25d && i7 < this.setChecked)) {
                    boolean z7 = z2;
                    boolean z8 = z;
                    boolean z9 = z7;
                    i9++;
                    int i18 = this.setContentHeight;
                    if (i18 == -1) {
                        i18 = this.ActionBarOverlayLayout;
                    }
                    if (i18 == 90 || i18 == 270) {
                        i4 = this.setOverlayMode;
                    } else {
                        i4 = this.setActionBarVisibilityCallback;
                    }
                    i14 = i4 / i9;
                    i16 = i14 / i7;
                    i11 = -1;
                    boolean z10 = z8;
                    z2 = z9;
                    z = z10;
                }
            }
            ArrayList arrayList = new ArrayList(i8 * i9);
            int i19 = z;
            while (i19 < i8) {
                int i20 = z;
                while (i20 < i9) {
                    C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver = new C1017x7620d44b(z ? (byte) 1 : 0);
                    subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer = i7;
                    subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver = i7 != this.setChecked ? z : z2;
                    if (i19 == i8 - 1) {
                        int i21 = this.setContentHeight;
                        if (i21 == i11) {
                            i21 = this.ActionBarOverlayLayout;
                        }
                        i5 = (i21 == 90 || i21 == 270) ? this.setActionBarVisibilityCallback : this.setOverlayMode;
                    } else {
                        i5 = (i19 + 1) * i12;
                    }
                    if (i20 == i9 - 1) {
                        int i22 = this.setContentHeight;
                        if (i22 == i11) {
                            i22 = this.ActionBarOverlayLayout;
                        }
                        if (i22 == 90 || i22 == 270) {
                            i6 = this.setOverlayMode;
                        } else {
                            i6 = this.setActionBarVisibilityCallback;
                        }
                    } else {
                        i6 = (i20 + 1) * i14;
                    }
                    subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read = new Rect(i19 * i12, i20 * i14, i5, i6);
                    subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat = new Rect(0, 0, 0, 0);
                    subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.write = new Rect(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read);
                    arrayList.add(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver);
                    i20++;
                    z = false;
                    z2 = true;
                    i11 = -1;
                }
                boolean z11 = z;
                i19++;
                z2 = true;
                i11 = -1;
            }
            boolean z12 = z;
            this.setOverflowIcon.put(Integer.valueOf(i7), arrayList);
            if (i7 != 1) {
                i7 /= 2;
                boolean z13 = z12;
                z2 = true;
                z = z13;
            } else {
                return;
            }
        }
    }

    static class MediaMetadataCompat extends AsyncTask<Void, Void, int[]> {
        private final Uri IconCompatParcelizer;
        private Exception MediaBrowserCompat$CustomActionResultReceiver;
        private final WeakReference<Context> MediaBrowserCompat$ItemReceiver;
        private final WeakReference<SubsamplingScaleImageView> MediaMetadataCompat;
        private IdWorkflowActivity.C69161 read;
        private final WeakReference<DSPMV<? extends IdWorkflowActivity.C69161>> write;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return read();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            int[] iArr = (int[]) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = this.MediaMetadataCompat.get();
            if (subsamplingScaleImageView != null) {
                IdWorkflowActivity.C69161 r1 = this.read;
                if (r1 != null && iArr != null && iArr.length == 3) {
                    SubsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(subsamplingScaleImageView, r1, iArr[0], iArr[1], iArr[2]);
                } else if (this.MediaBrowserCompat$CustomActionResultReceiver != null && subsamplingScaleImageView.MenuItemImpl != null) {
                    read unused = subsamplingScaleImageView.MenuItemImpl;
                }
            }
        }

        MediaMetadataCompat(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DSPMV<? extends IdWorkflowActivity.C69161> dspmv, Uri uri) {
            this.MediaMetadataCompat = new WeakReference<>(subsamplingScaleImageView);
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(context);
            this.write = new WeakReference<>(dspmv);
            this.IconCompatParcelizer = uri;
        }

        private int[] read() {
            try {
                String obj = this.IconCompatParcelizer.toString();
                Context context = this.MediaBrowserCompat$ItemReceiver.get();
                DSPMV dspmv = this.write.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.MediaMetadataCompat.get();
                if (context == null || dspmv == null || subsamplingScaleImageView == null) {
                    return null;
                }
                SubsamplingScaleImageView.read(subsamplingScaleImageView, "TilesInitTask.doInBackground", new Object[0]);
                IdWorkflowActivity.C69161 r2 = (IdWorkflowActivity.C69161) dspmv.MediaBrowserCompat$CustomActionResultReceiver();
                this.read = r2;
                Point MediaBrowserCompat$ItemReceiver2 = r2.MediaBrowserCompat$ItemReceiver(context, this.IconCompatParcelizer);
                int i = MediaBrowserCompat$ItemReceiver2.x;
                int i2 = MediaBrowserCompat$ItemReceiver2.y;
                int read2 = SubsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(context, obj);
                if (SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView) != null) {
                    SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).left = Math.max(0, SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).left);
                    SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).top = Math.max(0, SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).top);
                    SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).right = Math.min(i, SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).right);
                    SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).bottom = Math.min(i2, SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).bottom);
                    i = SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).width();
                    i2 = SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).height();
                }
                return new int[]{i, i2, read2};
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver, "Failed to initialise bitmap decoder", e);
                this.MediaBrowserCompat$CustomActionResultReceiver = e;
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.w(MediaBrowserCompat$ItemReceiver, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int MediaBrowserCompat$CustomActionResultReceiver(android.content.Context r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "orientation"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x0050 }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0050 }
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x0050 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0050 }
            if (r0 == 0) goto L_0x004b
            boolean r9 = r0.moveToFirst()     // Catch:{ Exception -> 0x0050 }
            if (r9 == 0) goto L_0x004b
            int r9 = r0.getInt(r1)     // Catch:{ Exception -> 0x0050 }
            java.util.List<java.lang.Integer> r10 = read     // Catch:{ Exception -> 0x0050 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0050 }
            boolean r10 = r10.contains(r2)     // Catch:{ Exception -> 0x0050 }
            if (r10 == 0) goto L_0x0035
            r10 = -1
            if (r9 != r10) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r1 = r9
            goto L_0x004b
        L_0x0035:
            java.lang.String r10 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0050 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0050 }
            r2.<init>()     // Catch:{ Exception -> 0x0050 }
            java.lang.String r3 = "Unsupported orientation: "
            r2.append(r3)     // Catch:{ Exception -> 0x0050 }
            r2.append(r9)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x0050 }
            android.util.Log.w(r10, r9)     // Catch:{ Exception -> 0x0050 }
        L_0x004b:
            if (r0 == 0) goto L_0x005c
            goto L_0x0059
        L_0x004e:
            r9 = move-exception
            goto L_0x005d
        L_0x0050:
            java.lang.String r9 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x004e }
            java.lang.String r10 = "Could not get orientation of image from media store"
            android.util.Log.w(r9, r10)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x005c
        L_0x0059:
            r0.close()
        L_0x005c:
            return r1
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(android.content.Context, java.lang.String):int");
    }

    static class write {
        long IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        float MediaBrowserCompat$MediaItem;
        PointF MediaBrowserCompat$SearchResultReceiver;
        PointF MediaDescriptionCompat;
        float MediaMetadataCompat;
        PointF MediaSessionCompat$QueueItem;
        long MediaSessionCompat$Token;
        PointF ParcelableVolumeInfo;
        PointF RatingCompat;
        boolean read;
        IconCompatParcelizer write;

        private write() {
            this.IconCompatParcelizer = 500;
            this.read = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = 2;
            this.MediaBrowserCompat$ItemReceiver = 1;
            this.MediaSessionCompat$Token = System.currentTimeMillis();
        }

        /* synthetic */ write(byte b) {
            this();
        }
    }

    static class RatingCompat {
        float MediaBrowserCompat$CustomActionResultReceiver;
        final PointF read;

        /* synthetic */ RatingCompat(float f, PointF pointF, byte b) {
            this(f, pointF);
        }

        private RatingCompat(float f, PointF pointF) {
            this.MediaBrowserCompat$CustomActionResultReceiver = f;
            this.read = pointF;
        }
    }

    public void setMaxTileSize(int i) {
        this.setTitle = i;
        this.setGroupDividerEnabled = i;
    }

    public void setMaxTileSize(int i, int i2) {
        this.setTitle = i;
        this.setGroupDividerEnabled = i2;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver(true);
        this.MediaSessionCompat$QueueItem = null;
        this.PlaybackStateCompat$CustomAction = null;
        this.MediaSessionCompat$Token = null;
        this.setOnMenuItemClickListener = null;
    }

    public final PointF read(float f, float f2, PointF pointF) {
        PointF pointF2 = this.setPresenter;
        if (pointF2 == null) {
            return null;
        }
        float f3 = Float.NaN;
        float f4 = pointF2 == null ? Float.NaN : (f - pointF2.x) / this.setWindowCallback;
        PointF pointF3 = this.setPresenter;
        if (pointF3 != null) {
            f3 = (f2 - pointF3.y) / this.setWindowCallback;
        }
        pointF.set(f4, f3);
        return pointF;
    }

    public final PointF MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, PointF pointF) {
        PointF pointF2 = this.setPresenter;
        if (pointF2 == null) {
            return null;
        }
        float f3 = Float.NaN;
        float f4 = pointF2 == null ? Float.NaN : (f * this.setWindowCallback) + pointF2.x;
        PointF pointF3 = this.setPresenter;
        if (pointF3 != null) {
            f3 = (f2 * this.setWindowCallback) + pointF3.y;
        }
        pointF.set(f4, f3);
        return pointF;
    }

    private PointF IconCompatParcelizer(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft();
        int width = ((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2;
        int paddingTop = getPaddingTop();
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2;
        if (this.setWindowTitle == null) {
            this.setWindowTitle = new RatingCompat(BitmapDescriptorFactory.HUE_RED, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), (byte) 0);
        }
        this.setWindowTitle.MediaBrowserCompat$CustomActionResultReceiver = f3;
        this.setWindowTitle.read.set(((float) (paddingLeft + width)) - (f * f3), ((float) (paddingTop + height)) - (f2 * f3));
        IconCompatParcelizer(true, this.setWindowTitle);
        return this.setWindowTitle.read;
    }

    private float RatingCompat() {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i5 = this.ExpandedMenuView;
        if (i5 == 2 || i5 == 4) {
            float width = (float) (getWidth() - paddingLeft);
            int i6 = this.setContentHeight;
            if (i6 == -1) {
                i6 = this.ActionBarOverlayLayout;
            }
            if (i6 == 90 || i6 == 270) {
                i = this.setActionBarVisibilityCallback;
            } else {
                i = this.setOverlayMode;
            }
            float f = width / ((float) i);
            float height = (float) (getHeight() - paddingBottom);
            int i7 = this.setContentHeight;
            if (i7 == -1) {
                i7 = this.ActionBarOverlayLayout;
            }
            if (i7 == 90 || i7 == 270) {
                i2 = this.setOverlayMode;
            } else {
                i2 = this.setActionBarVisibilityCallback;
            }
            return Math.max(f, height / ((float) i2));
        }
        if (i5 == 3) {
            float f2 = this.setForceShowIcon;
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                return f2;
            }
        }
        float width2 = (float) (getWidth() - paddingLeft);
        int i8 = this.setContentHeight;
        if (i8 == -1) {
            i8 = this.ActionBarOverlayLayout;
        }
        if (i8 == 90 || i8 == 270) {
            i3 = this.setActionBarVisibilityCallback;
        } else {
            i3 = this.setOverlayMode;
        }
        float f3 = width2 / ((float) i3);
        float height2 = (float) (getHeight() - paddingBottom);
        int i9 = this.setContentHeight;
        if (i9 == -1) {
            i9 = this.ActionBarOverlayLayout;
        }
        if (i9 == 90 || i9 == 270) {
            i4 = this.setOverlayMode;
        } else {
            i4 = this.setActionBarVisibilityCallback;
        }
        return Math.min(f3, height2 / ((float) i4));
    }

    private static float IconCompatParcelizer(int i, long j, float f, float f2, long j2) {
        float f3;
        if (i == 1) {
            float f4 = ((float) j) / ((float) j2);
            return ((-f2) * f4 * (f4 - 2.0f)) + f;
        } else if (i == 2) {
            float f5 = ((float) j) / (((float) j2) / 2.0f);
            if (f5 < 1.0f) {
                f3 = (f2 / 2.0f) * f5;
            } else {
                float f6 = f5 - 1.0f;
                f3 = (-f2) / 2.0f;
                f5 = (f6 * (f6 - 2.0f)) - 1.0f;
            }
            return (f3 * f5) + f;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected easing type: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void setRegionDecoderClass(Class<? extends IdWorkflowActivity.C69161> cls) {
        if (cls != null) {
            this.setActionBarHideOffset = new DSBMV(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(DSPMV<? extends IdWorkflowActivity.C69161> dspmv) {
        if (dspmv != null) {
            this.setActionBarHideOffset = dspmv;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setBitmapDecoderClass(Class<? extends IdWorkflowActivity> cls) {
        if (cls != null) {
            this.MediaMetadataCompat = new DSBMV(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(DSPMV<? extends IdWorkflowActivity> dspmv) {
        if (dspmv != null) {
            this.MediaMetadataCompat = dspmv;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setPanLimit(int i) {
        if (write.contains(Integer.valueOf(i))) {
            this.setPrimaryBackground = i;
            if (this.setHasNonEmbeddedTabs) {
                IconCompatParcelizer(true);
                invalidate();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid pan limit: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setMinimumScaleType(int i) {
        if (MediaBrowserCompat$CustomActionResultReceiver.contains(Integer.valueOf(i))) {
            this.ExpandedMenuView = i;
            if (this.setHasNonEmbeddedTabs) {
                IconCompatParcelizer(true);
                invalidate();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid scale type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setMaxScale(float f) {
        this.setShortcut = f;
    }

    public final void setMinScale(float f) {
        this.setForceShowIcon = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.AbsActionBarView = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (this.setHasNonEmbeddedTabs) {
            MediaBrowserCompat$CustomActionResultReceiver(false);
            invalidate();
        }
    }

    public final PointF write() {
        float f;
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        PointF pointF = new PointF();
        PointF pointF2 = this.setPresenter;
        if (pointF2 == null) {
            return null;
        }
        float f2 = Float.NaN;
        if (pointF2 == null) {
            f = Float.NaN;
        } else {
            f = (width - pointF2.x) / this.setWindowCallback;
        }
        PointF pointF3 = this.setPresenter;
        if (pointF3 != null) {
            f2 = (height - pointF3.y) / this.setWindowCallback;
        }
        pointF.set(f, f2);
        return pointF;
    }

    public final void setScaleAndCenter(float f, PointF pointF) {
        this.MediaDescriptionCompat = null;
        this.setSplitBackground = Float.valueOf(f);
        this.setMenu = pointF;
        this.setShowingForActionMode = pointF;
        invalidate();
    }

    public final void setHasBaseLayerTiles(boolean z) {
        this.setExpandedFormat = z;
    }

    public final void setZoomEnabled(boolean z) {
        this.ActionMenuView$OnMenuItemClickListener = z;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.ActionBarContainer = z;
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.setStackedBackground = z;
        if (!z && (pointF = this.setPresenter) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.setWindowCallback * ((float) (MediaSessionCompat$ResultReceiverWrapper() / 2)));
            this.setPresenter.y = ((float) (getHeight() / 2)) - (this.setWindowCallback * ((float) (MediaDescriptionCompat() / 2)));
            if (this.setHasNonEmbeddedTabs) {
                read(true);
                invalidate();
            }
        }
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.setOnMenuItemClickListener = null;
        } else {
            Paint paint = new Paint();
            this.setOnMenuItemClickListener = paint;
            paint.setStyle(Paint.Style.FILL);
            this.setOnMenuItemClickListener.setColor(i);
        }
        invalidate();
    }

    public final void setDoubleTapZoomScale(float f) {
        this.AppCompatDelegateImpl$ListMenuDecorView = f;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (RatingCompat.contains(Integer.valueOf(i))) {
            this.AppCompatDialogFragment = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid zoom style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.setBackgroundResource = Math.max(0, i);
    }

    public void setExecutor(Executor executor) {
        if (executor != null) {
            this.setCheckable = executor;
            return;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.AppCompatActivity = z;
    }

    public final void setDebug(boolean z) {
        this.ParcelableVolumeInfo = z;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.setVisibility = onLongClickListener;
    }

    public void setOnImageEventListener(read read2) {
        this.MenuItemImpl = read2;
    }

    public void setOnStateChangedListener(MediaDescriptionCompat mediaDescriptionCompat) {
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = mediaDescriptionCompat;
    }

    private void write(PointF pointF) {
        float f;
        if (this.MenuItemWrapperICS$CollapsibleActionViewWrapper != null && !this.setPresenter.equals(pointF)) {
            float width = (float) (getWidth() / 2);
            float height = (float) (getHeight() / 2);
            PointF pointF2 = new PointF();
            PointF pointF3 = this.setPresenter;
            if (pointF3 != null) {
                float f2 = Float.NaN;
                if (pointF3 == null) {
                    f = Float.NaN;
                } else {
                    f = (width - pointF3.x) / this.setWindowCallback;
                }
                PointF pointF4 = this.setPresenter;
                if (pointF4 != null) {
                    f2 = (height - pointF4.y) / this.setWindowCallback;
                }
                pointF2.set(f, f2);
            }
        }
    }

    static /* synthetic */ void read(SubsamplingScaleImageView subsamplingScaleImageView, String str, Object[] objArr) {
        if (subsamplingScaleImageView.ParcelableVolumeInfo) {
            Log.d(MediaBrowserCompat$ItemReceiver, String.format(str, objArr));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        int i = subsamplingScaleImageView.setContentHeight;
        if (i == -1) {
            i = subsamplingScaleImageView.ActionBarOverlayLayout;
        }
        if (i == 0) {
            rect2.set(rect);
            return;
        }
        int i2 = subsamplingScaleImageView.setContentHeight;
        if (i2 == -1) {
            i2 = subsamplingScaleImageView.ActionBarOverlayLayout;
        }
        if (i2 == 90) {
            rect2.set(rect.top, subsamplingScaleImageView.setActionBarVisibilityCallback - rect.right, rect.bottom, subsamplingScaleImageView.setActionBarVisibilityCallback - rect.left);
            return;
        }
        int i3 = subsamplingScaleImageView.setContentHeight;
        if (i3 == -1) {
            i3 = subsamplingScaleImageView.ActionBarOverlayLayout;
        }
        if (i3 == 180) {
            rect2.set(subsamplingScaleImageView.setOverlayMode - rect.right, subsamplingScaleImageView.setActionBarVisibilityCallback - rect.bottom, subsamplingScaleImageView.setOverlayMode - rect.left, subsamplingScaleImageView.setActionBarVisibilityCallback - rect.top);
        } else {
            rect2.set(subsamplingScaleImageView.setOverlayMode - rect.bottom, rect.left, subsamplingScaleImageView.setOverlayMode - rect.top, rect.right);
        }
    }

    static /* synthetic */ PointF MediaBrowserCompat$CustomActionResultReceiver(SubsamplingScaleImageView subsamplingScaleImageView, float f, float f2, float f3, PointF pointF) {
        PointF IconCompatParcelizer2 = subsamplingScaleImageView.IconCompatParcelizer(f, f2, f3);
        pointF.set((((float) (subsamplingScaleImageView.getPaddingLeft() + (((subsamplingScaleImageView.getWidth() - subsamplingScaleImageView.getPaddingRight()) - subsamplingScaleImageView.getPaddingLeft()) / 2))) - IconCompatParcelizer2.x) / f3, (((float) (subsamplingScaleImageView.getPaddingTop() + (((subsamplingScaleImageView.getHeight() - subsamplingScaleImageView.getPaddingBottom()) - subsamplingScaleImageView.getPaddingTop()) / 2))) - IconCompatParcelizer2.y) / f3);
        return pointF;
    }

    private int MediaDescriptionCompat() {
        int i = this.setContentHeight;
        if (i == -1) {
            i = this.ActionBarOverlayLayout;
        }
        if (i == 90 || i == 270) {
            return this.setOverlayMode;
        }
        return this.setActionBarVisibilityCallback;
    }

    private int MediaSessionCompat$ResultReceiverWrapper() {
        int i = this.setContentHeight;
        if (i == -1) {
            i = this.ActionBarOverlayLayout;
        }
        if (i == 90 || i == 270) {
            return this.setActionBarVisibilityCallback;
        }
        return this.setOverlayMode;
    }

    private boolean IconCompatParcelizer(C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver) {
        float f;
        float f2;
        float f3;
        PointF pointF = this.setPresenter;
        float f4 = Float.NaN;
        if (pointF == null) {
            f = Float.NaN;
        } else {
            f = (BitmapDescriptorFactory.HUE_RED - pointF.x) / this.setWindowCallback;
        }
        float width = (float) getWidth();
        PointF pointF2 = this.setPresenter;
        if (pointF2 == null) {
            f2 = Float.NaN;
        } else {
            f2 = (width - pointF2.x) / this.setWindowCallback;
        }
        PointF pointF3 = this.setPresenter;
        if (pointF3 == null) {
            f3 = Float.NaN;
        } else {
            f3 = (BitmapDescriptorFactory.HUE_RED - pointF3.y) / this.setWindowCallback;
        }
        float height = (float) getHeight();
        PointF pointF4 = this.setPresenter;
        if (pointF4 != null) {
            f4 = (height - pointF4.y) / this.setWindowCallback;
        }
        return f <= ((float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read.right) && ((float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read.left) <= f2 && f3 <= ((float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read.bottom) && ((float) subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read.top) <= f4;
    }
}
