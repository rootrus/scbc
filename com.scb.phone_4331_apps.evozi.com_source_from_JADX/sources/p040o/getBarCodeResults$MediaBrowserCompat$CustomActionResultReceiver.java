package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multimaps;
import p040o.zzfo;

/* renamed from: o.getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver */
class getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfo.zza> {
    private /* synthetic */ getBarCodeResults MediaBrowserCompat$ItemReceiver;

    private getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver(getBarCodeResults getbarcoderesults) {
        this.MediaBrowserCompat$ItemReceiver = getbarcoderesults;
    }

    /* synthetic */ getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver(getBarCodeResults getbarcoderesults, byte b) {
        this(getbarcoderesults);
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzfo.zza zza = (zzfo.zza) obj;
        getBarCodeResults.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        calculateFreeRamInBytes calculatefreeraminbytes = new calculateFreeRamInBytes(zza.MediaBrowserCompat$ItemReceiver, ObjectArrays.MediaBrowserCompat$ItemReceiver(zza.write, new Multimaps.UnmodifiableMultimap(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver.setCheckable())));
        getBarCodeResults getbarcoderesults = this.MediaBrowserCompat$ItemReceiver;
        toFormat toformat = new toFormat(calculatefreeraminbytes);
        if (getbarcoderesults.RatingCompat != null) {
            toformat.IconCompatParcelizer(getbarcoderesults.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            getBarCodeResults getbarcoderesults = this.MediaBrowserCompat$ItemReceiver;
            PassportDetector passportDetector = PassportDetector.MediaBrowserCompat$CustomActionResultReceiver;
            if (getbarcoderesults.RatingCompat != null) {
                passportDetector.IconCompatParcelizer(getbarcoderesults.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(CheckExtractActivity_MembersInjector.ExpandedMenuView expandedMenuView) {
        expandedMenuView.ay_();
        expandedMenuView.MediaBrowserCompat$CustomActionResultReceiver(false);
        expandedMenuView.IconCompatParcelizer();
    }

    static /* synthetic */ void read(calculateFreeRamInBytes calculatefreeraminbytes, CheckExtractActivity_MembersInjector.ExpandedMenuView expandedMenuView) {
        boolean z = false;
        if (calculatefreeraminbytes.write == null) {
            if (calculatefreeraminbytes.IconCompatParcelizer > 0) {
                z = true;
            }
            expandedMenuView.MediaBrowserCompat$CustomActionResultReceiver(z);
            expandedMenuView.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        if (calculatefreeraminbytes.IconCompatParcelizer > calculatefreeraminbytes.write.size()) {
            z = true;
        }
        expandedMenuView.MediaBrowserCompat$CustomActionResultReceiver(z);
        expandedMenuView.MediaBrowserCompat$ItemReceiver(calculatefreeraminbytes.write);
    }
}
