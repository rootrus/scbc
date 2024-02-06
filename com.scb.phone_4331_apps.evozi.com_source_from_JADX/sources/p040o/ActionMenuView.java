package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ActionMenuView */
public interface ActionMenuView {
    void setOnFitSystemWindowsListener(ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver actionMenuView$MediaBrowserCompat$CustomActionResultReceiver);

    /* renamed from: o.ActionMenuView$OnMenuItemClickListener */
    public final class OnMenuItemClickListener implements setWindowCallback {
        CharSequence IconCompatParcelizer;
        Window.Callback MediaBrowserCompat$CustomActionResultReceiver;
        private ActionMenuPresenter MediaBrowserCompat$ItemReceiver;
        private View MediaBrowserCompat$MediaItem;
        private CharSequence MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private Drawable f2528x50fd9e4a;
        private int MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private View MediaSessionCompat$QueueItem;
        private Drawable MediaSessionCompat$ResultReceiverWrapper;
        private Drawable MediaSessionCompat$Token;
        private CharSequence ParcelableVolumeInfo;
        private Drawable RatingCompat;
        Toolbar read;
        private boolean setHasDecor;
        boolean write;

        public OnMenuItemClickListener(Toolbar toolbar, boolean z) {
            this(toolbar, z, AlertController$RecycleListView.RatingCompat.abc_action_bar_up_description);
        }

