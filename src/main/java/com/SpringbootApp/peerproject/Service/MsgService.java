package com.SpringbootApp.peerproject.Service;

import com.SpringbootApp.peerproject.dto.MessageDTO;

public interface MsgService {

	public int validateAndSave(MessageDTO dto);
	
}
