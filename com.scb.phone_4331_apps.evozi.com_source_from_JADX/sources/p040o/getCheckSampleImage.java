package p040o;

import p040o.StandardTable;
import p040o.access$2300;

/* renamed from: o.getCheckSampleImage */
public class getCheckSampleImage extends writeUInt64NoTag<C7130hD> {
    public final StandardTable.RowKeySet IconCompatParcelizer;
    public final StandardTable.ColumnMap.ColumnMapValues MediaBrowserCompat$ItemReceiver;
    public final getClassInfo MediaBrowserCompat$MediaItem;
    private final GoogleJsonResponseException MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final toPrettyString MediaMetadataCompat;
    public final PlayCoreDialogWrapperActivity read;
    public final setPasswordVisibilityToggleTintList write;

    @HmlPinActivity
    public getCheckSampleImage(setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist, getClassInfo getclassinfo, GoogleJsonResponseException googleJsonResponseException, PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity, StandardTable.RowKeySet rowKeySet, StandardTable.ColumnMap.ColumnMapValues columnMapValues, RegularImmutableBiMap regularImmutableBiMap, toPrettyString toprettystring) {
        super(regularImmutableBiMap);
        this.write = setpasswordvisibilitytoggletintlist;
        this.MediaBrowserCompat$MediaItem = getclassinfo;
        this.MediaDescriptionCompat = googleJsonResponseException;
        this.read = playCoreDialogWrapperActivity;
        this.IconCompatParcelizer = rowKeySet;
        this.MediaBrowserCompat$ItemReceiver = columnMapValues;
        this.MediaMetadataCompat = toprettystring;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCheckSampleImage getchecksampleimage) {
        if (getchecksampleimage.RatingCompat != null) {
            getchecksampleimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(getCheckSampleImage getchecksampleimage) {
        if (getchecksampleimage.RatingCompat != null) {
            getchecksampleimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getCheckSampleImage getchecksampleimage) {
        if (getchecksampleimage.RatingCompat != null) {
            getchecksampleimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getCheckSampleImage getchecksampleimage) {
        if (getchecksampleimage.RatingCompat != null) {
            getchecksampleimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getCheckSampleImage getchecksampleimage) {
        if (getchecksampleimage.RatingCompat != null) {
            getchecksampleimage.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaDescriptionCompat.write(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<getRating>() {
            public final /* synthetic */ void onNext(Object obj) {
                getCheckSampleImage.MediaBrowserCompat$SearchResultReceiver(getCheckSampleImage.this);
                getCheckSampleImage getchecksampleimage = getCheckSampleImage.this;
                isCriteriaMet iscriteriamet = new isCriteriaMet(this, (getRating) obj);
                if (getchecksampleimage.RatingCompat != null) {
                    iscriteriamet.IconCompatParcelizer(getchecksampleimage.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                getCheckSampleImage.this.MediaBrowserCompat$ItemReceiver(getCheckSampleImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        });
    }
}
