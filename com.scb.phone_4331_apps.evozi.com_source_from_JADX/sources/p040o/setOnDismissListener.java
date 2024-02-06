package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p040o.AlertController$RecycleListView;
import p040o.write;

/* renamed from: o.setOnDismissListener */
public class setOnDismissListener {
    private final MediaBrowserCompat$ItemReceiver read;
    private final ComponentName write;

    setOnDismissListener(MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver, ComponentName componentName) {
        this.read = mediaBrowserCompat$ItemReceiver;
        this.write = componentName;
    }

    public static boolean IconCompatParcelizer(Context context, String str, setDropDownBackgroundResource setdropdownbackgroundresource) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, setdropdownbackgroundresource, 33);
    }

    public final boolean read() {
        try {
            return this.read.IconCompatParcelizer(0);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final AlertController$RecycleListView.RatingCompat MediaBrowserCompat$ItemReceiver(final AlertController$RecycleListView.RatingCompat ratingCompat) {
        C15191 r0 = new write.IconCompatParcelizer() {
            private Handler IconCompatParcelizer = new Handler(Looper.getMainLooper());

            public final void write(final int i, final Bundle bundle) {
                if (ratingCompat != null) {
                    this.IconCompatParcelizer.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void IconCompatParcelizer(final String str, final Bundle bundle) throws RemoteException {
                if (ratingCompat != null) {
                    this.IconCompatParcelizer.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void read(final Bundle bundle) throws RemoteException {
                if (ratingCompat != null) {
                    this.IconCompatParcelizer.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void write(final String str, final Bundle bundle) throws RemoteException {
                if (ratingCompat != null) {
                    this.IconCompatParcelizer.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void read(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                if (ratingCompat != null) {
                    final int i2 = i;
                    final Uri uri2 = uri;
                    final boolean z2 = z;
                    final Bundle bundle2 = bundle;
                    this.IconCompatParcelizer.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }
        };
        try {
            if (!this.read.MediaBrowserCompat$ItemReceiver(r0)) {
                return null;
            }
            return new AlertController$RecycleListView.RatingCompat(this.read, r0, this.write);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
