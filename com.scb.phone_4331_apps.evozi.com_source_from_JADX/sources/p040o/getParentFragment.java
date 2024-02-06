package p040o;

/* renamed from: o.getParentFragment */
public final class getParentFragment<T> extends C10825getId<T> {
    private int read = 0;
    private final T[] write;

    public getParentFragment(T[] tArr) {
        this.write = tArr;
    }

    public final boolean hasNext() {
        return this.read < this.write.length;
    }

    public final T read() {
        T[] tArr = this.write;
        int i = this.read;
        this.read = i + 1;
        return tArr[i];
    }
}
