package com.springbootapp.peerproject.service;

import com.springbootapp.peerproject.dto.MessageDTO;

public interface MsgService {

	public int validateAndSave(MessageDTO dto);

	
}
