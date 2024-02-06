package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.Guideline;

/* renamed from: o.Guideline$MediaBrowserCompat$CustomActionResultReceiver */
public class Guideline$MediaBrowserCompat$CustomActionResultReceiver {
    final Guideline.IconCompatParcelizer IconCompatParcelizer;
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final int[] MediaBrowserCompat$ItemReceiver;
    private final int[] MediaDescriptionCompat;
    private final boolean RatingCompat = true;
    final int read;
    final List<Guideline$MediaBrowserCompat$SearchResultReceiver> write;

    Guideline$MediaBrowserCompat$CustomActionResultReceiver(Guideline.IconCompatParcelizer iconCompatParcelizer, List<Guideline$MediaBrowserCompat$SearchResultReceiver> list, int[] iArr, int[] iArr2, boolean z) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = iArr;
        this.MediaDescriptionCompat = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.MediaDescriptionCompat, 0);
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.write();
        this.read = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver = this.write.isEmpty() ? null : this.write.get(0);
        if (!(guideline$MediaBrowserCompat$SearchResultReceiver != null && guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver == 0 && guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer == 0)) {
            Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver2 = new Guideline$MediaBrowserCompat$SearchResultReceiver();
            guideline$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver = 0;
            guideline$MediaBrowserCompat$SearchResultReceiver2.IconCompatParcelizer = 0;
            guideline$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = false;
            guideline$MediaBrowserCompat$SearchResultReceiver2.read = 0;
            guideline$MediaBrowserCompat$SearchResultReceiver2.write = false;
            this.write.add(0, guideline$MediaBrowserCompat$SearchResultReceiver2);
        }
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = this.read;
        for (int size = this.write.size() - 1; size >= 0; size--) {
            Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver = this.write.get(size);
            int i3 = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
            int i4 = guideline$MediaBrowserCompat$SearchResultReceiver.read;
            int i5 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
            int i6 = guideline$MediaBrowserCompat$SearchResultReceiver.read;
            if (this.RatingCompat) {
                while (i > i3 + i4) {
                    if (this.MediaBrowserCompat$ItemReceiver[i - 1] == 0) {
                        IconCompatParcelizer(i, i2, size, false);
                    }
                    i--;
                }
                while (i2 > i5 + i6) {
                    if (this.MediaDescriptionCompat[i2 - 1] == 0) {
                        IconCompatParcelizer(i, i2, size, true);
                    }
                    i2--;
                }
            }
            for (int i7 = 0; i7 < guideline$MediaBrowserCompat$SearchResultReceiver.read; i7++) {
                int i8 = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver + i7;
                int i9 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer + i7;
                int i10 = this.IconCompatParcelizer.write(i8, i9) ? 1 : 2;
                this.MediaBrowserCompat$ItemReceiver[i8] = (i9 << 5) | i10;
                this.MediaDescriptionCompat[i9] = (i8 << 5) | i10;
            }
            i = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
            i2 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
        }
    }

    private boolean IconCompatParcelizer(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (z) {
            i2--;
            i4 = i;
            i5 = i2;
        } else {
            i5 = i - 1;
            i4 = i5;
        }
        while (i3 >= 0) {
            Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver = this.write.get(i3);
            int i6 = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
            int i7 = guideline$MediaBrowserCompat$SearchResultReceiver.read;
            int i8 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
            int i9 = guideline$MediaBrowserCompat$SearchResultReceiver.read;
            int i10 = 8;
            if (z) {
                while (true) {
                    i4--;
                    if (i4 < i6 + i7) {
                        continue;
                        break;
                    } else if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i4, i5)) {
                        if (!this.IconCompatParcelizer.write(i4, i5)) {
                            i10 = 4;
                        }
                        this.MediaDescriptionCompat[i5] = (i4 << 5) | 16;
                        this.MediaBrowserCompat$ItemReceiver[i4] = (i5 << 5) | i10;
                        return true;
                    }
                }
            } else {
                for (int i11 = i2 - 1; i11 >= i8 + i9; i11--) {
                    if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i5, i11)) {
                        if (!this.IconCompatParcelizer.write(i5, i11)) {
                            i10 = 4;
                        }
                        int i12 = i - 1;
                        this.MediaBrowserCompat$ItemReceiver[i12] = (i11 << 5) | 16;
                        this.MediaDescriptionCompat[i11] = (i12 << 5) | i10;
                        return true;
                    }
                }
                continue;
            }
            i4 = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
            i2 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
            i3--;
        }
        return false;
    }

    private static Guideline.read MediaBrowserCompat$ItemReceiver(List<Guideline.read> list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            Guideline.read read2 = list.get(size);
            if (read2.MediaBrowserCompat$ItemReceiver == i && read2.write == z) {
                list.remove(size);
                while (size < list.size()) {
                    list.get(size).read += z ? 1 : -1;
                    size++;
                }
                return read2;
            }
            size--;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void read(List<Guideline.read> list, CheckExtractActivity checkExtractActivity, int i, int i2, int i3) {
        if (!this.RatingCompat) {
            checkExtractActivity.read(i, i2);
            return;
        }
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i4 = i3 + i2;
                int i5 = this.MediaDescriptionCompat[i4] & 31;
                if (i5 == 0) {
                    checkExtractActivity.read(i, 1);
                    for (Guideline.read read2 : list) {
                        read2.read++;
                    }
                } else if (i5 == 4 || i5 == 8) {
                    int i6 = this.MediaDescriptionCompat[i4] >> 5;
                    checkExtractActivity.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver(list, i6, true).read, i);
                    if (i5 == 4) {
                        this.IconCompatParcelizer.read(i6, i4);
                        checkExtractActivity.MediaBrowserCompat$CustomActionResultReceiver(i, 1, (Object) null);
                    }
                } else if (i5 == 16) {
                    list.add(new Guideline.read(i4, i, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i4);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i5));
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(List<Guideline.read> list, CheckExtractActivity checkExtractActivity, int i, int i2, int i3) {
        if (!this.RatingCompat) {
            checkExtractActivity.MediaBrowserCompat$ItemReceiver(i, i2);
            return;
        }
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i4 = i3 + i2;
                int i5 = this.MediaBrowserCompat$ItemReceiver[i4] & 31;
                if (i5 == 0) {
                    checkExtractActivity.MediaBrowserCompat$ItemReceiver(i + i2, 1);
                    for (Guideline.read read2 : list) {
                        read2.read--;
                    }
                } else if (i5 == 4 || i5 == 8) {
                    int i6 = this.MediaBrowserCompat$ItemReceiver[i4] >> 5;
                    Guideline.read MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(list, i6, false);
                    checkExtractActivity.IconCompatParcelizer(i + i2, MediaBrowserCompat$ItemReceiver2.read - 1);
                    if (i5 == 4) {
                        int i7 = MediaBrowserCompat$ItemReceiver2.read;
                        this.IconCompatParcelizer.read(i4, i6);
                        checkExtractActivity.MediaBrowserCompat$CustomActionResultReceiver(i7 - 1, 1, (Object) null);
                    }
                } else if (i5 == 16) {
                    list.add(new Guideline.read(i4, i + i2, true));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i4);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i5));
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                return;
            }
        }
    }
}
