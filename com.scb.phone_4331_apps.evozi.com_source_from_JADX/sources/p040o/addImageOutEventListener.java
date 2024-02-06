package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.ImageClassifier;
import p040o.Multisets;

/* renamed from: o.addImageOutEventListener */
public class addImageOutEventListener extends writeUInt64NoTag<C1162x44a04885> {
    private final onPictureTaken IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public getSessionFile MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public Multisets.SetMultiset MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    public List<performUpdateApp> read;
    public boolean write;

    @HmlPinActivity
    public addImageOutEventListener(RegularImmutableBiMap regularImmutableBiMap, onPictureTaken onpicturetaken, Multisets.SetMultiset setMultiset) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = onpicturetaken;
        this.MediaDescriptionCompat = setMultiset;
    }

    public final void read() {
        this.read = new ArrayList();
        this.MediaBrowserCompat$SearchResultReceiver = false;
        boolean z = true;
        this.MediaMetadataCompat = true;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.IconCompatParcelizer.write();
        this.IconCompatParcelizer.IconCompatParcelizer(new addImageOutEventListener$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        boolean z = false;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        if (MediaBrowserCompat$ItemReceiver(str) < MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read)) {
            getMaxNumberOfResults getmaxnumberofresults = new getMaxNumberOfResults(this);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getmaxnumberofresults.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        this.MediaBrowserCompat$SearchResultReceiver = true;
        setMaxNumberOfResults setmaxnumberofresults = new setMaxNumberOfResults(this);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setmaxnumberofresults.IconCompatParcelizer(this.RatingCompat);
        }
        if (MediaBrowserCompat$ItemReceiver(str2) > 0.0d) {
            write(str, str2);
        }
    }

    public final void write(String str, String str2) {
        double MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(str2);
        boolean z = true;
        if (MediaBrowserCompat$ItemReceiver2 > MediaBrowserCompat$ItemReceiver(str)) {
            this.MediaMetadataCompat = false;
            C4715h hVar = C4715h.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (MediaBrowserCompat$ItemReceiver2 <= 0.0d || MediaBrowserCompat$ItemReceiver2 >= MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read)) {
            this.MediaMetadataCompat = true;
            ImageClassifier.ImageClassificationStatus imageClassificationStatus = new ImageClassifier.ImageClassificationStatus(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                imageClassificationStatus.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            this.MediaMetadataCompat = false;
            ImageClassifier_Factory imageClassifier_Factory = new ImageClassifier_Factory(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                imageClassifier_Factory.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver && this.MediaMetadataCompat && !this.read.isEmpty() && this.write;
    }

    static List<performUpdateApp> IconCompatParcelizer(boolean z, List<performUpdateApp> list) {
        for (performUpdateApp next : list) {
            if (next != null) {
                boolean booleanValue = next.IconCompatParcelizer.booleanValue();
                if (z) {
                    booleanValue = booleanValue && next.MediaDescriptionCompat.booleanValue();
                }
                next.f2919x50fd9e4a = Boolean.valueOf(booleanValue);
            }
        }
        return list;
    }

    static /* synthetic */ void IconCompatParcelizer(addImageOutEventListener addimageouteventlistener) {
        if (addimageouteventlistener.RatingCompat != null) {
            addimageouteventlistener.RatingCompat.aj_();
        }
    }

    private static double MediaBrowserCompat$ItemReceiver(String str) {
        if (str == null || str.length() == 0) {
            return 0.0d;
        }
        return Double.valueOf(str.replaceAll(",", "")).doubleValue();
    }
}
