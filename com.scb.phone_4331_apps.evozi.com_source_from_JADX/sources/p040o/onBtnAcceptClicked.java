package p040o;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.onBtnAcceptClicked */
public class onBtnAcceptClicked extends BankingAgentDeepLinkActivity.read {
    public volatile boolean IconCompatParcelizer;
    public final ScheduledExecutorService read;

    public onBtnAcceptClicked(ThreadFactory threadFactory) {
        this.read = setPromoSeparator.read(threadFactory);
    }

    public final BulkTransferDeepLinkActivity IconCompatParcelizer(Runnable runnable) {
        return MediaBrowserCompat$ItemReceiver(runnable, 0, (TimeUnit) null);
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.IconCompatParcelizer) {
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
        return IconCompatParcelizer(runnable, j, timeUnit, (FacebookBillPaymentDeepLinkActivity) null);
    }

    public final BulkTransferDeepLinkActivity write(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        setSeparatorBreadcrumbs setseparatorbreadcrumbs = new setSeparatorBreadcrumbs(runnable);
        if (j <= 0) {
            try {
                future = this.read.submit(setseparatorbreadcrumbs);
            } catch (RejectedExecutionException e) {
                AlertController$RecycleListView.read.read((Throwable) e);
                return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
            }
        } else {
            future = this.read.schedule(setseparatorbreadcrumbs, j, timeUnit);
        }
        setseparatorbreadcrumbs.read(future);
        return setseparatorbreadcrumbs;
    }

    public void dispose() {
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
            this.read.shutdownNow();
        }
    }

    public boolean isDisposed() {
        return this.IconCompatParcelizer;
    }

    public final setGrRequiredDocuments IconCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit, FacebookBillPaymentDeepLinkActivity facebookBillPaymentDeepLinkActivity) {
        Future future;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        setGrRequiredDocuments setgrrequireddocuments = new setGrRequiredDocuments(runnable, facebookBillPaymentDeepLinkActivity);
        if (facebookBillPaymentDeepLinkActivity != null && !facebookBillPaymentDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(setgrrequireddocuments)) {
            return setgrrequireddocuments;
        }
        if (j <= 0) {
            try {
                future = this.read.submit(setgrrequireddocuments);
            } catch (RejectedExecutionException e) {
                if (facebookBillPaymentDeepLinkActivity != null) {
                    facebookBillPaymentDeepLinkActivity.write(setgrrequireddocuments);
                }
                AlertController$RecycleListView.read.read((Throwable) e);
            }
        } else {
            future = this.read.schedule(setgrrequireddocuments, j, timeUnit);
        }
        setgrrequireddocuments.write(future);
        return setgrrequireddocuments;
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        if (j2 <= 0) {
            HmlBaseEmailAboutActivity_ViewBinding hmlBaseEmailAboutActivity_ViewBinding = new HmlBaseEmailAboutActivity_ViewBinding(runnable, this.read);
            if (j <= 0) {
                try {
                    future = this.read.submit(hmlBaseEmailAboutActivity_ViewBinding);
                } catch (RejectedExecutionException e) {
                    AlertController$RecycleListView.read.read((Throwable) e);
                    return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
                }
            } else {
                future = this.read.schedule(hmlBaseEmailAboutActivity_ViewBinding, j, timeUnit);
            }
            hmlBaseEmailAboutActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(future);
            return hmlBaseEmailAboutActivity_ViewBinding;
        }
        HmlBaseReviewActivity hmlBaseReviewActivity = new HmlBaseReviewActivity(runnable);
        try {
            hmlBaseReviewActivity.read(this.read.scheduleAtFixedRate(hmlBaseReviewActivity, j, j2, timeUnit));
            return hmlBaseReviewActivity;
        } catch (RejectedExecutionException e2) {
            AlertController$RecycleListView.read.read((Throwable) e2);
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
    }
}
