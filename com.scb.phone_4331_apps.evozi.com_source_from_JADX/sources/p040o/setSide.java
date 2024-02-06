package p040o;

import java.util.Iterator;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSide */
public final /* synthetic */ class setSide implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCurrentScreenClass read;
    private final /* synthetic */ Image.FileIOEngine write;

    public /* synthetic */ setSide(Image.FileIOEngine fileIOEngine, getCurrentScreenClass getcurrentscreenclass) {
        this.write = fileIOEngine;
        this.read = getcurrentscreenclass;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.FileIOEngine fileIOEngine = this.write;
        getCurrentScreenClass getcurrentscreenclass = this.read;
        CheckExtractActivity_MembersInjector.setPopupCallback setpopupcallback = (CheckExtractActivity_MembersInjector.setPopupCallback) obj;
        String str = getcurrentscreenclass.write;
        Iterator<generateEventId> it = fileIOEngine.read.iterator();
        int i = 1;
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            } else if (it.next().MediaBrowserCompat$CustomActionResultReceiver.equals(str)) {
                break;
            } else {
                i++;
            }
        }
        setpopupcallback.MediaBrowserCompat$CustomActionResultReceiver(i);
        setpopupcallback.write("0".equals(getcurrentscreenclass.read));
        setpopupcallback.MediaBrowserCompat$CustomActionResultReceiver("Y".equals(getcurrentscreenclass.MediaMetadataCompat));
        setpopupcallback.write(getcurrentscreenclass.MediaBrowserCompat$CustomActionResultReceiver);
        setpopupcallback.read(Image.FileIOEngine.MediaBrowserCompat$CustomActionResultReceiver(fileIOEngine.MediaDescriptionCompat.write));
        setpopupcallback.read("Y".equals(getcurrentscreenclass.RatingCompat));
        setpopupcallback.MediaBrowserCompat$ItemReceiver("Y".equals(getcurrentscreenclass.IconCompatParcelizer));
    }
}
