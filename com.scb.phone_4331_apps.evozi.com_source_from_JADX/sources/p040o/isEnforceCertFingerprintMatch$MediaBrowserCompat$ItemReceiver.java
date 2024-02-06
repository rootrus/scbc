package p040o;

/* renamed from: o.isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver */
public class isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    final /* synthetic */ isEnforceCertFingerprintMatch IconCompatParcelizer;

    private isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver(isEnforceCertFingerprintMatch isenforcecertfingerprintmatch) {
        this.IconCompatParcelizer = isenforcecertfingerprintmatch;
    }

    public /* synthetic */ isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver(isEnforceCertFingerprintMatch isenforcecertfingerprintmatch, byte b) {
        this(isenforcecertfingerprintmatch);
    }

    public final /* synthetic */ void onNext(Object obj) {
        isEnforceCertFingerprintMatch.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        isEnforceCertFingerprintMatch isenforcecertfingerprintmatch = this.IconCompatParcelizer;
        readGenerateAuthTokenResponse readgenerateauthtokenresponse = new readGenerateAuthTokenResponse((String) obj);
        if (isenforcecertfingerprintmatch.RatingCompat != null) {
            readgenerateauthtokenresponse.IconCompatParcelizer(isenforcecertfingerprintmatch.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        isEnforceCertFingerprintMatch.write(this.IconCompatParcelizer);
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            isEnforceCertFingerprintMatch isenforcecertfingerprintmatch = this.IconCompatParcelizer;
            writeGenerateAuthTokenRequestBodyToOutputStream writegenerateauthtokenrequestbodytooutputstream = new writeGenerateAuthTokenRequestBodyToOutputStream(this, th);
            if (isenforcecertfingerprintmatch.RatingCompat != null) {
                writegenerateauthtokenrequestbodytooutputstream.IconCompatParcelizer(isenforcecertfingerprintmatch.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        isEnforceCertFingerprintMatch.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
