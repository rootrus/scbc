package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.PrintWriter;

/* renamed from: o.setTitleMarginTop */
public abstract class setTitleMarginTop<E> extends ViewStubCompat {
    public final Context IconCompatParcelizer;
    final Handler MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private final Activity read;
    public final setLayoutResource write;

    public void IconCompatParcelizer(String str, PrintWriter printWriter, String[] strArr) {
    }

    public boolean IconCompatParcelizer() {
        return true;
    }

    public abstract E MediaBrowserCompat$CustomActionResultReceiver();

    public void MediaBrowserCompat$ItemReceiver(Fragment fragment, String[] strArr, int i) {
    }

    public boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public boolean MediaBrowserCompat$ItemReceiver(String str) {
        return false;
    }

    public void MediaBrowserCompat$MediaItem() {
    }

    public boolean MediaMetadataCompat() {
        return true;
    }

    public View read(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void write(Fragment fragment) {
    }

    public setTitleMarginTop(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler);
    }

    private setTitleMarginTop(Activity activity, Context context, Handler handler) {
        this.write = new setLayoutResource();
        this.read = activity;
        if (context != null) {
            this.IconCompatParcelizer = context;
            if (handler != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = handler;
                this.MediaBrowserCompat$ItemReceiver = 0;
                return;
            }
            throw new NullPointerException("handler == null");
        }
        throw new NullPointerException("context == null");
    }

    public LayoutInflater read() {
        return LayoutInflater.from(this.IconCompatParcelizer);
    }

    public void write(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.IconCompatParcelizer.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void read(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(this.read, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public int write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final Activity RatingCompat() {
        return this.read;
    }

    public final Context MediaBrowserCompat$SearchResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final Handler MediaDescriptionCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
