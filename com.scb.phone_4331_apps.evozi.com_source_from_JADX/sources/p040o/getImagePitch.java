package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImagePitch */
public final /* synthetic */ class getImagePitch implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageFileRepresentation read;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ getImagePitch(setImageFileRepresentation setimagefilerepresentation, Throwable th) {
        this.read = setimagefilerepresentation;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageFileRepresentation setimagefilerepresentation = this.read;
        Throwable th = this.write;
        CheckExtractActivity_MembersInjector.AppCompatDialogFragment appCompatDialogFragment = (CheckExtractActivity_MembersInjector.AppCompatDialogFragment) obj;
        appCompatDialogFragment.aj_();
        appCompatDialogFragment.write(setimagefilerepresentation.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
