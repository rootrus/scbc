package p040o;

import p040o.addAnalysisProgressEventListener;

/* renamed from: o.classifyImage */
public final /* synthetic */ class classifyImage implements Runnable {
    private final /* synthetic */ addAnalysisProgressEventListener.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ classifyImage(addAnalysisProgressEventListener.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void run() {
        addAnalysisProgressEventListener addanalysisprogresseventlistener = addAnalysisProgressEventListener.this;
        C5082o oVar = C5082o.IconCompatParcelizer;
        if (addanalysisprogresseventlistener.RatingCompat != null) {
            oVar.IconCompatParcelizer(addanalysisprogresseventlistener.RatingCompat);
        }
    }
}
