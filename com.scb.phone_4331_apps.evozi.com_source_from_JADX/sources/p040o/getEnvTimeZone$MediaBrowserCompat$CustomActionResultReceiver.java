package p040o;

/* renamed from: o.getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver */
public final class getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<SupportPlaceAutocompleteFragment> {
    final /* synthetic */ getEnvTimeZone IconCompatParcelizer;

    private getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver(getEnvTimeZone getenvtimezone) {
        this.IconCompatParcelizer = getenvtimezone;
    }

    public /* synthetic */ getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver(getEnvTimeZone getenvtimezone, byte b) {
        this(getenvtimezone);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getEnvTimeZone.RatingCompat(this.IconCompatParcelizer);
        getEnvTimeZone getenvtimezone = this.IconCompatParcelizer;
        getEnvOsName getenvosname = new getEnvOsName(this, (SupportPlaceAutocompleteFragment) obj);
        if (getenvtimezone.RatingCompat != null) {
            getenvosname.IconCompatParcelizer(getenvtimezone.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        getEnvTimeZone.write(this.IconCompatParcelizer);
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            getEnvTimeZone getenvtimezone = this.IconCompatParcelizer;
            setEnvDeviceID setenvdeviceid = new setEnvDeviceID(this, th);
            if (getenvtimezone.RatingCompat != null) {
                setenvdeviceid.IconCompatParcelizer(getenvtimezone.RatingCompat);
            }
        }
    }
}
