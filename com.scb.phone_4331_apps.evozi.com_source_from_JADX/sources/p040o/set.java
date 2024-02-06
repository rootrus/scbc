package p040o;

import java.io.Serializable;
import p040o.loadTranslate;

/* renamed from: o.set */
final class set extends loadTranslate {
    private final loadTranslate.read MediaBrowserCompat$ItemReceiver;
    private final loadTranslate.IconCompatParcelizer write;

    /* renamed from: o.set$read */
    public static final class read extends loadTranslate.write {
        private loadTranslate.read MediaBrowserCompat$ItemReceiver;
        private loadTranslate.IconCompatParcelizer read;

        public final loadTranslate.write MediaBrowserCompat$ItemReceiver(loadTranslate.read read2) {
            this.MediaBrowserCompat$ItemReceiver = read2;
            return this;
        }

        public final loadTranslate.write MediaBrowserCompat$ItemReceiver(loadTranslate.IconCompatParcelizer iconCompatParcelizer) {
            this.read = iconCompatParcelizer;
            return this;
        }

        public final loadTranslate IconCompatParcelizer() {
            return new set(this.MediaBrowserCompat$ItemReceiver, this.read);
        }
    }

    /* synthetic */ set(loadTranslate.read read2, loadTranslate.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = read2;
        this.write = iconCompatParcelizer;
    }

    public final loadTranslate.read MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof loadTranslate)) {
            return false;
        }
        loadTranslate.read read2 = this.MediaBrowserCompat$ItemReceiver;
        if (read2 != null ? read2.equals(((set) obj).MediaBrowserCompat$ItemReceiver) : ((set) obj).MediaBrowserCompat$ItemReceiver == null) {
            loadTranslate.IconCompatParcelizer iconCompatParcelizer = this.write;
            if (iconCompatParcelizer == null) {
                if (((set) obj).write == null) {
                    return true;
                }
            } else if (iconCompatParcelizer.equals(((set) obj).write)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        loadTranslate.read read2 = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = read2 == null ? 0 : read2.hashCode();
        loadTranslate.IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            i = iconCompatParcelizer.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkConnectionInfo{networkType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mobileSubtype=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final loadTranslate.IconCompatParcelizer write() {
        return this.write;
    }

    /* renamed from: o.set$default  reason: invalid class name */
    public final class Cdefault<T> {
        private static final Object IconCompatParcelizer = new Serializable() {
            public final String toString() {
                return "Notification=>Completed";
            }
        };
        private static final Object MediaBrowserCompat$ItemReceiver = new Serializable() {
            public final String toString() {
                return "Notification=>NULL";
            }
        };
        private static final Cdefault write = new Cdefault();

        private Cdefault() {
        }

        public static <T> Cdefault<T> IconCompatParcelizer() {
            return write;
        }

        /* renamed from: o.set$default$write */
        static class write implements Serializable {
            final Throwable IconCompatParcelizer;

            public write(Throwable th) {
                this.IconCompatParcelizer = th;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Notification=>Error:");
                sb.append(this.IconCompatParcelizer);
                return sb.toString();
            }
        }

        public static Object MediaBrowserCompat$CustomActionResultReceiver(T t) {
            return t == null ? MediaBrowserCompat$ItemReceiver : t;
        }

        public static Object MediaBrowserCompat$ItemReceiver() {
            return IconCompatParcelizer;
        }

        public static Object IconCompatParcelizer(Throwable th) {
            return new write(th);
        }

        public static boolean MediaBrowserCompat$CustomActionResultReceiver(CustomCheckboxGroupView<? super T> customCheckboxGroupView, Object obj) {
            if (obj == IconCompatParcelizer) {
                customCheckboxGroupView.MediaBrowserCompat$CustomActionResultReceiver();
                return true;
            } else if (obj == MediaBrowserCompat$ItemReceiver) {
                customCheckboxGroupView.IconCompatParcelizer(null);
                return false;
            } else if (obj == null) {
                throw new IllegalArgumentException("The lite notification can not be null");
            } else if (obj.getClass() == write.class) {
                customCheckboxGroupView.IconCompatParcelizer(((write) obj).IconCompatParcelizer);
                return true;
            } else {
                customCheckboxGroupView.IconCompatParcelizer(obj);
                return false;
            }
        }

        public static T write(Object obj) {
            if (obj == MediaBrowserCompat$ItemReceiver) {
                return null;
            }
            return obj;
        }
    }
}
