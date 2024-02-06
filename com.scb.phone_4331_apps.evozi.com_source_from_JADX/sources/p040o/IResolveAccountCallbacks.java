package p040o;

import p040o.nativeIsGuidanceAvailable;

/* renamed from: o.IResolveAccountCallbacks */
public final /* synthetic */ class IResolveAccountCallbacks implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setDefaultNotificationChannelId MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ IResolveAccountCallbacks(setDefaultNotificationChannelId setdefaultnotificationchannelid) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setdefaultnotificationchannelid;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
    }

    /* renamed from: o.IResolveAccountCallbacks$Stub */
    public final /* synthetic */ class Stub implements DirectDebitDeepLinkActivity {
        public /* synthetic */ Stub(zzap zzap) {
        }

        public final Object write(Object obj) {
            getDuration getduration = (getDuration) obj;
            getLabel getlabel = new getLabel();
            getlabel.MediaBrowserCompat$ItemReceiver = getduration.MediaBrowserCompat$ItemReceiver;
            getlabel.MediaBrowserCompat$CustomActionResultReceiver = getduration.write;
            getlabel.IconCompatParcelizer = getduration.read;
            getlabel.write = getduration.IconCompatParcelizer;
            return getlabel;
        }

        /* renamed from: o.IResolveAccountCallbacks$Stub$Proxy */
        public final /* synthetic */ class Proxy implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ nativeIsGuidanceAvailable.read MediaBrowserCompat$CustomActionResultReceiver;

            public /* synthetic */ Proxy(nativeIsGuidanceAvailable.read read) {
                this.MediaBrowserCompat$CustomActionResultReceiver = read;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
                r7 = p040o.GoodToKnowActivity.read(r7);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object write(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r17
                    o.LinkedHashTreeMap$KeySet r0 = (p040o.LinkedHashTreeMap.KeySet) r0
                    java.lang.String r1 = "entity"
                    p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                    java.lang.String r2 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.String r3 = r0.write
                    java.lang.String r4 = "1"
                    boolean r3 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r3, (java.lang.Object) r4)
                    java.util.List<o.LinkedHashTreeMap$LinkedTreeMapIterator> r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                    if (r0 == 0) goto L_0x008e
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r6 = 10
                    java.lang.String r7 = "$this$collectionSizeOrDefault"
                    p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r7)
                    boolean r7 = r0 instanceof java.util.Collection
                    if (r7 == 0) goto L_0x002d
                    r6 = r0
                    java.util.Collection r6 = (java.util.Collection) r6
                    int r6 = r6.size()
                L_0x002d:
                    r5.<init>(r6)
                    java.util.Collection r5 = (java.util.Collection) r5
                    java.util.Iterator r0 = r0.iterator()
                L_0x0036:
                    boolean r6 = r0.hasNext()
                    if (r6 == 0) goto L_0x008b
                    java.lang.Object r6 = r0.next()
                    o.LinkedHashTreeMap$LinkedTreeMapIterator r6 = (p040o.LinkedHashTreeMap.LinkedTreeMapIterator) r6
                    p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r1)
                    java.lang.String r8 = r6.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r7 = r6.MediaBrowserCompat$MediaItem
                    if (r7 == 0) goto L_0x0056
                    java.lang.Integer r7 = p040o.GoodToKnowActivity.read(r7)
                    if (r7 == 0) goto L_0x0056
                    int r7 = r7.intValue()
                    goto L_0x0057
                L_0x0056:
                    r7 = 0
                L_0x0057:
                    r9 = r7
                    java.lang.String r7 = r6.MediaBrowserCompat$SearchResultReceiver
                    java.lang.String r10 = ""
                    if (r7 != 0) goto L_0x0060
                    r11 = r10
                    goto L_0x0061
                L_0x0060:
                    r11 = r7
                L_0x0061:
                    java.lang.String r7 = r6.write
                    if (r7 != 0) goto L_0x0067
                    r12 = r10
                    goto L_0x0068
                L_0x0067:
                    r12 = r7
                L_0x0068:
                    java.lang.String r7 = r6.MediaBrowserCompat$ItemReceiver
                    if (r7 != 0) goto L_0x006e
                    r13 = r10
                    goto L_0x006f
                L_0x006e:
                    r13 = r7
                L_0x006f:
                    java.lang.String r7 = r6.IconCompatParcelizer
                    if (r7 != 0) goto L_0x0075
                    r14 = r10
                    goto L_0x0076
                L_0x0075:
                    r14 = r7
                L_0x0076:
                    java.lang.String r6 = r6.read
                    boolean r6 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r6, (java.lang.Object) r4)
                    o.addMarker r15 = new o.addMarker
                    r7 = r15
                    r10 = r11
                    r11 = r12
                    r12 = r13
                    r13 = r14
                    r14 = r6
                    r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                    r5.add(r15)
                    goto L_0x0036
                L_0x008b:
                    java.util.List r5 = (java.util.List) r5
                    goto L_0x0093
                L_0x008e:
                    o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
                    r5 = r0
                    java.util.List r5 = (java.util.List) r5
                L_0x0093:
                    o.addCircle r0 = new o.addCircle
                    r0.<init>(r2, r3, r5)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.IResolveAccountCallbacks.Stub.Proxy.write(java.lang.Object):java.lang.Object");
            }
        }
    }
}
