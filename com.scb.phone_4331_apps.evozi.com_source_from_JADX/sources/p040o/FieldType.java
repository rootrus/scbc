package p040o;

import p040o.access$2300;
import p040o.getSessionIdFromSessionFile;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzjx;

/* renamed from: o.FieldType */
public final /* synthetic */ class FieldType implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ FieldType read = new FieldType();

    private /* synthetic */ FieldType() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters_Factory) obj).MenuItemImpl();
    }

    /* renamed from: o.FieldType$DataType */
    public abstract class DataType extends writeUInt64NoTag<SizeDouble> {
        public boolean IconCompatParcelizer = true;
        public zzjx.zze.zza MediaBrowserCompat$ItemReceiver;
        private final setItemIconTintList MediaBrowserCompat$MediaItem;
        private final setExpandedComponentIdHint MediaBrowserCompat$SearchResultReceiver;
        public getSessionIdFromSessionFile.read MediaMetadataCompat;
        public getSessionIdFromSessionFile.read read;
        public final Text write;

        public abstract void IconCompatParcelizer();

        /* renamed from: o.FieldType$DataType$read */
        public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<SizeDouble> {
            private /* synthetic */ boolean read;

            public read(boolean z) {
                this.read = z;
            }

            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((SizeDouble) obj).IconCompatParcelizer(this.read);
            }
        }

        /* renamed from: o.FieldType$DataType$write */
        public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<SizeDouble> {
            public static final write read = new write();

            write() {
            }

            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((SizeDouble) obj).IconCompatParcelizer();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DataType(RegularImmutableBiMap regularImmutableBiMap, setExpandedComponentIdHint setexpandedcomponentidhint, Text text, setItemIconTintList setitemicontintlist) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            onGetStartedClick.write((Object) setexpandedcomponentidhint, "hmlSetupDetailsCase");
            onGetStartedClick.write((Object) text, "hmlConfirmSetupDetailsCase");
            onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
            this.MediaBrowserCompat$SearchResultReceiver = setexpandedcomponentidhint;
            this.write = text;
            this.MediaBrowserCompat$MediaItem = setitemicontintlist;
        }

        /* renamed from: o.FieldType$DataType$IconCompatParcelizer */
        public static final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getSessionIdFromSessionFile> {
            private /* synthetic */ DataType read;

            /* renamed from: o.FieldType$DataType$IconCompatParcelizer$write */
            static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<SizeDouble> {
                private /* synthetic */ getSessionIdFromSessionFile read;

                write(getSessionIdFromSessionFile getsessionidfromsessionfile) {
                    this.read = getsessionidfromsessionfile;
                }

                public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((SizeDouble) obj).IconCompatParcelizer(this.read);
                }
            }

            IconCompatParcelizer(DataType dataType) {
                this.read = dataType;
            }

            public final /* synthetic */ void onNext(Object obj) {
                getSessionIdFromSessionFile getsessionidfromsessionfile = (getSessionIdFromSessionFile) obj;
                onGetStartedClick.write((Object) getsessionidfromsessionfile, "display");
                super.onNext(getsessionidfromsessionfile);
                DataType dataType = this.read;
                writeUInt64NoTag.IconCompatParcelizer write2 = new write(getsessionidfromsessionfile);
                if (dataType.RatingCompat != null) {
                    write2.IconCompatParcelizer(dataType.RatingCompat);
                }
                DataType.IconCompatParcelizer(this.read);
            }

            public final void onError(Throwable th) {
                onGetStartedClick.write((Object) th, "e");
                super.onError(th);
                this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        }

        public final void IconCompatParcelizer(DebitCardResetOtpActivity<getSessionIdFromSessionFile> debitCardResetOtpActivity) {
            onGetStartedClick.write((Object) debitCardResetOtpActivity, "observable");
            this.MediaBrowserCompat$SearchResultReceiver.write(debitCardResetOtpActivity, new IconCompatParcelizer(this));
            writeUInt64NoTag.IconCompatParcelizer fieldType$DataType$MediaBrowserCompat$CustomActionResultReceiver = new FieldType$DataType$MediaBrowserCompat$CustomActionResultReceiver(this);
            if (this.RatingCompat != null) {
                fieldType$DataType$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public void onDestroy() {
            setExpandedComponentIdHint setexpandedcomponentidhint = this.MediaBrowserCompat$SearchResultReceiver;
            if (!setexpandedcomponentidhint.MediaBrowserCompat$MediaItem.isDisposed()) {
                setexpandedcomponentidhint.MediaBrowserCompat$MediaItem.dispose();
            }
            Text text = this.write;
            if (!text.MediaBrowserCompat$MediaItem.isDisposed()) {
                text.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }

        public static final /* synthetic */ boolean read(DataType dataType) {
            return dataType.MediaBrowserCompat$MediaItem.read.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.BUSINESS_OWNER;
        }

        public static final /* synthetic */ void IconCompatParcelizer(DataType dataType) {
            if (dataType.RatingCompat != null) {
                dataType.RatingCompat.aj_();
            }
        }
    }
}
