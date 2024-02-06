package p040o;

import com.google.android.gms.common.api.Api;
import java.util.Stack;

/* renamed from: o.TouchPointLivenessCheckActivity */
public final class TouchPointLivenessCheckActivity implements Cloneable {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean read;
    public Stack<write> write;

    public TouchPointLivenessCheckActivity() {
        this.write = new Stack<>();
        this.read = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.IconCompatParcelizer = false;
    }

    private TouchPointLivenessCheckActivity(Stack<write> stack, boolean z, boolean z2, boolean z3) {
        this.write = stack;
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        this.IconCompatParcelizer = z3;
    }

    public final int write() {
        if (!this.write.isEmpty()) {
            return this.write.peek().IconCompatParcelizer;
        }
        throw new IllegalStateException("Tag not yet read.");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (!this.write.isEmpty()) {
            write peek = this.write.peek();
            int i2 = peek.MediaBrowserCompat$CustomActionResultReceiver - peek.MediaBrowserCompat$ItemReceiver;
            if (i <= i2) {
                peek.MediaBrowserCompat$ItemReceiver += i;
                int i3 = peek.MediaBrowserCompat$CustomActionResultReceiver;
                if (peek.MediaBrowserCompat$ItemReceiver == i3) {
                    this.write.pop();
                    MediaBrowserCompat$CustomActionResultReceiver(i3);
                    this.read = true;
                    this.MediaBrowserCompat$CustomActionResultReceiver = false;
                    this.IconCompatParcelizer = false;
                    return;
                }
                this.read = false;
                this.MediaBrowserCompat$CustomActionResultReceiver = false;
                this.IconCompatParcelizer = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot process ");
            sb.append(i);
            sb.append(" bytes! Only ");
            sb.append(i2);
            sb.append(" bytes left in this TLV object ");
            sb.append(peek);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final Object clone() {
        Stack stack = new Stack();
        for (int i = 0; i < this.write.size(); i++) {
            stack.add((write) this.write.get(i).clone());
        }
        return new TouchPointLivenessCheckActivity(stack, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
    }

    public final String toString() {
        return this.write.toString();
    }

    /* renamed from: o.TouchPointLivenessCheckActivity$write */
    public class write implements Cloneable {
        int IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        public int MediaBrowserCompat$ItemReceiver = 0;

        public write(int i) {
            this.IconCompatParcelizer = i;
        }

        public final Object clone() {
            write write = new write(this.IconCompatParcelizer);
            write.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            write.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
            return write;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[TLStruct ");
            sb.append(Integer.toHexString(this.IconCompatParcelizer));
            sb.append(", ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", ");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append("]");
            return sb.toString();
        }
    }
}
