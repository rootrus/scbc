package p040o;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.HmlWorkAddressActivity */
public final class HmlWorkAddressActivity<T> implements HmlVerifyEmailActivity<T>, Serializable {
    private static final AtomicReferenceFieldUpdater<HmlWorkAddressActivity<?>, Object> MediaBrowserCompat$CustomActionResultReceiver = AtomicReferenceFieldUpdater.newUpdater(HmlWorkAddressActivity.class, Object.class, "IconCompatParcelizer");
    private volatile Object IconCompatParcelizer = HmlVerifyPhoneReviewActivity.IconCompatParcelizer;
    private volatile FundActionsSuccessActivity<? extends T> read;

    public HmlWorkAddressActivity(FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.read = fundActionsSuccessActivity;
        HmlVerifyPhoneReviewActivity hmlVerifyPhoneReviewActivity = HmlVerifyPhoneReviewActivity.IconCompatParcelizer;
    }

    public final T MediaBrowserCompat$CustomActionResultReceiver() {
        T t = this.IconCompatParcelizer;
        if (t != HmlVerifyPhoneReviewActivity.IconCompatParcelizer) {
            return t;
        }
        FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity = this.read;
        if (fundActionsSuccessActivity != null) {
            T invoke = fundActionsSuccessActivity.invoke();
            if (MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, HmlVerifyPhoneReviewActivity.IconCompatParcelizer, invoke)) {
                this.read = null;
                return invoke;
            }
        }
        return this.IconCompatParcelizer;
    }

    private final Object writeReplace() {
        return new HmlUserInfoActivity(MediaBrowserCompat$CustomActionResultReceiver());
    }

    /* renamed from: o.HmlWorkAddressActivity$read */
    public static final class read {
        public BigDecimal IconCompatParcelizer;
        public OffsetDateTime MediaBrowserCompat$ItemReceiver;
        public BigDecimal read;
        public BigDecimal write;

        private read() {
        }

        public read(BigDecimal bigDecimal, OffsetDateTime offsetDateTime, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            this.IconCompatParcelizer = bigDecimal;
            this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
            this.read = bigDecimal2;
            this.write = bigDecimal3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            read read2 = (read) obj;
            BigDecimal bigDecimal = this.IconCompatParcelizer;
            if (bigDecimal == null ? read2.IconCompatParcelizer != null : !bigDecimal.equals(read2.IconCompatParcelizer)) {
                return false;
            }
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
            if (offsetDateTime == null ? read2.MediaBrowserCompat$ItemReceiver != null : !offsetDateTime.equals(read2.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            BigDecimal bigDecimal2 = this.read;
            if (bigDecimal2 == null ? read2.read != null : !bigDecimal2.equals(read2.read)) {
                return false;
            }
            BigDecimal bigDecimal3 = this.write;
            BigDecimal bigDecimal4 = read2.write;
            if (bigDecimal3 != null) {
                return bigDecimal3.equals(bigDecimal4);
            }
            if (bigDecimal4 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = bigDecimal != null ? bigDecimal.hashCode() : 0;
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            BigDecimal bigDecimal2 = this.read;
            int hashCode3 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
            BigDecimal bigDecimal3 = this.write;
            if (bigDecimal3 != null) {
                i = bigDecimal3.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }
    }

    public final String toString() {
        return this.IconCompatParcelizer != HmlVerifyPhoneReviewActivity.IconCompatParcelizer ? String.valueOf(MediaBrowserCompat$CustomActionResultReceiver()) : "Lazy value not initialized yet.";
    }
}
