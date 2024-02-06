package p040o;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import p040o.TileAdapter;

/* renamed from: o.UnselectedTileAdapter$Holder */
public final class UnselectedTileAdapter$Holder {
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver;
    public int read;
    public String write;

    public UnselectedTileAdapter$Holder() {
    }

    public static TileAdapter.ShortcutHolder_ViewBinding IconCompatParcelizer(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new TileAdapter.ShortcutHolder_ViewBinding(SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder.read(SuitabilityAssessmentAdapter$SuitabilityItemViewHolder.write(C10402xc503e64f.read(x509Certificate.getTBSCertificate())).AppCompatActivity));
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public static TileAdapter.ShortcutHolder_ViewBinding write(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new TileAdapter.ShortcutHolder_ViewBinding(SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder.read(SuitabilityAssessmentAdapter$SuitabilityItemViewHolder.write(C10402xc503e64f.read(x509Certificate.getTBSCertificate())).setBackgroundResource));
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public UnselectedTileAdapter$Holder(int i, String str, String str2, int i2) {
        onGetStartedClick.write((Object) str, "productName");
        onGetStartedClick.write((Object) str2, "productSalesSheet");
        this.read = i;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }
}
