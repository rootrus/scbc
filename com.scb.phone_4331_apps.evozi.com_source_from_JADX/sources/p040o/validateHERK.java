package p040o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.ScriptGroup;
import p040o.validateGER;

/* renamed from: o.validateHERK */
public final class validateHERK extends addConnection<RecyclerView.setContentView> implements ScriptGroup.C1272IO<RecyclerView.setContentView> {
    public validateDiag MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem = -1;
    private int MediaBrowserCompat$SearchResultReceiver = -1;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f2657x50fd9e4a = -1;
    public FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat MediaDescriptionCompat;
    public validateGER.write MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem = -1;
    private int MediaSessionCompat$ResultReceiverWrapper = -1;
    private int ParcelableVolumeInfo = -1;
    public validateGER$MediaBrowserCompat$ItemReceiver RatingCompat;
    validateGER write;

    public validateHERK(validateGER validateger, RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> iconCompatParcelizer, long[] jArr) {
        super(iconCompatParcelizer);
        validateDiag cast;
        Class<validateDiag> cls = validateDiag.class;
        RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer2 = iconCompatParcelizer;
        while (true) {
            if (!cls.isInstance(iconCompatParcelizer2)) {
                if (!(iconCompatParcelizer2 instanceof addConnection)) {
                    cast = null;
                    break;
                }
                iconCompatParcelizer2 = ((addConnection) iconCompatParcelizer2).read;
            } else {
                cast = cls.cast(iconCompatParcelizer2);
                break;
            }
        }
        validateDiag validatediag = cast;
        this.MediaBrowserCompat$ItemReceiver = validatediag;
        if (validatediag != null) {
            this.write = validateger;
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat();
            this.MediaDescriptionCompat = mediaDescriptionCompat;
            mediaDescriptionCompat.read(this.MediaBrowserCompat$ItemReceiver, 0, false);
            if (jArr != null) {
                this.MediaDescriptionCompat.read(jArr);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("adapter does not implement ExpandableItemAdapter");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$ItemReceiver = null;
        this.write = null;
        this.MediaMetadataCompat = null;
        this.RatingCompat = null;
    }

    public final int IconCompatParcelizer() {
        FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
        return mediaDescriptionCompat.RatingCompat + mediaDescriptionCompat.IconCompatParcelizer;
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            return -1;
        }
        long MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        int i2 = (int) MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = (int) (MediaBrowserCompat$CustomActionResultReceiver >>> 32);
        if (i3 == -1) {
            long write2 = this.MediaBrowserCompat$ItemReceiver.write(i2);
            if (write2 >= -134217728 && write2 <= 134217727) {
                return ((write2 << 28) & 72057593769492480L) | 268435455;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Group ID value is out of range. (groupId = ");
            sb.append(write2);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        long write3 = this.MediaBrowserCompat$ItemReceiver.write(i2);
        long IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i3);
        if (write3 < -134217728 || write3 > 134217727) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Group ID value is out of range. (groupId = ");
            sb2.append(write3);
            sb2.append(")");
            throw new IllegalArgumentException(sb2.toString());
        } else if (IconCompatParcelizer >= -134217728 && IconCompatParcelizer <= 134217727) {
            return ((write3 << 28) & 72057593769492480L) | (IconCompatParcelizer & 268435455);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Child ID value is out of range. (childId = ");
            sb3.append(IconCompatParcelizer);
            sb3.append(")");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2;
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            return 0;
        }
        long MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        int i3 = (int) MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = (int) (MediaBrowserCompat$CustomActionResultReceiver >>> 32);
        if (i4 == -1) {
            i2 = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat(i3);
        } else {
            i2 = this.MediaBrowserCompat$ItemReceiver.write();
        }
        if ((i2 & PKIFailureInfo.systemUnavail) == 0) {
            return i4 == -1 ? i2 | PKIFailureInfo.systemUnavail : i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal view type (type = ");
        sb.append(Integer.toHexString(i2));
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        RecyclerView.setContentView setcontentview;
        validateDiag validatediag = this.MediaBrowserCompat$ItemReceiver;
        if (validatediag != null) {
            int i2 = Integer.MAX_VALUE & i;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                setcontentview = validatediag.write(viewGroup, i2);
            } else {
                setcontentview = validatediag.read(viewGroup, i2);
            }
            if (setcontentview instanceof validateGERU) {
                ((validateGERU) setcontentview).write(-1);
            }
            return setcontentview;
        }
        throw new IllegalStateException();
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, List<Object> list) {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            long MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
            int i2 = (int) MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = (int) (MediaBrowserCompat$CustomActionResultReceiver >>> 32);
            boolean z = true;
            int i4 = i3 == -1 ? 1 : 2;
            if ((this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i2] & 2147483648L) != 0) {
                i4 |= 4;
            }
            if (setcontentview instanceof validateGERU) {
                validateGERU validategeru = (validateGERU) setcontentview;
                int IconCompatParcelizer = validategeru.IconCompatParcelizer();
                if (!(IconCompatParcelizer == -1 || ((IconCompatParcelizer ^ i4) & 4) == 0)) {
                    i4 |= 8;
                }
                if (IconCompatParcelizer == -1 || ((IconCompatParcelizer ^ i4) & Api.BaseClientBuilder.API_PRIORITY_OTHER) != 0) {
                    i4 |= PKIFailureInfo.systemUnavail;
                }
                validategeru.write(i4);
            }
            if (setcontentview instanceof ScriptGroup.Input) {
                ScriptGroup.Input input = (ScriptGroup.Input) setcontentview;
                boolean z2 = (this.MediaSessionCompat$ResultReceiverWrapper == -1 || this.MediaSessionCompat$QueueItem == -1) ? false : true;
                boolean z3 = (this.MediaBrowserCompat$SearchResultReceiver == -1 || this.MediaBrowserCompat$MediaItem == -1) ? false : true;
                boolean z4 = i2 >= this.MediaSessionCompat$ResultReceiverWrapper && i2 <= this.MediaSessionCompat$QueueItem;
                boolean z5 = i2 != -1 && i3 >= this.MediaBrowserCompat$SearchResultReceiver && i3 <= this.MediaBrowserCompat$MediaItem;
                int write2 = input.write();
                if ((write2 & 1) == 0 || (write2 & 4) != 0 || ((z2 && !z4) || (z3 && (!z3 || !z5)))) {
                    z = false;
                }
                if (z) {
                    input.MediaBrowserCompat$CustomActionResultReceiver(write2 | 4 | PKIFailureInfo.systemUnavail);
                }
            }
            if (i3 == -1) {
                this.MediaBrowserCompat$ItemReceiver.write(setcontentview, i2);
            } else {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(setcontentview, i2, i3);
            }
        }
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
        if (mediaDescriptionCompat != null) {
            long[] IconCompatParcelizer = mediaDescriptionCompat.IconCompatParcelizer();
            this.MediaDescriptionCompat.read(this.MediaBrowserCompat$ItemReceiver, 0, false);
            this.MediaDescriptionCompat.read(IconCompatParcelizer);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof validateGERU) {
            ((validateGERU) setcontentview).write(-1);
        }
        super.MediaBrowserCompat$ItemReceiver(setcontentview, i);
    }

    public final void read() {
        MediaBrowserCompat$SearchResultReceiver();
        super.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        super.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        MediaBrowserCompat$SearchResultReceiver();
        super.MediaBrowserCompat$ItemReceiver(i, i2);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(int i, int i2) {
        int i3;
        if (i2 == 1) {
            long MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
            int i4 = (int) MediaBrowserCompat$CustomActionResultReceiver;
            int i5 = (int) (MediaBrowserCompat$CustomActionResultReceiver >>> 32);
            int i6 = -1;
            if (i5 == -1) {
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
                for (int i7 = 0; i7 <= 0; i7++) {
                    long j = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i4];
                    if ((j & 2147483648L) != 0) {
                        mediaDescriptionCompat.IconCompatParcelizer -= (int) (j & 2147483647L);
                        mediaDescriptionCompat.write--;
                    }
                }
                mediaDescriptionCompat.RatingCompat--;
                int i8 = i4;
                while (true) {
                    i3 = mediaDescriptionCompat.RatingCompat;
                    if (i8 >= i3) {
                        break;
                    }
                    long[] jArr = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
                    int i9 = i8 + 1;
                    jArr[i8] = jArr[i9];
                    int[] iArr = mediaDescriptionCompat.read;
                    iArr[i8] = iArr[i9];
                    i8 = i9;
                }
                if (i3 != 0) {
                    i6 = -1 + i4;
                }
                mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = Math.min(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver, i6);
            } else {
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat2 = this.MediaDescriptionCompat;
                long j2 = mediaDescriptionCompat2.MediaBrowserCompat$CustomActionResultReceiver[i4];
                int i10 = (int) (2147483647L & j2);
                if (i5 < 0 || i5 + 1 > i10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid child position removeChildItems(groupPosition = ");
                    sb.append(i4);
                    sb.append(", childPosition = ");
                    sb.append(i5);
                    sb.append(", count = ");
                    sb.append(1);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                if ((2147483648L & j2) != 0) {
                    mediaDescriptionCompat2.IconCompatParcelizer--;
                }
                mediaDescriptionCompat2.MediaBrowserCompat$CustomActionResultReceiver[i4] = (-2147483648L & j2) | ((long) (i10 - 1));
                mediaDescriptionCompat2.MediaBrowserCompat$ItemReceiver = Math.min(mediaDescriptionCompat2.MediaBrowserCompat$ItemReceiver, i4 - 1);
            }
        } else {
            int i11 = i;
            MediaBrowserCompat$SearchResultReceiver();
        }
        super.MediaBrowserCompat$SearchResultReceiver(i, i2);
    }

    public final void read(int i, int i2, int i3) {
        MediaBrowserCompat$SearchResultReceiver();
        super.read(i, i2, i3);
    }

    public final boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview, int i) {
        boolean z;
        validateDiag validatediag = this.MediaBrowserCompat$ItemReceiver;
        if (!(validatediag instanceof ScriptIntrinsicBLAS)) {
            return false;
        }
        ScriptIntrinsicBLAS scriptIntrinsicBLAS = (ScriptIntrinsicBLAS) validatediag;
        if (((int) (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i) >>> 32)) == -1) {
            z = scriptIntrinsicBLAS.IconCompatParcelizer();
        } else {
            z = scriptIntrinsicBLAS.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaSessionCompat$ResultReceiverWrapper = -1;
        this.MediaSessionCompat$QueueItem = -1;
        this.MediaBrowserCompat$SearchResultReceiver = -1;
        this.MediaBrowserCompat$MediaItem = -1;
        return z;
    }

    public final ScriptIntrinsic write(int i) {
        boolean z;
        boolean z2;
        validateDiag validatediag = this.MediaBrowserCompat$ItemReceiver;
        if (!(validatediag instanceof ScriptIntrinsicBLAS) || validatediag.MediaBrowserCompat$ItemReceiver() <= 0) {
            return null;
        }
        ScriptIntrinsicBLAS scriptIntrinsicBLAS = (ScriptIntrinsicBLAS) this.MediaBrowserCompat$ItemReceiver;
        long MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        int i2 = (int) MediaBrowserCompat$CustomActionResultReceiver;
        boolean z3 = true;
        if (((int) (MediaBrowserCompat$CustomActionResultReceiver >>> 32)) == -1) {
            ScriptIntrinsic RatingCompat2 = scriptIntrinsicBLAS.RatingCompat();
            if (RatingCompat2 == null) {
                int max = Math.max(0, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver() - 1);
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
                int i3 = mediaDescriptionCompat.RatingCompat + mediaDescriptionCompat.IconCompatParcelizer;
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat2 = this.MediaDescriptionCompat;
                return new ScriptIntrinsic(0, Math.max(0, (i3 - (((2147483648L & mediaDescriptionCompat2.MediaBrowserCompat$CustomActionResultReceiver[max]) > 0 ? 1 : ((2147483648L & mediaDescriptionCompat2.MediaBrowserCompat$CustomActionResultReceiver[max]) == 0 ? 0 : -1)) != 0 ? (int) (mediaDescriptionCompat2.MediaBrowserCompat$CustomActionResultReceiver[max] & 2147483647L) : 0)) - 1));
            }
            if (!RatingCompat2.getClass().equals(validateHEMM.class) && !RatingCompat2.getClass().equals(ScriptIntrinsic.class)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) RatingCompat2.MediaBrowserCompat$ItemReceiver) & 4294967295L) | -4294967296L);
                int MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) RatingCompat2.MediaBrowserCompat$CustomActionResultReceiver) & 4294967295L) | -4294967296L);
                if (RatingCompat2.MediaBrowserCompat$CustomActionResultReceiver > i2) {
                    FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat3 = this.MediaDescriptionCompat;
                    int i4 = RatingCompat2.MediaBrowserCompat$CustomActionResultReceiver;
                    if ((2147483648L & mediaDescriptionCompat3.MediaBrowserCompat$CustomActionResultReceiver[i4]) == 0) {
                        z3 = false;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver3 += z3 ? (int) (mediaDescriptionCompat3.MediaBrowserCompat$CustomActionResultReceiver[i4] & 2147483647L) : 0;
                }
                this.MediaSessionCompat$ResultReceiverWrapper = RatingCompat2.MediaBrowserCompat$ItemReceiver;
                this.MediaSessionCompat$QueueItem = RatingCompat2.MediaBrowserCompat$CustomActionResultReceiver;
                return new ScriptIntrinsic(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid range specified: ");
            sb.append(RatingCompat2);
            throw new IllegalStateException(sb.toString());
        }
        ScriptIntrinsic MediaBrowserCompat$CustomActionResultReceiver4 = scriptIntrinsicBLAS.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat4 = this.MediaDescriptionCompat;
            return new ScriptIntrinsic(1, Math.max(1, (mediaDescriptionCompat4.RatingCompat + mediaDescriptionCompat4.IconCompatParcelizer) - 1));
        }
        if (!MediaBrowserCompat$CustomActionResultReceiver4.getClass().equals(validateHEMM.class) && !MediaBrowserCompat$CustomActionResultReceiver4.getClass().equals(ScriptIntrinsic.class)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            long j = (((long) MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$ItemReceiver) & 4294967295L) | -4294967296L;
            int MediaBrowserCompat$CustomActionResultReceiver5 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(-4294967296L | (((long) MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver) & 4294967295L));
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat5 = this.MediaDescriptionCompat;
            int i5 = MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver;
            int i6 = MediaBrowserCompat$CustomActionResultReceiver5 + (((mediaDescriptionCompat5.MediaBrowserCompat$CustomActionResultReceiver[i5] & 2147483648L) > 0 ? 1 : ((mediaDescriptionCompat5.MediaBrowserCompat$CustomActionResultReceiver[i5] & 2147483648L) == 0 ? 0 : -1)) != 0 ? (int) (mediaDescriptionCompat5.MediaBrowserCompat$CustomActionResultReceiver[i5] & 2147483647L) : 0);
            int min = Math.min(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(j) + 1, i6);
            this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$ItemReceiver;
            this.MediaSessionCompat$QueueItem = MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver;
            return new ScriptIntrinsic(min, i6);
        } else if (MediaBrowserCompat$CustomActionResultReceiver4.getClass().equals(validateConjTranspose.class)) {
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat6 = this.MediaDescriptionCompat;
            int max2 = Math.max((((mediaDescriptionCompat6.MediaBrowserCompat$CustomActionResultReceiver[i2] & 2147483648L) > 0 ? 1 : ((mediaDescriptionCompat6.MediaBrowserCompat$CustomActionResultReceiver[i2] & 2147483648L) == 0 ? 0 : -1)) != 0 ? (int) (mediaDescriptionCompat6.MediaBrowserCompat$CustomActionResultReceiver[i2] & 2147483647L) : 0) - 1, 0);
            int min2 = Math.min(MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$ItemReceiver, max2);
            int min3 = Math.min(MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver, max2);
            long j2 = ((long) i2) & 4294967295L;
            int MediaBrowserCompat$CustomActionResultReceiver6 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) min2) << 32) | j2);
            int MediaBrowserCompat$CustomActionResultReceiver7 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(j2 | (((long) min3) << 32));
            this.MediaBrowserCompat$SearchResultReceiver = min2;
            this.MediaBrowserCompat$MediaItem = min3;
            return new ScriptIntrinsic(MediaBrowserCompat$CustomActionResultReceiver6, MediaBrowserCompat$CustomActionResultReceiver7);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid range specified: ");
            sb2.append(MediaBrowserCompat$CustomActionResultReceiver4);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final boolean read(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        validateDiag validatediag = this.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (!(validatediag instanceof ScriptIntrinsicBLAS)) {
            return true;
        }
        if (validatediag.MediaBrowserCompat$ItemReceiver() <= 0) {
            return false;
        }
        ScriptIntrinsicBLAS scriptIntrinsicBLAS = (ScriptIntrinsicBLAS) this.MediaBrowserCompat$ItemReceiver;
        long MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i3);
        int i5 = (int) MediaBrowserCompat$CustomActionResultReceiver;
        int i6 = (int) (MediaBrowserCompat$CustomActionResultReceiver >>> 32);
        long MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i4);
        int i7 = (int) MediaBrowserCompat$CustomActionResultReceiver2;
        int i8 = (int) (MediaBrowserCompat$CustomActionResultReceiver2 >>> 32);
        boolean z2 = i6 == -1;
        boolean z3 = i8 == -1;
        if (z2) {
            if (i5 != i7 && i3 < i4) {
                boolean z4 = (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7] & 2147483648L) != 0;
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
                int i9 = ((2147483648L & mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7]) > 0 ? 1 : ((2147483648L & mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7]) == 0 ? 0 : -1)) != 0 ? (int) (mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7] & 2147483647L) : 0;
                if (z3) {
                    z3 = !z4;
                } else {
                    if (i8 != i9 - 1) {
                        z = false;
                    }
                    z3 = z;
                }
            }
            if (z3) {
                return scriptIntrinsicBLAS.write();
            }
            return false;
        }
        boolean z5 = (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7] & 2147483648L) != 0;
        if (i3 < i4) {
            if (z3 && !z5) {
                long j = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7];
            }
        } else if (z3) {
            if (i7 > 0) {
                long j2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i7 - 1];
            } else {
                z = false;
            }
        }
        if (z) {
            return scriptIntrinsicBLAS.read();
        }
        return false;
    }

    public final void IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$ItemReceiver instanceof ScriptIntrinsicBLAS) {
            this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    public final void read(int i) {
        int i2 = this.f2657x50fd9e4a;
        int i3 = this.ParcelableVolumeInfo;
        this.MediaSessionCompat$ResultReceiverWrapper = -1;
        this.MediaSessionCompat$QueueItem = -1;
        this.MediaBrowserCompat$SearchResultReceiver = -1;
        this.MediaBrowserCompat$MediaItem = -1;
        this.f2657x50fd9e4a = -1;
        this.ParcelableVolumeInfo = -1;
        if ((this.MediaBrowserCompat$ItemReceiver instanceof ScriptIntrinsicBLAS) && i2 == -1 && i3 == -1) {
            this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            o.validateDiag r3 = r0.MediaBrowserCompat$ItemReceiver
            boolean r3 = r3 instanceof p040o.ScriptIntrinsicBLAS
            if (r3 != 0) goto L_0x000d
            return
        L_0x000d:
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r3 = r0.MediaDescriptionCompat
            long r3 = r3.MediaBrowserCompat$CustomActionResultReceiver((int) r1)
            int r5 = (int) r3
            r6 = 32
            long r3 = r3 >>> r6
            int r3 = (int) r3
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r4 = r0.MediaDescriptionCompat
            long r7 = r4.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            int r4 = (int) r7
            long r7 = r7 >>> r6
            int r7 = (int) r7
            r8 = -1
            if (r3 != r8) goto L_0x0026
            r11 = 1
            goto L_0x0027
        L_0x0026:
            r11 = 0
        L_0x0027:
            if (r7 != r8) goto L_0x002b
            r12 = 1
            goto L_0x002c
        L_0x002b:
            r12 = 0
        L_0x002c:
            if (r11 == 0) goto L_0x0037
            if (r12 == 0) goto L_0x0037
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r6 = r0.MediaDescriptionCompat
            r6.MediaBrowserCompat$CustomActionResultReceiver(r5, r4)
            goto L_0x00dc
        L_0x0037:
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r11 != 0) goto L_0x0058
            if (r12 != 0) goto L_0x0058
            if (r5 == r4) goto L_0x0046
            if (r1 >= r2) goto L_0x0046
            int r7 = r7 + 1
        L_0x0046:
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r2 = r0.MediaDescriptionCompat
            long r11 = (long) r7
            long r8 = (long) r5
            long r8 = r8 & r13
            long r11 = r11 << r6
            long r8 = r8 | r11
            int r2 = r2.MediaBrowserCompat$CustomActionResultReceiver((long) r8)
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r6 = r0.MediaDescriptionCompat
            r6.read(r5, r3, r4, r7)
            goto L_0x00dc
        L_0x0058:
            if (r11 != 0) goto L_0x00c5
            r6 = 0
            r11 = 2147483648(0x80000000, double:1.0609978955E-314)
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 >= r1) goto L_0x0074
            if (r4 == 0) goto L_0x0085
            int r8 = r4 + -1
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r15 = r0.MediaDescriptionCompat
            long[] r15 = r15.MediaBrowserCompat$CustomActionResultReceiver
            r16 = r15[r8]
            long r9 = r16 & r13
            int r9 = (int) r9
            goto L_0x0092
        L_0x0074:
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r8 = r0.MediaDescriptionCompat
            long[] r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r9 = r8[r4]
            long r8 = r9 & r11
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0082
            r8 = 1
            goto L_0x0083
        L_0x0082:
            r8 = 0
        L_0x0083:
            if (r8 == 0) goto L_0x0088
        L_0x0085:
            r8 = r4
            r9 = 0
            goto L_0x0092
        L_0x0088:
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r8 = r0.MediaDescriptionCompat
            long[] r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r9 = r8[r4]
            long r8 = r9 & r13
            int r9 = (int) r8
            r8 = r4
        L_0x0092:
            if (r5 != r8) goto L_0x00a9
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r10 = r0.MediaDescriptionCompat
            long[] r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r16 = r10[r8]
            long r13 = r16 & r13
            int r10 = (int) r13
            r13 = 1
            int r10 = r10 - r13
            r13 = 0
            int r10 = java.lang.Math.max(r13, r10)
            int r9 = java.lang.Math.min(r9, r10)
            goto L_0x00aa
        L_0x00a9:
            r13 = 0
        L_0x00aa:
            if (r5 != r8) goto L_0x00af
            if (r3 != r9) goto L_0x00af
            goto L_0x00db
        L_0x00af:
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r10 = r0.MediaDescriptionCompat
            long[] r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r16 = r10[r4]
            long r10 = r16 & r11
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00bc
            r13 = 1
        L_0x00bc:
            if (r13 != 0) goto L_0x00bf
            r2 = -1
        L_0x00bf:
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r4 = r0.MediaDescriptionCompat
            r4.read(r5, r3, r8, r9)
            goto L_0x00dc
        L_0x00c5:
            if (r5 == r4) goto L_0x00db
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r2 = r0.MediaDescriptionCompat
            long r6 = (long) r4
            long r6 = r6 & r13
            r8 = -4294967296(0xffffffff00000000, double:NaN)
            long r6 = r6 | r8
            int r2 = r2.MediaBrowserCompat$CustomActionResultReceiver((long) r6)
            o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat r6 = r0.MediaDescriptionCompat
            r6.MediaBrowserCompat$CustomActionResultReceiver(r5, r4)
            goto L_0x00dc
        L_0x00db:
            r2 = r1
        L_0x00dc:
            if (r2 == r1) goto L_0x00ed
            r4 = -1
            if (r2 == r4) goto L_0x00e7
            androidx.recyclerview.widget.RecyclerView$write r4 = r0.IconCompatParcelizer
            r4.IconCompatParcelizer(r1, r2)
            goto L_0x00ed
        L_0x00e7:
            androidx.recyclerview.widget.RecyclerView$write r2 = r0.IconCompatParcelizer
            r4 = 1
            r2.write(r1, r4)
        L_0x00ed:
            r0.f2657x50fd9e4a = r5
            r0.ParcelableVolumeInfo = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.validateHERK.write(int, int):void");
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i, boolean z, Object obj) {
        if (!((2147483648L & this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i]) != 0)) {
            return false;
        }
        if (this.MediaDescriptionCompat.write(i)) {
            int MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) i) & 4294967295L) | -4294967296L);
            this.IconCompatParcelizer.write(MediaBrowserCompat$CustomActionResultReceiver + 1, (int) (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i] & 2147483647L));
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) i) & 4294967295L) | -4294967296L), 1, (Object) null);
        validateGER$MediaBrowserCompat$ItemReceiver validateger_mediabrowsercompat_itemreceiver = this.RatingCompat;
        if (validateger_mediabrowsercompat_itemreceiver != null) {
            validateger_mediabrowsercompat_itemreceiver.read(i);
        }
        return true;
    }

    public final boolean read(int i, boolean z, Object obj) {
        if ((2147483648L & this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i]) != 0) {
            return false;
        }
        if (this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(i)) {
            int MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) i) & 4294967295L) | -4294967296L);
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver + 1, (int) (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i] & 2147483647L));
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver((((long) i) & 4294967295L) | -4294967296L), 1, (Object) null);
        validateGER.write write2 = this.MediaMetadataCompat;
        if (write2 != null) {
            write2.MediaBrowserCompat$ItemReceiver(i);
        }
        return true;
    }
}
