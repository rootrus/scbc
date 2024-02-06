package p040o;

import java.util.ArrayList;
import java.util.HashSet;
import p040o.setOnCloseListener;

/* renamed from: o.AppCompatRadioButton */
public final class AppCompatRadioButton<T> {
    private final HashSet<T> MediaBrowserCompat$CustomActionResultReceiver = new HashSet<>();
    private final ArrayList<T> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    public final setOnCloseListener.read<ArrayList<T>> read = new setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver(10);
    public final AppCompatCheckBox<T, ArrayList<T>> write = new AppCompatCheckBox<>();

    public final ArrayList<T> read() {
        this.MediaBrowserCompat$ItemReceiver.clear();
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            IconCompatParcelizer(this.write.read[i << 1], this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    private void IconCompatParcelizer(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.write.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        IconCompatParcelizer(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
