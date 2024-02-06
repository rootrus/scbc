package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzjx;

/* renamed from: o.Page */
public final /* synthetic */ class Page implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ Page MediaBrowserCompat$CustomActionResultReceiver = new Page();

    private /* synthetic */ Page() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIIdExtractionServerOnDeviceFactory) obj).MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: o.Page$Side */
    public final class Side extends writeUInt64NoTag<setProjectProvider> {
        public final setCompatPressedTranslationZResource IconCompatParcelizer;
        /* access modifiers changed from: private */
        public final setItemIconTintList read;

        /* renamed from: o.Page$Side$write */
        public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<setProjectProvider> {
            private /* synthetic */ Side read;

            public write(Side side) {
                this.read = side;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((setProjectProvider) obj).read(Side.MediaBrowserCompat$CustomActionResultReceiver(this.read));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public Side(RegularImmutableBiMap regularImmutableBiMap, setCompatPressedTranslationZResource setcompatpressedtranslationzresource, setItemIconTintList setitemicontintlist) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            onGetStartedClick.write((Object) setcompatpressedtranslationzresource, "setupResultCase");
            onGetStartedClick.write((Object) setitemicontintlist, "getCustomerTypeCase");
            this.IconCompatParcelizer = setcompatpressedtranslationzresource;
            this.read = setitemicontintlist;
        }

        /* renamed from: o.Page$Side$IconCompatParcelizer */
        public static final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzjx.zze> {
            final /* synthetic */ Side MediaBrowserCompat$ItemReceiver;

            /* renamed from: o.Page$Side$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
            static final class C10748IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setProjectProvider> {
                public static final C10748IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new C10748IconCompatParcelizer();

                C10748IconCompatParcelizer() {
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((setProjectProvider) obj).write();
                }
            }

            /* renamed from: o.Page$Side$IconCompatParcelizer$read */
            static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<setProjectProvider> {
                public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

                read() {
                }

                public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((setProjectProvider) obj).IconCompatParcelizer();
                }
            }

            public IconCompatParcelizer(Side side) {
                this.MediaBrowserCompat$ItemReceiver = side;
            }

            public final /* synthetic */ void onNext(Object obj) {
                zzjx.zze zze = (zzjx.zze) obj;
                onGetStartedClick.write((Object) zze, "result");
                super.onNext(zze);
                Side.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
                int i = getDomain.write[zze.MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
                boolean z = false;
                if (i == 1) {
                    Side side = this.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = Page$Side$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver.read;
                    if (side.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(side.RatingCompat);
                    }
                } else if (i == 2) {
                    int i2 = getDomain.read[this.MediaBrowserCompat$ItemReceiver.read.read.MediaBrowserCompat$SearchResultReceiver().ordinal()];
                    if (i2 == 1) {
                        Side side2 = this.MediaBrowserCompat$ItemReceiver;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C10748IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                        if (side2.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer2.IconCompatParcelizer(side2.RatingCompat);
                        }
                    } else if (i2 == 2) {
                        Side side3 = this.MediaBrowserCompat$ItemReceiver;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = read.MediaBrowserCompat$CustomActionResultReceiver;
                        if (side3.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer3.IconCompatParcelizer(side3.RatingCompat);
                        }
                    }
                } else if (i == 3) {
                    int i3 = getDomain.IconCompatParcelizer[this.MediaBrowserCompat$ItemReceiver.read.read.MediaBrowserCompat$SearchResultReceiver().ordinal()];
                    if (i3 == 1) {
                        Side side4 = this.MediaBrowserCompat$ItemReceiver;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = C3724x44b24f67.write;
                        if (side4.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer4.IconCompatParcelizer(side4.RatingCompat);
                        }
                    } else if (i3 == 2) {
                        Side side5 = this.MediaBrowserCompat$ItemReceiver;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer5 = Page$Side$IconCompatParcelizer$MediaBrowserCompat$MediaItem.write;
                        if (side5.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer5.IconCompatParcelizer(side5.RatingCompat);
                        }
                    }
                }
            }

            /* renamed from: o.Page$Side$IconCompatParcelizer$write */
            static final class write implements Runnable {
                private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;

                write(IconCompatParcelizer iconCompatParcelizer) {
                    this.IconCompatParcelizer = iconCompatParcelizer;
                }

                public final void run() {
                    Side side = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C37231.read;
                    if (side.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(side.RatingCompat);
                    }
                }
            }

            public final void onError(Throwable th) {
                onGetStartedClick.write((Object) th, "e");
                super.onError(th);
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new write(this)));
            }
        }

        public static final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Side side) {
            return zzct.zza.BUSINESS_OWNER == side.read.read.MediaBrowserCompat$SearchResultReceiver();
        }

        public static final /* synthetic */ void IconCompatParcelizer(Side side) {
            if (side.RatingCompat != null) {
                side.RatingCompat.aj_();
            }
        }
    }
}
