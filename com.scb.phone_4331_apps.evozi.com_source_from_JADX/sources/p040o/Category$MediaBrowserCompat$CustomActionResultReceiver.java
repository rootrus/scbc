package p040o;

import p040o.access$2300;

/* renamed from: o.Category$MediaBrowserCompat$CustomActionResultReceiver */
class Category$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<requireActivity$MediaBrowserCompat$CustomActionResultReceiver> {
    final /* synthetic */ Category write;

    Category$MediaBrowserCompat$CustomActionResultReceiver(Category category) {
        this.write = category;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onNext(java.lang.Object r8) {
        /*
            r7 = this;
            o.requireActivity$MediaBrowserCompat$CustomActionResultReceiver r8 = (p040o.requireActivity$MediaBrowserCompat$CustomActionResultReceiver) r8
            o.getPlace r8 = r8.MediaBrowserCompat$ItemReceiver
            o.Category r0 = r7.write
            o.Synchronized$1 r0 = r0.AlertController$RecycleListView
            java.util.List<o.PlaceLikelihoodBuffer> r1 = r8.MediaDescriptionCompat
            int r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.Category r3 = r7.write
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r3 = r3.Keep
            java.lang.String r3 = r3.setCheckable()
            o.discardOldLogFiles r0 = r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3)
            java.util.List<o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver> r1 = r0.read
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0068
            java.util.List<o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver> r0 = r0.read
            o.show r1 = new o.show
            r1.<init>(r0)
            o.collection r0 = p040o.collection.MediaBrowserCompat$CustomActionResultReceiver
            o.show r4 = new o.show
            o.AppCompatSeekBar r5 = r1.write
            o.getNextTransition r6 = new o.getNextTransition
            java.util.Iterator<? extends T> r1 = r1.IconCompatParcelizer
            r6.<init>(r1, r0)
            r4.<init>(r5, r6)
            java.util.Iterator<? extends T> r0 = r4.IconCompatParcelizer
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x004c
            java.util.Iterator<? extends T> r0 = r4.IconCompatParcelizer
            java.lang.Object r0 = r0.next()
            o.isSupportFragmentClass r0 = p040o.isSupportFragmentClass.read(r0)
            goto L_0x0050
        L_0x004c:
            o.isSupportFragmentClass r0 = p040o.isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x0050:
            T r1 = r0.IconCompatParcelizer
            if (r1 == 0) goto L_0x0056
            r1 = r2
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            if (r1 == 0) goto L_0x0068
            T r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x0060
            o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver r0 = (p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver) r0
            goto L_0x0069
        L_0x0060:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r0 = "No value present"
            r8.<init>(r0)
            throw r8
        L_0x0068:
            r0 = 0
        L_0x0069:
            o.Category r1 = r7.write
            p040o.Category.MediaMetadataCompat(r1)
            if (r0 == 0) goto L_0x008f
            o.AbstractMultimap$AsMap$AsMapEntries r1 = p040o.AbstractMultimap.AsMap.AsMapEntries.SUCCESS
            o.AbstractMultimap$AsMap$AsMapEntries r4 = r8.write
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008f
            o.Category r8 = r7.write
            o.nativeDetectGlare r1 = new o.nativeDetectGlare
            r1.<init>(r7, r0)
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r2 = r3
        L_0x0087:
            if (r2 == 0) goto L_0x008e
            T r8 = r8.RatingCompat
            r1.IconCompatParcelizer(r8)
        L_0x008e:
            return
        L_0x008f:
            o.AbstractMultimap$AsMap$AsMapEntries r0 = p040o.AbstractMultimap.AsMap.AsMapEntries.ERROR
            o.AbstractMultimap$AsMap$AsMapEntries r8 = r8.write
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x00aa
            o.Category r8 = r7.write
            o.removeGlare r0 = p040o.removeGlare.MediaBrowserCompat$ItemReceiver
            T r1 = r8.RatingCompat
            if (r1 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r2 = r3
        L_0x00a3:
            if (r2 == 0) goto L_0x00aa
            T r8 = r8.RatingCompat
            r0.IconCompatParcelizer(r8)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Category$MediaBrowserCompat$CustomActionResultReceiver.onNext(java.lang.Object):void");
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