        private OnMenuItemClickListener(Toolbar toolbar, boolean z, int i) {
            String str;
            int i2;
            Drawable drawable;
            this.MediaMetadataCompat = 0;
            this.read = toolbar;
            this.IconCompatParcelizer = toolbar.Keep;
            this.ParcelableVolumeInfo = toolbar.MediaSessionCompat$QueueItem;
            this.setHasDecor = this.IconCompatParcelizer != null;
            ImageButton imageButton = toolbar.RatingCompat;
            CharSequence charSequence = null;
            this.f2528x50fd9e4a = imageButton != null ? imageButton.getDrawable() : null;
            Context context = toolbar.getContext();
            AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes((AttributeSet) null, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar, AlertController$RecycleListView.read.actionBarStyle, 0));
            this.RatingCompat = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_homeAsUpIndicator);
            if (z) {
                CharSequence text = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_title);
                if (!TextUtils.isEmpty(text)) {
                    this.setHasDecor = true;
                    this.IconCompatParcelizer = text;
                    if ((this.MediaDescriptionCompat & 8) != 0) {
                        this.read.setTitle(text);
                    }
                }
                CharSequence text2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_subtitle);
                if (!TextUtils.isEmpty(text2)) {
                    this.ParcelableVolumeInfo = text2;
                    if ((this.MediaDescriptionCompat & 8) != 0) {
                        this.read.setSubtitle(text2);
                    }
                }
                Drawable MediaBrowserCompat$ItemReceiver2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_logo);
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$ItemReceiver2;
                    setHasDecor();
                }
                Drawable MediaBrowserCompat$ItemReceiver3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_icon);
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    this.MediaSessionCompat$Token = MediaBrowserCompat$ItemReceiver3;
                    setHasDecor();
                }
                if (this.f2528x50fd9e4a == null && (drawable = this.RatingCompat) != null) {
                    this.f2528x50fd9e4a = drawable;
                    PlaybackStateCompat();
                }
                IconCompatParcelizer(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_displayOptions, 0));
                int resourceId = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_customNavigationLayout, 0);
                if (resourceId != 0) {
                    MediaBrowserCompat$CustomActionResultReceiver(LayoutInflater.from(this.read.getContext()).inflate(resourceId, this.read, false));
                    IconCompatParcelizer(this.MediaDescriptionCompat | 16);
                }
                int layoutDimension = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getLayoutDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_height, 0);
                if (layoutDimension > 0) {
                    ViewGroup.LayoutParams layoutParams = this.read.getLayoutParams();
                    layoutParams.height = layoutDimension;
                    this.read.setLayoutParams(layoutParams);
                }
                int dimensionPixelOffset = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_contentInsetStart, -1);
                int dimensionPixelOffset2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_contentInsetEnd, -1);
                if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                    this.read.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
                }
                int resourceId2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_titleTextStyle, 0);
                if (resourceId2 != 0) {
                    Toolbar toolbar2 = this.read;
                    toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
                }
                int resourceId3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_subtitleTextStyle, 0);
                if (resourceId3 != 0) {
                    Toolbar toolbar3 = this.read;
                    toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
                }
                int resourceId4 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_popupTheme, 0);
                if (resourceId4 != 0) {
                    this.read.setPopupTheme(resourceId4);
                }
            } else {
                ImageButton imageButton2 = this.read.RatingCompat;
                if ((imageButton2 != null ? imageButton2.getDrawable() : null) != null) {
                    i2 = 15;
                    ImageButton imageButton3 = this.read.RatingCompat;
                    this.RatingCompat = imageButton3 != null ? imageButton3.getDrawable() : null;
                } else {
                    i2 = 11;
                }
                this.MediaDescriptionCompat = i2;
            }
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
            if (i != this.MediaMetadataCompat) {
                this.MediaMetadataCompat = i;
                ImageButton imageButton4 = this.read.RatingCompat;
                if (TextUtils.isEmpty(imageButton4 != null ? imageButton4.getContentDescription() : null)) {
                    int i3 = this.MediaMetadataCompat;
                    if (i3 == 0) {
                        str = null;
                    } else {
                        str = this.read.getContext().getString(i3);
                    }
                    this.MediaBrowserCompat$SearchResultReceiver = str;
                    PlaybackStateCompat$CustomAction();
                }
            }
            ImageButton imageButton5 = this.read.RatingCompat;
            this.MediaBrowserCompat$SearchResultReceiver = imageButton5 != null ? imageButton5.getContentDescription() : charSequence;
            this.read.setNavigationOnClickListener(new View.OnClickListener() {
                final setGroupDividerEnabled write = new setGroupDividerEnabled(OnMenuItemClickListener.this.read.getContext(), OnMenuItemClickListener.this.IconCompatParcelizer);

                public final void onClick(View view) {
                    if (OnMenuItemClickListener.this.MediaBrowserCompat$CustomActionResultReceiver != null && OnMenuItemClickListener.this.write) {
                        OnMenuItemClickListener.this.MediaBrowserCompat$CustomActionResultReceiver.onMenuItemSelected(0, this.write);
                    }
                }
            });
        }

        public final ViewGroup MediaDescriptionCompat() {
            return this.read;
        }

        public final Context IconCompatParcelizer() {
            return this.read.getContext();
        }

        public final boolean MediaBrowserCompat$SearchResultReceiver() {
            Toolbar.read read2 = this.read.MediaBrowserCompat$SearchResultReceiver;
            return (read2 == null || read2.MediaBrowserCompat$CustomActionResultReceiver == null) ? false : true;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            Toolbar.read read2 = this.read.MediaBrowserCompat$SearchResultReceiver;
            MenuItemImpl menuItemImpl = read2 == null ? null : read2.MediaBrowserCompat$CustomActionResultReceiver;
            if (menuItemImpl != null) {
                menuItemImpl.collapseActionView();
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(Window.Callback callback) {
            this.MediaBrowserCompat$CustomActionResultReceiver = callback;
        }

        public final void write(CharSequence charSequence) {
            if (!this.setHasDecor) {
                this.IconCompatParcelizer = charSequence;
                if ((this.MediaDescriptionCompat & 8) != 0) {
                    this.read.setTitle(charSequence);
                }
            }
        }

        public final void read(CharSequence charSequence) {
            this.setHasDecor = true;
            this.IconCompatParcelizer = charSequence;
            if ((this.MediaDescriptionCompat & 8) != 0) {
                this.read.setTitle(charSequence);
            }
        }

        public final void MediaSessionCompat$QueueItem() {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        }

        public final void ParcelableVolumeInfo() {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        }

        public final void write(Drawable drawable) {
            this.MediaSessionCompat$Token = drawable;
            setHasDecor();
        }

        private void setHasDecor() {
            Drawable drawable;
            int i = this.MediaDescriptionCompat;
            if ((i & 2) == 0) {
                drawable = null;
            } else if ((i & 1) != 0) {
                drawable = this.MediaSessionCompat$ResultReceiverWrapper;
                if (drawable == null) {
                    drawable = this.MediaSessionCompat$Token;
                }
            } else {
                drawable = this.MediaSessionCompat$Token;
            }
            this.read.setLogo(drawable);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.MediaMetadataCompat;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean read() {
            /*
                r2 = this;
                androidx.appcompat.widget.Toolbar r0 = r2.read
                int r1 = r0.getVisibility()
                if (r1 != 0) goto L_0x0012
                androidx.appcompat.widget.ActionMenuView r0 = r0.MediaMetadataCompat
                if (r0 == 0) goto L_0x0012
                boolean r0 = r0.IconCompatParcelizer
                if (r0 == 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ActionMenuView.OnMenuItemClickListener.read():boolean");
        }

        public final boolean MediaSessionCompat$ResultReceiverWrapper() {
            return this.read.mo758r_();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo15623x50fd9e4a() {
            /*
                r4 = this;
                androidx.appcompat.widget.Toolbar r0 = r4.read
                androidx.appcompat.widget.ActionMenuView r0 = r0.MediaMetadataCompat
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0021
                androidx.appcompat.widget.ActionMenuPresenter r0 = r0.read
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.ActionMenuPresenter$read r3 = r0.MediaBrowserCompat$MediaItem
                if (r3 != 0) goto L_0x0018
                boolean r0 = r0.IconCompatParcelizer()
                if (r0 != 0) goto L_0x0018
                r0 = r2
                goto L_0x0019
            L_0x0018:
                r0 = r1
            L_0x0019:
                if (r0 == 0) goto L_0x001d
                r0 = r1
                goto L_0x001e
            L_0x001d:
                r0 = r2
            L_0x001e:
                if (r0 == 0) goto L_0x0021
                goto L_0x0022
            L_0x0021:
                r1 = r2
            L_0x0022:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ActionMenuView.OnMenuItemClickListener.mo15623x50fd9e4a():boolean");
        }

        public final boolean AlertController$RecycleListView() {
            return this.read.IconCompatParcelizer();
        }

        public final boolean RatingCompat() {
            androidx.appcompat.widget.ActionMenuView actionMenuView = this.read.MediaMetadataCompat;
            if (actionMenuView != null) {
                ActionMenuPresenter actionMenuPresenter = actionMenuView.read;
                if (actionMenuPresenter != null && actionMenuPresenter.write()) {
                    return true;
                }
            }
            return false;
        }

        public final void MediaSessionCompat$Token() {
            this.write = true;
        }

        public final void MediaBrowserCompat$ItemReceiver(Menu menu, setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.read.getContext());
                this.MediaBrowserCompat$ItemReceiver = actionMenuPresenter;
                actionMenuPresenter.MediaSessionCompat$ResultReceiverWrapper = AlertController$RecycleListView.MediaDescriptionCompat.action_menu_presenter;
            }
            this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = setstackedbackground_mediabrowsercompat_itemreceiver;
            this.read.setMenu((MenuItemImpl) menu, this.MediaBrowserCompat$ItemReceiver);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            ActionMenuPresenter actionMenuPresenter;
            androidx.appcompat.widget.ActionMenuView actionMenuView = this.read.MediaMetadataCompat;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.read) != null) {
                actionMenuPresenter.write();
                ActionMenuPresenter$MediaBrowserCompat$ItemReceiver actionMenuPresenter$MediaBrowserCompat$ItemReceiver = actionMenuPresenter.read;
                if (actionMenuPresenter$MediaBrowserCompat$ItemReceiver != null) {
                    actionMenuPresenter$MediaBrowserCompat$ItemReceiver.read();
                }
            }
        }

        public final int write() {
            return this.MediaDescriptionCompat;
        }

        public final void IconCompatParcelizer(int i) {
            View view;
            int i2 = this.MediaDescriptionCompat ^ i;
            this.MediaDescriptionCompat = i;
            if (i2 != 0) {
                if ((i2 & 4) != 0) {
                    if ((i & 4) != 0) {
                        PlaybackStateCompat$CustomAction();
                    }
                    PlaybackStateCompat();
                }
                if ((i2 & 3) != 0) {
                    setHasDecor();
                }
                if ((i2 & 8) != 0) {
                    if ((i & 8) != 0) {
                        this.read.setTitle(this.IconCompatParcelizer);
                        this.read.setSubtitle(this.ParcelableVolumeInfo);
                    } else {
                        this.read.setTitle((CharSequence) null);
                        this.read.setSubtitle((CharSequence) null);
                    }
                }
                if ((i2 & 16) != 0 && (view = this.MediaBrowserCompat$MediaItem) != null) {
                    if ((i & 16) != 0) {
                        this.read.addView(view);
                    } else {
                        this.read.removeView(view);
                    }
                }
            }
        }

        public final void read(ScrollingTabContainerView scrollingTabContainerView) {
            Toolbar toolbar;
            View view = this.MediaSessionCompat$QueueItem;
            if (view != null && view.getParent() == (toolbar = this.read)) {
                toolbar.removeView(this.MediaSessionCompat$QueueItem);
            }
            this.MediaSessionCompat$QueueItem = null;
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            this.read.setCollapsible(z);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
            View view2 = this.MediaBrowserCompat$MediaItem;
            if (!(view2 == null || (this.MediaDescriptionCompat & 16) == 0)) {
                this.read.removeView(view2);
            }
            this.MediaBrowserCompat$MediaItem = view;
            if (view != null && (this.MediaDescriptionCompat & 16) != 0) {
                this.read.addView(view);
            }
        }

        public final setSwitchPadding IconCompatParcelizer(final int i, long j) {
            return SwitchCompat.write(this.read).IconCompatParcelizer(i == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$ItemReceiver(j).read((setSwitchTypeface) new setSwitchMinWidth() {
                private boolean read = false;

                public final void write(View view) {
                    OnMenuItemClickListener.this.read.setVisibility(0);
                }

                public final void MediaBrowserCompat$ItemReceiver(View view) {
                    if (!this.read) {
                        OnMenuItemClickListener.this.read.setVisibility(i);
                    }
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
                    this.read = true;
                }
            });
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
            this.f2528x50fd9e4a = drawable;
            PlaybackStateCompat();
        }

        private void PlaybackStateCompat() {
            if ((this.MediaDescriptionCompat & 4) != 0) {
                Toolbar toolbar = this.read;
                Drawable drawable = this.f2528x50fd9e4a;
                if (drawable == null) {
                    drawable = this.RatingCompat;
                }
                toolbar.setNavigationIcon(drawable);
                return;
            }
            this.read.setNavigationIcon((Drawable) null);
        }

        private void PlaybackStateCompat$CustomAction() {
            if ((this.MediaDescriptionCompat & 4) == 0) {
                return;
            }
            if (TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver)) {
                this.read.setNavigationContentDescription(this.MediaMetadataCompat);
            } else {
                this.read.setNavigationContentDescription(this.MediaBrowserCompat$SearchResultReceiver);
            }
        }

        public final int MediaBrowserCompat$MediaItem() {
            return this.read.getHeight();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            this.read.setVisibility(i);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver, MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) {
            this.read.setMenuCallbacks(setstackedbackground_mediabrowsercompat_itemreceiver, menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final Menu MediaMetadataCompat() {
            return this.read.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            Drawable drawable;
            if (i != 0) {
                drawable = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.read.getContext(), i);
            } else {
                drawable = null;
            }
            this.MediaSessionCompat$Token = drawable;
            setHasDecor();
        }

        public final void write(int i) {
            Drawable drawable;
            if (i != 0) {
                drawable = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.read.getContext(), i);
            } else {
                drawable = null;
            }
            this.MediaSessionCompat$ResultReceiverWrapper = drawable;
            setHasDecor();
        }

        public final void read(int i) {
            this.MediaBrowserCompat$SearchResultReceiver = this.read.getContext().getString(R.string.action_home_or_up_content_description);
            PlaybackStateCompat$CustomAction();
        }
    }
}
