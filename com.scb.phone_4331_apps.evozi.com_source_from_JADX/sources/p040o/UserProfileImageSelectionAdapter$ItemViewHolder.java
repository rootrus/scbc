package p040o;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* renamed from: o.UserProfileImageSelectionAdapter$ItemViewHolder */
public final class UserProfileImageSelectionAdapter$ItemViewHolder extends BufferedWriter {
    private char[] MediaBrowserCompat$ItemReceiver = new char[64];

    public UserProfileImageSelectionAdapter$ItemViewHolder(Writer writer) {
        super(writer);
        MoneyActionAdapter$CustomViewHolder.read();
    }

    public final void read(MwShopTypeAdapter$ShopTypeViewHolder mwShopTypeAdapter$ShopTypeViewHolder) throws IOException {
        MwPlaceAdapter$PredictionHolder_ViewBinding read = mwShopTypeAdapter$ShopTypeViewHolder.read();
        String str = read.write;
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN ");
        sb.append(str);
        sb.append("-----");
        write(sb.toString());
        newLine();
        if (!read.read.isEmpty()) {
            Iterator it = read.read.iterator();
            while (it.hasNext()) {
                it.next();
                write((String) null);
                write(": ");
                write((String) null);
                newLine();
            }
            newLine();
        }
        read(read.MediaBrowserCompat$ItemReceiver);
        String str2 = read.write;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("-----END ");
        sb2.append(str2);
        sb2.append("-----");
        write(sb2.toString());
        newLine();
    }

    private void read(byte[] bArr) throws IOException {
        int i;
        byte[] read = MoreOptionsAdapter$MoreOptionsHolder_ViewBinding.read(bArr);
        int i2 = 0;
        while (i2 < read.length) {
            int i3 = 0;
            while (true) {
                char[] cArr = this.MediaBrowserCompat$ItemReceiver;
                if (i3 == cArr.length || (i = i2 + i3) >= read.length) {
                    write(this.MediaBrowserCompat$ItemReceiver, 0, i3);
                    newLine();
                    i2 += this.MediaBrowserCompat$ItemReceiver.length;
                } else {
                    cArr[i3] = (char) read[i];
                    i3++;
                }
            }
            write(this.MediaBrowserCompat$ItemReceiver, 0, i3);
            newLine();
            i2 += this.MediaBrowserCompat$ItemReceiver.length;
        }
    }
}
