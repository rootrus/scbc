package p040o;

import java.util.List;
import p040o.Maps;
import p040o.setFieldNamingStrategy;
import p040o.writeUInt64NoTag;
import p040o.zztx;

/* renamed from: o.serializeNulls */
public final /* synthetic */ class serializeNulls implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setFieldNamingStrategy.read IconCompatParcelizer;
    private final /* synthetic */ zztx.zzb read;

    public /* synthetic */ serializeNulls(setFieldNamingStrategy.read read2, zztx.zzb zzb) {
        this.IconCompatParcelizer = read2;
        this.read = zzb;
    }

    public final void IconCompatParcelizer(Object obj) {
        setFieldNamingStrategy.read read2 = this.IconCompatParcelizer;
        zztx.zzb zzb = this.read;
        getIssueDate getissuedate = (getIssueDate) obj;
        setFieldNamingStrategy.IconCompatParcelizer(setFieldNamingStrategy.this);
        if (setFieldNamingStrategy.write((List) zzb.MediaBrowserCompat$MediaItem) || setFieldNamingStrategy.write((List) zzb.IconCompatParcelizer)) {
            getissuedate.MediaBrowserCompat$CustomActionResultReceiver(setFieldNamingStrategy.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(read2.IconCompatParcelizer, read2.MediaBrowserCompat$CustomActionResultReceiver, getissuedate.MediaDescriptionCompat(), zzb));
            return;
        }
        Maps.ImprovedAbstractMap.C36492 unused = setFieldNamingStrategy.this.IconCompatParcelizer;
        int i = read2.IconCompatParcelizer;
        readStringList readstringlist = read2.MediaBrowserCompat$CustomActionResultReceiver;
        chain MediaDescriptionCompat = getissuedate.MediaDescriptionCompat();
        boolean z = zzb.MediaBrowserCompat$CustomActionResultReceiver;
        String str = zzb.read;
        ComponentContainer componentContainer = new ComponentContainer();
        componentContainer.MediaMetadataCompat = i;
        componentContainer.MediaBrowserCompat$SearchResultReceiver = readstringlist;
        componentContainer.MediaBrowserCompat$ItemReceiver = MediaDescriptionCompat.setGroupDividerEnabled;
        componentContainer.read = MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
        componentContainer.write = MediaDescriptionCompat.MediaDescriptionCompat;
        componentContainer.IconCompatParcelizer = MediaDescriptionCompat.AppCompatViewInflater;
        componentContainer.MediaBrowserCompat$CustomActionResultReceiver = MediaDescriptionCompat.MediaSessionCompat$Token;
        componentContainer.RatingCompat = MediaDescriptionCompat.setItemInvoker;
        componentContainer.MediaSessionCompat$ResultReceiverWrapper = z;
        componentContainer.ParcelableVolumeInfo = str;
        getissuedate.read(componentContainer);
    }
}
