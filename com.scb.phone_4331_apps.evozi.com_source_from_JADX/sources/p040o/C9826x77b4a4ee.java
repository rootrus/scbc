package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.SharingMomentsPreviewActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C9826x77b4a4ee<T, R> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinActivity<R>> read;
    private BankingAgentTransactionsDeepLinkActivity<? super R> write;

    C9826x77b4a4ee(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinActivity<R>> directDebitDeepLinkActivity) {
        this.write = bankingAgentTransactionsDeepLinkActivity;
        this.read = directDebitDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
            this.write.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r4) {
        /*
            r3 = this;
            boolean r0 = r3.MediaBrowserCompat$ItemReceiver
            r1 = 0
            if (r0 == 0) goto L_0x0023
            boolean r0 = r4 instanceof p040o.DebitCardResetPinActivity
            if (r0 == 0) goto L_0x0022
            o.DebitCardResetPinActivity r4 = (p040o.DebitCardResetPinActivity) r4
            java.lang.Object r0 = r4.MediaBrowserCompat$ItemReceiver
            boolean r0 = p040o.HmlCaptureDocumentActivity.write((java.lang.Object) r0)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r4 = r4.MediaBrowserCompat$ItemReceiver
            boolean r0 = p040o.HmlCaptureDocumentActivity.write((java.lang.Object) r4)
            if (r0 == 0) goto L_0x001f
            java.lang.Throwable r1 = p040o.HmlCaptureDocumentActivity.IconCompatParcelizer(r4)
        L_0x001f:
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r1)
        L_0x0022:
            return
        L_0x0023:
            o.DirectDebitDeepLinkActivity<? super T, ? extends o.DebitCardResetPinActivity<R>> r0 = r3.read     // Catch:{ all -> 0x0072 }
            java.lang.Object r4 = r0.write(r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "The selector returned a null Notification"
            java.lang.Object r4 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r4, r0)     // Catch:{ all -> 0x0072 }
            o.DebitCardResetPinActivity r4 = (p040o.DebitCardResetPinActivity) r4     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r4.MediaBrowserCompat$ItemReceiver
            boolean r0 = p040o.HmlCaptureDocumentActivity.write((java.lang.Object) r0)
            if (r0 == 0) goto L_0x004e
            o.BulkTransferDeepLinkActivity r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r0.dispose()
            java.lang.Object r4 = r4.MediaBrowserCompat$ItemReceiver
            boolean r0 = p040o.HmlCaptureDocumentActivity.write((java.lang.Object) r4)
            if (r0 == 0) goto L_0x004a
            java.lang.Throwable r1 = p040o.HmlCaptureDocumentActivity.IconCompatParcelizer(r4)
        L_0x004a:
            r3.onError(r1)
            return
        L_0x004e:
            java.lang.Object r0 = r4.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 == 0) goto L_0x0060
            o.BulkTransferDeepLinkActivity r4 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r4.dispose()
            r3.onComplete()
            return
        L_0x0060:
            o.BankingAgentTransactionsDeepLinkActivity<? super R> r0 = r3.write
            java.lang.Object r2 = r4.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x006e
            boolean r2 = p040o.HmlCaptureDocumentActivity.write((java.lang.Object) r2)
            if (r2 != 0) goto L_0x006e
            java.lang.Object r1 = r4.MediaBrowserCompat$ItemReceiver
        L_0x006e:
            r0.onNext(r1)
            return
        L_0x0072:
            r4 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r4)
            o.BulkTransferDeepLinkActivity r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r0.dispose()
            r3.onError(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9826x77b4a4ee.onNext(java.lang.Object):void");
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        this.write.onError(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.write.onComplete();
        }
    }
}
