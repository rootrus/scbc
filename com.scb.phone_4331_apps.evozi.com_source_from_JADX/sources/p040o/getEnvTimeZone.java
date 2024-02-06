package p040o;

import p040o.TransformedImmutableList;

/* renamed from: o.getEnvTimeZone */
public class getEnvTimeZone extends writeUInt64NoTag<CheckWorkflowActivity_MembersInjector> {
    public final TileOverlayOptions MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final TransformedImmutableList.TransformedView read;

    @HmlPinActivity
    public getEnvTimeZone(TileOverlayOptions tileOverlayOptions, TransformedImmutableList.TransformedView transformedView, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = tileOverlayOptions;
        this.read = transformedView;
    }

    /* renamed from: o.getEnvTimeZone$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        public /* synthetic */ write(getEnvTimeZone getenvtimezone, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getEnvTimeZone.MediaBrowserCompat$ItemReceiver(getEnvTimeZone.this);
            getEnvTimeZone getenvtimezone = getEnvTimeZone.this;
            getEnvSdkVersion getenvsdkversion = new getEnvSdkVersion((Boolean) obj);
            if (getenvtimezone.RatingCompat != null) {
                getenvsdkversion.IconCompatParcelizer(getenvtimezone.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getEnvTimeZone.read(getEnvTimeZone.this);
            if (!getEnvTimeZone.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getEnvTimeZone getenvtimezone = getEnvTimeZone.this;
                getEnvOsVersion getenvosversion = new getEnvOsVersion(this, th);
                if (getenvtimezone.RatingCompat != null) {
                    getenvosversion.IconCompatParcelizer(getenvtimezone.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void read(getEnvTimeZone getenvtimezone) {
        if (getenvtimezone.RatingCompat != null) {
            getenvtimezone.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getEnvTimeZone getenvtimezone) {
        if (getenvtimezone.RatingCompat != null) {
            getenvtimezone.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getEnvTimeZone getenvtimezone) {
        if (getenvtimezone.RatingCompat != null) {
            getenvtimezone.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(getEnvTimeZone getenvtimezone) {
        if (getenvtimezone.RatingCompat != null) {
            getenvtimezone.RatingCompat.aj_();
        }
    }
}
