package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.PrepaidTransactionAdapter$ChildViewHolder_ViewBinding */
public final class PrepaidTransactionAdapter$ChildViewHolder_ViewBinding implements Externalizable {
    static final byte DURATION_TYPE = 1;
    static final byte INSTANT_TYPE = 2;
    static final byte LOCAL_DATE_TIME_TYPE = 4;
    static final byte LOCAL_DATE_TYPE = 3;
    static final byte LOCAL_TIME_TYPE = 5;
    static final byte MONTH_DAY_TYPE = 64;
    static final byte OFFSET_DATE_TIME_TYPE = 69;
    static final byte OFFSET_TIME_TYPE = 66;
    static final byte YEAR_MONTH_TYPE = 68;
    static final byte YEAR_TYPE = 67;
    static final byte ZONED_DATE_TIME_TYPE = 6;
    static final byte ZONE_OFFSET_TYPE = 8;
    static final byte ZONE_REGION_TYPE = 7;
    private static final long serialVersionUID = -7683839454370182990L;
    private Object object;
    private byte type;

    public PrepaidTransactionAdapter$ChildViewHolder_ViewBinding() {
    }

    public PrepaidTransactionAdapter$ChildViewHolder_ViewBinding(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        writeInternal(this.type, this.object, objectOutput);
    }

    static void writeInternal(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((QuickAccountSelectAdapter$SelectedHolder_ViewBinding) obj).writeExternal(dataOutput);
                    return;
                case 2:
                    ((QuickAccountSelectAdapter$HeaderHolder_ViewBinding) obj).writeExternal(dataOutput);
                    return;
                case 3:
                    ((QuickAccountSelectAdapter$UnselectedHolder) obj).writeExternal(dataOutput);
                    return;
                case 4:
                    ((QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) obj).writeExternal(dataOutput);
                    return;
                case 5:
                    ((QuickAccountSelectAdapter$SelectedHolder) obj).writeExternal(dataOutput);
                    return;
                case 6:
                    ((ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) obj).writeExternal(dataOutput);
                    return;
                case 7:
                    ((LanguageSettingAdapter$LanguageSettingHolder) obj).writeExternal(dataOutput);
                    return;
                case 8:
                    ((ManageAccountInboundViewHolder_ViewBinding) obj).writeExternal(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((PrepaidTransactionAdapter$ParentViewHolder) obj).writeExternal(dataOutput);
                            return;
                        case 67:
                            ((ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) obj).writeExternal(dataOutput);
                            return;
                        case 68:
                            ((C10412xd5495acd) obj).writeExternal(dataOutput);
                            return;
                        case 69:
                            ((OffsetDateTime) obj).writeExternal(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((ManageAccountInboundViewHolder) obj).writeExternal(dataOutput);
        }
    }

    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    static Object read(DataInput dataInput) throws IOException {
        return readInternal(dataInput.readByte(), dataInput);
    }

    private static Object readInternal(byte b, DataInput dataInput) throws IOException {
        if (b == 64) {
            return ManageAccountInboundViewHolder.readExternal(dataInput);
        }
        switch (b) {
            case 1:
                return QuickAccountSelectAdapter$SelectedHolder_ViewBinding.readExternal(dataInput);
            case 2:
                return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.readExternal(dataInput);
            case 3:
                return QuickAccountSelectAdapter$UnselectedHolder.readExternal(dataInput);
            case 4:
                return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.readExternal(dataInput);
            case 5:
                return QuickAccountSelectAdapter$SelectedHolder.readExternal(dataInput);
            case 6:
                return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.readExternal(dataInput);
            case 7:
                return LanguageSettingAdapter$LanguageSettingHolder.readExternal(dataInput);
            case 8:
                return ManageAccountInboundViewHolder_ViewBinding.readExternal(dataInput);
            default:
                switch (b) {
                    case 66:
                        return PrepaidTransactionAdapter$ParentViewHolder.readExternal(dataInput);
                    case 67:
                        return ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.readExternal(dataInput);
                    case 68:
                        return C10412xd5495acd.readExternal(dataInput);
                    case 69:
                        return OffsetDateTime.readExternal(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.object;
    }
}
