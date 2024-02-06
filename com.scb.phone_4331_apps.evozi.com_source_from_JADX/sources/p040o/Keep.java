package p040o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import java.io.IOException;
import java.net.URI;
import java.security.PublicKey;
import java.util.Map;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import p040o.ActionMenuItemView;

/* renamed from: o.Keep */
public abstract class Keep {

    @Deprecated
    /* renamed from: o.Keep$read */
    public interface read extends SpinnerAdapter, getData {
        boolean IconCompatParcelizer();

        Map<String, PrepaidRequestMarketConductActivity> MediaBrowserCompat$CustomActionResultReceiver() throws MalformedChallengeException;

        addBoolean MediaBrowserCompat$ItemReceiver();

        PublicKey MediaBrowserCompat$MediaItem() throws IOException;

        URI MediaBrowserCompat$SearchResultReceiver() throws ProtocolException;

        boolean MediaDescriptionCompat();

        boolean MediaMetadataCompat();

        boolean MediaSessionCompat$ResultReceiverWrapper();

        boolean ParcelableVolumeInfo();

        InputDetailsActivity RatingCompat();

        C1133x65c1ec57 read();

        ManagePromptpayLandingActivity write() throws AuthenticationException;
    }

    public Context IconCompatParcelizer() {
        return null;
    }

    public abstract void IconCompatParcelizer(int i);

    public abstract int MediaBrowserCompat$CustomActionResultReceiver();

    public ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView.read read2) {
        return null;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(float f) {
    }

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence);

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

    public abstract void MediaBrowserCompat$ItemReceiver(int i);

    public abstract void MediaBrowserCompat$ItemReceiver(View view);

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
    }

    public boolean MediaBrowserCompat$ItemReceiver() {
        return false;
    }

    public abstract void MediaBrowserCompat$MediaItem();

    public boolean MediaBrowserCompat$SearchResultReceiver() {
        return false;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract void mo15750x50fd9e4a();

    public boolean MediaDescriptionCompat() {
        return false;
    }

    public void MediaMetadataCompat() {
    }

    public abstract void MediaSessionCompat$QueueItem();

    public void ParcelableVolumeInfo() {
    }

    public abstract void RatingCompat();

    public abstract int read();

    public void read(Drawable drawable) {
    }

    public void read(boolean z) {
    }

    public boolean read(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean read(KeyEvent keyEvent) {
        return false;
    }

    public void write(Configuration configuration) {
    }

    public void write(CharSequence charSequence) {
    }

    public void write(boolean z) {
    }

    public boolean write() {
        return false;
    }

    public void MediaSessionCompat$ResultReceiverWrapper() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: o.Keep$IconCompatParcelizer */
    public static class IconCompatParcelizer extends ViewGroup.MarginLayoutParams {
        public int write;

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.write = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBarLayout);
            this.write = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public IconCompatParcelizer(int i, int i2) {
            super(-2, -2);
            this.write = 0;
            this.write = 8388627;
        }

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer);
            this.write = 0;
            this.write = iconCompatParcelizer.write;
        }

        public IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.write = 0;
        }
    }
}
