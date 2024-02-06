package p040o;

import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.LinkedListMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName */
public final class setRequestUserName extends writeUInt64NoTag<PassportExtractor> {
    public captureEventData IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public final LinkedListMultimap.AsMapEntries MediaBrowserCompat$SearchResultReceiver;
    public populateThreadData MediaDescriptionCompat;
    boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$Token;
    public String read;
    public populateFramesList write;

    /* renamed from: o.setRequestUserName$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
        private /* synthetic */ int write;

        IconCompatParcelizer(int i) {
            this.write = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportExtractor passportExtractor = (PassportExtractor) obj;
            if (this.write == 1) {
                passportExtractor.MediaBrowserCompat$CustomActionResultReceiver();
                passportExtractor.Keep();
                passportExtractor.MediaBrowserCompat$CustomActionResultReceiver(false);
                return;
            }
            passportExtractor.write();
        }
    }

    /* renamed from: o.setRequestUserName$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractor) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.setRequestUserName$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<populateThreadData, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ setRequestUserName read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(setRequestUserName setrequestusername, int i) {
            super(1);
            this.read = setrequestusername;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            HmlVerifyEmailSuccessfulActivity<String, String> hmlVerifyEmailSuccessfulActivity;
            HmlVerifyEmailSuccessfulActivity<String, String> hmlVerifyEmailSuccessfulActivity2;
            populateThreadData populatethreaddata = (populateThreadData) obj;
            onGetStartedClick.write((Object) populatethreaddata, "it");
            this.read.MediaDescriptionCompat = populatethreaddata;
            setRequestUserName setrequestusername = this.read;
            int i = this.MediaBrowserCompat$ItemReceiver;
            boolean z = false;
            setrequestusername.MediaMetadataCompat = false;
            writeUInt64NoTag.IconCompatParcelizer setrequestusername_mediabrowsercompat_itemreceiver = new setRequestUserName$MediaBrowserCompat$ItemReceiver(i);
            if (setrequestusername.RatingCompat != null) {
                setrequestusername_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setrequestusername.RatingCompat);
            }
            setRequestUserName setrequestusername2 = this.read;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) populatethreaddata, "display");
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(setrequestusername2, populatethreaddata, i2);
            if (setrequestusername2.RatingCompat != null) {
                read2.IconCompatParcelizer(setrequestusername2.RatingCompat);
            }
            if (this.MediaBrowserCompat$ItemReceiver == 1) {
                setRequestUserName setrequestusername3 = this.read;
                populateThreadData populatethreaddata2 = setrequestusername3.MediaDescriptionCompat;
                String str = null;
                setrequestusername3.MediaBrowserCompat$ItemReceiver = (populatethreaddata2 == null || (hmlVerifyEmailSuccessfulActivity2 = populatethreaddata2.MediaDescriptionCompat) == null) ? null : (String) hmlVerifyEmailSuccessfulActivity2.MediaBrowserCompat$CustomActionResultReceiver;
                populateThreadData populatethreaddata3 = setrequestusername3.MediaDescriptionCompat;
                if (!(populatethreaddata3 == null || (hmlVerifyEmailSuccessfulActivity = populatethreaddata3.write) == null)) {
                    str = (String) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
                }
                setrequestusername3.read = str;
                setRequestUserName setrequestusername4 = this.read;
                writeUInt64NoTag.IconCompatParcelizer setrequestusername_mediasessioncompat_queueitem = new setRequestUserName$MediaSessionCompat$QueueItem(setrequestusername4);
                if (setrequestusername4.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setrequestusername_mediasessioncompat_queueitem.IconCompatParcelizer(setrequestusername4.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setRequestUserName$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo extends CheckEligibilityActivity implements FundFactSheetActivity<populateFramesList, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ setRequestUserName IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParcelableVolumeInfo(setRequestUserName setrequestusername) {
            super(1);
            this.IconCompatParcelizer = setrequestusername;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            populateFramesList populateframeslist = (populateFramesList) obj;
            onGetStartedClick.write((Object) populateframeslist, "fundFilterDisplay");
            this.IconCompatParcelizer.write = populateframeslist;
            setRequestUserName setrequestusername = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<PassportExtractor>(this) {
                private /* synthetic */ ParcelableVolumeInfo read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    PassportExtractor passportExtractor = (PassportExtractor) obj;
                    boolean z = true;
                    passportExtractor.IconCompatParcelizer(true);
                    populateFramesList populateframeslist = this.read.IconCompatParcelizer.write;
                    if (populateframeslist != null) {
                        passportExtractor.write(populateframeslist, this.read.IconCompatParcelizer.MediaDescriptionCompat);
                    }
                    setRequestUserName setrequestusername = this.read.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer setrequestusername_mediasessioncompat_queueitem = new setRequestUserName$MediaSessionCompat$QueueItem(setrequestusername);
                    if (setrequestusername.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setrequestusername_mediasessioncompat_queueitem.IconCompatParcelizer(setrequestusername.RatingCompat);
                    }
                }
            };
            if (setrequestusername.RatingCompat != null) {
                r0.IconCompatParcelizer(setrequestusername.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setRequestUserName$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
        private /* synthetic */ setRequestUserName read;

        public RatingCompat(setRequestUserName setrequestusername) {
            this.read = setrequestusername;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractor) obj).write(this.read.IconCompatParcelizer);
        }
    }

    /* renamed from: o.setRequestUserName$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
        private /* synthetic */ setRequestUserName IconCompatParcelizer;
        private /* synthetic */ populateThreadData MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;

        read(setRequestUserName setrequestusername, populateThreadData populatethreaddata, int i) {
            this.IconCompatParcelizer = setrequestusername;
            this.MediaBrowserCompat$CustomActionResultReceiver = populatethreaddata;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportExtractor passportExtractor = (PassportExtractor) obj;
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                passportExtractor.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (this.MediaBrowserCompat$ItemReceiver == 1) {
                passportExtractor.read();
            }
            if (this.MediaBrowserCompat$ItemReceiver == 1) {
                passportExtractor.write(this.IconCompatParcelizer.write, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            Integer num = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
            passportExtractor.IconCompatParcelizer(num != null ? String.valueOf(num.intValue()) : null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setRequestUserName(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.AsMapEntries asMapEntries) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) asMapEntries, "fundDiscoverController");
        this.MediaBrowserCompat$SearchResultReceiver = asMapEntries;
    }

    /* renamed from: o.setRequestUserName$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ getChimeraLifecycleFragmentImpl IconCompatParcelizer;

        private write() {
        }

        public /* synthetic */ write(getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl) {
            this.IconCompatParcelizer = getchimeralifecyclefragmentimpl;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return getChimeraLifecycleFragmentImpl.MediaBrowserCompat$CustomActionResultReceiver((EllipseContent) obj);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setRequestUserName setrequestusername, String str, int i, String str2, String str3, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        setrequestusername.MediaBrowserCompat$CustomActionResultReceiver(str, i, str2, str3);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, int i, String str2, String str3) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        this.MediaBrowserCompat$MediaItem = str;
        boolean z = false;
        if (i == 1) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MediaDescriptionCompat.write;
            if (this.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        }
        if (!this.MediaMetadataCompat) {
            this.MediaMetadataCompat = true;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(i);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
            String read2 = AlertController$RecycleListView.read.read(this.MediaBrowserCompat$MediaItem);
            captureEventData captureeventdata = this.IconCompatParcelizer;
            if (captureeventdata == null || (list = captureeventdata.write) == null) {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<String> list4 = list;
            captureEventData captureeventdata2 = this.IconCompatParcelizer;
            if (captureeventdata2 == null || (list2 = captureeventdata2.MediaBrowserCompat$ItemReceiver) == null) {
                list2 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<String> list5 = list2;
            captureEventData captureeventdata3 = this.IconCompatParcelizer;
            if (captureeventdata3 == null || (list3 = captureeventdata3.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                list3 = HmlNationalIdActivity.IconCompatParcelizer;
            }
            this.MediaBrowserCompat$SearchResultReceiver.write(new EnumHashBiMap(read2, list4, list5, list3, str2, str3, String.valueOf(i), "20"), new MediaMetadataCompat(this, i), new setRequestUserName$MediaBrowserCompat$MediaItem(this, i));
        }
    }

    public final void read() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver.RatingCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            bulkTransferDeepLinkActivity.dispose();
        }
        this.MediaMetadataCompat = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
    }
}
