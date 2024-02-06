package p040o;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: o.BasePersonalInfoActivity_ViewBinding */
public final class BasePersonalInfoActivity_ViewBinding extends SCBUniversalWebViewActivity_ViewBinding {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);
    private final transient byte[][] MediaBrowserCompat$SearchResultReceiver;
    private final transient int[] RatingCompat;

    public /* synthetic */ BasePersonalInfoActivity_ViewBinding(byte[][] bArr, int[] iArr, byte b) {
        this(bArr, iArr);
    }

    private BasePersonalInfoActivity_ViewBinding(byte[][] bArr, int[] iArr) {
        super(SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        this.MediaBrowserCompat$SearchResultReceiver = bArr;
        this.RatingCompat = iArr;
    }

    /* renamed from: o.BasePersonalInfoActivity_ViewBinding$read */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final SCBUniversalWebViewActivity_ViewBinding IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.RatingCompat;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(this.MediaBrowserCompat$SearchResultReceiver[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        onGetStartedClick.IconCompatParcelizer((Object) digest, "digest.digest()");
        return new SCBUniversalWebViewActivity_ViewBinding(digest);
    }

    public final byte IconCompatParcelizer(int i) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((long) this.RatingCompat[((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length - 1], (long) i, 1);
        int i2 = 0;
        int binarySearch = Arrays.binarySearch(this.RatingCompat, 0, ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length, i + 1);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        if (binarySearch != 0) {
            i2 = this.RatingCompat[binarySearch - 1];
        }
        int[] iArr = this.RatingCompat;
        byte[][] bArr = this.MediaBrowserCompat$SearchResultReceiver;
        return bArr[binarySearch][(i - i2) + iArr[((Object[]) bArr).length + binarySearch]];
    }

    public final int write() {
        return this.RatingCompat[((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length - 1];
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaMetadataCompat();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SCBUniversalWebViewActivity_ViewBinding)) {
                return false;
            }
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = (SCBUniversalWebViewActivity_ViewBinding) obj;
            if (sCBUniversalWebViewActivity_ViewBinding.write() != write() || !read(0, sCBUniversalWebViewActivity_ViewBinding, write())) {
                return false;
            }
        }
        return true;
    }

    private final Object writeReplace() {
        return new SCBUniversalWebViewActivity_ViewBinding(MediaMetadataCompat());
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return new SCBUniversalWebViewActivity_ViewBinding(MediaMetadataCompat()).MediaBrowserCompat$ItemReceiver();
    }

    public final int hashCode() {
        int i = this.read;
        if (i != 0) {
            return i;
        }
        int length = ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.RatingCompat;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.MediaBrowserCompat$SearchResultReceiver[i2];
            for (int i7 = i5; i7 < (i6 - i4) + i5; i7++) {
                i3 = (i3 * 31) + bArr[i7];
            }
            i2++;
            i4 = i6;
        }
        this.read = i3;
        return i3;
    }

    public final String read() {
        return new SCBUniversalWebViewActivity_ViewBinding(MediaMetadataCompat()).read();
    }

    public final boolean read(int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, int i2) {
        int i3;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "other");
        if (write() - i2 < 0) {
            return false;
        }
        int binarySearch = Arrays.binarySearch(this.RatingCompat, 0, ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length, 1);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        int i4 = 0;
        while (i < i2) {
            if (binarySearch == 0) {
                i3 = 0;
            } else {
                i3 = this.RatingCompat[binarySearch - 1];
            }
            int[] iArr = this.RatingCompat;
            int i5 = iArr[binarySearch];
            int i6 = iArr[((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length + binarySearch];
            int min = Math.min(i2, (i5 - i3) + i3) - i;
            if (!sCBUniversalWebViewActivity_ViewBinding.read(i4, this.MediaBrowserCompat$SearchResultReceiver[binarySearch], i6 + (i - i3), min)) {
                return false;
            }
            i4 += min;
            i += min;
            binarySearch++;
        }
        return true;
    }

    public final boolean read(int i, byte[] bArr, int i2, int i3) {
        int i4;
        onGetStartedClick.write((Object) bArr, "other");
        if (i < 0 || i > write() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int binarySearch = Arrays.binarySearch(this.RatingCompat, 0, ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length, i + 1);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        while (i < i5) {
            if (binarySearch == 0) {
                i4 = 0;
            } else {
                i4 = this.RatingCompat[binarySearch - 1];
            }
            int[] iArr = this.RatingCompat;
            int i6 = iArr[binarySearch];
            int i7 = iArr[((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length + binarySearch];
            int min = Math.min(i5, (i6 - i4) + i4) - i;
            if (!AlertController$RecycleListView.read(this.MediaBrowserCompat$SearchResultReceiver[binarySearch], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            binarySearch++;
        }
        return true;
    }

    public final SCBUniversalWebViewActivity_ViewBinding IconCompatParcelizer() {
        return new SCBUniversalWebViewActivity_ViewBinding(MediaMetadataCompat()).IconCompatParcelizer();
    }

    public final byte[] MediaMetadataCompat() {
        byte[] bArr = new byte[write()];
        int length = ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.RatingCompat;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr2 = this.MediaBrowserCompat$SearchResultReceiver[i];
            int i6 = i5 - i2;
            onGetStartedClick.write((Object) bArr2, "src");
            onGetStartedClick.write((Object) bArr, "dest");
            System.arraycopy(bArr2, i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final String toString() {
        return new SCBUniversalWebViewActivity_ViewBinding(MediaMetadataCompat()).toString();
    }

    public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "buffer");
        int length = ((Object[]) this.MediaBrowserCompat$SearchResultReceiver).length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.RatingCompat;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            PersonalizeActivity personalizeActivity = new PersonalizeActivity(this.MediaBrowserCompat$SearchResultReceiver[i], i3, i3 + (i4 - i2), true, false);
            if (sCBUniversalWebViewActivity.write == null) {
                personalizeActivity.MediaMetadataCompat = personalizeActivity;
                personalizeActivity.MediaBrowserCompat$ItemReceiver = personalizeActivity.MediaMetadataCompat;
                sCBUniversalWebViewActivity.write = personalizeActivity.MediaBrowserCompat$ItemReceiver;
            } else {
                PersonalizeActivity personalizeActivity2 = sCBUniversalWebViewActivity.write;
                if (personalizeActivity2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                PersonalizeActivity personalizeActivity3 = personalizeActivity2.MediaMetadataCompat;
                if (personalizeActivity3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                personalizeActivity3.IconCompatParcelizer(personalizeActivity);
            }
            i++;
            i2 = i4;
        }
        sCBUniversalWebViewActivity.read += (long) write();
    }
}
