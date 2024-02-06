package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

@Deprecated
/* renamed from: o.PayerReviewActivity */
public final class PayerReviewActivity extends NewTransactionActivity implements SummaryDetailActivity, ScheduleBulkTransferActivity {
    private ScheduleLandingActivity MediaBrowserCompat$ItemReceiver;
    private boolean write;

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return false;
    }

    public PayerReviewActivity(PrepaidResetOtpActivity prepaidResetOtpActivity, ScheduleLandingActivity scheduleLandingActivity, boolean z) {
        super(prepaidResetOtpActivity);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scheduleLandingActivity, "Connection");
        this.MediaBrowserCompat$ItemReceiver = scheduleLandingActivity;
        this.write = z;
    }

    public final InputStream write() throws IOException {
        return new ScheduleLandingActivity_ViewBinding(this.read.write(), this);
    }

    private void MediaSessionCompat$Token() throws IOException {
        InputStream write2;
        ScheduleLandingActivity scheduleLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (scheduleLandingActivity != null) {
            try {
                if (this.write) {
                    PrepaidResetOtpActivity prepaidResetOtpActivity = this.read;
                    if (!(prepaidResetOtpActivity == null || !prepaidResetOtpActivity.MediaBrowserCompat$MediaItem() || (write2 = prepaidResetOtpActivity.write()) == null)) {
                        write2.close();
                    }
                    this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo();
                } else {
                    scheduleLandingActivity.MediaSessionCompat$QueueItem();
                }
                ScheduleLandingActivity scheduleLandingActivity2 = this.MediaBrowserCompat$ItemReceiver;
                if (scheduleLandingActivity2 != null) {
                    try {
                        scheduleLandingActivity2.MediaMetadataCompat();
                    } finally {
                        this.MediaBrowserCompat$ItemReceiver = null;
                    }
                }
            } catch (Throwable th) {
                ScheduleLandingActivity scheduleLandingActivity3 = this.MediaBrowserCompat$ItemReceiver;
                if (scheduleLandingActivity3 != null) {
                    scheduleLandingActivity3.MediaMetadataCompat();
                }
                throw th;
            } finally {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream) throws IOException {
        super.MediaBrowserCompat$CustomActionResultReceiver(outputStream);
        MediaSessionCompat$Token();
    }

    public final void MediaMetadataCompat() throws IOException {
        MediaSessionCompat$Token();
    }

    public final void RatingCompat() throws IOException {
        ScheduleLandingActivity scheduleLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (scheduleLandingActivity != null) {
            try {
                scheduleLandingActivity.RatingCompat();
            } finally {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }

    public final boolean read(InputStream inputStream) throws IOException {
        try {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                if (this.write) {
                    inputStream.close();
                    this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo();
                } else {
                    this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem();
                }
            }
            ScheduleLandingActivity scheduleLandingActivity = this.MediaBrowserCompat$ItemReceiver;
            if (scheduleLandingActivity == null) {
                return false;
            }
            try {
                scheduleLandingActivity.MediaMetadataCompat();
                return false;
            } finally {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        } catch (Throwable th) {
            ScheduleLandingActivity scheduleLandingActivity2 = this.MediaBrowserCompat$ItemReceiver;
            if (scheduleLandingActivity2 != null) {
                scheduleLandingActivity2.MediaMetadataCompat();
            }
            throw th;
        } finally {
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(InputStream inputStream) throws IOException {
        boolean IconCompatParcelizer;
        try {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                if (this.write) {
                    IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
                    inputStream.close();
                    this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo();
                } else {
                    this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem();
                }
            }
        } catch (SocketException e) {
            if (IconCompatParcelizer) {
                throw e;
            }
        } catch (Throwable th) {
            ScheduleLandingActivity scheduleLandingActivity = this.MediaBrowserCompat$ItemReceiver;
            if (scheduleLandingActivity != null) {
                try {
                    scheduleLandingActivity.MediaMetadataCompat();
                } finally {
                    this.MediaBrowserCompat$ItemReceiver = null;
                }
            }
            throw th;
        }
        ScheduleLandingActivity scheduleLandingActivity2 = this.MediaBrowserCompat$ItemReceiver;
        if (scheduleLandingActivity2 == null) {
            return false;
        }
        try {
            scheduleLandingActivity2.MediaMetadataCompat();
            return false;
        } finally {
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    public final boolean MediaDescriptionCompat() throws IOException {
        ScheduleLandingActivity scheduleLandingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (scheduleLandingActivity == null) {
            return false;
        }
        scheduleLandingActivity.RatingCompat();
        return false;
    }
}
