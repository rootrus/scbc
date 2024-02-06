package p040o;

import android.os.Build;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.ActivityChooserView */
public class ActivityChooserView {
    public static void MediaBrowserCompat$ItemReceiver(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            setPopupTheme.read(view, charSequence);
        }
    }

    /* renamed from: o.ActivityChooserView$InnerLayout */
    public class InnerLayout<K, V> implements Iterable<Map.Entry<K, V>> {
        public WeakHashMap<MediaDescriptionCompat<K, V>, Boolean> IconCompatParcelizer = new WeakHashMap<>();
        public ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> MediaBrowserCompat$ItemReceiver;
        public int read = 0;
        public ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> write;

        /* renamed from: o.ActivityChooserView$InnerLayout$MediaDescriptionCompat */
        interface MediaDescriptionCompat<K, V> {
            /* renamed from: a_ */
            void mo15650a_(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver);
        }

        /* access modifiers changed from: protected */
        public ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> IconCompatParcelizer(K k) {
            ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
            while (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver != null && !activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.equals(k)) {
                activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.write;
            }
            return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
        }

        public V IconCompatParcelizer(K k, V v) {
            ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver IconCompatParcelizer2 = IconCompatParcelizer(k);
            if (IconCompatParcelizer2 != null) {
                return IconCompatParcelizer2.IconCompatParcelizer;
            }
            read(k, v);
            return null;
        }

        /* access modifiers changed from: protected */
        public final ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> read(K k, V v) {
            ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = new ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<>(k, v);
            this.read++;
            ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 = this.write;
            if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 == null) {
                this.MediaBrowserCompat$ItemReceiver = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
                this.write = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
                return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
            }
            activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2.write = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
            activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.read = this.write;
            this.write = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
            return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
        }

        public V read(K k) {
            ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver IconCompatParcelizer2 = IconCompatParcelizer(k);
            if (IconCompatParcelizer2 == null) {
                return null;
            }
            this.read--;
            if (!this.IconCompatParcelizer.isEmpty()) {
                for (MediaDescriptionCompat<K, V> a_ : this.IconCompatParcelizer.keySet()) {
                    a_.mo15650a_(IconCompatParcelizer2);
                }
            }
            if (IconCompatParcelizer2.read != null) {
                IconCompatParcelizer2.read.write = IconCompatParcelizer2.write;
            } else {
                this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.write;
            }
            if (IconCompatParcelizer2.write != null) {
                IconCompatParcelizer2.write.read = IconCompatParcelizer2.read;
            } else {
                this.write = IconCompatParcelizer2.read;
            }
            IconCompatParcelizer2.write = null;
            IconCompatParcelizer2.read = null;
            return IconCompatParcelizer2.IconCompatParcelizer;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            C1131xaa6a127a activityChooserView$InnerLayout$MediaBrowserCompat$CustomActionResultReceiver = new C1131xaa6a127a(this.MediaBrowserCompat$ItemReceiver, this.write);
            this.IconCompatParcelizer.put(activityChooserView$InnerLayout$MediaBrowserCompat$CustomActionResultReceiver, Boolean.FALSE);
            return activityChooserView$InnerLayout$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InnerLayout)) {
                return false;
            }
            InnerLayout innerLayout = (InnerLayout) obj;
            if (this.read != innerLayout.read) {
                return false;
            }
            Iterator it = iterator();
            Iterator it2 = innerLayout.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object next = it2.next();
                if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                    return false;
                }
            }
            if (it.hasNext() || it2.hasNext()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((Map.Entry) it.next()).hashCode();
            }
            return i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Iterator it = iterator();
            while (it.hasNext()) {
                sb.append(((Map.Entry) it.next()).toString());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        /* renamed from: o.ActivityChooserView$InnerLayout$read */
        static abstract class read<K, V> implements Iterator<Map.Entry<K, V>>, MediaDescriptionCompat<K, V> {
            private ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> MediaBrowserCompat$ItemReceiver;
            private ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> read;

            /* access modifiers changed from: package-private */
            public abstract ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> IconCompatParcelizer(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver);

            /* access modifiers changed from: package-private */
            public abstract ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> write(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver);

            read(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver, ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2) {
                this.read = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2;
                this.MediaBrowserCompat$ItemReceiver = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
            }

            public boolean hasNext() {
                return this.MediaBrowserCompat$ItemReceiver != null;
            }

            /* renamed from: a_ */
            public final void mo15650a_(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) {
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 = null;
                if (this.read == activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver && activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver == this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$ItemReceiver = null;
                    this.read = null;
                }
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 = this.read;
                if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 == activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) {
                    this.read = IconCompatParcelizer(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3);
                }
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver4 = this.MediaBrowserCompat$ItemReceiver;
                if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver4 == activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) {
                    ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver5 = this.read;
                    if (!(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver4 == activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver5 || activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver5 == null)) {
                        activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 = write(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver4);
                    }
                    this.MediaBrowserCompat$ItemReceiver = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2;
                }
            }

            public /* synthetic */ Object next() {
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver;
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 = this.read;
                if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 == activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 || activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 == null) {
                    activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = null;
                } else {
                    activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = write(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2);
                }
                this.MediaBrowserCompat$ItemReceiver = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver;
                return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2;
            }
        }

        /* renamed from: o.ActivityChooserView$InnerLayout$IconCompatParcelizer */
        public static class IconCompatParcelizer<K, V> extends read<K, V> {
            public IconCompatParcelizer(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver, ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2) {
                super(activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver, activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2);
            }

            /* access modifiers changed from: package-private */
            public final ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> write(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) {
                return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.read;
            }

            /* access modifiers changed from: package-private */
            public final ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> IconCompatParcelizer(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) {
                return activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.write;
            }
        }

        /* renamed from: o.ActivityChooserView$InnerLayout$write */
        public class write implements Iterator<Map.Entry<K, V>>, MediaDescriptionCompat<K, V> {
            private ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> IconCompatParcelizer;
            private boolean MediaBrowserCompat$CustomActionResultReceiver = true;

            public write() {
            }

            /* renamed from: a_ */
            public final void mo15650a_(ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver) {
                ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer;
                if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver == activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2) {
                    ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver2.read;
                    this.IconCompatParcelizer = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3;
                    this.MediaBrowserCompat$CustomActionResultReceiver = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver3 == null;
                }
            }

            public final boolean hasNext() {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                    ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
                    if (activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver == null || activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.write == null) {
                        return false;
                    }
                    return true;
                } else if (InnerLayout.this.MediaBrowserCompat$ItemReceiver == null) {
                    return false;
                } else {
                    return true;
                }
            }

            public final /* bridge */ /* synthetic */ Object next() {
                if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = false;
                    this.IconCompatParcelizer = InnerLayout.this.MediaBrowserCompat$ItemReceiver;
                } else {
                    ActivityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver<K, V> activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver != null ? activityChooserView$InnerLayout$MediaBrowserCompat$ItemReceiver.write : null;
                }
                return this.IconCompatParcelizer;
            }
        }
    }
}
