// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
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
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        @JvmStatic
        fun getRootAsTestSimpleTableWithEnum(_bb: ByteBuffer): TestSimpleTableWithEnum = getRootAsTestSimpleTableWithEnum(_bb, TestSimpleTableWithEnum())
        @JvmStatic
        fun getRootAsTestSimpleTableWithEnum(_bb: ByteBuffer, obj: TestSimpleTableWithEnum): TestSimpleTableWithEnum {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createTestSimpleTableWithEnum(builder: FlatBufferBuilder, color: UByte) : Int {
            builder.startTable(1)
            addColor(builder, color)
            return endTestSimpleTableWithEnum(builder)
        }
        @JvmStatic
        fun startTestSimpleTableWithEnum(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addColor(builder: FlatBufferBuilder, color: UByte) = builder.addByte(0, color.toByte(), 2)
        @JvmStatic
        fun endTestSimpleTableWithEnum(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
