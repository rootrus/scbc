package p040o;

import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.TileAdapter;

/* renamed from: o.TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver */
public class TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver {
    Map<CreditCardDetailsAdapter$ItemViewHolder, ShortcutAdapter$MyViewHolder> IconCompatParcelizer = new HashMap();
    public List<ShortcutAdapter$MyViewHolder_ViewBinding> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
    public List<ShortcutAdapter$MyViewHolder> MediaBrowserCompat$ItemReceiver = new ArrayList();
    public TileAdapter.AddShortcutHolder_ViewBinding MediaBrowserCompat$MediaItem;
    Map<CreditCardDetailsAdapter$ItemViewHolder, ShortcutAdapter$MyViewHolder_ViewBinding> MediaBrowserCompat$SearchResultReceiver = new HashMap();
    public boolean MediaDescriptionCompat = false;
    public Set<TrustAnchor> MediaMetadataCompat;
    public int MediaSessionCompat$Token = 0;
    public boolean RatingCompat;
    final Date read;
    final PKIXParameters write;

    public TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver(PKIXParameters pKIXParameters) {
        this.write = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.MediaBrowserCompat$MediaItem = new TileAdapter.AddShortcutHolder_ViewBinding(new TileAdapter.AddShortcutHolder_ViewBinding.read(targetCertConstraints).IconCompatParcelizer, (byte) 0);
        }
        Date date = pKIXParameters.getDate();
        this.read = date == null ? new Date() : date;
        this.RatingCompat = pKIXParameters.isRevocationEnabled();
        this.MediaMetadataCompat = pKIXParameters.getTrustAnchors();
    }

    public TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver(TileAdapter.BaseHolder baseHolder) {
        this.write = baseHolder.MediaBrowserCompat$ItemReceiver;
        this.read = baseHolder.read;
        this.MediaBrowserCompat$MediaItem = baseHolder.MediaDescriptionCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(baseHolder.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$SearchResultReceiver = new HashMap(baseHolder.MediaBrowserCompat$MediaItem);
        this.MediaBrowserCompat$ItemReceiver = new ArrayList(baseHolder.IconCompatParcelizer);
        this.IconCompatParcelizer = new HashMap(baseHolder.write);
        this.MediaDescriptionCompat = baseHolder.RatingCompat;
        this.MediaSessionCompat$Token = baseHolder.f5824x50fd9e4a;
        this.RatingCompat = baseHolder.MediaMetadataCompat;
        this.MediaMetadataCompat = baseHolder.MediaBrowserCompat$SearchResultReceiver;
    }
}
