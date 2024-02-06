package p040o;

import p040o.CaptureGuidance;
import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureGuidance$GuidanceSource$MediaBrowserCompat$SearchResultReceiver */
final class C3150x58572467<V> implements writeUInt64NoTag.IconCompatParcelizer<injectOnDeviceExceptionDeserializer> {
    private /* synthetic */ createFromAttributes IconCompatParcelizer;
    private /* synthetic */ CaptureGuidance.GuidanceSource write;

    C3150x58572467(CaptureGuidance.GuidanceSource guidanceSource, createFromAttributes createfromattributes) {
        this.write = guidanceSource;
        this.IconCompatParcelizer = createfromattributes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r2 = r2.read;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r14) {
        /*
            r13 = this;
            o.injectOnDeviceExceptionDeserializer r14 = (p040o.injectOnDeviceExceptionDeserializer) r14
            o.CaptureGuidance$GuidanceSource r0 = r13.write
            o.AbstractExecutionThreadService r0 = r0.write
            o.createFromAttributes r1 = r13.IconCompatParcelizer
            java.lang.String r2 = "domain"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            o.onSnapshotReady r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x005a
            java.util.List<o.onPolylineClick> r2 = r2.write
            if (r2 == 0) goto L_0x005a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            java.lang.String r5 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r5)
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto L_0x002d
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
        L_0x002d:
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r2.next()
            o.onPolylineClick r4 = (p040o.onPolylineClick) r4
            o.CrashlyticsReport$Session$OperatingSystem$Builder r12 = new o.CrashlyticsReport$Session$OperatingSystem$Builder
            java.lang.String r6 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.String r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r4.IconCompatParcelizer
            java.lang.String r9 = r4.write
            java.lang.String r10 = r4.read
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.add(r12)
            goto L_0x0036
        L_0x0057:
            java.util.List r3 = (java.util.List) r3
            goto L_0x005f
        L_0x005a:
            o.HmlNationalIdActivity r2 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            r3 = r2
            java.util.List r3 = (java.util.List) r3
        L_0x005f:
            o.onSnapshotReady r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r4 = 0
            if (r2 == 0) goto L_0x007b
            o.GoogleMap$OnPolylineClickListener r2 = r2.read
            if (r2 == 0) goto L_0x007b
            java.lang.String r6 = r2.MediaBrowserCompat$ItemReceiver
            java.lang.String r7 = r2.read
            java.lang.String r8 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = r2.IconCompatParcelizer
            java.lang.String r10 = r2.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r11 = r2.write
            o.processInstanceComponents r2 = new o.processInstanceComponents
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x007c
        L_0x007b:
            r2 = r4
        L_0x007c:
            o.CrashlyticsReport$Session$Event$Application$Execution$Exception r5 = new o.CrashlyticsReport$Session$Event$Application$Execution$Exception
            r5.<init>()
            java.lang.String r6 = r1.read
            java.lang.String r7 = "<set-?>"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r7)
            r5.setPrimaryBackground = r6
            java.lang.String r6 = r1.MediaMetadataCompat
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r7)
            r5.setTabContainer = r6
            java.lang.String r6 = r1.MediaBrowserCompat$MediaItem
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r7)
            r5.ActionBarContextView = r6
            java.lang.String r6 = r1.MediaDescriptionCompat
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r7)
            r5.setSubtitle = r6
            o.CrashlyticsReportJsonTransform$$Lambda$9 r6 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.BILL_PAYMENT
            java.lang.String r6 = r6.code
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r7)
            r5.setStackedBackground = r6
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r7)
            r5.setCustomView = r3
            r5.ActionBarContainer = r2
            o.onSnapshotReady r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x00b6
            java.lang.String r2 = r2.IconCompatParcelizer
            goto L_0x00b7
        L_0x00b6:
            r2 = r4
        L_0x00b7:
            r5.setVisibility = r2
            java.lang.String r2 = r1.MediaMetadataCompat
            o.CrashlyticsReport$Session$Event$Application$Execution r2 = r5.MediaBrowserCompat$CustomActionResultReceiver(r2)
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.reference_1
            android.content.res.Resources r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r5.getString(r3)
            r2.setIcon = r3
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.reference_2
            android.content.res.Resources r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r5.getString(r3)
            r2.setPadding = r3
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.reference_3
            android.content.res.Resources r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r0.getString(r3)
            r2.setItemInvoker = r0
            o.onMyLocationClick r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x00e5
        L_0x00e4:
            r0 = r4
        L_0x00e5:
            r2.setPopupCallback = r0
            o.onMyLocationClick r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r0.read
            goto L_0x00ef
        L_0x00ee:
            r0 = r4
        L_0x00ef:
            r2.setGroupDividerEnabled = r0
            o.onMyLocationClick r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = r0.MediaBrowserCompat$MediaItem
            goto L_0x00f9
        L_0x00f8:
            r0 = r4
        L_0x00f9:
            r2.ExpandedMenuView = r0
            java.lang.String r0 = r1.read
            r2.f2698x50fd9e4a = r0
            o.onMyLocationClick r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            goto L_0x0107
        L_0x0106:
            r0 = r4
        L_0x0107:
            r2.MediaBrowserCompat$SearchResultReceiver = r0
            o.onMyLocationClick r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            goto L_0x0111
        L_0x0110:
            r0 = r4
        L_0x0111:
            r2.MediaDescriptionCompat = r0
            o.onMyLocationClick r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x0120
            java.lang.Double r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x0120
            double r5 = r0.doubleValue()
            goto L_0x0122
        L_0x0120:
            r5 = 0
        L_0x0122:
            java.lang.String r0 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r5)
            r2.MediaBrowserCompat$MediaItem = r0
            o.onSnapshotReady r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0132
            o.GoogleMap$OnPolylineClickListener r0 = r0.read
            if (r0 == 0) goto L_0x0132
            java.lang.String r4 = r0.MediaBrowserCompat$SearchResultReceiver
        L_0x0132:
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = r2.IconCompatParcelizer(r4)
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = r0.MediaMetadataCompat()
            o.CrashlyticsReport$Session$Event$Application$Execution$Exception r0 = (p040o.CrashlyticsReport.Session.Event.Application.Execution.Exception) r0
            o.CaptureGuidance$GuidanceSource r1 = r13.write
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            o.CaptureGuidance$GuidanceSource r2 = r13.write
            java.lang.String r2 = r2.IconCompatParcelizer
            r14.MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C3150x58572467.IconCompatParcelizer(java.lang.Object):void");
    }
}
