package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.ImageProcessor;
import p040o.writeUInt64NoTag;

/* renamed from: o.removeAnalysisCompleteEventListener */
public final /* synthetic */ class removeAnalysisCompleteEventListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ImageProcessor.ProcessProgressEvent.write IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ removeAnalysisCompleteEventListener(ImageProcessor.ProcessProgressEvent.write write, String str) {
        this.IconCompatParcelizer = write;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ImageProcessor.ProcessProgressEvent.write write = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$ItemReceiver;
        CheckExtractActivity_MembersInjector.setCheckable setcheckable = (CheckExtractActivity_MembersInjector.setCheckable) obj;
        for (int i = 0; i < ImageProcessor.ProcessProgressEvent.this.MediaSessionCompat$Token.size(); i++) {
            if (str.equalsIgnoreCase(((MoreExecutors) ImageProcessor.ProcessProgressEvent.this.MediaSessionCompat$Token.get(i)).MediaBrowserCompat$ItemReceiver)) {
                setcheckable.MediaBrowserCompat$ItemReceiver(ImageProcessor.ProcessProgressEvent.this.MediaSessionCompat$Token, i);
                return;
            }
        }
    }
}
