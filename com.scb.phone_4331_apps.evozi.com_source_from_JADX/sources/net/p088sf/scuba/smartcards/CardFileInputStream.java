package net.p088sf.scuba.smartcards;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: net.sf.scuba.smartcards.CardFileInputStream */
public class CardFileInputStream extends InputStream {
    private final byte[] buffer;
    private int bufferLength;
    private int fileLength;

    /* renamed from: fs */
    private FileSystemStructured f5463fs;
    private int markedOffset;
    private int offsetBufferInFile;
    private int offsetInBuffer;
    private FileInfo[] path;

    public CardFileInputStream(int i, FileSystemStructured fileSystemStructured) throws CardServiceException {
        this.f5463fs = fileSystemStructured;
        synchronized (fileSystemStructured) {
            FileInfo[] selectedPath = fileSystemStructured.getSelectedPath();
            if (selectedPath == null || selectedPath.length <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("No valid file selected, path = ");
                sb.append(Arrays.toString(selectedPath));
                throw new CardServiceException(sb.toString());
            }
            FileInfo[] fileInfoArr = new FileInfo[selectedPath.length];
            this.path = fileInfoArr;
            System.arraycopy(selectedPath, 0, fileInfoArr, 0, selectedPath.length);
            this.fileLength = selectedPath[selectedPath.length - 1].getFileLength();
            this.buffer = new byte[i];
            this.bufferLength = 0;
            this.offsetBufferInFile = 0;
            this.offsetInBuffer = 0;
            this.markedOffset = -1;
        }
    }

    public int read() throws IOException {
        synchronized (this.f5463fs) {
            try {
                if (!Arrays.equals(this.path, this.f5463fs.getSelectedPath())) {
                    for (FileInfo fid : this.path) {
                        this.f5463fs.selectFile(fid.getFID());
                    }
                }
                int i = this.offsetBufferInFile + this.offsetInBuffer;
                if (i >= this.fileLength) {
                    return -1;
                }
                if (this.offsetInBuffer >= this.bufferLength) {
                    int min = Math.min(this.buffer.length, this.fileLength - i);
                    int i2 = this.offsetBufferInFile + this.bufferLength;
                    int fillBufferFromFile = fillBufferFromFile(this.path, i2, min);
                    this.offsetBufferInFile = i2;
                    this.offsetInBuffer = 0;
                    this.bufferLength = fillBufferFromFile;
                }
                byte b = this.buffer[this.offsetInBuffer];
                this.offsetInBuffer++;
                return b & 255;
            } catch (CardServiceException e) {
                e.printStackTrace();
                throw new IOException(e.getMessage());
            } catch (CardServiceException e2) {
                throw new IOException(e2.toString());
            } catch (Exception e3) {
                StringBuilder sb = new StringBuilder();
                sb.append("DEBUG: Unexpected Exception: ");
                sb.append(e3.getMessage());
                throw new IOException(sb.toString());
            }
        }
    }

    public long skip(long j) {
        synchronized (this.f5463fs) {
            if (j < ((long) (this.bufferLength - this.offsetInBuffer))) {
                this.offsetInBuffer = (int) (((long) this.offsetInBuffer) + j);
            } else {
                this.offsetBufferInFile = (int) (((long) (this.offsetBufferInFile + this.offsetInBuffer)) + j);
                this.offsetInBuffer = 0;
                this.bufferLength = 0;
            }
        }
        return j;
    }

    public int available() {
        int i;
        int i2;
        synchronized (this) {
            i = this.bufferLength;
            i2 = this.offsetInBuffer;
        }
        return i - i2;
    }

    public void mark(int i) {
        synchronized (this.f5463fs) {
            this.markedOffset = this.offsetBufferInFile + this.offsetInBuffer;
        }
    }

    public void reset() throws IOException {
        synchronized (this.f5463fs) {
            if (this.markedOffset >= 0) {
                this.offsetBufferInFile = this.markedOffset;
                this.offsetInBuffer = 0;
                this.bufferLength = 0;
            } else {
                throw new IOException("Mark not set");
            }
        }
    }

    public boolean markSupported() {
        synchronized (this.f5463fs) {
        }
        return true;
    }

    public int getLength() {
        return this.fileLength;
    }

    public int getPostion() {
        return this.offsetBufferInFile + this.offsetInBuffer;
    }

    private int fillBufferFromFile(FileInfo[] fileInfoArr, int i, int i2) throws CardServiceException {
        int length;
        synchronized (this.f5463fs) {
            if (i2 <= this.buffer.length) {
                if (!Arrays.equals(this.f5463fs.getSelectedPath(), fileInfoArr)) {
                    for (FileInfo fid : fileInfoArr) {
                        this.f5463fs.selectFile(fid.getFID());
                    }
                }
                byte[] readBinary = this.f5463fs.readBinary(i, i2);
                System.arraycopy(readBinary, 0, this.buffer, 0, readBinary.length);
                length = readBinary.length;
            } else {
                throw new IllegalArgumentException("length too big");
            }
        }
        return length;
    }
}
