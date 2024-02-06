package p040o;

import java.io.InputStream;

/* renamed from: o.startActivity */
public final class startActivity implements setSharedElementEnterTransition<setInitialSavedState, InputStream> {
    private static noteStateNotSaved<Integer> write = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final setRetainInstance<setInitialSavedState, setInitialSavedState> MediaBrowserCompat$CustomActionResultReceiver;

    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        setInitialSavedState setinitialsavedstate = (setInitialSavedState) obj;
        setRetainInstance<setInitialSavedState, setInitialSavedState> setretaininstance = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setretaininstance != null) {
            setInitialSavedState MediaBrowserCompat$ItemReceiver = setretaininstance.MediaBrowserCompat$ItemReceiver(setinitialsavedstate);
            if (MediaBrowserCompat$ItemReceiver == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.read(setRetainInstance$MediaBrowserCompat$ItemReceiver.write(setinitialsavedstate, 0, 0), setinitialsavedstate);
            } else {
                setinitialsavedstate = MediaBrowserCompat$ItemReceiver;
            }
        }
        noteStateNotSaved<Integer> notestatenotsaved = write;
        return new C1536x6a517a85(setinitialsavedstate, new onInflate(setinitialsavedstate, ((Integer) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved) : notestatenotsaved.read)).intValue()));
    }

    public startActivity() {
        this((setRetainInstance<setInitialSavedState, setInitialSavedState>) null);
    }

    public startActivity(setRetainInstance<setInitialSavedState, setInitialSavedState> setretaininstance) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setretaininstance;
    }
}
