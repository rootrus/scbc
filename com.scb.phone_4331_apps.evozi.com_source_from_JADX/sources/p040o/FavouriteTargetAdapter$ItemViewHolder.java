package p040o;

import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.FavouriteTargetAdapter$ItemViewHolder */
public final class FavouriteTargetAdapter$ItemViewHolder implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long maxLargest;
    private final long maxSmallest;
    private final long minLargest;
    private final long minSmallest;

    /* renamed from: of */
    public static FavouriteTargetAdapter$ItemViewHolder m3505of(long j, long j2) {
        if (j <= j2) {
            return new FavouriteTargetAdapter$ItemViewHolder(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: of */
    public static FavouriteTargetAdapter$ItemViewHolder m3506of(long j, long j2, long j3) {
        return m3507of(j, j, j2, j3);
    }

    /* renamed from: of */
    public static FavouriteTargetAdapter$ItemViewHolder m3507of(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j2 <= j4) {
            return new FavouriteTargetAdapter$ItemViewHolder(j, j2, j3, j4);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    private FavouriteTargetAdapter$ItemViewHolder(long j, long j2, long j3, long j4) {
        this.minSmallest = j;
        this.minLargest = j2;
        this.maxSmallest = j3;
        this.maxLargest = j4;
    }

    public final boolean isFixed() {
        return this.minSmallest == this.minLargest && this.maxSmallest == this.maxLargest;
    }

    public final long getMinimum() {
        return this.minSmallest;
    }

    public final long getLargestMinimum() {
        return this.minLargest;
    }

    public final long getSmallestMaximum() {
        return this.maxSmallest;
    }

    public final long getMaximum() {
        return this.maxLargest;
    }

    public final boolean isIntValue() {
        return getMinimum() >= -2147483648L && getMaximum() <= 2147483647L;
    }

    public final boolean isValidValue(long j) {
        return j >= getMinimum() && j <= getMaximum();
    }

    public final boolean isValidIntValue(long j) {
        return isIntValue() && isValidValue(j);
    }

    public final long checkValidValue(long j, DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (isValidValue(j)) {
            return j;
        }
        if (denominatorAmountAdapter$PencilViewHolder != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid value for ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            sb.append(" (valid values ");
            sb.append(this);
            sb.append("): ");
            sb.append(j);
            throw new DateTimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid value (valid values ");
        sb2.append(this);
        sb2.append("): ");
        sb2.append(j);
        throw new DateTimeException(sb2.toString());
    }

    public final int checkValidIntValue(long j, DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (isValidIntValue(j)) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid int value for ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        sb.append(": ");
        sb.append(j);
        throw new DateTimeException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FavouriteTargetAdapter$ItemViewHolder)) {
            return false;
        }
        FavouriteTargetAdapter$ItemViewHolder favouriteTargetAdapter$ItemViewHolder = (FavouriteTargetAdapter$ItemViewHolder) obj;
        if (this.minSmallest == favouriteTargetAdapter$ItemViewHolder.minSmallest && this.minLargest == favouriteTargetAdapter$ItemViewHolder.minLargest && this.maxSmallest == favouriteTargetAdapter$ItemViewHolder.maxSmallest && this.maxLargest == favouriteTargetAdapter$ItemViewHolder.maxLargest) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.minSmallest;
        long j2 = this.minLargest;
        long j3 = this.maxSmallest;
        long j4 = this.maxLargest;
        long j5 = ((((((j + j2) << ((int) (16 + j2))) >> ((int) (j3 + 48))) << ((int) (j3 + 32))) >> ((int) (32 + j4))) << ((int) (j4 + 48))) >> 16;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.minSmallest);
        if (this.minSmallest != this.minLargest) {
            sb.append('/');
            sb.append(this.minLargest);
        }
        sb.append(" - ");
        sb.append(this.maxSmallest);
        if (this.maxSmallest != this.maxLargest) {
            sb.append('/');
            sb.append(this.maxLargest);
        }
        return sb.toString();
    }
}
