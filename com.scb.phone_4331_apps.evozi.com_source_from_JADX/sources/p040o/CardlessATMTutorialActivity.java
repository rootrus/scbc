package p040o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.CardlessATMTutorialActivity */
public final class CardlessATMTutorialActivity implements RegistrationLivenessCheckActivity, Serializable {
    private transient ReadWriteLock MediaBrowserCompat$CustomActionResultReceiver = new ReentrantReadWriteLock();
    private final TreeSet<SplashActivity> read = new TreeSet<>(new GiftingTransferLandingActivity());

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.MediaBrowserCompat$CustomActionResultReceiver = new ReentrantReadWriteLock();
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity) {
        if (splashActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.writeLock().lock();
            try {
                this.read.remove(splashActivity);
                if (!splashActivity.MediaBrowserCompat$ItemReceiver(new Date())) {
                    this.read.add(splashActivity);
                }
            } finally {
                this.MediaBrowserCompat$CustomActionResultReceiver.writeLock().unlock();
            }
        }
    }

    public final List<SplashActivity> MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver.readLock().lock();
        try {
            return new ArrayList(this.read);
        } finally {
            this.MediaBrowserCompat$CustomActionResultReceiver.readLock().unlock();
        }
    }

    public final boolean write(Date date) {
        this.MediaBrowserCompat$CustomActionResultReceiver.writeLock().lock();
        try {
            Iterator<SplashActivity> it = this.read.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().MediaBrowserCompat$ItemReceiver(date)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        } finally {
            this.MediaBrowserCompat$CustomActionResultReceiver.writeLock().unlock();
        }
    }

    public final String toString() {
        this.MediaBrowserCompat$CustomActionResultReceiver.readLock().lock();
        try {
            return this.read.toString();
        } finally {
            this.MediaBrowserCompat$CustomActionResultReceiver.readLock().unlock();
        }
    }
}
