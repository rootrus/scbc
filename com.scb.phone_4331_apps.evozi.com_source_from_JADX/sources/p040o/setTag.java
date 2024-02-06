package p040o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p040o.Placeholder;
import p040o.setOnCloseListener;

/* renamed from: o.setTag */
public final class setTag implements Placeholder.write {
    final Placeholder IconCompatParcelizer;
    public final ArrayList<setTag$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    final boolean MediaBrowserCompat$ItemReceiver;
    private setOnCloseListener.read<setTag$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$MediaItem;
    public final ArrayList<setTag$MediaBrowserCompat$CustomActionResultReceiver> MediaDescriptionCompat;
    final write read;
    public int write;

    /* renamed from: o.setTag$write */
    public interface write {
        void IconCompatParcelizer(int i, int i2);

        void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2);

        void MediaBrowserCompat$CustomActionResultReceiver(setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver);

        void MediaBrowserCompat$ItemReceiver(int i, int i2);

        void read(int i, int i2);

        void read(setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver);

        RecyclerView.setContentView write(int i);

        void write(int i, int i2, Object obj);
    }

    public setTag(write write2) {
        this(write2, (byte) 0);
    }

    private setTag(write write2, byte b) {
        this.MediaBrowserCompat$MediaItem = new setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver(30);
        this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
        this.MediaDescriptionCompat = new ArrayList<>();
        this.write = 0;
        this.read = write2;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = new Placeholder(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0221, code lost:
        if (r9 == 8) goto L_0x02e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r16 = this;
            r0 = r16
            o.Placeholder r1 = r0.IconCompatParcelizer
            java.util.ArrayList<o.setTag$MediaBrowserCompat$CustomActionResultReceiver> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0006:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x000d:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0023
            java.lang.Object r9 = r2.get(r3)
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r9 = (p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r9
            int r9 = r9.MediaBrowserCompat$ItemReceiver
            if (r9 != r7) goto L_0x001f
            if (r6 == 0) goto L_0x0020
            goto L_0x0024
        L_0x001f:
            r6 = r4
        L_0x0020:
            int r3 = r3 + -1
            goto L_0x000d
        L_0x0023:
            r3 = r8
        L_0x0024:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x0207
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r11 = (p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r11
            java.lang.Object r12 = r2.get(r7)
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r12 = (p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r12
            int r13 = r12.MediaBrowserCompat$ItemReceiver
            if (r13 == r4) goto L_0x01cf
            if (r13 == r9) goto L_0x00b1
            if (r13 != r6) goto L_0x0006
            int r5 = r11.write
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 >= r8) goto L_0x004b
            int r5 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5 - r4
            r12.MediaBrowserCompat$CustomActionResultReceiver = r5
            goto L_0x0064
        L_0x004b:
            int r5 = r11.write
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r12.write
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r5 = r12.write
            int r5 = r5 - r4
            r12.write = r5
            o.Placeholder$write r5 = r1.read
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r9 = r12.IconCompatParcelizer
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r5 = r5.MediaBrowserCompat$CustomActionResultReceiver(r6, r8, r4, r9)
            goto L_0x0065
        L_0x0064:
            r5 = r10
        L_0x0065:
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 > r9) goto L_0x0071
            int r6 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6 + r4
            r12.MediaBrowserCompat$CustomActionResultReceiver = r6
            goto L_0x0092
        L_0x0071:
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r12.write
            int r9 = r9 + r13
            if (r8 >= r9) goto L_0x0092
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r12.write
            int r8 = r8 + r9
            int r9 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8 - r9
            o.Placeholder$write r9 = r1.read
            int r10 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10 + r4
            java.lang.Object r4 = r12.IconCompatParcelizer
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r10 = r9.MediaBrowserCompat$CustomActionResultReceiver(r6, r10, r8, r4)
            int r4 = r12.write
            int r4 = r4 - r8
            r12.write = r4
        L_0x0092:
            r2.set(r7, r11)
            int r4 = r12.write
            if (r4 <= 0) goto L_0x009d
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x009d:
            r2.remove(r3)
            o.Placeholder$write r4 = r1.read
            r4.MediaBrowserCompat$CustomActionResultReceiver(r12)
        L_0x00a5:
            if (r5 == 0) goto L_0x00aa
            r2.add(r3, r5)
        L_0x00aa:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00b1:
            int r6 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r11.write
            if (r6 >= r8) goto L_0x00cb
            int r6 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 != r8) goto L_0x00c8
            int r6 = r12.write
            int r8 = r11.write
            int r13 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8 - r13
            if (r6 != r8) goto L_0x00c8
            r5 = r4
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            r6 = 0
            goto L_0x00e0
        L_0x00cb:
            int r6 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r11.write
            int r8 = r8 + r4
            if (r6 != r8) goto L_0x00de
            int r6 = r12.write
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r11.write
            int r8 = r8 - r13
            if (r6 != r8) goto L_0x00de
            r5 = r4
            r6 = r5
            goto L_0x00e0
        L_0x00de:
            r6 = r4
            r5 = 0
        L_0x00e0:
            int r8 = r11.write
            int r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 >= r13) goto L_0x00ec
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8 - r4
            r12.MediaBrowserCompat$CustomActionResultReceiver = r8
            goto L_0x010c
        L_0x00ec:
            int r8 = r11.write
            int r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r14 = r12.write
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x010c
            int r3 = r12.write
            int r3 = r3 - r4
            r12.write = r3
            r11.MediaBrowserCompat$ItemReceiver = r9
            r11.write = r4
            int r3 = r12.write
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            o.Placeholder$write r3 = r1.read
            r3.MediaBrowserCompat$CustomActionResultReceiver(r12)
            goto L_0x0006
        L_0x010c:
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 > r13) goto L_0x0118
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8 + r4
            r12.MediaBrowserCompat$CustomActionResultReceiver = r8
            goto L_0x013a
        L_0x0118:
            int r8 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r14 = r12.write
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x013a
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r12.write
            int r14 = r11.MediaBrowserCompat$CustomActionResultReceiver
            o.Placeholder$write r15 = r1.read
            int r9 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9 + r4
            int r8 = r8 + r13
            int r8 = r8 - r14
            r4 = 2
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r10 = r15.MediaBrowserCompat$CustomActionResultReceiver(r4, r9, r8, r10)
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4 - r8
            r12.write = r4
        L_0x013a:
            if (r5 == 0) goto L_0x0149
            r2.set(r3, r12)
            r2.remove(r7)
            o.Placeholder$write r3 = r1.read
            r3.MediaBrowserCompat$CustomActionResultReceiver(r11)
            goto L_0x0006
        L_0x0149:
            if (r6 == 0) goto L_0x0182
            if (r10 == 0) goto L_0x0167
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 <= r5) goto L_0x015a
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r10.write
            int r4 = r4 - r5
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x015a:
            int r4 = r11.write
            int r5 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 <= r5) goto L_0x0167
            int r4 = r11.write
            int r5 = r10.write
            int r4 = r4 - r5
            r11.write = r4
        L_0x0167:
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 <= r5) goto L_0x0174
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r12.write
            int r4 = r4 - r5
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x0174:
            int r4 = r11.write
            int r5 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 <= r5) goto L_0x01b8
            int r4 = r11.write
            int r5 = r12.write
            int r4 = r4 - r5
            r11.write = r4
            goto L_0x01b8
        L_0x0182:
            if (r10 == 0) goto L_0x019e
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 < r5) goto L_0x0191
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r10.write
            int r4 = r4 - r5
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x0191:
            int r4 = r11.write
            int r5 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 < r5) goto L_0x019e
            int r4 = r11.write
            int r5 = r10.write
            int r4 = r4 - r5
            r11.write = r4
        L_0x019e:
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 < r5) goto L_0x01ab
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r12.write
            int r4 = r4 - r5
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x01ab:
            int r4 = r11.write
            int r5 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 < r5) goto L_0x01b8
            int r4 = r11.write
            int r5 = r12.write
            int r4 = r4 - r5
            r11.write = r4
        L_0x01b8:
            r2.set(r3, r12)
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r11.write
            if (r4 == r5) goto L_0x01c5
            r2.set(r7, r11)
            goto L_0x01c8
        L_0x01c5:
            r2.remove(r7)
        L_0x01c8:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x01cf:
            int r4 = r11.write
            int r6 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 >= r6) goto L_0x01d7
            r5 = r8
            goto L_0x01d8
        L_0x01d7:
            r5 = 0
        L_0x01d8:
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 >= r6) goto L_0x01e0
            int r5 = r5 + 1
        L_0x01e0:
            int r4 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r11.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 > r6) goto L_0x01ed
            int r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r12.write
            int r4 = r4 + r6
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x01ed:
            int r4 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r11.write
            if (r4 > r6) goto L_0x01fa
            int r4 = r11.write
            int r6 = r12.write
            int r4 = r4 + r6
            r11.write = r4
        L_0x01fa:
            int r4 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4 + r5
            r12.MediaBrowserCompat$CustomActionResultReceiver = r4
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x0207:
            java.util.ArrayList<o.setTag$MediaBrowserCompat$CustomActionResultReceiver> r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.size()
            r2 = 0
        L_0x020e:
            if (r2 >= r1) goto L_0x02f0
            java.util.ArrayList<o.setTag$MediaBrowserCompat$CustomActionResultReceiver> r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.get(r2)
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r3 = (p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r3
            int r9 = r3.MediaBrowserCompat$ItemReceiver
            if (r9 == r4) goto L_0x02e8
            r11 = 2
            if (r9 == r11) goto L_0x0284
            if (r9 == r6) goto L_0x0228
            if (r9 != r7) goto L_0x0225
            goto L_0x02e8
        L_0x0225:
            r9 = 2
            goto L_0x02ec
        L_0x0228:
            int r9 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r12 = r3.write
            int r13 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r15 = r8
            r14 = 0
        L_0x0232:
            int r5 = r11 + r12
            if (r13 >= r5) goto L_0x0265
            o.setTag$write r5 = r0.read
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r5.write(r13)
            if (r5 != 0) goto L_0x0253
            boolean r5 = r0.IconCompatParcelizer((int) r13)
            if (r5 != 0) goto L_0x0253
            if (r15 != r4) goto L_0x0251
            java.lang.Object r5 = r3.IconCompatParcelizer
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.MediaBrowserCompat$CustomActionResultReceiver(r6, r9, r14, r5)
            r0.read((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r5)
            r9 = r13
            r14 = 0
        L_0x0251:
            r15 = 0
            goto L_0x0261
        L_0x0253:
            if (r15 != 0) goto L_0x0260
            java.lang.Object r5 = r3.IconCompatParcelizer
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.MediaBrowserCompat$CustomActionResultReceiver(r6, r9, r14, r5)
            r0.IconCompatParcelizer((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r5)
            r9 = r13
            r14 = 0
        L_0x0260:
            r15 = r4
        L_0x0261:
            int r14 = r14 + r4
            int r13 = r13 + 1
            goto L_0x0232
        L_0x0265:
            int r5 = r3.write
            if (r14 == r5) goto L_0x027a
            java.lang.Object r5 = r3.IconCompatParcelizer
            boolean r11 = r0.MediaBrowserCompat$ItemReceiver
            if (r11 != 0) goto L_0x0276
            r3.IconCompatParcelizer = r10
            o.setOnCloseListener$read<o.setTag$MediaBrowserCompat$CustomActionResultReceiver> r11 = r0.MediaBrowserCompat$MediaItem
            r11.MediaBrowserCompat$CustomActionResultReceiver(r3)
        L_0x0276:
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.MediaBrowserCompat$CustomActionResultReceiver(r6, r9, r14, r5)
        L_0x027a:
            if (r15 != 0) goto L_0x0280
            r0.IconCompatParcelizer((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r3)
            goto L_0x0225
        L_0x0280:
            r0.read((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r3)
            goto L_0x0225
        L_0x0284:
            int r5 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r3.write
            int r9 = r9 + r11
            int r11 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r13 = r8
            r12 = 0
        L_0x028f:
            if (r11 >= r9) goto L_0x02c8
            o.setTag$write r14 = r0.read
            androidx.recyclerview.widget.RecyclerView$setContentView r14 = r14.write(r11)
            if (r14 != 0) goto L_0x02af
            boolean r14 = r0.IconCompatParcelizer((int) r11)
            if (r14 != 0) goto L_0x02af
            if (r13 != r4) goto L_0x02ab
            r14 = 2
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r14, r5, r12, r10)
            r0.read((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r13)
            r13 = r4
            goto L_0x02ad
        L_0x02ab:
            r14 = 2
            r13 = 0
        L_0x02ad:
            r14 = 0
            goto L_0x02bd
        L_0x02af:
            r14 = 2
            if (r13 != 0) goto L_0x02bb
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r14, r5, r12, r10)
            r0.IconCompatParcelizer((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r13)
            r13 = r4
            goto L_0x02bc
        L_0x02bb:
            r13 = 0
        L_0x02bc:
            r14 = r4
        L_0x02bd:
            if (r13 == 0) goto L_0x02c3
            int r11 = r11 - r12
            int r9 = r9 - r12
            r12 = r4
            goto L_0x02c5
        L_0x02c3:
            int r12 = r12 + 1
        L_0x02c5:
            int r11 = r11 + r4
            r13 = r14
            goto L_0x028f
        L_0x02c8:
            int r9 = r3.write
            if (r12 == r9) goto L_0x02dd
            boolean r9 = r0.MediaBrowserCompat$ItemReceiver
            if (r9 != 0) goto L_0x02d7
            r3.IconCompatParcelizer = r10
            o.setOnCloseListener$read<o.setTag$MediaBrowserCompat$CustomActionResultReceiver> r9 = r0.MediaBrowserCompat$MediaItem
            r9.MediaBrowserCompat$CustomActionResultReceiver(r3)
        L_0x02d7:
            r9 = 2
            o.setTag$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.MediaBrowserCompat$CustomActionResultReceiver(r9, r5, r12, r10)
            goto L_0x02de
        L_0x02dd:
            r9 = 2
        L_0x02de:
            if (r13 != 0) goto L_0x02e4
            r0.IconCompatParcelizer((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r3)
            goto L_0x02ec
        L_0x02e4:
            r0.read((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r3)
            goto L_0x02ec
        L_0x02e8:
            r9 = 2
            r0.read((p040o.setTag$MediaBrowserCompat$CustomActionResultReceiver) r3)
        L_0x02ec:
            int r2 = r2 + 1
            goto L_0x020e
        L_0x02f0:
            java.util.ArrayList<o.setTag$MediaBrowserCompat$CustomActionResultReceiver> r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTag.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        int size = this.MediaDescriptionCompat.size();
        for (int i = 0; i < size; i++) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat.get(i));
        }
        write(this.MediaDescriptionCompat);
        this.write = 0;
    }

    private void IconCompatParcelizer(setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver) {
        int i;
        if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 1 || settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int IconCompatParcelizer2 = IconCompatParcelizer(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
        int i2 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(settag_mediabrowsercompat_customactionresultreceiver);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = 1;
        for (int i5 = 1; i5 < settag_mediabrowsercompat_customactionresultreceiver.write; i5++) {
            int IconCompatParcelizer3 = IconCompatParcelizer(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver + (i * i5), settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
            int i6 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            if (i6 == 2 ? IconCompatParcelizer3 == IconCompatParcelizer2 : i6 == 4 && IconCompatParcelizer3 == IconCompatParcelizer2 + 1) {
                i4++;
            } else {
                setTag$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer2, i4, settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
                MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2, i2);
                if (!this.MediaBrowserCompat$ItemReceiver) {
                    MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = null;
                    this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                }
                if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 4) {
                    i2 += i4;
                }
                i4 = 1;
                IconCompatParcelizer2 = IconCompatParcelizer3;
            }
        }
        Object obj = settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        if (!this.MediaBrowserCompat$ItemReceiver) {
            settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = null;
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
        }
        if (i4 > 0) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer2, i4, obj);
            MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver3, i2);
            if (!this.MediaBrowserCompat$ItemReceiver) {
                MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer = null;
                this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3);
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver, int i) {
        this.read.read(settag_mediabrowsercompat_customactionresultreceiver);
        int i2 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        if (i2 == 2) {
            this.read.MediaBrowserCompat$ItemReceiver(i, settag_mediabrowsercompat_customactionresultreceiver.write);
        } else if (i2 == 4) {
            this.read.write(i, settag_mediabrowsercompat_customactionresultreceiver.write, settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int IconCompatParcelizer(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.MediaDescriptionCompat.size() - 1; size >= 0; size--) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = this.MediaDescriptionCompat.get(size);
            if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 8) {
                if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver < settag_mediabrowsercompat_customactionresultreceiver.write) {
                    i4 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                    i3 = settag_mediabrowsercompat_customactionresultreceiver.write;
                } else {
                    i4 = settag_mediabrowsercompat_customactionresultreceiver.write;
                    i3 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                }
                if (i < i4 || i > i3) {
                    if (i < settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                        if (i2 == 1) {
                            settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver++;
                            settag_mediabrowsercompat_customactionresultreceiver.write++;
                        } else if (i2 == 2) {
                            settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver--;
                            settag_mediabrowsercompat_customactionresultreceiver.write--;
                        }
                    }
                } else if (i4 == settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (i2 == 1) {
                        settag_mediabrowsercompat_customactionresultreceiver.write++;
                    } else if (i2 == 2) {
                        settag_mediabrowsercompat_customactionresultreceiver.write--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver++;
                    } else if (i2 == 2) {
                        settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver--;
                    }
                    i--;
                }
            } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver <= i) {
                if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 1) {
                    i -= settag_mediabrowsercompat_customactionresultreceiver.write;
                } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 2) {
                    i += settag_mediabrowsercompat_customactionresultreceiver.write;
                }
            } else if (i2 == 1) {
                settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver++;
            } else if (i2 == 2) {
                settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver--;
            }
        }
        for (int size2 = this.MediaDescriptionCompat.size() - 1; size2 >= 0; size2--) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver2 = this.MediaDescriptionCompat.get(size2);
            if (settag_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver == 8) {
                if (settag_mediabrowsercompat_customactionresultreceiver2.write == settag_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$CustomActionResultReceiver || settag_mediabrowsercompat_customactionresultreceiver2.write < 0) {
                    this.MediaDescriptionCompat.remove(size2);
                    if (!this.MediaBrowserCompat$ItemReceiver) {
                        settag_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer = null;
                        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver2);
                    }
                }
            } else if (settag_mediabrowsercompat_customactionresultreceiver2.write <= 0) {
                this.MediaDescriptionCompat.remove(size2);
                if (!this.MediaBrowserCompat$ItemReceiver) {
                    settag_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer = null;
                    this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver2);
                }
            }
        }
        return i;
    }

    private boolean IconCompatParcelizer(int i) {
        int size = this.MediaDescriptionCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = this.MediaDescriptionCompat.get(i2);
            if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 8) {
                if (MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver.write, i2 + 1) == i) {
                    return true;
                }
            } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 1) {
                int i3 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                int i4 = settag_mediabrowsercompat_customactionresultreceiver.write;
                for (int i5 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver; i5 < i3 + i4; i5++) {
                    if (MediaBrowserCompat$CustomActionResultReceiver(i5, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void read(setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver) {
        this.MediaDescriptionCompat.add(settag_mediabrowsercompat_customactionresultreceiver);
        int i = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        if (i == 1) {
            this.read.IconCompatParcelizer(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write);
        } else if (i == 2) {
            this.read.read(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write);
        } else if (i == 4) {
            this.read.write(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write, settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
        } else if (i == 8) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(settag_mediabrowsercompat_customactionresultreceiver);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        return MediaBrowserCompat$CustomActionResultReceiver(i, 0);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        int size = this.MediaDescriptionCompat.size();
        while (i2 < size) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = this.MediaDescriptionCompat.get(i2);
            if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 8) {
                if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver == i) {
                    i = settag_mediabrowsercompat_customactionresultreceiver.write;
                } else {
                    if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver < i) {
                        i--;
                    }
                    if (settag_mediabrowsercompat_customactionresultreceiver.write <= i) {
                        i++;
                    }
                }
            } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver > i) {
                continue;
            } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 2) {
                if (i < settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver + settag_mediabrowsercompat_customactionresultreceiver.write) {
                    return -1;
                }
                i -= settag_mediabrowsercompat_customactionresultreceiver.write;
            } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == 1) {
                i += settag_mediabrowsercompat_customactionresultreceiver.write;
            }
            i2++;
        }
        return i;
    }

    public final void read() {
        MediaBrowserCompat$ItemReceiver();
        int size = this.MediaBrowserCompat$CustomActionResultReceiver.size();
        for (int i = 0; i < size; i++) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
            int i2 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            if (i2 == 1) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
                this.read.IconCompatParcelizer(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write);
            } else if (i2 == 2) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
                this.read.MediaBrowserCompat$ItemReceiver(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write);
            } else if (i2 == 4) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
                this.read.write(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write, settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
            } else if (i2 == 8) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
                this.read.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, settag_mediabrowsercompat_customactionresultreceiver.write);
            }
        }
        write(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.write = 0;
    }

    public final int read(int i) {
        int size = this.MediaBrowserCompat$CustomActionResultReceiver.size();
        for (int i2 = 0; i2 < size; i2++) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get(i2);
            int i3 = settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver == i) {
                            i = settag_mediabrowsercompat_customactionresultreceiver.write;
                        } else {
                            if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver < i) {
                                i--;
                            }
                            if (settag_mediabrowsercompat_customactionresultreceiver.write <= i) {
                                i++;
                            }
                        }
                    }
                } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver > i) {
                    continue;
                } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver + settag_mediabrowsercompat_customactionresultreceiver.write > i) {
                    return -1;
                } else {
                    i -= settag_mediabrowsercompat_customactionresultreceiver.write;
                }
            } else if (settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver <= i) {
                i += settag_mediabrowsercompat_customactionresultreceiver.write;
            }
        }
        return i;
    }

    public final setTag$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, Object obj) {
        setTag$MediaBrowserCompat$CustomActionResultReceiver read2 = this.MediaBrowserCompat$MediaItem.read();
        if (read2 == null) {
            return new setTag$MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, obj);
        }
        read2.MediaBrowserCompat$ItemReceiver = i;
        read2.MediaBrowserCompat$CustomActionResultReceiver = i2;
        read2.write = i3;
        read2.IconCompatParcelizer = obj;
        return read2;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = null;
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
        }
    }

    public final void write(List<setTag$MediaBrowserCompat$CustomActionResultReceiver> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = list.get(i);
            if (!this.MediaBrowserCompat$ItemReceiver) {
                settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = null;
                this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(settag_mediabrowsercompat_customactionresultreceiver);
            }
        }
        list.clear();
    }
}
