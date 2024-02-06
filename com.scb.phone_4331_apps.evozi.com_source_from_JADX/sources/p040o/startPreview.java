package p040o;

import p040o.getEdgesGuidance;

/* renamed from: o.startPreview */
public final /* synthetic */ class startPreview implements Runnable {
    private final /* synthetic */ getEdgesGuidance.C45555 IconCompatParcelizer;

    public /* synthetic */ startPreview(getEdgesGuidance.C45555 r1) {
        this.IconCompatParcelizer = r1;
    }

    public final void run() {
        getEdgesGuidance getedgesguidance = getEdgesGuidance.this;
        getErrMsg geterrmsg = getErrMsg.write;
        if (getedgesguidance.RatingCompat != null) {
            geterrmsg.IconCompatParcelizer(getedgesguidance.RatingCompat);
        }
    }
}
