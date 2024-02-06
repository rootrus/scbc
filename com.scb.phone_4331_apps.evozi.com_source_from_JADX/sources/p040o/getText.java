package p040o;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: o.getText */
public abstract class getText<T> extends onActivityCreated {
    public Context IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private SparseArray<View> MediaDescriptionCompat = new SparseArray<>();
    public List<T> read;
    private boolean write;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(View view, int i);

    /* access modifiers changed from: protected */
    public abstract View MediaBrowserCompat$ItemReceiver();

    public int getItemPosition(Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public getText(Context context, List<T> list) {
        boolean z = false;
        this.write = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = context;
        this.write = true;
        this.MediaDescriptionCompat = new SparseArray<>();
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list.size() > 1 ? true : z;
        notifyDataSetChanged();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (this.write && this.MediaBrowserCompat$CustomActionResultReceiver) {
            i = MediaBrowserCompat$ItemReceiver(i);
        }
        if (this.MediaDescriptionCompat.get(0, (Object) null) == null) {
            view = MediaBrowserCompat$ItemReceiver();
        } else {
            view = this.MediaDescriptionCompat.get(0);
            this.MediaDescriptionCompat.remove(0);
        }
        MediaBrowserCompat$CustomActionResultReceiver(view, i);
        viewGroup.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.write && this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver(i);
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaDescriptionCompat.put(0, view);
        }
    }

    public void notifyDataSetChanged() {
        this.MediaBrowserCompat$ItemReceiver = true;
        super.notifyDataSetChanged();
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public int getCount() {
        List<T> list = this.read;
        int size = list != null ? list.size() : 0;
        return (!this.write || !this.MediaBrowserCompat$CustomActionResultReceiver) ? size : size + 2;
    }

    public final int IconCompatParcelizer() {
        List<T> list = this.read;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private int MediaBrowserCompat$ItemReceiver(int i) {
        if (!this.write || !this.MediaBrowserCompat$CustomActionResultReceiver) {
            return i;
        }
        if (i == 0) {
            return (getCount() - 1) - 2;
        }
        if (i > getCount() - 2) {
            return 0;
        }
        return i - 1;
    }

    public final int write() {
        if (this.write) {
            List<T> list = this.read;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        List<T> list2 = this.read;
        if (list2 == null) {
            return 0;
        }
        return list2.size() - 1;
    }
}
