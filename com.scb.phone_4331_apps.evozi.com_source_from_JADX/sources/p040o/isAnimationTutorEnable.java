package p040o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040o.getImageWidth;

/* renamed from: o.isAnimationTutorEnable */
public class isAnimationTutorEnable extends removeAboutToCaptureListener<getImageWidth.IconCompatParcelizer.C10788IconCompatParcelizer> {
    public Map<Integer, Boolean> MediaBrowserCompat$ItemReceiver;
    public String read;

    @HmlPinActivity
    public isAnimationTutorEnable(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final void write() {
        addPageDetectionListener addpagedetectionlistener = new addPageDetectionListener(this);
        boolean z = false;
        if (this.RatingCompat != null) {
            addpagedetectionlistener.IconCompatParcelizer(this.RatingCompat);
        }
        String str = this.read;
        if (!(str != null && !str.equals("")) || !(!read().isEmpty())) {
            enableAnimationTutor enableanimationtutor = enableAnimationTutor.read;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                enableanimationtutor.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        getCheckDetectionSettings getcheckdetectionsettings = getCheckDetectionSettings.write;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getcheckdetectionsettings.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write(String str, boolean z) {
        this.MediaBrowserCompat$ItemReceiver.put(Integer.valueOf(Integer.parseInt(str)), Boolean.valueOf(z));
        DocumentBaseCaptureExperience documentBaseCaptureExperience = new DocumentBaseCaptureExperience(this, z);
        if (this.RatingCompat != null) {
            documentBaseCaptureExperience.IconCompatParcelizer(this.RatingCompat);
        }
        write();
    }

    /* access modifiers changed from: package-private */
    public final List<String> read() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.MediaBrowserCompat$ItemReceiver.keySet()) {
            int intValue2 = intValue.intValue();
            if (this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(intValue2)).equals(Boolean.TRUE)) {
                arrayList.add(String.valueOf(intValue2));
            }
        }
        return arrayList;
    }
}
