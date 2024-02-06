package p040o;

/* renamed from: o.rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver */
final class rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver {
    final int IconCompatParcelizer;
    final int write;

    rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.IconCompatParcelizer = i;
        this.write = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.IconCompatParcelizer);
        sb.append(' ');
        sb.append(this.write);
        sb.append('>');
        return sb.toString();
    }
}
