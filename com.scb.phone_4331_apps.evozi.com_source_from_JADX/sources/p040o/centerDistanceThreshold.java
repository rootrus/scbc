package p040o;

import p040o.verifyReferral;

/* renamed from: o.centerDistanceThreshold */
public final /* synthetic */ class centerDistanceThreshold implements verifyReferral.IconCompatParcelizer {
    private final /* synthetic */ setPosX read;

    public /* synthetic */ centerDistanceThreshold(setPosX setposx) {
        this.read = setposx;
    }

    public final void IconCompatParcelizer() {
        setPosX setposx = this.read;
        if (setposx.RatingCompat != null) {
            setposx.RatingCompat.aj_();
        }
    }
}
