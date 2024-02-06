package p040o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: o.DepositTransactionAdapter$ChildViewHolder */
public final class DepositTransactionAdapter$ChildViewHolder {
    public reclaimKey MediaBrowserCompat$CustomActionResultReceiver;
    public setStrokePattern read;

    public DepositTransactionAdapter$ChildViewHolder() {
    }

    public static Charset read(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str);
        }
    }

    public DepositTransactionAdapter$ChildViewHolder(setStrokePattern setstrokepattern, reclaimKey reclaimkey) {
        this.read = setstrokepattern;
        this.MediaBrowserCompat$CustomActionResultReceiver = reclaimkey;
    }
}
