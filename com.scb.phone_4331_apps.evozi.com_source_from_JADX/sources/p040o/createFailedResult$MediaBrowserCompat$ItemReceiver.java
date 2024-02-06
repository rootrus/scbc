package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;

/* renamed from: o.createFailedResult$MediaBrowserCompat$ItemReceiver */
public final class createFailedResult$MediaBrowserCompat$ItemReceiver {
    public rsnScriptSetVarI IconCompatParcelizer;
    public rsnScriptForEach MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public rsnScriptForEach MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat;
    public rsnScriptForEach MediaMetadataCompat;
    public rsnScriptForEach read;
    public int write;

    private createFailedResult$MediaBrowserCompat$ItemReceiver() {
    }

    public createFailedResult$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari, rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2, rsnScriptForEach rsnscriptforeach3, rsnScriptForEach rsnscriptforeach4) throws NotFoundException {
        if (!(rsnscriptforeach == null && rsnscriptforeach3 == null) && (!(rsnscriptforeach2 == null && rsnscriptforeach4 == null) && ((rsnscriptforeach == null || rsnscriptforeach2 != null) && (rsnscriptforeach3 == null || rsnscriptforeach4 != null)))) {
            this.IconCompatParcelizer = rsnscriptsetvari;
            this.MediaMetadataCompat = rsnscriptforeach;
            this.read = rsnscriptforeach2;
            this.MediaBrowserCompat$SearchResultReceiver = rsnscriptforeach3;
            this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptforeach4;
            write();
            return;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public createFailedResult$MediaBrowserCompat$ItemReceiver(createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver) {
        rsnScriptSetVarI rsnscriptsetvari = createfailedresult_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        rsnScriptForEach rsnscriptforeach = createfailedresult_mediabrowsercompat_itemreceiver.MediaMetadataCompat;
        rsnScriptForEach rsnscriptforeach2 = createfailedresult_mediabrowsercompat_itemreceiver.read;
        rsnScriptForEach rsnscriptforeach3 = createfailedresult_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        rsnScriptForEach rsnscriptforeach4 = createfailedresult_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = rsnscriptsetvari;
        this.MediaMetadataCompat = rsnscriptforeach;
        this.read = rsnscriptforeach2;
        this.MediaBrowserCompat$SearchResultReceiver = rsnscriptforeach3;
        this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptforeach4;
        write();
    }

    public void write() {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new rsnScriptForEach(BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompat$SearchResultReceiver.read);
            this.read = new rsnScriptForEach(BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompat$CustomActionResultReceiver.read);
        } else if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new rsnScriptForEach((float) (this.IconCompatParcelizer.IconCompatParcelizer - 1), this.MediaMetadataCompat.read);
            this.MediaBrowserCompat$CustomActionResultReceiver = new rsnScriptForEach((float) (this.IconCompatParcelizer.IconCompatParcelizer - 1), this.read.read);
        }
        this.MediaBrowserCompat$MediaItem = (int) Math.min(this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver, this.read.MediaBrowserCompat$CustomActionResultReceiver);
        this.write = (int) Math.max(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaDescriptionCompat = (int) Math.min(this.MediaMetadataCompat.read, this.MediaBrowserCompat$SearchResultReceiver.read);
        this.MediaBrowserCompat$ItemReceiver = (int) Math.max(this.read.read, this.MediaBrowserCompat$CustomActionResultReceiver.read);
    }
}
