package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.CreditCardCaptureModule;
import p040o.MapMaker;
import p040o.writeUInt64NoTag;

/* renamed from: o.getHeartBeatCode */
public final class getHeartBeatCode extends writeUInt64NoTag<CreditCardCaptureModule.read> {
    MapMaker.C36381 IconCompatParcelizer;
    public getKeepAlive write;

    /* renamed from: o.getHeartBeatCode$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        final /* synthetic */ getHeartBeatCode MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(getHeartBeatCode getheartbeatcode) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getheartbeatcode;
        }

        /* renamed from: o.getHeartBeatCode$IconCompatParcelizer$read */
        static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule.read> {
            private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
            private /* synthetic */ Throwable write;

            read(IconCompatParcelizer iconCompatParcelizer, Throwable th) {
                this.IconCompatParcelizer = iconCompatParcelizer;
                this.write = th;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                final CreditCardCaptureModule.read read = (CreditCardCaptureModule.read) obj;
                read.write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, (Runnable) new Runnable() {
                    public final void run() {
                        read.write();
                    }
                }));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r0.equals("3002") != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
            if (r0.equals("3001") != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            if (r0.equals("3000") != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            r0 = r4.MediaBrowserCompat$CustomActionResultReceiver;
            r3 = new p040o.getHeartBeatCode.IconCompatParcelizer.read(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
            if (r0.RatingCompat == null) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
            r3.IconCompatParcelizer(r0.RatingCompat);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                o.getHeartBeatCode r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                p040o.getHeartBeatCode.MediaBrowserCompat$ItemReceiver(r0)
                boolean r0 = r5 instanceof com.scb.phone.domain.entity.mwpartner.EntityMappingException
                if (r0 != 0) goto L_0x0082
                boolean r0 = r5 instanceof com.scb.phone.domain.errors.RetrofitException
                if (r0 == 0) goto L_0x0082
                r0 = r5
                com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
                o.ILocationSourceDelegate r1 = r0.IconCompatParcelizer
                if (r1 == 0) goto L_0x007a
                o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
                java.lang.String r1 = "throwable.response"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                o.ILocationSourceDelegate$zza r0 = r0.write
                java.lang.String r1 = "error"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r0 = r0.IconCompatParcelizer
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0063
                int r3 = r0.hashCode()
                switch(r3) {
                    case 1567005: goto L_0x0044;
                    case 1567006: goto L_0x003b;
                    case 1567007: goto L_0x0032;
                    default: goto L_0x0031;
                }
            L_0x0031:
                goto L_0x0063
            L_0x0032:
                java.lang.String r3 = "3002"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x0063
                goto L_0x004c
            L_0x003b:
                java.lang.String r3 = "3001"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x0063
                goto L_0x004c
            L_0x0044:
                java.lang.String r3 = "3000"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x0063
            L_0x004c:
                o.getHeartBeatCode r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                o.getHeartBeatCode$IconCompatParcelizer$read r3 = new o.getHeartBeatCode$IconCompatParcelizer$read
                r3.<init>(r4, r5)
                o.writeUInt64NoTag$IconCompatParcelizer r3 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r3
                T r5 = r0.RatingCompat
                if (r5 == 0) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r1 = r2
            L_0x005b:
                if (r1 == 0) goto L_0x0062
                T r5 = r0.RatingCompat
                r3.IconCompatParcelizer(r5)
            L_0x0062:
                return
            L_0x0063:
                o.getHeartBeatCode r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                o.getHeartBeatCode$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.getHeartBeatCode$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver
                r3.<init>(r4, r5)
                o.writeUInt64NoTag$IconCompatParcelizer r3 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r3
                T r5 = r0.RatingCompat
                if (r5 == 0) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r1 = r2
            L_0x0072:
                if (r1 == 0) goto L_0x0079
                T r5 = r0.RatingCompat
                r3.IconCompatParcelizer(r5)
            L_0x0079:
                return
            L_0x007a:
                o.getHeartBeatCode r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r5, (p040o.access$2300.write) r1))
                return
            L_0x0082:
                o.getHeartBeatCode r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r5, (p040o.access$2300.write) r1))
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getHeartBeatCode.IconCompatParcelizer.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    /* renamed from: o.getHeartBeatCode$read */
    public static final class read<T> implements DebitCardMarketConductDeepLinkActivity<zzxh> {
        private /* synthetic */ getHeartBeatCode IconCompatParcelizer;
        final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public read(getHeartBeatCode getheartbeatcode, boolean z, String str) {
            this.IconCompatParcelizer = getheartbeatcode;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            zzxh zzxh = (zzxh) obj;
            getHeartBeatCode.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            MapMaker.C36381 r0 = this.IconCompatParcelizer.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) zzxh, "bScanCLanding");
            onGetStartedClick.write((Object) zzxh, "bScanCEntryPoint");
            CharSequence charSequence = zzxh.read;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                String IconCompatParcelizer2 = r0.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(zzxh.read));
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "transformToDateMonthYear…tryPoint.expiryDateTime))");
                str = IconCompatParcelizer2;
            } else {
                str = "";
            }
            String str5 = zzxh.MediaBrowserCompat$CustomActionResultReceiver;
            if (str5 == null) {
                str2 = "";
            } else {
                str2 = str5;
            }
            String str6 = zzxh.MediaBrowserCompat$ItemReceiver;
            if (str6 == null) {
                str3 = "";
            } else {
                str3 = str6;
            }
            String str7 = zzxh.write;
            if (str7 == null) {
                str4 = "";
            } else {
                str4 = str7;
            }
            String write = MapMaker.C36381.write(zzxh.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(bScanCEntryPoint.remainingLimit)");
            final shutdownNow shutdownnow = new shutdownNow(str2, str, str3, str4, write);
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                getHeartBeatCode getheartbeatcode = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule.read>(this) {
                    private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        ((CreditCardCaptureModule.read) obj).MediaBrowserCompat$ItemReceiver(shutdownnow, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                };
                if (getheartbeatcode.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    r1.IconCompatParcelizer(getheartbeatcode.RatingCompat);
                    return;
                }
                return;
            }
            String str8 = shutdownnow.write;
            int hashCode = str8.hashCode();
            if (hashCode != 506208795) {
                if (hashCode == 665830903 && str8.equals("LANDING")) {
                    getHeartBeatCode getheartbeatcode2 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer r12 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule.read>(this) {
                        private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

                        {
                            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                        }

                        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                            ((CreditCardCaptureModule.read) obj).MediaBrowserCompat$CustomActionResultReceiver(shutdownnow, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
                        }
                    };
                    if (getheartbeatcode2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        r12.IconCompatParcelizer(getheartbeatcode2.RatingCompat);
                    }
                }
            } else if (str8.equals("ONBOARDING")) {
                getHeartBeatCode getheartbeatcode3 = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer r13 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule.read>(this) {
                    private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        ((CreditCardCaptureModule.read) obj).MediaBrowserCompat$ItemReceiver(shutdownnow, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                };
                if (getheartbeatcode3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    r13.IconCompatParcelizer(getheartbeatcode3.RatingCompat);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getHeartBeatCode(RegularImmutableBiMap regularImmutableBiMap, getKeepAlive getkeepalive, MapMaker.C36381 r4) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getkeepalive, "bScanCCase");
        onGetStartedClick.write((Object) r4, "bScanCLandingDisplayMapper");
        this.write = getkeepalive;
        this.IconCompatParcelizer = r4;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getHeartBeatCode getheartbeatcode) {
        if (getheartbeatcode.RatingCompat != null) {
            getheartbeatcode.RatingCompat.aj_();
        }
    }
}
