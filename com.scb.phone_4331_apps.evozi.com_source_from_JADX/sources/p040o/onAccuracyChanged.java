package p040o;

import p040o.C7475st;

/* renamed from: o.onAccuracyChanged */
public final /* synthetic */ class onAccuracyChanged implements Runnable {
    private final /* synthetic */ C7475st.write read;

    public /* synthetic */ onAccuracyChanged(C7475st.write write) {
        this.read = write;
    }

    public final void run() {
        C7475st stVar = C7475st.this;
        C7533tz tzVar = C7533tz.write;
        if (stVar.RatingCompat != null) {
            tzVar.IconCompatParcelizer(stVar.RatingCompat);
        }
    }
}
