package p040o;

import p040o.CameraSource;

/* renamed from: o.CustomExternalSelector */
public final class CustomExternalSelector<T, R> implements CameraSource.CameraSourceException.write<R> {
    private CameraSource.CameraSourceException.write<T> MediaBrowserCompat$ItemReceiver;
    private CameraSource.CameraSourceException.IconCompatParcelizer<? extends R, ? super T> write;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding;
        CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding2 = (CustomCheckboxGroupView_ViewBinding) obj;
        try {
            customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) setDetailText.write(this.write).MediaBrowserCompat$CustomActionResultReceiver(customCheckboxGroupView_ViewBinding2);
            customCheckboxGroupView_ViewBinding.read();
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(customCheckboxGroupView_ViewBinding);
        } catch (Throwable th) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
            customCheckboxGroupView_ViewBinding2.IconCompatParcelizer(th);
        }
    }

    static {
        DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().IconCompatParcelizer();
    }

    public CustomExternalSelector(CameraSource.CameraSourceException.write<T> write2, CameraSource.CameraSourceException.IconCompatParcelizer<? extends R, ? super T> iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.write = iconCompatParcelizer;
    }
}
