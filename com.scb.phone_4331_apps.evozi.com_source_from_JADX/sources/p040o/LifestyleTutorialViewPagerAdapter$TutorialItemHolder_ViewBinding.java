package p040o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p040o.GiftOpenSharingMomentActivity;
import p040o.previewButton;

@Deprecated
/* renamed from: o.LifestyleTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding */
public final class LifestyleTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding implements InputDetailsActivity {
    private static final AtomicLong IconCompatParcelizer = new AtomicLong();
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private ErrorPagerAdapter MediaBrowserCompat$ItemReceiver;
    private final onGiftsSendButtonClick MediaBrowserCompat$MediaItem;
    private volatile boolean MediaDescriptionCompat;
    private final RequesterReviewActivity read;
    private DepositViewPagerAdapter$ItemViewHolder write;

    public LifestyleTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding(onGiftsSendButtonClick ongiftssendbuttonclick) {
        this.MediaBrowserCompat$CustomActionResultReceiver = PrepaidOtpActivity.write((Class) getClass());
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(ongiftssendbuttonclick, "Scheme registry");
        this.MediaBrowserCompat$MediaItem = ongiftssendbuttonclick;
        this.read = new OnBoardingTutorialViewPagerAdapter$TutorialItemHolder(ongiftssendbuttonclick);
    }

