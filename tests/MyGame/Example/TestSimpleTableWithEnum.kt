// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@ExperimentalUnsignedTypes
@Suppress("unused")
class TestSimpleTableWithEnum : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : TestSimpleTableWithEnum {
        __init(_i, _bb)
        return this
    }
    val color : UByte
        get() {
            val o = __offset(4)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 2u
        }
    fun mutateColor(color: UByte) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.put(o + bb_pos, color.toByte())
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsTestSimpleTableWithEnum(_bb: ByteBuffer): TestSimpleTableWithEnum = getRootAsTestSimpleTableWithEnum(_bb, TestSimpleTableWithEnum())
        fun getRootAsTestSimpleTableWithEnum(_bb: ByteBuffer, obj: TestSimpleTableWithEnum): TestSimpleTableWithEnum {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createTestSimpleTableWithEnum(builder: FlatBufferBuilder, color: UByte) : Int {
            builder.startTable(1)
            addColor(builder, color)
            return endTestSimpleTableWithEnum(builder)
        }
        fun startTestSimpleTableWithEnum(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addColor(builder: FlatBufferBuilder, color: UByte) = builder.addByte(0, color.toByte(), 2)
        fun endTestSimpleTableWithEnum(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
