package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.addI8;

/* renamed from: o.createFromArray */
public abstract class createFromArray<T extends addI8> extends getPackedSize<T> {
    private float MediaBrowserCompat$ItemReceiver = -3.4028235E38f;
    private float MediaBrowserCompat$MediaItem = -3.4028235E38f;
    private float MediaBrowserCompat$SearchResultReceiver = Float.MAX_VALUE;
    private float MediaDescriptionCompat = Float.MAX_VALUE;
    private List<T> write = null;

    /* renamed from: o.createFromArray$write */
    public enum write {
        UP,
        DOWN,
        CLOSEST
    }

    public createFromArray(List<T> list, String str) {
        super(str);
        this.write = list;
        if (list == null) {
            this.write = new ArrayList();
        }
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    private void AppCompatDelegateImpl$ListMenuDecorView() {
        List<T> list = this.write;
        if (list != null && !list.isEmpty()) {
            this.MediaBrowserCompat$MediaItem = -3.4028235E38f;
            this.MediaBrowserCompat$SearchResultReceiver = Float.MAX_VALUE;
            this.MediaBrowserCompat$ItemReceiver = -3.4028235E38f;
            this.MediaDescriptionCompat = Float.MAX_VALUE;
            for (T IconCompatParcelizer : this.write) {
                IconCompatParcelizer(IconCompatParcelizer);
            }
        }
    }

    public final int PlaybackStateCompat$CustomAction() {
        return this.write.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        sb.append(MediaDescriptionCompat() == null ? "" : MediaDescriptionCompat());
        sb.append(", entries: ");
        sb.append(this.write.size());
        sb.append("\n");
        stringBuffer2.append(sb.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < this.write.size(); i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((addI8) this.write.get(i)).toString());
            sb2.append(" ");
            stringBuffer.append(sb2.toString());
        }
        return stringBuffer.toString();
    }

    public final float AlertController$RecycleListView() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final float setHasDecor() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final float PlaybackStateCompat() {
        return this.MediaDescriptionCompat;
    }

    public final float Keep() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int write(addI8 addi8) {
        return this.write.indexOf(addi8);
    }

    public final T MediaBrowserCompat$ItemReceiver(float f, float f2, write write2) {
        int read = read(f, Float.NaN, write2);
        if (read >= 0) {
            return (addI8) this.write.get(read);
        }
        return null;
    }

    public final T write(float f, float f2) {
        int read = read(f, f2, write.CLOSEST);
        if (read >= 0) {
            return (addI8) this.write.get(read);
        }
        return null;
    }

    public final T MediaBrowserCompat$ItemReceiver(int i) {
        return (addI8) this.write.get(i);
    }

    private int read(float f, float f2, write write2) {
        addI8 addi8;
        List<T> list = this.write;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i = 0;
        int size = this.write.size() - 1;
        while (i < size) {
            int i2 = (i + size) / 2;
            float MediaBrowserCompat$CustomActionResultReceiver = ((addI8) this.write.get(i2)).MediaBrowserCompat$CustomActionResultReceiver() - f;
            int i3 = i2 + 1;
            float MediaBrowserCompat$CustomActionResultReceiver2 = ((addI8) this.write.get(i3)).MediaBrowserCompat$CustomActionResultReceiver();
            float abs = Math.abs(MediaBrowserCompat$CustomActionResultReceiver);
            float abs2 = Math.abs(MediaBrowserCompat$CustomActionResultReceiver2 - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = (double) MediaBrowserCompat$CustomActionResultReceiver;
                    if (d < 0.0d) {
                        if (d >= 0.0d) {
                        }
                    }
                }
                size = i2;
            }
            i = i3;
        }
        if (size != -1) {
            float MediaBrowserCompat$CustomActionResultReceiver3 = ((addI8) this.write.get(size)).MediaBrowserCompat$CustomActionResultReceiver();
            if (write2 == write.UP) {
                if (MediaBrowserCompat$CustomActionResultReceiver3 < f && size < this.write.size() - 1) {
                    size++;
                }
            } else if (write2 == write.DOWN && MediaBrowserCompat$CustomActionResultReceiver3 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((addI8) this.write.get(size - 1)).MediaBrowserCompat$CustomActionResultReceiver() == MediaBrowserCompat$CustomActionResultReceiver3) {
                    size--;
                }
                float f3 = ((addI8) this.write.get(size)).IconCompatParcelizer;
                loop2:
                while (true) {
                    int i4 = size;
                    do {
                        i4++;
                        if (i4 >= this.write.size()) {
                            break loop2;
                        }
                        addi8 = (addI8) this.write.get(i4);
                        if (addi8.MediaBrowserCompat$CustomActionResultReceiver() != MediaBrowserCompat$CustomActionResultReceiver3) {
                            break loop2;
                        }
                    } while (Math.abs(addi8.IconCompatParcelizer - f2) >= Math.abs(f3 - f2));
                    f3 = f2;
                    size = i4;
                }
            }
        }
        return size;
    }

    public final List<T> MediaBrowserCompat$CustomActionResultReceiver(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.write.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            addI8 addi8 = (addI8) this.write.get(i2);
            if (f == addi8.MediaBrowserCompat$CustomActionResultReceiver()) {
                while (i2 > 0 && ((addI8) this.write.get(i2 - 1)).MediaBrowserCompat$CustomActionResultReceiver() == f) {
                    i2--;
                }
                int size2 = this.write.size();
                while (i2 < size2) {
                    addI8 addi82 = (addI8) this.write.get(i2);
                    if (addi82.MediaBrowserCompat$CustomActionResultReceiver() != f) {
                        break;
                    }
                    arrayList.add(addi82);
                    i2++;
                }
            } else if (f > addi8.MediaBrowserCompat$CustomActionResultReceiver()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(T t) {
        if (t != null) {
            if (t.MediaBrowserCompat$CustomActionResultReceiver() < this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = t.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (t.MediaBrowserCompat$CustomActionResultReceiver() > this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = t.MediaBrowserCompat$CustomActionResultReceiver();
            }
            read(t);
        }
    }

    /* access modifiers changed from: protected */
    public final void read(T t) {
        if (t.IconCompatParcelizer < this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$SearchResultReceiver = t.IconCompatParcelizer;
        }
        if (t.IconCompatParcelizer > this.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$MediaItem = t.IconCompatParcelizer;
        }
    }
}
