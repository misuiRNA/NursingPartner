package iot.handler;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class RegroupMsgDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        //TODO ������ճ�����⣬����Json��
        
        String ringJson = getRingJson(in);
        out.add(ringJson);
    }
    
    String getRingJson(ByteBuf in) {
        
        return in.toString();
    }
}
