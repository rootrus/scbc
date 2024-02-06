package p040o;

import p040o.DetectedDocumentBoundary;
import p040o.IdParameters;
import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeStartup */
public final /* synthetic */ class nativeStartup implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile IconCompatParcelizer;
    private final /* synthetic */ getGeoDataClient MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeStartup(nativeConfigureFromFile nativeconfigurefromfile, getGeoDataClient getgeodataclient) {
        this.IconCompatParcelizer = nativeconfigurefromfile;
        this.MediaBrowserCompat$CustomActionResultReceiver = getgeodataclient;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.IconCompatParcelizer;
        getGeoDataClient getgeodataclient = this.MediaBrowserCompat$CustomActionResultReceiver;
        IdParameters.C6915a aVar = (IdParameters.C6915a) obj;
        if (getgeodataclient == getGeoDataClient.NTB_MUTUAL_FUND) {
            aVar.MediaBrowserCompat$MediaItem();
        } else if (getgeodataclient == getGeoDataClient.NTB_SCB_ONE) {
            aVar.setContentView();
        } else {
            boolean z = true;
            if (getgeodataclient == getGeoDataClient.NTB_INTRODUCTION) {
                adornFrame adornframe = adornFrame.IconCompatParcelizer;
                if (nativeconfigurefromfile.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    adornframe.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
                }
                nativeconfigurefromfile.MediaBrowserCompat$ItemReceiver.read();
                nativeconfigurefromfile.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new nativeConfigureFromFile.write(nativeconfigurefromfile, (byte) 0));
            } else if (getgeodataclient == getGeoDataClient.OPEN_SCB_ACCOUNT) {
                aVar.AppCompatViewInflater();
            } else if (getgeodataclient == getGeoDataClient.HML_LANDING) {
                aVar.setExpandedFormat();
            } else if (getgeodataclient == getGeoDataClient.ON_BOARD_ACTIVATE) {
                aVar.setCheckable();
                DetectedDocumentBoundary.DetectedBoundaryType detectedBoundaryType = DetectedDocumentBoundary.DetectedBoundaryType.MediaBrowserCompat$ItemReceiver;
                if (nativeconfigurefromfile.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    detectedBoundaryType.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
                }
            }
        }
    }
}
