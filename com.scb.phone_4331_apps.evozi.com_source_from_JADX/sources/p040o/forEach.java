package p040o;

/* renamed from: o.forEach */
public final class forEach {
    final createInvokeID IconCompatParcelizer;
    public final C10823Script MediaBrowserCompat$ItemReceiver;
    public final C10823Script write;

    forEach(C10823Script script, C10823Script script2, createInvokeID createinvokeid) {
        this.write = script;
        this.MediaBrowserCompat$ItemReceiver = script2;
        this.IconCompatParcelizer = createinvokeid;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.write);
        sb.append(" , ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(" : ");
        createInvokeID createinvokeid = this.IconCompatParcelizer;
        if (createinvokeid == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(createinvokeid.write);
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof forEach)) {
            return false;
        }
        forEach foreach = (forEach) obj;
        C10823Script script = this.write;
        C10823Script script2 = foreach.write;
        if (script == null ? script2 == null : script.equals(script2)) {
            C10823Script script3 = this.MediaBrowserCompat$ItemReceiver;
            C10823Script script4 = foreach.MediaBrowserCompat$ItemReceiver;
            if (script3 == null ? script4 == null : script3.equals(script4)) {
                createInvokeID createinvokeid = this.IconCompatParcelizer;
                createInvokeID createinvokeid2 = foreach.IconCompatParcelizer;
                if (createinvokeid == null ? createinvokeid2 == null : createinvokeid.equals(createinvokeid2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        C10823Script script = this.write;
        int i = 0;
        int hashCode = script == null ? 0 : script.hashCode();
        C10823Script script2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = hashCode ^ (script2 == null ? 0 : script2.hashCode());
        createInvokeID createinvokeid = this.IconCompatParcelizer;
        if (createinvokeid != null) {
            i = createinvokeid.hashCode();
        }
        return hashCode2 ^ i;
    }
}
