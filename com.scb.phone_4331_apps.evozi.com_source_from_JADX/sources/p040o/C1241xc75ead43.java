package p040o;

import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: o.MileageQuantitySelectionActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
public abstract class C1241xc75ead43<T> implements MileageQuantitySelectionActivity_ViewBinding.read<T> {
    public abstract void MediaBrowserCompat$ItemReceiver(T t);

    public abstract MileageQuantitySelectionActivity_ViewBinding<T> read();

    public final MileageQuantitySelectionActivity_ViewBinding<T> IconCompatParcelizer(T t) {
        MediaBrowserCompat$ItemReceiver(t);
        return read();
    }
}