    public LifestyleTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding() {
        this(InvestmentViewPagerAdapter$ViewHolder_ViewBinding.write());
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            read();
        } finally {
            super.finalize();
        }
    }

    public final onGiftsSendButtonClick MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final RequestToPayInfoActivity_ViewBinding MediaBrowserCompat$ItemReceiver(GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding, Object obj) {
        return new RequestToPayInfoActivity_ViewBinding(giftOpenSharingMomentActivity_ViewBinding, obj) {
            private /* synthetic */ GiftOpenSharingMomentActivity_ViewBinding read;

            {
                this.read = r2;
            }

            public final ScheduleLandingActivity MediaBrowserCompat$CustomActionResultReceiver() {
                return LifestyleTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.this.IconCompatParcelizer(this.read);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final ScheduleLandingActivity IconCompatParcelizer(GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding) {
        ErrorPagerAdapter errorPagerAdapter;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(giftOpenSharingMomentActivity_ViewBinding, "Route");
        synchronized (this) {
            boolean z = true;
            if (!this.MediaDescriptionCompat) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                    PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Get connection for route ");
                    sb.append(giftOpenSharingMomentActivity_ViewBinding);
                    prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
                }
                if (this.MediaBrowserCompat$ItemReceiver != null) {
                    z = false;
                }
                if (z) {
                    if (this.write != null && !((GiftOpenSharingMomentActivity_ViewBinding) this.write.write).equals(giftOpenSharingMomentActivity_ViewBinding)) {
                        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.write;
                        try {
                            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).close();
                        } catch (IOException e) {
                            depositViewPagerAdapter$ItemViewHolder.read.IconCompatParcelizer("I/O error closing connection", e);
                        }
                        this.write = null;
                    }
                    if (this.write == null) {
                        this.write = new DepositViewPagerAdapter$ItemViewHolder(this.MediaBrowserCompat$CustomActionResultReceiver, Long.toString(IconCompatParcelizer.getAndIncrement()), giftOpenSharingMomentActivity_ViewBinding, this.read.MediaBrowserCompat$ItemReceiver(), TimeUnit.MILLISECONDS);
                    }
                    if (this.write.MediaBrowserCompat$CustomActionResultReceiver(System.currentTimeMillis())) {
                        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder2 = this.write;
                        try {
                            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder2.MediaBrowserCompat$CustomActionResultReceiver).close();
                        } catch (IOException e2) {
                            depositViewPagerAdapter$ItemViewHolder2.read.IconCompatParcelizer("I/O error closing connection", e2);
                        }
                        GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = this.write.MediaBrowserCompat$ItemReceiver;
                        sharedMoment_ViewBinding.IconCompatParcelizer = false;
                        sharedMoment_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
                        sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver = previewButton.read.PLAIN;
                        sharedMoment_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = previewButton.IconCompatParcelizer.PLAIN;
                        sharedMoment_ViewBinding.write = false;
                    }
                    errorPagerAdapter = new ErrorPagerAdapter(this, this.read, this.write);
                    this.MediaBrowserCompat$ItemReceiver = errorPagerAdapter;
                } else {
                    throw new IllegalStateException("Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
                }
            } else {
                throw new IllegalStateException("Connection manager has been shut down");
            }
        }
        return errorPagerAdapter;
    }

    private void IconCompatParcelizer(PrepaidRequestSuccessActivity prepaidRequestSuccessActivity) {
        try {
            prepaidRequestSuccessActivity.read();
        } catch (IOException e) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer("I/O exception shutting down connection", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d5, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r12 = r0.IconCompatParcelizer;
        r0.IconCompatParcelizer = null;
        r9.MediaBrowserCompat$ItemReceiver = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e7, code lost:
        if ((!((p040o.DealsSuccessActivity) r9.write.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer()) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e9, code lost:
        r9.write = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00eb, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.ScheduleLandingActivity r10, long r11, java.util.concurrent.TimeUnit r13) {
        /*
            r9 = this;
            r0 = r10
            o.ErrorPagerAdapter r0 = (p040o.ErrorPagerAdapter) r0
            monitor-enter(r0)
            o.PrepaidTravelCoachMarkActivity_ViewBinding r1 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f5 }
            boolean r1 = r1.IconCompatParcelizer()     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0022
            o.PrepaidTravelCoachMarkActivity_ViewBinding r1 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r2.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = "Releasing connection "
            r2.append(r3)     // Catch:{ all -> 0x00f5 }
            r2.append(r10)     // Catch:{ all -> 0x00f5 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00f5 }
            r1.write(r10)     // Catch:{ all -> 0x00f5 }
        L_0x0022:
            o.DepositViewPagerAdapter$ItemViewHolder r10 = r0.IconCompatParcelizer     // Catch:{ all -> 0x00f5 }
            if (r10 != 0) goto L_0x0028
            monitor-exit(r0)
            return
        L_0x0028:
            o.InputDetailsActivity r10 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00f5 }
            r1 = 1
            if (r10 != r9) goto L_0x002f
            r10 = r1
            goto L_0x0030
        L_0x002f:
            r10 = 0
        L_0x0030:
            java.lang.String r2 = "Connection not obtained from this manager"
            if (r10 == 0) goto L_0x00ef
            monitor-enter(r9)     // Catch:{ all -> 0x00f5 }
            boolean r10 = r9.MediaDescriptionCompat     // Catch:{ all -> 0x00ec }
            if (r10 == 0) goto L_0x003f
            r9.IconCompatParcelizer((p040o.PrepaidRequestSuccessActivity) r0)     // Catch:{ all -> 0x00ec }
            monitor-exit(r9)
            monitor-exit(r0)
            return
        L_0x003f:
            r10 = 0
            boolean r2 = r0.IconCompatParcelizer()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x004d
            boolean r2 = r0.read     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x004d
            r9.IconCompatParcelizer((p040o.PrepaidRequestSuccessActivity) r0)     // Catch:{ all -> 0x00d5 }
        L_0x004d:
            boolean r2 = r0.read     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00bd
            o.DepositViewPagerAdapter$ItemViewHolder r2 = r9.write     // Catch:{ all -> 0x00d5 }
            if (r13 == 0) goto L_0x0057
            r3 = r13
            goto L_0x0059
        L_0x0057:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00d5 }
        L_0x0059:
            monitor-enter(r2)     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "Time unit"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r3, (java.lang.String) r4)     // Catch:{ all -> 0x00ba }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            r6 = 0
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x006f
            long r7 = r3.toMillis(r11)     // Catch:{ all -> 0x00ba }
            long r4 = r4 + r7
            goto L_0x0074
        L_0x006f:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0074:
            long r7 = r2.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00ba }
            long r3 = java.lang.Math.min(r4, r7)     // Catch:{ all -> 0x00ba }
            r2.IconCompatParcelizer = r3     // Catch:{ all -> 0x00ba }
            monitor-exit(r2)     // Catch:{ all -> 0x00d5 }
            o.PrepaidTravelCoachMarkActivity_ViewBinding r2 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00d5 }
            boolean r2 = r2.IconCompatParcelizer()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00bd
            if (r6 <= 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r2.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "for "
            r2.append(r3)     // Catch:{ all -> 0x00d5 }
            r2.append(r11)     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = " "
            r2.append(r11)     // Catch:{ all -> 0x00d5 }
            r2.append(r13)     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x00d5 }
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r11 = "indefinitely"
        L_0x00a3:
            o.PrepaidTravelCoachMarkActivity_ViewBinding r12 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r13.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "Connection can be kept alive "
            r13.append(r2)     // Catch:{ all -> 0x00d5 }
            r13.append(r11)     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x00d5 }
            r12.write(r11)     // Catch:{ all -> 0x00d5 }
            goto L_0x00bd
        L_0x00ba:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d5 }
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00bd:
            o.DepositViewPagerAdapter$ItemViewHolder r11 = r0.IconCompatParcelizer     // Catch:{ all -> 0x00ec }
            r0.IconCompatParcelizer = r10     // Catch:{ all -> 0x00ec }
            r9.MediaBrowserCompat$ItemReceiver = r10     // Catch:{ all -> 0x00ec }
            o.DepositViewPagerAdapter$ItemViewHolder r11 = r9.write     // Catch:{ all -> 0x00ec }
            C r11 = r11.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00ec }
            o.DealsSuccessActivity r11 = (p040o.DealsSuccessActivity) r11     // Catch:{ all -> 0x00ec }
            boolean r11 = r11.IconCompatParcelizer()     // Catch:{ all -> 0x00ec }
            r11 = r11 ^ r1
            if (r11 == 0) goto L_0x00d2
            r9.write = r10     // Catch:{ all -> 0x00ec }
        L_0x00d2:
            monitor-exit(r9)
            monitor-exit(r0)
            return
        L_0x00d5:
            r11 = move-exception
            o.DepositViewPagerAdapter$ItemViewHolder r12 = r0.IconCompatParcelizer     // Catch:{ all -> 0x00ec }
            r0.IconCompatParcelizer = r10     // Catch:{ all -> 0x00ec }
            r9.MediaBrowserCompat$ItemReceiver = r10     // Catch:{ all -> 0x00ec }
            o.DepositViewPagerAdapter$ItemViewHolder r12 = r9.write     // Catch:{ all -> 0x00ec }
            C r12 = r12.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00ec }
            o.DealsSuccessActivity r12 = (p040o.DealsSuccessActivity) r12     // Catch:{ all -> 0x00ec }
            boolean r12 = r12.IconCompatParcelizer()     // Catch:{ all -> 0x00ec }
            r12 = r12 ^ r1
            if (r12 == 0) goto L_0x00eb
            r9.write = r10     // Catch:{ all -> 0x00ec }
        L_0x00eb:
            throw r11     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r10 = move-exception
            monitor-exit(r9)
            throw r10     // Catch:{ all -> 0x00f5 }
        L_0x00ef:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            r10.<init>(r2)     // Catch:{ all -> 0x00f5 }
            throw r10     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.LifestyleTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.IconCompatParcelizer(o.ScheduleLandingActivity, long, java.util.concurrent.TimeUnit):void");
    }

    public final void read() {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder;
        synchronized (this) {
            this.MediaDescriptionCompat = true;
            try {
                if (this.write != null) {
                    depositViewPagerAdapter$ItemViewHolder = this.write;
                    ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).close();
                }
            } catch (IOException e) {
                depositViewPagerAdapter$ItemViewHolder.read.IconCompatParcelizer("I/O error closing connection", e);
            } catch (Throwable th) {
                this.write = null;
                this.MediaBrowserCompat$ItemReceiver = null;
                throw th;
            }
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }
}
