package p040o;

import p040o.CharMatcher;
import p040o.WellBehavedMap;
import p040o.getProject;

/* renamed from: o.getErr */
public class getErr extends getOCRDescription<getProject.read> {
    public boolean IconCompatParcelizer = false;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;
    public boolean MediaMetadataCompat = false;
    public boolean read = false;

    @HmlPinActivity
    public getErr(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, AppendableWriter appendableWriter, WellBehavedMap.KeyToEntryConverter.C39541 r4) {
        super(regularImmutableBiMap, appendableWriter, lookupTable, r4);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z = true;
        if (!this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver.read.isEmpty()) {
            setOriginalValue setoriginalvalue = new setOriginalValue(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setoriginalvalue.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C10861setDocumentId setdocumentid = new C10861setDocumentId(this);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setdocumentid.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(getProject.read read2) {
        read2.write(this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver.read);
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getProject.read read2) {
        read2.write(this.MediaBrowserCompat$ItemReceiver.write().write.MediaBrowserCompat$SearchResultReceiver);
    }
}
