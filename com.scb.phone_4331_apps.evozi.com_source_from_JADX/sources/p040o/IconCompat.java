package p040o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p040o.superDispatchKeyEvent;

/* renamed from: o.IconCompat */
public final class IconCompat {
    private static ThreadLocal<WeakReference<setTextAppearance<ViewGroup, ArrayList<BetterViewPager>>>> IconCompatParcelizer = new ThreadLocal<>();
    static ArrayList<ViewGroup> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
    private static BetterViewPager write = new dispatchKeyShortcutEvent();

    public IconCompat() {
        new setTextAppearance();
        new setTextAppearance();
    }

    static setTextAppearance<ViewGroup, ArrayList<BetterViewPager>> write() {
        setTextAppearance<ViewGroup, ArrayList<BetterViewPager>> settextappearance;
        WeakReference weakReference = IconCompatParcelizer.get();
        if (weakReference != null && (settextappearance = (setTextAppearance) weakReference.get()) != null) {
            return settextappearance;
        }
        setTextAppearance<ViewGroup, ArrayList<BetterViewPager>> settextappearance2 = new setTextAppearance<>();
        IconCompatParcelizer.set(new WeakReference(settextappearance2));
        return settextappearance2;
    }

    /* renamed from: o.IconCompat$read */
    static class read implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        ViewGroup MediaBrowserCompat$CustomActionResultReceiver;
        private BetterViewPager read;

        public final void onViewAttachedToWindow(View view) {
        }

        read(BetterViewPager betterViewPager, ViewGroup viewGroup) {
            this.read = betterViewPager;
            this.MediaBrowserCompat$CustomActionResultReceiver = viewGroup;
        }

        public final boolean onPreDraw() {
            this.MediaBrowserCompat$CustomActionResultReceiver.getViewTreeObserver().removeOnPreDrawListener(this);
            this.MediaBrowserCompat$CustomActionResultReceiver.removeOnAttachStateChangeListener(this);
            if (!IconCompat.MediaBrowserCompat$CustomActionResultReceiver.remove(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                return true;
            }
            final setTextAppearance<ViewGroup, ArrayList<BetterViewPager>> write = IconCompat.write();
            ArrayList arrayList = write.get(this.MediaBrowserCompat$CustomActionResultReceiver);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                write.put(this.MediaBrowserCompat$CustomActionResultReceiver, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.read);
            this.read.IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) new AppCompatMultiAutoCompleteTextView() {
                public final void write(BetterViewPager betterViewPager) {
                    ((ArrayList) write.get(read.this.MediaBrowserCompat$CustomActionResultReceiver)).remove(betterViewPager);
                }
            });
            this.read.read(this.MediaBrowserCompat$CustomActionResultReceiver, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((BetterViewPager) it.next()).read((View) this.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
            this.read.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            return true;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver.getViewTreeObserver().removeOnPreDrawListener(this);
            this.MediaBrowserCompat$CustomActionResultReceiver.removeOnAttachStateChangeListener(this);
            IconCompat.MediaBrowserCompat$CustomActionResultReceiver.remove(this.MediaBrowserCompat$CustomActionResultReceiver);
            ArrayList arrayList = IconCompat.write().get(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((BetterViewPager) it.next()).read((View) this.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
            this.read.write(true);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, BetterViewPager betterViewPager) {
        if (!MediaBrowserCompat$CustomActionResultReceiver.contains(viewGroup) && SwitchCompat.setCheckable(viewGroup)) {
            MediaBrowserCompat$CustomActionResultReceiver.add(viewGroup);
            if (betterViewPager == null) {
                betterViewPager = write;
            }
            BetterViewPager write2 = betterViewPager.clone();
            ArrayList arrayList = write().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((BetterViewPager) it.next()).MediaBrowserCompat$CustomActionResultReceiver((View) viewGroup);
                }
            }
            if (write2 != null) {
                write2.read(viewGroup, true);
            }
            if (((C1133x65c1ec57) viewGroup.getTag(superDispatchKeyEvent.read.transition_current_scene)) != null) {
                C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver();
            }
            viewGroup.setTag(superDispatchKeyEvent.read.transition_current_scene, (Object) null);
            if (write2 != null && viewGroup != null) {
                read read2 = new read(write2, viewGroup);
                viewGroup.addOnAttachStateChangeListener(read2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(read2);
            }
        }
    }
}
