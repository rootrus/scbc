package p040o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: o.OutgoingAdapter$OutgoingHolder_ViewBinding */
final class OutgoingAdapter$OutgoingHolder_ViewBinding implements Externalizable {
    static final byte CHRONO_LOCALDATETIME_TYPE = 12;
    static final byte CHRONO_TYPE = 11;
    static final byte CHRONO_ZONEDDATETIME_TYPE = 13;
    static final byte HIJRAH_DATE_TYPE = 3;
    static final byte HIJRAH_ERA_TYPE = 4;
    static final byte JAPANESE_DATE_TYPE = 1;
    static final byte JAPANESE_ERA_TYPE = 2;
    static final byte MINGUO_DATE_TYPE = 5;
    static final byte MINGUO_ERA_TYPE = 6;
    static final byte THAIBUDDHIST_DATE_TYPE = 7;
    static final byte THAIBUDDHIST_ERA_TYPE = 8;
    private static final long serialVersionUID = 7857518227608961174L;
    private Object object;
    private byte type;

    public OutgoingAdapter$OutgoingHolder_ViewBinding() {
    }

    OutgoingAdapter$OutgoingHolder_ViewBinding(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        writeInternal(this.type, this.object, objectOutput);
    }

    private static void writeInternal(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((IncomingAdapter$IncomingHolder_ViewBinding) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((RegistrationManageDeviceAdapter$DeviceItemViewHolder) obj).writeExternal(objectOutput);
                return;
            case 4:
                ((RemittanceCountryListAdapter$CountryExpandViewHolder) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((ScheduleListAdapter$ScheduleListNoHeaderViewHolder) obj).writeExternal(objectOutput);
                return;
            case 6:
                ((OutgoingAdapter$OutgoingHolder) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) obj).writeExternal(objectOutput);
                return;
            case 8:
                ((C6876x5571234) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((C7022x6c0e8d61) obj).writeExternal(objectOutput);
                return;
            case 12:
                ((DepositAccountsAdapter$DepositAccountHolder) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((RegistrationCountrySearchAdapter$CountryItemViewHolder) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    static Object read(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return readInternal(objectInput.readByte(), objectInput);
    }

    private static Object readInternal(byte b, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b) {
            case 1:
                return RemittanceCountryListAdapter$CountryViewHolder_ViewBinding.readExternal(objectInput);
            case 2:
                return IncomingAdapter$IncomingHolder_ViewBinding.readExternal(objectInput);
            case 3:
                return RegistrationManageDeviceAdapter$DeviceItemViewHolder.readExternal(objectInput);
            case 4:
                return RemittanceCountryListAdapter$CountryExpandViewHolder.readExternal(objectInput);
            case 5:
                return ScheduleListAdapter$ScheduleListNoHeaderViewHolder.readExternal(objectInput);
            case 6:
                return OutgoingAdapter$OutgoingHolder.readExternal(objectInput);
            case 7:
                return ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding.readExternal(objectInput);
            case 8:
                return C6876x5571234.readExternal(objectInput);
            case 11:
                return C7022x6c0e8d61.readExternal(objectInput);
            case 12:
                return DepositAccountsAdapter$DepositAccountHolder.readExternal(objectInput);
            case 13:
                return RegistrationCountrySearchAdapter$CountryItemViewHolder.readExternal(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.object;
    }
}
