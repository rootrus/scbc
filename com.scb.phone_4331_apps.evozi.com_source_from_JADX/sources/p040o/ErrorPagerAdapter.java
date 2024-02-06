package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpException;
import org.apache.http.impl.conn.ConnectionShutdownException;
import p040o.GiftOpenSharingMomentActivity;
import p040o.previewButton;

@Deprecated
/* renamed from: o.ErrorPagerAdapter */
final class ErrorPagerAdapter implements ScheduleLandingActivity {
    volatile DepositViewPagerAdapter$ItemViewHolder IconCompatParcelizer;
    private volatile long MediaBrowserCompat$CustomActionResultReceiver = Long.MAX_VALUE;
    final InputDetailsActivity MediaBrowserCompat$ItemReceiver;
    volatile boolean read = false;
    private final RequesterReviewActivity write;

    ErrorPagerAdapter(InputDetailsActivity inputDetailsActivity, RequesterReviewActivity requesterReviewActivity, DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inputDetailsActivity, "Connection manager");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(requesterReviewActivity, "Connection operator");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositViewPagerAdapter$ItemViewHolder, "HTTP pool entry");
        this.MediaBrowserCompat$ItemReceiver = inputDetailsActivity;
        this.write = requesterReviewActivity;
        this.IconCompatParcelizer = depositViewPagerAdapter$ItemViewHolder;
    }

    public final void close() throws IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver;
            sharedMoment_ViewBinding.IconCompatParcelizer = false;
            sharedMoment_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
            sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver = previewButton.read.PLAIN;
            sharedMoment_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = previewButton.IconCompatParcelizer.PLAIN;
            sharedMoment_ViewBinding.write = false;
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).close();
        }
    }

    public final void read() throws IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver;
            sharedMoment_ViewBinding.IconCompatParcelizer = false;
            sharedMoment_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
            sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver = previewButton.read.PLAIN;
            sharedMoment_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = previewButton.IconCompatParcelizer.PLAIN;
            sharedMoment_ViewBinding.write = false;
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).read();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DealsSuccessActivity dealsSuccessActivity;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(giftOpenSharingMomentActivity_ViewBinding, "Route");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(sharedMoment_ViewBinding, "Route tracker");
                if (!sharedMoment_ViewBinding.IconCompatParcelizer) {
                    dealsSuccessActivity = (DealsSuccessActivity) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    throw new IllegalStateException("Connection already open");
                }
            } else {
                throw new ConnectionShutdownException();
            }
        }
        PrivacyManagementLandingViewHolder read2 = giftOpenSharingMomentActivity_ViewBinding.read();
        this.write.read(dealsSuccessActivity, read2 != null ? read2 : giftOpenSharingMomentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver, giftOpenSharingMomentActivity_ViewBinding.write, creditCardBilledDetailAdapter$ParentViewHolder, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                if (read2 == null) {
                    boolean MediaBrowserCompat$MediaItem = dealsSuccessActivity.MediaBrowserCompat$MediaItem();
                    if (!sharedMoment_ViewBinding2.IconCompatParcelizer) {
                        sharedMoment_ViewBinding2.IconCompatParcelizer = true;
                        sharedMoment_ViewBinding2.write = MediaBrowserCompat$MediaItem;
                    } else {
                        throw new IllegalStateException("Already connected");
                    }
                } else {
                    boolean MediaBrowserCompat$MediaItem2 = dealsSuccessActivity.MediaBrowserCompat$MediaItem();
                    DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(read2, "Proxy host");
                    if (!sharedMoment_ViewBinding2.IconCompatParcelizer) {
                        sharedMoment_ViewBinding2.IconCompatParcelizer = true;
                        sharedMoment_ViewBinding2.MediaBrowserCompat$ItemReceiver = new PrivacyManagementLandingViewHolder[]{read2};
                        sharedMoment_ViewBinding2.write = MediaBrowserCompat$MediaItem2;
                    } else {
                        throw new IllegalStateException("Already connected");
                    }
                }
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    public final void IconCompatParcelizer(boolean z, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder;
        DealsSuccessActivity dealsSuccessActivity;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(sharedMoment_ViewBinding, "Route tracker");
                if (sharedMoment_ViewBinding.IconCompatParcelizer) {
                    if (!(sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver == previewButton.read.TUNNELLED)) {
                        privacyManagementLandingViewHolder = sharedMoment_ViewBinding.MediaMetadataCompat;
                        dealsSuccessActivity = (DealsSuccessActivity) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                    } else {
                        throw new IllegalStateException("Connection is already tunnelled");
                    }
                } else {
                    throw new IllegalStateException("Connection not open");
                }
            } else {
                throw new ConnectionShutdownException();
            }
        }
        dealsSuccessActivity.MediaBrowserCompat$ItemReceiver((Socket) null, privacyManagementLandingViewHolder, false, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                if (sharedMoment_ViewBinding2.IconCompatParcelizer) {
                    DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(sharedMoment_ViewBinding2.MediaBrowserCompat$ItemReceiver, "No tunnel without proxy");
                    sharedMoment_ViewBinding2.MediaBrowserCompat$SearchResultReceiver = previewButton.read.TUNNELLED;
                    sharedMoment_ViewBinding2.write = false;
                } else {
                    throw new IllegalStateException("No tunnel unless connected");
                }
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder;
        DealsSuccessActivity dealsSuccessActivity;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                DepositTransactionAdapter$GroupItemViewHolder_ViewBinding.read(sharedMoment_ViewBinding, "Route tracker");
                if (sharedMoment_ViewBinding.IconCompatParcelizer) {
                    boolean z = false;
                    if (sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver == previewButton.read.TUNNELLED) {
                        if (sharedMoment_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == previewButton.IconCompatParcelizer.LAYERED) {
                            z = true;
                        }
                        if (!z) {
                            privacyManagementLandingViewHolder = sharedMoment_ViewBinding.MediaMetadataCompat;
                            dealsSuccessActivity = (DealsSuccessActivity) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                        } else {
                            throw new IllegalStateException("Multiple protocol layering not supported");
                        }
                    } else {
                        throw new IllegalStateException("Protocol layering without a tunnel not supported");
                    }
                } else {
                    throw new IllegalStateException("Connection not open");
                }
            } else {
                throw new ConnectionShutdownException();
            }
        }
        this.write.MediaBrowserCompat$CustomActionResultReceiver(dealsSuccessActivity, privacyManagementLandingViewHolder, creditCardBilledDetailAdapter$ParentViewHolder, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                boolean MediaBrowserCompat$MediaItem = dealsSuccessActivity.MediaBrowserCompat$MediaItem();
                if (sharedMoment_ViewBinding2.IconCompatParcelizer) {
                    sharedMoment_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver = previewButton.IconCompatParcelizer.LAYERED;
                    sharedMoment_ViewBinding2.write = MediaBrowserCompat$MediaItem;
                } else {
                    throw new IllegalStateException("No layered protocol unless connected");
                }
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    public final void ParcelableVolumeInfo() {
        this.read = true;
    }

    public final void MediaSessionCompat$QueueItem() {
        this.read = false;
    }

    public final void read(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit.toMillis(j);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
        }
    }

    public final void MediaMetadataCompat() {
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, this.MediaBrowserCompat$CustomActionResultReceiver, TimeUnit.MILLISECONDS);
                this.IconCompatParcelizer = null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void RatingCompat() {
        /*
            r4 = this;
            monitor-enter(r4)
            o.DepositViewPagerAdapter$ItemViewHolder r0 = r4.IconCompatParcelizer     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 0
            r4.read = r0     // Catch:{ all -> 0x0021 }
            o.DepositViewPagerAdapter$ItemViewHolder r0 = r4.IconCompatParcelizer     // Catch:{ all -> 0x0021 }
            C r0 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0021 }
            o.DealsSuccessActivity r0 = (p040o.DealsSuccessActivity) r0     // Catch:{ all -> 0x0021 }
            r0.read()     // Catch:{ IOException -> 0x0013 }
        L_0x0013:
            o.InputDetailsActivity r0 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0021 }
            long r1 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0021 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0021 }
            r0.IconCompatParcelizer(r4, r1, r3)     // Catch:{ all -> 0x0021 }
            r0 = 0
            r4.IconCompatParcelizer = r0     // Catch:{ all -> 0x0021 }
            monitor-exit(r4)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPagerAdapter.RatingCompat():void");
    }

    public final void write() throws IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).write();
            return;
        }
        throw new ConnectionShutdownException();
    }

    public final InetAddress MediaBrowserCompat$SearchResultReceiver() {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            return ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$SearchResultReceiver();
        }
        throw new ConnectionShutdownException();
    }

    public final int MediaDescriptionCompat() {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            return ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaDescriptionCompat();
        }
        throw new ConnectionShutdownException();
    }

    public final GiftOpenSharingMomentActivity_ViewBinding MediaBrowserCompat$MediaItem() {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            GiftOpenSharingMomentActivity.SharedMoment_ViewBinding sharedMoment_ViewBinding = depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver;
            if (!sharedMoment_ViewBinding.IconCompatParcelizer) {
                return null;
            }
            return new GiftOpenSharingMomentActivity_ViewBinding(sharedMoment_ViewBinding.MediaMetadataCompat, sharedMoment_ViewBinding.read, sharedMoment_ViewBinding.MediaBrowserCompat$ItemReceiver, sharedMoment_ViewBinding.write, sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver, sharedMoment_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
        }
        throw new ConnectionShutdownException();
    }

    public final SSLSession MediaSessionCompat$Token() {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            Socket RatingCompat = ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).RatingCompat();
            if (RatingCompat instanceof SSLSocket) {
                return ((SSLSocket) RatingCompat).getSession();
            }
            return null;
        }
        throw new ConnectionShutdownException();
    }

    public final boolean IconCompatParcelizer() {
        DealsSuccessActivity dealsSuccessActivity;
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder == null) {
            dealsSuccessActivity = null;
        } else {
            dealsSuccessActivity = (DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (dealsSuccessActivity != null) {
            return dealsSuccessActivity.IconCompatParcelizer();
        }
        return false;
    }

    public final boolean write(int i) throws IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            return ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).write(i);
        }
        throw new ConnectionShutdownException();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        DealsSuccessActivity dealsSuccessActivity;
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder == null) {
            dealsSuccessActivity = null;
        } else {
            dealsSuccessActivity = (DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (dealsSuccessActivity != null) {
            return dealsSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return true;
    }

    public final void write(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) throws HttpException, IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).write(scbPrivacyPolicyActivity);
            return;
        }
        throw new ConnectionShutdownException();
    }

    public final ScbPrivacyPolicyActivity MediaBrowserCompat$ItemReceiver() throws HttpException, IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            return ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver();
        }
        throw new ConnectionShutdownException();
    }

    public final void read(PrepaidResetPinSuccessActivity_ViewBinding prepaidResetPinSuccessActivity_ViewBinding) throws HttpException, IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).read(prepaidResetPinSuccessActivity_ViewBinding);
            return;
        }
        throw new ConnectionShutdownException();
    }

    public final void MediaBrowserCompat$ItemReceiver(PrivacyConsentActivity privacyConsentActivity) throws HttpException, IOException {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver(privacyConsentActivity);
            return;
        }
        throw new ConnectionShutdownException();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            ((DealsSuccessActivity) depositViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver(i);
            return;
        }
        throw new ConnectionShutdownException();
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        DepositViewPagerAdapter$ItemViewHolder depositViewPagerAdapter$ItemViewHolder = this.IconCompatParcelizer;
        if (depositViewPagerAdapter$ItemViewHolder != null) {
            depositViewPagerAdapter$ItemViewHolder.MediaMetadataCompat = obj;
            return;
        }
        throw new ConnectionShutdownException();
    }
}
