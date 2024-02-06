package p040o;

import java.util.concurrent.Callable;
import p040o.CameraSource;

/* renamed from: o.setOuterColors */
public final class setOuterColors<T> implements CameraSource.CameraSourceException.write<T> {
    private final Callable<? extends T> MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) obj;
        setContainer setcontainer = new setContainer(customCheckboxGroupView_ViewBinding);
        customCheckboxGroupView_ViewBinding.write(setcontainer);
        try {
            setcontainer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.call());
        } catch (Throwable th) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
            customCheckboxGroupView_ViewBinding.IconCompatParcelizer(th);
        }
    }

    public setOuterColors(Callable<? extends T> callable) {
        this.MediaBrowserCompat$ItemReceiver = callable;
    }
}
