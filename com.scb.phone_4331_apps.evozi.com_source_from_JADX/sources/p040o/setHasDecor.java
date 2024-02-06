package p040o;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.Toolbar;

/* renamed from: o.setHasDecor */
public abstract class setHasDecor {
    private static int IconCompatParcelizer = -1;

    public abstract void IconCompatParcelizer();

    public abstract void IconCompatParcelizer(int i);

    public abstract void IconCompatParcelizer(Bundle bundle);

    public abstract void IconCompatParcelizer(View view, ViewGroup.LayoutParams layoutParams);

    public abstract Keep MediaBrowserCompat$CustomActionResultReceiver();

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(Configuration configuration);

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(View view);

    public abstract <T extends View> T MediaBrowserCompat$ItemReceiver(int i);

    public abstract void MediaBrowserCompat$ItemReceiver(Bundle bundle);

    public abstract void MediaBrowserCompat$ItemReceiver(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void MediaBrowserCompat$ItemReceiver(CharSequence charSequence);

    public abstract void MediaBrowserCompat$MediaItem();

    public abstract void MediaBrowserCompat$SearchResultReceiver();

    public abstract void MediaDescriptionCompat();

    public abstract void MediaMetadataCompat();

    public abstract void RatingCompat();

    public abstract MenuInflater read();

    public abstract void read(Toolbar toolbar);

    public abstract void write(Bundle bundle);

    public abstract boolean write();

    public abstract boolean write(int i);

    public static setHasDecor MediaBrowserCompat$ItemReceiver(Activity activity, PlaybackStateCompat playbackStateCompat) {
        return new AppCompatDelegateImpl(activity, activity.getWindow(), playbackStateCompat);
    }

    public static setHasDecor read(Dialog dialog, PlaybackStateCompat playbackStateCompat) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), playbackStateCompat);
    }

    public static int MediaBrowserCompat$ItemReceiver() {
        return IconCompatParcelizer;
    }
}
