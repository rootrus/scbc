package org.jmrtd.p100io;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: org.jmrtd.io.FragmentBuffer */
public class FragmentBuffer implements Serializable {
    private static final long serialVersionUID = -3510872461790499721L;
    private byte[] buffer;
    private Collection<Fragment> fragments;

    public FragmentBuffer() {
        this(1024);
    }

    public FragmentBuffer(int i) {
        this.buffer = new byte[i];
        this.fragments = new HashSet();
    }

    public void updateFrom(FragmentBuffer fragmentBuffer) {
        synchronized (this) {
            for (Fragment next : fragmentBuffer.fragments) {
                addFragment(next.offset, fragmentBuffer.buffer, next.offset, next.length);
            }
        }
    }

    public void addFragment(int i, byte b) {
        synchronized (this) {
            addFragment(i, new byte[]{b});
        }
    }

    public void addFragment(int i, byte[] bArr) {
        synchronized (this) {
            addFragment(i, bArr, 0, bArr.length);
        }
    }

    public void addFragment(int i, byte[] bArr, int i2, int i3) {
        synchronized (this) {
            int i4 = i + i3;
            if (i4 > this.buffer.length) {
                setLength(Math.max(i4, this.buffer.length) << 1);
            }
            System.arraycopy(bArr, i2, this.buffer, i, i3);
            for (Fragment fragment : new ArrayList(this.fragments)) {
                if (fragment.getOffset() <= i && i + i3 <= fragment.getOffset() + fragment.getLength()) {
                    return;
                }
                if (fragment.getOffset() <= i && i <= fragment.getOffset() + fragment.getLength()) {
                    int offset = fragment.getOffset();
                    int offset2 = fragment.getOffset();
                    this.fragments.remove(fragment);
                    i3 = (i + i3) - offset;
                    i = offset2;
                } else if (i <= fragment.getOffset() && fragment.getOffset() + fragment.getLength() <= i + i3) {
                    this.fragments.remove(fragment);
                } else if (i <= fragment.getOffset() && fragment.getOffset() <= i + i3) {
                    i3 = (fragment.getOffset() + fragment.getLength()) - i;
                    this.fragments.remove(fragment);
                }
            }
            this.fragments.add(Fragment.getInstance(i, i3));
        }
    }

    public int getPosition() {
        int i;
        synchronized (this) {
            i = 0;
            for (int i2 = 0; i2 < this.buffer.length; i2++) {
                if (isCoveredByFragment(i2)) {
                    i = i2 + 1;
                }
            }
        }
        return i;
    }

    public int getBytesBuffered() {
        int i;
        synchronized (this) {
            i = 0;
            for (int i2 = 0; i2 < this.buffer.length; i2++) {
                if (isCoveredByFragment(i2)) {
                    i++;
                }
            }
        }
        return i;
    }

    public boolean isCoveredByFragment(int i) {
        boolean isCoveredByFragment;
        synchronized (this) {
            isCoveredByFragment = isCoveredByFragment(i, 1);
        }
        return isCoveredByFragment;
    }

    public boolean isCoveredByFragment(int i, int i2) {
        synchronized (this) {
            for (Fragment next : this.fragments) {
                int offset = next.getOffset();
                int offset2 = next.getOffset();
                int length = next.getLength();
                if (offset <= i && i + i2 <= offset2 + length) {
                    return true;
                }
            }
            return false;
        }
    }

    public int getBufferedLength(int i) {
        int i2;
        synchronized (this) {
            int i3 = 0;
            if (i >= this.buffer.length) {
                return 0;
            }
            for (Fragment next : this.fragments) {
                int offset = next.getOffset();
                int offset2 = next.getOffset() + next.getLength();
                if (offset <= i && i < offset2 && (i2 = offset2 - i) > i3) {
                    i3 = i2;
                }
            }
            return i3;
        }
    }

