// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class Test : Struct() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Test {
        __init(_i, _bb)
        return this
    }
    val a : Short get() = bb.getShort(bb_pos + 0)
    val b : Byte get() = bb.get(bb_pos + 2)
    companion object {
        @JvmStatic
        fun createTest(builder: FlatBufferBuilder, a: Short, b: Byte) : Int {
            builder.prep(2, 4)
            builder.pad(1)
            builder.putByte(b)
            builder.putShort(a)
            return builder.offset()
        }
    }
}
