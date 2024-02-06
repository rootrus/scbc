package p040o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p040o.ActionMenuItemView;
import p040o.ActionMenuView;
import p040o.AlertController$RecycleListView;
import p040o.Keep;

/* renamed from: o.AppCompatActivity */
public final class AppCompatActivity extends Keep implements ActionBarOverlayLayout.IconCompatParcelizer {
    private static final Interpolator Keep = new AccelerateInterpolator();
    private static final Interpolator PlaybackStateCompat$CustomAction = new DecelerateInterpolator();
    final setSwitchTypeface AlertController$RecycleListView = new setSwitchMinWidth() {
        public final void MediaBrowserCompat$ItemReceiver(View view) {
            AppCompatActivity.this.MediaBrowserCompat$SearchResultReceiver = null;
            AppCompatActivity.this.MediaBrowserCompat$CustomActionResultReceiver.requestLayout();
        }
    };
    private boolean AppCompatActivity;
    private boolean AppCompatDelegateImpl$ListMenuDecorView = true;
    private ArrayList<Keep.read> AppCompatDialogFragment = new ArrayList<>();
    private boolean AppCompatViewInflater;
    boolean IconCompatParcelizer = true;
    ActionBarContainer MediaBrowserCompat$CustomActionResultReceiver;
    IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    ActionMenuItemView.read MediaBrowserCompat$MediaItem;
    ListMenuItemView MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    ActionBarOverlayLayout f2532x50fd9e4a;
    ActionMenuItemView MediaDescriptionCompat;
    ActionBarContextView MediaMetadataCompat;
    boolean MediaSessionCompat$QueueItem;
    final setSwitchTypeface MediaSessionCompat$ResultReceiverWrapper = new setSwitchMinWidth() {
        public final void MediaBrowserCompat$ItemReceiver(View view) {
            if (AppCompatActivity.this.IconCompatParcelizer && AppCompatActivity.this.read != null) {
                AppCompatActivity.this.read.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                AppCompatActivity.this.MediaBrowserCompat$CustomActionResultReceiver.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            AppCompatActivity.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(8);
            AppCompatActivity.this.MediaBrowserCompat$CustomActionResultReceiver.setTransitioning(false);
            AppCompatActivity.this.MediaBrowserCompat$SearchResultReceiver = null;
            AppCompatActivity appCompatActivity = AppCompatActivity.this;
            ActionMenuItemView.read read = appCompatActivity.MediaBrowserCompat$MediaItem;
            if (read != null) {
                read.IconCompatParcelizer(appCompatActivity.MediaDescriptionCompat);
                appCompatActivity.MediaDescriptionCompat = null;
                appCompatActivity.MediaBrowserCompat$MediaItem = null;
            }
            if (AppCompatActivity.this.f2532x50fd9e4a != null) {
                SwitchCompat.setShortcut(AppCompatActivity.this.f2532x50fd9e4a);
            }
        }
    };
    boolean MediaSessionCompat$Token;
    boolean ParcelableVolumeInfo;
    private int PlaybackStateCompat = 0;
    setWindowCallback RatingCompat;
    View read;
    private boolean setBackgroundResource;
    private Context setCheckable;
    private boolean setChecked;
    private boolean setContentView;
    final CheckCaptureModule_GetProcessingParametersFactory setHasDecor = new CheckCaptureModule_GetProcessingParametersFactory() {
        public final void MediaBrowserCompat$ItemReceiver() {
            ((View) AppCompatActivity.this.MediaBrowserCompat$CustomActionResultReceiver.getParent()).invalidate();
        }
    };
    Context write;

    static boolean IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        return !z && !z2;
    }

    public AppCompatActivity(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        IconCompatParcelizer(decorView);
        if (!z) {
            this.read = decorView.findViewById(16908290);
        }
    }

    public AppCompatActivity(Dialog dialog) {
        new ArrayList();
        IconCompatParcelizer(dialog.getWindow().getDecorView());
    }

