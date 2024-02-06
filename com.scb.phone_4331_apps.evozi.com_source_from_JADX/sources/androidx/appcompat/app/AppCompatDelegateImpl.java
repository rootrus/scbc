package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.p042v1.XmlPullParser;
import p040o.ActionBarOverlayLayout;
import p040o.ActionMenuItemView;
import p040o.ActionMenuView;
import p040o.ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.AppCompatActivity;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.AppCompatDialogFragment;
import p040o.C1133x65c1ec57;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.Keep;
import p040o.MenuItemImpl;
import p040o.MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.PlaybackStateCompat;
import p040o.SwitchCompat;
import p040o.setBackgroundResource;
import p040o.setContentView;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setHasDecor;
import p040o.setIcon;
import p040o.setItemInvoker$MediaBrowserCompat$ItemReceiver;
import p040o.setOnSearchClickListener;
import p040o.setPopupCallback;
import p040o.setQuery;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;
import p040o.setSwitchMinWidth;
import p040o.setSwitchPadding;
import p040o.setSwitchTypeface;
import p040o.setTextOff;

public class AppCompatDelegateImpl extends setHasDecor implements MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver, LayoutInflater.Factory2 {
    private static final int[] AppCompatActivity = {16842836};
    private static boolean AppCompatDialogFragment = true;
    private static final boolean setBackgroundResource;
    private CharSequence AbsActionBarView;
    private C0012xa11d3055 ActionMenuItemView;
    boolean AlertController$RecycleListView;
    private read AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatViewInflater;
    private AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver ExpandedMenuView;
    ActionBarContextView IconCompatParcelizer;
    boolean Keep;
    private AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver[] ListMenuItemView;
    ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver;
    Keep MediaBrowserCompat$ItemReceiver;
    final Context MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    boolean f1x50fd9e4a;
    int MediaDescriptionCompat;
    setSwitchPadding MediaMetadataCompat = null;
    final Window.Callback MediaSessionCompat$QueueItem;
    boolean MediaSessionCompat$ResultReceiverWrapper;
    boolean MediaSessionCompat$Token;
    private ViewGroup MenuItemImpl;
    private Rect MenuItemWrapperICS$CollapsibleActionViewWrapper;
    MenuInflater ParcelableVolumeInfo;
    final Window PlaybackStateCompat;
    Runnable PlaybackStateCompat$CustomAction;
    final Window.Callback RatingCompat;
    PopupWindow read;
    private boolean setCheckable;
    private boolean setChecked;
    private Rect setContentHeight;
    private AppCompatViewInflater setContentView;
    private CheckCaptureModule_GetExtractionParametersFactory setExpandedFormat;
    private boolean setForceShowIcon;
    private View setGroupDividerEnabled;
    boolean setHasDecor;
    private boolean setIcon;
    private int setItemInvoker = -100;
    private boolean setPadding = true;
    private final Runnable setPopupCallback = new Runnable() {
        public void run() {
            if ((AppCompatDelegateImpl.this.MediaDescriptionCompat & 1) != 0) {
                AppCompatDelegateImpl.this.MediaBrowserCompat$CustomActionResultReceiver(0);
            }
            if ((AppCompatDelegateImpl.this.MediaDescriptionCompat & 4096) != 0) {
                AppCompatDelegateImpl.this.MediaBrowserCompat$CustomActionResultReceiver(108);
            }
            AppCompatDelegateImpl.this.MediaSessionCompat$ResultReceiverWrapper = false;
            AppCompatDelegateImpl.this.MediaDescriptionCompat = 0;
        }
    };
    private boolean setShortcut;
    private TextView setTabContainer;
    private RatingCompat setTitle;
    private boolean setVisibility;
    final PlaybackStateCompat write;

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup) {
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        setBackgroundResource = z;
        if (z && !AppCompatDialogFragment) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    if (IconCompatParcelizer(th)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                private boolean IconCompatParcelizer(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    if (message.contains("drawable") || message.contains("Drawable")) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, PlaybackStateCompat playbackStateCompat) {
        this.MediaBrowserCompat$MediaItem = context;
        this.PlaybackStateCompat = window;
        this.write = playbackStateCompat;
        Window.Callback callback = window.getCallback();
        this.MediaSessionCompat$QueueItem = callback;
        if (!(callback instanceof IconCompatParcelizer)) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(callback);
            this.RatingCompat = iconCompatParcelizer;
            this.PlaybackStateCompat.setCallback(iconCompatParcelizer);
            AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes((AttributeSet) null, AppCompatActivity));
            Drawable IconCompatParcelizer2 = mediaDescriptionCompat.IconCompatParcelizer(0);
            if (IconCompatParcelizer2 != null) {
                this.PlaybackStateCompat.setBackgroundDrawable(IconCompatParcelizer2);
            }
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void write(Bundle bundle) {
        Window.Callback callback = this.MediaSessionCompat$QueueItem;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = AlertController$RecycleListView.read((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                Keep PlaybackStateCompat2 = PlaybackStateCompat();
                if (PlaybackStateCompat2 == null) {
                    this.setCheckable = true;
                } else {
                    PlaybackStateCompat2.MediaBrowserCompat$ItemReceiver(true);
                }
            }
        }
        if (bundle != null && this.setItemInvoker == -100) {
            this.setItemInvoker = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        setContentView();
    }

    public Keep MediaBrowserCompat$CustomActionResultReceiver() {
        AppCompatDialogFragment();
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final Keep PlaybackStateCompat() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Window.Callback mo74x50fd9e4a() {
        return this.PlaybackStateCompat.getCallback();
    }

    private void AppCompatDialogFragment() {
        setContentView();
        if (this.MediaBrowserCompat$SearchResultReceiver && this.MediaBrowserCompat$ItemReceiver == null) {
            Window.Callback callback = this.MediaSessionCompat$QueueItem;
            if (callback instanceof Activity) {
                this.MediaBrowserCompat$ItemReceiver = new AppCompatActivity((Activity) this.MediaSessionCompat$QueueItem, this.setHasDecor);
            } else if (callback instanceof Dialog) {
                this.MediaBrowserCompat$ItemReceiver = new AppCompatActivity((Dialog) this.MediaSessionCompat$QueueItem);
            }
            Keep keep = this.MediaBrowserCompat$ItemReceiver;
            if (keep != null) {
                keep.MediaBrowserCompat$ItemReceiver(this.setCheckable);
            }
        }
    }

    public void read(Toolbar toolbar) {
        if (this.MediaSessionCompat$QueueItem instanceof Activity) {
            Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
            if (!(MediaBrowserCompat$CustomActionResultReceiver2 instanceof AppCompatActivity)) {
                this.ParcelableVolumeInfo = null;
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat();
                }
                if (toolbar != null) {
                    setContentView setcontentview = new setContentView(toolbar, ((Activity) this.MediaSessionCompat$QueueItem).getTitle(), this.RatingCompat);
                    this.MediaBrowserCompat$ItemReceiver = setcontentview;
                    this.PlaybackStateCompat.setCallback(setcontentview.IconCompatParcelizer);
                } else {
                    this.MediaBrowserCompat$ItemReceiver = null;
                    this.PlaybackStateCompat.setCallback(this.RatingCompat);
                }
                MediaDescriptionCompat();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context MediaSessionCompat$ResultReceiverWrapper() {
        Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        Context IconCompatParcelizer2 = MediaBrowserCompat$CustomActionResultReceiver2 != null ? MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer() : null;
        return IconCompatParcelizer2 == null ? this.MediaBrowserCompat$MediaItem : IconCompatParcelizer2;
    }

    public MenuInflater read() {
        if (this.ParcelableVolumeInfo == null) {
            AppCompatDialogFragment();
            Keep keep = this.MediaBrowserCompat$ItemReceiver;
            this.ParcelableVolumeInfo = new setIcon(keep != null ? keep.IconCompatParcelizer() : this.MediaBrowserCompat$MediaItem);
        }
        return this.ParcelableVolumeInfo;
    }

    public <T extends View> T MediaBrowserCompat$ItemReceiver(int i) {
        setContentView();
        return this.PlaybackStateCompat.findViewById(i);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Configuration configuration) {
        Keep MediaBrowserCompat$CustomActionResultReceiver2;
        if (this.MediaBrowserCompat$SearchResultReceiver && this.setVisibility && (MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver()) != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(configuration);
        }
        ActionBarOverlayLayout.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem);
        write();
    }

    public void MediaMetadataCompat() {
        write();
    }

    public void MediaBrowserCompat$MediaItem() {
        Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(false);
        }
        C0012xa11d3055 appCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver = this.ActionMenuItemView;
        if (appCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver != null) {
            appCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver.read();
        }
    }

    public void MediaBrowserCompat$SearchResultReceiver() {
        Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(true);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        setContentView();
        ViewGroup viewGroup = (ViewGroup) this.MenuItemImpl.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.MediaSessionCompat$QueueItem.onContentChanged();
    }

    public void IconCompatParcelizer(int i) {
        setContentView();
        ViewGroup viewGroup = (ViewGroup) this.MenuItemImpl.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.MediaBrowserCompat$MediaItem).inflate(i, viewGroup);
        this.MediaSessionCompat$QueueItem.onContentChanged();
    }

    public void IconCompatParcelizer(View view, ViewGroup.LayoutParams layoutParams) {
        setContentView();
        ViewGroup viewGroup = (ViewGroup) this.MenuItemImpl.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.MediaSessionCompat$QueueItem.onContentChanged();
    }

    public void MediaBrowserCompat$ItemReceiver(View view, ViewGroup.LayoutParams layoutParams) {
        setContentView();
        ((ViewGroup) this.MenuItemImpl.findViewById(16908290)).addView(view, layoutParams);
        this.MediaSessionCompat$QueueItem.onContentChanged();
    }

    public void IconCompatParcelizer(Bundle bundle) {
        int i = this.setItemInvoker;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    public void RatingCompat() {
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            this.PlaybackStateCompat.getDecorView().removeCallbacks(this.setPopupCallback);
        }
        this.f1x50fd9e4a = true;
        Keep keep = this.MediaBrowserCompat$ItemReceiver;
        if (keep != null) {
            keep.MediaMetadataCompat();
        }
        C0012xa11d3055 appCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver = this.ActionMenuItemView;
        if (appCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver != null) {
            appCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver.read();
        }
    }

    private void setContentView() {
        if (!this.setVisibility) {
            this.MenuItemImpl = AppCompatDelegateImpl$ListMenuDecorView();
            CharSequence MediaSessionCompat$Token2 = MediaSessionCompat$Token();
            if (!TextUtils.isEmpty(MediaSessionCompat$Token2)) {
                CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory = this.setExpandedFormat;
                if (checkCaptureModule_GetExtractionParametersFactory != null) {
                    checkCaptureModule_GetExtractionParametersFactory.setWindowTitle(MediaSessionCompat$Token2);
                } else if (PlaybackStateCompat() != null) {
                    PlaybackStateCompat().write(MediaSessionCompat$Token2);
                } else {
                    TextView textView = this.setTabContainer;
                    if (textView != null) {
                        textView.setText(MediaSessionCompat$Token2);
                    }
                }
            }
            setHasDecor();
            MediaBrowserCompat$CustomActionResultReceiver(this.MenuItemImpl);
            this.setVisibility = true;
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(0, false);
            if (this.f1x50fd9e4a) {
                return;
            }
            if (write2 == null || write2.MediaSessionCompat$Token == null) {
                MediaBrowserCompat$SearchResultReceiver(108);
            }
        }
    }

    private ViewGroup AppCompatDelegateImpl$ListMenuDecorView() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.MediaBrowserCompat$MediaItem.obtainStyledAttributes(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowNoTitle, false)) {
                write(1);
            } else if (obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowActionBar, false)) {
                write(108);
            }
            if (obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowActionBarOverlay, false)) {
                write(109);
            }
            if (obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowActionModeOverlay, false)) {
                write(10);
            }
            this.MediaSessionCompat$Token = obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.PlaybackStateCompat.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.MediaBrowserCompat$MediaItem);
            if (this.Keep) {
                if (this.AlertController$RecycleListView) {
                    viewGroup = (ViewGroup) from.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    SwitchCompat.write((View) viewGroup, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
                        public setTextOff write(View view, setTextOff settextoff) {
                            int read = settextoff.read();
                            int MediaBrowserCompat$MediaItem = AppCompatDelegateImpl.this.MediaBrowserCompat$MediaItem(read);
                            if (read != MediaBrowserCompat$MediaItem) {
                                settextoff = settextoff.MediaBrowserCompat$ItemReceiver(settextoff.MediaBrowserCompat$CustomActionResultReceiver(), MediaBrowserCompat$MediaItem, settextoff.write(), settextoff.IconCompatParcelizer());
                            }
                            return SwitchCompat.write(view, settextoff);
                        }
                    });
                } else {
                    ((ActionMenuView) viewGroup).setOnFitSystemWindowsListener(new ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver() {
                        public void write(Rect rect) {
                            rect.top = AppCompatDelegateImpl.this.MediaBrowserCompat$MediaItem(rect.top);
                        }
                    });
                }
            } else if (this.MediaSessionCompat$Token) {
                viewGroup = (ViewGroup) from.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_dialog_title_material, (ViewGroup) null);
                this.setHasDecor = false;
                this.MediaBrowserCompat$SearchResultReceiver = false;
            } else if (this.MediaBrowserCompat$SearchResultReceiver) {
                TypedValue typedValue = new TypedValue();
                this.MediaBrowserCompat$MediaItem.getTheme().resolveAttribute(AlertController$RecycleListView.read.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new setPopupCallback(this.MediaBrowserCompat$MediaItem, typedValue.resourceId);
                } else {
                    context = this.MediaBrowserCompat$MediaItem;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_screen_toolbar, (ViewGroup) null);
                CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory = (CheckCaptureModule_GetExtractionParametersFactory) viewGroup.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.decor_content_parent);
                this.setExpandedFormat = checkCaptureModule_GetExtractionParametersFactory;
                checkCaptureModule_GetExtractionParametersFactory.setWindowCallback(mo74x50fd9e4a());
                if (this.setHasDecor) {
                    this.setExpandedFormat.MediaBrowserCompat$ItemReceiver(109);
                }
                if (this.setIcon) {
                    this.setExpandedFormat.MediaBrowserCompat$ItemReceiver(2);
                }
                if (this.setShortcut) {
                    this.setExpandedFormat.MediaBrowserCompat$ItemReceiver(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.setExpandedFormat == null) {
                    this.setTabContainer = (TextView) viewGroup.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.title);
                }
                setDefaultActionButtonContentDescription.read(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.PlaybackStateCompat.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.PlaybackStateCompat.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver() {
                    public void MediaBrowserCompat$ItemReceiver() {
                    }

                    public void IconCompatParcelizer() {
                        AppCompatDelegateImpl.this.MediaSessionCompat$QueueItem();
                    }
                });
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.setHasDecor);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.AlertController$RecycleListView);
            sb.append(", windowNoTitle: ");
            sb.append(this.Keep);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void setHasDecor() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.MenuItemImpl.findViewById(16908290);
        View decorView = this.PlaybackStateCompat.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.MediaBrowserCompat$MediaItem.obtainStyledAttributes(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme);
        obtainStyledAttributes.getValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.MediaBrowserCompat$ItemReceiver());
        obtainStyledAttributes.getValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.MediaDescriptionCompat());
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.read());
        }
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.IconCompatParcelizer());
        }
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.write());
        }
        if (obtainStyledAttributes.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.MediaBrowserCompat$CustomActionResultReceiver());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public boolean write(int i) {
        int ParcelableVolumeInfo2 = ParcelableVolumeInfo(i);
        if (this.Keep && ParcelableVolumeInfo2 == 108) {
            return false;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver && ParcelableVolumeInfo2 == 1) {
            this.MediaBrowserCompat$SearchResultReceiver = false;
        }
        if (ParcelableVolumeInfo2 == 1) {
            AppCompatViewInflater();
            this.Keep = true;
            return true;
        } else if (ParcelableVolumeInfo2 == 2) {
            AppCompatViewInflater();
            this.setIcon = true;
            return true;
        } else if (ParcelableVolumeInfo2 == 5) {
            AppCompatViewInflater();
            this.setShortcut = true;
            return true;
        } else if (ParcelableVolumeInfo2 == 10) {
            AppCompatViewInflater();
            this.AlertController$RecycleListView = true;
            return true;
        } else if (ParcelableVolumeInfo2 == 108) {
            AppCompatViewInflater();
            this.MediaBrowserCompat$SearchResultReceiver = true;
            return true;
        } else if (ParcelableVolumeInfo2 != 109) {
            return this.PlaybackStateCompat.requestFeature(ParcelableVolumeInfo2);
        } else {
            AppCompatViewInflater();
            this.setHasDecor = true;
            return true;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        this.AbsActionBarView = charSequence;
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory = this.setExpandedFormat;
        if (checkCaptureModule_GetExtractionParametersFactory != null) {
            checkCaptureModule_GetExtractionParametersFactory.setWindowTitle(charSequence);
        } else if (PlaybackStateCompat() != null) {
            PlaybackStateCompat().write(charSequence);
        } else {
            TextView textView = this.setTabContainer;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence MediaSessionCompat$Token() {
        Window.Callback callback = this.MediaSessionCompat$QueueItem;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.AbsActionBarView;
    }

    /* access modifiers changed from: package-private */
    public void MediaMetadataCompat(int i) {
        if (i == 108) {
            Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                MediaBrowserCompat$CustomActionResultReceiver2.read(false);
            }
        } else if (i == 0) {
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(i, true);
            if (write2.MediaBrowserCompat$MediaItem) {
                write(write2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void RatingCompat(int i) {
        Keep MediaBrowserCompat$CustomActionResultReceiver2;
        if (i == 108 && (MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver()) != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.read(true);
        }
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2;
        Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo74x50fd9e4a();
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == null || this.f1x50fd9e4a || (MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver((Menu) menuItemImpl.write())) == null) {
            return false;
        }
        return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onMenuItemSelected(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, menuItem);
    }

    public void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl, true);
    }

    public ActionMenuItemView IconCompatParcelizer(ActionMenuItemView.read read2) {
        PlaybackStateCompat playbackStateCompat;
        if (read2 != null) {
            ActionMenuItemView actionMenuItemView = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (actionMenuItemView != null) {
                actionMenuItemView.read();
            }
            write write2 = new write(read2);
            Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver((ActionMenuItemView.read) write2);
                this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver3;
                if (!(MediaBrowserCompat$CustomActionResultReceiver3 == null || (playbackStateCompat = this.write) == null)) {
                    playbackStateCompat.write(MediaBrowserCompat$CustomActionResultReceiver3);
                }
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = write((ActionMenuItemView.read) write2);
            }
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void MediaDescriptionCompat() {
        Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || !MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat()) {
            MediaBrowserCompat$SearchResultReceiver(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040o.ActionMenuItemView write(p040o.ActionMenuItemView.read r8) {
        /*
            r7 = this;
            r7.ParcelableVolumeInfo()
            o.ActionMenuItemView r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x000a
            r0.read()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.write
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$write r0 = new androidx.appcompat.app.AppCompatDelegateImpl$write
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            o.PlaybackStateCompat r0 = r7.write
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f1x50fd9e4a
            if (r2 != 0) goto L_0x0022
            o.ActionMenuItemView r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.MediaBrowserCompat$CustomActionResultReceiver = r0
            goto L_0x015c
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.IconCompatParcelizer
            r2 = 0
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.MediaSessionCompat$Token
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r3 = r7.MediaBrowserCompat$MediaItem
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = p040o.AlertController$RecycleListView.read.actionBarTheme
            r5 = 1
            r3.resolveAttribute(r4, r0, r5)
            int r4 = r0.resourceId
            if (r4 == 0) goto L_0x0068
            android.content.Context r4 = r7.MediaBrowserCompat$MediaItem
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
            int r3 = r0.resourceId
            r4.applyStyle(r3, r5)
            o.setPopupCallback r3 = new o.setPopupCallback
            android.content.Context r6 = r7.MediaBrowserCompat$MediaItem
            r3.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r3.getTheme()
            r6.setTo(r4)
            goto L_0x006a
        L_0x0068:
            android.content.Context r3 = r7.MediaBrowserCompat$MediaItem
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r4 = new androidx.appcompat.widget.ActionBarContextView
            r4.<init>(r3)
            r7.IconCompatParcelizer = r4
            android.widget.PopupWindow r4 = new android.widget.PopupWindow
            int r6 = p040o.AlertController$RecycleListView.read.actionModePopupWindowStyle
            r4.<init>(r3, r1, r6)
            r7.read = r4
            r6 = 2
            p040o.setCollapsible.write(r4, r6)
            android.widget.PopupWindow r4 = r7.read
            androidx.appcompat.widget.ActionBarContextView r6 = r7.IconCompatParcelizer
            r4.setContentView(r6)
            android.widget.PopupWindow r4 = r7.read
            r6 = -1
            r4.setWidth(r6)
            android.content.res.Resources$Theme r4 = r3.getTheme()
            int r6 = p040o.AlertController$RecycleListView.read.actionBarSize
            r4.resolveAttribute(r6, r0, r5)
            int r0 = r0.data
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r3)
            androidx.appcompat.widget.ActionBarContextView r3 = r7.IconCompatParcelizer
            r3.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.read
            r3 = -2
            r0.setHeight(r3)
            androidx.appcompat.app.AppCompatDelegateImpl$9 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$9
            r0.<init>()
            r7.PlaybackStateCompat$CustomAction = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.MenuItemImpl
            int r3 = p040o.AlertController$RecycleListView.MediaDescriptionCompat.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r3)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r3 = r7.MediaSessionCompat$ResultReceiverWrapper()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r0.setLayoutInflater(r3)
            android.view.View r0 = r0.read()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.IconCompatParcelizer = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.IconCompatParcelizer
            if (r0 == 0) goto L_0x015c
            r7.ParcelableVolumeInfo()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.IconCompatParcelizer
            r0.MediaBrowserCompat$CustomActionResultReceiver()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.IconCompatParcelizer
            android.content.Context r0 = r0.getContext()
            androidx.appcompat.widget.ActionBarContextView r3 = r7.IconCompatParcelizer
            o.setShortcut r4 = new o.setShortcut
            r4.<init>(r0, r3, r8)
            android.view.Menu r0 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            boolean r8 = r8.read(r4, r0)
            if (r8 == 0) goto L_0x015a
            r4.RatingCompat()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            r8.IconCompatParcelizer(r4)
            r7.MediaBrowserCompat$CustomActionResultReceiver = r4
            boolean r8 = r7.AlertController$RecycleListView()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0124
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            o.setSwitchPadding r8 = p040o.SwitchCompat.write(r8)
            o.setSwitchPadding r8 = r8.IconCompatParcelizer(r0)
            r7.MediaMetadataCompat = r8
            androidx.appcompat.app.AppCompatDelegateImpl$6 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$6
            r0.<init>()
            r8.read((p040o.setSwitchTypeface) r0)
            goto L_0x014a
        L_0x0124:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.IconCompatParcelizer
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p040o.SwitchCompat.setShortcut(r8)
        L_0x014a:
            android.widget.PopupWindow r8 = r7.read
            if (r8 == 0) goto L_0x015c
            android.view.Window r8 = r7.PlaybackStateCompat
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.PlaybackStateCompat$CustomAction
            r8.post(r0)
            goto L_0x015c
        L_0x015a:
            r7.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x015c:
            o.ActionMenuItemView r8 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x0167
            o.PlaybackStateCompat r0 = r7.write
            if (r0 == 0) goto L_0x0167
            r0.write(r8)
        L_0x0167:
            o.ActionMenuItemView r8 = r7.MediaBrowserCompat$CustomActionResultReceiver
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.write(o.ActionMenuItemView$read):o.ActionMenuItemView");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.MenuItemImpl;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AlertController$RecycleListView() {
        /*
            r1 = this;
            boolean r0 = r1.setVisibility
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.MenuItemImpl
            if (r0 == 0) goto L_0x0010
            boolean r0 = p040o.SwitchCompat.setCheckable(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.AlertController$RecycleListView():boolean");
    }

    public boolean PlaybackStateCompat$CustomAction() {
        return this.setPadding;
    }

    /* access modifiers changed from: package-private */
    public void ParcelableVolumeInfo() {
        setSwitchPadding setswitchpadding = this.MediaMetadataCompat;
        if (setswitchpadding != null) {
            setswitchpadding.read();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Keep() {
        ActionMenuItemView actionMenuItemView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (actionMenuItemView != null) {
            actionMenuItemView.read();
            return true;
        }
        Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || !MediaBrowserCompat$CustomActionResultReceiver2.write()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean write(int i, KeyEvent keyEvent) {
        Keep MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null && MediaBrowserCompat$CustomActionResultReceiver2.read(i, keyEvent)) {
            return true;
        }
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver = this.ExpandedMenuView;
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver == null || !MediaBrowserCompat$ItemReceiver(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.ExpandedMenuView == null) {
                AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(0, true);
                MediaBrowserCompat$CustomActionResultReceiver(write2, keyEvent);
                boolean MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(write2, keyEvent.getKeyCode(), keyEvent, 1);
                write2.RatingCompat = false;
                if (MediaBrowserCompat$ItemReceiver2) {
                    return true;
                }
            }
            return false;
        }
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2 = this.ExpandedMenuView;
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2 != null) {
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2.MediaDescriptionCompat = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean write(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.MediaSessionCompat$QueueItem;
        boolean z = true;
        if (((callback instanceof setQuery.IconCompatParcelizer) || (callback instanceof setBackgroundResource)) && (decorView = this.PlaybackStateCompat.getDecorView()) != null && SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.MediaSessionCompat$QueueItem.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? MediaBrowserCompat$CustomActionResultReceiver(keyCode, keyEvent) : read(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean read(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.setForceShowIcon;
            this.setForceShowIcon = false;
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(0, false);
            if (write2 != null && write2.MediaBrowserCompat$MediaItem) {
                if (!z) {
                    write(write2, true);
                }
                return true;
            } else if (Keep()) {
                return true;
            }
        } else if (i == 82) {
            IconCompatParcelizer(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean MediaBrowserCompat$CustomActionResultReceiver(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.setForceShowIcon = z;
        } else if (i == 82) {
            MediaBrowserCompat$ItemReceiver(0, keyEvent);
            return true;
        }
        return false;
    }

    public View write(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.setContentView == null) {
            String string = this.MediaBrowserCompat$MediaItem.obtainStyledAttributes(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme).getString(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.setContentView = new AppCompatViewInflater();
            } else {
                try {
                    this.setContentView = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    this.setContentView = new AppCompatViewInflater();
                }
            }
        }
        if (setBackgroundResource) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = read((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z = true;
                return this.setContentView.MediaBrowserCompat$ItemReceiver(view, str, context, attributeSet, z, setBackgroundResource, true, false);
            }
        }
        z = z2;
        return this.setContentView.MediaBrowserCompat$ItemReceiver(view, str, context, attributeSet, z, setBackgroundResource, true, false);
    }

    private boolean read(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.PlaybackStateCompat.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || SwitchCompat.setExpandedFormat((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public void IconCompatParcelizer() {
        LayoutInflater from = LayoutInflater.from(this.MediaBrowserCompat$MediaItem);
        if (from.getFactory() == null) {
            setOnSearchClickListener.write(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return write(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    private void read(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem && !this.f1x50fd9e4a) {
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == 0) {
                if ((this.MediaBrowserCompat$MediaItem.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo74x50fd9e4a();
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == null || MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onMenuOpened(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token)) {
                WindowManager windowManager = (WindowManager) this.MediaBrowserCompat$MediaItem.getSystemService("window");
                if (windowManager != null && MediaBrowserCompat$CustomActionResultReceiver(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, keyEvent)) {
                    if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write == null || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo) {
                        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write == null) {
                            if (!read(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write == null) {
                                return;
                            }
                        } else if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo && appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write.getChildCount() > 0) {
                            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write.removeAllViews();
                        }
                        if (MediaBrowserCompat$CustomActionResultReceiver(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) && appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write()) {
                            ViewGroup.LayoutParams layoutParams2 = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write.setBackgroundResource(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.read);
                            ViewParent parent = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep);
                            }
                            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write.addView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep, layoutParams2);
                            if (!appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep.hasFocus()) {
                                appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (!(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver == null || (layoutParams = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction, 1002, 8519680, -3);
                        layoutParams3.gravity = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
                        layoutParams3.windowAnimations = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.setHasDecor;
                        windowManager.addView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write, layoutParams3);
                        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = true;
                        return;
                    }
                    i = -2;
                    appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction, 1002, 8519680, -3);
                    layoutParams32.gravity = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
                    layoutParams32.windowAnimations = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.setHasDecor;
                    windowManager.addView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write, layoutParams32);
                    appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = true;
                    return;
                }
                return;
            }
            write(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, true);
        }
    }

    private boolean read(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) {
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.read(MediaSessionCompat$ResultReceiverWrapper());
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write = new ListMenuDecorView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.f2x50fd9e4a);
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = 81;
        return true;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, boolean z) {
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory = this.setExpandedFormat;
        if (checkCaptureModule_GetExtractionParametersFactory == null || !checkCaptureModule_GetExtractionParametersFactory.read() || (ViewConfiguration.get(this.MediaBrowserCompat$MediaItem).hasPermanentMenuKey() && !this.setExpandedFormat.write())) {
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(0, true);
            write2.ParcelableVolumeInfo = true;
            write(write2, false);
            read(write2, (KeyEvent) null);
            return;
        }
        Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo74x50fd9e4a();
        if (this.setExpandedFormat.MediaBrowserCompat$CustomActionResultReceiver() && z) {
            this.setExpandedFormat.MediaBrowserCompat$ItemReceiver();
            if (!this.f1x50fd9e4a) {
                MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onPanelClosed(108, write(0, true).MediaSessionCompat$Token);
            }
        } else if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null && !this.f1x50fd9e4a) {
            if (this.MediaSessionCompat$ResultReceiverWrapper && (this.MediaDescriptionCompat & 1) != 0) {
                this.PlaybackStateCompat.getDecorView().removeCallbacks(this.setPopupCallback);
                this.setPopupCallback.run();
            }
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write3 = write(0, true);
            if (write3.MediaSessionCompat$Token != null && !write3.MediaSessionCompat$QueueItem && MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onPreparePanel(0, write3.MediaBrowserCompat$CustomActionResultReceiver, write3.MediaSessionCompat$Token)) {
                MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onMenuOpened(108, write3.MediaSessionCompat$Token);
                this.setExpandedFormat.RatingCompat();
            }
        }
    }

    private boolean IconCompatParcelizer(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) {
        Context context = this.MediaBrowserCompat$MediaItem;
        if ((appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == 0 || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == 108) && this.setExpandedFormat != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AlertController$RecycleListView.read.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(AlertController$RecycleListView.read.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(AlertController$RecycleListView.read.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                setPopupCallback setpopupcallback = new setPopupCallback(context, 0);
                setpopupcallback.getTheme().setTo(theme2);
                context = setpopupcallback;
            }
        }
        MenuItemImpl menuItemImpl = new MenuItemImpl(context);
        menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver((MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) this);
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.read(menuItemImpl);
        return true;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) {
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            return true;
        } else if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token == null) {
            return false;
        } else {
            if (this.setTitle == null) {
                this.setTitle = new RatingCompat();
            }
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep = (View) appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.setTitle);
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep == null) {
                return false;
            }
            return true;
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, KeyEvent keyEvent) {
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory;
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory2;
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory3;
        if (this.f1x50fd9e4a) {
            return false;
        }
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.RatingCompat) {
            return true;
        }
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2 = this.ExpandedMenuView;
        if (!(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2 == null || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2 == appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver)) {
            write(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2, false);
        }
        Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo74x50fd9e4a();
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onCreatePanelView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        }
        boolean z = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == 0 || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == 108;
        if (z && (checkCaptureModule_GetExtractionParametersFactory3 = this.setExpandedFormat) != null) {
            checkCaptureModule_GetExtractionParametersFactory3.setMenuPrepared();
        }
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver == null && (!z || !(PlaybackStateCompat() instanceof setContentView))) {
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token == null || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem) {
                if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token == null && (!IconCompatParcelizer(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token == null)) {
                    return false;
                }
                if (z && this.setExpandedFormat != null) {
                    if (this.AppCompatDelegateImpl$ListMenuDecorView == null) {
                        this.AppCompatDelegateImpl$ListMenuDecorView = new read();
                    }
                    this.setExpandedFormat.setMenu(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token, this.AppCompatDelegateImpl$ListMenuDecorView);
                }
                MenuItemImpl menuItemImpl = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
                if (!menuItemImpl.PlaybackStateCompat$CustomAction) {
                    menuItemImpl.PlaybackStateCompat$CustomAction = true;
                    menuItemImpl.MediaSessionCompat$Token = false;
                    menuItemImpl.Keep = false;
                }
                if (!MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onCreatePanelMenu(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token)) {
                    appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.read((MenuItemImpl) null);
                    if (z && (checkCaptureModule_GetExtractionParametersFactory2 = this.setExpandedFormat) != null) {
                        checkCaptureModule_GetExtractionParametersFactory2.setMenu((Menu) null, this.AppCompatDelegateImpl$ListMenuDecorView);
                    }
                    return false;
                }
                appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = false;
            }
            MenuItemImpl menuItemImpl2 = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
            if (!menuItemImpl2.PlaybackStateCompat$CustomAction) {
                menuItemImpl2.PlaybackStateCompat$CustomAction = true;
                menuItemImpl2.MediaSessionCompat$Token = false;
                menuItemImpl2.Keep = false;
            }
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver != null) {
                appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token.read(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = null;
            }
            if (!MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onPreparePanel(0, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token)) {
                if (z && (checkCaptureModule_GetExtractionParametersFactory = this.setExpandedFormat) != null) {
                    checkCaptureModule_GetExtractionParametersFactory.setMenu((Menu) null, this.AppCompatDelegateImpl$ListMenuDecorView);
                }
                MenuItemImpl menuItemImpl3 = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
                menuItemImpl3.PlaybackStateCompat$CustomAction = false;
                if (menuItemImpl3.MediaSessionCompat$Token) {
                    menuItemImpl3.MediaSessionCompat$Token = false;
                    menuItemImpl3.IconCompatParcelizer(menuItemImpl3.Keep);
                }
                return false;
            }
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token.setQwertyMode(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper);
            MenuItemImpl menuItemImpl4 = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
            menuItemImpl4.PlaybackStateCompat$CustomAction = false;
            if (menuItemImpl4.MediaSessionCompat$Token) {
                menuItemImpl4.MediaSessionCompat$Token = false;
                menuItemImpl4.IconCompatParcelizer(menuItemImpl4.Keep);
            }
        }
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.RatingCompat = true;
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = false;
        this.ExpandedMenuView = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void read(MenuItemImpl menuItemImpl) {
        if (!this.AppCompatViewInflater) {
            this.AppCompatViewInflater = true;
            this.setExpandedFormat.IconCompatParcelizer();
            Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo74x50fd9e4a();
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null && !this.f1x50fd9e4a) {
                MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onPanelClosed(108, menuItemImpl);
            }
            this.AppCompatViewInflater = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void read(int i) {
        write(write(i, true), true);
    }

    /* access modifiers changed from: package-private */
    public void write(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, boolean z) {
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory;
        if (!z || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != 0 || (checkCaptureModule_GetExtractionParametersFactory = this.setExpandedFormat) == null || !checkCaptureModule_GetExtractionParametersFactory.MediaBrowserCompat$CustomActionResultReceiver()) {
            WindowManager windowManager = (WindowManager) this.MediaBrowserCompat$MediaItem.getSystemService("window");
            if (!(windowManager == null || !appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write == null)) {
                windowManager.removeView(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.write);
                if (z) {
                    MediaBrowserCompat$ItemReceiver(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, (Menu) null);
                }
            }
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.RatingCompat = false;
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = false;
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = false;
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.Keep = null;
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = true;
            if (this.ExpandedMenuView == appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) {
                this.ExpandedMenuView = null;
                return;
            }
            return;
        }
        read(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token);
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(i, true);
        if (!write2.MediaBrowserCompat$MediaItem) {
            return MediaBrowserCompat$CustomActionResultReceiver(write2, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean IconCompatParcelizer(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            o.ActionMenuItemView r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver r2 = r3.write((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0043
            o.CheckCaptureModule_GetExtractionParametersFactory r4 = r3.setExpandedFormat
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.read()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.MediaBrowserCompat$MediaItem
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            o.CheckCaptureModule_GetExtractionParametersFactory r4 = r3.setExpandedFormat
            boolean r4 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f1x50fd9e4a
            if (r4 != 0) goto L_0x0061
            boolean r4 = r3.MediaBrowserCompat$CustomActionResultReceiver((androidx.appcompat.app.AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0061
            o.CheckCaptureModule_GetExtractionParametersFactory r4 = r3.setExpandedFormat
            boolean r0 = r4.RatingCompat()
            goto L_0x0069
        L_0x003c:
            o.CheckCaptureModule_GetExtractionParametersFactory r4 = r3.setExpandedFormat
            boolean r0 = r4.MediaBrowserCompat$ItemReceiver()
            goto L_0x0069
        L_0x0043:
            boolean r4 = r2.MediaBrowserCompat$MediaItem
            if (r4 != 0) goto L_0x0063
            boolean r4 = r2.MediaDescriptionCompat
            if (r4 != 0) goto L_0x0063
            boolean r4 = r2.RatingCompat
            if (r4 == 0) goto L_0x0061
            boolean r4 = r2.MediaSessionCompat$QueueItem
            if (r4 == 0) goto L_0x005a
            r2.RatingCompat = r1
            boolean r4 = r3.MediaBrowserCompat$CustomActionResultReceiver((androidx.appcompat.app.AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) r2, (android.view.KeyEvent) r5)
            goto L_0x005b
        L_0x005a:
            r4 = r0
        L_0x005b:
            if (r4 == 0) goto L_0x0061
            r3.read((androidx.appcompat.app.AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) r2, (android.view.KeyEvent) r5)
            goto L_0x0069
        L_0x0061:
            r0 = r1
            goto L_0x0069
        L_0x0063:
            boolean r4 = r2.MediaBrowserCompat$MediaItem
            r3.write((androidx.appcompat.app.AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver) r2, (boolean) r0)
            r0 = r4
        L_0x0069:
            if (r0 == 0) goto L_0x0082
            android.content.Context r4 = r3.MediaBrowserCompat$MediaItem
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L_0x007b
            r4.playSoundEffect(r1)
            goto L_0x0082
        L_0x007b:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.IconCompatParcelizer(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(int i, AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, Menu menu) {
        if (menu == null) {
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver == null && i >= 0) {
                AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver[] appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr = this.ListMenuItemView;
                if (i < appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr.length) {
                    appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr[i];
                }
            }
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver != null) {
                menu = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
            }
        }
        if ((appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver == null || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem) && !this.f1x50fd9e4a) {
            this.MediaSessionCompat$QueueItem.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(Menu menu) {
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver[] appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr = this.ListMenuItemView;
        int length = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr != null ? appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr.length : 0;
        for (int i = 0; i < length; i++) {
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr[i];
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver != null && appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token == menu) {
                return appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write(int i, boolean z) {
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver[] appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr = this.ListMenuItemView;
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr == null || appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr.length <= i) {
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver[] appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr2 = new AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver[(i + 1)];
            if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr != null) {
                System.arraycopy(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr, 0, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr2, 0, appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr.length);
            }
            this.ListMenuItemView = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr2;
            appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr2;
        }
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr[i];
        if (appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver != null) {
            return appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver;
        }
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2 = new AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver(i);
        appCompatDelegateImpl$MediaBrowserCompat$ItemReceiverArr[i] = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2;
        return appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver2;
    }

    private boolean MediaBrowserCompat$ItemReceiver(AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.RatingCompat || MediaBrowserCompat$CustomActionResultReceiver(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, keyEvent)) && appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token != null) {
            z = appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.setExpandedFormat == null) {
            write(appCompatDelegateImpl$MediaBrowserCompat$ItemReceiver, true);
        }
        return z;
    }

    private void MediaBrowserCompat$SearchResultReceiver(int i) {
        this.MediaDescriptionCompat = (1 << i) | this.MediaDescriptionCompat;
        if (!this.MediaSessionCompat$ResultReceiverWrapper) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver(this.PlaybackStateCompat.getDecorView(), this.setPopupCallback);
            this.MediaSessionCompat$ResultReceiverWrapper = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2;
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write3 = write(i, true);
        if (write3.MediaSessionCompat$Token != null) {
            Bundle bundle = new Bundle();
            write3.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(bundle);
            if (bundle.size() > 0) {
                write3.MediaBrowserCompat$ItemReceiver = bundle;
            }
            MenuItemImpl menuItemImpl = write3.MediaSessionCompat$Token;
            if (!menuItemImpl.PlaybackStateCompat$CustomAction) {
                menuItemImpl.PlaybackStateCompat$CustomAction = true;
                menuItemImpl.MediaSessionCompat$Token = false;
                menuItemImpl.Keep = false;
            }
            write3.MediaSessionCompat$Token.clear();
        }
        write3.MediaSessionCompat$QueueItem = true;
        write3.ParcelableVolumeInfo = true;
        if ((i == 108 || i == 0) && this.setExpandedFormat != null && (write2 = write(0, false)) != null) {
            write2.RatingCompat = false;
            MediaBrowserCompat$CustomActionResultReceiver(write2, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$MediaItem(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.IconCompatParcelizer;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.IconCompatParcelizer.getLayoutParams();
            z = true;
            if (this.IconCompatParcelizer.isShown()) {
                if (this.MenuItemWrapperICS$CollapsibleActionViewWrapper == null) {
                    this.MenuItemWrapperICS$CollapsibleActionViewWrapper = new Rect();
                    this.setContentHeight = new Rect();
                }
                Rect rect = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
                Rect rect2 = this.setContentHeight;
                rect.set(0, i, 0, 0);
                setDefaultActionButtonContentDescription.MediaBrowserCompat$CustomActionResultReceiver(this.MenuItemImpl, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.setGroupDividerEnabled;
                    if (view == null) {
                        View view2 = new View(this.MediaBrowserCompat$MediaItem);
                        this.setGroupDividerEnabled = view2;
                        view2.setBackgroundColor(this.MediaBrowserCompat$MediaItem.getResources().getColor(C1133x65c1ec57.abc_input_method_navigation_guard));
                        this.MenuItemImpl.addView(this.setGroupDividerEnabled, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.setGroupDividerEnabled.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.setGroupDividerEnabled == null) {
                    z = false;
                }
                if (!this.AlertController$RecycleListView && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.IconCompatParcelizer.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.setGroupDividerEnabled;
        if (view3 != null) {
            if (!z) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        }
        return i;
    }

    private void AppCompatViewInflater() {
        if (this.setVisibility) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int ParcelableVolumeInfo(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaSessionCompat$QueueItem() {
        CheckCaptureModule_GetExtractionParametersFactory checkCaptureModule_GetExtractionParametersFactory = this.setExpandedFormat;
        if (checkCaptureModule_GetExtractionParametersFactory != null) {
            checkCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer();
        }
        if (this.read != null) {
            this.PlaybackStateCompat.getDecorView().removeCallbacks(this.PlaybackStateCompat$CustomAction);
            if (this.read.isShowing()) {
                try {
                    this.read.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.read = null;
        }
        ParcelableVolumeInfo();
        AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write2 = write(0, false);
        if (write2 != null && write2.MediaSessionCompat$Token != null) {
            write2.MediaSessionCompat$Token.close();
        }
    }

    public boolean write() {
        int AppCompatActivity2 = AppCompatActivity();
        int MediaDescriptionCompat2 = MediaDescriptionCompat(AppCompatActivity2);
        boolean MediaSessionCompat$QueueItem2 = MediaDescriptionCompat2 != -1 ? MediaSessionCompat$QueueItem(MediaDescriptionCompat2) : false;
        if (AppCompatActivity2 == 0) {
            setBackgroundResource();
            this.ActionMenuItemView.MediaBrowserCompat$ItemReceiver();
        }
        this.setChecked = true;
        return MediaSessionCompat$QueueItem2;
    }

    /* access modifiers changed from: package-private */
    public int MediaDescriptionCompat(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.MediaBrowserCompat$MediaItem.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        setBackgroundResource();
        return this.ActionMenuItemView.write();
    }

    private int AppCompatActivity() {
        int i = this.setItemInvoker;
        return i == -100 ? MediaBrowserCompat$ItemReceiver() : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaSessionCompat$QueueItem(int r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.MediaBrowserCompat$MediaItem
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r1 = r0.getConfiguration()
            int r2 = r1.uiMode
            r3 = 2
            if (r9 != r3) goto L_0x0012
            r9 = 32
            goto L_0x0014
        L_0x0012:
            r9 = 16
        L_0x0014:
            r2 = r2 & 48
            if (r2 == r9) goto L_0x0112
            boolean r2 = r8.setCheckable()
            r3 = 1
            if (r2 == 0) goto L_0x0028
            android.content.Context r9 = r8.MediaBrowserCompat$MediaItem
            android.app.Activity r9 = (android.app.Activity) r9
            r9.recreate()
            goto L_0x0111
        L_0x0028:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>(r1)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r4 = r2.uiMode
            r4 = r4 & -49
            r9 = r9 | r4
            r2.uiMode = r9
            r0.updateConfiguration(r2, r1)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r9 >= r1) goto L_0x0111
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r9 >= r1) goto L_0x0111
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            java.lang.String r2 = "mDrawableCache"
            r4 = 0
            java.lang.String r5 = "ResourcesFlusher"
            if (r9 < r1) goto L_0x00ad
            boolean r9 = p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 != 0) goto L_0x006c
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.String r1 = "mResourcesImpl"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x0064 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver = r9     // Catch:{ NoSuchFieldException -> 0x0064 }
            r9.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            r9 = move-exception
            java.lang.String r1 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r5, r1, r9)
        L_0x006a:
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver = r3
        L_0x006c:
            java.lang.reflect.Field r9 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x0111
            java.lang.Object r9 = r9.get(r0)     // Catch:{ IllegalAccessException -> 0x0075 }
            goto L_0x007c
        L_0x0075:
            r9 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r5, r0, r9)
            r9 = r4
        L_0x007c:
            if (r9 == 0) goto L_0x0111
            boolean r0 = p040o.AlertController$RecycleListView.IconCompatParcelizer
            if (r0 != 0) goto L_0x0098
            java.lang.Class r0 = r9.getClass()     // Catch:{ NoSuchFieldException -> 0x0090 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0090 }
            p040o.AlertController$RecycleListView.write = r0     // Catch:{ NoSuchFieldException -> 0x0090 }
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0090 }
            goto L_0x0096
        L_0x0090:
            r0 = move-exception
            java.lang.String r1 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r5, r1, r0)
        L_0x0096:
            p040o.AlertController$RecycleListView.IconCompatParcelizer = r3
        L_0x0098:
            java.lang.reflect.Field r0 = p040o.AlertController$RecycleListView.write
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r4 = r0.get(r9)     // Catch:{ IllegalAccessException -> 0x00a1 }
            goto L_0x00a7
        L_0x00a1:
            r9 = move-exception
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r5, r0, r9)
        L_0x00a7:
            if (r4 == 0) goto L_0x0111
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r4)
            goto L_0x0111
        L_0x00ad:
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            java.lang.String r6 = "Could not retrieve value from Resources#mDrawableCache"
            java.lang.String r7 = "Could not retrieve Resources#mDrawableCache field"
            if (r9 < r1) goto L_0x00e0
            boolean r9 = p040o.AlertController$RecycleListView.IconCompatParcelizer
            if (r9 != 0) goto L_0x00cd
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.reflect.Field r9 = r9.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x00c7 }
            p040o.AlertController$RecycleListView.write = r9     // Catch:{ NoSuchFieldException -> 0x00c7 }
            r9.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r9 = move-exception
            android.util.Log.e(r5, r7, r9)
        L_0x00cb:
            p040o.AlertController$RecycleListView.IconCompatParcelizer = r3
        L_0x00cd:
            java.lang.reflect.Field r9 = p040o.AlertController$RecycleListView.write
            if (r9 == 0) goto L_0x00da
            java.lang.Object r4 = r9.get(r0)     // Catch:{ IllegalAccessException -> 0x00d6 }
            goto L_0x00da
        L_0x00d6:
            r9 = move-exception
            android.util.Log.e(r5, r6, r9)
        L_0x00da:
            if (r4 == 0) goto L_0x0111
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r4)
            goto L_0x0111
        L_0x00e0:
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r9 < r1) goto L_0x0111
            boolean r9 = p040o.AlertController$RecycleListView.IconCompatParcelizer
            if (r9 != 0) goto L_0x00fc
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.reflect.Field r9 = r9.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x00f6 }
            p040o.AlertController$RecycleListView.write = r9     // Catch:{ NoSuchFieldException -> 0x00f6 }
            r9.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00f6 }
            goto L_0x00fa
        L_0x00f6:
            r9 = move-exception
            android.util.Log.e(r5, r7, r9)
        L_0x00fa:
            p040o.AlertController$RecycleListView.IconCompatParcelizer = r3
        L_0x00fc:
            java.lang.reflect.Field r9 = p040o.AlertController$RecycleListView.write
            if (r9 == 0) goto L_0x0111
            java.lang.Object r9 = r9.get(r0)     // Catch:{ IllegalAccessException -> 0x0108 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ IllegalAccessException -> 0x0108 }
            r4 = r9
            goto L_0x010c
        L_0x0108:
            r9 = move-exception
            android.util.Log.e(r5, r6, r9)
        L_0x010c:
            if (r4 == 0) goto L_0x0111
            r4.clear()
        L_0x0111:
            return r3
        L_0x0112:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.MediaSessionCompat$QueueItem(int):boolean");
    }

    private void setBackgroundResource() {
        if (this.ActionMenuItemView == null) {
            Context context = this.MediaBrowserCompat$MediaItem;
            if (AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver == null) {
                Context applicationContext = context.getApplicationContext();
                AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver = new AppCompatDialogFragment(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ActionMenuItemView = new C0012xa11d3055(this, AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    private boolean setCheckable() {
        if (this.setChecked) {
            Context context = this.MediaBrowserCompat$MediaItem;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$MediaItem.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    class write implements ActionMenuItemView.read {
        private ActionMenuItemView.read read;

        public write(ActionMenuItemView.read read2) {
            this.read = read2;
        }

        public boolean read(ActionMenuItemView actionMenuItemView, Menu menu) {
            return this.read.read(actionMenuItemView, menu);
        }

        public boolean IconCompatParcelizer(ActionMenuItemView actionMenuItemView, Menu menu) {
            return this.read.IconCompatParcelizer(actionMenuItemView, menu);
        }

        public boolean MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView actionMenuItemView, MenuItem menuItem) {
            return this.read.MediaBrowserCompat$CustomActionResultReceiver(actionMenuItemView, menuItem);
        }

        public void IconCompatParcelizer(ActionMenuItemView actionMenuItemView) {
            this.read.IconCompatParcelizer(actionMenuItemView);
            if (AppCompatDelegateImpl.this.read != null) {
                AppCompatDelegateImpl.this.PlaybackStateCompat.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.PlaybackStateCompat$CustomAction);
            }
            if (AppCompatDelegateImpl.this.IconCompatParcelizer != null) {
                AppCompatDelegateImpl.this.ParcelableVolumeInfo();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.MediaMetadataCompat = SwitchCompat.write(appCompatDelegateImpl.IconCompatParcelizer).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
                AppCompatDelegateImpl.this.MediaMetadataCompat.read((setSwitchTypeface) new setSwitchMinWidth() {
                    public void MediaBrowserCompat$ItemReceiver(View view) {
                        AppCompatDelegateImpl.this.IconCompatParcelizer.setVisibility(8);
                        if (AppCompatDelegateImpl.this.read != null) {
                            AppCompatDelegateImpl.this.read.dismiss();
                        } else if (AppCompatDelegateImpl.this.IconCompatParcelizer.getParent() instanceof View) {
                            SwitchCompat.setShortcut((View) AppCompatDelegateImpl.this.IconCompatParcelizer.getParent());
                        }
                        AppCompatDelegateImpl.this.IconCompatParcelizer.removeAllViews();
                        AppCompatDelegateImpl.this.MediaMetadataCompat.read((setSwitchTypeface) null);
                        AppCompatDelegateImpl.this.MediaMetadataCompat = null;
                    }
                });
            }
            if (AppCompatDelegateImpl.this.write != null) {
                AppCompatDelegateImpl.this.write.IconCompatParcelizer(AppCompatDelegateImpl.this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            AppCompatDelegateImpl.this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }

    final class RatingCompat implements setStackedBackground$MediaBrowserCompat$ItemReceiver {
        RatingCompat() {
        }

        public final void read(MenuItemImpl menuItemImpl, boolean z) {
            MenuItemImpl write = menuItemImpl.write();
            boolean z2 = write != menuItemImpl;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuItemImpl = write;
            }
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2 = appCompatDelegateImpl.MediaBrowserCompat$ItemReceiver((Menu) menuItemImpl);
            if (MediaBrowserCompat$ItemReceiver2 == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver2, write);
                AppCompatDelegateImpl.this.write(MediaBrowserCompat$ItemReceiver2, true);
                return;
            }
            AppCompatDelegateImpl.this.write(MediaBrowserCompat$ItemReceiver2, z);
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
            Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
            if (menuItemImpl != null || !AppCompatDelegateImpl.this.MediaBrowserCompat$SearchResultReceiver || (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = AppCompatDelegateImpl.this.mo74x50fd9e4a()) == null || AppCompatDelegateImpl.this.f1x50fd9e4a) {
                return true;
            }
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onMenuOpened(108, menuItemImpl);
            return true;
        }
    }

    final class read implements setStackedBackground$MediaBrowserCompat$ItemReceiver {
        read() {
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
            Window.Callback MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = AppCompatDelegateImpl.this.mo74x50fd9e4a();
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == null) {
                return true;
            }
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onMenuOpened(108, menuItemImpl);
            return true;
        }

        public final void read(MenuItemImpl menuItemImpl, boolean z) {
            AppCompatDelegateImpl.this.read(menuItemImpl);
        }
    }

    class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.write(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !IconCompatParcelizer((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.read(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
        }

        private boolean IconCompatParcelizer(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    class IconCompatParcelizer extends C1133x65c1ec57 {
        public void onContentChanged() {
        }

        IconCompatParcelizer(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.write(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.write(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuItemImpl)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuItemImpl menuItemImpl = menu instanceof MenuItemImpl ? (MenuItemImpl) menu : null;
            if (i == 0 && menuItemImpl == null) {
                return false;
            }
            if (menuItemImpl != null) {
                menuItemImpl.MediaSessionCompat$ResultReceiverWrapper = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuItemImpl != null) {
                menuItemImpl.MediaSessionCompat$ResultReceiverWrapper = false;
            }
            return onPreparePanel;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.RatingCompat(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.MediaMetadataCompat(i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.PlaybackStateCompat$CustomAction()) {
                return write(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode write(ActionMode.Callback callback) {
            setItemInvoker$MediaBrowserCompat$ItemReceiver setiteminvoker_mediabrowsercompat_itemreceiver = new setItemInvoker$MediaBrowserCompat$ItemReceiver(AppCompatDelegateImpl.this.MediaBrowserCompat$MediaItem, callback);
            ActionMenuItemView IconCompatParcelizer = AppCompatDelegateImpl.this.IconCompatParcelizer((ActionMenuItemView.read) setiteminvoker_mediabrowsercompat_itemreceiver);
            if (IconCompatParcelizer != null) {
                return setiteminvoker_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.PlaybackStateCompat$CustomAction() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return write(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            AppCompatDelegateImpl$MediaBrowserCompat$ItemReceiver write = AppCompatDelegateImpl.this.write(0, true);
            if (write == null || write.MediaSessionCompat$Token == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, write.MediaSessionCompat$Token, i);
            }
        }
    }
}
