package p040o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.ActionMenuView;
import p040o.Keep;

/* renamed from: o.setContentView */
public final class setContentView extends Keep {
    public Window.Callback IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private final Toolbar.IconCompatParcelizer MediaBrowserCompat$MediaItem = new Toolbar.IconCompatParcelizer() {
        public final boolean read(MenuItem menuItem) {
            return setContentView.this.IconCompatParcelizer.onMenuItemSelected(0, menuItem);
        }
    };
    private ArrayList<Keep.read> MediaBrowserCompat$SearchResultReceiver = new ArrayList<>();
    private final Runnable MediaDescriptionCompat = new Runnable() {
        public final void run() {
            setContentView setcontentview = setContentView.this;
            Menu MediaSessionCompat$Token = setcontentview.MediaSessionCompat$Token();
            MenuItemImpl menuItemImpl = MediaSessionCompat$Token instanceof MenuItemImpl ? (MenuItemImpl) MediaSessionCompat$Token : null;
            if (menuItemImpl != null && !menuItemImpl.PlaybackStateCompat$CustomAction) {
                menuItemImpl.PlaybackStateCompat$CustomAction = true;
                menuItemImpl.MediaSessionCompat$Token = false;
                menuItemImpl.Keep = false;
            }
            try {
                MediaSessionCompat$Token.clear();
                if (!setcontentview.IconCompatParcelizer.onCreatePanelMenu(0, MediaSessionCompat$Token) || !setcontentview.IconCompatParcelizer.onPreparePanel(0, (View) null, MediaSessionCompat$Token)) {
                    MediaSessionCompat$Token.clear();
                }
                if (menuItemImpl == null) {
                    return;
                }
            } finally {
                if (menuItemImpl != null) {
                    menuItemImpl.PlaybackStateCompat$CustomAction = false;
                    if (menuItemImpl.MediaSessionCompat$Token) {
                        menuItemImpl.MediaSessionCompat$Token = false;
                        menuItemImpl.IconCompatParcelizer(menuItemImpl.Keep);
                    }
                }
            }
        }
    };
    setWindowCallback read;
    private boolean write;

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
    }

    public final void write(boolean z) {
    }

    public setContentView(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.read = new ActionMenuView.OnMenuItemClickListener(toolbar, false);
        read read2 = new read(callback);
        this.IconCompatParcelizer = read2;
        this.read.MediaBrowserCompat$ItemReceiver((Window.Callback) read2);
        toolbar.setOnMenuItemClickListener(this.MediaBrowserCompat$MediaItem);
        this.read.write(charSequence);
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        Keep.IconCompatParcelizer iconCompatParcelizer = new Keep.IconCompatParcelizer(-2, -2);
        if (view != null) {
            view.setLayoutParams(iconCompatParcelizer);
        }
        this.read.MediaBrowserCompat$CustomActionResultReceiver(view);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(float f) {
        SwitchCompat.IconCompatParcelizer((View) this.read.MediaDescriptionCompat(), (float) BitmapDescriptorFactory.HUE_RED);
    }

    public final Context IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public final void read(Drawable drawable) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(drawable);
    }

    public final void ParcelableVolumeInfo() {
        this.read.read((int) R.string.action_home_or_up_content_description);
    }

    public final void write(Configuration configuration) {
        super.write(configuration);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) {
        this.read.read(charSequence);
    }

    public final void IconCompatParcelizer(int i) {
        setWindowCallback setwindowcallback = this.read;
        setwindowcallback.read(i != 0 ? setwindowcallback.IconCompatParcelizer().getText(i) : null);
    }

    public final void write(CharSequence charSequence) {
        this.read.write(charSequence);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.write();
    }

    public final int read() {
        return this.read.MediaBrowserCompat$MediaItem();
    }

    public final void RatingCompat() {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(8);
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.read.AlertController$RecycleListView();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.read.RatingCompat();
    }

    public final boolean MediaDescriptionCompat() {
        this.read.MediaDescriptionCompat().removeCallbacks(this.MediaDescriptionCompat);
        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.read.MediaDescriptionCompat(), this.MediaDescriptionCompat);
        return true;
    }

    public final boolean write() {
        if (!this.read.MediaBrowserCompat$SearchResultReceiver()) {
            return false;
        }
        this.read.MediaBrowserCompat$ItemReceiver();
        return true;
    }

    public final boolean read(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.read.AlertController$RecycleListView();
        }
        return true;
    }

    public final boolean read(int i, KeyEvent keyEvent) {
        Menu MediaSessionCompat$Token = MediaSessionCompat$Token();
        if (MediaSessionCompat$Token == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        MediaSessionCompat$Token.setQwertyMode(z);
        return MediaSessionCompat$Token.performShortcut(i, keyEvent, 0);
    }

    /* access modifiers changed from: package-private */
    public final void MediaMetadataCompat() {
        this.read.MediaDescriptionCompat().removeCallbacks(this.MediaDescriptionCompat);
    }

    public final void read(boolean z) {
        if (z != this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = z;
            int size = this.MediaBrowserCompat$SearchResultReceiver.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompat$SearchResultReceiver.get(i);
            }
        }
    }

    /* renamed from: o.setContentView$read */
    class read extends C1133x65c1ec57 {
        public read(Window.Callback callback) {
            super(callback);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !setContentView.this.MediaBrowserCompat$CustomActionResultReceiver) {
                setContentView.this.read.MediaSessionCompat$Token();
                setContentView.this.MediaBrowserCompat$CustomActionResultReceiver = true;
            }
            return onPreparePanel;
        }

        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(setContentView.this.read.IconCompatParcelizer());
            }
            return super.onCreatePanelView(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final Menu MediaSessionCompat$Token() {
        if (!this.write) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(new setContentView$MediaBrowserCompat$ItemReceiver(this), new setContentView$MediaBrowserCompat$CustomActionResultReceiver(this));
            this.write = true;
        }
        return this.read.MediaMetadataCompat();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.read.IconCompatParcelizer(((z ? 4 : 0) & 4) | (this.read.write() & -5));
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.read.IconCompatParcelizer(i | (this.read.write() & 0));
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.read.IconCompatParcelizer((this.read.write() & -17) | 16);
    }

    public final void MediaSessionCompat$QueueItem() {
        this.read.IconCompatParcelizer((this.read.write() & -3) | 0);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15750x50fd9e4a() {
        this.read.IconCompatParcelizer((this.read.write() & -9) | 8);
    }
}
