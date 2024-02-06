package p040o;

import com.scb.phone.view.fragment.hml.HmlOutcomeCounterOfferFragment;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.ImageService;

/* renamed from: o.ActivityBuilder_BindDeejungAboutActivity */
public final /* synthetic */ class ActivityBuilder_BindDeejungAboutActivity implements FragmentBuilder_BindCardlessWithdrawAmountFragment {
    private final /* synthetic */ HmlOutcomeCounterOfferFragment write;

    public /* synthetic */ ActivityBuilder_BindDeejungAboutActivity(HmlOutcomeCounterOfferFragment hmlOutcomeCounterOfferFragment) {
        this.write = hmlOutcomeCounterOfferFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        createPropertyInfo createpropertyinfo = this.write.presenter;
        CrashlyticsController.C322720 r11 = createpropertyinfo.IconCompatParcelizer.write.get(i);
        if (!(r11 == null || r11.RatingCompat == null)) {
            CrashlyticsReport.FilesPayload.Builder builder = r11.RatingCompat;
            if (builder.IconCompatParcelizer != null) {
                HmlNTBBusinessURLInformationActivity.write(builder.IconCompatParcelizer, "#####", "", "", -1, "", ImageService.C3494a.write);
            }
        }
        ImageService.InterimImageFileFormat interimImageFileFormat = new ImageService.InterimImageFileFormat(r11);
        if (createpropertyinfo.RatingCompat != null) {
            interimImageFileFormat.IconCompatParcelizer(createpropertyinfo.RatingCompat);
        }
    }
}
