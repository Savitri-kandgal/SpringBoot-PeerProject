package com.springbootapp.peerproject.messagemapper;

import org.mapstruct.Mapper;

import com.springbootapp.peerproject.Entity.MessageEntity;
import com.springbootapp.peerproject.dto.MessageDTO;


@Mapper 
public interface MessageMapper {
 
    //MessageMapper INSTANCE = Mappers.getMapper( MessageMapper.class ); 
 
    //@Mapping(source = "numberOfSeats", target = "seatCount")
	MessageEntity dtoToEntity(MessageDTO dto);
}