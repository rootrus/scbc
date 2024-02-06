package p040o;

/* renamed from: o.zzgy$MediaBrowserCompat$ItemReceiver */
final class zzgy$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzgy MediaBrowserCompat$ItemReceiver;

    zzgy$MediaBrowserCompat$ItemReceiver(zzgy zzgy) {
        this.MediaBrowserCompat$ItemReceiver = zzgy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r3 = r1.IconCompatParcelizer;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object write(java.lang.Object r13) {
        /*
            r12 = this;
            com.scb.phone.data.entity.transfer.SingleDataEntity r13 = (com.scb.phone.data.entity.transfer.SingleDataEntity) r13
            java.lang.String r0 = "it"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            o.zzgy r0 = r12.MediaBrowserCompat$ItemReceiver
            o.CredentialRequestResult r0 = r0.IconCompatParcelizer
            java.lang.Object r13 = r13.getData()
            java.lang.String r1 = "it.data"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r13, (java.lang.String) r1)
            o.LottieDrawable$8 r13 = (p040o.LottieDrawable.C36268) r13
            java.lang.String r1 = "entity"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r1)
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            r2 = 0
            if (r1 != 0) goto L_0x0029
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: offfer data is null"
            r1.<init>(r3)
            goto L_0x0098
        L_0x0029:
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            java.lang.Object r1 = r1.get(r2)
            o.LottieDrawable$RepeatMode r1 = (p040o.LottieDrawable.RepeatMode) r1
            java.lang.String r1 = r1.read
            if (r1 != 0) goto L_0x003d
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: offer.defaultCreditLimit is null"
            r1.<init>(r3)
            goto L_0x0098
        L_0x003d:
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            java.lang.Object r1 = r1.get(r2)
            o.LottieDrawable$RepeatMode r1 = (p040o.LottieDrawable.RepeatMode) r1
            java.util.List<java.lang.String> r1 = r1.write
            if (r1 != 0) goto L_0x0051
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: offer.durationOptions is null"
            r1.<init>(r3)
            goto L_0x0098
        L_0x0051:
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            java.lang.Object r1 = r1.get(r2)
            o.LottieDrawable$RepeatMode r1 = (p040o.LottieDrawable.RepeatMode) r1
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            if (r1 != 0) goto L_0x0065
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: offer.maximumCreditLimit is null"
            r1.<init>(r3)
            goto L_0x0098
        L_0x0065:
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            java.lang.Object r1 = r1.get(r2)
            o.LottieDrawable$RepeatMode r1 = (p040o.LottieDrawable.RepeatMode) r1
            java.lang.String r1 = r1.IconCompatParcelizer
            if (r1 != 0) goto L_0x0079
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: offer.minimumCreditLimit is null"
            r1.<init>(r3)
            goto L_0x0098
        L_0x0079:
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            java.lang.Object r1 = r1.get(r2)
            o.LottieDrawable$RepeatMode r1 = (p040o.LottieDrawable.RepeatMode) r1
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 != 0) goto L_0x008d
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: offer.sliderInterval is null"
            r1.<init>(r3)
            goto L_0x0098
        L_0x008d:
            java.lang.String r1 = r13.write
            if (r1 != 0) goto L_0x0098
            com.scb.phone.domain.entity.mwpartner.EntityMappingException r1 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
            java.lang.String r3 = "MCMC: ApplicationId is null"
            r1.<init>(r3)
        L_0x0098:
            java.util.List<o.LottieDrawable$RepeatMode> r1 = r13.IconCompatParcelizer
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r1.get(r2)
            o.LottieDrawable$RepeatMode r1 = (p040o.LottieDrawable.RepeatMode) r1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x00af
            java.lang.String r3 = r1.IconCompatParcelizer
            if (r3 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r5 = r3
            goto L_0x00b0
        L_0x00af:
            r5 = r2
        L_0x00b0:
            if (r1 == 0) goto L_0x00b9
            java.lang.String r3 = r1.MediaBrowserCompat$ItemReceiver
            if (r3 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r6 = r3
            goto L_0x00ba
        L_0x00b9:
            r6 = r2
        L_0x00ba:
            if (r1 == 0) goto L_0x00c3
            java.lang.String r3 = r1.read
            if (r3 != 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r7 = r3
            goto L_0x00c4
        L_0x00c3:
            r7 = r2
        L_0x00c4:
            if (r1 == 0) goto L_0x00cd
            java.lang.String r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 != 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r8 = r3
            goto L_0x00ce
        L_0x00cd:
            r8 = r2
        L_0x00ce:
            if (r1 == 0) goto L_0x00d4
            java.util.List<java.lang.String> r1 = r1.write
            if (r1 != 0) goto L_0x00d8
        L_0x00d4:
            o.HmlNationalIdActivity r1 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r1 = (java.util.List) r1
        L_0x00d8:
            r10 = r1
            java.lang.String r1 = r13.write
            if (r1 != 0) goto L_0x00df
            r9 = r2
            goto L_0x00e0
        L_0x00df:
            r9 = r1
        L_0x00e0:
            java.util.List<o.LottieDrawable$4> r13 = r13.MediaBrowserCompat$ItemReceiver
            java.util.List r11 = r0.MediaBrowserCompat$CustomActionResultReceiver(r13)
            o.zzfo$zze r13 = new o.zzfo$zze
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.zzgy$MediaBrowserCompat$ItemReceiver.write(java.lang.Object):java.lang.Object");
    }
}