    private void IconCompatParcelizer(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.decor_content_parent);
        this.f2532x50fd9e4a = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.RatingCompat = read(view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar));
        this.MediaMetadataCompat = (ActionBarContextView) view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar_container);
        this.MediaBrowserCompat$CustomActionResultReceiver = actionBarContainer;
        setWindowCallback setwindowcallback = this.RatingCompat;
        if (setwindowcallback == null || this.MediaMetadataCompat == null || actionBarContainer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used ");
            sb.append("with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.write = setwindowcallback.IconCompatParcelizer();
        if ((this.RatingCompat.write() & 4) != 0) {
            this.setContentView = true;
        }
        AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver alertController$RecycleListView$MediaBrowserCompat$ItemReceiver = new AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(this.write);
        int i = alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read.getApplicationInfo().targetSdkVersion;
        MediaBrowserCompat$SearchResultReceiver(alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read.getResources().getBoolean(AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.write.obtainStyledAttributes((AttributeSet) null, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar, AlertController$RecycleListView.read.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_hideOnContentScroll, false)) {
            MediaSessionCompat$ResultReceiverWrapper();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$CustomActionResultReceiver, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private static setWindowCallback read(View view) {
        if (view instanceof setWindowCallback) {
            return (setWindowCallback) view;
        }
        if (view instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) view;
            if (toolbar.setHasDecor == null) {
                toolbar.setHasDecor = new ActionMenuView.OnMenuItemClickListener(toolbar, true);
            }
            return toolbar.setHasDecor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(float f) {
        SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$CustomActionResultReceiver, (float) BitmapDescriptorFactory.HUE_RED);
    }

    public final void write(Configuration configuration) {
        MediaBrowserCompat$SearchResultReceiver(new AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(this.write).read.getResources().getBoolean(AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.abc_action_bar_embed_tabs));
    }

    private void MediaBrowserCompat$SearchResultReceiver(boolean z) {
        this.AppCompatActivity = z;
        if (!z) {
            this.RatingCompat.read((ScrollingTabContainerView) null);
            this.MediaBrowserCompat$CustomActionResultReceiver.setTabContainer((ScrollingTabContainerView) null);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.setTabContainer((ScrollingTabContainerView) null);
            this.RatingCompat.read((ScrollingTabContainerView) null);
        }
        this.RatingCompat.MediaBrowserCompat$ItemReceiver(false);
        this.f2532x50fd9e4a.setHasNonEmbeddedTabs(false);
    }

    public final void read(int i) {
        this.PlaybackStateCompat = i;
    }

    public final void write(boolean z) {
        ListMenuItemView listMenuItemView;
        this.setChecked = z;
        if (!z && (listMenuItemView = this.MediaBrowserCompat$SearchResultReceiver) != null) {
            listMenuItemView.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void read(boolean z) {
        if (z != this.setBackgroundResource) {
            this.setBackgroundResource = z;
            int size = this.AppCompatDialogFragment.size();
            for (int i = 0; i < size; i++) {
                this.AppCompatDialogFragment.get(i);
            }
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        MediaBrowserCompat$ItemReceiver(0, 2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        MediaBrowserCompat$ItemReceiver(z ? 4 : 0, 4);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15750x50fd9e4a() {
        MediaBrowserCompat$ItemReceiver(8, 8);
    }

    public final void MediaBrowserCompat$MediaItem() {
        MediaBrowserCompat$ItemReceiver(16, 16);
    }

    public final void IconCompatParcelizer(int i) {
        this.RatingCompat.read((CharSequence) this.write.getString(i));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) {
        this.RatingCompat.read(charSequence);
    }

    public final void write(CharSequence charSequence) {
        this.RatingCompat.write(charSequence);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        if ((i & 4) != 0) {
            this.setContentView = true;
        }
        this.RatingCompat.IconCompatParcelizer(i);
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        int write2 = this.RatingCompat.write();
        if ((i2 & 4) != 0) {
            this.setContentView = true;
        }
        this.RatingCompat.IconCompatParcelizer((i & i2) | ((~i2) & write2));
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.RatingCompat.write();
    }

    public final ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView.read read2) {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read();
        }
        this.f2532x50fd9e4a.setHideOnContentScrollEnabled(false);
        this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(this.MediaMetadataCompat.getContext(), read2);
        if (!iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver()) {
            return null;
        }
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer2;
        iconCompatParcelizer2.RatingCompat();
        this.MediaMetadataCompat.IconCompatParcelizer(iconCompatParcelizer2);
        IconCompatParcelizer(true);
        this.MediaMetadataCompat.sendAccessibilityEvent(32);
        return iconCompatParcelizer2;
    }

    public final int read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getHeight();
    }

    public final void MediaMetadataCompat(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void PlaybackStateCompat$CustomAction() {
        if (this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = false;
            RatingCompat(true);
        }
    }

    public final void RatingCompat() {
        if (!this.MediaSessionCompat$QueueItem) {
            this.MediaSessionCompat$QueueItem = true;
            RatingCompat(false);
        }
    }

    public final void MediaSessionCompat$Token() {
        if (!this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = true;
            RatingCompat(true);
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        if (this.f2532x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver) {
            this.ParcelableVolumeInfo = true;
            this.f2532x50fd9e4a.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    private void RatingCompat(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.AppCompatViewInflater || (!this.MediaSessionCompat$QueueItem && !this.MediaSessionCompat$Token)) {
            if (!this.AppCompatDelegateImpl$ListMenuDecorView) {
                this.AppCompatDelegateImpl$ListMenuDecorView = true;
                ListMenuItemView listMenuItemView = this.MediaBrowserCompat$SearchResultReceiver;
                if (listMenuItemView != null) {
                    listMenuItemView.MediaBrowserCompat$ItemReceiver();
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                if (this.PlaybackStateCompat != 0 || (!this.setChecked && !z)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.setAlpha(1.0f);
                    this.MediaBrowserCompat$CustomActionResultReceiver.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    if (this.IconCompatParcelizer && (view2 = this.read) != null) {
                        view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    this.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((View) null);
                } else {
                    this.MediaBrowserCompat$CustomActionResultReceiver.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    float f = (float) (-this.MediaBrowserCompat$CustomActionResultReceiver.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.MediaBrowserCompat$CustomActionResultReceiver.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver.setTranslationY(f);
                    ListMenuItemView listMenuItemView2 = new ListMenuItemView();
                    setSwitchPadding MediaMetadataCompat2 = SwitchCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED);
                    MediaMetadataCompat2.read(this.setHasDecor);
                    listMenuItemView2.IconCompatParcelizer(MediaMetadataCompat2);
                    if (this.IconCompatParcelizer && (view3 = this.read) != null) {
                        view3.setTranslationY(f);
                        listMenuItemView2.IconCompatParcelizer(SwitchCompat.write(this.read).MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED));
                    }
                    listMenuItemView2.IconCompatParcelizer(PlaybackStateCompat$CustomAction);
                    listMenuItemView2.MediaBrowserCompat$CustomActionResultReceiver(250);
                    listMenuItemView2.write(this.AlertController$RecycleListView);
                    this.MediaBrowserCompat$SearchResultReceiver = listMenuItemView2;
                    listMenuItemView2.read();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2532x50fd9e4a;
                if (actionBarOverlayLayout != null) {
                    SwitchCompat.setShortcut(actionBarOverlayLayout);
                }
            }
        } else if (this.AppCompatDelegateImpl$ListMenuDecorView) {
            this.AppCompatDelegateImpl$ListMenuDecorView = false;
            ListMenuItemView listMenuItemView3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (listMenuItemView3 != null) {
                listMenuItemView3.MediaBrowserCompat$ItemReceiver();
            }
            if (this.PlaybackStateCompat != 0 || (!this.setChecked && !z)) {
                this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver((View) null);
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setAlpha(1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.setTransitioning(true);
            ListMenuItemView listMenuItemView4 = new ListMenuItemView();
            float f2 = (float) (-this.MediaBrowserCompat$CustomActionResultReceiver.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.MediaBrowserCompat$CustomActionResultReceiver.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            setSwitchPadding MediaMetadataCompat3 = SwitchCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat(f2);
            MediaMetadataCompat3.read(this.setHasDecor);
            listMenuItemView4.IconCompatParcelizer(MediaMetadataCompat3);
            if (this.IconCompatParcelizer && (view = this.read) != null) {
                listMenuItemView4.IconCompatParcelizer(SwitchCompat.write(view).MediaMetadataCompat(f2));
            }
            listMenuItemView4.IconCompatParcelizer(Keep);
            listMenuItemView4.MediaBrowserCompat$CustomActionResultReceiver(250);
            listMenuItemView4.write(this.MediaSessionCompat$ResultReceiverWrapper);
            this.MediaBrowserCompat$SearchResultReceiver = listMenuItemView4;
            listMenuItemView4.read();
        }
    }

    public final Context IconCompatParcelizer() {
        if (this.setCheckable == null) {
            TypedValue typedValue = new TypedValue();
            this.write.getTheme().resolveAttribute(AlertController$RecycleListView.read.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.setCheckable = new ContextThemeWrapper(this.write, i);
            } else {
                this.setCheckable = this.write;
            }
        }
        return this.setCheckable;
    }

    public final void read(Drawable drawable) {
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(drawable);
    }

    public final void ParcelableVolumeInfo() {
        this.RatingCompat.read((int) R.string.action_home_or_up_content_description);
    }

    public final void Keep() {
        ListMenuItemView listMenuItemView = this.MediaBrowserCompat$SearchResultReceiver;
        if (listMenuItemView != null) {
            listMenuItemView.MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
    }

    public final boolean write() {
        setWindowCallback setwindowcallback = this.RatingCompat;
        if (setwindowcallback == null || !setwindowcallback.MediaBrowserCompat$SearchResultReceiver()) {
            return false;
        }
        this.RatingCompat.MediaBrowserCompat$ItemReceiver();
        return true;
    }

    /* renamed from: o.AppCompatActivity$IconCompatParcelizer */
    public class IconCompatParcelizer extends ActionMenuItemView implements MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver {
        private final Context IconCompatParcelizer;
        final MenuItemImpl MediaBrowserCompat$ItemReceiver;
        private WeakReference<View> MediaBrowserCompat$MediaItem;
        private ActionMenuItemView.read RatingCompat;

        public IconCompatParcelizer(Context context, ActionMenuItemView.read read2) {
            this.IconCompatParcelizer = context;
            this.RatingCompat = read2;
            MenuItemImpl menuItemImpl = new MenuItemImpl(context);
            menuItemImpl.MediaBrowserCompat$ItemReceiver = 1;
            this.MediaBrowserCompat$ItemReceiver = menuItemImpl;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver((MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) this);
        }

        public final MenuInflater write() {
            return new setIcon(this.IconCompatParcelizer);
        }

        public final Menu MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public final void read() {
            if (AppCompatActivity.this.MediaBrowserCompat$ItemReceiver == this) {
                if (!AppCompatActivity.IconCompatParcelizer(AppCompatActivity.this.MediaSessionCompat$QueueItem, AppCompatActivity.this.MediaSessionCompat$Token, false)) {
                    AppCompatActivity.this.MediaDescriptionCompat = this;
                    AppCompatActivity.this.MediaBrowserCompat$MediaItem = this.RatingCompat;
                } else {
                    this.RatingCompat.IconCompatParcelizer(this);
                }
                this.RatingCompat = null;
                AppCompatActivity.this.IconCompatParcelizer(false);
                AppCompatActivity.this.MediaMetadataCompat.IconCompatParcelizer();
                AppCompatActivity.this.RatingCompat.MediaDescriptionCompat().sendAccessibilityEvent(32);
                AppCompatActivity.this.f2532x50fd9e4a.setHideOnContentScrollEnabled(AppCompatActivity.this.ParcelableVolumeInfo);
                AppCompatActivity.this.MediaBrowserCompat$ItemReceiver = null;
            }
        }

        public final void RatingCompat() {
            if (AppCompatActivity.this.MediaBrowserCompat$ItemReceiver == this) {
                MenuItemImpl menuItemImpl = this.MediaBrowserCompat$ItemReceiver;
                if (!menuItemImpl.PlaybackStateCompat$CustomAction) {
                    menuItemImpl.PlaybackStateCompat$CustomAction = true;
                    menuItemImpl.MediaSessionCompat$Token = false;
                    menuItemImpl.Keep = false;
                }
                try {
                    this.RatingCompat.IconCompatParcelizer(this, this.MediaBrowserCompat$ItemReceiver);
                } finally {
                    MenuItemImpl menuItemImpl2 = this.MediaBrowserCompat$ItemReceiver;
                    menuItemImpl2.PlaybackStateCompat$CustomAction = false;
                    if (menuItemImpl2.MediaSessionCompat$Token) {
                        menuItemImpl2.MediaSessionCompat$Token = false;
                        menuItemImpl2.IconCompatParcelizer(menuItemImpl2.Keep);
                    }
                }
            }
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            MenuItemImpl menuItemImpl = this.MediaBrowserCompat$ItemReceiver;
            if (!menuItemImpl.PlaybackStateCompat$CustomAction) {
                menuItemImpl.PlaybackStateCompat$CustomAction = true;
                menuItemImpl.MediaSessionCompat$Token = false;
                menuItemImpl.Keep = false;
            }
            try {
                return this.RatingCompat.read(this, this.MediaBrowserCompat$ItemReceiver);
            } finally {
                MenuItemImpl menuItemImpl2 = this.MediaBrowserCompat$ItemReceiver;
                menuItemImpl2.PlaybackStateCompat$CustomAction = false;
                if (menuItemImpl2.MediaSessionCompat$Token) {
                    menuItemImpl2.MediaSessionCompat$Token = false;
                    menuItemImpl2.IconCompatParcelizer(menuItemImpl2.Keep);
                }
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(View view) {
            AppCompatActivity.this.MediaMetadataCompat.setCustomView(view);
            this.MediaBrowserCompat$MediaItem = new WeakReference<>(view);
        }

        public final void IconCompatParcelizer(CharSequence charSequence) {
            AppCompatActivity.this.MediaMetadataCompat.setSubtitle(charSequence);
        }

        public final void read(CharSequence charSequence) {
            AppCompatActivity.this.MediaMetadataCompat.setTitle(charSequence);
        }

        public final void read(int i) {
            AppCompatActivity.this.MediaMetadataCompat.setTitle(AppCompatActivity.this.write.getResources().getString(i));
        }

        public final void IconCompatParcelizer(int i) {
            AppCompatActivity.this.MediaMetadataCompat.setSubtitle(AppCompatActivity.this.write.getResources().getString(i));
        }

        public final CharSequence MediaBrowserCompat$SearchResultReceiver() {
            return AppCompatActivity.this.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver;
        }

        public final CharSequence MediaMetadataCompat() {
            return AppCompatActivity.this.MediaMetadataCompat.MediaBrowserCompat$MediaItem;
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            super.MediaBrowserCompat$ItemReceiver(z);
            AppCompatActivity.this.MediaMetadataCompat.setTitleOptional(z);
        }

        public final boolean MediaBrowserCompat$MediaItem() {
            return AppCompatActivity.this.MediaMetadataCompat.MediaDescriptionCompat;
        }

        public final View IconCompatParcelizer() {
            WeakReference<View> weakReference = this.MediaBrowserCompat$MediaItem;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
            ActionMenuItemView.read read2 = this.RatingCompat;
            if (read2 != null) {
                return read2.MediaBrowserCompat$CustomActionResultReceiver(this, menuItem);
            }
            return false;
        }

        public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
            if (this.RatingCompat != null) {
                RatingCompat();
                AppCompatActivity.this.MediaMetadataCompat.write();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(view);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (!this.setContentView) {
            MediaBrowserCompat$ItemReceiver(z ? 4 : 0, 4);
        }
    }

    public final boolean read(int i, KeyEvent keyEvent) {
        MenuItemImpl menuItemImpl;
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        if (iconCompatParcelizer == null || (menuItemImpl = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menuItemImpl.setQwertyMode(z);
        return menuItemImpl.performShortcut(i, keyEvent, 0);
    }

    public final void IconCompatParcelizer(boolean z) {
        setSwitchPadding setswitchpadding;
        setSwitchPadding setswitchpadding2;
        if (z) {
            if (!this.AppCompatViewInflater) {
                this.AppCompatViewInflater = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2532x50fd9e4a;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                RatingCompat(false);
            }
        } else if (this.AppCompatViewInflater) {
            this.AppCompatViewInflater = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2532x50fd9e4a;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            RatingCompat(false);
        }
        if (SwitchCompat.setCheckable(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            if (z) {
                setswitchpadding = this.RatingCompat.IconCompatParcelizer(4, 100);
                setswitchpadding2 = this.MediaMetadataCompat.IconCompatParcelizer(0, 200);
            } else {
                setswitchpadding2 = this.RatingCompat.IconCompatParcelizer(0, 200);
                setswitchpadding = this.MediaMetadataCompat.IconCompatParcelizer(8, 100);
            }
            ListMenuItemView listMenuItemView = new ListMenuItemView();
            listMenuItemView.write(setswitchpadding, setswitchpadding2);
            listMenuItemView.read();
        } else if (z) {
            this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(4);
            this.MediaMetadataCompat.setVisibility(0);
        } else {
            this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(0);
            this.MediaMetadataCompat.setVisibility(8);
        }
    }
}
