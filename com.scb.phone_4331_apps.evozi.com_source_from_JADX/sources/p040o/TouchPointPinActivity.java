package p040o;

import com.google.android.gms.common.api.Api;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: o.TouchPointPinActivity */
public final class TouchPointPinActivity implements Cloneable {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public Stack<IconCompatParcelizer> write;

    public TouchPointPinActivity() {
        this.write = new Stack<>();
        this.MediaBrowserCompat$ItemReceiver = true;
        this.IconCompatParcelizer = false;
        this.read = false;
    }

    private TouchPointPinActivity(Stack<IconCompatParcelizer> stack, boolean z, boolean z2, boolean z3) {
        this.write = stack;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.IconCompatParcelizer = z2;
        this.read = z3;
    }

    public final void IconCompatParcelizer(int i) {
        if (!this.write.isEmpty()) {
            IconCompatParcelizer peek = this.write.peek();
            if (!peek.write || peek.MediaBrowserCompat$CustomActionResultReceiver != i) {
                peek.MediaBrowserCompat$CustomActionResultReceiver = i;
                peek.write = true;
                if (peek.MediaBrowserCompat$ItemReceiver.size() == peek.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.write.pop();
                    byte[] MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(i);
                    byte[] byteArray = peek.MediaBrowserCompat$ItemReceiver.toByteArray();
                    write(MediaBrowserCompat$ItemReceiver2, 0, MediaBrowserCompat$ItemReceiver2.length);
                    write(byteArray, 0, byteArray.length);
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.IconCompatParcelizer = false;
                    this.read = false;
                }
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (!this.write.isEmpty()) {
            IconCompatParcelizer peek = this.write.peek();
            int size = peek.MediaBrowserCompat$CustomActionResultReceiver - peek.MediaBrowserCompat$ItemReceiver.size();
            if (i2 <= size) {
                peek.MediaBrowserCompat$ItemReceiver.write(bArr, i, i2);
                if (peek.MediaBrowserCompat$ItemReceiver.size() == peek.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.write.pop();
                    write(peek.MediaBrowserCompat$ItemReceiver.toByteArray(), 0, peek.MediaBrowserCompat$CustomActionResultReceiver);
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.IconCompatParcelizer = false;
                    this.read = false;
                    return;
                }
                this.MediaBrowserCompat$ItemReceiver = false;
                this.IconCompatParcelizer = false;
                this.read = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot process ");
            sb.append(i2);
            sb.append(" bytes! Only ");
            sb.append(size);
            sb.append(" bytes left in this TLV object ");
            sb.append(peek);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final Object clone() {
        return new TouchPointPinActivity((Stack) this.write.clone(), this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.read);
    }

    public final String toString() {
        return this.write.toString();
    }

    public final boolean IconCompatParcelizer() {
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            if (!((IconCompatParcelizer) it.next()).write) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o.TouchPointPinActivity$IconCompatParcelizer */
    public class IconCompatParcelizer implements Cloneable {
        public int MediaBrowserCompat$CustomActionResultReceiver = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        public ByteArrayOutputStream MediaBrowserCompat$ItemReceiver = new ByteArrayOutputStream();
        private int read;
        public boolean write = false;

        public IconCompatParcelizer(int i) {
            this.read = i;
        }

        public final Object clone() {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.read);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = byteArrayOutputStream;
            try {
                byteArrayOutputStream.write(this.MediaBrowserCompat$ItemReceiver.toByteArray());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return iconCompatParcelizer;
        }

        public final String toString() {
            byte[] byteArray = this.MediaBrowserCompat$ItemReceiver.toByteArray();
            StringBuilder sb = new StringBuilder();
            sb.append("[TLVStruct ");
            sb.append(Integer.toHexString(this.read));
            sb.append(", ");
            sb.append(this.write ? Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver) : "UNDEFINED");
            sb.append(", ");
            sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(byteArray));
            sb.append("(");
            sb.append(byteArray.length);
            sb.append(") ]");
            return sb.toString();
        }
    }
}
