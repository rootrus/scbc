package p040o;

import p040o.getBackgroundColor;

/* renamed from: o.setViewfinderPaddingPercent */
public final /* synthetic */ class setViewfinderPaddingPercent implements Runnable {
    private final /* synthetic */ getBackgroundColor.C45061 write;

    public /* synthetic */ setViewfinderPaddingPercent(getBackgroundColor.C45061 r1) {
        this.write = r1;
    }

    public final void run() {
        getBackgroundColor getbackgroundcolor = getBackgroundColor.this;
        setPageDetectOrientationFlag setpagedetectorientationflag = setPageDetectOrientationFlag.IconCompatParcelizer;
        if (getbackgroundcolor.RatingCompat != null) {
            setpagedetectorientationflag.IconCompatParcelizer(getbackgroundcolor.RatingCompat);
        }
    }
}
