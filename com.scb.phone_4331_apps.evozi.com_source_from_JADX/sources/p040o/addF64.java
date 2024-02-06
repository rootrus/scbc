package p040o;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.isComplex;
import p040o.subByte2;

/* renamed from: o.addF64 */
public abstract class addF64<T extends subByte2<? extends addI8>> {
    protected List<T> IconCompatParcelizer;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public float MediaBrowserCompat$ItemReceiver;
    private float MediaBrowserCompat$MediaItem;
    private float MediaBrowserCompat$SearchResultReceiver;
    public float MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public float read;
    public float write;

    public addF64() {
        this.MediaDescriptionCompat = -3.4028235E38f;
        this.MediaMetadataCompat = Float.MAX_VALUE;
        this.MediaBrowserCompat$MediaItem = -3.4028235E38f;
        this.MediaBrowserCompat$SearchResultReceiver = Float.MAX_VALUE;
        this.read = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.MediaBrowserCompat$ItemReceiver = -3.4028235E38f;
        this.MediaBrowserCompat$CustomActionResultReceiver = Float.MAX_VALUE;
        this.IconCompatParcelizer = new ArrayList();
    }

    public addF64(T... tArr) {
        this.MediaDescriptionCompat = -3.4028235E38f;
        this.MediaMetadataCompat = Float.MAX_VALUE;
        this.MediaBrowserCompat$MediaItem = -3.4028235E38f;
        this.MediaBrowserCompat$SearchResultReceiver = Float.MAX_VALUE;
        this.read = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        this.MediaBrowserCompat$ItemReceiver = -3.4028235E38f;
        this.MediaBrowserCompat$CustomActionResultReceiver = Float.MAX_VALUE;
        this.IconCompatParcelizer = IconCompatParcelizer(tArr);
        MediaMetadataCompat();
    }