    public Collection<Fragment> getFragments() {
        return this.fragments;
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getLength() {
        return this.buffer.length;
    }

    public Fragment getSmallestUnbufferedFragment(int i, int i2) {
        Fragment instance;
        synchronized (this) {
            Iterator<Fragment> it = this.fragments.iterator();
            int i3 = i;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if (next.getOffset() <= i3 && i3 + i2 <= next.getOffset() + next.getLength()) {
                    i2 = 0;
                    break;
                } else if (next.getOffset() <= i3 && i3 < next.getOffset() + next.getLength()) {
                    int offset = next.getOffset() + next.getLength();
                    i2 = (i3 + i2) - offset;
                    i3 = offset;
                } else if (i3 > next.getOffset() || next.getOffset() + next.getLength() > i3 + i2) {
                    if (i <= next.getOffset() && next.getOffset() < i3 + i2) {
                        i2 = next.getOffset() - i3;
                    }
                }
            }
            instance = Fragment.getInstance(i3, i2);
        }
        return instance;
    }

    public String toString() {
        String obj;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentBuffer [");
            sb.append(this.buffer.length);
            sb.append(", ");
            sb.append(this.fragments);
            sb.append("]");
            obj = sb.toString();
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L_0x0006
            monitor-exit(r4)
            return r0
        L_0x0006:
            r1 = 1
            if (r5 != r4) goto L_0x000b
            monitor-exit(r4)
            return r1
        L_0x000b:
            java.lang.Class r2 = r5.getClass()     // Catch:{ all -> 0x005a }
            java.lang.Class<org.jmrtd.io.FragmentBuffer> r3 = org.jmrtd.p100io.FragmentBuffer.class
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r4)
            return r0
        L_0x0019:
            org.jmrtd.io.FragmentBuffer r5 = (org.jmrtd.p100io.FragmentBuffer) r5     // Catch:{ all -> 0x005a }
            byte[] r2 = r5.buffer     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x0025
            byte[] r2 = r4.buffer     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0025
            monitor-exit(r4)
            return r0
        L_0x0025:
            byte[] r2 = r5.buffer     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x002f
            byte[] r2 = r4.buffer     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x002f
            monitor-exit(r4)
            return r0
        L_0x002f:
            java.util.Collection<org.jmrtd.io.FragmentBuffer$Fragment> r2 = r5.fragments     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x0039
            java.util.Collection<org.jmrtd.io.FragmentBuffer$Fragment> r2 = r4.fragments     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0039
            monitor-exit(r4)
            return r0
        L_0x0039:
            java.util.Collection<org.jmrtd.io.FragmentBuffer$Fragment> r2 = r5.fragments     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0043
            java.util.Collection<org.jmrtd.io.FragmentBuffer$Fragment> r2 = r4.fragments     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x0043
            monitor-exit(r4)
            return r0
        L_0x0043:
            byte[] r2 = r5.buffer     // Catch:{ all -> 0x005a }
            byte[] r3 = r4.buffer     // Catch:{ all -> 0x005a }
            boolean r2 = java.util.Arrays.equals(r2, r3)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0058
            java.util.Collection<org.jmrtd.io.FragmentBuffer$Fragment> r5 = r5.fragments     // Catch:{ all -> 0x005a }
            java.util.Collection<org.jmrtd.io.FragmentBuffer$Fragment> r2 = r4.fragments     // Catch:{ all -> 0x005a }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0058
            r0 = r1
        L_0x0058:
            monitor-exit(r4)
            return r0
        L_0x005a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.p100io.FragmentBuffer.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (Arrays.hashCode(this.buffer) * 3) + (this.fragments.hashCode() << 1) + 7;
    }

    private void setLength(int i) {
        synchronized (this) {
            if (i > this.buffer.length) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.buffer, 0, bArr, 0, this.buffer.length);
                this.buffer = bArr;
            }
        }
    }

    /* renamed from: org.jmrtd.io.FragmentBuffer$Fragment */
    public static class Fragment implements Serializable {
        private static final long serialVersionUID = -3795931618553980328L;
        /* access modifiers changed from: private */
        public int length;
        /* access modifiers changed from: private */
        public int offset;

        public int getOffset() {
            return this.offset;
        }

        public int getLength() {
            return this.length;
        }

        private Fragment(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        public static Fragment getInstance(int i, int i2) {
            return new Fragment(i, i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.offset);
            sb.append(" .. ");
            sb.append((this.offset + this.length) - 1);
            sb.append(" (");
            sb.append(this.length);
            sb.append(")]");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!obj.getClass().equals(Fragment.class)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            if (fragment.offset == this.offset && fragment.length == this.length) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.offset << 1) + (this.length * 3) + 5;
        }
    }
}
