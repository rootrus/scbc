package p040o;

import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;

/* renamed from: o.getBusinessDocumentInstructions */
public final /* synthetic */ class getBusinessDocumentInstructions implements C6992x633f693d {
    private final /* synthetic */ NTBLifestyleLandingFragment read;

    public /* synthetic */ getBusinessDocumentInstructions(NTBLifestyleLandingFragment nTBLifestyleLandingFragment) {
        this.read = nTBLifestyleLandingFragment;
    }

    public final boolean read(String str) {
        nativeConfigureFromFile nativeconfigurefromfile = this.read.landingPresenter;
        DocumentTracker documentTracker = new DocumentTracker(str);
        if (nativeconfigurefromfile.RatingCompat != null) {
            documentTracker.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
        }
        return true;
    }
}