    private static List<T> IconCompatParcelizer(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    private void MediaMetadataCompat() {
        subByte2 subbyte2;
        subByte2 subbyte22;
        List<T> list = this.IconCompatParcelizer;
        if (list != null) {
            this.MediaDescriptionCompat = -3.4028235E38f;
            this.MediaMetadataCompat = Float.MAX_VALUE;
            this.MediaBrowserCompat$MediaItem = -3.4028235E38f;
            this.MediaBrowserCompat$SearchResultReceiver = Float.MAX_VALUE;
            for (T t : list) {
                if (this.MediaDescriptionCompat < t.setHasDecor()) {
                    this.MediaDescriptionCompat = t.setHasDecor();
                }
                if (this.MediaMetadataCompat > t.AlertController$RecycleListView()) {
                    this.MediaMetadataCompat = t.AlertController$RecycleListView();
                }
                if (this.MediaBrowserCompat$MediaItem < t.Keep()) {
                    this.MediaBrowserCompat$MediaItem = t.Keep();
                }
                if (this.MediaBrowserCompat$SearchResultReceiver > t.PlaybackStateCompat()) {
                    this.MediaBrowserCompat$SearchResultReceiver = t.PlaybackStateCompat();
                }
                if (t.IconCompatParcelizer() == addToPack$MediaBrowserCompat$ItemReceiver.LEFT) {
                    if (this.read < t.setHasDecor()) {
                        this.read = t.setHasDecor();
                    }
                    if (this.write > t.AlertController$RecycleListView()) {
                        this.write = t.AlertController$RecycleListView();
                    }
                } else {
                    if (this.MediaBrowserCompat$ItemReceiver < t.setHasDecor()) {
                        this.MediaBrowserCompat$ItemReceiver = t.setHasDecor();
                    }
                    if (this.MediaBrowserCompat$CustomActionResultReceiver > t.AlertController$RecycleListView()) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = t.AlertController$RecycleListView();
                    }
                }
            }
            this.read = -3.4028235E38f;
            this.write = Float.MAX_VALUE;
            this.MediaBrowserCompat$ItemReceiver = -3.4028235E38f;
            this.MediaBrowserCompat$CustomActionResultReceiver = Float.MAX_VALUE;
            Iterator<T> it = this.IconCompatParcelizer.iterator();
            while (true) {
                subbyte2 = null;
                if (!it.hasNext()) {
                    subbyte22 = null;
                    break;
                }
                subbyte22 = (subByte2) it.next();
                if (subbyte22.IconCompatParcelizer() == addToPack$MediaBrowserCompat$ItemReceiver.LEFT) {
                    break;
                }
            }
            if (subbyte22 != null) {
                this.read = subbyte22.setHasDecor();
                this.write = subbyte22.AlertController$RecycleListView();
                for (T t2 : this.IconCompatParcelizer) {
                    if (t2.IconCompatParcelizer() == addToPack$MediaBrowserCompat$ItemReceiver.LEFT) {
                        if (t2.AlertController$RecycleListView() < this.write) {
                            this.write = t2.AlertController$RecycleListView();
                        }
                        if (t2.setHasDecor() > this.read) {
                            this.read = t2.setHasDecor();
                        }
                    }
                }
            }
            Iterator<T> it2 = this.IconCompatParcelizer.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                subByte2 subbyte23 = (subByte2) it2.next();
                if (subbyte23.IconCompatParcelizer() == addToPack$MediaBrowserCompat$ItemReceiver.RIGHT) {
                    subbyte2 = subbyte23;
                    break;
                }
            }
            if (subbyte2 != null) {
                this.MediaBrowserCompat$ItemReceiver = subbyte2.setHasDecor();
                this.MediaBrowserCompat$CustomActionResultReceiver = subbyte2.AlertController$RecycleListView();
                for (T t3 : this.IconCompatParcelizer) {
                    if (t3.IconCompatParcelizer() == addToPack$MediaBrowserCompat$ItemReceiver.RIGHT) {
                        if (t3.AlertController$RecycleListView() < this.MediaBrowserCompat$CustomActionResultReceiver) {
                            this.MediaBrowserCompat$CustomActionResultReceiver = t3.AlertController$RecycleListView();
                        }
                        if (t3.setHasDecor() > this.MediaBrowserCompat$ItemReceiver) {
                            this.MediaBrowserCompat$ItemReceiver = t3.setHasDecor();
                        }
                    }
                }
            }
        }
    }

    public final int read() {
        List<T> list = this.IconCompatParcelizer;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final List<T> write() {
        return this.IconCompatParcelizer;
    }

    public T write(int i) {
        List<T> list = this.IconCompatParcelizer;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (subByte2) this.IconCompatParcelizer.get(i);
    }

    public final void IconCompatParcelizer(addU16 addu16) {
        for (T MediaBrowserCompat$ItemReceiver2 : this.IconCompatParcelizer) {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(addu16);
        }
    }

    public final void IconCompatParcelizer() {
        for (T write2 : this.IconCompatParcelizer) {
            write2.write(-1);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Typeface typeface) {
        for (T read2 : this.IconCompatParcelizer) {
            read2.read(typeface);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        for (T read2 : this.IconCompatParcelizer) {
            read2.read(16.0f);
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        int i = 0;
        for (T PlaybackStateCompat$CustomAction : this.IconCompatParcelizer) {
            i += PlaybackStateCompat$CustomAction.PlaybackStateCompat$CustomAction();
        }
        return i;
    }

    public final T MediaBrowserCompat$ItemReceiver() {
        List<T> list = this.IconCompatParcelizer;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = (subByte2) this.IconCompatParcelizer.get(0);
        for (T t2 : this.IconCompatParcelizer) {
            if (t2.PlaybackStateCompat$CustomAction() > t.PlaybackStateCompat$CustomAction()) {
                t = t2;
            }
        }
        return t;
    }

    public addI8 MediaBrowserCompat$ItemReceiver(isComplex.C13709 r3) {
        if (r3.write >= this.IconCompatParcelizer.size()) {
            return null;
        }
        return ((subByte2) this.IconCompatParcelizer.get(r3.write)).write(r3.MediaBrowserCompat$SearchResultReceiver, r3.MediaDescriptionCompat);
    }
}
