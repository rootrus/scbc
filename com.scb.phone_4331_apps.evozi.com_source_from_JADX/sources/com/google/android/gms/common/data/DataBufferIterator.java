package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataBufferIterator<T> implements Iterator<T> {
    protected final DataBuffer<T> zaln;
    protected int zalo = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.zaln = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    public boolean hasNext() {
        return this.zalo < this.zaln.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.zaln;
            int i = this.zalo + 1;
            this.zalo = i;
            return dataBuffer.get(i);
        }
        int i2 = this.zalo;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}