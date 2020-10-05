package com.springbootapp.peerproject.service;

import com.springbootapp.peerproject.dto.AppInfoDTO;
import com.springbootapp.peerproject.dto.EnvDTO;
import com.springbootapp.peerproject.dto.MessageDTO;

public interface MsgService {

	public int validateAndSave(MessageDTO dto);
	public int validateAndSaveAppInfo(AppInfoDTO dto, EnvDTO envDTO);
	
}
