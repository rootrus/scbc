package p040o;

import p040o.inject_stringIdGenerator;

/* renamed from: o.initController */
public final /* synthetic */ class initController implements Runnable {
    private final /* synthetic */ inject_stringIdGenerator.write read;
    private final /* synthetic */ setCompassEnabled write;

    public /* synthetic */ initController(inject_stringIdGenerator.write write2, setCompassEnabled setcompassenabled) {
        this.read = write2;
        this.write = setcompassenabled;
    }

    public final void run() {
        inject_stringIdGenerator.write write2 = this.read;
        setCompassEnabled setcompassenabled = this.write;
        inject_stringIdGenerator inject_stringidgenerator = inject_stringIdGenerator.this;
        getCameraView getcameraview = new getCameraView(write2, setcompassenabled);
        if (inject_stringidgenerator.RatingCompat != null) {
            getcameraview.IconCompatParcelizer(inject_stringidgenerator.RatingCompat);
        }
    }
}
