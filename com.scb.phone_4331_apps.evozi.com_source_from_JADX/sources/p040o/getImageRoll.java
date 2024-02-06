package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageRoll */
public final /* synthetic */ class getImageRoll implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageFileRepresentation MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getImageRoll(setImageFileRepresentation setimagefilerepresentation) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagefilerepresentation;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageFileRepresentation setimagefilerepresentation = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckExtractActivity_MembersInjector.AppCompatDialogFragment appCompatDialogFragment = (CheckExtractActivity_MembersInjector.AppCompatDialogFragment) obj;
        isEmulator isemulator = setimagefilerepresentation.MediaBrowserCompat$ItemReceiver;
        if (isemulator != null) {
            if (isemulator.MediaBrowserCompat$ItemReceiver != null) {
                appCompatDialogFragment.MediaBrowserCompat$ItemReceiver(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.intValue());
            }
            if (setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat != null) {
                appCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.booleanValue());
            }
            if (setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null && setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat != null && setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.booleanValue()) {
                appCompatDialogFragment.read(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.intValue());
            }
        }
    }
}
