package p040o;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.requireHost */
public final class requireHost {
    public final requireHost$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new requireHost$MediaBrowserCompat$CustomActionResultReceiver();
    public final Map<String, IconCompatParcelizer> read = new HashMap();

    public final void write(String str) {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (this) {
            IconCompatParcelizer iconCompatParcelizer2 = this.read.get(str);
            if (iconCompatParcelizer2 != null) {
                iconCompatParcelizer = iconCompatParcelizer2;
                if (iconCompatParcelizer.read > 0) {
                    iconCompatParcelizer.read--;
                    if (iconCompatParcelizer.read == 0) {
                        IconCompatParcelizer remove = this.read.remove(str);
                        if (remove.equals(iconCompatParcelizer)) {
                            this.IconCompatParcelizer.IconCompatParcelizer(remove);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Removed the wrong lock, expected to remove: ");
                            sb.append(iconCompatParcelizer);
                            sb.append(", but actually removed: ");
                            sb.append(remove);
                            sb.append(", safeKey: ");
                            sb.append(str);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot release a lock that is not held, safeKey: ");
                    sb2.append(str);
                    sb2.append(", interestedThreads: ");
                    sb2.append(iconCompatParcelizer.read);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        iconCompatParcelizer.IconCompatParcelizer.unlock();
    }

    /* renamed from: o.requireHost$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        public final Lock IconCompatParcelizer = new ReentrantLock();
        public int read;

        IconCompatParcelizer() {
        }
    }
}
