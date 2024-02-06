package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: o.FavouriteTargetAdapter$ItemViewHolder_ViewBinding */
final class FavouriteTargetAdapter$ItemViewHolder_ViewBinding implements Externalizable {
    static final byte SZR = 1;
    static final byte ZOT = 2;
    static final byte ZOTRULE = 3;
    private static final long serialVersionUID = -8885321777449118786L;
    private Object object;
    private byte type;

    public FavouriteTargetAdapter$ItemViewHolder_ViewBinding() {
    }

    FavouriteTargetAdapter$ItemViewHolder_ViewBinding(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        writeInternal(this.type, this.object, objectOutput);
    }

    static void write(Object obj, DataOutput dataOutput) throws IOException {
        writeInternal((byte) 1, obj, dataOutput);
    }

    private static void writeInternal(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((EditFavouriteAdapter$EditFavouriteHolder) obj).writeExternal(dataOutput);
        } else if (b == 2) {
            ((HistoryAdapter$ChildViewHolder_ViewBinding) obj).writeExternal(dataOutput);
        } else if (b == 3) {
            ((C6484x9e7f23a1) obj).writeExternal(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    static Object read(DataInput dataInput) throws IOException, ClassNotFoundException {
        return readInternal(dataInput.readByte(), dataInput);
    }

    private static Object readInternal(byte b, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b == 1) {
            return EditFavouriteAdapter$EditFavouriteHolder.readExternal(dataInput);
        }
        if (b == 2) {
            return HistoryAdapter$ChildViewHolder_ViewBinding.readExternal(dataInput);
        }
        if (b == 3) {
            return C6484x9e7f23a1.readExternal(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    private Object readResolve() {
        return this.object;
    }

    static void writeOffset(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, DataOutput dataOutput) throws IOException {
        int totalSeconds = manageAccountInboundViewHolder_ViewBinding.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    static ManageAccountInboundViewHolder_ViewBinding readOffset(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(dataInput.readInt()) : ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(readByte * 900);
    }

    static void writeEpochSec(long j, DataOutput dataOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
            return;
        }
        int i = (int) ((j + 4575744000L) / 900);
        dataOutput.writeByte((i >>> 16) & 255);
        dataOutput.writeByte((i >>> 8) & 255);
        dataOutput.writeByte(i & 255);
    }

    static long readEpochSec(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
